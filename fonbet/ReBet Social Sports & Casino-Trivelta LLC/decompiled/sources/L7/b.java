package L7;

import H6.h;
import H7.k;
import K7.InterfaceC1369j;
import K7.u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1369j f7076a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7077b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7078c;

    /* renamed from: d, reason: collision with root package name */
    public final PreverificationHelper f7079d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6775d f7080e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class f7075f = b.class;
    private static final byte[] EOI_TAIL = {-1, -39};

    public b(InterfaceC1369j interfaceC1369j, InterfaceC6775d interfaceC6775d, f fVar) {
        this.f7079d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f7076a = interfaceC1369j;
        if (interfaceC1369j instanceof u) {
            this.f7077b = fVar.a();
            this.f7078c = fVar.b();
        }
        this.f7080e = interfaceC6775d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BitmapFactory.Options e(k kVar, Bitmap.Config config, boolean z10) {
        boolean z11;
        Bitmap.Config config2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = kVar.n1();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                z11 = true;
                if (!z11) {
                    options.inPreferredConfig = config;
                }
                options.inMutable = true;
                if (!z10) {
                    BitmapFactory.decodeStream(kVar.D0(), null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        throw new IllegalArgumentException();
                    }
                }
                if (z11) {
                    options.inPreferredConfig = config;
                }
                options.inJustDecodeBounds = false;
                return options;
            }
        }
        z11 = false;
        if (!z11) {
        }
        options.inMutable = true;
        if (!z10) {
        }
        if (z11) {
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // L7.d
    public H6.a a(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options e10 = e(kVar, config, this.f7077b);
        boolean z10 = e10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) D6.k.g(kVar.D0()), e10, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z10) {
                return a(kVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    @Override // L7.d
    public H6.a b(k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean a22 = kVar.a2(i10);
        BitmapFactory.Options e10 = e(kVar, config, this.f7077b);
        InputStream D02 = kVar.D0();
        D6.k.g(D02);
        if (kVar.y1() > i10) {
            D02 = new J6.a(D02, i10);
        }
        if (!a22) {
            D02 = new J6.b(D02, EOI_TAIL);
        }
        boolean z10 = e10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                H6.a c10 = c(D02, e10, rect, colorSpace);
                try {
                    D02.close();
                    return c10;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return c10;
                }
            } finally {
            }
        } catch (RuntimeException e12) {
            if (!z10) {
                throw e12;
            }
            H6.a b10 = b(kVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
            try {
                D02.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            return b10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:25:0x007d, B:28:0x0087, B:36:0x009f, B:38:0x00c7, B:65:0x00c0, B:66:0x00c3, B:60:0x00ba), top: B:24:0x007d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H6.a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer byteBuffer;
        Bitmap bitmap2;
        Bitmap.Config config;
        BitmapRegionDecoder bitmapRegionDecoder;
        ColorSpace.Named named;
        PreverificationHelper preverificationHelper;
        D6.k.g(inputStream);
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        ?? r02 = i10;
        if (rect != null) {
            int width = rect.width() / options.inSampleSize;
            i11 = rect.height() / options.inSampleSize;
            r02 = width;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = i12 >= 26 && (preverificationHelper = this.f7079d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder2 = null;
        try {
            try {
                if (rect == null && z10) {
                    options.inMutable = false;
                } else {
                    if (rect != null && z10) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f7077b) {
                        Bitmap bitmap3 = (Bitmap) this.f7076a.get(d(r02, i11, options));
                        bitmap = bitmap3;
                        if (bitmap3 == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                        options.inBitmap = bitmap;
                        if (i12 >= 26) {
                            if (colorSpace == null) {
                                named = ColorSpace.Named.SRGB;
                                colorSpace = ColorSpace.get(named);
                            }
                            options.inPreferredColorSpace = colorSpace;
                        }
                        byteBuffer = (ByteBuffer) this.f7080e.acquire();
                        if (byteBuffer == null) {
                            byteBuffer = ByteBuffer.allocate(G6.b.c());
                        }
                        options.inTempStorage = byteBuffer.array();
                        if (rect != null && bitmap != 0) {
                            config = options.inPreferredConfig;
                            try {
                                if (config != null) {
                                    try {
                                        bitmap.reconfigure(r02, i11, config);
                                        bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
                                        if (bitmapRegionDecoder != null) {
                                            try {
                                                bitmap2 = bitmapRegionDecoder.decodeRegion(rect, options);
                                            } catch (IOException unused) {
                                                E6.a.k(f7075f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                                if (bitmapRegionDecoder != null) {
                                                    bitmapRegionDecoder.recycle();
                                                }
                                                bitmap2 = null;
                                                if (bitmap2 == null) {
                                                }
                                                this.f7080e.release(byteBuffer);
                                                if (bitmap != 0) {
                                                }
                                                if (!this.f7078c) {
                                                }
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
                                            bitmapRegionDecoder2.recycle();
                                        }
                                        throw th;
                                    }
                                    if (bitmap2 == null) {
                                        bitmap2 = BitmapFactory.decodeStream(inputStream, null, options);
                                    }
                                    this.f7080e.release(byteBuffer);
                                    if (bitmap != 0 || bitmap == bitmap2) {
                                        return !this.f7078c ? H6.a.n1(bitmap2, a.f7081a) : H6.a.n1(bitmap2, this.f7076a);
                                    }
                                    this.f7076a.release(bitmap);
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    throw new IllegalStateException();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bitmapRegionDecoder2 = r02;
                            }
                        }
                        bitmap2 = null;
                        if (bitmap2 == null) {
                        }
                        this.f7080e.release(byteBuffer);
                        if (bitmap != 0) {
                        }
                        if (!this.f7078c) {
                        }
                    }
                }
                options.inTempStorage = byteBuffer.array();
                if (rect != null) {
                    config = options.inPreferredConfig;
                    if (config != null) {
                    }
                }
                bitmap2 = null;
                if (bitmap2 == null) {
                }
                this.f7080e.release(byteBuffer);
                if (bitmap != 0) {
                }
                if (!this.f7078c) {
                }
            } catch (Throwable th4) {
                this.f7080e.release(byteBuffer);
                throw th4;
            }
        } catch (IllegalArgumentException e10) {
            if (bitmap != 0) {
                this.f7076a.release(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream == null) {
                    throw e10;
                }
                H6.a n12 = H6.a.n1(decodeStream, z7.f.a());
                this.f7080e.release(byteBuffer);
                return n12;
            } catch (IOException unused3) {
                throw e10;
            }
        } catch (RuntimeException e11) {
            if (bitmap != 0) {
                this.f7076a.release(bitmap);
            }
            throw e11;
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (i12 >= 26) {
        }
        byteBuffer = (ByteBuffer) this.f7080e.acquire();
        if (byteBuffer == null) {
        }
    }

    public abstract int d(int i10, int i11, BitmapFactory.Options options);

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7081a = new a();

        @Override // H6.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
        }
    }
}
