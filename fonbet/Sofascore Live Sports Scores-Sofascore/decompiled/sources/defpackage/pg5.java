package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class pg5 {
    public void a(Window window) {
        window.getClass();
    }

    public void b(@NotNull qqi qqiVar, @NotNull qqi qqiVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        qqiVar.getClass();
        qqiVar2.getClass();
        window.getClass();
        view.getClass();
        bea.L(window, false);
        window.setStatusBarColor(z ? qqiVar.b : qqiVar.a);
        window.setNavigationBarColor(z2 ? qqiVar2.b : qqiVar2.a);
        bka bkaVar = new bka(view);
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.C(!z);
        aalVar.B(!z2);
    }
}
