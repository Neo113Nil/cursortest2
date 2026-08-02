package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.sofascore.results.league.LeagueActivity;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z93 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z93(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                aa3 aa3Var = (aa3) obj;
                k43 k43Var = ((ca3) obj2).w;
                if (k43Var == null) {
                    return false;
                }
                k43Var.invoke(aa3Var);
                return false;
            default:
                LeagueActivity leagueActivity = (LeagueActivity) obj2;
                List list = (List) obj;
                a99 a99Var = LeagueActivity.h0;
                if (motionEvent.getAction() == 1) {
                    leagueActivity.X(list);
                }
                return true;
        }
    }
}
