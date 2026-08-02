package defpackage;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xq5 implements ua0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xq5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ua0
    public final void a(AppBarLayout appBarLayout, int i) {
        ArrayList arrayList;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj;
                wxf wxfVar = EventActivity.h0;
                Fragment z = eventActivity.U().z(eventActivity.R().k.getCurrentItem());
                float totalScrollRange = appBarLayout.getTotalScrollRange() != 0 ? 1.0f - ((-i) / (appBarLayout.getTotalScrollRange() / 4.0f)) : 1.0f;
                AbstractFragment abstractFragment = z instanceof AbstractFragment ? (AbstractFragment) z : null;
                ArrayList arrayList2 = abstractFragment != null ? abstractFragment.j : null;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        eventActivity.Q((MenuItem) it.next(), totalScrollRange);
                    }
                    break;
                } else {
                    MenuItem menuItem = eventActivity.V;
                    if (menuItem != null) {
                        eventActivity.Q(menuItem, totalScrollRange);
                    }
                    MenuItem menuItem2 = eventActivity.X;
                    if (menuItem2 != null) {
                        eventActivity.Q(menuItem2, totalScrollRange);
                        break;
                    }
                }
                break;
            case 1:
                krk krkVar = ((EventBoxScoreFragment) obj).l;
                krkVar.getClass();
                ((a22) krkVar).g.setEnabled(i == 0);
                break;
            case 2:
                LeagueActivity leagueActivity = (LeagueActivity) obj;
                a99 a99Var = LeagueActivity.h0;
                Fragment z2 = leagueActivity.U().z(leagueActivity.S().l.getCurrentItem());
                float totalScrollRange2 = 1.0f - ((-i) / (appBarLayout.getTotalScrollRange() / 4.0f));
                int i3 = leagueActivity.T() > 0 ? 2 : 0;
                AbstractFragment abstractFragment2 = z2 instanceof AbstractFragment ? (AbstractFragment) z2 : null;
                if (abstractFragment2 != null && (arrayList = abstractFragment2.j) != null && arrayList.size() > i3) {
                    int size = arrayList.size() - i3;
                    for (int i4 = 0; i4 < size; i4++) {
                        MenuItem menuItem3 = (MenuItem) arrayList.get(i4);
                        Drawable icon = menuItem3.getIcon();
                        if (icon != null) {
                            icon.setAlpha((int) (255.0f * totalScrollRange2));
                        }
                        menuItem3.setVisible(totalScrollRange2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && menuItem3.isEnabled());
                    }
                    break;
                }
                break;
            case 3:
                MenuItem menuItem4 = ((MmaFighterActivity) obj).Q;
                if (menuItem4 != null) {
                    float totalScrollRange3 = 1.0f - ((-i) / (appBarLayout.getTotalScrollRange() / 4.0f));
                    Drawable icon2 = menuItem4.getIcon();
                    if (icon2 != null) {
                        icon2.setAlpha((int) (255.0f * totalScrollRange3));
                    }
                    menuItem4.setVisible(totalScrollRange3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
            case 4:
                krk krkVar2 = ((MmaFighterStatisticsFragment) obj).l;
                krkVar2.getClass();
                ((irc) krkVar2).c.setEnabled(i == 0);
                break;
            case 5:
                MenuItem menuItem5 = ((PlayerActivity) obj).W;
                if (menuItem5 != null) {
                    float totalScrollRange4 = 1.0f - ((-i) / (appBarLayout.getTotalScrollRange() / 4.0f));
                    Drawable icon3 = menuItem5.getIcon();
                    if (icon3 != null) {
                        icon3.setAlpha((int) (255.0f * totalScrollRange4));
                    }
                    menuItem5.setVisible(totalScrollRange4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
            default:
                TeamActivity teamActivity = (TeamActivity) obj;
                int i5 = TeamActivity.Z;
                float totalScrollRange5 = 1.0f - ((-i) / (appBarLayout.getTotalScrollRange() / 4.0f));
                int i6 = (int) (255.0f * totalScrollRange5);
                boolean z3 = totalScrollRange5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Menu menu = teamActivity.Q().i.getMenu();
                menu.getClass();
                int size2 = menu.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    MenuItem item = menu.getItem(i7);
                    item.getClass();
                    if (item.getItemId() != R.id.add_to_favorites && item.getItemId() != R.id.receive_notifications) {
                        Drawable icon4 = item.getIcon();
                        if (icon4 != null) {
                            icon4.setAlpha(i6);
                        }
                        item.setVisible(z3);
                    }
                }
                break;
        }
    }
}
