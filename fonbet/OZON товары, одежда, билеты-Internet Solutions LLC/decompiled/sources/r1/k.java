package r1;

import Kk.C3532b;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import Z1.r;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7795M;
import l1.C7809a0;
import l1.C7848y;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9155c f82800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f82801c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82802d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9153a f82803e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f82804f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f82805g;

    /* renamed from: h, reason: collision with root package name */
    private C7795M f82806h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f82807i;

    /* renamed from: j, reason: collision with root package name */
    private long f82808j;

    /* renamed from: k, reason: collision with root package name */
    private float f82809k;

    /* renamed from: l, reason: collision with root package name */
    private float f82810l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8412e, Unit> f82811m;

    static final class a extends AbstractC7737t implements Function1<j, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j jVar) {
            k.e(k.this);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
            k kVar = k.this;
            C9155c j11 = kVar.j();
            float f7 = kVar.f82809k;
            float f11 = kVar.f82810l;
            C8408a.b w02 = interfaceC8412e2.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().e(f7, f11, 0L);
                j11.a(interfaceC8412e2);
                C3532b.b(w02, e11);
                return Unit.f71690a;
            } catch (Throwable th2) {
                C3532b.b(w02, e11);
                throw th2;
            }
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f82814b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    public k(@NotNull C9155c c9155c) {
        super(0);
        C3991w0 f7;
        C3991w0 f11;
        this.f82800b = c9155c;
        c9155c.d(new a());
        this.f82801c = "";
        this.f82802d = true;
        this.f82803e = new C9153a();
        this.f82804f = c.f82814b;
        f7 = n1.f(null, D1.f25195a);
        this.f82805g = f7;
        f11 = n1.f(C7464j.a(0L), D1.f25195a);
        this.f82807i = f11;
        this.f82808j = 9205357640488583168L;
        this.f82809k = 1.0f;
        this.f82810l = 1.0f;
        this.f82811m = new b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static final void e(k kVar) {
        kVar.f82802d = true;
        kVar.f82804f.invoke();
    }

    @Override // r1.j
    public final void a(@NotNull InterfaceC8412e interfaceC8412e) {
        h(interfaceC8412e, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r3.b() == 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r3.b() == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10 != (r3 == null ? r3.b() : 0)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0034, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(@NotNull InterfaceC8412e interfaceC8412e, float f7, C7809a0 c7809a0) {
        int i11;
        boolean z11;
        C9153a c9153a;
        C7809a0 c7809a02 = c7809a0;
        C9155c c9155c = this.f82800b;
        if (c9155c.h() && c9155c.f() != 16) {
            C7809a0 i12 = i();
            int i13 = m.f82827b;
            if (i12 instanceof C7795M) {
                C7795M c7795m = (C7795M) i12;
                if (c7795m.b() != 5) {
                }
                if (c7809a02 instanceof C7795M) {
                    C7795M c7795m2 = (C7795M) c7809a02;
                    if (c7795m2.b() != 5) {
                    }
                    i11 = 1;
                }
            }
            z11 = this.f82802d;
            c9153a = this.f82803e;
            if (!z11 && C7464j.c(this.f82808j, interfaceC8412e.i())) {
                C7848y c11 = c9153a.c();
            }
            this.f82806h = i11 != 1 ? C7809a0.a.a(5, c9155c.f()) : null;
            float f11 = C7464j.f(interfaceC8412e.i());
            C3991w0 c3991w0 = this.f82807i;
            this.f82809k = f11 / C7464j.f(((C7464j) c3991w0.getValue()).i());
            this.f82810l = C7464j.d(interfaceC8412e.i()) / C7464j.d(((C7464j) c3991w0.getValue()).i());
            this.f82803e.a(i11, r.a((int) Math.ceil(C7464j.f(interfaceC8412e.i())), (int) Math.ceil(C7464j.d(interfaceC8412e.i()))), interfaceC8412e, interfaceC8412e.getLayoutDirection(), this.f82811m);
            this.f82802d = false;
            this.f82808j = interfaceC8412e.i();
            if (c7809a02 == null) {
                c7809a02 = i() != null ? i() : this.f82806h;
            }
            c9153a.b(interfaceC8412e, f7, c7809a02);
        }
        i11 = 0;
        z11 = this.f82802d;
        c9153a = this.f82803e;
        if (!z11) {
            C7848y c112 = c9153a.c();
        }
        this.f82806h = i11 != 1 ? C7809a0.a.a(5, c9155c.f()) : null;
        float f112 = C7464j.f(interfaceC8412e.i());
        C3991w0 c3991w02 = this.f82807i;
        this.f82809k = f112 / C7464j.f(((C7464j) c3991w02.getValue()).i());
        this.f82810l = C7464j.d(interfaceC8412e.i()) / C7464j.d(((C7464j) c3991w02.getValue()).i());
        this.f82803e.a(i11, r.a((int) Math.ceil(C7464j.f(interfaceC8412e.i())), (int) Math.ceil(C7464j.d(interfaceC8412e.i()))), interfaceC8412e, interfaceC8412e.getLayoutDirection(), this.f82811m);
        this.f82802d = false;
        this.f82808j = interfaceC8412e.i();
        if (c7809a02 == null) {
        }
        c9153a.b(interfaceC8412e, f7, c7809a02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7809a0 i() {
        return (C7809a0) this.f82805g.getValue();
    }

    @NotNull
    public final C9155c j() {
        return this.f82800b;
    }

    public final void k(C7795M c7795m) {
        this.f82805g.setValue(c7795m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(@NotNull Function0<Unit> function0) {
        this.f82804f = (AbstractC7737t) function0;
    }

    public final void m(@NotNull String str) {
        this.f82801c = str;
    }

    public final void n(long j11) {
        this.f82807i.setValue(C7464j.a(j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f82801c);
        sb2.append("\n\tviewportWidth: ");
        C3991w0 c3991w0 = this.f82807i;
        sb2.append(C7464j.f(((C7464j) c3991w0.getValue()).i()));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(C7464j.d(((C7464j) c3991w0.getValue()).i()));
        sb2.append("\n");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
