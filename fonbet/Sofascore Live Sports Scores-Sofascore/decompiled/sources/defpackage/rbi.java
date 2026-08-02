package defpackage;

import android.app.Application;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.StandingsFormEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrbi;", "Lq8;", "ibi", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class rbi extends q8 {
    public final w3b e;
    public final qxj f;
    public final g39 g;
    public final yzc h;
    public final lec i;
    public r9i j;
    public final LinkedHashMap k;
    public g9i l;
    public ibi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbi(Application application, w3b w3bVar, qxj qxjVar, g39 g39Var) {
        super(application);
        w3bVar.getClass();
        qxjVar.getClass();
        g39Var.getClass();
        this.e = w3bVar;
        this.f = qxjVar;
        this.g = g39Var;
        yzc yzcVar = new yzc();
        this.h = yzcVar;
        this.i = waa.w(yzcVar);
        this.j = new q9i(rv8.b);
        this.k = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r1.getHomeTeam().getId() == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r5 = "L";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r1.getAwayTeam().getId() == r8) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m(int i, List list) {
        int i2;
        List<StandingsFormEvent> H0;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                i2 = 2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (CollectionsKt.R(b.j(1, 2, 3), ((StandingsFormEvent) next).getWinnerCode())) {
                    arrayList.add(next);
                }
            }
            List L0 = CollectionsKt.L0(arrayList, 5);
            if (L0 != null && (H0 = CollectionsKt.H0(L0, new q6i(i2))) != null) {
                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                for (StandingsFormEvent standingsFormEvent : H0) {
                    Integer winnerCode = standingsFormEvent.getWinnerCode();
                    String str = "W";
                    if (winnerCode == null || winnerCode.intValue() != 1) {
                        if (winnerCode == null || winnerCode.intValue() != 2) {
                            str = "D";
                        }
                        if (str.equals("L") && Intrinsics.c(standingsFormEvent.getTournament().getCategory().getSport().getSlug(), Sports.ICE_HOCKEY) && ph0.a0(new Integer[]{110, 120}).contains(Integer.valueOf(standingsFormEvent.getStatus().getCode()))) {
                            str = "OTL";
                        }
                        arrayList2.add(str);
                    }
                }
                return arrayList2;
            }
        }
        return km5.a;
    }

    public static /* synthetic */ void t(rbi rbiVar, int i, int i2, String str, Integer num, int i3) {
        if ((i3 & 64) != 0) {
            num = null;
        }
        rbiVar.o(i, null, i2, str, null, null, num);
    }

    public final tsi k() {
        r9i r9iVar = this.j;
        if (r9iVar instanceof q9i) {
            return ((q9i) r9iVar).a;
        }
        if (r9iVar instanceof o9i) {
            return ((o9i) r9iVar).a;
        }
        if (r9iVar instanceof p9i) {
            return ((p9i) r9iVar).a;
        }
        zzl.b();
        return null;
    }

    public final rv8 l() {
        r9i r9iVar = this.j;
        if (r9iVar instanceof q9i) {
            return ((q9i) r9iVar).a;
        }
        if ((r9iVar instanceof o9i) || (r9iVar instanceof p9i)) {
            return rv8.b;
        }
        zzl.b();
        return null;
    }

    public final void n() {
        ibi ibiVar = this.m;
        if (ibiVar == null) {
            return;
        }
        xw3.L(un0.z(this), null, null, new h4i(this, ibiVar, (rq3) null, 6), 3);
    }

    public final void o(int i, Integer num, int i2, String str, Integer num2, Integer num3, Integer num4) {
        str.getClass();
        g9i g9iVar = this.l;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.l = xw3.L(un0.z(this), null, null, new pbi(this, num, i, i2, num2, str, num3, num4, null), 3);
    }

    public final void u(int i, int i2, String str, Integer num, Integer num2) {
        str.getClass();
        g9i g9iVar = this.l;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.l = xw3.L(un0.z(this), null, null, new qbi(this, i, i2, num, str, num2, null), 3);
    }
}
