package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.Uc;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sx0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sx0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                zd3 zd3Var = (zd3) obj2;
                ((px0) zd3Var.a).f(z);
                ((ox0) zd3Var.b).g(z);
                return new ux0((f7b) obj, zd3Var, r6);
            case 1:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte byteValue = b.byteValue();
                if (xz2.a.contains(b) || xz2.d.contains(b)) {
                    sb.append((char) byteValue);
                } else if (z && byteValue == 32) {
                    sb.append('+');
                } else {
                    sb.append(xz2.g(byteValue));
                }
                return Unit.a;
            case 2:
                MenuItem menuItem = ((FantasyWalkthroughCreateTeamFragment) obj2).u;
                if (menuItem != null) {
                    menuItem.setVisible(z);
                }
                return Unit.a;
            case 3:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) obj2;
                List list = (List) obj;
                list.getClass();
                leagueEventsFragment.D().A = z;
                leagueEventsFragment.D().X(list);
                if (leagueEventsFragment.v) {
                    leagueEventsFragment.E().f = true;
                    leagueEventsFragment.E().e = true;
                    leagueEventsFragment.v = false;
                    krk krkVar = leagueEventsFragment.l;
                    krkVar.getClass();
                    n layoutManager = ((po8) krkVar).h.getLayoutManager();
                    layoutManager.getClass();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    ArrayList arrayList = leagueEventsFragment.D().i;
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            y21 y21Var = next instanceof y21 ? (y21) next : null;
                            Event d = y21Var != null ? y21Var.d() : null;
                            if (!Intrinsics.c(d != null ? d.getStatusType() : null, StatusKt.STATUS_IN_PROGRESS)) {
                                if (!Intrinsics.c(d != null ? d.getStatusType() : null, StatusKt.STATUS_NOT_STARTED) || d.getStartTimestamp() < yaa.w()) {
                                    i2++;
                                }
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 > 4) {
                        r6 = i2 - 3;
                    } else if (i2 < 0) {
                        r6 = arrayList.size() - 1;
                    }
                    linearLayoutManager.scrollToPosition(r6);
                }
                return Unit.a;
            case 4:
                Context context = (Context) obj2;
                char charValue = ((Character) obj).charValue();
                String valueOf = z ? String.valueOf(charValue) : null;
                if (valueOf != null) {
                    return valueOf;
                }
                String valueOf2 = String.valueOf(charValue);
                int hashCode = valueOf2.hashCode();
                if (hashCode != 67) {
                    if (hashCode != 70) {
                        if (hashCode == 71 && valueOf2.equals("G")) {
                            String string = context.getString(R.string.basketball_guard);
                            string.getClass();
                            return string;
                        }
                    } else if (valueOf2.equals("F")) {
                        String string2 = context.getString(R.string.basketball_forward);
                        string2.getClass();
                        return string2;
                    }
                } else if (valueOf2.equals("C")) {
                    String string3 = context.getString(R.string.basketball_center);
                    string3.getClass();
                    return string3;
                }
                return String.valueOf(charValue);
            case 5:
                te3 te3Var = (te3) obj2;
                te3Var.G(z);
                return new ux0((f7b) obj, te3Var, 2);
            case 6:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putBoolean("PREF_" + ((bjf) obj2).name() + "_SHOW_QUICK_LINK", z);
                return Unit.a;
            case 7:
                String str = (String) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean(fc6.n("PREF_", str, "_MODAL", z ? "_nba" : ""), true));
            case 8:
                return Uc.a(z, (Uc) obj2, (InMobiNative) obj);
            default:
                e0n e0nVar = (e0n) obj2;
                uxm uxmVar = (uxm) obj;
                boolean z2 = e0n.n;
                uxmVar.getClass();
                ImageView imageView = uxmVar.l;
                ImageView imageView2 = uxmVar.u;
                Interpolator accelerateInterpolator = z ? new AccelerateInterpolator() : new DecelerateInterpolator();
                ProgressBar progressBar = uxmVar.w;
                progressBar.getClass();
                progressBar.setVisibility(z ? 0 : 8);
                if (z) {
                    imageView2.getClass();
                    imageView2.setVisibility(4);
                    imageView.getClass();
                    imageView.setVisibility(4);
                } else {
                    wpm wpmVar = e0nVar.j;
                    if (wpmVar.a) {
                        if (wpmVar.c) {
                            imageView.getClass();
                            evl.fadeInOrOut$default(imageView, true, 200L, accelerateInterpolator, null, 8, null);
                        } else {
                            imageView2.getClass();
                            evl.fadeInOrOut$default(imageView2, true, 200L, accelerateInterpolator, null, 8, null);
                        }
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ sx0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
