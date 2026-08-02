package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.SeasonShotAction;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zve {
    public static final double d = Math.pow(238.0d, 2.0d);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    static {
        Math.pow(237.0d, 2.0d);
        Math.pow(238.0d, 2.0d);
    }

    public zve() {
        for (int i = 0; i < 9; i++) {
            ArrayList arrayList = this.a;
            fs1 fs1Var = new fs1();
            fs1Var.a = 0;
            fs1Var.b = 0;
            arrayList.add(fs1Var);
        }
    }

    public final void a(SeasonShotAction seasonShotAction) {
        int i;
        int x = seasonShotAction.getX();
        int y = seasonShotAction.getY();
        int made = seasonShotAction.getMade();
        int missed = seasonShotAction.getMissed();
        if (x <= -219 && y < 89) {
            i = 0;
        } else if (x < 219 || y >= 89) {
            i = Math.pow((double) y, 2.0d) + Math.pow((double) x, 2.0d) >= d ? x <= -83 ? 2 : x < 83 ? 3 : 4 : y <= 139 ? x < -79 ? 5 : x <= 79 ? 6 : 7 : 8;
        } else {
            i = 1;
        }
        ArrayList arrayList = this.a;
        ((fs1) arrayList.get(i)).a += made;
        ((fs1) arrayList.get(i)).b += missed;
        Point2D point2D = new Point2D(x, y);
        for (int i2 = 0; i2 < seasonShotAction.getMade(); i2++) {
            this.b.add(point2D);
        }
        for (int i3 = 0; i3 < seasonShotAction.getMissed(); i3++) {
            this.c.add(point2D);
        }
    }
}
