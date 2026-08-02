package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import androidx.recyclerview.widget.l;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wq5 implements Activity.ScreenCaptureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivity b;

    public /* synthetic */ wq5(AbstractActivity abstractActivity, int i) {
        this.a = i;
        this.b = abstractActivity;
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        Menu menu;
        l adapter;
        Menu menu2;
        int i = this.a;
        AbstractActivity abstractActivity = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) abstractActivity;
                wxf wxfVar = EventActivity.h0;
                if (eventActivity.hasWindowFocus()) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = eventActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    if (sharedPreferences.getBoolean("PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", false) || (menu = eventActivity.R) == null || menu.findItem(R.id.share) == null || (adapter = eventActivity.R().k.getAdapter()) == null) {
                        return;
                    }
                    int ordinal = ((rd6[]) rd6.u.toArray(new rd6[0]))[(int) adapter.getItemId(eventActivity.R().k.getCurrentItem())].ordinal();
                    String str = ordinal != 0 ? ordinal != 9 ? ordinal != 13 ? ordinal != 18 ? "event_unknown_tab" : "cup_tree" : "event_statistics" : "event_lineups" : "event_details";
                    nv.z0(eventActivity, kv.IMPRESSION, "screenshot_popup", str);
                    zic.V(eventActivity, new ns4(10, eventActivity, str));
                    return;
                }
                return;
            default:
                LeagueActivity leagueActivity = (LeagueActivity) abstractActivity;
                a99 a99Var = LeagueActivity.h0;
                if (leagueActivity.hasWindowFocus()) {
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = leagueActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    if (sharedPreferences2.getBoolean("PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", false) || (menu2 = leagueActivity.d0) == null || menu2.findItem(R.id.share) == null || leagueActivity.S().l.getAdapter() == null) {
                        return;
                    }
                    nv.z0(leagueActivity, kv.IMPRESSION, "screenshot_popup", "cup_tree");
                    zic.V(leagueActivity, new faa(leagueActivity, 4));
                    return;
                }
                return;
        }
    }
}
