package C7;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.C3017a;
import com.facebook.imagepipeline.producers.C3023g;
import com.facebook.imagepipeline.producers.C3024h;
import com.facebook.imagepipeline.producers.C3025i;
import com.facebook.imagepipeline.producers.C3027k;
import com.facebook.imagepipeline.producers.C3028l;
import com.facebook.imagepipeline.producers.C3031o;
import com.facebook.imagepipeline.producers.C3032p;
import com.facebook.imagepipeline.producers.C3034s;
import com.facebook.imagepipeline.producers.C3037v;
import com.facebook.imagepipeline.producers.C3038w;
import com.facebook.imagepipeline.producers.C3040y;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.request.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: K, reason: collision with root package name */
    public static final a f1220K = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public final Lazy f1221A;

    /* renamed from: B, reason: collision with root package name */
    public final Lazy f1222B;

    /* renamed from: C, reason: collision with root package name */
    public final Lazy f1223C;

    /* renamed from: D, reason: collision with root package name */
    public final Lazy f1224D;

    /* renamed from: E, reason: collision with root package name */
    public final Lazy f1225E;

    /* renamed from: F, reason: collision with root package name */
    public final Lazy f1226F;

    /* renamed from: G, reason: collision with root package name */
    public final Lazy f1227G;

    /* renamed from: H, reason: collision with root package name */
    public final Lazy f1228H;

    /* renamed from: I, reason: collision with root package name */
    public final Lazy f1229I;

    /* renamed from: J, reason: collision with root package name */
    public final Lazy f1230J;

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f1231a;

    /* renamed from: b, reason: collision with root package name */
    public final C f1232b;

    /* renamed from: c, reason: collision with root package name */
    public final X f1233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1235e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f1236f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC1050n f1237g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1238h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1239i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1240j;

    /* renamed from: k, reason: collision with root package name */
    public final O7.d f1241k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1242l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1243m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1244n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f1245o;

    /* renamed from: p, reason: collision with root package name */
    public Map f1246p;

    /* renamed from: q, reason: collision with root package name */
    public Map f1247q;

    /* renamed from: r, reason: collision with root package name */
    public Map f1248r;

    /* renamed from: s, reason: collision with root package name */
    public final Lazy f1249s;

    /* renamed from: t, reason: collision with root package name */
    public final Lazy f1250t;

    /* renamed from: u, reason: collision with root package name */
    public final Lazy f1251u;

    /* renamed from: v, reason: collision with root package name */
    public final Lazy f1252v;

    /* renamed from: w, reason: collision with root package name */
    public final Lazy f1253w;

    /* renamed from: x, reason: collision with root package name */
    public final Lazy f1254x;

    /* renamed from: y, reason: collision with root package name */
    public final Lazy f1255y;

    /* renamed from: z, reason: collision with root package name */
    public final Lazy f1256z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(Uri uri) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            if (uri2.length() <= 30) {
                return uri2;
            }
            String substring = uri2.substring(0, 30);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring + "...";
        }

        public final void d(com.facebook.imagepipeline.request.b bVar) {
            D6.k.b(Boolean.valueOf(bVar.getLowestPermittedRequestLevel().b() <= b.c.ENCODED_MEMORY_CACHE.b()));
        }

        public a() {
        }
    }

    public W(ContentResolver contentResolver, C producerFactory, X networkFetcher, boolean z10, boolean z11, p0 threadHandoffProducerQueue, EnumC1050n downsampleMode, boolean z12, boolean z13, boolean z14, O7.d imageTranscoderFactory, boolean z15, boolean z16, boolean z17, Set set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.f1231a = contentResolver;
        this.f1232b = producerFactory;
        this.f1233c = networkFetcher;
        this.f1234d = z10;
        this.f1235e = z11;
        this.f1236f = threadHandoffProducerQueue;
        this.f1237g = downsampleMode;
        this.f1238h = z12;
        this.f1239i = z13;
        this.f1240j = z14;
        this.f1241k = imageTranscoderFactory;
        this.f1242l = z15;
        this.f1243m = z16;
        this.f1244n = z17;
        this.f1245o = set;
        this.f1246p = new LinkedHashMap();
        this.f1247q = new LinkedHashMap();
        this.f1248r = new LinkedHashMap();
        this.f1249s = LazyKt.lazy(new Function0() { // from class: C7.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                j0 b02;
                b02 = W.b0(W.this);
                return b02;
            }
        });
        this.f1250t = LazyKt.lazy(new Function0() { // from class: C7.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                j0 V10;
                V10 = W.V(W.this);
                return V10;
            }
        });
        this.f1251u = LazyKt.lazy(new Function0() { // from class: C7.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                j0 T10;
                T10 = W.T(W.this);
                return T10;
            }
        });
        this.f1252v = LazyKt.lazy(new Function0() { // from class: C7.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 c02;
                c02 = W.c0(W.this);
                return c02;
            }
        });
        this.f1253w = LazyKt.lazy(new Function0() { // from class: C7.G
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 u10;
                u10 = W.u(W.this);
                return u10;
            }
        });
        this.f1254x = LazyKt.lazy(new Function0() { // from class: C7.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n0 d02;
                d02 = W.d0(W.this);
                return d02;
            }
        });
        this.f1255y = LazyKt.lazy(new Function0() { // from class: C7.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 v10;
                v10 = W.v(W.this);
                return v10;
            }
        });
        this.f1256z = LazyKt.lazy(new Function0() { // from class: C7.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n0 W10;
                W10 = W.W(W.this);
                return W10;
            }
        });
        this.f1221A = LazyKt.lazy(new Function0() { // from class: C7.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 t10;
                t10 = W.t(W.this);
                return t10;
            }
        });
        this.f1222B = LazyKt.lazy(new Function0() { // from class: C7.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 s10;
                s10 = W.s(W.this);
                return s10;
            }
        });
        this.f1223C = LazyKt.lazy(new Function0() { // from class: C7.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 X10;
                X10 = W.X(W.this);
                return X10;
            }
        });
        this.f1224D = LazyKt.lazy(new Function0() { // from class: C7.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 a02;
                a02 = W.a0(W.this);
                return a02;
            }
        });
        this.f1225E = LazyKt.lazy(new Function0() { // from class: C7.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 U10;
                U10 = W.U(W.this);
                return U10;
            }
        });
        this.f1226F = LazyKt.lazy(new Function0() { // from class: C7.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 Z10;
                Z10 = W.Z(W.this);
                return Z10;
            }
        });
        this.f1227G = LazyKt.lazy(new Function0() { // from class: C7.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 n02;
                n02 = W.n0(W.this);
                return n02;
            }
        });
        this.f1228H = LazyKt.lazy(new Function0() { // from class: C7.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 Y10;
                Y10 = W.Y(W.this);
                return Y10;
            }
        });
        this.f1229I = LazyKt.lazy(new Function0() { // from class: C7.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 S10;
                S10 = W.S(W.this);
                return S10;
            }
        });
        this.f1230J = LazyKt.lazy(new Function0() { // from class: C7.U
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d0 w10;
                w10 = W.w(W.this);
                return w10;
            }
        });
    }

    public static final d0 S(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.H q10 = this$0.f1232b.q();
        Intrinsics.checkNotNullExpressionValue(q10, "newLocalAssetFetchProducer(...)");
        return this$0.g0(q10);
    }

    public static final j0 T(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return new j0(this$0.x());
        }
        N7.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.x());
        } finally {
            N7.b.b();
        }
    }

    public static final d0 U(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.I r10 = this$0.f1232b.r();
        Intrinsics.checkNotNullExpressionValue(r10, "newLocalContentUriFetchProducer(...)");
        return this$0.h0(r10, new u0[]{this$0.f1232b.s(), this$0.f1232b.t()});
    }

    public static final j0 V(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return new j0(this$0.y());
        }
        N7.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.y());
        } finally {
            N7.b.b();
        }
    }

    public static final n0 W(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return this$0.f1232b.E(this$0.y());
        }
        N7.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.f1232b.E(this$0.y());
        } finally {
            N7.b.b();
        }
    }

    public static final d0 X(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.M u10 = this$0.f1232b.u();
        Intrinsics.checkNotNullExpressionValue(u10, "newLocalFileFetchProducer(...)");
        return this$0.g0(u10);
    }

    public static final d0 Y(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.N v10 = this$0.f1232b.v();
        Intrinsics.checkNotNullExpressionValue(v10, "newLocalResourceFetchProducer(...)");
        return this$0.g0(v10);
    }

    public static final d0 Z(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.S w10 = this$0.f1232b.w();
        Intrinsics.checkNotNullExpressionValue(w10, "newLocalThumbnailBitmapSdk29Producer(...)");
        return this$0.e0(w10);
    }

    public static final d0 a0(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.T x10 = this$0.f1232b.x();
        Intrinsics.checkNotNullExpressionValue(x10, "newLocalVideoThumbnailProducer(...)");
        return this$0.e0(x10);
    }

    public static final j0 b0(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return new j0(this$0.z());
        }
        N7.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.z());
        } finally {
            N7.b.b();
        }
    }

    public static final d0 c0(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return this$0.f0(this$0.C());
        }
        N7.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.f0(this$0.C());
        } finally {
            N7.b.b();
        }
    }

    public static final n0 d0(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return this$0.f1232b.E(this$0.z());
        }
        N7.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.f1232b.E(this$0.z());
        } finally {
            N7.b.b();
        }
    }

    public static final d0 n0(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i0 C10 = this$0.f1232b.C();
        Intrinsics.checkNotNullExpressionValue(C10, "newQualifiedResourceFetchProducer(...)");
        return this$0.g0(C10);
    }

    public static final d0 s(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            com.facebook.imagepipeline.producers.I r10 = this$0.f1232b.r();
            Intrinsics.checkNotNullExpressionValue(r10, "newLocalContentUriFetchProducer(...)");
            return this$0.f1232b.b(this$0.k0(r10), this$0.f1236f);
        }
        N7.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.I r11 = this$0.f1232b.r();
            Intrinsics.checkNotNullExpressionValue(r11, "newLocalContentUriFetchProducer(...)");
            return this$0.f1232b.b(this$0.k0(r11), this$0.f1236f);
        } finally {
            N7.b.b();
        }
    }

    public static final d0 t(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            com.facebook.imagepipeline.producers.M u10 = this$0.f1232b.u();
            Intrinsics.checkNotNullExpressionValue(u10, "newLocalFileFetchProducer(...)");
            return this$0.f1232b.b(this$0.k0(u10), this$0.f1236f);
        }
        N7.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.M u11 = this$0.f1232b.u();
            Intrinsics.checkNotNullExpressionValue(u11, "newLocalFileFetchProducer(...)");
            return this$0.f1232b.b(this$0.k0(u11), this$0.f1236f);
        } finally {
            N7.b.b();
        }
    }

    public static final d0 u(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return this$0.f1232b.b(this$0.C(), this$0.f1236f);
        }
        N7.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.f1232b.b(this$0.C(), this$0.f1236f);
        } finally {
            N7.b.b();
        }
    }

    public static final d0 v(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!N7.b.d()) {
            return this$0.i0(this$0.f1233c);
        }
        N7.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.i0(this$0.f1233c);
        } finally {
            N7.b.b();
        }
    }

    public static final d0 w(W this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C3031o i10 = this$0.f1232b.i();
        Intrinsics.checkNotNullExpressionValue(i10, "newDataFetchProducer(...)");
        return this$0.f0(this$0.f1232b.D(C.a(i10), true, this$0.f1241k));
    }

    public final d0 A(com.facebook.imagepipeline.request.b bVar) {
        d0 O10;
        if (!N7.b.d()) {
            Uri sourceUri = bVar.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
            if (sourceUri == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int sourceUriType = bVar.getSourceUriType();
            if (sourceUriType == 0) {
                return O();
            }
            switch (sourceUriType) {
                case 2:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : N();
                case 3:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : K();
                case 4:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : F6.a.c(this.f1231a.getType(sourceUri)) ? N() : I();
                case 5:
                    return H();
                case 6:
                    return L();
                case 7:
                    return D();
                case 8:
                    return R();
                default:
                    Set set = this.f1245o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f1220K.c(sourceUri));
            }
        }
        N7.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri sourceUri2 = bVar.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri2, "getSourceUri(...)");
            if (sourceUri2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int sourceUriType2 = bVar.getSourceUriType();
            if (sourceUriType2 != 0) {
                switch (sourceUriType2) {
                    case 2:
                        if (!bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            O10 = N();
                            break;
                        } else {
                            d0 M10 = M();
                            N7.b.b();
                            return M10;
                        }
                    case 3:
                        if (!bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            O10 = K();
                            break;
                        } else {
                            d0 M11 = M();
                            N7.b.b();
                            return M11;
                        }
                    case 4:
                        if (!bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            if (!F6.a.c(this.f1231a.getType(sourceUri2))) {
                                O10 = I();
                                break;
                            } else {
                                d0 N10 = N();
                                N7.b.b();
                                return N10;
                            }
                        } else {
                            d0 M12 = M();
                            N7.b.b();
                            return M12;
                        }
                    case 5:
                        O10 = H();
                        break;
                    case 6:
                        O10 = L();
                        break;
                    case 7:
                        O10 = D();
                        break;
                    case 8:
                        O10 = R();
                        break;
                    default:
                        Set set2 = this.f1245o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            if (it2.hasNext()) {
                                android.support.v4.media.session.b.a(it2.next());
                                throw null;
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f1220K.c(sourceUri2));
                }
            } else {
                O10 = O();
            }
            N7.b.b();
            return O10;
        } catch (Throwable th2) {
            N7.b.b();
            throw th2;
        }
    }

    public final synchronized d0 B(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f1248r.get(d0Var);
        if (d0Var2 == null) {
            d0Var2 = this.f1232b.f(d0Var);
            this.f1248r.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    public final d0 C() {
        return (d0) this.f1255y.getValue();
    }

    public final d0 D() {
        return (d0) this.f1230J.getValue();
    }

    public final d0 E(com.facebook.imagepipeline.request.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (!N7.b.d()) {
            d0 A10 = A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                A10 = Q(A10);
            }
            if (this.f1238h) {
                A10 = B(A10);
            }
            return (!this.f1244n || imageRequest.getDelayMs() <= 0) ? A10 : F(A10);
        }
        N7.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 A11 = A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                A11 = Q(A11);
            }
            if (this.f1238h) {
                A11 = B(A11);
            }
            if (this.f1244n && imageRequest.getDelayMs() > 0) {
                A11 = F(A11);
            }
            N7.b.b();
            return A11;
        } catch (Throwable th2) {
            N7.b.b();
            throw th2;
        }
    }

    public final synchronized d0 F(d0 d0Var) {
        C3034s k10;
        k10 = this.f1232b.k(d0Var);
        Intrinsics.checkNotNullExpressionValue(k10, "newDelayProducer(...)");
        return k10;
    }

    public final d0 G(com.facebook.imagepipeline.request.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        a aVar = f1220K;
        aVar.d(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return P();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return J();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(sourceUri));
    }

    public final d0 H() {
        return (d0) this.f1229I.getValue();
    }

    public final d0 I() {
        return (d0) this.f1225E.getValue();
    }

    public final d0 J() {
        Object value = this.f1256z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 K() {
        return (d0) this.f1223C.getValue();
    }

    public final d0 L() {
        return (d0) this.f1228H.getValue();
    }

    public final d0 M() {
        return (d0) this.f1226F.getValue();
    }

    public final d0 N() {
        return (d0) this.f1224D.getValue();
    }

    public final d0 O() {
        return (d0) this.f1252v.getValue();
    }

    public final d0 P() {
        Object value = this.f1254x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    public final synchronized d0 Q(d0 d0Var) {
        d0 d0Var2;
        d0Var2 = (d0) this.f1246p.get(d0Var);
        if (d0Var2 == null) {
            b0 B10 = this.f1232b.B(d0Var);
            Intrinsics.checkNotNullExpressionValue(B10, "newPostprocessorProducer(...)");
            d0Var2 = this.f1232b.A(B10);
            this.f1246p.put(d0Var, d0Var2);
        }
        return d0Var2;
    }

    public final d0 R() {
        return (d0) this.f1227G.getValue();
    }

    public final d0 e0(d0 d0Var) {
        C3025i e10 = this.f1232b.e(d0Var);
        Intrinsics.checkNotNullExpressionValue(e10, "newBitmapMemoryCacheProducer(...)");
        C3024h d10 = this.f1232b.d(e10);
        Intrinsics.checkNotNullExpressionValue(d10, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        d0 b10 = this.f1232b.b(d10, this.f1236f);
        Intrinsics.checkNotNullExpressionValue(b10, "newBackgroundThreadHandoffProducer(...)");
        if (!this.f1242l && !this.f1243m) {
            C3023g c10 = this.f1232b.c(b10);
            Intrinsics.checkNotNullExpressionValue(c10, "newBitmapMemoryCacheGetProducer(...)");
            return c10;
        }
        C3023g c11 = this.f1232b.c(b10);
        Intrinsics.checkNotNullExpressionValue(c11, "newBitmapMemoryCacheGetProducer(...)");
        C3027k g10 = this.f1232b.g(c11);
        Intrinsics.checkNotNullExpressionValue(g10, "newBitmapProbeProducer(...)");
        return g10;
    }

    public final d0 f0(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        if (!N7.b.d()) {
            C3032p j10 = this.f1232b.j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(j10, "newDecodeProducer(...)");
            return e0(j10);
        }
        N7.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C3032p j11 = this.f1232b.j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(j11, "newDecodeProducer(...)");
            return e0(j11);
        } finally {
            N7.b.b();
        }
    }

    public final d0 g0(d0 d0Var) {
        return h0(d0Var, new u0[]{this.f1232b.t()});
    }

    public final d0 h0(d0 d0Var, u0[] u0VarArr) {
        return f0(m0(k0(d0Var), u0VarArr));
    }

    public final synchronized d0 i0(X networkFetcher) {
        try {
            Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
            boolean z10 = false;
            if (!N7.b.d()) {
                d0 y10 = this.f1232b.y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(y10, "newNetworkFetchProducer(...)");
                C3017a a10 = C.a(k0(y10));
                Intrinsics.checkNotNullExpressionValue(a10, "newAddImageTransformMetaDataProducer(...)");
                C c10 = this.f1232b;
                if (this.f1234d && this.f1237g != EnumC1050n.f1295c) {
                    z10 = true;
                }
                return c10.D(a10, z10, this.f1241k);
            }
            N7.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                d0 y11 = this.f1232b.y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(y11, "newNetworkFetchProducer(...)");
                C3017a a11 = C.a(k0(y11));
                Intrinsics.checkNotNullExpressionValue(a11, "newAddImageTransformMetaDataProducer(...)");
                C c11 = this.f1232b;
                if (this.f1234d && this.f1237g != EnumC1050n.f1295c) {
                    z10 = true;
                }
                k0 D10 = c11.D(a11, z10, this.f1241k);
                N7.b.b();
                return D10;
            } catch (Throwable th2) {
                N7.b.b();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final d0 j0(d0 d0Var) {
        C3038w m10;
        C3038w m11;
        if (!N7.b.d()) {
            if (this.f1239i) {
                Y z10 = this.f1232b.z(d0Var);
                Intrinsics.checkNotNullExpressionValue(z10, "newPartialDiskCacheProducer(...)");
                m11 = this.f1232b.m(z10);
            } else {
                m11 = this.f1232b.m(d0Var);
            }
            Intrinsics.checkNotNull(m11);
            C3037v l10 = this.f1232b.l(m11);
            Intrinsics.checkNotNullExpressionValue(l10, "newDiskCacheReadProducer(...)");
            return l10;
        }
        N7.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f1239i) {
                Y z11 = this.f1232b.z(d0Var);
                Intrinsics.checkNotNullExpressionValue(z11, "newPartialDiskCacheProducer(...)");
                m10 = this.f1232b.m(z11);
            } else {
                m10 = this.f1232b.m(d0Var);
            }
            Intrinsics.checkNotNull(m10);
            C3037v l11 = this.f1232b.l(m10);
            Intrinsics.checkNotNullExpressionValue(l11, "newDiskCacheReadProducer(...)");
            N7.b.b();
            return l11;
        } catch (Throwable th2) {
            N7.b.b();
            throw th2;
        }
    }

    public final d0 k0(d0 d0Var) {
        if (this.f1240j) {
            d0Var = j0(d0Var);
        }
        d0 o10 = this.f1232b.o(d0Var);
        Intrinsics.checkNotNullExpressionValue(o10, "newEncodedMemoryCacheProducer(...)");
        if (!this.f1243m) {
            C3040y n10 = this.f1232b.n(o10);
            Intrinsics.checkNotNullExpressionValue(n10, "newEncodedCacheKeyMultiplexProducer(...)");
            return n10;
        }
        com.facebook.imagepipeline.producers.A p10 = this.f1232b.p(o10);
        Intrinsics.checkNotNullExpressionValue(p10, "newEncodedProbeProducer(...)");
        C3040y n11 = this.f1232b.n(p10);
        Intrinsics.checkNotNullExpressionValue(n11, "newEncodedCacheKeyMultiplexProducer(...)");
        return n11;
    }

    public final d0 l0(u0[] u0VarArr) {
        t0 G10 = this.f1232b.G(u0VarArr);
        Intrinsics.checkNotNullExpressionValue(G10, "newThumbnailBranchProducer(...)");
        k0 D10 = this.f1232b.D(G10, true, this.f1241k);
        Intrinsics.checkNotNullExpressionValue(D10, "newResizeAndRotateProducer(...)");
        return D10;
    }

    public final d0 m0(d0 d0Var, u0[] u0VarArr) {
        C3017a a10 = C.a(d0Var);
        Intrinsics.checkNotNullExpressionValue(a10, "newAddImageTransformMetaDataProducer(...)");
        r0 F10 = this.f1232b.F(this.f1232b.D(a10, true, this.f1241k));
        Intrinsics.checkNotNullExpressionValue(F10, "newThrottlingProducer(...)");
        C3028l h10 = C.h(l0(u0VarArr), F10);
        Intrinsics.checkNotNullExpressionValue(h10, "newBranchOnSeparateImagesProducer(...)");
        return h10;
    }

    public final d0 x() {
        Object value = this.f1222B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 y() {
        Object value = this.f1221A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 z() {
        Object value = this.f1253w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }
}
