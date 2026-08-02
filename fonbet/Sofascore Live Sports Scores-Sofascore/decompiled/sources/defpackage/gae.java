package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Partnership;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gae extends p8 {
    public final /* synthetic */ int c;
    public final j22 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gae(j22 j22Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = j22Var.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = j22Var;
                break;
            default:
                ConstraintLayout constraintLayout2 = j22Var.b;
                constraintLayout2.getClass();
                this.d = j22Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String valueOf;
        String valueOf2;
        int i3 = this.c;
        Context context = this.b;
        j22 j22Var = this.d;
        String str = "-";
        switch (i3) {
            case 0:
                fae faeVar = (fae) obj;
                faeVar.getClass();
                TextView textView = (TextView) j22Var.q;
                textView.setVisibility(0);
                textView.setText(String.valueOf(faeVar.a));
                TextView textView2 = (TextView) j22Var.p;
                Partnership partnership = faeVar.b;
                textView2.setText(tba.t(partnership.getPlayer1()) + " / " + tba.t(partnership.getPlayer2()));
                TextView textView3 = j22Var.d;
                Object score = partnership.getScore();
                if (score == null) {
                    score = "-";
                }
                textView3.setText(score.toString());
                TextView textView4 = j22Var.e;
                Integer balls = partnership.getBalls();
                if (balls != null && (valueOf = String.valueOf(balls.intValue())) != null) {
                    str = valueOf;
                }
                textView4.setText(str);
                tgj.m(j22Var, context, new b14());
                tgj.n(j22Var, faeVar.c);
                break;
            default:
                c6l c6lVar = (c6l) obj;
                c6lVar.getClass();
                TextView textView5 = (TextView) j22Var.p;
                Batsman batsman = c6lVar.b;
                String playerName = batsman.getPlayerName();
                if (playerName == null) {
                    playerName = tba.t(batsman.getPlayer());
                }
                textView5.setText(playerName);
                Integer fowScore = batsman.getFowScore();
                String g = fowScore != null ? fc6.g(fowScore.intValue(), c6lVar.a, "-") : null;
                TextView textView6 = j22Var.d;
                if (g == null) {
                    g = "-";
                }
                textView6.setText(g);
                TextView textView7 = j22Var.e;
                Double fowOver = batsman.getFowOver();
                if (fowOver != null && (valueOf2 = String.valueOf(fowOver.doubleValue())) != null) {
                    str = valueOf2;
                }
                textView7.setText(str);
                tgj.m(j22Var, context, new z04());
                tgj.n(j22Var, c6lVar.c);
                break;
        }
    }
}
