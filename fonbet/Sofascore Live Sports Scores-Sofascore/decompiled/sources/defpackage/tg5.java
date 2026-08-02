package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.insets.ProtectionLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tg5 extends sg5 {
    @Override // defpackage.rg5, defpackage.pg5
    public void b(@NotNull qqi qqiVar, @NotNull qqi qqiVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        qqiVar.getClass();
        qqiVar2.getClass();
        window.getClass();
        view.getClass();
        int i = 0;
        bea.L(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int a = qqiVar.a(z);
        int a2 = qqiVar2.a(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = new tsk(viewGroup).iterator();
            while (true) {
                usk uskVar = (usk) it;
                if (uskVar.hasNext()) {
                    Object tag = ((View) uskVar.next()).getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(i) instanceof d23)) {
                            for (Object obj : (Iterable) tag) {
                                if ((obj instanceof d23 ? (d23) obj : null) != null) {
                                    d23 d23Var = (d23) obj;
                                    int i2 = d23Var.a;
                                    uef uefVar = d23Var.b;
                                    ColorDrawable colorDrawable = d23Var.f;
                                    if (i2 == 1) {
                                        d23Var.g = true;
                                        if (d23Var.h != a2) {
                                            d23Var.h = a2;
                                            colorDrawable.setColor(a2);
                                            uefVar.e = colorDrawable;
                                            k1d k1dVar = uefVar.i;
                                            if (k1dVar != null) {
                                                ((View) k1dVar.c).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i2 == 2) {
                                        d23Var.g = true;
                                        if (d23Var.h != a) {
                                            d23Var.h = a;
                                            colorDrawable.setColor(a);
                                            uefVar.e = colorDrawable;
                                            k1d k1dVar2 = uefVar.i;
                                            if (k1dVar2 != null) {
                                                ((View) k1dVar2.c).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i2 == 4) {
                                        d23Var.g = true;
                                        if (d23Var.h != a2) {
                                            d23Var.h = a2;
                                            colorDrawable.setColor(a2);
                                            uefVar.e = colorDrawable;
                                            k1d k1dVar3 = uefVar.i;
                                            if (k1dVar3 != null) {
                                                ((View) k1dVar3.c).setBackground(colorDrawable);
                                            }
                                        }
                                    } else if (i2 == 8) {
                                        d23Var.g = true;
                                        if (d23Var.h != a2) {
                                            d23Var.h = a2;
                                            colorDrawable.setColor(a2);
                                            uefVar.e = colorDrawable;
                                            k1d k1dVar4 = uefVar.i;
                                            if (k1dVar4 != null) {
                                                ((View) k1dVar4.c).setBackground(colorDrawable);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i = 0;
                } else if (a != 0 || a2 != 0) {
                    List j = b.j(new d23(2, a), new d23(1, a2), new d23(4, a2), new d23(8, a2));
                    ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup) view).getContext(), j);
                    protectionLayout.setTag(j);
                    viewGroup.addView(protectionLayout);
                }
            }
        }
        window.setNavigationBarContrastEnforced(qqiVar2.c == 0);
        bka bkaVar = new bka(view);
        int i3 = Build.VERSION.SDK_INT;
        pea aalVar = i3 >= 35 ? new aal(window, bkaVar) : i3 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.C(!z);
        aalVar.B(!z2);
    }
}
