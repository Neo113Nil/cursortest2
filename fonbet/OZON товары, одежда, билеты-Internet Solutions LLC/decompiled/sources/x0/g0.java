package x0;

import S0.InterfaceC3967k;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f104768a;

    /* loaded from: classes8.dex */
    public static final class a implements f0 {
        a() {
        }

        @Override // x0.f0
        public final void a(@NotNull e0 e0Var) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f104768a = Intrinsics.d(lowerCase, "robolectric") ? new a() : null;
    }

    @NotNull
    public static final f0 a(InterfaceC3967k interfaceC3967k) {
        a aVar = f104768a;
        if (aVar != null) {
            interfaceC3967k.o(1213893039);
            interfaceC3967k.k();
            return aVar;
        }
        interfaceC3967k.o(1213931944);
        View view = (View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h());
        boolean n11 = interfaceC3967k.n(view);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new RunnableC10596a(view);
            interfaceC3967k.x(C11);
        }
        RunnableC10596a runnableC10596a = (RunnableC10596a) C11;
        interfaceC3967k.k();
        return runnableC10596a;
    }
}
