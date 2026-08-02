package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.ImageView;
import bo.app.v6;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0007\u001a,\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u000e\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015\u001a$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u000e\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0006\u0010 \u001a\u00020\u0001\u001a \u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0016\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0001\u001a\"\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u0010\u0010&\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\u0018\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\u0006\u0010+\u001a\u00020,\u001a\u0014\u0010-\u001a\u00020)*\u00020,2\b\u0010*\u001a\u0004\u0018\u00010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"MAX_IMAGE_CACHE_SIZE_BYTES", "", "MIN_IMAGE_CACHE_SIZE_BYTES", "QUARTER_MAX_SAMPLED_IMAGE_BYTES", "RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT", "getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations", "()V", "TAG", "", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "destinationWidth", "destinationHeight", "decodeSampledBitmapFromStream", "Landroid/graphics/Bitmap;", "inputStream", "Ljava/io/InputStream;", "imageMetadata", "getBitmap", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "viewBounds", "Lcom/braze/enums/BrazeViewBounds;", "getBitmapMetadataFromStream", "getDensityDpi", "getDestinationHeightAndWidthPixels", "Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "getDisplayWidthPixels", "getImageLoaderCacheSize", "getLocalBitmap", "getPixelsFromDensityAndDp", "dpi", "dp", "getRemoteBitmap", "populateDisplayMetricsFromDisplay", "Landroid/util/DisplayMetrics;", "resizeImageViewToBitmapDimensions", "", "bitmap", "imageView", "Landroid/widget/ImageView;", "resizeToBitmapDimensions", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ BitmapFactory.Options b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BitmapFactory.Options options, int i, int i2) {
            super(0);
            this.b = options;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Calculating sample size for source image bounds: (width " + this.b.outWidth + " height " + this.b.outHeight + ") and destination image bounds: (width " + this.c + " height " + this.d + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.IntRef b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.IntRef intRef, long j, long j2) {
            super(0);
            this.b = intRef;
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using image sample size of " + this.b.element + ". Image will be scaled to width: " + (this.c / this.b.element) + " and height: " + (this.d / this.b.element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Uri with unknown scheme received. Not getting image. Uri: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Display width: " + this.b + " and height " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Local bitmap path is null. URI: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Local bitmap file does not exist. URI: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file) {
            super(0);
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Retrieving image from local path: ", this.b.getAbsolutePath());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (width " + this.b + " height " + this.c + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ Uri b;
        final /* synthetic */ BitmapFactory.Options c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.b = uri;
            this.c = options;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The bitmap metadata with image uri " + this.b + " had bounds: (height " + this.c.outHeight + " width " + this.c.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Exception exc) {
            super(0);
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception occurred when attempting to retrieve local bitmap. ", this.b.getMessage());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is in offline mode, not downloading remote bitmap with uri: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ URL c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i, URL url) {
            super(0);
            this.b = i;
            this.c = url;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "HTTP response code was " + this.b + ". Bitmap with url " + this.c + " could not be downloaded.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (height " + this.b + " width " + this.c + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        final /* synthetic */ URL b;
        final /* synthetic */ BitmapFactory.Options c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(URL url, BitmapFactory.Options options) {
            super(0);
            this.b = url;
            this.c = options;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The bitmap metadata with image url " + this.b + " had bounds: (height " + this.c.outHeight + " width " + this.c.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Exception c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, Exception exc) {
            super(0);
            this.b = str;
            this.c = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception in image bitmap download for Uri: " + this.b + ' ' + ((Object) this.c.getMessage());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        public static final u b = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        public static final v b = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w extends Lambda implements Function0<String> {
        public static final w b = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x extends Lambda implements Function0<String> {
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(float f) {
            super(0);
            this.b = f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Resizing ImageView to aspect ratio: ", Float.valueOf(this.b));
        }
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
        int i4;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i3 == 0 || i5 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) a.b, 6, (Object) null);
            return 1;
        }
        long j2 = options.outHeight;
        long j3 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new b(options, i5, i3), 6, (Object) null);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j4 = i3;
        if (j2 > j4 || j3 > i5) {
            long j5 = 2;
            long j6 = j2 / j5;
            long j7 = j3 / j5;
            while (true) {
                int i6 = intRef.element;
                long j8 = i6;
                if (j6 / j8 < j4 && j7 / j8 < i5) {
                    i4 = i6;
                    if ((j3 * j2) / (i6 * i6) <= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
                        break;
                    }
                } else {
                    i4 = i6;
                }
                intRef.element = i4 * 2;
                i5 = i2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new c(intRef, j3, j2), 6, (Object) null);
        return intRef.element;
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i2, int i3) {
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final Bitmap getBitmap(Context context, Uri uri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int intValue = destinationHeightAndWidthPixels.component1().intValue();
        int intValue2 = destinationHeightAndWidthPixels.component2().intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return getLocalBitmap(uri, intValue2, intValue);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) new d(uri), 4, (Object) null);
        return null;
    }

    public static /* synthetic */ Bitmap getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int intValue = displayHeightAndWidthPixels.component1().intValue();
        int intValue2 = displayHeightAndWidthPixels.component2().intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Function0) new e(intValue2, intValue), 4, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
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
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap getLocalBitmap(Uri uri, int i2, int i3) {
        Throwable th;
        Exception exc;
        FileInputStream fileInputStream;
        Bitmap decodeFile;
        Intrinsics.checkNotNullParameter(uri, "uri");
        FileInputStream fileInputStream2 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new g(uri), 6, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.I, (Throwable) null, (Function0) new h(file), 4, (Object) null);
                if (i2 > 0 && i3 > 0) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new j(i2, i3), 6, (Object) null);
                        BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream);
                        fileInputStream.close();
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        try {
                            try {
                                if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) l.b, 6, (Object) null);
                                    decodeFile = decodeSampledBitmapFromStream(fileInputStream3, bitmapMetadataFromStream, i2, i3);
                                    fileInputStream3.close();
                                    return decodeFile;
                                }
                                fileInputStream3.close();
                                return decodeFile;
                            } catch (IOException e2) {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) n.b);
                                return decodeFile;
                            }
                            BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, (Function0) new k(uri, bitmapMetadataFromStream), 4, (Object) null);
                            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                        } catch (Exception e3) {
                            exc = e3;
                            fileInputStream = fileInputStream3;
                            try {
                                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) exc, (Function0<String>) new m(exc));
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e4, (Function0<String>) n.b);
                                    }
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (IOException e5) {
                                    BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e5, (Function0<String>) n.b);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream3;
                            if (fileInputStream == null) {
                            }
                        }
                    } catch (Exception e6) {
                        exc = e6;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) i.b, 6, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new f(uri), 6, (Object) null);
            return null;
        } catch (Exception e7) {
            exc = e7;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = fileInputStream2;
            if (fileInputStream == null) {
            }
        }
    }

    public static final int getPixelsFromDensityAndDp(int i2, int i3) {
        return Math.abs((i2 * i3) / 160);
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Bitmap getRemoteBitmap(Uri uri, int i2, int i3) {
        Throwable th;
        InputStream inputStream;
        Exception exc;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2;
        String str;
        URL url;
        v6 v6Var;
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        ?? uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        HttpURLConnection httpURLConnection2 = null;
        try {
            if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) new o(uri2), 4, (Object) null);
                return null;
            }
            try {
                url = new URL(uri2);
                v6Var = v6.a;
                httpURLConnection = v6Var.a(url);
            } catch (Exception e2) {
                exc = e2;
                httpURLConnection = null;
                inputStream2 = null;
                str = uri2;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                if (inputStream != null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e3) {
                    BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e3, (Function0<String>) t.b);
                    throw th;
                }
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) new p(responseCode, url), 4, (Object) null);
                    httpURLConnection.disconnect();
                    return null;
                }
                inputStream2 = httpURLConnection.getInputStream();
                try {
                    if (i2 == 0 || i3 == 0) {
                        uri2 = BitmapFactory.decodeStream(inputStream2);
                    } else {
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        String str2 = TAG;
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new q(i3, i2), 6, (Object) null);
                        BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream2);
                        httpURLConnection.disconnect();
                        httpURLConnection = v6Var.a(url);
                        inputStream2 = httpURLConnection.getInputStream();
                        if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                            uri2 = decodeSampledBitmapFromStream(inputStream2, bitmapMetadataFromStream, i2, i3);
                        }
                        BrazeLogger.brazelog$default(brazeLogger, str2, BrazeLogger.Priority.W, (Throwable) null, (Function0) new r(url, bitmapMetadataFromStream), 4, (Object) null);
                        uri2 = BitmapFactory.decodeStream(inputStream2);
                    }
                    httpURLConnection.disconnect();
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                            return uri2;
                        } catch (IOException e4) {
                            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e4, (Function0<String>) t.b);
                        }
                    }
                    return uri2;
                } catch (Exception e5) {
                    exc = e5;
                    str = uri2;
                    BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) exc, (Function0<String>) new s(str, exc));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e6, (Function0<String>) t.b);
                        }
                    }
                    return null;
                }
            } catch (Exception e7) {
                exc = e7;
                inputStream2 = null;
                str = uri2;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                }
                if (inputStream != null) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static final DisplayMetrics populateDisplayMetricsFromDisplay(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) u.b, 4, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) v.b, 4, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) w.b, 4, (Object) null);
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new x(width), 6, (Object) null);
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
    }

    public static final int getDensityDpi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }
}
