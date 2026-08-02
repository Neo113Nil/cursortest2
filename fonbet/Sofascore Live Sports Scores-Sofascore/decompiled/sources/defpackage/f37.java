package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class f37 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyLeagueActivity b;

    public /* synthetic */ f37(FantasyLeagueActivity fantasyLeagueActivity, int i) {
        this.a = i;
        this.b = fantasyLeagueActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (r1 == (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e0, code lost:
    
        r0 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
    
        r10.c(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e5, code lost:
    
        r0 = 0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        FantasyLeagueActivity fantasyLeagueActivity = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyLeagueActivity.N;
                kp5 kp5Var = k37.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : kp5Var) {
                    if (((Boolean) ((k37) obj).b.invoke(fantasyLeagueActivity.R().g, fantasyLeagueActivity.R().f)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                fantasyLeagueActivity.S().x(arrayList);
                Integer num = null;
                if (fantasyLeagueActivity.R().h) {
                    ViewPager2 viewPager2 = fantasyLeagueActivity.Q().i;
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            k37 k37Var = (k37) next;
                            int i4 = FantasyLeagueActivity.N;
                            k37Var.getClass();
                            if (!(k37Var == k37.d)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i3);
                    if (i3 == -1) {
                        valueOf = null;
                    }
                    viewPager2.c(valueOf != null ? valueOf.intValue() : 0, false);
                }
                if (!fantasyLeagueActivity.R().i) {
                    return;
                }
                ViewPager2 viewPager22 = fantasyLeagueActivity.Q().i;
                Iterator it2 = arrayList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        Object next2 = it2.next();
                        if (i5 < 0) {
                            b.q();
                            throw null;
                        }
                        k37 k37Var2 = (k37) next2;
                        int i6 = FantasyLeagueActivity.N;
                        k37Var2.getClass();
                        if (k37Var2 == k37.c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            default:
                int i7 = FantasyLeagueActivity.N;
                fantasyLeagueActivity.S().notifyDataSetChanged();
                return;
        }
    }
}
