package defpackage;

import android.content.ContentValues;
import android.graphics.Bitmap;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wib implements e5e, foh, zzqp, zzyh, jr0, yb2, gg3, op3, m75, k2c, f7h, k9k {
    public static wib b;
    public static boolean g;
    public final /* synthetic */ int a;
    public static final wib c = new wib(2);
    public static final oqf d = new oqf(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final wib e = new wib(5);
    public static final wib f = new wib(6);
    public static final pvd h = new pvd(29);
    public static final wib i = new wib(7);
    public static final yhk j = new yhk();
    public static final wib k = new wib(9);
    public static final wib l = new wib(10);
    public static final wib m = new wib(11);
    public static final wib n = new wib(12);
    public static final wib o = new wib(13);
    public static final wib p = new wib(14);

    public /* synthetic */ wib(int i2) {
        this.a = i2;
    }

    public static LinkedHashMap g(List list, List list2) {
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                b0i b0iVar = (b0i) it2.next();
                if (((Boolean) b0iVar.h().invoke(playerData)).booleanValue()) {
                    Object obj = linkedHashMap.get(b0iVar);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(b0iVar, obj);
                    }
                    ((ArrayList) obj).add(playerData);
                }
            }
        }
        return linkedHashMap;
    }

    public static Integer h(String str) {
        if (str == null) {
            return null;
        }
        Integer p2 = f7a.p(str);
        if (p2 != null) {
            return p2;
        }
        switch (str.hashCode()) {
            case -1771213723:
                if (str.equals("gambling")) {
                    return Integer.valueOf(R.string.missing_reason_betting_violation);
                }
                return null;
            case -1488393759:
                if (str.equals("coach_decision")) {
                    return Integer.valueOf(R.string.missing_reason_coach_decision);
                }
                return null;
            case -977070902:
                if (str.equals("national_team")) {
                    return Integer.valueOf(R.string.missing_reason_international_duty);
                }
                return null;
            case -934427789:
                if (str.equals("rested")) {
                    return Integer.valueOf(R.string.injury_reason_rest);
                }
                return null;
            case -601990438:
                if (str.equals("fa_charge_of_improper_conduct")) {
                    return Integer.valueOf(R.string.suspension_improper_conduct);
                }
                return null;
            case 124564995:
                if (str.equals("suspended_after_video_review")) {
                    return Integer.valueOf(R.string.suspension_after_video_review);
                }
                return null;
            case 150987043:
                if (str.equals("personal_reason")) {
                    return Integer.valueOf(R.string.injury_reason_personal);
                }
                return null;
            case 424229267:
                if (str.equals("pending_transfer")) {
                    return Integer.valueOf(R.string.missing_reason_transfer_pending);
                }
                return null;
            case 861776197:
                if (str.equals("club_decision")) {
                    return Integer.valueOf(R.string.missing_reason_club_decision);
                }
                return null;
            case 907047907:
                if (str.equals("doping_violation")) {
                    return Integer.valueOf(R.string.suspension_doping_violation);
                }
                return null;
            case 1076415905:
                if (str.equals("police_investigation")) {
                    return Integer.valueOf(R.string.missing_reason_legal);
                }
                return null;
            default:
                return null;
        }
    }

    public static ArrayList j(List list, ArrayList arrayList) {
        ArrayList k2 = me4.k(list);
        for (Object obj : list) {
            e1 e1Var = (e1) obj;
            boolean z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Boolean) e1Var.m().invoke((PlayerEventStatistics) it.next())).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            if (Intrinsics.c(Boolean.valueOf(z), Boolean.TRUE)) {
                k2.add(obj);
            }
        }
        return k2;
    }

    public static int s(int i2) {
        if (i2 == 1 || i2 == 2) {
            return R.drawable.ic_cross;
        }
        if (i2 == 3 || i2 == 4) {
            return R.drawable.ic_suspended_16;
        }
        if (i2 == 21) {
            return R.drawable.ic_on_loan_16;
        }
        switch (i2) {
            case 11:
                return R.drawable.ic_card_yellows;
            case 12:
                return R.drawable.ic_yellow_double_16;
            case 13:
                return R.drawable.ic_card_red_16;
            default:
                return R.drawable.ic_suspended_16;
        }
    }

    public static int t(int i2, int i3, String str, String str2) {
        str.getClass();
        if (str.equals("doubtful")) {
            return R.string.injury_status_doubtful;
        }
        if (!str.equals("missing")) {
            return R.string.injury_status_out;
        }
        if (i2 == 4) {
            Integer h2 = h(str2);
            return h2 != null ? h2.intValue() : R.string.injury_status_out;
        }
        if (i2 == 1 || i2 == 2) {
            return R.string.player_injured;
        }
        if (i2 == 3) {
            return R.string.player_suspended;
        }
        if (i2 == 21) {
            return R.string.on_loan;
        }
        switch (i2) {
            case 11:
                return R.string.accumulated_yellow_cards;
            case 12:
                return R.string.suspension_2nd_yellow_red_card;
            case 13:
                return R.string.red_card;
            default:
                return i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList u(List list, LinkedHashMap linkedHashMap, boolean z, ArrayList arrayList) {
        Iterator it;
        k22 k22Var;
        Iterator it2;
        m22 m22Var;
        i22 i22Var;
        ArrayList k2 = me4.k(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            b0i b0iVar = (b0i) it3.next();
            ArrayList<PlayerData> arrayList2 = (ArrayList) linkedHashMap.get(b0iVar);
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    PlayerEventStatistics statistics = ((PlayerData) it4.next()).getStatistics();
                    if (statistics == null) {
                        statistics = null;
                    }
                    if (statistics != null) {
                        arrayList3.add(statistics);
                    }
                }
                ArrayList<e1> j2 = arrayList == null ? j(b0iVar.i(), arrayList3) : arrayList;
                if (!j2.isEmpty()) {
                    for (e1 e1Var : j2) {
                        if (!e1Var.i()) {
                            x12 x12Var = new x12(new q9k(e1Var.g()), new q9k(e1Var.l()), e1Var.j(), e1Var.k());
                            int i2 = 10;
                            ArrayList arrayList4 = new ArrayList(k13.r(j2, 10));
                            for (e1 e1Var2 : j2) {
                                e1Var2.getClass();
                                arrayList4.add(new x12(new q9k(e1Var2.g()), new q9k(e1Var2.l()), e1Var2.j(), e1Var2.k()));
                            }
                            m22 m22Var2 = new m22(b0iVar.d(), b0iVar.g() != 0 ? new q9k(b0iVar.g()) : new m9k(""), arrayList4, x12Var, x12Var, z, true);
                            ArrayList arrayList5 = new ArrayList();
                            for (PlayerData playerData : arrayList2) {
                                PlayerEventStatistics statistics2 = playerData.getStatistics();
                                if (statistics2 == null) {
                                    statistics2 = null;
                                }
                                if (statistics2 != null) {
                                    ArrayList arrayList6 = new ArrayList(k13.r(j2, i2));
                                    for (e1 e1Var3 : j2) {
                                        arrayList6.add(new y12(new q9k(e1Var3.g()), new q9k(e1Var3.l()), e1Var3.j(), e1Var3.k(), (String) e1Var3.d().invoke(statistics2), ((Number) e1Var3.h().invoke(statistics2)).doubleValue()));
                                        it3 = it3;
                                    }
                                    it2 = it3;
                                    Player player = playerData.getPlayer();
                                    String jerseyNumber = playerData.getJerseyNumber();
                                    BaseballAdditionalPlayerData baseballAllPositions = playerData.getBaseballAllPositions();
                                    List<BaseballRole> roles = baseballAllPositions != null ? baseballAllPositions.getRoles() : null;
                                    String position = playerData.getPosition();
                                    Boolean substitute = playerData.getSubstitute();
                                    Boolean captain = playerData.getCaptain();
                                    Boolean inPlay = playerData.getInPlay();
                                    PlayerEventStatistics statistics3 = playerData.getStatistics();
                                    x12 x12Var2 = x12Var;
                                    m22Var = m22Var2;
                                    i22Var = new i22(m22Var, player, jerseyNumber, roles, position, substitute, captain, inPlay, arrayList6, x12Var2, null, null, statistics3 != null ? statistics3.getRating() : null, playerData.getTeamId(), playerData.getEjected(), 64512);
                                    x12Var = x12Var2;
                                } else {
                                    it2 = it3;
                                    m22Var = m22Var2;
                                    i22Var = null;
                                }
                                if (i22Var != null) {
                                    arrayList5.add(i22Var);
                                }
                                m22Var2 = m22Var;
                                it3 = it2;
                                i2 = 10;
                            }
                            it = it3;
                            k22Var = new k22(m22Var2, arrayList5, null);
                            if (k22Var == null) {
                                k2.add(k22Var);
                            }
                            it3 = it;
                        }
                    }
                    ogj.m("Collection contains no element matching the predicate.");
                    return null;
                }
            }
            it = it3;
            k22Var = null;
            if (k22Var == null) {
            }
            it3 = it;
        }
        return k2;
    }

    public static boolean v(int i2) {
        return !b.j(11, 12, 13).contains(Integer.valueOf(i2));
    }

    @Override // defpackage.k2c
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.k2c
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.yb2
    public byte[] d(int i2, int i3, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i2 = mrg.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.hg3
    public int l(f7 f7Var, int i2, Object obj, int i3) {
        return f7Var.C();
    }

    @Override // defpackage.jr0
    public void m(dni dniVar) {
        dniVar.getClass();
        dniVar.E("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        dniVar.x0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    @Override // defpackage.f7h
    public boolean n(Object obj) {
        ((l3d) obj).getClass();
        return true;
    }

    @Override // defpackage.k2c
    public boolean next() {
        return false;
    }

    @Override // defpackage.f7h
    public int o(Object obj) {
        ((l3d) obj).getClass();
        return 5;
    }

    @Override // defpackage.foh
    public boolean q(Object obj, Object obj2) {
        return Intrinsics.c(obj, obj2);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.k9k
    public void c() {
    }

    @Override // defpackage.k9k
    public void k() {
    }

    @Override // defpackage.m75
    public void p() {
    }

    @Override // defpackage.e5e
    public int f(kx4 kx4Var, int i2) {
        return i2;
    }

    @Override // defpackage.m75
    public void r(dx1 dx1Var, Bitmap bitmap) {
    }
}
