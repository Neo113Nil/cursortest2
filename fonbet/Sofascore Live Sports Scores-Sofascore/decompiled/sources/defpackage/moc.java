package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class moc {
    public final Context a;
    public final Team b;
    public final ViewGroup c;
    public final LayoutInflater d;
    public rrc e;
    public Map f;
    public final ym6 g;

    public moc(Context context, Team team, ViewGroup viewGroup) {
        context.getClass();
        team.getClass();
        this.a = context;
        this.b = team;
        this.c = viewGroup;
        this.d = LayoutInflater.from(context);
        this.e = rrc.a;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.f = lm5Var;
        ym6 ym6Var = new ym6();
        ym6Var.c = 150L;
        ym6Var.d = new LinearInterpolator();
        this.g = ym6Var;
    }

    public final ArrayList a() {
        List q = i5h.q(new tsk(this.c));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q) {
            if (obj instanceof lrc) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
