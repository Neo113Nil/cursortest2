package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.DecodeBufferHelper;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.common.streams.LimitedInputStream;
import com.facebook.common.streams.TailAppendingInputStream;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.memory.DummyBitmapPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.msgpack.core.MessagePack;

/* loaded from: classes6.dex */
public abstract class DefaultDecoder implements PlatformDecoder {
    private boolean mAvoidPoolGet;
    private boolean mAvoidPoolRelease;
    private final BitmapPool mBitmapPool;
    final Pools.Pool<ByteBuffer> mDecodeBuffers;

    @Nullable
    private final PreverificationHelper mPreverificationHelper;
    private static final Class<?> TAG = DefaultDecoder.class;
    private static final byte[] EOI_TAIL = {-1, MessagePack.Code.STR8};

    public abstract int getBitmapSize(int i, int i2, BitmapFactory.Options options);

    public DefaultDecoder(BitmapPool bitmapPool, Pools.Pool<ByteBuffer> pool, PlatformDecoderOptions platformDecoderOptions) {
        this.mPreverificationHelper = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.mBitmapPool = bitmapPool;
        if (bitmapPool instanceof DummyBitmapPool) {
            this.mAvoidPoolGet = platformDecoderOptions.getAvoidPoolGet();
            this.mAvoidPoolRelease = platformDecoderOptions.getAvoidPoolRelease();
        }
        this.mDecodeBuffers = pool;
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect) {
        return decodeFromEncodedImageWithColorSpace(encodedImage, config, rect, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(encodedImage, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config, this.mAvoidPoolGet);
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return decodeFromStream((InputStream) Preconditions.checkNotNull(encodedImage.getInputStream()), decodeOptionsForStream, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImageWithColorSpace(encodedImage, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    @Nullable
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i, @Nullable ColorSpace colorSpace) {
        boolean isCompleteAt = encodedImage.isCompleteAt(i);
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config, this.mAvoidPoolGet);
        InputStream inputStream = encodedImage.getInputStream();
        Preconditions.checkNotNull(inputStream);
        if (encodedImage.getSize() > i) {
            inputStream = new LimitedInputStream(inputStream, i);
        }
        if (!isCompleteAt) {
            inputStream = new TailAppendingInputStream(inputStream, EOI_TAIL);
        }
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                CloseableReference<Bitmap> decodeFromStream = decodeFromStream(inputStream, decodeOptionsForStream, rect, colorSpace);
                try {
                    inputStream.close();
                    return decodeFromStream;
                } catch (IOException e) {
                    e.printStackTrace();
                    return decodeFromStream;
                }
            } catch (RuntimeException e2) {
                if (z) {
                    CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = decodeJPEGFromEncodedImageWithColorSpace(encodedImage, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return decodeJPEGFromEncodedImageWithColorSpace;
                }
                throw e2;
            }
        } finally {
        }
    }

    @Nullable
    protected CloseableReference<Bitmap> decodeStaticImageFromStream(InputStream inputStream, BitmapFactory.Options options, @Nullable Rect rect) {
        return decodeFromStream(inputStream, options, rect, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x00f4, RuntimeException -> 0x00f6, IllegalArgumentException -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00ff, RuntimeException -> 0x00f6, blocks: (B:25:0x007f, B:28:0x0089, B:35:0x00a0, B:37:0x00c3, B:59:0x00b4, B:64:0x00bc, B:65:0x00bf), top: B:24:0x007f, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[Catch: all -> 0x00f4, RuntimeException -> 0x00f6, IllegalArgumentException -> 0x00ff, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00ff, RuntimeException -> 0x00f6, blocks: (B:25:0x007f, B:28:0x0089, B:35:0x00a0, B:37:0x00c3, B:59:0x00b4, B:64:0x00bc, B:65:0x00bf), top: B:24:0x007f, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc A[Catch: all -> 0x00f4, RuntimeException -> 0x00f6, IllegalArgumentException -> 0x00ff, TryCatch #8 {IllegalArgumentException -> 0x00ff, RuntimeException -> 0x00f6, blocks: (B:25:0x007f, B:28:0x0089, B:35:0x00a0, B:37:0x00c3, B:59:0x00b4, B:64:0x00bc, B:65:0x00bf), top: B:24:0x007f, outer: #3 }] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CloseableReference<Bitmap> decodeFromStream(InputStream inputStream, BitmapFactory.Options options, @Nullable Rect rect, @Nullable ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer acquire;
        Bitmap bitmap2;
        BitmapRegionDecoder bitmapRegionDecoder;
        ColorSpace.Named named;
        PreverificationHelper preverificationHelper;
        Preconditions.checkNotNull(inputStream);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (rect != null) {
            i = rect.width() / options.inSampleSize;
            i2 = rect.height() / options.inSampleSize;
        }
        boolean z = Build.VERSION.SDK_INT >= 26 && (preverificationHelper = this.mPreverificationHelper) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder2 = null;
        try {
            try {
                if (rect == null && z) {
                    options.inMutable = false;
                } else {
                    if (rect != null && z) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.mAvoidPoolGet) {
                        bitmap = this.mBitmapPool.get(getBitmapSize(i, i2, options));
                        if (bitmap == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                        options.inBitmap = bitmap;
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (colorSpace == null) {
                                named = ColorSpace.Named.SRGB;
                                colorSpace = ColorSpace.get(named);
                            }
                            options.inPreferredColorSpace = colorSpace;
                        }
                        acquire = this.mDecodeBuffers.acquire();
                        if (acquire == null) {
                            acquire = ByteBuffer.allocate(DecodeBufferHelper.getRecommendedDecodeBufferSize());
                        }
                        options.inTempStorage = acquire.array();
                        if (rect != null && bitmap != null && options.inPreferredConfig != null) {
                            try {
                                bitmap.reconfigure(i, i2, options.inPreferredConfig);
                                bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
                                if (bitmapRegionDecoder == null) {
                                    try {
                                        try {
                                            bitmap2 = bitmapRegionDecoder.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            FLog.e(TAG, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoder != null) {
                                                bitmapRegionDecoder.recycle();
                                            }
                                            bitmap2 = null;
                                            if (bitmap2 == null) {
                                            }
                                            this.mDecodeBuffers.release(acquire);
                                            if (bitmap == null) {
                                            }
                                            if (this.mAvoidPoolRelease) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        bitmapRegionDecoder2 = bitmapRegionDecoder;
                                        if (bitmapRegionDecoder2 != null) {
                                            bitmapRegionDecoder2.recycle();
                                        }
                                        throw th;
                                    }
                                } else {
                                    bitmap2 = null;
                                }
                                if (bitmapRegionDecoder != null) {
                                    bitmapRegionDecoder.recycle();
                                }
                            } catch (IOException unused2) {
                                bitmapRegionDecoder = null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (bitmapRegionDecoder2 != null) {
                                }
                                throw th;
                            }
                            if (bitmap2 == null) {
                                bitmap2 = BitmapFactory.decodeStream(inputStream, null, options);
                            }
                            this.mDecodeBuffers.release(acquire);
                            if (bitmap == null && bitmap != bitmap2) {
                                this.mBitmapPool.release(bitmap);
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                throw new IllegalStateException();
                            }
                            if (this.mAvoidPoolRelease) {
                                return CloseableReference.of(bitmap2, NoOpResourceReleaser.INSTANCE);
                            }
                            return CloseableReference.of(bitmap2, this.mBitmapPool);
                        }
                        bitmap2 = null;
                        if (bitmap2 == null) {
                        }
                        this.mDecodeBuffers.release(acquire);
                        if (bitmap == null) {
                        }
                        if (this.mAvoidPoolRelease) {
                        }
                    }
                }
                options.inTempStorage = acquire.array();
                if (rect != null) {
                    bitmap.reconfigure(i, i2, options.inPreferredConfig);
                    bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
                    if (bitmapRegionDecoder == null) {
                    }
                    if (bitmapRegionDecoder != null) {
                    }
                    if (bitmap2 == null) {
                    }
                    this.mDecodeBuffers.release(acquire);
                    if (bitmap == null) {
                    }
                    if (this.mAvoidPoolRelease) {
                    }
                }
                bitmap2 = null;
                if (bitmap2 == null) {
                }
                this.mDecodeBuffers.release(acquire);
                if (bitmap == null) {
                }
                if (this.mAvoidPoolRelease) {
                }
            } catch (Throwable th3) {
                this.mDecodeBuffers.release(acquire);
                throw th3;
            }
        } catch (IllegalArgumentException e) {
            if (bitmap != null) {
                this.mBitmapPool.release(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream == null) {
                    throw e;
                }
                CloseableReference<Bitmap> of = CloseableReference.of(decodeStream, SimpleBitmapReleaser.getInstance());
                this.mDecodeBuffers.release(acquire);
                return of;
            } catch (IOException unused3) {
                throw e;
            }
        } catch (RuntimeException e2) {
            if (bitmap != null) {
                this.mBitmapPool.release(bitmap);
            }
            throw e2;
        }
        bitmap = null;
        options.inBitmap = bitmap;
        if (Build.VERSION.SDK_INT >= 26) {
        }
        acquire = this.mDecodeBuffers.acquire();
        if (acquire == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BitmapFactory.Options getDecodeOptionsForStream(EncodedImage encodedImage, Bitmap.Config config, boolean z) {
        boolean z2;
        Bitmap.Config config2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = encodedImage.getSampleSize();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                z2 = true;
                if (!z2) {
                    options.inPreferredConfig = config;
                }
                options.inMutable = true;
                if (!z) {
                    BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        throw new IllegalArgumentException();
                    }
                }
                if (z2) {
                    options.inPreferredConfig = config;
                }
                options.inJustDecodeBounds = false;
                return options;
            }
        }
        z2 = false;
        if (!z2) {
        }
        options.inMutable = true;
        if (!z) {
        }
        if (z2) {
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    private static final class NoOpResourceReleaser implements ResourceReleaser<Bitmap> {
        private static final NoOpResourceReleaser INSTANCE = new NoOpResourceReleaser();

        @Override // com.facebook.common.references.ResourceReleaser
        public void release(Bitmap bitmap) {
        }

        private NoOpResourceReleaser() {
        }
    }
}
