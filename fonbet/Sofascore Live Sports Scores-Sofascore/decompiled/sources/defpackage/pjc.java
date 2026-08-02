package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pjc extends njc {
    public final /* synthetic */ int c;
    public final /* synthetic */ wj9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjc(wj9 wj9Var, int i) {
        super(100, 101);
        this.c = i;
        this.d = wj9Var;
        switch (i) {
            case 1:
                super(149, 150);
                break;
            case 2:
                super(93, 94);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.njc
    public final void b(dni dniVar) {
        int i = this.c;
        wj9 wj9Var = this.d;
        dniVar.getClass();
        switch (i) {
            case 0:
                wj9Var.f(dniVar, Sports.MMA, 11);
                wj9.F(dniVar, Sports.MMA, "start");
                wj9.F(dniVar, Sports.MMA, "finish");
                wj9.F(dniVar, Sports.MMA, "prestart");
                ugj.a.getClass();
                break;
            case 1:
                dniVar.E("ALTER TABLE sport_order ADD COLUMN isSelected INTEGER NOT NULL DEFAULT 0");
                Calendar calendar = ke0.a;
                String b = ke0.b((Context) wj9Var.b);
                if (b.length() > 0) {
                    dniVar.P("UPDATE sport_order SET isSelected = 1 WHERE sportName = ?", new String[]{b});
                    break;
                }
                break;
            default:
                wj9Var.f(dniVar, Sports.E_SPORTS, 6);
                wj9.F(dniVar, Sports.E_SPORTS, "start");
                wj9.F(dniVar, Sports.E_SPORTS, "finish");
                wj9.F(dniVar, Sports.E_SPORTS, "prestart");
                break;
        }
    }
}
