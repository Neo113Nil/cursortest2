package com.facebook.imagepipeline.producers;

import C7.C1037a;
import C7.EnumC1050n;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.producers.C3032p;
import com.facebook.imagepipeline.producers.G;
import com.facebook.imagepipeline.request.b;
import com.facebook.imageutils.BitmapUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import u7.C6528b;

/* renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3032p implements d0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f30838m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final G6.a f30839a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f30840b;

    /* renamed from: c, reason: collision with root package name */
    public final F7.c f30841c;

    /* renamed from: d, reason: collision with root package name */
    public final F7.e f30842d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1050n f30843e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30844f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30845g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f30846h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30847i;

    /* renamed from: j, reason: collision with root package name */
    public final C1037a f30848j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f30849k;

    /* renamed from: l, reason: collision with root package name */
    public final D6.n f30850l;

    /* renamed from: com.facebook.imagepipeline.producers.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b(H7.k kVar, B7.d dVar) {
            return (((long) kVar.getWidth()) * ((long) kVar.getHeight())) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(dVar.f826h)) > 104857600;
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$b */
    public final class b extends d {

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C3032p f30851k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3032p c3032p, InterfaceC3030n consumer, e0 producerContext, boolean z10, int i10) {
            super(c3032p, consumer, producerContext, z10, i10);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f30851k = c3032p;
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public synchronized boolean I(H7.k kVar, int i10) {
            return AbstractC3019c.e(i10) ? false : super.I(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public int w(H7.k encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return encodedImage.y1();
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public H7.p y() {
            H7.p d10 = H7.o.d(0, false, false);
            Intrinsics.checkNotNullExpressionValue(d10, "of(...)");
            return d10;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$c */
    public final class c extends d {

        /* renamed from: k, reason: collision with root package name */
        public final F7.f f30852k;

        /* renamed from: l, reason: collision with root package name */
        public final F7.e f30853l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C3032p f30854m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3032p c3032p, InterfaceC3030n consumer, e0 producerContext, F7.f progressiveJpegParser, F7.e progressiveJpegConfig, boolean z10, int i10) {
            super(c3032p, consumer, producerContext, z10, i10);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            this.f30854m = c3032p;
            this.f30852k = progressiveJpegParser;
            this.f30853l = progressiveJpegConfig;
            H(0);
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public synchronized boolean I(H7.k kVar, int i10) {
            if (kVar == null) {
                return false;
            }
            try {
                boolean I10 = super.I(kVar, i10);
                if (!AbstractC3019c.e(i10)) {
                    if (AbstractC3019c.m(i10, 8)) {
                    }
                    return I10;
                }
                if (!AbstractC3019c.m(i10, 4) && H7.k.isValid(kVar) && kVar.A0() == C6528b.f66196b) {
                    if (!this.f30852k.g(kVar)) {
                        return false;
                    }
                    int d10 = this.f30852k.d();
                    if (d10 <= x()) {
                        return false;
                    }
                    if (d10 < this.f30853l.a(x()) && !this.f30852k.e()) {
                        return false;
                    }
                    H(d10);
                }
                return I10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public int w(H7.k encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return this.f30852k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C3032p.d
        public H7.p y() {
            H7.p b10 = this.f30853l.b(this.f30852k.d());
            Intrinsics.checkNotNullExpressionValue(b10, "getQualityInfo(...)");
            return b10;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$d */
    public abstract class d extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f30855c;

        /* renamed from: d, reason: collision with root package name */
        public final String f30856d;

        /* renamed from: e, reason: collision with root package name */
        public final g0 f30857e;

        /* renamed from: f, reason: collision with root package name */
        public final B7.d f30858f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f30859g;

        /* renamed from: h, reason: collision with root package name */
        public final G f30860h;

        /* renamed from: i, reason: collision with root package name */
        public int f30861i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C3032p f30862j;

        /* renamed from: com.facebook.imagepipeline.producers.p$d$a */
        public static final class a extends AbstractC3022f {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f30864b;

            public a(boolean z10) {
                this.f30864b = z10;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3022f, com.facebook.imagepipeline.producers.f0
            public void a() {
                if (d.this.f30855c.A0()) {
                    d.this.f30860h.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                if (this.f30864b) {
                    d.this.z();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C3032p c3032p, InterfaceC3030n consumer, e0 producerContext, boolean z10, final int i10) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f30862j = c3032p;
            this.f30855c = producerContext;
            this.f30856d = "ProgressiveDecoder";
            this.f30857e = producerContext.z0();
            B7.d imageDecodeOptions = producerContext.D0().getImageDecodeOptions();
            Intrinsics.checkNotNullExpressionValue(imageDecodeOptions, "getImageDecodeOptions(...)");
            this.f30858f = imageDecodeOptions;
            this.f30860h = new G(c3032p.f(), new G.d() { // from class: com.facebook.imagepipeline.producers.q
                @Override // com.facebook.imagepipeline.producers.G.d
                public final void a(H7.k kVar, int i11) {
                    C3032p.d.q(C3032p.d.this, c3032p, i10, kVar, i11);
                }
            }, imageDecodeOptions.f819a);
            producerContext.k(new a(z10));
        }

        public static final void q(d this$0, C3032p this$1, int i10, H7.k kVar, int i11) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (kVar != null) {
                com.facebook.imagepipeline.request.b D02 = this$0.f30855c.D0();
                this$0.f30855c.U("image_format", kVar.A0().a());
                Uri sourceUri = D02.getSourceUri();
                kVar.m2(sourceUri != null ? sourceUri.toString() : null);
                EnumC1050n downsampleOverride = D02.getDownsampleOverride();
                if (downsampleOverride == null) {
                    downsampleOverride = this$1.e();
                }
                boolean m10 = AbstractC3019c.m(i11, 16);
                if ((downsampleOverride == EnumC1050n.f1293a || (downsampleOverride == EnumC1050n.f1294b && !m10)) && (this$1.d() || !com.facebook.common.util.f.p(D02.getSourceUri()))) {
                    B7.h rotationOptions = D02.getRotationOptions();
                    Intrinsics.checkNotNullExpressionValue(rotationOptions, "getRotationOptions(...)");
                    kVar.l2(O7.a.b(rotationOptions, D02.getResizeOptions(), kVar, i10));
                }
                if (this$0.f30855c.r().G().i()) {
                    this$0.E(kVar);
                }
                this$0.u(kVar, i11, this$0.f30861i);
            }
        }

        public final void A(Throwable th2) {
            D(true);
            o().onFailure(th2);
        }

        public final void B(H7.e eVar, int i10) {
            H6.a b10 = this.f30862j.c().b(eVar);
            try {
                D(AbstractC3019c.d(i10));
                o().b(b10, i10);
            } finally {
                H6.a.U(b10);
            }
        }

        public final H7.e C(H7.k kVar, int i10, H7.p pVar) {
            boolean z10 = this.f30862j.h() != null && ((Boolean) this.f30862j.i().get()).booleanValue();
            try {
                return this.f30862j.g().a(kVar, i10, pVar, this.f30858f);
            } catch (OutOfMemoryError e10) {
                if (!z10) {
                    throw e10;
                }
                Runnable h10 = this.f30862j.h();
                if (h10 != null) {
                    h10.run();
                }
                System.gc();
                return this.f30862j.g().a(kVar, i10, pVar, this.f30858f);
            }
        }

        public final void D(boolean z10) {
            synchronized (this) {
                if (z10) {
                    if (!this.f30859g) {
                        o().c(1.0f);
                        this.f30859g = true;
                        Unit unit = Unit.INSTANCE;
                        this.f30860h.c();
                    }
                }
            }
        }

        public final void E(H7.k kVar) {
            if (kVar.A0() != C6528b.f66196b) {
                return;
            }
            kVar.l2(O7.a.c(kVar, BitmapUtil.getPixelSizeForBitmapConfig(this.f30858f.f826h), 104857600));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            if (!N7.b.d()) {
                boolean d10 = AbstractC3019c.d(i10);
                if (d10) {
                    if (kVar == null) {
                        boolean areEqual = Intrinsics.areEqual(this.f30855c.y1("cached_value_found"), Boolean.TRUE);
                        if (!this.f30855c.r().G().h() || this.f30855c.T1() == b.c.FULL_FETCH || areEqual) {
                            A(new com.facebook.common.util.a("Encoded image is null."));
                            return;
                        }
                    } else if (!kVar.isValid()) {
                        A(new com.facebook.common.util.a("Encoded image is not valid."));
                        return;
                    }
                }
                if (I(kVar, i10)) {
                    boolean m10 = AbstractC3019c.m(i10, 4);
                    if (d10 || m10 || this.f30855c.A0()) {
                        this.f30860h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            N7.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean d11 = AbstractC3019c.d(i10);
                if (d11) {
                    if (kVar == null) {
                        boolean areEqual2 = Intrinsics.areEqual(this.f30855c.y1("cached_value_found"), Boolean.TRUE);
                        if (this.f30855c.r().G().h()) {
                            if (this.f30855c.T1() != b.c.FULL_FETCH) {
                                if (areEqual2) {
                                }
                            }
                        }
                        A(new com.facebook.common.util.a("Encoded image is null."));
                        N7.b.b();
                        return;
                    }
                    if (!kVar.isValid()) {
                        A(new com.facebook.common.util.a("Encoded image is not valid."));
                        N7.b.b();
                        return;
                    }
                }
                if (!I(kVar, i10)) {
                    N7.b.b();
                    return;
                }
                boolean m11 = AbstractC3019c.m(i10, 4);
                if (d11 || m11 || this.f30855c.A0()) {
                    this.f30860h.h();
                }
                Unit unit = Unit.INSTANCE;
                N7.b.b();
            } catch (Throwable th2) {
                N7.b.b();
                throw th2;
            }
        }

        public final void G(H7.k kVar, H7.e eVar, int i10) {
            this.f30855c.U("encoded_width", Integer.valueOf(kVar.getWidth()));
            this.f30855c.U("encoded_height", Integer.valueOf(kVar.getHeight()));
            this.f30855c.U("encoded_size", Integer.valueOf(kVar.y1()));
            this.f30855c.U("image_color_space", kVar.w0());
            if (eVar instanceof H7.d) {
                this.f30855c.U("bitmap_config", String.valueOf(((H7.d) eVar).A1().getConfig()));
            }
            if (eVar != null) {
                eVar.m1(this.f30855c.getExtras());
            }
            this.f30855c.U("last_scan_num", Integer.valueOf(i10));
        }

        public final void H(int i10) {
            this.f30861i = i10;
        }

        public boolean I(H7.k kVar, int i10) {
            return this.f30860h.k(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void f() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            A(t10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void i(float f10) {
            super.i(f10 * 0.99f);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void u(H7.k kVar, int i10, int i11) {
            int y12;
            H7.p pVar;
            H7.p pVar2;
            String str;
            long j10;
            H7.e eVar;
            int i12 = i10;
            if ((kVar.A0() != C6528b.f66196b && AbstractC3019c.e(i12)) || this.f30859g || !H7.k.isValid(kVar)) {
                return;
            }
            if (Intrinsics.areEqual(kVar.A0(), C6528b.f66198d) && C3032p.f30838m.b(kVar, this.f30858f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + kVar.getWidth() + ", h = " + kVar.getHeight() + ", pixel config = " + this.f30858f.f826h + ", max bitmap size = 104857600");
                this.f30857e.k(this.f30855c, "DecodeProducer", illegalStateException, null);
                A(illegalStateException);
                return;
            }
            u7.c A02 = kVar.A0();
            Intrinsics.checkNotNullExpressionValue(A02, "getImageFormat(...)");
            String a10 = A02.a();
            String str2 = "unknown";
            String str3 = a10 == null ? "unknown" : a10;
            String str4 = kVar.getWidth() + C5444x.f55808b + kVar.getHeight();
            String valueOf = String.valueOf(kVar.n1());
            boolean d10 = AbstractC3019c.d(i12);
            boolean z10 = d10 && !AbstractC3019c.m(i12, 8);
            boolean m10 = AbstractC3019c.m(i12, 4);
            B7.g resizeOptions = this.f30855c.D0().getResizeOptions();
            if (resizeOptions != null) {
                str2 = resizeOptions.f849a + C5444x.f55808b + resizeOptions.f850b;
            }
            try {
                long f10 = this.f30860h.f();
                String uri = this.f30855c.D0().getSourceUri().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                try {
                    try {
                        if (!z10 && !m10) {
                            y12 = w(kVar);
                            if (!z10 && !m10) {
                                pVar = y();
                                this.f30857e.d(this.f30855c, "DecodeProducer");
                                Intrinsics.checkNotNull(pVar);
                                eVar = C(kVar, y12, pVar);
                                if (kVar.n1() != 1) {
                                    i12 |= 16;
                                }
                                this.f30857e.j(this.f30855c, "DecodeProducer", v(eVar, f10, pVar, d10, str3, str4, str2, valueOf));
                                G(kVar, eVar, i11);
                                B(eVar, i12);
                                H7.k.r(kVar);
                                return;
                            }
                            pVar = H7.o.f4868d;
                            this.f30857e.d(this.f30855c, "DecodeProducer");
                            Intrinsics.checkNotNull(pVar);
                            eVar = C(kVar, y12, pVar);
                            if (kVar.n1() != 1) {
                            }
                            this.f30857e.j(this.f30855c, "DecodeProducer", v(eVar, f10, pVar, d10, str3, str4, str2, valueOf));
                            G(kVar, eVar, i11);
                            B(eVar, i12);
                            H7.k.r(kVar);
                            return;
                        }
                        if (!z10) {
                            pVar = y();
                            this.f30857e.d(this.f30855c, "DecodeProducer");
                            Intrinsics.checkNotNull(pVar);
                            eVar = C(kVar, y12, pVar);
                            if (kVar.n1() != 1) {
                            }
                            this.f30857e.j(this.f30855c, "DecodeProducer", v(eVar, f10, pVar, d10, str3, str4, str2, valueOf));
                            G(kVar, eVar, i11);
                            B(eVar, i12);
                            H7.k.r(kVar);
                            return;
                        }
                        if (kVar.n1() != 1) {
                        }
                        this.f30857e.j(this.f30855c, "DecodeProducer", v(eVar, f10, pVar, d10, str3, str4, str2, valueOf));
                        G(kVar, eVar, i11);
                        B(eVar, i12);
                        H7.k.r(kVar);
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        pVar2 = pVar;
                        str = str2;
                        j10 = f10;
                        Intrinsics.checkNotNull(pVar2);
                        this.f30857e.k(this.f30855c, "DecodeProducer", e, v(eVar, j10, pVar2, d10, str3, str4, str, valueOf));
                        A(e);
                        H7.k.r(kVar);
                        return;
                    }
                    Intrinsics.checkNotNull(pVar);
                    eVar = C(kVar, y12, pVar);
                } catch (F7.a e11) {
                    pVar2 = pVar;
                    str = str2;
                    j10 = f10;
                    try {
                        try {
                            H7.k a11 = e11.a();
                            E6.a.M(this.f30856d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e11.getMessage(), uri, a11.z0(10), Integer.valueOf(a11.y1()));
                            throw e11;
                        } catch (Exception e12) {
                            e = e12;
                            eVar = null;
                            Intrinsics.checkNotNull(pVar2);
                            this.f30857e.k(this.f30855c, "DecodeProducer", e, v(eVar, j10, pVar2, d10, str3, str4, str, valueOf));
                            A(e);
                            H7.k.r(kVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        H7.k.r(kVar);
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    pVar2 = pVar;
                    str = str2;
                    j10 = f10;
                    eVar = null;
                    Intrinsics.checkNotNull(pVar2);
                    this.f30857e.k(this.f30855c, "DecodeProducer", e, v(eVar, j10, pVar2, d10, str3, str4, str, valueOf));
                    A(e);
                    H7.k.r(kVar);
                    return;
                }
                y12 = kVar.y1();
                pVar = H7.o.f4868d;
                this.f30857e.d(this.f30855c, "DecodeProducer");
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final Map v(H7.e eVar, long j10, H7.p pVar, boolean z10, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String str5 = null;
            if (!this.f30857e.f(this.f30855c, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j10);
            String valueOf2 = String.valueOf(pVar.b());
            String valueOf3 = String.valueOf(z10);
            if (eVar != null && (extras = eVar.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                str5 = obj.toString();
            }
            if (!(eVar instanceof H7.f)) {
                String str6 = str5;
                HashMap hashMap = new HashMap(7);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                if (str6 != null) {
                    hashMap.put("non_fatal_decode_error", str6);
                }
                return D6.g.a(hashMap);
            }
            String str7 = str5;
            Bitmap A12 = ((H7.f) eVar).A1();
            Intrinsics.checkNotNullExpressionValue(A12, "getUnderlyingBitmap(...)");
            String str8 = A12.getWidth() + C5444x.f55808b + A12.getHeight();
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("bitmapSize", str8);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            int byteCount = A12.getByteCount();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(byteCount);
            hashMap2.put("byteCount", sb2.toString());
            if (str7 != null) {
                hashMap2.put("non_fatal_decode_error", str7);
            }
            return D6.g.a(hashMap2);
        }

        public abstract int w(H7.k kVar);

        public final int x() {
            return this.f30861i;
        }

        public abstract H7.p y();

        public final void z() {
            D(true);
            o().a();
        }
    }

    public C3032p(G6.a byteArrayPool, Executor executor, F7.c imageDecoder, F7.e progressiveJpegConfig, EnumC1050n downsampleMode, boolean z10, boolean z11, d0 inputProducer, int i10, C1037a closeableReferenceFactory, Runnable runnable, D6.n recoverFromDecoderOOM) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f30839a = byteArrayPool;
        this.f30840b = executor;
        this.f30841c = imageDecoder;
        this.f30842d = progressiveJpegConfig;
        this.f30843e = downsampleMode;
        this.f30844f = z10;
        this.f30845g = z11;
        this.f30846h = inputProducer;
        this.f30847i = i10;
        this.f30848j = closeableReferenceFactory;
        this.f30849k = runnable;
        this.f30850l = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n consumer, e0 context) {
        C3032p c3032p;
        e0 e0Var;
        InterfaceC3030n cVar;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (N7.b.d()) {
            N7.b.a("DecodeProducer#produceResults");
            try {
                com.facebook.imagepipeline.request.b D02 = context.D0();
                this.f30846h.b((com.facebook.common.util.f.p(D02.getSourceUri()) || com.facebook.imagepipeline.request.c.s(D02.getSourceUri())) ? new c(this, consumer, context, new F7.f(this.f30839a), this.f30842d, this.f30845g, this.f30847i) : new b(this, consumer, context, this.f30845g, this.f30847i), context);
                Unit unit = Unit.INSTANCE;
                N7.b.b();
                return;
            } catch (Throwable th2) {
                N7.b.b();
                throw th2;
            }
        }
        com.facebook.imagepipeline.request.b D03 = context.D0();
        if (com.facebook.common.util.f.p(D03.getSourceUri()) || com.facebook.imagepipeline.request.c.s(D03.getSourceUri())) {
            c3032p = this;
            e0Var = context;
            cVar = new c(c3032p, consumer, e0Var, new F7.f(c3032p.f30839a), c3032p.f30842d, c3032p.f30845g, c3032p.f30847i);
        } else {
            cVar = new b(this, consumer, context, this.f30845g, this.f30847i);
            c3032p = this;
            e0Var = context;
        }
        c3032p.f30846h.b(cVar, e0Var);
    }

    public final C1037a c() {
        return this.f30848j;
    }

    public final boolean d() {
        return this.f30844f;
    }

    public final EnumC1050n e() {
        return this.f30843e;
    }

    public final Executor f() {
        return this.f30840b;
    }

    public final F7.c g() {
        return this.f30841c;
    }

    public final Runnable h() {
        return this.f30849k;
    }

    public final D6.n i() {
        return this.f30850l;
    }
}
