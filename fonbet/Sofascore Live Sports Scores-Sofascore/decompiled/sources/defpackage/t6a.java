package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.ads.models.dto.AdProviderDto;
import com.blaze.blazesdk.ads.models.ui.AdInfoType;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeAdProvider;
import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.ads.k;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfx;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzt;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.EventEditor;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSeasonForm;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.TimeoutsInfo;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.VarInProgress;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;
import com.sofascore.results.service.StageWorker;
import com.unity3d.services.UnityAdsConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t6a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A(ale aleVar, int i, int[] iArr, t1d t1dVar, sq3 sq3Var) {
        tqe tqeVar;
        int i2;
        if (sq3Var instanceof tqe) {
            tqeVar = (tqe) sq3Var;
            int i3 = tqeVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tqeVar.s = i3 - Integer.MIN_VALUE;
                Object obj = tqeVar.r;
                lu3 lu3Var = lu3.a;
                i2 = tqeVar.s;
                if (i2 != 0) {
                    y6a.M(obj);
                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                    z1a.E(!false);
                    sparseBooleanArray.append(i, true);
                    for (int i4 : Arrays.copyOf(iArr, iArr.length)) {
                        z1a.E(!false);
                        sparseBooleanArray.append(i4, true);
                    }
                    z1a.E(!false);
                    uke ukeVar = new uke(new j78(sparseBooleanArray));
                    if (Intrinsics.c(Looper.myLooper(), aleVar.n())) {
                        tqeVar.s = 1;
                        z(aleVar, ukeVar, t1dVar, tqeVar);
                        return;
                    }
                    Handler u = o1j.u(aleVar.n());
                    u.getClass();
                    int i5 = s69.a;
                    r69 r69Var = new r69(u, null, false);
                    j8c j8cVar = new j8c(aleVar, ukeVar, t1dVar, (rq3) null, 26);
                    tqeVar.s = 2;
                    if (xw3.R(r69Var, j8cVar, tqeVar) == lu3Var) {
                        return;
                    }
                } else {
                    if (i2 == 1) {
                        throw wt3.i(obj);
                    }
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        tqeVar = new tqe(sq3Var);
        Object obj2 = tqeVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = tqeVar.s;
        if (i2 != 0) {
        }
        pvd.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FootballEvent D() {
        Tournament tournament = new Tournament(10783, "UEFA Nations League", new Category(1, "", "", "", null, new Sport(1, Sports.FOOTBALL, "Football"), 1, null, null, null), null, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Team team = new Team(4698, "Spain", 0, null, 12, defaultConstructorMarker);
        Country country = zu3.a;
        Team team2 = new Team(4481, "France", 0, zu3.y.getIso2Alpha(), 4, null);
        Status status = new Status(0, "Ended", "Ended", 1, defaultConstructorMarker);
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Time time = null;
        EventChanges eventChanges = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        Boolean bool3 = null;
        Player player = null;
        Long l2 = null;
        Map map = null;
        Score score = new Score(3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Score score2 = new Score(2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Venue venue = null;
        Referee referee = null;
        Boolean bool4 = null;
        boolean z = false;
        String str2 = "spain-france-13157878";
        long j = 1749150000;
        int i = 13157878;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        List list = null;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        EventEditor eventEditor = null;
        String str5 = null;
        String str6 = null;
        Integer num4 = null;
        Integer num5 = null;
        TeamSeasonForm teamSeasonForm = null;
        TeamSeasonForm teamSeasonForm2 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        Integer num6 = null;
        List list2 = null;
        Map map2 = null;
        Integer num7 = null;
        Integer num8 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        VarInProgress varInProgress = null;
        int i3 = 1073807360;
        return new FootballEvent(tournament, "spain-france", (Season) null, (Round) null, status, (Integer) 1, (Integer) null, (Integer) (null == true ? 1 : 0), venue, referee, team, team2, score, score2, bool4, bool, z, bool2, str2, j, l, i, time, eventChanges, num, num2, num3, str, z2, bool3, z3, player, l2, map, (Integer) null, (TimeoutsInfo) null, z4, list, i2, str3, str4, eventEditor, str5, str6, num4, num5, teamSeasonForm, teamSeasonForm2, z5, z6, z7, num6, list2, map2, num7, num8, bool5, bool6, varInProgress, i3, 458832, (DefaultConstructorMarker) null);
    }

    public static final List E() {
        Gender gender = Gender.Male;
        Team team = new Team(35, "Manchester United", "", 100L, 1, null, "Man Utd", null, null, gender, new Sport(1, Sports.FOOTBALL, "Football"), null, false, false, null, null);
        Team team2 = new Team(38, "Chelsea", "", 100L, 1, null, "Chelsea", null, null, gender, new Sport(1, Sports.FOOTBALL, "Football"), null, false, false, null, null);
        return b.j(new Player(288205, "Bruno Fernandes", "B. Fernandes", 1L, team), new Player(975079, "João Pedro", "J. Pedro", 1L, team2), new Player(1597265, "Estêvão Willian", "Estêvão", 1L, Team.copy$default(team2, 39, "Chelsea U21", null, 0L, 0, null, null, "Chelsea U21", null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -132, 63, null)));
    }

    public static final List F() {
        Gender gender = Gender.Male;
        return b.j(new Team(4698, "Spain", "", 100L, 1, null, null, null, null, gender, new Sport(1, Sports.FOOTBALL, "Football"), null, false, false, null, null), new Team(4481, "France", "", 100L, 1, null, null, null, null, gender, new Sport(1, Sports.FOOTBALL, "Football"), null, false, false, null, null), new Team(14882, "Novak Djokovic", "", 100L, 1, null, null, null, null, gender, new Sport(5, Sports.TENNIS, "Tennis"), null, false, false, null, null), new Team(158912, "Valentin Vachero", "", 100L, 1, null, null, null, null, gender, new Sport(5, Sports.TENNIS, "Tennis"), null, false, false, null, null), new Team(14844, "Gael Monfils", "", 100L, 1, null, null, null, null, gender, new Sport(5, Sports.TENNIS, "Tennis"), null, false, false, null, null));
    }

    public static final kgj G(wtc wtcVar, Function1 function1) {
        wma c0 = c6o.c0(wtcVar);
        int i = c0.b;
        qqf rectManager = ((xy) zma.a(c0)).getRectManager();
        lgj lgjVar = rectManager.c;
        lgjVar.getClass();
        uzc uzcVar = lgjVar.a;
        kgj kgjVar = new kgj(lgjVar, i, wtcVar, function1);
        Object b2 = uzcVar.b(i);
        if (b2 == null) {
            uzcVar.i(i, kgjVar);
            b2 = kgjVar;
        }
        kgj kgjVar2 = (kgj) b2;
        if (kgjVar2 != kgjVar) {
            while (true) {
                kgj kgjVar3 = kgjVar2.d;
                if (kgjVar3 == null) {
                    break;
                }
                kgjVar2 = kgjVar3;
            }
            kgjVar2.d = kgjVar;
        }
        if (c6o.c0(wtcVar.a).g) {
            rectManager.b.D(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        return kgjVar;
    }

    public static final boolean H(x0d x0dVar, Object obj, Object obj2) {
        Object g = x0dVar.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof y0d)) {
            if (!g.equals(obj2)) {
                return false;
            }
            x0dVar.k(obj);
            return true;
        }
        y0d y0dVar = (y0d) g;
        boolean l = y0dVar.l(obj2);
        if (l && y0dVar.g()) {
            x0dVar.k(obj);
        }
        return l;
    }

    public static final void I(x0d x0dVar, Object obj) {
        boolean z;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = x0dVar.b[i4];
                        Object obj3 = x0dVar.c[i4];
                        if (obj3 instanceof y0d) {
                            y0d y0dVar = (y0d) obj3;
                            y0dVar.l(obj);
                            z = y0dVar.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            x0dVar.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void J(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "REMOVE_UNIQUE_STAGE"), new Pair("STAGE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("StageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(StageWorker.class, l).a());
    }

    public static final String K(long j, CharSequence charSequence) {
        return charSequence.subSequence(pej.g(j), pej.f(j)).toString();
    }

    public static final void L(m8k m8kVar, m8k m8kVar2) {
        m8kVar.d = m8kVar2.d;
        m8kVar.a = m8kVar2.a;
        m8kVar.e(m8kVar2.c);
        m8kVar.d(m8kVar2.h);
        m8kVar.e = m8kVar2.e;
        m8kVar.f = m8kVar2.f;
        v8e v8eVar = new v8e(8);
        sea.j(v8eVar, m8kVar2.i);
        m8kVar.i = v8eVar;
        m8kVar.j = new cqa(v8eVar);
        String str = m8kVar2.g;
        str.getClass();
        m8kVar.g = str;
        m8kVar.b = m8kVar2.b;
    }

    public static final u8a M(SerialDescriptor serialDescriptor) {
        String r = c.r(serialDescriptor.h(), "?", "", false);
        return Intrinsics.c(serialDescriptor.getKind(), p5h.f) ? serialDescriptor.b() ? u8a.u : u8a.t : r.equals("kotlin.Int") ? serialDescriptor.b() ? u8a.b : u8a.a : r.equals("kotlin.Boolean") ? serialDescriptor.b() ? u8a.d : u8a.c : r.equals("kotlin.Double") ? serialDescriptor.b() ? u8a.f : u8a.e : r.equals("kotlin.Float") ? serialDescriptor.b() ? u8a.h : u8a.g : r.equals("kotlin.Long") ? serialDescriptor.b() ? u8a.j : u8a.i : r.equals("kotlin.String") ? serialDescriptor.b() ? u8a.l : u8a.k : r.equals("kotlin.IntArray") ? u8a.m : r.equals("kotlin.DoubleArray") ? u8a.o : r.equals("kotlin.BooleanArray") ? u8a.n : r.equals("kotlin.FloatArray") ? u8a.p : r.equals("kotlin.LongArray") ? u8a.q : r.equals("kotlin.Array") ? u8a.r : c.v(r, "kotlin.collections.ArrayList", false) ? u8a.s : u8a.v;
    }

    public static void N(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(new zzao[0]);
        }
        if (zzapVar != null) {
            mio mioVar = zzgxm.b;
            zzgxj zzgxjVar = new zzgxj();
            for (zzao zzaoVar : zzapVar.a) {
                if (zzfx.class.isAssignableFrom(zzaoVar.getClass())) {
                    zzgxjVar.c((zzao) zzfx.class.cast(zzaoVar));
                }
            }
            s f = zzgxjVar.f();
            int i2 = f.d;
            for (int i3 = 0; i3 < i2; i3++) {
                zzfx zzfxVar = (zzfx) f.get(i3);
                if (!zzfxVar.a.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.b(zzfxVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.a(zzapVar3);
        }
        if (zzapVar2.a.length > 0) {
            zztVar.k = zzapVar2;
        }
    }

    public static final void O(zziei zzieiVar, ArrayDeque arrayDeque) {
        if (!zzieiVar.z()) {
            if (!(zzieiVar instanceof x)) {
                a70.p("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzieiVar.getClass())));
                return;
            }
            x xVar = (x) zzieiVar;
            O(xVar.d, arrayDeque);
            O(xVar.e, arrayDeque);
            return;
        }
        int binarySearch = Arrays.binarySearch(x.h, zzieiVar.o());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int E = x.E(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((zziei) arrayDeque.peek()).o() >= E) {
            arrayDeque.push(zzieiVar);
            return;
        }
        int E2 = x.E(binarySearch);
        zziei zzieiVar2 = (zziei) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zziei) arrayDeque.peek()).o() < E2) {
            zzieiVar2 = new x((zziei) arrayDeque.pop(), zzieiVar2);
        }
        x xVar2 = new x(zzieiVar2, zzieiVar);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(x.h, xVar2.c);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((zziei) arrayDeque.peek()).o() >= x.E(binarySearch2 + 1)) {
                break;
            } else {
                xVar2 = new x((zziei) arrayDeque.pop(), xVar2);
            }
        }
        arrayDeque.push(xVar2);
    }

    public static zzake P(int i, String str, zzeu zzeuVar) {
        int b2 = zzeuVar.b();
        if (zzeuVar.b() == 1684108385) {
            zzeuVar.E(8);
            return new zzake(str, null, zzgxm.t(zzeuVar.l(b2 - 16)));
        }
        zzeh.c("Failed to parse text attribute: ".concat(zzgb.a(i)));
        return null;
    }

    public static zzajz Q(int i, String str, zzeu zzeuVar, boolean z, boolean z2) {
        int R = R(zzeuVar);
        if (z2) {
            R = Math.min(1, R);
        }
        if (R >= 0) {
            return z ? new zzake(str, null, zzgxm.t(Integer.toString(R))) : new zzajt(C.LANGUAGE_UNDETERMINED, str, Integer.toString(R));
        }
        zzeh.c("Failed to parse uint8 attribute: ".concat(zzgb.a(i)));
        return null;
    }

    public static int R(zzeu zzeuVar) {
        int b2 = zzeuVar.b();
        if (zzeuVar.b() == 1684108385) {
            zzeuVar.E(8);
            int i = b2 - 16;
            if (i == 1) {
                return zzeuVar.I();
            }
            if (i == 2) {
                return zzeuVar.J();
            }
            if (i == 3) {
                return zzeuVar.M();
            }
            if (i == 4 && (zzeuVar.G() & 128) == 0) {
                return zzeuVar.h();
            }
        }
        zzeh.c("Failed to parse data atom to int");
        return -1;
    }

    public static zzake S(int i, String str, zzeu zzeuVar) {
        int b2 = zzeuVar.b();
        if (zzeuVar.b() == 1684108385 && b2 >= 22) {
            zzeuVar.E(10);
            int J = zzeuVar.J();
            if (J > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(J).length());
                sb.append(J);
                String sb2 = sb.toString();
                int J2 = zzeuVar.J();
                if (J2 > 0) {
                    sb2 = bf3.h(J2, sb2, "/", new StringBuilder(sb2.length() + 1 + String.valueOf(J2).length()));
                }
                return new zzake(str, null, zzgxm.t(sb2));
            }
        }
        zzeh.c("Failed to parse index/count attribute: ".concat(zzgb.a(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    public static final void a(v2f v2fVar, Function0 function0, Function0 function02, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        mv1 mv1Var = uxf.g;
        function0.getClass();
        function02.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2140299037);
        int i2 = i | (av8Var2.g(v2fVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024);
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            xtc f0 = l98.f0(n9e.q(wnn.A(xtcVar, o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var2), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            int i3 = i2;
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f02);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String v = oea.v(R.string.sofa_power_rankings, av8Var2);
            yf8 yf8Var = xth.a;
            float f = 8.0f;
            udj.c(v, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110584);
            xtc A = wnn.A(bkh.l(utcVar, 32.0f), o7g.a(8.0f));
            boolean z = (i3 & 112) == 32;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (z || O == a99Var) {
                ve7 ve7Var = new ve7(17, function0);
                av8Var2.n0(ve7Var);
                obj = ve7Var;
            }
            xtc y = tol.y(A, false, false, false, 0L, null, (Function0) obj, av8Var2, 31);
            ?? r13 = 0;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, y);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
            av8 av8Var3 = av8Var2;
            av8Var3.s(true);
            av8Var3.s(true);
            v2f v2fVar2 = v2fVar;
            tz9.b(v2fVar2.b, null, 56.0f, av8Var3, 384, 2);
            av8Var3.d0(-2083004600);
            av8 av8Var4 = av8Var3;
            for (u2f u2fVar : v2fVar2.a) {
                av8Var4.a0(-2122678166, Integer.valueOf(u2fVar.a));
                boolean z2 = v2fVar2.b;
                yf8 yf8Var2 = xth.a;
                dfj g = xth.g();
                xtc d = bkh.d(utcVar, 1.0f);
                int i4 = i3;
                int i5 = ((i4 & 7168) == 2048 ? 1 : r13) | (av8Var4.g(u2fVar) ? 1 : 0);
                Object O2 = av8Var4.O();
                if (i5 != 0 || O2 == a99Var) {
                    O2 = new tya(function1, u2fVar, r13);
                    av8Var4.n0(O2);
                }
                i3 = i4;
                av8 av8Var5 = av8Var4;
                boolean z3 = r13;
                float f2 = f;
                av8 av8Var6 = av8Var5;
                tz9.g(u2fVar, z2, l98.e0(tol.y(d, false, false, false, 0L, null, (Function0) O2, av8Var5, 31), f2, f2, 16.0f, f2), 16.0f, g, 56.0f, av8Var6, 199680, 0);
                av8Var6.s(z3);
                r13 = z3 ? 1 : 0;
                f = f2;
                v2fVar2 = v2fVar;
                av8Var4 = av8Var6;
            }
            boolean z4 = r13;
            av8Var4.s(z4);
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, f);
            k1c c3 = e12.c(mv1Var, z4);
            int hashCode4 = Long.hashCode(av8Var4.T);
            aee m4 = av8Var4.m();
            xtc C4 = fqj.C(av8Var4, c0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, c3, hf3.g);
            waa.K(av8Var4, m4, hf3.f);
            waa.K(av8Var4, Integer.valueOf(hashCode4), hf3.j);
            waa.J(av8Var4, hf3.k);
            waa.K(av8Var4, C4, hf3.d);
            bea.f(oea.v(R.string.power_rankings_go_button, av8Var4), null, null, false, function02, Integer.valueOf(R.drawable.ic_chevron_right_small_16), av8Var4, (i3 << 6) & 57344, 14);
            av8Var4.s(true);
            av8Var4.s(true);
            av8Var = av8Var4;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) v2fVar, (Object) function0, (Object) function02, function1, (Object) xtcVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xtc xtcVar, float f, float f2, float f3, of3 of3Var, final int i, final int i2) {
        final xtc xtcVar2;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        final float f6;
        final float f7;
        final float f8;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1884655347);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f4 = f;
            i3 |= av8Var.d(f4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f5 = f2;
                i3 |= av8Var.d(f5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= av8Var.d(f3) ? a.o : 1024;
                    if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                        av8Var.W();
                        f6 = f4;
                        f7 = f5;
                        f8 = f3;
                    } else {
                        utc utcVar = utc.a;
                        if (i6 != 0) {
                            xtcVar2 = utcVar;
                        }
                        float f9 = i7 != 0 ? 88.0f : f4;
                        float f10 = i4 != 0 ? 6.0f : f5;
                        float f11 = i5 != 0 ? 8.0f : f3;
                        mv1 mv1Var = uxf.g;
                        xtc b0 = l98.b0(bkh.d(xtcVar2, 1.0f), f11);
                        k1c c2 = e12.c(mv1Var, false);
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
                        waa.K(av8Var, c2, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        ncf.a(bkh.l(utcVar, f9), lz.D(R.color.primary_default, av8Var), f10, r13.h, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 896) | 3072, 48);
                        av8Var.s(true);
                        f6 = f9;
                        f8 = f11;
                        f7 = f10;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: kgb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                t6a.b(xtc.this, f6, f7, f8, (of3) obj, aba.K(i | 1), i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            f5 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        f4 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(int i, int i2, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1894444994);
        int i3 = (av8Var2.e(i) ? 4 : 2) | i2;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            String valueOf = String.valueOf(i);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(valueOf, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i, i2, 12);
        }
    }

    public static final void d(b7g b7gVar, boolean z, boolean z2, Function0 function0, Function0 function02, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        int i3;
        a99 a99Var;
        int i4;
        boolean z3;
        b7gVar.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(698597488);
        int i5 = i | (av8Var2.g(b7gVar) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192);
        if (av8Var2.T(i5 & 1, (i5 & 9363) != 9362)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.e(bkh.d(utcVar, 1.0f), 48.0f), 12.0f);
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var2, 54);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc l = bkh.l(utcVar, 24.0f);
            boolean z4 = (i5 & 7168) == 2048;
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (z4 || O == a99Var2) {
                O = new rsd(20, function0);
                av8Var2.n0(O);
            }
            kq9.b(s6a.N(R.drawable.ic_chevron_left, 6, av8Var2), null, tol.y(l, z, false, false, 0L, null, (Function0) O, av8Var2, 28), z ? ljg.f(av8Var2, 1190236127, R.color.primary_default, av8Var2, false) : ljg.f(av8Var2, 1190236917, R.color.n_lv_3, av8Var2, false), av8Var2, 48, 0);
            goa goaVar = new goa(1.0f, true);
            l8g a3 = k8g.a(new ng0(4.0f, true, new l1(uxf.p, 5)), lv1Var, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (b7gVar instanceof a7g) {
                av8Var2.d0(44712380);
                a7g a7gVar = (a7g) b7gVar;
                int i6 = a7gVar.b;
                String str = a7gVar.a;
                if (a7gVar.c) {
                    av8Var2.d0(44757361);
                    e(str, av8Var2, 0);
                    c(i6, 0, av8Var2);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(44899217);
                    c(i6, 0, av8Var2);
                    e(str, av8Var2, 0);
                    av8Var2.s(false);
                }
                av8Var2.s(false);
                z3 = true;
                i4 = 6;
                i3 = i5;
                a99Var = a99Var2;
                i2 = 16384;
            } else {
                if (!(b7gVar instanceof z6g)) {
                    throw dmi.h(av8Var2, -829843426, false);
                }
                av8Var2.d0(45118821);
                String str2 = ((z6g) b7gVar).a;
                yf8 yf8Var = xth.a;
                i2 = 16384;
                i3 = i5;
                a99Var = a99Var2;
                i4 = 6;
                z3 = true;
                udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
                av8Var2.s(false);
            }
            av8Var2.s(z3);
            xtc l2 = bkh.l(utcVar, 24.0f);
            boolean z5 = (i3 & 57344) == i2 ? z3 : false;
            Object O2 = av8Var2.O();
            if (z5 || O2 == a99Var) {
                O2 = new rsd(21, function02);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            kq9.b(s6a.N(R.drawable.ic_chevron_right, i4, av8Var), null, tol.y(l2, z2, false, false, 0L, null, (Function0) O2, av8Var2, 28), z2 ? ljg.f(av8Var, 1190280287, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 1190281077, R.color.n_lv_3, av8Var, false), av8Var, 48, 0);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(b7gVar, z, z2, function0, function02, i);
        }
    }

    public static final void e(String str, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-151703463);
        int i2 = i | (av8Var2.g(str) ? 4 : 2);
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, i2 & 14, 0, 131066);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tk1(str, i, 12);
        }
    }

    public static final void f(euh euhVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-496347391);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(euhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 tc3Var = n9e.b;
            tc3 H = yqo.H(1480620320, av8Var2, new pte(euhVar, 20));
            tc3 tc3Var2 = n9e.c;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new deh(7, function1, euhVar);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, tc3Var, H, tc3Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | 200112, 2000);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(euhVar, function1, xtcVar, i, 3);
        }
    }

    public static final long g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            s3a.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = pej.c;
        return j;
    }

    public static final lek h(String str) {
        str.getClass();
        m8k m8kVar = new m8k();
        n8k.b(m8kVar, str);
        return m8kVar.b();
    }

    public static final long i(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void j(int i, of3 of3Var, xtc xtcVar, Function1 function1) {
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-98016778);
        int i2 = (av8Var2.i(function1) ? 4 : 2) | i | (av8Var2.g(xtcVar) ? 32 : 16);
        int i3 = 3;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                kp5 kp5Var = ydl.i;
                ArrayList arrayList = new ArrayList();
                for (Object obj : kp5Var) {
                    if (((ydl) obj) == ydl.g) {
                        yea yeaVar = j58.a;
                        e58 f = e58.f();
                        f.getClass();
                        nxf[] nxfVarArr = nxf.a;
                        if (f.c("show_pick_dream_team_banner")) {
                        }
                    }
                    arrayList.add(obj);
                }
                av8Var2.n0(arrayList);
                O = arrayList;
            }
            List list = (List) O;
            boolean i4 = av8Var2.i(list);
            Object O2 = av8Var2.O();
            if (i4 || O2 == a99Var) {
                O2 = new el2(list, 7);
                av8Var2.n0(O2);
            }
            pr4 b2 = c6e.b(0, (Function0) O2, av8Var2, 0, 3);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            av8Var = av8Var2;
            d7a.m(list.size(), null, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 8.0f, b2, yqo.H(-1215417392, av8Var2, new e6i(25, list, function1)), av8Var, 200064, 2);
            if (list.size() > 1) {
                av8Var.d0(796941528);
                nq8.h(av8Var, bkh.e(utc.a, 8.0f));
                k53.O(list.size(), b2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(797124118);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l05(function1, xtcVar, i, i3);
        }
    }

    public static final BlazeAdInfoModel k(AdInfoDto adInfoDto) {
        adInfoDto.getClass();
        AdInfoType type = adInfoDto.getType();
        int i = type == null ? -1 : xrl.a[type.ordinal()];
        BlazeAdProvider blazeAdProvider = null;
        if (i == 1) {
            if (adInfoDto.getGoogleAdManagerId() == null || adInfoDto.getAdUnitId() == null || adInfoDto.getFormatId() == null) {
                return null;
            }
            AdInfoType type2 = adInfoDto.getType();
            String googleAdManagerId = adInfoDto.getGoogleAdManagerId();
            String adUnitId = adInfoDto.getAdUnitId();
            String formatId = adInfoDto.getFormatId();
            Map<String, String> context = adInfoDto.getContext();
            if (context == null) {
                context = lm5.a;
                context.getClass();
            }
            Map<String, String> map = context;
            List<AdsConfigurationsDto> c2 = kotlin.collections.a.c(adInfoDto.getConfiguration());
            ArrayList arrayList = new ArrayList();
            for (AdsConfigurationsDto adsConfigurationsDto : c2) {
                if (adsConfigurationsDto != null) {
                    arrayList.add(adsConfigurationsDto);
                }
            }
            return new BlazeAdInfoModel(googleAdManagerId, adUnitId, formatId, map, type2, null, k.b(arrayList), null, adInfoDto.getBackofficeCampaignData(), 160, null);
        }
        if (i != 2 || adInfoDto.getTag() == null) {
            return null;
        }
        AdInfoType type3 = adInfoDto.getType();
        String tag = adInfoDto.getTag();
        Map<String, String> context2 = adInfoDto.getContext();
        if (context2 == null) {
            context2 = lm5.a;
            context2.getClass();
        }
        Map<String, String> map2 = context2;
        List<AdsConfigurationsDto> c3 = kotlin.collections.a.c(adInfoDto.getConfiguration());
        ArrayList arrayList2 = new ArrayList();
        for (AdsConfigurationsDto adsConfigurationsDto2 : c3) {
            if (adsConfigurationsDto2 != null) {
                arrayList2.add(adsConfigurationsDto2);
            }
        }
        com.blaze.blazesdk.app_configurations.models.ads.c b2 = k.b(arrayList2);
        AdProviderDto adProvider = adInfoDto.getAdProvider();
        if (adProvider != null) {
            if (k0m.a[adProvider.ordinal()] != 1) {
                zzl.b();
                return null;
            }
            blazeAdProvider = BlazeAdProvider.ANIVIEW;
        }
        return new BlazeAdInfoModel(null, null, null, map2, type3, tag, b2, blazeAdProvider, adInfoDto.getBackofficeCampaignData(), 7, null);
    }

    public static final void l(x0d x0dVar, Object obj, Object obj2) {
        int f = x0dVar.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : x0dVar.c[f];
        if (obj3 != null) {
            if (obj3 instanceof y0d) {
                ((y0d) obj3).a(obj2);
            } else if (obj3 != obj2) {
                y0d y0dVar = new y0d();
                y0dVar.a(obj3);
                y0dVar.a(obj2);
                obj2 = y0dVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            x0dVar.c[f] = obj2;
            return;
        }
        int i = ~f;
        x0dVar.b[i] = obj;
        x0dVar.c[i] = obj2;
    }

    public static void m(Context context, Stage stage) {
        context.getClass();
        stage.getClass();
        Pair[] pairArr = {new Pair("ACTION", "ADD_STAGE"), new Pair("STAGE_ID", Integer.valueOf(stage.getId()))};
        hpo hpoVar = new hpo(18);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("StageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(StageWorker.class, l).a());
    }

    public static void n(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "ADD_UNIQUE_STAGE"), new Pair("STAGE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("StageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(StageWorker.class, l).a());
    }

    public static final int o(tkb tkbVar, jo joVar) {
        tkb t0 = tkbVar.t0();
        if (t0 == null) {
            r3a.b("Child of " + tkbVar + " cannot be null when calculating alignment line");
        }
        if (tkbVar.z0().a().containsKey(joVar)) {
            Integer num = (Integer) tkbVar.z0().a().get(joVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int R = t0.R(joVar);
            if (R != Integer.MIN_VALUE) {
                t0.j = true;
                tkbVar.k = true;
                tkbVar.N0();
                t0.j = false;
                tkbVar.k = false;
                return R + ((int) (joVar instanceof ye9 ? t0.F0() & 4294967295L : t0.F0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final long q(int i, long j) {
        int i2 = pej.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : g(i4, i);
    }

    public static clf r(long j, long j2, of3 of3Var) {
        long j3 = r13.i;
        g23 g23Var = (g23) ((av8) of3Var).k(i23.a);
        clf clfVar = g23Var.e0;
        if (clfVar == null) {
            clf clfVar2 = new clf(i23.c(g23Var, dlf.d), i23.c(g23Var, dlf.f), r13.c(i23.c(g23Var, dlf.a), 0.38f), r13.c(i23.c(g23Var, dlf.b), 0.38f));
            g23Var.e0 = clfVar2;
            clfVar = clfVar2;
        }
        long j4 = j != 16 ? j : clfVar.a;
        long j5 = j2 != 16 ? j2 : clfVar.b;
        long j6 = j3 != 16 ? j3 : clfVar.c;
        if (j3 == 16) {
            j3 = clfVar.d;
        }
        return new clf(j4, j5, j6, j3);
    }

    public static long s(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static x0d t() {
        long[] jArr = qrg.a;
        return new x0d();
    }

    public static final long u(a6e a6eVar) {
        return wzb.c(a6eVar.l() * a6eVar.p()) + (a6eVar.k() * a6eVar.p());
    }

    public static final float v(long j, oqf oqfVar) {
        float f = oqfVar.d;
        float f2 = oqfVar.c;
        if (pea.q(j, oqfVar)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float e = dnd.e(dnd.h(oqfVar.f(), j));
        if (e >= Float.MAX_VALUE) {
            e = Float.MAX_VALUE;
        }
        float e2 = dnd.e(dnd.h((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(oqfVar.b) & 4294967295L), j));
        if (e2 < e) {
            e = e2;
        }
        float e3 = dnd.e(dnd.h((Float.floatToRawIntBits(oqfVar.a) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), j));
        if (e3 < e) {
            e = e3;
        }
        float e4 = dnd.e(dnd.h((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), j));
        return e4 < e ? e4 : e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String w(Context context, String str) {
        context.getClass();
        switch (str.hashCode()) {
            case -1971321366:
                if (str.equals("4th set")) {
                    String string = context.getString(R.string.set_4_short);
                    string.getClass();
                    return string;
                }
                return str;
            case -1900047650:
                if (str.equals("1st quarter")) {
                    String string2 = context.getString(R.string.quarter_1_short);
                    string2.getClass();
                    return string2;
                }
                return str;
            case -1497670500:
                if (str.equals("3rd period")) {
                    String string3 = context.getString(R.string.period_3_short);
                    string3.getClass();
                    return string3;
                }
                return str;
            case -1316976661:
                if (str.equals("2nd half")) {
                    String string4 = context.getString(R.string.half_2_short);
                    string4.getClass();
                    return string4;
                }
                return str;
            case -1083817685:
                if (str.equals("5th set")) {
                    String string5 = context.getString(R.string.set_5_short);
                    string5.getClass();
                    return string5;
                }
                return str;
            case -796936369:
                if (str.equals("1st period")) {
                    String string6 = context.getString(R.string.period_1_short);
                    string6.getClass();
                    return string6;
                }
                return str;
            case -356412012:
                if (str.equals("1st set")) {
                    String string7 = context.getString(R.string.set_1_short);
                    string7.getClass();
                    return string7;
                }
                return str;
            case -196314004:
                if (str.equals("6th set")) {
                    String string8 = context.getString(R.string.set_6_short);
                    string8.getClass();
                    return string8;
                }
                return str;
            case 373169578:
                if (str.equals("2nd set")) {
                    String string9 = context.getString(R.string.set_2_short);
                    string9.getClass();
                    return string9;
                }
                return str;
            case 435036148:
                if (str.equals("2nd quarter")) {
                    String string10 = context.getString(R.string.quarter_2_short);
                    string10.getClass();
                    return string10;
                }
                return str;
            case 594700737:
                if (str.equals("Overtime")) {
                    String string11 = context.getString(R.string.overtime_short);
                    string11.getClass();
                    return string11;
                }
                return str;
            case 691189677:
                if (str.equals("7th set")) {
                    String string12 = context.getString(R.string.set_7_short);
                    string12.getClass();
                    return string12;
                }
                return str;
            case 981979241:
                if (str.equals("Penalty")) {
                    String string13 = context.getString(R.string.penalties_short);
                    string13.getClass();
                    return string13;
                }
                return str;
            case 1317136436:
                if (str.equals("4th quarter")) {
                    String string14 = context.getString(R.string.quarter_4_short);
                    string14.getClass();
                    return string14;
                }
                return str;
            case 1375189863:
                if (str.equals("3rd set")) {
                    String string15 = context.getString(R.string.set_3_short);
                    string15.getClass();
                    return string15;
                }
                return str;
            case 1633693561:
                if (str.equals("2nd period")) {
                    String string16 = context.getString(R.string.period_2_short);
                    string16.getClass();
                    return string16;
                }
                return str;
            case 1835797825:
                if (str.equals("1st half")) {
                    String string17 = context.getString(R.string.half_1_short);
                    string17.getClass();
                    return string17;
                }
                return str;
            case 2146998065:
                if (str.equals("3rd quarter")) {
                    String string18 = context.getString(R.string.quarter_3_short);
                    string18.getClass();
                    return string18;
                }
                return str;
            default:
                return str;
        }
    }

    public static String x(byte[] bArr) {
        bArr.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            digest.getClass();
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] cArr2 = new char[digest.length * 2];
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                byte b2 = digest[i];
                int i2 = i * 2;
                cArr2[i2] = cArr[(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4];
                cArr2[i2 + 1] = cArr[b2 & 15];
            }
            return StringsKt.l0(new String(cArr2)).toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(ale aleVar, gme gmeVar, sq3 sq3Var) {
        rqe rqeVar;
        int i;
        if (sq3Var instanceof rqe) {
            rqeVar = (rqe) sq3Var;
            int i2 = rqeVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rqeVar.s = i2 - Integer.MIN_VALUE;
                Object obj = rqeVar.r;
                lu3 lu3Var = lu3.a;
                i = rqeVar.s;
                if (i != 0) {
                    y6a.M(obj);
                    rq3 rq3Var = null;
                    if (Intrinsics.c(Looper.myLooper(), aleVar.n())) {
                        rqeVar.s = 1;
                        z(aleVar, null, gmeVar, rqeVar);
                        return;
                    }
                    Handler u = o1j.u(aleVar.n());
                    u.getClass();
                    int i3 = s69.a;
                    r69 r69Var = new r69(u, null, false);
                    gje gjeVar = new gje(aleVar, gmeVar, rq3Var, 3);
                    rqeVar.s = 2;
                    if (xw3.R(r69Var, gjeVar, rqeVar) == lu3Var) {
                        return;
                    }
                } else {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        rqeVar = new rqe(sq3Var);
        Object obj2 = rqeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = rqeVar.s;
        if (i != 0) {
        }
        pvd.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(ale aleVar, uke ukeVar, Function2 function2, sq3 sq3Var) {
        sqe sqeVar;
        int i;
        fsf g;
        Throwable th;
        Object obj;
        if (sq3Var instanceof sqe) {
            sqeVar = (sqe) sq3Var;
            int i2 = sqeVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sqeVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = sqeVar.u;
                lu3 lu3Var = lu3.a;
                i = sqeVar.v;
                if (i != 0) {
                    g = lnb.g(obj2);
                    try {
                        sqeVar.r = aleVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        sqeVar.s = function2;
                        sqeVar.t = g;
                        sqeVar.v = 1;
                        lj2 lj2Var = new lj2(1, z9a.b(sqeVar));
                        lj2Var.t();
                        g.a = new qse(ukeVar, function2, lj2Var);
                        lj2Var.v(new oi(g, 14));
                        Object obj3 = g.a;
                        if (obj3 == null) {
                            Intrinsics.i("listener");
                            throw null;
                        }
                        aleVar.s((qse) obj3);
                        if (lj2Var.q() == lu3Var) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = g.a;
                        if (obj != null) {
                            Intrinsics.i("listener");
                            throw null;
                        }
                        aleVar.z((qse) obj);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    fsf fsfVar = sqeVar.t;
                    Function2 function22 = sqeVar.s;
                    ale aleVar2 = sqeVar.r;
                    try {
                        y6a.M(obj2);
                        g = fsfVar;
                        aleVar = aleVar2;
                    } catch (Throwable th4) {
                        th = th4;
                        g = fsfVar;
                        aleVar = aleVar2;
                        obj = g.a;
                        if (obj != null) {
                        }
                    }
                }
                throw new fka();
            }
        }
        sqeVar = new sqe(sq3Var);
        Object obj22 = sqeVar.u;
        lu3 lu3Var2 = lu3.a;
        i = sqeVar.v;
        if (i != 0) {
        }
        throw new fka();
    }

    public abstract void B(int i);

    public abstract void C(Typeface typeface);

    public void p(int i) {
        new Handler(Looper.getMainLooper()).post(new pn0(this, i, 15));
    }
}
