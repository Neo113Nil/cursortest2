package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import com.sofascore.results.fantasy.league.settings.bottomsheet.invite.FantasyInviteToLeagueBottomSheet;
import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c5n {
    public static final tc3 a = new tc3(961218487, new qs2(21), false);
    public static final tc3 b = new tc3(-1730019532, new pr1(10), false);
    public static final dc4 c = new dc4();
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static boolean A(Context context) {
        SharedPreferences d2;
        context.getClass();
        if (D(context)) {
            return true;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        if (sharedPreferences.getBoolean("PREF_IS_IN_SUPPORTED_COUNTRY", false)) {
            return true;
        }
        ia0 ia0Var = ia0.q;
        return ok3.p().e().getFantasyUser();
    }

    public static i99 C() {
        return new i99(new g99(160, 100, 24), new h99(new int[]{R.color.heatmap_00, R.color.heatmap_10, R.color.heatmap_35, R.color.heatmap_80, R.color.heatmap_100}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f, 0.35f, 0.8f, 1.0f}, 0.8d, 6.0d), new k9(4, 14, 38));
    }

    public static boolean D(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getBoolean("FORCE_SHOW_FANTASY", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList F(Lineups lineups) {
        Object[] objArr;
        List<PlayerData> players = lineups.getPlayers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = players.iterator();
        while (true) {
            objArr = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            BaseballAdditionalPlayerData baseballAllPositions = ((PlayerData) next).getBaseballAllPositions();
            if (yid.m(baseballAllPositions != null ? baseballAllPositions.getBattingOrder() : null) == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PlayerData playerData = (PlayerData) it2.next();
            playerData.getClass();
            int id = playerData.getPlayer().getId();
            String C = tba.C(playerData.getPlayer());
            if (C == null) {
                C = tba.t(playerData.getPlayer());
            }
            arrayList2.add(new sk1(id, C, objArr == true ? 1 : 0, 28));
        }
        return arrayList2;
    }

    public static final ArrayList G(Lineups lineups) {
        List<PlayerData> players = lineups.getPlayers();
        ArrayList arrayList = new ArrayList(k13.r(players, 10));
        for (PlayerData playerData : players) {
            playerData.getClass();
            int id = playerData.getPlayer().getId();
            String C = tba.C(playerData.getPlayer());
            if (C == null) {
                C = tba.t(playerData.getPlayer());
            }
            arrayList.add(new sk1(id, C, null, 28));
        }
        return arrayList;
    }

    public static final List H(Lineups lineups, Context context) {
        List<MissingPlayerData> missingPlayers = lineups.getMissingPlayers();
        if (missingPlayers == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(missingPlayers, 10));
        for (MissingPlayerData missingPlayerData : missingPlayers) {
            missingPlayerData.getClass();
            String type = missingPlayerData.getType();
            type.getClass();
            int color = context.getColor(type.equals("missing") ? R.color.error : R.color.alert);
            int s = wib.s(missingPlayerData.getReason());
            int t = wib.t(missingPlayerData.getReason(), R.string.injury_status_out, missingPlayerData.getType(), missingPlayerData.getDescription());
            int id = missingPlayerData.getPlayer().getId();
            String C = tba.C(missingPlayerData.getPlayer());
            if (C == null) {
                C = tba.t(missingPlayerData.getPlayer());
            }
            arrayList.add(new sk1(id, Integer.valueOf(color), Integer.valueOf(s), C, context.getString(t)));
        }
        return arrayList;
    }

    public static final boolean I(rk5 rk5Var) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static je2 M(q89 q89Var) {
        int i;
        int i2;
        int i3;
        String str;
        q89 q89Var2 = q89Var;
        q89Var2.getClass();
        int size = q89Var2.size();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String j = vha.j(q89Var2, i4);
            String l = vha.l(q89Var2, i4);
            if (j.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = l;
                    i = 0;
                    while (i < l.length()) {
                        int length = l.length();
                        int i9 = i;
                        while (true) {
                            if (i9 >= length) {
                                i2 = size;
                                i9 = l.length();
                                break;
                            }
                            i2 = size;
                            if (StringsKt.K("=,;", l.charAt(i9))) {
                                break;
                            }
                            i9++;
                            size = i2;
                        }
                        String obj = StringsKt.l0(l.substring(i, i9)).toString();
                        if (i9 == l.length() || l.charAt(i9) == ',' || l.charAt(i9) == ';') {
                            i3 = i9 + 1;
                            str = null;
                        } else {
                            int i10 = i9 + 1;
                            byte[] bArr = wol.a;
                            int length2 = l.length();
                            while (true) {
                                if (i10 < length2) {
                                    char charAt = l.charAt(i10);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    i10 = l.length();
                                    break;
                                }
                            }
                            if (i10 >= l.length() || l.charAt(i10) != '\"') {
                                int length3 = l.length();
                                int i11 = i10;
                                while (true) {
                                    if (i11 >= length3) {
                                        i11 = l.length();
                                        break;
                                    }
                                    int i12 = length3;
                                    if (StringsKt.K(",;", l.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                    length3 = i12;
                                }
                                int i13 = i11;
                                str = StringsKt.l0(l.substring(i10, i11)).toString();
                                i3 = i13;
                            } else {
                                int i14 = i10 + 1;
                                int O = StringsKt.O(l, '\"', i14, 4);
                                str = l.substring(i14, O);
                                i3 = O + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i = i3;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i = i3;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i5 = wol.o(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i6 = wol.o(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i = i3;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i = i3;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i = i3;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i7 = wol.o(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i8 = wol.o(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i = i3;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i = i3;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i = i3;
                                z9 = true;
                            }
                            i = i3;
                        }
                        size = i2;
                    }
                    i4++;
                    q89Var2 = q89Var;
                    size = size;
                }
            } else if (!j.equalsIgnoreCase("Pragma")) {
                i4++;
                q89Var2 = q89Var;
                size = size;
            }
            z = false;
            i = 0;
            while (i < l.length()) {
            }
            i4++;
            q89Var2 = q89Var;
            size = size;
        }
        return new je2(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
    }

    public static final ArrayList N(List list, List list2, of3 of3Var, int i) {
        List list3;
        ArrayList arrayList;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new LinkedHashSet();
            av8Var.n0(O);
        }
        Set set = (Set) O;
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = new LinkedHashSet();
            av8Var.n0(O2);
        }
        Set set2 = (Set) O2;
        av8Var.d0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                List list4 = list2;
                arrayList.add(y((e7d) list.get(i2), list4, set, set2, av8Var, i & 112));
                i2++;
                list2 = list4;
            }
            list3 = list2;
        } else {
            list3 = list2;
            arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(y((e7d) it.next(), list3, set, set2, av8Var, i & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        av8Var.s(false);
        q(arrayList2, list3, set, set2, av8Var, i & 112);
        return arrayList2;
    }

    public static boolean O(Context context) {
        context.getClass();
        return D(context) || A(context);
    }

    public static final xtc P(vjj vjjVar, p5g p5gVar, boolean z, u5g u5gVar, Function0 function0) {
        if (p5gVar != null) {
            return new p0k(vjjVar, null, p5gVar, z, u5gVar, function0);
        }
        if (p5gVar == null) {
            return new p0k(vjjVar, null, null, z, u5gVar, function0);
        }
        return fqj.q(utc.a, new rw2(p5gVar, vjjVar, z, u5gVar, function0));
    }

    public static final void a(float f2, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i3;
        long j3;
        long j4;
        xtc xtcVar3;
        long j5;
        float f3;
        xtc xtcVar4;
        int i4;
        float f4;
        long D;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-922411044);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else if ((i & 6) == 0) {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? 4 : 2) | i;
        } else {
            xtcVar2 = xtcVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (av8Var.f(j3)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i8 = i3 | 24576;
        if (av8Var.T(i8 & 1, (i8 & 9363) != 9362)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                xtc xtcVar5 = i6 != 0 ? utc.a : xtcVar2;
                if ((i2 & 2) != 0) {
                    j3 = lz.D(R.color.primary_default, av8Var);
                    i8 &= -113;
                }
                xtcVar4 = xtcVar5;
                i4 = i8 & (-7169);
                f4 = i7 != 0 ? 16.0f : f2;
                D = lz.D(R.color.surface_1, av8Var);
            } else {
                av8Var.W();
                if ((i2 & 2) != 0) {
                    i8 &= -113;
                }
                i4 = i8 & (-7169);
                f4 = f2;
                D = j2;
                xtcVar4 = xtcVar2;
            }
            long j6 = j3;
            av8Var.t();
            b(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.drawable.ic_heart, (i4 & 112) | ((i4 << 3) & 7168) | (57344 & i4) | ((i4 << 15) & 458752), j6, D, av8Var, xtcVar4);
            f3 = f4;
            j5 = j6;
            j4 = D;
            xtcVar3 = xtcVar4;
        } else {
            av8Var.W();
            j4 = j2;
            xtcVar3 = xtcVar2;
            j5 = j3;
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f56(f3, i, i2, 0, j5, j4, xtcVar3);
        }
    }

    public static final void b(float f2, float f3, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1121559628);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.d(f2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new kwf(12, 15.0f);
                av8Var.n0(O);
            }
            kwf kwfVar = (kwf) O;
            int i4 = i3 << 3;
            kq9.b(s6a.N(i, (i4 & 112) | 6, av8Var), null, l98.b0(n9e.q(n9e.q(bkh.l(xtcVar, f2), lz.D(R.color.surface_1, av8Var), kwfVar), j, kwfVar), f3), j2, av8Var, (i4 & 7168) | 48, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new g56(i, j, j2, f2, f3, xtcVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(float f2, float f3, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        int i3;
        xtc xtcVar2;
        int i4;
        float f4;
        int i5;
        int i6;
        float f5;
        av8 av8Var;
        float f6;
        float f7;
        long j3;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-869174455);
        if ((i & 6) == 0) {
            i3 = (av8Var2.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f4 = f2;
                i3 |= av8Var2.d(f4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i5 = i3 | 3072;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i5 = i3 | 27648;
                } else if ((i & 24576) == 0) {
                    f5 = f3;
                    i5 |= av8Var2.d(f5) ? 16384 : 8192;
                    if (av8Var2.T(i5 & 1, (i5 & 9363) == 9362)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        f6 = f5;
                        f7 = f4;
                        j3 = j2;
                    } else {
                        xtc xtcVar3 = i7 != 0 ? utc.a : xtcVar2;
                        float f8 = i4 != 0 ? 16.0f : f4;
                        long j4 = r13.d;
                        if (i6 != 0) {
                            f5 = 2.0f;
                        }
                        float f9 = f5;
                        int i8 = i5 << 3;
                        av8Var = av8Var2;
                        b(f8, f9, R.drawable.ic_star_filled_16, (i8 & 7168) | (i8 & 112) | ((i5 >> 3) & 896) | (57344 & i5) | ((i5 << 12) & 458752), j, j4, av8Var, xtcVar3);
                        f7 = f8;
                        f6 = f9;
                        j3 = j4;
                        xtcVar2 = xtcVar3;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new g56(j, xtcVar2, f7, j3, f6, i, i2);
                        return;
                    }
                    return;
                }
                f5 = f3;
                if (av8Var2.T(i5 & 1, (i5 & 9363) == 9362)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            f4 = f2;
            i5 = i3 | 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            f5 = f3;
            if (av8Var2.T(i5 & 1, (i5 & 9363) == 9362)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        i5 = i3 | 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        f5 = f3;
        if (av8Var2.T(i5 & 1, (i5 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void d(FantasyRemoteAnnouncement fantasyRemoteAnnouncement, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        fantasyRemoteAnnouncement.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(365504658);
        int i4 = (av8Var.g(fantasyRemoteAnnouncement) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            String language = ((Configuration) av8Var.k(nz.a)).getLocales().get(0).getLanguage();
            language.getClass();
            String translatedMessage = fantasyRemoteAnnouncement.getTranslatedMessage(language);
            int i5 = sn6.a[fantasyRemoteAnnouncement.getSeverity().ordinal()];
            if (i5 == 1) {
                i2 = -937331173;
                i3 = R.color.n_lv_1;
            } else if (i5 == 2) {
                i2 = -937329156;
                i3 = R.color.alert;
            } else {
                if (i5 != 3) {
                    throw dmi.h(av8Var, -937333552, false);
                }
                i2 = -937327172;
                i3 = R.color.error;
            }
            long f2 = ljg.f(av8Var, i2, i3, av8Var, false);
            lv1 lv1Var = uxf.m;
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), f2, o7g.a(16.0f)), 16.0f, 4.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            kq9.b(s6a.N(R.drawable.ic_warning, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.surface_1, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            yf8 yf8Var = xth.a;
            udj.c(translatedMessage, null, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var, 0, 384, 126970);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(fantasyRemoteAnnouncement, xtcVar, i, 19);
        }
    }

    public static final void e(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function1 function1, xtc xtcVar, boolean z4, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        utc utcVar;
        e1d e1dVar;
        kv1 kv1Var;
        f50 f50Var;
        f50 f50Var2;
        ry ryVar;
        boolean z5;
        int i2;
        Function1 function12 = function1;
        kv1 kv1Var2 = uxf.q;
        str.getClass();
        function0.getClass();
        function02.getClass();
        function12.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-756539609);
        int i3 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.h(z2) ? 256 : 128) | (av8Var2.h(z3) ? a.o : 1024) | (av8Var2.i(function0) ? 16384 : 8192) | (av8Var2.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912 | (av8Var2.h(z4) ? 67108864 : 33554432);
        if (av8Var2.T(i3 & 1, (38347923 & i3) != 38347922)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(str);
                av8Var2.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.valueOf(z4));
                av8Var2.n0(O2);
            }
            e1d e1dVar3 = (e1d) O2;
            Boolean valueOf = Boolean.valueOf(z2);
            boolean z6 = (i3 & 896) == 256;
            Object O3 = av8Var2.O();
            boolean z7 = z6;
            rq3 rq3Var = null;
            if (z7 || O3 == a99Var) {
                O3 = new hw6(z2, e1dVar3, rq3Var, 0);
                av8Var2.n0(O3);
            }
            hz8.o(av8Var2, valueOf, (Function2) O3);
            boolean z8 = z || !((Boolean) e1dVar3.getValue()).booleanValue();
            boolean z9 = z8 && !str.equals((String) e1dVar2.getValue()) && !StringsKt.R((String) e1dVar2.getValue()) && ((String) e1dVar2.getValue()).length() <= 30;
            utc utcVar2 = utc.a;
            boolean z10 = z8;
            xtc b0 = l98.b0(n9e.q(wnn.A(l98.d0(tol.o(bkh.d(ml4.Y(utcVar2), 1.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var2), oyn.e), 16.0f);
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var2, a2, f50Var3);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var2, valueOf2, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var2, C, f50Var5);
            String v = oea.v(R.string.fantasy_edit_team_name, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var2, 0, 24960, 110586);
            nq8.h(av8Var2, bkh.e(utcVar2, 16.0f));
            String str2 = (String) e1dVar2.getValue();
            String v2 = oea.v(R.string.new_name, av8Var2);
            t28 C2 = r4a.C(30);
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = new fw6(0, e1dVar2);
                av8Var2.n0(O4);
            }
            q5a.r(str2, null, null, (Function1) O4, null, null, null, v2, null, null, null, false, C2, 0L, 0, 0, null, 0L, 0L, 0, z10, false, false, av8Var2, 3072, 384, 0, 14675830);
            av8 av8Var3 = av8Var2;
            if (((Boolean) e1dVar3.getValue()).booleanValue()) {
                bf3.r(16.0f, 279332140, av8Var3, av8Var3, utcVar2);
                kv1 kv1Var3 = uxf.p;
                xtc h = ljg.h(8.0f, bkh.d(utcVar2, 1.0f), lz.D(R.color.primary_default, av8Var3), 16.0f);
                u23 a3 = t23.a(p4hVar, kv1Var3, av8Var3, 48);
                int hashCode2 = Long.hashCode(av8Var3.T);
                aee m2 = av8Var3.m();
                xtc C3 = fqj.C(av8Var3, h);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a3, f50Var3);
                waa.K(av8Var3, m2, ff3Var);
                f50Var2 = f50Var4;
                bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar2);
                waa.K(av8Var3, C3, f50Var5);
                udj.c(oea.v(R.string.fantasy_watch_ad_make_changes, av8Var3), null, lz.D(R.color.on_color_primary, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var3, 0, 0, 130042);
                udj.c(bf3.g(8.0f, R.string.fantasy_watch_ad_make_changes_body_text, av8Var3, av8Var3, utcVar2), null, lz.D(R.color.on_color_primary, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 0, 0, 130042);
                nq8.h(av8Var3, bkh.e(utcVar2, 16.0f));
                k1c c2 = e12.c(uxf.c, false);
                int hashCode3 = Long.hashCode(av8Var3.T);
                aee m3 = av8Var3.m();
                xtc C4 = fqj.C(av8Var3, utcVar2);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, c2, f50Var3);
                waa.K(av8Var3, m3, ff3Var);
                bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar2);
                waa.K(av8Var3, C4, f50Var5);
                xtc x = gz8.x(utcVar2, null, null, 3);
                kv1Var = kv1Var2;
                e1dVar = e1dVar2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                mha.h(oea.v(z ? R.string.button_ad_watched : R.string.button_watch_ad, av8Var3), function02, x, uqh.a, new bqh(s6a.N(z ? R.drawable.ic_tv_channel_checkmark : R.drawable.ic_ad_play_small, 6, av8Var3), kv1Var), false, (z2 || z) ? false : true, false, 0L, 0, 0, av8Var3, ((i3 >> 12) & 112) | 3072, 0, 1952);
                av8Var3 = av8Var3;
                av8Var3.d0(1788568136);
                xtc b2 = n12.a.b(utcVar2);
                if (z) {
                    Object O5 = av8Var3.O();
                    if (O5 == a99Var) {
                        i2 = 9;
                        O5 = new au6(i2);
                        av8Var3.n0(O5);
                    } else {
                        i2 = 9;
                    }
                    xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O5, av8Var3, 30);
                    utcVar = utcVar2;
                    av8Var3 = av8Var3;
                    b2 = b2.z(y);
                } else {
                    utcVar = utcVar2;
                }
                z5 = false;
                av8Var3.s(false);
                nq8.h(av8Var3, b2);
                av8Var3.s(true);
                av8Var3.s(true);
                av8Var3.s(false);
            } else {
                utcVar = utcVar2;
                e1dVar = e1dVar2;
                kv1Var = kv1Var2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                ryVar = ryVar2;
                z5 = false;
                av8Var3.d0(281416549);
                av8Var3.s(false);
            }
            nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
            we9 we9Var = new we9(kv1Var);
            l8g a4 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var3, 6);
            int hashCode4 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C5 = fqj.C(av8Var3, we9Var);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var3);
            waa.K(av8Var3, m4, ff3Var);
            bf3.s(hashCode4, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C5, f50Var);
            xtcVar2 = utcVar;
            av8 av8Var4 = av8Var3;
            mha.h(oea.v(R.string.cancel, av8Var3), function0, null, gqh.a, null, false, false, false, 0L, 0, 0, av8Var4, ((i3 >> 9) & 112) | 3072, 0, 2036);
            String v3 = oea.v(R.string.save, av8Var4);
            boolean z11 = (i3 & 3670016) == 1048576 ? true : z5;
            Object O6 = av8Var4.O();
            if (z11 || O6 == a99Var) {
                function12 = function1;
                O6 = new s91(function12, e1dVar, 3);
                av8Var4.n0(O6);
            } else {
                function12 = function1;
            }
            mha.h(v3, (Function0) O6, null, null, null, z9, z3, false, 0L, 0, 0, av8Var4, (i3 << 9) & 3670016, 0, 1948);
            av8Var = av8Var4;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gw6(str, z, z2, z3, function0, function02, function12, xtcVar2, z4, i);
        }
    }

    public static final void f(j67 j67Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1086518411);
        int i2 = 2;
        int i3 = (av8Var.g(j67Var) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            g28 g28Var = bkh.c;
            t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 48.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new w47(i2, j67Var, function1);
                av8Var.n0(O);
            }
            v8a.a(g28Var, null, t3eVar, ng0Var, null, null, false, null, (Function1) O, av8Var, 24582, 490);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(j67Var, function1, i, 7);
        }
    }

    public static final void g(final r57 r57Var, j37 j37Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1315628900);
        int i2 = (av8Var.i(r57Var) ? 4 : 2) | i | (av8Var.i(j37Var) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(j37Var.k, av8Var, 0);
            nn2 nn2Var = r57Var.g;
            boolean i5 = av8Var.i(context) | av8Var.i(r57Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new Function1() { // from class: p57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        rq3 rq3Var = null;
                        switch (i4) {
                            case 0:
                                l57 l57Var = (l57) obj;
                                l57Var.getClass();
                                if (!l57Var.equals(l57.a)) {
                                    zzl.b();
                                    break;
                                } else {
                                    FragmentActivity O2 = hkg.O(context);
                                    if (O2 != null) {
                                        Intent intent = new Intent();
                                        intent.putExtra("FANTASY_LEAGUE_ID_EXTRA", r57Var.d.a);
                                        Unit unit = Unit.a;
                                        z8e.C(O2, 111, intent);
                                    }
                                    break;
                                }
                            default:
                                r57 r57Var2 = r57Var;
                                j67 j67Var = r57Var2.d;
                                ev6 ev6Var = r57Var2.c;
                                k57 k57Var = (k57) obj;
                                k57Var.getClass();
                                boolean equals = k57Var.equals(g57.a);
                                Context context2 = context;
                                if (!equals) {
                                    int i6 = 3;
                                    if (!(k57Var instanceof h57)) {
                                        if (!k57Var.equals(i57.a)) {
                                            if (!k57Var.equals(j57.a)) {
                                                zzl.b();
                                                break;
                                            } else {
                                                FragmentActivity O3 = hkg.O(context2);
                                                if (O3 != null) {
                                                    int i7 = ev6Var.c;
                                                    FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = new FantasyLeagueTeamsFullScreenDialog();
                                                    fantasyLeagueTeamsFullScreenDialog.setArguments(fz8.C(fz8.G("FANTASY_LEAGUE_EXTRA", j67Var), fz8.D(i7, "competitionId")));
                                                    fantasyLeagueTeamsFullScreenDialog.p(O3.k(), "TeamsModal");
                                                }
                                            }
                                        } else {
                                            FragmentActivity O4 = hkg.O(context2);
                                            if (O4 != null) {
                                                FantasyInviteToLeagueBottomSheet fantasyInviteToLeagueBottomSheet = new FantasyInviteToLeagueBottomSheet();
                                                fantasyInviteToLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var), fz8.G("FANTASY_LEAGUE_EXTRA", j67Var)));
                                                AppCompatActivity appCompatActivity = O4 instanceof AppCompatActivity ? (AppCompatActivity) O4 : null;
                                                if (appCompatActivity != null) {
                                                    wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyInviteToLeagueBottomSheet, appCompatActivity, rq3Var, i6));
                                                }
                                            }
                                        }
                                    } else {
                                        FragmentActivity O5 = hkg.O(context2);
                                        if (O5 != null) {
                                            boolean z = ((h57) k57Var).a;
                                            FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = new FantasyEditLeagueBottomSheet();
                                            fantasyEditLeagueBottomSheet.setArguments(fz8.C(fz8.J("FANTASY_FOCUS_ON_DESCRIPTION_EXTRA", z)));
                                            AppCompatActivity appCompatActivity2 = O5 instanceof AppCompatActivity ? (AppCompatActivity) O5 : null;
                                            if (appCompatActivity2 != null) {
                                                wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyEditLeagueBottomSheet, appCompatActivity2, rq3Var, i6));
                                            }
                                        }
                                    }
                                } else {
                                    zic.P(context2, R.string.fantasy_delete_this_league_title, R.string.fantasy_delete_this_league_text, R.string.delete, new av6(0, r57Var2, r57.class, "deleteLeague", "deleteLeague()V", 0, 10), 32);
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O);
            }
            w1a.c(nn2Var, null, (Function1) O, av8Var, 0, 14);
            k53.N(((q57) ((eoh) r57Var.e).getValue()).a, null, av8Var, 0);
            j67 j67Var = (j67) x.getValue();
            boolean i6 = av8Var.i(context) | av8Var.i(r57Var);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new Function1() { // from class: p57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        rq3 rq3Var = null;
                        switch (i3) {
                            case 0:
                                l57 l57Var = (l57) obj;
                                l57Var.getClass();
                                if (!l57Var.equals(l57.a)) {
                                    zzl.b();
                                    break;
                                } else {
                                    FragmentActivity O22 = hkg.O(context);
                                    if (O22 != null) {
                                        Intent intent = new Intent();
                                        intent.putExtra("FANTASY_LEAGUE_ID_EXTRA", r57Var.d.a);
                                        Unit unit = Unit.a;
                                        z8e.C(O22, 111, intent);
                                    }
                                    break;
                                }
                            default:
                                r57 r57Var2 = r57Var;
                                j67 j67Var2 = r57Var2.d;
                                ev6 ev6Var = r57Var2.c;
                                k57 k57Var = (k57) obj;
                                k57Var.getClass();
                                boolean equals = k57Var.equals(g57.a);
                                Context context2 = context;
                                if (!equals) {
                                    int i62 = 3;
                                    if (!(k57Var instanceof h57)) {
                                        if (!k57Var.equals(i57.a)) {
                                            if (!k57Var.equals(j57.a)) {
                                                zzl.b();
                                                break;
                                            } else {
                                                FragmentActivity O3 = hkg.O(context2);
                                                if (O3 != null) {
                                                    int i7 = ev6Var.c;
                                                    FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = new FantasyLeagueTeamsFullScreenDialog();
                                                    fantasyLeagueTeamsFullScreenDialog.setArguments(fz8.C(fz8.G("FANTASY_LEAGUE_EXTRA", j67Var2), fz8.D(i7, "competitionId")));
                                                    fantasyLeagueTeamsFullScreenDialog.p(O3.k(), "TeamsModal");
                                                }
                                            }
                                        } else {
                                            FragmentActivity O4 = hkg.O(context2);
                                            if (O4 != null) {
                                                FantasyInviteToLeagueBottomSheet fantasyInviteToLeagueBottomSheet = new FantasyInviteToLeagueBottomSheet();
                                                fantasyInviteToLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var), fz8.G("FANTASY_LEAGUE_EXTRA", j67Var2)));
                                                AppCompatActivity appCompatActivity = O4 instanceof AppCompatActivity ? (AppCompatActivity) O4 : null;
                                                if (appCompatActivity != null) {
                                                    wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyInviteToLeagueBottomSheet, appCompatActivity, rq3Var, i62));
                                                }
                                            }
                                        }
                                    } else {
                                        FragmentActivity O5 = hkg.O(context2);
                                        if (O5 != null) {
                                            boolean z = ((h57) k57Var).a;
                                            FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = new FantasyEditLeagueBottomSheet();
                                            fantasyEditLeagueBottomSheet.setArguments(fz8.C(fz8.J("FANTASY_FOCUS_ON_DESCRIPTION_EXTRA", z)));
                                            AppCompatActivity appCompatActivity2 = O5 instanceof AppCompatActivity ? (AppCompatActivity) O5 : null;
                                            if (appCompatActivity2 != null) {
                                                wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyEditLeagueBottomSheet, appCompatActivity2, rq3Var, i62));
                                            }
                                        }
                                    }
                                } else {
                                    zic.P(context2, R.string.fantasy_delete_this_league_title, R.string.fantasy_delete_this_league_text, R.string.delete, new av6(0, r57Var2, r57.class, "deleteLeague", "deleteLeague()V", 0, 10), 32);
                                }
                                break;
                        }
                        return null;
                    }
                };
                av8Var.n0(O2);
            }
            f(j67Var, (Function1) O2, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(r57Var, j37Var, i, 6);
        }
    }

    public static final void h(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(731990628);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(wnn.A(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f, 48.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            v7a.e(xd5.e(wb7.n), b.j(oea.v(R.string.fantasy_loading_animation_scanning_team, av8Var), oea.v(R.string.fantasy_loading_animation_picking_players, av8Var), oea.v(R.string.fantasy_loading_animation_team_set, av8Var)), null, av8Var, 0, 4);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 9);
        }
    }

    public static final void i(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2095707882);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.e(bkh.p(utcVar, 28.0f), 38.0f), lz.D(R.color.surface_2, av8Var), o7g.a(4.0f));
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_tv_channel_x_16, 6, av8Var), null, bkh.l(utcVar, 20.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            e12.a(0, av8Var, n9e.q(bkh.p(bkh.e(utcVar, 6.0f), 20.0f), lz.D(R.color.n_lv_3, av8Var), o7g.a(4.0f)));
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 17);
        }
    }

    public static final void j(tx6 tx6Var, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1382321275);
        int i2 = (av8Var.g(tx6Var) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            n7g a2 = o7g.a(4.0f);
            long D = lz.D(R.color.surface_2, av8Var);
            utc utcVar = utc.a;
            xtc q = n9e.q(utcVar, D, a2);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(1594102810);
            for (ux6 ux6Var : tx6Var.a) {
                l(ux6Var.b, ux6Var.a, ux6Var.c, null, false, av8Var, 0, 24);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(tx6Var, xtcVar, i, 23);
        }
    }

    public static final void k(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(395040100);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.e(bkh.p(utcVar, 28.0f), 38.0f), lz.D(R.color.surface_2, av8Var), o7g.a(4.0f));
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_more_horiz, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(int i, int i2, o68 o68Var, xtc xtcVar, boolean z, of3 of3Var, int i3, int i4) {
        boolean z2;
        xtc xtcVar2;
        boolean z3;
        eqf u;
        long f2;
        int i5;
        float f3;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(825709401);
        int i6 = (av8Var.e(i) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(o68Var == null ? -1 : o68Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i7 = i6 | 3072;
        int i8 = i4 & 16;
        if (i8 != 0) {
            i7 = i6 | 27648;
        } else if ((i3 & 24576) == 0) {
            z2 = z;
            i7 |= av8Var.h(z2) ? 16384 : 8192;
            if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z3 = z2;
            } else {
                if (i8 != 0) {
                    z2 = false;
                }
                Context context = (Context) av8Var.k(nz.b);
                if (o68Var != null) {
                    av8Var.d0(-1062206956);
                    f2 = lz.D(o68Var.a, av8Var);
                    av8Var.s(false);
                } else {
                    f2 = ljg.f(av8Var, -1062205908, R.color.neutral_default, av8Var, false);
                }
                av8Var.d0(-1062203461);
                utc utcVar = utc.a;
                if (z2) {
                    f3 = 4.0f;
                    i5 = i7;
                    xtcVar3 = n9e.q(utcVar, lz.D(R.color.surface_2, av8Var), o7g.a(4.0f));
                } else {
                    i5 = i7;
                    f3 = 4.0f;
                    xtcVar3 = utcVar;
                }
                av8Var.s(false);
                xtc A = wnn.A(xtcVar3, o7g.a(f3));
                boolean i9 = av8Var.i(context) | ((i5 & 112) == 32);
                Object O = av8Var.O();
                if (i9 || O == nf3.a) {
                    O = new xi7(context, i2, 2);
                    av8Var.n0(O);
                }
                long j = f2;
                boolean z4 = z2;
                float f4 = f3;
                xtc b0 = l98.b0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), f4);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                td4.u(i, (i5 & 14) | 48, av8Var, bkh.l(utcVar, 20.0f));
                nq8.h(av8Var, bkh.e(utcVar, f4));
                e12.a(0, av8Var, n9e.q(bkh.p(bkh.e(utcVar, 6.0f), 20.0f), j, o7g.a(f4)));
                av8Var.s(true);
                z3 = z4;
                xtcVar2 = utcVar;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new qz0(i, i2, o68Var, xtcVar2, z3, i3, i4);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void m(tl8 tl8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1999813719);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(tl8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 0;
        int i6 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i7 = tl8Var.g;
            x43 x43Var = tl8Var.t;
            String str = tl8Var.h;
            String str2 = tl8Var.i;
            boolean z = tl8Var.e;
            tc3 H = yqo.H(1656904131, av8Var2, new pl8(tl8Var, i5));
            tc3 H2 = yqo.H(-1216337975, av8Var2, new pl8(tl8Var, i6));
            tc3 H3 = yqo.H(1148127495, av8Var2, new pl8(tl8Var, i4));
            int i8 = i2 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(tl8Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i9 || O == a99Var) {
                tc3Var = H3;
                i3 = 0;
                O = new ql8(function1, tl8Var, i3);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i8 == 32) {
                i3 = 1;
            }
            int i10 = i3 | (av8Var2.i(tl8Var) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i10 != 0 || O2 == a99Var) {
                O2 = new ql8(function1, tl8Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, (i2 << 15) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rl8(tl8Var, function1, xtcVar, i, 0);
        }
    }

    public static final void n(dt9 dt9Var, vy8 vy8Var, int i, t13 t13Var, of3 of3Var, int i2, int i3) {
        int i4;
        int i5;
        t13 t13Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(491792371);
        int i6 = (av8Var.g(dt9Var) ? 4 : 2) | i2 | (av8Var.g(vy8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i7 = i6 | 3072;
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = i6 | 27648;
        } else {
            int i9 = 32768 & i2;
            i4 = (av8Var.g(t13Var) ? 16384 : 8192) | i7;
        }
        if ((i4 & 9363) == 9362 && av8Var.D()) {
            av8Var.W();
            i5 = i;
            t13Var2 = t13Var;
        } else {
            t13 t13Var3 = i8 != 0 ? null : t13Var;
            av8Var.e0(135631275);
            av8Var.s(false);
            ps9 ps9Var = ps9.b;
            av8Var.e0(-1115894518);
            av8Var.e0(1886828752);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            i5 = 1;
            if (av8Var.S) {
                av8Var.l(new gj0(1, ps9Var));
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, dt9Var, ff3.l);
            waa.K(av8Var, vy8Var, ff3.m);
            waa.K(av8Var, new np3(), ff3.n);
            waa.K(av8Var, t13Var3, ff3.o);
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
            t13Var2 = t13Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qs9(dt9Var, vy8Var, i5, t13Var2, i2, i3);
        }
    }

    public static final void o(boolean z, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1096296988);
        int i2 = 2;
        int i3 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.i(function0) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.i(function03) ? a.o : 1024;
        }
        int i4 = i3 | 24576;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Unit unit = Unit.a;
            Object O2 = av8Var.O();
            rq3 rq3Var = null;
            if (O2 == a99Var) {
                O2 = new nj5(e1dVar, rq3Var, i2);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, unit, (Function2) O2);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            jq7.a(0, av8Var, null);
            g28 g28Var = bkh.c;
            xtc u0 = hkg.u0(g28Var, hkg.o0(av8Var), false, 14);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kv1 kv1Var2 = uxf.p;
            x23 x23Var = x23.a;
            xtc d0 = l98.d0(l98.f0(x23Var.a(1.0f, utcVar, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var2, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String v = oea.v(R.string.fantasy_welcome_screen_title, av8Var);
            yf8 yf8Var = xth.a;
            utc utcVar2 = utcVar;
            udj.c(v, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.h(), av8Var, 48, 24960, 110584);
            udj.c(bf3.g(32.0f, R.string.fantasy_welcome_screen_body, av8Var, av8Var, utcVar2), bkh.d(utcVar2, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.i(), av8Var, 48, 384, 126968);
            xtc a4 = x23Var.a(1.0f, l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), true);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, a4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            nq8.h(av8Var, x23Var.a(1.0f, utcVar2, true));
            kq9.b(s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), null, bkh.k(g28Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 160.0f, 160.0f, 3), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            nq8.h(av8Var, x23Var.a(1.0f, utcVar2, true));
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            i4k h0 = s02.h0(500, 0, null, 6);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new yt6(12);
                av8Var.n0(O3);
            }
            fz8.b(x23Var, booleanValue, null, uo5.n(h0, (Function1) O3), null, null, yqo.H(353910746, av8Var, new a93(function02, z, function0, function03, 6)), av8Var, 1572870, 26);
            av8Var = av8Var;
            ljg.t(av8Var, true, true, true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(z, function0, function02, function03, xtcVar2, i);
        }
    }

    public static final void p(Function0 function0, Function0 function02, Function0 function03, of3 of3Var, int i) {
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-570667013);
        int i2 = 4;
        int i3 = i | (av8Var.i(function0) ? 4 : 2) | (av8Var.i(function02) ? 32 : 16) | (av8Var.i(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                ia0 ia0Var = ia0.q;
                O = e.f(Boolean.valueOf(ok3.p().e().getIsLoggedIn()));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            d6b d6bVar = d6b.ON_RESUME;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new tra(i2, e1dVar);
                av8Var.n0(O2);
            }
            jca.b(d6bVar, null, (Function0) O2, av8Var, 390);
            o(((Boolean) e1dVar.getValue()).booleanValue(), function02, function0, function03, null, av8Var, (i3 & 112) | ((i3 << 6) & 896) | ((i3 << 3) & 7168));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(function0, function02, function03, i, 28);
        }
    }

    public static final void q(ArrayList arrayList, List list, Set set, Set set2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-720826424);
        int i2 = (i & 6) == 0 ? (av8Var.i(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(set) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(set2) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            e1d g2 = e.g(arrayList, av8Var);
            e1d g3 = e.g(list, av8Var);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = ((e7d) arrayList.get(i3)).b;
                set.add(obj);
                List S0 = CollectionsKt.S0(arrayList);
                boolean g4 = av8Var.g(g2) | av8Var.i(obj) | av8Var.i(set) | av8Var.i(set2) | av8Var.g(g3);
                Object O = av8Var.O();
                if (g4 || O == nf3.a) {
                    ke keVar = new ke(obj, set, set2, g2, g3);
                    av8Var.n0(keVar);
                    O = keVar;
                }
                hz8.b(obj, S0, (Function1) O, av8Var);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i, 11, arrayList, list, set, set2);
        }
    }

    public static final void r(da daVar, s3h s3hVar) {
        l3h l3hVar = s3hVar.d;
        x0d x0dVar = l3hVar.a;
        Object g2 = l3hVar.a.g(w3h.z);
        if (g2 == null) {
            g2 = null;
        }
        u5g u5gVar = (u5g) g2;
        if (wkn.x(s3hVar)) {
            if (u5gVar != null && u5gVar.a == 8) {
                return;
            }
            Object g3 = x0dVar.g(k3h.y);
            if (g3 == null) {
                g3 = null;
            }
            m9 m9Var = (m9) g3;
            if (m9Var != null) {
                daVar.b(new x9(android.R.id.accessibilityActionPageUp, m9Var.a));
            }
            Object g4 = x0dVar.g(k3h.A);
            if (g4 == null) {
                g4 = null;
            }
            m9 m9Var2 = (m9) g4;
            if (m9Var2 != null) {
                daVar.b(new x9(android.R.id.accessibilityActionPageDown, m9Var2.a));
            }
            Object g5 = x0dVar.g(k3h.z);
            if (g5 == null) {
                g5 = null;
            }
            m9 m9Var3 = (m9) g5;
            if (m9Var3 != null) {
                daVar.b(new x9(android.R.id.accessibilityActionPageLeft, m9Var3.a));
            }
            Object g6 = x0dVar.g(k3h.B);
            m9 m9Var4 = (m9) (g6 != null ? g6 : null);
            if (m9Var4 != null) {
                daVar.b(new x9(android.R.id.accessibilityActionPageRight, m9Var4.a));
            }
        }
    }

    public static final vy8 t(vy8 vy8Var, e23 e23Var) {
        return vy8Var.d(new ey0(e23Var));
    }

    public static final xtc u(xtc xtcVar, t32 t32Var) {
        return xtcVar.z(new r32(t32Var));
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static void x(Context context) {
        SharedPreferences d2;
        yea yeaVar = j58.a;
        boolean B = fn0.B("fantasy_is_available");
        boolean B2 = fn0.B("fantasy_has_min_version");
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PREF_IS_IN_SUPPORTED_COUNTRY", B);
        Unit unit = Unit.a;
        i.apply();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext2);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences2 = d2;
        }
        wt3.v(sharedPreferences2, "PREF_HAS_FANTASY_MIN_VERSION", B2);
    }

    public static final e7d y(e7d e7dVar, List list, Set set, Set set2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1239021605);
        e1d g2 = e.g(list, av8Var);
        Object obj = e7dVar.b;
        av8Var.a0(-993800456, obj);
        e7d e7dVar2 = new e7d(e7dVar, yqo.H(-1349345695, av8Var, new s64(set2, obj, set, g2, list, e7dVar, 1)));
        av8Var.s(false);
        av8Var.s(false);
        return e7dVar2;
    }

    public static final ArrayList z(Lineups lineups) {
        List<PlayerData> players = lineups.getPlayers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : players) {
            BaseballAdditionalPlayerData baseballAllPositions = ((PlayerData) obj).getBaseballAllPositions();
            if (yid.m(baseballAllPositions != null ? baseballAllPositions.getBattingOrder() : null) > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            playerData.getClass();
            int id = playerData.getPlayer().getId();
            String C = tba.C(playerData.getPlayer());
            if (C == null) {
                C = tba.t(playerData.getPlayer());
            }
            String position = playerData.getPosition();
            if (position == null) {
                position = playerData.getPlayer().getPosition();
            }
            arrayList2.add(new sk1(id, C, position, 24));
        }
        return arrayList2;
    }

    public String B() {
        return null;
    }

    public String E() {
        return null;
    }

    public abstract void J(xei xeiVar, qic qicVar);

    public abstract void K(qic qicVar);

    public abstract void L(Object obj);

    public abstract int s(int i, int i2, ema emaVar, qhe qheVar, int i3);

    public Integer v(qhe qheVar) {
        return null;
    }
}
