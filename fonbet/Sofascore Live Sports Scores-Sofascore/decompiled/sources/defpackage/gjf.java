package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gjf extends cgh {
    public static final /* synthetic */ int p = 0;

    public final ArrayList i(boolean z) {
        kp5 kp5Var = bjf.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : kp5Var) {
            bjf bjfVar = (bjf) obj;
            Function1 function1 = bjfVar.d;
            Context context = getContext();
            context.getClass();
            if (((Boolean) function1.invoke(context)).booleanValue()) {
                Context context2 = getContext();
                context2.getClass();
                if (((Boolean) n9e.x(context2, new mme(bjfVar, 13))).booleanValue() || z) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ejf((bjf) it.next(), z));
        }
        return arrayList2;
    }

    @Override // defpackage.cgh, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 ad2Var = qv5.a;
        qv5.a(q42.a);
    }

    @Override // defpackage.cgh, defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            bea.L(window, false);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    @Override // defpackage.cgh, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = qv5.a;
        qv5.a(p42.a);
    }
}
