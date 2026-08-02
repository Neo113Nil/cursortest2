package ru.ozon.pikazon.compose.painter;

import B1.InterfaceC2547p;
import B1.t0;
import S0.C0;
import S0.C3956f1;
import S0.C3985t0;
import S0.C3987u0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.g;
import l1.C7809a0;
import n1.C8409b;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/pikazon/compose/painter/CrossfadePainter;", "Lq1/b;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossfadePainter extends AbstractC8972b {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC8972b f97626a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8972b f97627b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2547p f97628c;

    /* renamed from: d, reason: collision with root package name */
    private final int f97629d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f97630e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3987u0 f97631f;

    /* renamed from: g, reason: collision with root package name */
    private g.a f97632g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f97633h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3985t0 f97634i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f97635j;

    public CrossfadePainter(AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, @NotNull InterfaceC2547p contentScale, boolean z11) {
        C3991w0 f7;
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f97626a = abstractC8972b;
        this.f97627b = abstractC8972b2;
        this.f97628c = contentScale;
        this.f97629d = 300;
        this.f97630e = z11;
        this.f97631f = C3956f1.a(0);
        this.f97634i = C0.a(1.0f);
        f7 = n1.f(null, D1.f25195a);
        this.f97635j = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(InterfaceC8412e interfaceC8412e, AbstractC8972b abstractC8972b, float f7) {
        if (abstractC8972b == null || f7 <= 0.0f) {
            return;
        }
        long i11 = interfaceC8412e.i();
        long f40457d = abstractC8972b.getF40457d();
        long b11 = (f40457d == 9205357640488583168L || C7464j.g(f40457d) || i11 == 9205357640488583168L || C7464j.g(i11)) ? i11 : t0.b(f40457d, this.f97628c.a(f40457d, i11));
        C3991w0 c3991w0 = this.f97635j;
        if (i11 == 9205357640488583168L || C7464j.g(i11)) {
            abstractC8972b.m444drawx_KDEd0(interfaceC8412e, b11, f7, (C7809a0) c3991w0.getValue());
            return;
        }
        float f11 = 2;
        float f12 = (C7464j.f(i11) - C7464j.f(b11)) / f11;
        float d11 = (C7464j.d(i11) - C7464j.d(b11)) / f11;
        interfaceC8412e.w0().f().c(f12, d11, f12, d11);
        try {
            abstractC8972b.m444drawx_KDEd0(interfaceC8412e, b11, f7, (C7809a0) c3991w0.getValue());
        } finally {
            C8409b f13 = interfaceC8412e.w0().f();
            float f14 = -f12;
            float f15 = -d11;
            f13.c(f14, f15, f14, f15);
        }
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f97634i.h(f7);
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f97635j.setValue(c7809a0);
        return true;
    }

    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF40457d() {
        AbstractC8972b abstractC8972b = this.f97626a;
        long f40457d = abstractC8972b != null ? abstractC8972b.getF40457d() : 0L;
        AbstractC8972b abstractC8972b2 = this.f97627b;
        long f40457d2 = abstractC8972b2 != null ? abstractC8972b2.getF40457d() : 0L;
        boolean z11 = f40457d != 9205357640488583168L;
        boolean z12 = f40457d2 != 9205357640488583168L;
        if (z11 && z12) {
            return C7465k.a(Math.max(C7464j.f(f40457d), C7464j.f(f40457d2)), Math.max(C7464j.d(f40457d), C7464j.d(f40457d2)));
        }
        return 9205357640488583168L;
    }

    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        long b11;
        Intrinsics.checkNotNullParameter(interfaceC8412e, "<this>");
        boolean z11 = this.f97633h;
        AbstractC8972b abstractC8972b = this.f97627b;
        C3985t0 c3985t0 = this.f97634i;
        if (z11) {
            a(interfaceC8412e, abstractC8972b, c3985t0.getFloatValue());
            return;
        }
        g.a aVar = this.f97632g;
        if (aVar != null) {
            b11 = aVar.c();
        } else {
            kotlin.time.g.f71988a.getClass();
            kotlin.time.f.f71986a.getClass();
            b11 = kotlin.time.f.b();
            this.f97632g = g.a.a(b11);
        }
        kotlin.time.f.f71986a.getClass();
        float h11 = kotlin.time.b.h(kotlin.time.f.a(b11)) / this.f97629d;
        float floatValue = c3985t0.getFloatValue() * kotlin.ranges.h.d(h11, 0.0f, 1.0f);
        float floatValue2 = this.f97630e ? c3985t0.getFloatValue() - floatValue : c3985t0.getFloatValue();
        this.f97633h = h11 >= 1.0f;
        a(interfaceC8412e, this.f97626a, floatValue2);
        a(interfaceC8412e, abstractC8972b, floatValue);
        if (this.f97633h) {
            this.f97626a = null;
        } else {
            C3987u0 c3987u0 = this.f97631f;
            c3987u0.d(c3987u0.getIntValue() + 1);
        }
    }
}
