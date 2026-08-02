package coil.compose;

import B1.InterfaceC2547p;
import B1.t0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import android.os.SystemClock;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import l1.C7809a0;
import n1.C8409b;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Lq1/b;", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CrossfadePainter extends AbstractC8972b {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC8972b f57243a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8972b f57244b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2547p f57245c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f57246d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57247e;

    /* renamed from: f, reason: collision with root package name */
    private long f57248f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f57249g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57250h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57251i;

    public CrossfadePainter(AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, @NotNull InterfaceC2547p interfaceC2547p, boolean z11) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        this.f57243a = abstractC8972b;
        this.f57244b = abstractC8972b2;
        this.f57245c = interfaceC2547p;
        this.f57246d = z11;
        f7 = n1.f(0, D1.f25195a);
        this.f57247e = f7;
        this.f57248f = -1L;
        f11 = n1.f(Float.valueOf(1.0f), D1.f25195a);
        this.f57250h = f11;
        f12 = n1.f(null, D1.f25195a);
        this.f57251i = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(InterfaceC8412e interfaceC8412e, AbstractC8972b abstractC8972b, float f7) {
        if (abstractC8972b == null || f7 <= 0.0f) {
            return;
        }
        long i11 = interfaceC8412e.i();
        long f40457d = abstractC8972b.getF40457d();
        long b11 = (f40457d == 9205357640488583168L || C7464j.g(f40457d) || i11 == 9205357640488583168L || C7464j.g(i11)) ? i11 : t0.b(f40457d, this.f57245c.a(f40457d, i11));
        C3991w0 c3991w0 = this.f57251i;
        if (i11 == 9205357640488583168L || C7464j.g(i11)) {
            abstractC8972b.m444drawx_KDEd0(interfaceC8412e, b11, f7, (C7809a0) c3991w0.getValue());
            return;
        }
        float f11 = 2;
        float f12 = (C7464j.f(i11) - C7464j.f(b11)) / f11;
        float d11 = (C7464j.d(i11) - C7464j.d(b11)) / f11;
        interfaceC8412e.w0().f().c(f12, d11, f12, d11);
        abstractC8972b.m444drawx_KDEd0(interfaceC8412e, b11, f7, (C7809a0) c3991w0.getValue());
        C8409b f13 = interfaceC8412e.w0().f();
        float f14 = -f12;
        float f15 = -d11;
        f13.c(f14, f15, f14, f15);
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f57250h.setValue(Float.valueOf(f7));
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f57251i.setValue(c7809a0);
        return true;
    }

    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF40457d() {
        AbstractC8972b abstractC8972b = this.f57243a;
        C7464j a11 = abstractC8972b == null ? null : C7464j.a(abstractC8972b.getF40457d());
        long i11 = a11 == null ? 0L : a11.i();
        AbstractC8972b abstractC8972b2 = this.f57244b;
        C7464j a12 = abstractC8972b2 != null ? C7464j.a(abstractC8972b2.getF40457d()) : null;
        long i12 = a12 != null ? a12.i() : 0L;
        boolean z11 = i11 != 9205357640488583168L;
        boolean z12 = i12 != 9205357640488583168L;
        if (z11 && z12) {
            return C7465k.a(Math.max(C7464j.f(i11), C7464j.f(i12)), Math.max(C7464j.d(i11), C7464j.d(i12)));
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        boolean z11 = this.f57249g;
        C3991w0 c3991w0 = this.f57250h;
        AbstractC8972b abstractC8972b = this.f57244b;
        if (z11) {
            a(interfaceC8412e, abstractC8972b, ((Number) c3991w0.getValue()).floatValue());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f57248f == -1) {
            this.f57248f = uptimeMillis;
        }
        float f7 = (uptimeMillis - this.f57248f) / 0;
        float floatValue = ((Number) c3991w0.getValue()).floatValue() * kotlin.ranges.h.d(f7, 0.0f, 1.0f);
        float floatValue2 = this.f57246d ? ((Number) c3991w0.getValue()).floatValue() - floatValue : ((Number) c3991w0.getValue()).floatValue();
        this.f57249g = f7 >= 1.0f;
        a(interfaceC8412e, this.f57243a, floatValue2);
        a(interfaceC8412e, abstractC8972b, floatValue);
        if (this.f57249g) {
            this.f57243a = null;
        } else {
            C3991w0 c3991w02 = this.f57247e;
            c3991w02.setValue(Integer.valueOf(((Number) c3991w02.getValue()).intValue() + 1));
        }
    }
}
