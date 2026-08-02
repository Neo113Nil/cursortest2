package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Player;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oye implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pye b;

    public /* synthetic */ oye(int i, pye pyeVar) {
        this.a = i;
        this.b = pyeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        pye pyeVar = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                int i3 = pye.F;
                pyeVar.q();
                int i4 = 1;
                boolean z = pyeVar.y == 1;
                LinkedHashMap linkedHashMap = z ? pyeVar.t : pyeVar.u;
                LinkedHashMap linkedHashMap2 = z ? pyeVar.o : pyeVar.p;
                LinkedHashMap linkedHashMap3 = z ? pyeVar.q : pyeVar.r;
                j22 j22Var = pyeVar.d;
                WeakHashMap weakHashMap = pyeVar.v;
                Collection values = weakHashMap.values();
                values.getClass();
                Iterator it = values.iterator();
                while (true) {
                    rq3 rq3Var = null;
                    if (!it.hasNext()) {
                        for (sle sleVar : linkedHashMap.values()) {
                            Player player = sleVar.a;
                            boolean z2 = sleVar.d;
                            TextView textView = (TextView) linkedHashMap2.get(Integer.valueOf(player.getId()));
                            TextView textView2 = (TextView) linkedHashMap3.get(Integer.valueOf(sleVar.a.getId()));
                            if (sleVar.e) {
                                if (textView == null && textView2 == null) {
                                    break;
                                } else if (z2 && ((CheckBox) j22Var.f).isChecked()) {
                                    if (textView != null) {
                                        g6b t = qea.t(pyeVar);
                                        weakHashMap.put(textView, t != null ? xw3.L(wca.x(t), null, null, new lye(textView, rq3Var, i2), 3) : null);
                                    }
                                } else if (z2) {
                                    if (textView != null) {
                                        tgj.F(textView, 400L, new AccelerateDecelerateInterpolator());
                                    }
                                } else if (((CheckBox) j22Var.f).isChecked()) {
                                    if (textView != null) {
                                        tgj.F(textView, 400L, new AccelerateDecelerateInterpolator());
                                    }
                                } else if (textView != null) {
                                    g6b t2 = qea.t(pyeVar);
                                    weakHashMap.put(textView, t2 != null ? xw3.L(wca.x(t2), null, null, new lye(textView, rq3Var, i4), 3) : null);
                                }
                            }
                        }
                        break;
                    } else {
                        yda ydaVar = (yda) it.next();
                        ydaVar.getClass();
                        ydaVar.e(null);
                    }
                }
                break;
            default:
                d7a.G(pyeVar.getContext());
                pyeVar.A = false;
                pyeVar.q();
                break;
        }
    }
}
