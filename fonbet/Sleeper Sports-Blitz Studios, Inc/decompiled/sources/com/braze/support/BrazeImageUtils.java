package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import androidx.collection.SieveCacheKt;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
import com.nimbusds.jose.jwk.JWKParameterNames;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u001a\u00109\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b9\u00106\u0012\u0004\b:\u0010;¨\u0006<"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT, "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/braze/support/a;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lcom/braze/support/a;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "MIN_IMAGE_CACHE_SIZE_BYTES", "I", "MAX_IMAGE_CACHE_SIZE_BYTES", "QUARTER_MAX_SAMPLED_IMAGE_BYTES", "RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT", "getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations", "()V", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(final BitmapFactory.Options options, int i, final int i2) {
        int i3;
        final int i4 = i;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i2 == 0 || i4 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String calculateInSampleSize$lambda$4;
                    calculateInSampleSize$lambda$4 = BrazeImageUtils.calculateInSampleSize$lambda$4();
                    return calculateInSampleSize$lambda$4;
                }
            }, 14, (Object) null);
            return 1;
        }
        final long j = options.outHeight;
        final long j2 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$5;
                calculateInSampleSize$lambda$5 = BrazeImageUtils.calculateInSampleSize$lambda$5(options, i4, i2);
                return calculateInSampleSize$lambda$5;
            }
        }, 14, (Object) null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j3 = i2;
        if (j > j3 || j2 > i4) {
            long j4 = 2;
            long j5 = j / j4;
            long j6 = j2 / j4;
            while (true) {
                int i5 = intRef.element;
                long j7 = i5;
                if (j5 / j7 < j3 && j6 / j7 < i4) {
                    i3 = i5;
                    if ((j2 * j) / (i5 * i5) <= 4194304) {
                        break;
                    }
                } else {
                    i3 = i5;
                }
                intRef.element = i3 * 2;
                i4 = i;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$6;
                calculateInSampleSize$lambda$6 = BrazeImageUtils.calculateInSampleSize$lambda$6(Ref.IntRef.this, j2, j);
                return calculateInSampleSize$lambda$6;
            }
        }, 14, (Object) null);
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$4() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$5(BitmapFactory.Options options, int i, int i2) {
        return "Calculating sample size for source image bounds: (width " + options.outWidth + " height " + options.outHeight + ") and destination image bounds: (width " + i + " height " + i2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$6(Ref.IntRef intRef, long j, long j2) {
        int i = intRef.element;
        long j3 = i;
        return "Using image sample size of " + i + ". Image will be scaled to width: " + (j / j3) + " and height: " + (j2 / j3);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final a getBitmap(Context context, final Uri uri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int intValue = destinationHeightAndWidthPixels.component1().intValue();
        int intValue2 = destinationHeightAndWidthPixels.component2().intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new a(getLocalBitmap(uri, intValue2, intValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String bitmap$lambda$7;
                bitmap$lambda$7 = BrazeImageUtils.getBitmap$lambda$7(uri);
                return bitmap$lambda$7;
            }
        }, 12, (Object) null);
        return new a();
    }

    public static /* synthetic */ a getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i, Object obj) {
        if ((i & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$7(Uri uri) {
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String destinationHeightAndWidthPixels$lambda$23;
                destinationHeightAndWidthPixels$lambda$23 = BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$23(intValue2, intValue);
                return destinationHeightAndWidthPixels$lambda$23;
            }
        }, 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$23(int i, int i2) {
        return "Display width: " + i + " and height " + i2;
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
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, SieveCacheKt.NodeLinkMask), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap getLocalBitmap(final Uri uri, final int i, final int i2) {
        final Exception exc;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        Bitmap decodeFile;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(uri, "uri");
        FileInputStream fileInputStream3 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                final File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String localBitmap$lambda$9;
                            localBitmap$lambda$9 = BrazeImageUtils.getLocalBitmap$lambda$9(uri);
                            return localBitmap$lambda$9;
                        }
                    }, 14, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localBitmap$lambda$10;
                        localBitmap$lambda$10 = BrazeImageUtils.getLocalBitmap$lambda$10(file);
                        return localBitmap$lambda$10;
                    }
                }, 12, (Object) null);
                if (i > 0 && i2 > 0) {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String localBitmap$lambda$12;
                                localBitmap$lambda$12 = BrazeImageUtils.getLocalBitmap$lambda$12(i, i2);
                                return localBitmap$lambda$12;
                            }
                        }, 14, (Object) null);
                        final BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream2);
                        fileInputStream2.close();
                        fileInputStream = new FileInputStream(file);
                        try {
                            try {
                                if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String localBitmap$lambda$14;
                                            localBitmap$lambda$14 = BrazeImageUtils.getLocalBitmap$lambda$14();
                                            return localBitmap$lambda$14;
                                        }
                                    }, 14, (Object) null);
                                    decodeFile = decodeSampledBitmapFromStream(fileInputStream, bitmapMetadataFromStream, i, i2);
                                    bitmap = decodeFile;
                                    fileInputStream.close();
                                    return bitmap;
                                }
                                fileInputStream.close();
                                return bitmap;
                            } catch (IOException e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String localBitmap$lambda$16;
                                        localBitmap$lambda$16 = BrazeImageUtils.getLocalBitmap$lambda$16();
                                        return localBitmap$lambda$16;
                                    }
                                }, 8, (Object) null);
                                return bitmap;
                            }
                            BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String localBitmap$lambda$13;
                                    localBitmap$lambda$13 = BrazeImageUtils.getLocalBitmap$lambda$13(uri, bitmapMetadataFromStream);
                                    return localBitmap$lambda$13;
                                }
                            }, 12, (Object) null);
                            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                            bitmap = decodeFile;
                        } catch (Exception e2) {
                            exc = e2;
                            try {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda23
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String localBitmap$lambda$15;
                                        localBitmap$lambda$15 = BrazeImageUtils.getLocalBitmap$lambda$15(exc);
                                        return localBitmap$lambda$15;
                                    }
                                }, 8, (Object) null);
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String localBitmap$lambda$16;
                                                localBitmap$lambda$16 = BrazeImageUtils.getLocalBitmap$lambda$16();
                                                return localBitmap$lambda$16;
                                            }
                                        }, 8, (Object) null);
                                    }
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream3 = fileInputStream;
                                th = th;
                                fileInputStream2 = fileInputStream3;
                                if (fileInputStream2 == null) {
                                    throw th;
                                }
                                try {
                                    fileInputStream2.close();
                                    throw th;
                                } catch (IOException e4) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String localBitmap$lambda$16;
                                            localBitmap$lambda$16 = BrazeImageUtils.getLocalBitmap$lambda$16();
                                            return localBitmap$lambda$16;
                                        }
                                    }, 8, (Object) null);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 == null) {
                            }
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        fileInputStream = fileInputStream2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localBitmap$lambda$11;
                        localBitmap$lambda$11 = BrazeImageUtils.getLocalBitmap$lambda$11();
                        return localBitmap$lambda$11;
                    }
                }, 14, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localBitmap$lambda$8;
                    localBitmap$lambda$8 = BrazeImageUtils.getLocalBitmap$lambda$8(uri);
                    return localBitmap$lambda$8;
                }
            }, 14, (Object) null);
            return null;
        } catch (Exception e6) {
            exc = e6;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            th = th;
            fileInputStream2 = fileInputStream3;
            if (fileInputStream2 == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$10(File file) {
        return "Retrieving image from local path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$11() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$12(int i, int i2) {
        return "Sampling bitmap with destination image bounds: (width " + i + " height " + i2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$13(Uri uri, BitmapFactory.Options options) {
        return "The bitmap metadata with image uri " + uri + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$14() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$15(Exception exc) {
        return "Exception occurred when attempting to retrieve local bitmap. " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$16() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8(Uri uri) {
        return "Local bitmap path is null. URI: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$9(Uri uri) {
        return "Local bitmap file does not exist. URI: " + uri;
    }

    public static final int getPixelsFromDensityAndDp(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final a getRemoteBitmap(Uri uri, final int i, final int i2) {
        Throwable th;
        InputStream inputStream;
        final Exception exc;
        InputStream inputStream2;
        a aVar;
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        final String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String remoteBitmap$lambda$17;
                    remoteBitmap$lambda$17 = BrazeImageUtils.getRemoteBitmap$lambda$17(uri2);
                    return remoteBitmap$lambda$17;
                }
            }, 12, (Object) null);
            return new a();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            final URL url = new URL(uri2);
            com.braze.communication.g gVar = com.braze.communication.g.f485a;
            HttpURLConnection a2 = gVar.a(url);
            try {
                final int responseCode = a2.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String remoteBitmap$lambda$18;
                            remoteBitmap$lambda$18 = BrazeImageUtils.getRemoteBitmap$lambda$18(responseCode, url);
                            return remoteBitmap$lambda$18;
                        }
                    }, 12, (Object) null);
                    a aVar2 = new a();
                    a2.disconnect();
                    return aVar2;
                }
                InputStream inputStream3 = a2.getInputStream();
                if (i == 0 || i2 == 0) {
                    aVar = new a(BitmapFactory.decodeStream(inputStream3), a2.getHeaderFields());
                } else {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String remoteBitmap$lambda$19;
                            remoteBitmap$lambda$19 = BrazeImageUtils.getRemoteBitmap$lambda$19(i2, i);
                            return remoteBitmap$lambda$19;
                        }
                    }, 14, (Object) null);
                    Intrinsics.checkNotNull(inputStream3);
                    final BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream3);
                    a2.disconnect();
                    HttpURLConnection a3 = gVar.a(url);
                    try {
                        inputStream3 = a3.getInputStream();
                        if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                            aVar = new a(decodeSampledBitmapFromStream(inputStream3, bitmapMetadataFromStream, i, i2), a3.getHeaderFields());
                            a2 = a3;
                        }
                        BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String remoteBitmap$lambda$20;
                                remoteBitmap$lambda$20 = BrazeImageUtils.getRemoteBitmap$lambda$20(url, bitmapMetadataFromStream);
                                return remoteBitmap$lambda$20;
                            }
                        }, 12, (Object) null);
                        aVar = new a(BitmapFactory.decodeStream(inputStream3), a3.getHeaderFields());
                        a2 = a3;
                    } catch (Exception e) {
                        exc = e;
                        inputStream2 = inputStream3;
                        httpURLConnection = a3;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String remoteBitmap$lambda$21;
                                    remoteBitmap$lambda$21 = BrazeImageUtils.getRemoteBitmap$lambda$21(uri2, exc);
                                    return remoteBitmap$lambda$21;
                                }
                            }, 8, (Object) null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String remoteBitmap$lambda$22;
                                            remoteBitmap$lambda$22 = BrazeImageUtils.getRemoteBitmap$lambda$22();
                                            return remoteBitmap$lambda$22;
                                        }
                                    }, 8, (Object) null);
                                }
                            }
                            return new a();
                        } catch (Throwable th2) {
                            InputStream inputStream4 = inputStream2;
                            th = th2;
                            inputStream = inputStream4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (IOException e3) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String remoteBitmap$lambda$22;
                                        remoteBitmap$lambda$22 = BrazeImageUtils.getRemoteBitmap$lambda$22();
                                        return remoteBitmap$lambda$22;
                                    }
                                }, 8, (Object) null);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream3;
                        httpURLConnection = a3;
                        if (httpURLConnection != null) {
                        }
                        if (inputStream != null) {
                        }
                    }
                }
                a2.disconnect();
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                        return aVar;
                    } catch (IOException e4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String remoteBitmap$lambda$22;
                                remoteBitmap$lambda$22 = BrazeImageUtils.getRemoteBitmap$lambda$22();
                                return remoteBitmap$lambda$22;
                            }
                        }, 8, (Object) null);
                    }
                }
                return aVar;
            } catch (Exception e5) {
                exc = e5;
                inputStream2 = null;
                httpURLConnection = a2;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                httpURLConnection = a2;
            }
        } catch (Exception e6) {
            exc = e6;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$17(String str) {
        return "SDK is in offline mode, not downloading remote bitmap with uri: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$18(int i, URL url) {
        return "HTTP response code was " + i + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$19(int i, int i2) {
        return "Sampling bitmap with destination image bounds: (height " + i + " width " + i2 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$20(URL url, BitmapFactory.Options options) {
        return "The bitmap metadata with image url " + url + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$21(String str, Exception exc) {
        return "Exception in image bitmap download for Uri: " + str + " " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$22() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda4
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda7
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda6
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda5
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
    public static final String resizeToBitmapDimensions$lambda$3(float f, ImageView imageView) {
        return "Resizing ImageView to aspect ratio " + f + " based on width: " + imageView.getWidth() + " trueWidth: " + imageView.getLayoutParams().width + " height: " + imageView.getLayoutParams().height + " layoutParams: " + imageView.getLayoutParams() + " " + imageView;
    }
}
