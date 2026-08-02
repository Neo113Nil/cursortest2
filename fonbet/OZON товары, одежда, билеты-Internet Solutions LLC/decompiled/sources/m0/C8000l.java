package m0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8000l<T, V extends AbstractC8015t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0<T, V> f73796a;

    /* renamed from: b, reason: collision with root package name */
    private final T f73797b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73798c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73799d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73800e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private V f73801f;

    /* renamed from: g, reason: collision with root package name */
    private long f73802g;

    /* renamed from: h, reason: collision with root package name */
    private long f73803h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73804i;

    /* JADX WARN: Multi-variable type inference failed */
    public C8000l(Object obj, @NotNull U0 u02, @NotNull AbstractC8015t abstractC8015t, long j11, Object obj2, long j12, @NotNull Function0 function0) {
        C3991w0 f7;
        C3991w0 f11;
        this.f73796a = u02;
        this.f73797b = obj2;
        this.f73798c = j12;
        this.f73799d = (AbstractC7737t) function0;
        f7 = n1.f(obj, D1.f25195a);
        this.f73800e = f7;
        this.f73801f = (V) C8017u.a(abstractC8015t);
        this.f73802g = j11;
        this.f73803h = Long.MIN_VALUE;
        f11 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f73804i = f11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public final void a() {
        k();
        this.f73799d.invoke();
    }

    public final long b() {
        return this.f73803h;
    }

    public final long c() {
        return this.f73802g;
    }

    public final long d() {
        return this.f73798c;
    }

    public final T e() {
        return this.f73800e.getValue();
    }

    public final T f() {
        return this.f73796a.b().invoke(this.f73801f);
    }

    @NotNull
    public final V g() {
        return this.f73801f;
    }

    public final boolean h() {
        return ((Boolean) this.f73804i.getValue()).booleanValue();
    }

    public final void i(long j11) {
        this.f73803h = j11;
    }

    public final void j(long j11) {
        this.f73802g = j11;
    }

    public final void k() {
        this.f73804i.setValue(Boolean.FALSE);
    }

    public final void l(T t2) {
        this.f73800e.setValue(t2);
    }

    public final void m(@NotNull V v11) {
        this.f73801f = v11;
    }
}
