package O;

import O.b;
import O.m;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public class h {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8179f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f8180g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f8181h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f8182i;

    /* renamed from: a, reason: collision with root package name */
    public final c f8183a;

    /* renamed from: b, reason: collision with root package name */
    public final c f8184b;

    /* renamed from: c, reason: collision with root package name */
    public final c f8185c;

    /* renamed from: d, reason: collision with root package name */
    public final c f8186d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8187e;

    @Nullable
    private final float[] transform;

    public static final class a {

        /* renamed from: O.h$a$a, reason: collision with other inner class name */
        public static final class C0169a extends h {
            public C0169a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // O.h
            public long e(float f10, float f11, float f12, float f13) {
                return N.f.a(f10, f11, f12, f13, d());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float[] b(c cVar, c cVar2, int i10) {
            if (!m.e(i10, m.f8204a.a())) {
                return null;
            }
            long e10 = cVar.e();
            b.a aVar = O.b.f8149a;
            boolean e11 = O.b.e(e10, aVar.b());
            boolean e12 = O.b.e(cVar2.e(), aVar.b());
            if (e11 && e12) {
                return null;
            }
            if (!e11 && !e12) {
                return null;
            }
            if (!e11) {
                cVar = cVar2;
            }
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            w wVar = (w) cVar;
            float[] c10 = e11 ? wVar.J().c() : j.f8190a.c();
            float[] c11 = e12 ? wVar.J().c() : j.f8190a.c();
            return new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]};
        }

        public final h c() {
            return h.f8182i;
        }

        public final h d() {
            return h.f8180g;
        }

        public final h e() {
            return h.f8181h;
        }

        public final h f(c source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0169a(source, m.f8204a.c());
        }

        public a() {
        }
    }

    public static final class b extends h {

        /* renamed from: j, reason: collision with root package name */
        public final w f8188j;

        /* renamed from: k, reason: collision with root package name */
        public final w f8189k;

        @NotNull
        private final float[] mTransform;

        public /* synthetic */ b(w wVar, w wVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(wVar, wVar2, i10);
        }

        @Override // O.h
        public long e(float f10, float f11, float f12, float f13) {
            float a10 = (float) this.f8188j.D().a(f10);
            float a11 = (float) this.f8188j.D().a(f11);
            float a12 = (float) this.f8188j.D().a(f12);
            return N.f.a((float) this.f8189k.G().a(d.n(this.mTransform, a10, a11, a12)), (float) this.f8189k.G().a(d.o(this.mTransform, a10, a11, a12)), (float) this.f8189k.G().a(d.p(this.mTransform, a10, a11, a12)), f13, this.f8189k);
        }

        public final float[] f(w wVar, w wVar2, int i10) {
            if (d.f(wVar.J(), wVar2.J())) {
                return d.k(wVar2.F(), wVar.I());
            }
            float[] I10 = wVar.I();
            float[] F10 = wVar2.F();
            float[] c10 = wVar.J().c();
            float[] c11 = wVar2.J().c();
            y J10 = wVar.J();
            j jVar = j.f8190a;
            if (!d.f(J10, jVar.b())) {
                float[] b10 = O.a.f8145a.a().b();
                float[] c12 = jVar.c();
                float[] copyOf = Arrays.copyOf(c12, c12.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                I10 = d.k(d.e(b10, c10, copyOf), wVar.I());
            }
            if (!d.f(wVar2.J(), jVar.b())) {
                float[] b11 = O.a.f8145a.a().b();
                float[] c13 = jVar.c();
                float[] copyOf2 = Arrays.copyOf(c13, c13.length);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                F10 = d.j(d.k(d.e(b11, c11, copyOf2), wVar2.I()));
            }
            if (m.e(i10, m.f8204a.a())) {
                I10 = d.l(new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]}, I10);
            }
            return d.k(F10, I10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w mSource, w mDestination, int i10) {
            super(mSource, mDestination, mSource, mDestination, i10, null, null);
            Intrinsics.checkNotNullParameter(mSource, "mSource");
            Intrinsics.checkNotNullParameter(mDestination, "mDestination");
            this.f8188j = mSource;
            this.f8189k = mDestination;
            this.mTransform = f(mSource, mDestination, i10);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        a aVar = new a(defaultConstructorMarker);
        f8179f = aVar;
        g gVar = g.f8158a;
        f8180g = aVar.f(gVar.h());
        w h10 = gVar.h();
        c g10 = gVar.g();
        m.a aVar2 = m.f8204a;
        f8181h = new h(h10, g10, aVar2.b(), defaultConstructorMarker);
        f8182i = new h(gVar.g(), gVar.h(), aVar2.b(), defaultConstructorMarker);
    }

    public /* synthetic */ h(c cVar, c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i10);
    }

    public final c d() {
        return this.f8184b;
    }

    public long e(float f10, float f11, float f12, float f13) {
        long h10 = this.f8185c.h(f10, f11, f12);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        float intBitsToFloat = Float.intBitsToFloat((int) (h10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h10 & BodyPartID.bodyIdMax));
        float i10 = this.f8185c.i(f10, f11, f12);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            i10 *= fArr[2];
        }
        float f14 = intBitsToFloat2;
        float f15 = intBitsToFloat;
        return this.f8186d.j(f15, f14, i10, f13, this.f8184b);
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    public h(c source, c destination, c transformSource, c transformDestination, int i10, float[] fArr) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transformSource, "transformSource");
        Intrinsics.checkNotNullParameter(transformDestination, "transformDestination");
        this.f8183a = source;
        this.f8184b = destination;
        this.f8185c = transformSource;
        this.f8186d = transformDestination;
        this.f8187e = i10;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(c source, c destination, int i10) {
        this(source, destination, O.b.e(r0, r2.b()) ? d.d(source, j.f8190a.b(), null, 2, null) : source, O.b.e(destination.e(), r2.b()) ? d.d(destination, j.f8190a.b(), null, 2, null) : destination, i10, f8179f.b(source, destination, i10), null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        long e10 = source.e();
        b.a aVar = O.b.f8149a;
    }
}
