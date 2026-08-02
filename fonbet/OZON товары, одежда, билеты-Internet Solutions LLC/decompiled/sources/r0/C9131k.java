package r0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8374O;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9131k implements InterfaceC9108I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f82624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f82625b = new a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8374O f82626c = new C8374O();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f82627d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f82628e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f82629f;

    /* renamed from: r0.k$a */
    public static final class a implements InterfaceC9106G {
        a() {
        }

        @Override // r0.InterfaceC9106G
        public final float a(float f7) {
            if (Float.isNaN(f7)) {
                return 0.0f;
            }
            C9131k c9131k = C9131k.this;
            float floatValue = c9131k.k().invoke(Float.valueOf(f7)).floatValue();
            c9131k.f82628e.setValue(Boolean.valueOf(floatValue > 0.0f));
            c9131k.f82629f.setValue(Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9131k(@NotNull Function1<? super Float, Float> function1) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        this.f82624a = (AbstractC7737t) function1;
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.f82627d = f7;
        f11 = n1.f(bool, D1.f25195a);
        this.f82628e = f11;
        f12 = n1.f(bool, D1.f25195a);
        this.f82629f = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return ((Boolean) this.f82627d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return ((Number) this.f82624a.invoke(Float.valueOf(f7))).floatValue();
    }

    @Override // r0.InterfaceC9108I
    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object d11 = xe.N.d(new C9130j(this, enumC8372M, function2, null), cVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<Float, Float> k() {
        return this.f82624a;
    }
}
