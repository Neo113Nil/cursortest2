package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c69 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r1 = true;
        r1 = true;
        r1 = true;
        r1 = true;
        r1 = true;
        boolean z = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 1:
                HandballPlayerEventStatistics handballPlayerEventStatistics = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics.getClass();
                break;
            case 2:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 3:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                if (Intrinsics.c(playerData.getPlayer().getPosition(), "G")) {
                    PlayerEventStatistics statistics = playerData.getStatistics();
                    if (!(statistics instanceof HandballPlayerEventStatistics)) {
                        statistics = null;
                    }
                    HandballPlayerEventStatistics handballPlayerEventStatistics2 = (HandballPlayerEventStatistics) statistics;
                    if (yid.m(handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGoals() : null) <= 0) {
                        if (yid.m(handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getAssists() : null) <= 0) {
                            if (yid.m(handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getSteals() : null) <= 0) {
                                if (yid.m(handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getBlockedShots() : null) <= 0) {
                                    if (yid.m(handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getTwoMinutePenalties() : null) <= 0) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                PlayerData playerData2 = (PlayerData) obj;
                playerData2.getClass();
                break;
            case 5:
                HandballPlayerEventStatistics handballPlayerEventStatistics3 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics3.getClass();
                break;
            case 6:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 7:
                HandballPlayerEventStatistics handballPlayerEventStatistics4 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics4.getClass();
                break;
            case 8:
                HandballPlayerEventStatistics handballPlayerEventStatistics5 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics5.getClass();
                Integer shotsTaken = handballPlayerEventStatistics5.getShotsTaken();
                break;
            case 9:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 10:
                HandballPlayerEventStatistics handballPlayerEventStatistics6 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics6.getClass();
                break;
            case 11:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 12:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 13:
                HandballPlayerEventStatistics handballPlayerEventStatistics7 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics7.getClass();
                break;
            case 14:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 15:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 16:
                HandballPlayerEventStatistics handballPlayerEventStatistics8 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics8.getClass();
                break;
            case 17:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 18:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 19:
                HandballPlayerEventStatistics handballPlayerEventStatistics9 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics9.getClass();
                break;
            case 20:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 21:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 22:
                ((HandballPlayerEventStatistics) obj).getClass();
                break;
            case 23:
                p0d p0dVar = (p0d) obj;
                e5f e5fVar = d99.c;
                Iterator it = p0dVar.a().entrySet().iterator();
                long j = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (j != 0) {
                            p0dVar.e(e5fVar, Long.valueOf(j));
                            break;
                        } else {
                            p0dVar.d(e5fVar);
                            break;
                        }
                    } else {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            e5f e5fVar2 = (e5f) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String b = d99.b(System.currentTimeMillis());
                            if (set.contains(b)) {
                                Object[] objArr7 = {b};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr7[0];
                                Objects.requireNonNull(obj2);
                                if (!hashSet.add(obj2)) {
                                    a70.p(mz1.m(obj2, "duplicate element: "));
                                    break;
                                } else {
                                    p0dVar.e(e5fVar2, Collections.unmodifiableSet(hashSet));
                                    j++;
                                }
                            } else {
                                p0dVar.d(e5fVar2);
                            }
                        }
                    }
                }
            case 24:
                HockeyShotmapItem hockeyShotmapItem = (HockeyShotmapItem) obj;
                hockeyShotmapItem.getClass();
                break;
            case 25:
                int intValue = ((Integer) obj).intValue();
                he9.f.getClass();
                break;
            case 26:
                he9 he9Var = (he9) obj;
                he9Var.getClass();
                break;
            case 27:
                rx2 rx2Var = (rx2) obj;
                rx2Var.getClass();
                kh9 kh9Var = (kh9) rx2Var.b;
                List B0 = CollectionsKt.B0(kh9Var.a);
                List B02 = CollectionsKt.B0(kh9Var.b);
                rx2Var.a(f7a.l, new nh9(kh9Var.c, objArr4 == true ? 1 : 0, i));
                rx2Var.a(it7.o, new tl((Object) B0, (rq3) (objArr3 == true ? 1 : 0), 11));
                rx2Var.a(ug5.d, new oh9(i, B02, objArr2 == true ? 1 : 0));
                rx2Var.a(wxf.h, new oh9(r1 ? 1 : 0, B02, objArr == true ? 1 : 0));
                break;
            case 28:
                vh9 vh9Var = (vh9) obj;
                vh9Var.getClass();
                bjb bjbVar = lu4.a;
                int i2 = 3;
                vh9Var.e.f(rj9.l, new bx(i2, (rq3) (objArr6 == true ? 1 : 0), 2));
                rj9 rj9Var = vh9Var.f;
                ihe iheVar = rj9.o;
                rj9Var.f(iheVar, new f61(vh9Var, null));
                rj9Var.f(iheVar, new bx(i2, (rq3) (objArr5 == true ? 1 : 0), i2));
                break;
            default:
                obj.getClass();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c69(int i) {
        this.a = i;
    }
}
