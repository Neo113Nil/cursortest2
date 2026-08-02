package n0;

import D1.I0;
import D1.J0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8361B extends e.c implements I0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76055c = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super B1.B, Unit> f76056a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f76057b = f76055c;

    /* renamed from: n0.B$a */
    public static final class a {
    }

    public C8361B(@NotNull Function1<? super B1.B, Unit> function1) {
        this.f76056a = function1;
    }

    public final void I1(B1.B b11) {
        this.f76056a.invoke(b11);
        C8361B c8361b = (C8361B) J0.b(this);
        if (c8361b != null) {
            c8361b.I1(b11);
        }
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return this.f76057b;
    }
}
