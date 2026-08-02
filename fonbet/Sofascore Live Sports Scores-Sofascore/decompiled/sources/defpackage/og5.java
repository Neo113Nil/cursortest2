package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class og5 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static pg5 c;

    public static final void a(ComponentActivity componentActivity, qqi qqiVar, qqi qqiVar2) {
        qqiVar.getClass();
        qqiVar2.getClass();
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        pg5 pg5Var = c;
        if (pg5Var == null) {
            int i = Build.VERSION.SDK_INT;
            pg5Var = i >= 35 ? new tg5() : i >= 30 ? new sg5() : i >= 29 ? new rg5() : i >= 28 ? new qg5() : new pg5();
            c = pg5Var;
        }
        pg5 pg5Var2 = pg5Var;
        dp1 dp1Var = new dp1(pg5Var2, qqiVar, qqiVar2, componentActivity, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator it = new tsk(viewGroup).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                ng5 ng5Var = new ng5(dp1Var, viewGroup.getContext());
                ng5Var.setTag(pg5Var2);
                ng5Var.setVisibility(8);
                ng5Var.setWillNotDraw(true);
                viewGroup.addView(ng5Var);
                break;
            }
            if (((View) uskVar.next()).getTag() instanceof pg5) {
                break;
            }
        }
        dp1Var.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        pg5Var2.a(window);
    }

    public static void b(AbstractActivity abstractActivity, qqi qqiVar, qqi qqiVar2, int i) {
        int i2 = 10;
        if ((i & 1) != 0) {
            qqiVar = new qqi(0, 0, 0, new rfi(i2));
        }
        if ((i & 2) != 0) {
            qqiVar2 = new qqi(a, b, 0, new rfi(i2));
        }
        a(abstractActivity, qqiVar, qqiVar2);
    }
}
