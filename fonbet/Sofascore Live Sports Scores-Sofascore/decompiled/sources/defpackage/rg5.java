package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class rg5 extends qg5 {
    @Override // defpackage.pg5
    public void b(@NotNull qqi qqiVar, @NotNull qqi qqiVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        qqiVar.getClass();
        qqiVar2.getClass();
        window.getClass();
        view.getClass();
        bea.L(window, false);
        window.setStatusBarColor(qqiVar.a(z));
        window.setNavigationBarColor(qqiVar2.a(z2));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(qqiVar2.c == 0);
        bka bkaVar = new bka(view);
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.C(!z);
        aalVar.B(!z2);
    }
}
