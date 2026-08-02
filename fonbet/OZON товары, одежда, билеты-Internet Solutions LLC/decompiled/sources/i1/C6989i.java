package i1;

import D1.InterfaceC2819t;
import D1.J;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: i1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6989i extends e.c implements InterfaceC2819t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super InterfaceC8412e, Unit> f65686a;

    public C6989i(@NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        this.f65686a = function1;
    }

    public final void I1(@NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        this.f65686a = function1;
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        this.f65686a.invoke(interfaceC8410c);
        ((J) interfaceC8410c).F0();
    }
}
