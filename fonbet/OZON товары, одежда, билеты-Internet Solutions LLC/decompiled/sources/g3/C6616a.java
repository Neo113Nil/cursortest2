package g3;

import B4.C2581j;
import S0.H0;
import S0.InterfaceC3967k;
import S0.O;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.D0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6616a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final O f63723a = new O(C1032a.f63724b);

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    static final class C1032a extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1032a f63724b = new C1032a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ B0 invoke() {
            return null;
        }
    }

    public static B0 a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.B(-584162872);
        B0 b02 = (B0) interfaceC3967k.m(f63723a);
        if (b02 == null) {
            interfaceC3967k.B(1382572291);
            b02 = D0.a((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h()));
            interfaceC3967k.K();
        }
        interfaceC3967k.K();
        return b02;
    }

    @NotNull
    public static H0 b(@NotNull C2581j viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return f63723a.c(viewModelStoreOwner);
    }
}
