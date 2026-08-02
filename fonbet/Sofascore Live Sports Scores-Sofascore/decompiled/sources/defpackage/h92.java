package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.buzzer.BuzzerConfigResponse;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.buzzer.BuzzerTilesResponse;
import com.sofascore.model.buzzer.Race;
import com.sofascore.model.buzzer.TileReasonCount;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.RankingItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h92 extends hoi implements ct8 {
    public /* synthetic */ x2g r;
    public /* synthetic */ x2g s;
    public final /* synthetic */ i92 t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h92(i92 i92Var, boolean z, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = i92Var;
        this.u = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h92 h92Var = new h92(this.t, this.u, (rq3) obj3);
        h92Var.r = (x2g) obj;
        h92Var.s = (x2g) obj2;
        return h92Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        if (r8.getTopStatistics() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a0, code lost:
    
        if (r11 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b4, code lost:
    
        if (r8.getRating() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01bc, code lost:
    
        if (r8.getEvent() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01dc, code lost:
    
        if (r11.size() != 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fc, code lost:
    
        if (r11.size() != 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x031b, code lost:
    
        if (r1 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r8.getUniqueTournament() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r8.getTeamOfTheWeekRound() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r8.getUniqueTournament() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        if (r8.getEvent() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        if (r11 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012e, code lost:
    
        if (r8.getInterestingStatistic() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0128, code lost:
    
        if (r11.size() == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015c, code lost:
    
        if (r8.getUniqueTournament() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r8.getUniqueTournament() != null) goto L26;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        List split$default;
        List split$default2;
        Team team;
        Stage stage;
        List split$default3;
        Team team2;
        x2g x2gVar = this.r;
        x2g x2gVar2 = this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        if (!(x2gVar instanceof v2g) || !(x2gVar2 instanceof v2g)) {
            return km5.a;
        }
        Context context = this.t.a;
        List<APIBuzzerTile> buzzerTiles = ((BuzzerTilesResponse) ((v2g) x2gVar).a).getBuzzerTiles();
        v2g v2gVar = (v2g) x2gVar2;
        TileReasonCount tileReasonCount = ((BuzzerConfigResponse) v2gVar.a).getTileReasonCount();
        List list2 = y82.a;
        buzzerTiles.getClass();
        tileReasonCount.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<APIBuzzerTile> it = buzzerTiles.iterator();
        while (true) {
            int i = 0;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            r9 = false;
            boolean R = false;
            if (!it.hasNext()) {
                if (arrayList2.size() > 1) {
                    n13.u(new qe8(20), arrayList2);
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.L0(arrayList2, tileReasonCount.getTopFootballEventPlayerPerformance()));
                if (arrayList4.size() > 1) {
                    n13.u(new qe8(21), arrayList4);
                }
                if (arrayList3.size() > 1) {
                    n13.u(new qe8(18), arrayList3);
                }
                if (arrayList.size() > 1) {
                    n13.u(new qe8(19), arrayList);
                }
                arrayList.addAll(arrayList4);
                List<String> tileReasonList = tileReasonCount.getTileReasonList();
                tileReasonList.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (currentTimeMillis - sharedPreferences.getLong("PREF_BUZZER_TILE_ORDER_LAST_EDIT", 0L) > 3600000) {
                    n9e.u(context, new r41(a.d(tileReasonList), 1));
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = context.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.getClass();
                    edit.putLong("PREF_BUZZER_TILE_ORDER_LAST_EDIT", currentTimeMillis);
                    Unit unit = Unit.a;
                    edit.apply();
                }
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext3);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
                String string = sharedPreferences3.getString("PREF_BUZZER_TILE_ORDER", null);
                if (string != null) {
                    bga bgaVar = vga.a;
                    bgaVar.getClass();
                    list = (List) bgaVar.b(l98.W(new xg0(uhi.a, 0)), string);
                }
                list = km5.a;
                ArrayList arrayList5 = new ArrayList();
                for (String str : list) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) it2.next();
                        String reason = aPIBuzzerTile.getReason();
                        if (reason != null && reason.equals(str)) {
                            arrayList5.add(aPIBuzzerTile);
                            arrayList.remove(aPIBuzzerTile);
                        }
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) it3.next();
                    Integer position = aPIBuzzerTile2.getPosition();
                    if (position != null) {
                        int intValue = position.intValue();
                        if (intValue < arrayList5.size()) {
                            arrayList5.add(intValue, aPIBuzzerTile2);
                        } else {
                            arrayList5.add(aPIBuzzerTile2);
                        }
                    }
                }
                Integer tileDisplayLimit = ((BuzzerConfigResponse) v2gVar.a).getTileDisplayLimit();
                int intValue2 = tileDisplayLimit != null ? tileDisplayLimit.intValue() : 10;
                if (!this.u || arrayList5.size() <= intValue2) {
                    return arrayList5;
                }
                List c = a.c(new o82());
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    if (i < intValue2) {
                        arrayList6.add(next);
                    }
                    i = i2;
                }
                return CollectionsKt.w0(c, arrayList6);
            }
            APIBuzzerTile next2 = it.next();
            if (y82.a.contains(Integer.valueOf(next2.getType()))) {
                ia0 ia0Var = ia0.q;
                boolean C = mz1.C();
                List<Integer> invisibleOn = next2.getInvisibleOn();
                if (invisibleOn == null || !invisibleOn.contains(1)) {
                    int parseInt = Integer.parseInt(iii.H(6, "260720003"));
                    Integer androidMaxVersion = next2.getAndroidMaxVersion();
                    if (parseInt <= (androidMaxVersion != null ? androidMaxVersion.intValue() : Integer.MAX_VALUE)) {
                        switch (next2.getType()) {
                            case 1:
                                int action = next2.getAction();
                                j82[] j82VarArr = j82.a;
                                if (action == 12) {
                                    String actionValue = next2.getActionValue();
                                    if (actionValue != null) {
                                        split$default = StringsKt__StringsKt.split$default(actionValue, new String[]{"-"}, false, 0, 6, null);
                                        if (split$default != null) {
                                            break;
                                        }
                                    }
                                }
                                R = true;
                                break;
                            case 2:
                                int action2 = next2.getAction();
                                j82[] j82VarArr2 = j82.a;
                                if (action2 == 12) {
                                    String actionValue2 = next2.getActionValue();
                                    if (actionValue2 != null) {
                                        split$default2 = StringsKt__StringsKt.split$default(actionValue2, new String[]{"-"}, false, 0, 6, null);
                                        if (split$default2 != null) {
                                            break;
                                        }
                                    }
                                }
                                R = true;
                                break;
                            case 4:
                                if (next2.getPlayer() != null) {
                                    if (next2.getEvent() != null) {
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (CollectionsKt.R(y82.b, next2.getReason()) && next2.getRanking() != null) {
                                    RankingItem ranking = next2.getRanking();
                                    if (ranking != null) {
                                        team = ranking.getTeam();
                                        break;
                                    } else {
                                        team = null;
                                        break;
                                    }
                                }
                                break;
                            case 6:
                                if (next2.getPlayer() != null) {
                                    if (next2.getEvent() != null) {
                                        if (next2.isHome() != null) {
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 8:
                                if (next2.getNextCupRound() != null) {
                                    if (next2.getWinningTeam() != null) {
                                        break;
                                    }
                                }
                                break;
                            case 9:
                                List list3 = y82.c;
                                Race race = next2.getRace();
                                R = CollectionsKt.R(list3, (race == null || (stage = race.getStage()) == null) ? null : stage.getType());
                                break;
                            case 10:
                                String actionValue3 = next2.getActionValue();
                                if (actionValue3 != null) {
                                    split$default3 = StringsKt__StringsKt.split$default(actionValue3, new String[]{"-"}, false, 0, 6, null);
                                    if (next2.getEvent() != null) {
                                        if (next2.getPlayer() == null || split$default3.size() != 3) {
                                            if (next2.getTeam() != null) {
                                                Team team3 = next2.getTeam();
                                                if ((team3 != null ? team3.getCountry() : null) != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 11:
                                if (next2.getTransfer() != null) {
                                    Transfer transfer = next2.getTransfer();
                                    if ((transfer != null ? transfer.getPlayer() : null) != null) {
                                        Transfer transfer2 = next2.getTransfer();
                                        if (transfer2 != null) {
                                            team2 = transfer2.getTransferTo();
                                            break;
                                        } else {
                                            team2 = null;
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 16:
                                R = C;
                                break;
                            case 18:
                                R = true;
                                break;
                        }
                    }
                }
                if (R) {
                    if (next2.getPosition() != null) {
                        arrayList3.add(next2);
                    } else if (Intrinsics.c(next2.getReason(), BuzzerConfigResponseKt.TOP_FOOTBALL_EVENT_PLAYER_PERFORMANCE)) {
                        arrayList2.add(next2);
                    } else {
                        arrayList.add(next2);
                    }
                }
            }
        }
    }
}
