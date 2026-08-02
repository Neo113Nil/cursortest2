package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.ESportMap;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ld2 extends p8 {
    public final /* synthetic */ int c;
    public final bu1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ld2(bu1 bu1Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                frameLayout.getClass();
                super(frameLayout);
                this.d = bu1Var;
                break;
            default:
                FrameLayout frameLayout2 = (FrameLayout) bu1Var.c;
                frameLayout2.getClass();
                this.d = bu1Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        long startTimestamp;
        String name;
        int i3 = this.c;
        bu1 bu1Var = this.d;
        Context context = this.b;
        Integer num = null;
        num = null;
        switch (i3) {
            case 0:
                kq5 kq5Var = (kq5) obj;
                kq5Var.getClass();
                ImageView imageView = (ImageView) bu1Var.j;
                FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                as9.i(imageView, gg5.a);
                int color = context.getColor(R.color.on_color_primary);
                int color2 = context.getColor(R.color.on_color_secondary);
                v82 v82Var = (v82) bu1Var.k;
                TextView textView = (TextView) v82Var.e;
                z82 z82Var = (z82) v82Var.f;
                TextView textView2 = (TextView) z82Var.d;
                ESportsEvent eSportsEvent = kq5Var.a;
                Integer gameAdvantageTeamId = eSportsEvent.getGameAdvantageTeamId();
                textView2.setText((gameAdvantageTeamId != null && gameAdvantageTeamId.intValue() == Event.getHomeTeam$default(eSportsEvent, null, 1, null).getId()) ? "1" : "0");
                TextView textView3 = (TextView) z82Var.d;
                Integer valueOf = Integer.valueOf(color);
                Integer gameAdvantageTeamId2 = eSportsEvent.getGameAdvantageTeamId();
                int id = Event.getHomeTeam$default(eSportsEvent, null, 1, null).getId();
                if (gameAdvantageTeamId2 == null || gameAdvantageTeamId2.intValue() != id) {
                    valueOf = null;
                }
                textView3.setTextColor(valueOf != null ? valueOf.intValue() : color2);
                TextView textView4 = (TextView) z82Var.g;
                Integer gameAdvantageTeamId3 = eSportsEvent.getGameAdvantageTeamId();
                textView4.setText((gameAdvantageTeamId3 != null && gameAdvantageTeamId3.intValue() == Event.getHomeTeam$default(eSportsEvent, null, 1, null).getId()) ? "0" : "1");
                TextView textView5 = (TextView) z82Var.g;
                Integer valueOf2 = Integer.valueOf(color2);
                Integer gameAdvantageTeamId4 = eSportsEvent.getGameAdvantageTeamId();
                int id2 = Event.getHomeTeam$default(eSportsEvent, null, 1, null).getId();
                if (gameAdvantageTeamId4 != null && gameAdvantageTeamId4.intValue() == id2) {
                    num = valueOf2;
                }
                if (num != null) {
                    color = num.intValue();
                }
                textView5.setTextColor(color);
                ((TextView) z82Var.e).setTextColor(color2);
                ((View) z82Var.f).getBackground().setTint(0);
                ((LinearLayout) z82Var.c).getBackground().setTint(0);
                ((ImageView) bu1Var.d).setVisibility(8);
                textView.setText(context.getString(R.string.advantage));
                textView.setVisibility(0);
                frameLayout.getClass();
                sea.v(frameLayout, false, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), ao2.s(16, context));
                break;
            default:
                lq5 lq5Var = (lq5) obj;
                lq5Var.getClass();
                ESportsEvent eSportsEvent2 = lq5Var.c;
                EsportsGame esportsGame = lq5Var.b;
                Integer coverage = eSportsEvent2.getCoverage();
                int intValue = coverage != null ? coverage.intValue() : -1;
                ImageView imageView2 = (ImageView) bu1Var.d;
                ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
                FrameLayout frameLayout2 = (FrameLayout) bu1Var.c;
                ImageView imageView3 = (ImageView) bu1Var.j;
                Integer num2 = intValue > 90 ? null : 8;
                imageView2.setVisibility(num2 != null ? num2.intValue() : 0);
                ESportMap map = esportsGame.getMap();
                if (map != null) {
                    as9.i(imageView3, pco.F() + "map/" + map.getId() + "/image");
                } else {
                    as9.i(imageView3, gg5.a);
                }
                ESportMap map2 = esportsGame.getMap();
                if (map2 != null && (name = map2.getName()) != null) {
                    String str2 = eSportsEvent2.getTournament().getCategory().getId() == 1572 ? name : null;
                    if (str2 != null) {
                        str = "\n".concat(str2);
                        ((TextView) bu1Var.e).setText(context.getString(R.string.e_sport_game) + " " + lq5Var.a + str);
                        startTimestamp = esportsGame.getStartTimestamp();
                        TextView textView6 = (TextView) bu1Var.g;
                        if (startTimestamp <= 0) {
                            long startTimestamp2 = esportsGame.getStartTimestamp();
                            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                            bestPattern.getClass();
                            fn0.u(startTimestamp2, hk4.a(bestPattern), textView6);
                        } else {
                            textView6.setText("");
                        }
                        tol.x((v82) bu1Var.k, context, esportsGame, true, false);
                        frameLayout2.getClass();
                        sea.v(frameLayout2, false, lq5Var.d, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingEnd(), !lq5Var.d ? ao2.s(16, context) : ao2.s(4, context));
                        constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                        constraintLayout.setClipToOutline(true);
                        break;
                    }
                }
                str = "";
                ((TextView) bu1Var.e).setText(context.getString(R.string.e_sport_game) + " " + lq5Var.a + str);
                startTimestamp = esportsGame.getStartTimestamp();
                TextView textView62 = (TextView) bu1Var.g;
                if (startTimestamp <= 0) {
                }
                tol.x((v82) bu1Var.k, context, esportsGame, true, false);
                frameLayout2.getClass();
                sea.v(frameLayout2, false, lq5Var.d, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingEnd(), !lq5Var.d ? ao2.s(16, context) : ao2.s(4, context));
                constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                constraintLayout.setClipToOutline(true);
                break;
        }
    }
}
