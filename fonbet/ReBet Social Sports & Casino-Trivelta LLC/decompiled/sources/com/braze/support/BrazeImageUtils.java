package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import bo.app.j0;
import bo.app.wg;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.plaid.internal.EnumC3631g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lbo/app/j0;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lbo/app/j0;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lbo/app/j0;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BrazeImageUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(final BitmapFactory.Options options, int i10, final int i11) {
        int i12;
        final int i13 = i10;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i11 == 0 || i13 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String calculateInSampleSize$lambda$0;
                    calculateInSampleSize$lambda$0 = BrazeImageUtils.calculateInSampleSize$lambda$0();
                    return calculateInSampleSize$lambda$0;
                }
            }, 14, (Object) null);
            return 1;
        }
        final long j10 = options.outHeight;
        final long j11 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$1;
                calculateInSampleSize$lambda$1 = BrazeImageUtils.calculateInSampleSize$lambda$1(options, i13, i11);
                return calculateInSampleSize$lambda$1;
            }
        }, 14, (Object) null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j12 = i11;
        if (j10 > j12 || j11 > i13) {
            long j13 = 2;
            long j14 = j10 / j13;
            long j15 = j11 / j13;
            while (true) {
                int i14 = intRef.element;
                long j16 = i14;
                if (j14 / j16 < j12 && j15 / j16 < i13) {
                    i12 = i14;
                    if ((j11 * j10) / (i14 * i14) <= 4194304) {
                        break;
                    }
                } else {
                    i12 = i14;
                }
                intRef.element = i12 * 2;
                i13 = i10;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$2;
                calculateInSampleSize$lambda$2 = BrazeImageUtils.calculateInSampleSize$lambda$2(Ref.IntRef.this, j11, j10);
                return calculateInSampleSize$lambda$2;
            }
        }, 14, (Object) null);
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$0() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$1(BitmapFactory.Options options, int i10, int i11) {
        return "Calculating sample size for source image bounds: (width " + options.outWidth + " height " + options.outHeight + ") and destination image bounds: (width " + i10 + " height " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$2(Ref.IntRef intRef, long j10, long j11) {
        int i10 = intRef.element;
        long j12 = i10;
        return "Using image sample size of " + i10 + ". Image will be scaled to width: " + (j10 / j12) + " and height: " + (j11 / j12);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i10, int i11) {
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final j0 getBitmap(Context context, final Uri uri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int intValue = destinationHeightAndWidthPixels.component1().intValue();
        int intValue2 = destinationHeightAndWidthPixels.component2().intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new j0(getLocalBitmap(uri, intValue2, intValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String bitmap$lambda$0;
                bitmap$lambda$0 = BrazeImageUtils.getBitmap$lambda$0(uri);
                return bitmap$lambda$0;
            }
        }, 12, (Object) null);
        return new j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$0(Uri uri) {
        return "Uri with unknown scheme received. Not getting image. Uri: " + uri;
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        final int intValue = displayHeightAndWidthPixels.component1().intValue();
        final int intValue2 = displayHeightAndWidthPixels.component2().intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: Y3.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String destinationHeightAndWidthPixels$lambda$0;
                destinationHeightAndWidthPixels$lambda$0 = BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$0(intValue2, intValue);
                return destinationHeightAndWidthPixels$lambda$0;
            }
        }, 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$0(int i10, int i11) {
        return "Display width: " + i10 + " and height " + i11;
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getDisplayHeightAndWidthPixels(context).getSecond().intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap getLocalBitmap(final Uri uri, final int i10, final int i11) {
        final Exception exc;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th2;
        final BitmapFactory.Options bitmapMetadataFromStream;
        Bitmap decodeFile;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(uri, "uri");
        FileInputStream fileInputStream3 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                final File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.E
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String localBitmap$lambda$1;
                            localBitmap$lambda$1 = BrazeImageUtils.getLocalBitmap$lambda$1(uri);
                            return localBitmap$lambda$1;
                        }
                    }, 14, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localBitmap$lambda$2;
                        localBitmap$lambda$2 = BrazeImageUtils.getLocalBitmap$lambda$2(file);
                        return localBitmap$lambda$2;
                    }
                }, 12, (Object) null);
                if (i10 > 0 && i11 > 0) {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.H
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String localBitmap$lambda$4;
                                localBitmap$lambda$4 = BrazeImageUtils.getLocalBitmap$lambda$4(i10, i11);
                                return localBitmap$lambda$4;
                            }
                        }, 14, (Object) null);
                        bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream2);
                        fileInputStream2.close();
                        fileInputStream = new FileInputStream(file);
                    } catch (Exception e10) {
                        exc = e10;
                        fileInputStream = fileInputStream2;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    try {
                        try {
                            if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.l
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String localBitmap$lambda$6;
                                        localBitmap$lambda$6 = BrazeImageUtils.getLocalBitmap$lambda$6();
                                        return localBitmap$lambda$6;
                                    }
                                }, 14, (Object) null);
                                decodeFile = decodeSampledBitmapFromStream(fileInputStream, bitmapMetadataFromStream, i10, i11);
                                bitmap = decodeFile;
                                fileInputStream.close();
                                return bitmap;
                            }
                            fileInputStream.close();
                            return bitmap;
                        } catch (IOException e11) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: Y3.F
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String localBitmap$lambda$8;
                                    localBitmap$lambda$8 = BrazeImageUtils.getLocalBitmap$lambda$8();
                                    return localBitmap$lambda$8;
                                }
                            }, 8, (Object) null);
                            return bitmap;
                        }
                        BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String localBitmap$lambda$5;
                                localBitmap$lambda$5 = BrazeImageUtils.getLocalBitmap$lambda$5(uri, bitmapMetadataFromStream);
                                return localBitmap$lambda$5;
                            }
                        }, 12, (Object) null);
                        decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                        bitmap = decodeFile;
                    } catch (Exception e12) {
                        exc = e12;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) exc, false, new Function0() { // from class: Y3.p
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String localBitmap$lambda$7;
                                    localBitmap$lambda$7 = BrazeImageUtils.getLocalBitmap$lambda$7(exc);
                                    return localBitmap$lambda$7;
                                }
                            }, 8, (Object) null);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e13) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e13, false, new Function0() { // from class: Y3.F
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String localBitmap$lambda$8;
                                            localBitmap$lambda$8 = BrazeImageUtils.getLocalBitmap$lambda$8();
                                            return localBitmap$lambda$8;
                                        }
                                    }, 8, (Object) null);
                                }
                            }
                            return null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream3 = fileInputStream;
                            th2 = th;
                            fileInputStream2 = fileInputStream3;
                            if (fileInputStream2 == null) {
                                throw th2;
                            }
                            try {
                                fileInputStream2.close();
                                throw th2;
                            } catch (IOException e14) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e14, false, new Function0() { // from class: Y3.F
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String localBitmap$lambda$8;
                                        localBitmap$lambda$8 = BrazeImageUtils.getLocalBitmap$lambda$8();
                                        return localBitmap$lambda$8;
                                    }
                                }, 8, (Object) null);
                                throw th2;
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 == null) {
                        }
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localBitmap$lambda$3;
                        localBitmap$lambda$3 = BrazeImageUtils.getLocalBitmap$lambda$3();
                        return localBitmap$lambda$3;
                    }
                }, 14, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localBitmap$lambda$0;
                    localBitmap$lambda$0 = BrazeImageUtils.getLocalBitmap$lambda$0(uri);
                    return localBitmap$lambda$0;
                }
            }, 14, (Object) null);
            return null;
        } catch (Exception e15) {
            exc = e15;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            th2 = th;
            fileInputStream2 = fileInputStream3;
            if (fileInputStream2 == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$0(Uri uri) {
        return "Local bitmap path is null. URI: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$1(Uri uri) {
        return "Local bitmap file does not exist. URI: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$2(File file) {
        return "Retrieving image from local path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$3() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$4(int i10, int i11) {
        return "Sampling bitmap with destination image bounds: (width " + i10 + " height " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$5(Uri uri, BitmapFactory.Options options) {
        return "The bitmap metadata with image uri " + uri + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$6() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$7(Exception exc) {
        return "Exception occurred when attempting to retrieve local bitmap. " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    public static final int getPixelsFromDensityAndDp(int i10, int i11) {
        return Math.abs((i10 * i11) / EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final j0 getRemoteBitmap(Uri uri, final int i10, final int i11) {
        Throwable th2;
        InputStream inputStream;
        final Exception exc;
        InputStream inputStream2;
        j0 j0Var;
        TrafficStats.setThreadStatsTag(1337);
        final String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String remoteBitmap$lambda$0;
                    remoteBitmap$lambda$0 = BrazeImageUtils.getRemoteBitmap$lambda$0(uri2);
                    return remoteBitmap$lambda$0;
                }
            }, 12, (Object) null);
            return new j0();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            final URL url = new URL(uri2);
            wg wgVar = wg.f26209a;
            HttpURLConnection a10 = wgVar.a(url);
            try {
                final int responseCode = a10.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String remoteBitmap$lambda$1;
                            remoteBitmap$lambda$1 = BrazeImageUtils.getRemoteBitmap$lambda$1(responseCode, url);
                            return remoteBitmap$lambda$1;
                        }
                    }, 12, (Object) null);
                    j0 j0Var2 = new j0();
                    a10.disconnect();
                    return j0Var2;
                }
                InputStream inputStream3 = a10.getInputStream();
                if (i10 == 0 || i11 == 0) {
                    j0Var = new j0(BitmapFactory.decodeStream(inputStream3), a10.getHeaderFields());
                } else {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String remoteBitmap$lambda$2;
                            remoteBitmap$lambda$2 = BrazeImageUtils.getRemoteBitmap$lambda$2(i11, i10);
                            return remoteBitmap$lambda$2;
                        }
                    }, 14, (Object) null);
                    Intrinsics.checkNotNull(inputStream3);
                    final BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream3);
                    a10.disconnect();
                    HttpURLConnection a11 = wgVar.a(url);
                    try {
                        inputStream3 = a11.getInputStream();
                        if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                            j0Var = new j0(decodeSampledBitmapFromStream(inputStream3, bitmapMetadataFromStream, i10, i11), a11.getHeaderFields());
                            a10 = a11;
                        }
                        BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String remoteBitmap$lambda$3;
                                remoteBitmap$lambda$3 = BrazeImageUtils.getRemoteBitmap$lambda$3(url, bitmapMetadataFromStream);
                                return remoteBitmap$lambda$3;
                            }
                        }, 12, (Object) null);
                        j0Var = new j0(BitmapFactory.decodeStream(inputStream3), a11.getHeaderFields());
                        a10 = a11;
                    } catch (Exception e10) {
                        exc = e10;
                        inputStream2 = inputStream3;
                        httpURLConnection = a11;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) exc, false, new Function0() { // from class: Y3.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String remoteBitmap$lambda$4;
                                    remoteBitmap$lambda$4 = BrazeImageUtils.getRemoteBitmap$lambda$4(uri2, exc);
                                    return remoteBitmap$lambda$4;
                                }
                            }, 8, (Object) null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e11) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: Y3.u
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String remoteBitmap$lambda$5;
                                            remoteBitmap$lambda$5 = BrazeImageUtils.getRemoteBitmap$lambda$5();
                                            return remoteBitmap$lambda$5;
                                        }
                                    }, 8, (Object) null);
                                }
                            }
                            return new j0();
                        } catch (Throwable th3) {
                            InputStream inputStream4 = inputStream2;
                            th2 = th3;
                            inputStream = inputStream4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                throw th2;
                            }
                            try {
                                inputStream.close();
                                throw th2;
                            } catch (IOException e12) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: Y3.u
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String remoteBitmap$lambda$5;
                                        remoteBitmap$lambda$5 = BrazeImageUtils.getRemoteBitmap$lambda$5();
                                        return remoteBitmap$lambda$5;
                                    }
                                }, 8, (Object) null);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        inputStream = inputStream3;
                        httpURLConnection = a11;
                        if (httpURLConnection != null) {
                        }
                        if (inputStream != null) {
                        }
                    }
                }
                a10.disconnect();
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                        return j0Var;
                    } catch (IOException e13) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e13, false, new Function0() { // from class: Y3.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String remoteBitmap$lambda$5;
                                remoteBitmap$lambda$5 = BrazeImageUtils.getRemoteBitmap$lambda$5();
                                return remoteBitmap$lambda$5;
                            }
                        }, 8, (Object) null);
                    }
                }
                return j0Var;
            } catch (Exception e14) {
                exc = e14;
                inputStream2 = null;
                httpURLConnection = a10;
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = null;
                httpURLConnection = a10;
            }
        } catch (Exception e15) {
            exc = e15;
            inputStream2 = null;
        } catch (Throwable th6) {
            th2 = th6;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$0(String str) {
        return "SDK is in offline mode, not downloading remote bitmap with uri: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$1(int i10, URL url) {
        return "HTTP response code was " + i10 + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$2(int i10, int i11) {
        return "Sampling bitmap with destination image bounds: (height " + i10 + " width " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$3(URL url, BitmapFactory.Options options) {
        return "The bitmap metadata with image url " + url + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$4(String str, Exception exc) {
        return "Exception in image bitmap download for Uri: " + str + " " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$5() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$0;
                    resizeToBitmapDimensions$lambda$0 = BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
                    return resizeToBitmapDimensions$lambda$0;
                }
            }, 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$1;
                    resizeToBitmapDimensions$lambda$1 = BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView);
                    return resizeToBitmapDimensions$lambda$1;
                }
            }, 12, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$2;
                    resizeToBitmapDimensions$lambda$2 = BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView);
                    return resizeToBitmapDimensions$lambda$2;
                }
            }, 12, (Object) null);
            return;
        }
        final float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: Y3.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resizeToBitmapDimensions$lambda$3;
                resizeToBitmapDimensions$lambda$3 = BrazeImageUtils.resizeToBitmapDimensions$lambda$3(width, imageView);
                return resizeToBitmapDimensions$lambda$3;
            }
        }, 12, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f10, ImageView imageView) {
        return "Resizing ImageView to aspect ratio " + f10 + " based on width: " + imageView.getWidth() + " trueWidth: " + imageView.getLayoutParams().width + " height: " + imageView.getLayoutParams().height + " layoutParams: " + imageView.getLayoutParams() + " " + imageView;
    }
}
