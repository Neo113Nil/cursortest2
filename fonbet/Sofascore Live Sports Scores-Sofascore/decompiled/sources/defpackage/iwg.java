package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.SubTeam;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iwg extends c8 {
    public final /* synthetic */ int d = 0;
    public final krk e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iwg(rfe rfeVar, fvg fvgVar) {
        super(r0, fvgVar);
        fvgVar.getClass();
        LinearLayout linearLayout = (LinearLayout) rfeVar.b;
        linearLayout.getClass();
        this.e = rfeVar;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.d;
        krk krkVar = this.e;
        switch (i3) {
            case 0:
                Event event = (Event) obj;
                event.getClass();
                djf djfVar = (djf) krkVar;
                ImageView imageView = (ImageView) djfVar.d;
                SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
                as9.o(imageView, subTeam1 != null ? subTeam1.getId() : 0);
                ImageView imageView2 = (ImageView) djfVar.e;
                SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
                as9.o(imageView2, subTeam2 != null ? subTeam2.getId() : 0);
                ImageView imageView3 = (ImageView) djfVar.f;
                SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
                as9.o(imageView3, subTeam12 != null ? subTeam12.getId() : 0);
                ImageView imageView4 = (ImageView) djfVar.g;
                SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
                as9.o(imageView4, subTeam22 != null ? subTeam22.getId() : 0);
                d((bu1) djfVar.c, i, event);
                break;
            default:
                Event event2 = (Event) obj;
                event2.getClass();
                rfe rfeVar = (rfe) krkVar;
                as9.o((ImageView) rfeVar.d, Event.getHomeTeam$default(event2, null, 1, null).getId());
                as9.o((ImageView) rfeVar.e, Event.getAwayTeam$default(event2, null, 1, null).getId());
                d((bu1) rfeVar.c, i, event2);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iwg(djf djfVar, fvg fvgVar) {
        super(r0, fvgVar);
        fvgVar.getClass();
        LinearLayout linearLayout = (LinearLayout) djfVar.b;
        linearLayout.getClass();
        this.e = djfVar;
    }
}
