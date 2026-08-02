package defpackage;

import android.content.Context;
import android.util.Pair;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzeu;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import java.io.RandomAccessFile;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class o6a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static String[] e;
    public static final /* synthetic */ int f = 0;

    public static final int E(r5e r5eVar) {
        return (int) (r5eVar.e == ewd.a ? r5eVar.e() & 4294967295L : r5eVar.e() >> 32);
    }

    public static float F(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static void G(jcd jcdVar, Context context, ucd ucdVar, vcd vcdVar) {
        context.getClass();
        if (iie.c.length() == 0 || iie.d.length() == 0) {
            ((pcd) vcdVar).onError(new qcd(1, "API Key or Publisher Key not set", null));
            return;
        }
        ad2 ad2Var = oc3.a;
        hs4 hs4Var = z45.a;
        xw3.L(ad2Var, rob.a, null, new h10(jcdVar, context, ucdVar, vcdVar, null, 23), 2);
    }

    public static final trg H(List list, List list2, List list3) {
        trg trgVar;
        if (list2.size() > 0) {
            ((bih) list2.get(0)).getClass();
            trgVar = new aih(((e7d) CollectionsKt.h0(list)).b, (e7d) CollectionsKt.h0(list), CollectionsKt.T(list));
        } else {
            trgVar = null;
        }
        if (trgVar == null) {
            trgVar = new aih(((e7d) CollectionsKt.h0(list)).b, (e7d) CollectionsKt.h0(list), CollectionsKt.T(list));
        }
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            if (list3.get(i) != null) {
                pvd.j();
                return null;
            }
            trgVar = trgVar instanceof jyd ? (jyd) trgVar : null;
            trgVar.getClass();
        }
        return trgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01db, code lost:
    
        r0 = defpackage.w9h.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01df, code lost:
    
        defpackage.o1j.t(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ssi I(glg glgVar, String str) {
        Map d2;
        c9h c9hVar;
        glgVar.getClass();
        nlg V0 = glgVar.V0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (V0.U0()) {
                int F = z1a.F(V0, "name");
                int F2 = z1a.F(V0, "type");
                int F3 = z1a.F(V0, "notnull");
                int F4 = z1a.F(V0, "pk");
                int F5 = z1a.F(V0, "dflt_value");
                ltb ltbVar = new ltb();
                do {
                    String F0 = V0.F0(F);
                    ltbVar.put(F0, new psi((int) V0.getLong(F4), 2, F0, V0.F0(F2), V0.isNull(F5) ? null : V0.F0(F5), V0.getLong(F3) != 0));
                } while (V0.U0());
                d2 = ltbVar.d();
                o1j.t(V0, null);
            } else {
                d2 = lm5.a;
                d2.getClass();
                o1j.t(V0, null);
            }
            V0 = glgVar.V0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int F6 = z1a.F(V0, "id");
                int F7 = z1a.F(V0, "seq");
                int F8 = z1a.F(V0, C4427z5.R);
                int F9 = z1a.F(V0, "on_delete");
                int F10 = z1a.F(V0, "on_update");
                List I = s6a.I(V0);
                V0.reset();
                c9h c9hVar2 = new c9h();
                while (V0.U0()) {
                    if (V0.getLong(F7) == j) {
                        int i = (int) V0.getLong(F6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = F6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : I) {
                            int i3 = F7;
                            List list = I;
                            if (((jm8) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            F7 = i3;
                            I = list;
                        }
                        int i4 = F7;
                        List list2 = I;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            jm8 jm8Var = (jm8) it.next();
                            arrayList.add(jm8Var.c);
                            arrayList2.add(jm8Var.d);
                        }
                        c9hVar2.add(new qsi(V0.F0(F8), V0.F0(F9), V0.F0(F10), arrayList, arrayList2));
                        F6 = i2;
                        F7 = i4;
                        I = list2;
                        j = 0;
                    }
                }
                c9h a2 = w9h.a(c9hVar2);
                o1j.t(V0, null);
                V0 = glgVar.V0("PRAGMA index_list(`" + str + "`)");
                try {
                    int F11 = z1a.F(V0, "name");
                    int F12 = z1a.F(V0, "origin");
                    int F13 = z1a.F(V0, "unique");
                    if (F11 == -1 || F12 == -1 || F13 == -1) {
                        o1j.t(V0, null);
                        c9hVar = null;
                    } else {
                        c9h c9hVar3 = new c9h();
                        while (true) {
                            if (!V0.U0()) {
                                break;
                            }
                            if (a.q.equals(V0.F0(F12))) {
                                rsi J = s6a.J(glgVar, V0.F0(F11), V0.getLong(F13) == 1);
                                if (J == null) {
                                    o1j.t(V0, null);
                                    c9hVar = null;
                                    break;
                                }
                                c9hVar3.add(J);
                            }
                        }
                    }
                    return new ssi(str, d2, a2, c9hVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final lmk J(ImageVector imageVector, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        float f2 = imageVector.j;
        boolean f3 = av8Var.f((Float.floatToRawIntBits(kx4Var.j()) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        Object O = av8Var.O();
        if (f3 || O == nf3.a) {
            u39 u39Var = new u39();
            s(u39Var, imageVector.f);
            Unit unit = Unit.a;
            float f4 = imageVector.b;
            float f5 = imageVector.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(kx4Var.H0(f4)) << 32) | (Float.floatToRawIntBits(kx4Var.H0(f5)) & 4294967295L);
            float f6 = imageVector.d;
            float f7 = imageVector.e;
            if (Float.isNaN(f6)) {
                f6 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f7)) {
                f7 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) << 32) | (4294967295L & Float.floatToRawIntBits(f7));
            lmk lmkVar = new lmk(u39Var);
            String str = imageVector.a;
            long j = imageVector.g;
            ay1 ay1Var = j != 16 ? new ay1(j, imageVector.h) : null;
            boolean z = imageVector.i;
            ((eoh) lmkVar.f).setValue(new njh(floatToRawIntBits));
            ((eoh) lmkVar.g).setValue(Boolean.valueOf(z));
            wlk wlkVar = lmkVar.h;
            ((eoh) wlkVar.g).setValue(ay1Var);
            ((eoh) wlkVar.i).setValue(new njh(floatToRawIntBits2));
            wlkVar.c = str;
            av8Var.n0(lmkVar);
            O = lmkVar;
        }
        return (lmk) O;
    }

    public static final long N(ha5 ha5Var, long j) {
        int round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - Float.intBitsToFloat((int) (j >> 32))));
        if (round < 0) {
            round = 0;
        }
        int round2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - Float.intBitsToFloat((int) (j & 4294967295L))));
        if (round2 < 0) {
            round2 = 0;
        }
        return cn3.a(0, round, 0, round2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean P(zzagi zzagiVar, boolean z) {
        int i;
        zzeu zzeuVar = new zzeu(16);
        boolean z2 = true;
        while (true) {
            zzeuVar.y(8);
            if (!zzagiVar.f(zzeuVar.a, 0, 8, true)) {
                break;
            }
            long N = zzeuVar.N();
            int b2 = zzeuVar.b();
            if (N != 1) {
                i = 8;
            } else {
                if (!zzagiVar.f(zzeuVar.a, 8, 8, true)) {
                    break;
                }
                N = zzeuVar.j();
                i = 16;
            }
            long j = i;
            if (N < j) {
                break;
            }
            int i2 = (int) (N - j);
            if (z2) {
                if (b2 != 1718909296 || i2 < 8) {
                    break;
                }
                zzeuVar.y(4);
                zzagiVar.h(0, 4, zzeuVar.a);
                if (zzeuVar.b() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                zzagiVar.d(i2 - 4);
                z2 = false;
            } else {
                if (b2 == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    zzagiVar.d(i2);
                }
                z2 = false;
            }
        }
        return false;
    }

    public static Pair Q(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        R(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static void R(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        a70.p("ByteBuffer byte order must be little endian");
    }

    public static final void a(p4b p4bVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-608092386);
        int i2 = 4;
        int i3 = (av8Var.g(p4bVar) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            un0.a(null, o7g.a(8.0f), null, null, null, yqo.H(1913081836, av8Var, new bba(p4bVar, i2)), av8Var, 196608, 29);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(p4bVar, i, 9);
        }
    }

    public static final void b(vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(929113324);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            vy8Var = ty8.a;
            lz.c(h5a.O(nq8.z(vy8Var), 24.0f, 2), ho.e, z8e.c, av8Var, 384, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(vy8Var, i, 15);
        }
    }

    public static final void c(boolean z, String str, String str2, of3 of3Var, int i) {
        boolean z2;
        String str3;
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1337601088);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new t32();
                av8Var.n0(O2);
            }
            t32 t32Var = (t32) O2;
            Boolean bool = (Boolean) e1dVar.getValue();
            bool.getClass();
            boolean i3 = av8Var.i(t32Var);
            Object O3 = av8Var.O();
            rq3 rq3Var = null;
            if (i3 || O3 == a99Var) {
                O3 = new vki(t32Var, e1dVar, rq3Var, 17);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, bool, (Function2) O3);
            utc utcVar = utc.a;
            xtc q = n9e.q(c5n.u(bkh.d(l98.c0(utcVar, 8.0f, 16.0f), 1.0f), t32Var), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc A = wnn.A(bkh.d(utcVar, 1.0f), o7g.a(4.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O4;
            Object[] objArr = new Object[0];
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = nuh.B;
                av8Var.n0(O5);
            }
            xtc c0 = l98.c0(tol.y(A, true, true, true, D, wzcVar, new dk1((boh) o3a.N(objArr, (Function0) O5, av8Var, 48), e1dVar, 5), av8Var, 0), 16.0f, 8.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            goa g = ljg.g(av8Var, C2, f50Var3, 1.0f, true);
            String v = oea.v(R.string.about_the_chart_title, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, g, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            kq9.b(s6a.N(((Boolean) e1dVar.getValue()).booleanValue() ? R.drawable.ic_chevron_up : R.drawable.ic_chevron_down, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            z2 = z;
            str3 = str2;
            dy0.a(((Boolean) e1dVar.getValue()).booleanValue(), null, yqo.H(-1958455200, av8Var, new ytj(str, str3, z2)), av8Var, 384);
            av8Var.s(true);
        } else {
            z2 = z;
            str3 = str2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(z2, str, str3, i, 27);
        }
    }

    public static final void d(xtc xtcVar, p4b p4bVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(984831411);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(p4bVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc xtcVar3 = i4 != 0 ? utc.a : xtcVar;
            ff5 ff5Var = nz.b;
            Context context = (Context) av8Var.k(ff5Var);
            ht9 ht9Var = new ht9((Context) av8Var.k(ff5Var));
            vt9.e(ht9Var, R.drawable.weekly_challenge_trophy_tier_1_locked);
            vt9.a(ht9Var, R.drawable.weekly_challenge_trophy_tier_1_locked);
            st9.a(ht9Var, true);
            if (p4bVar.a) {
                str = p4bVar.d;
            } else {
                context.getClass();
                str = hkg.b0(context) ? p4bVar.f : p4bVar.e;
            }
            ht9Var.c = str;
            haa.a(ht9Var.a(), null, bkh.r(bkh.p(n9e.q(xtcVar3, r13.h, oyn.e), 54.0f), null, 3), null, mp3.d, av8Var, 1572912, 1976);
            xtcVar2 = xtcVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(xtcVar2, p4bVar, i, i2, 4);
        }
    }

    public static final void e(RaceFlowModels$RaceTeam raceFlowModels$RaceTeam, gv9 gv9Var, Function1 function1, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        Function0 function03;
        av8 av8Var;
        xtc xtcVar2;
        float f2;
        gv9Var.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1205417092);
        int i2 = i | (av8Var2.g(raceFlowModels$RaceTeam) ? 4 : 2) | (av8Var2.g(gv9Var) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192) | 196608;
        if (av8Var2.T(i2 & 1, (74899 & i2) != 74898)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
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
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            float f3 = Float.MAX_VALUE;
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = Float.MAX_VALUE;
                f3 = 1.0f;
            }
            goa goaVar = new goa(f3, true);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
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
            av8Var2.d0(697354633);
            Object obj = null;
            ArrayList w0 = CollectionsKt.w0(gv9Var, kotlin.collections.a.c(null));
            int i3 = 10;
            ArrayList arrayList = new ArrayList(k13.r(w0, 10));
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                RaceFlowModels$RaceTeam raceFlowModels$RaceTeam2 = (RaceFlowModels$RaceTeam) it.next();
                String str = raceFlowModels$RaceTeam2 != null ? raceFlowModels$RaceTeam2.b : null;
                if (str == null) {
                    str = ljg.k(av8Var2, 1082459175, R.string.all_teams, av8Var2, false);
                } else {
                    av8Var2.d0(1082458741);
                    av8Var2.s(false);
                }
                arrayList.add(new oxh(raceFlowModels$RaceTeam2, str, yqo.H(1714687363, av8Var2, new pte(raceFlowModels$RaceTeam2, i3)), null, null, false, 248));
            }
            av8Var2.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.c(((oxh) next).a, raceFlowModels$RaceTeam)) {
                    obj = next;
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            r4a.j(W, oxhVar, function1, new goa(1.0f > f2 ? f2 : 1.0f, false), null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, i2 & 896, 1008);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            int i4 = 6;
            ImageVector N = s6a.N(R.drawable.ic_replay, 6, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            xtc A = wnn.A(n9e.q(bkh.l(utcVar, 32.0f), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)), o7g.a(8.0f));
            boolean z = (57344 & i2) == 16384;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new rsd(i4, function02);
                av8Var.n0(O);
            }
            kq9.b(N, null, l98.b0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), 4.0f), D, av8Var, 48, 0);
            bf3.u(utcVar, 8.0f, av8Var, true);
            ImageVector N2 = s6a.N(R.drawable.ic_info, 6, av8Var);
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            xtc l = bkh.l(utcVar, 24.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                function03 = function0;
                O2 = new rsd(7, function03);
                av8Var.n0(O2);
            } else {
                function03 = function0;
            }
            kq9.b(N2, null, tol.y(l, false, false, false, 0L, null, (Function0) O2, av8Var, 29), D2, av8Var, 48, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            function03 = function0;
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(raceFlowModels$RaceTeam, gv9Var, function1, function03, function02, xtcVar2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if ((r47 & 4) != 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Function0 function0, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1412510473);
        int i3 = i | (av8Var.i(function0) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        long j2 = j;
        int i4 = i3 | (((i2 & 4) == 0 && av8Var.f(j2)) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                if ((i2 & 4) != 0) {
                    j2 = lz.D(R.color.on_color_secondary, av8Var);
                    i4 &= -897;
                }
                int i5 = i4;
                long j3 = j2;
                av8Var.t();
                lv1 lv1Var = uxf.m;
                xtc c0 = l98.c0(tol.y(n9e.q(wnn.A(xtcVar, o7g.a(32.0f)), lz.D(R.color.on_color_highlight_1, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31), 16.0f, 8.0f);
                wxf wxfVar = ww9.b;
                l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                String v = oea.v(R.string.already_have_an_account, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, new goa(1.0f, true), j3, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.b(), av8Var, i5 & 896, 384, 126968);
                utc utcVar = utc.a;
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String upperCase = oea.v(R.string.user_sign_in, av8Var).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                udj.c(upperCase, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, ljg.i(utcVar, 8.0f, av8Var, utcVar, 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
                av8Var.s(true);
                av8Var.s(true);
                j2 = j3;
            } else {
                av8Var.W();
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mx6(function0, xtcVar, j2, i, i2, 1);
        }
    }

    public static final void g(y7l y7lVar, boolean z, String str, String str2, boolean z2, tee teeVar, boolean z3, boolean z4, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        teeVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(502906798);
        int i2 = i | (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str2) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.i(teeVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.h(z4) ? 8388608 : 4194304) | 905969664;
        if (av8Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            vy8Var2 = ty8.a;
            rd0.b(c5n.t(nq8.z(vy8Var2), new h1g(R.color.surface_1)), 0, 0, yqo.H(1397930916, av8Var, new cuh(y7lVar, z, str, str2, z2, teeVar, z3, z4)), av8Var, 3072, 6);
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gw6(y7lVar, z, str, str2, z2, teeVar, z3, z4, vy8Var2, i);
        }
    }

    public static final void h(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(336884991);
        if (av8Var.T(i & 1, i != 0)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc q = n9e.q(bkh.l(utcVar, 14.0f), lz.D(R.color.n_lv_1, av8Var), o7g.a);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var), null, null, lz.D(R.color.surface_P, av8Var), av8Var, 48, 4);
            i.o(av8Var, true, utcVar, 16.0f, av8Var);
            String v = oea.v(R.string.team_eliminated, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t6j(i, 18);
        }
    }

    public static final void i(y7l y7lVar, boolean z, boolean z2, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-783963924);
        int i2 = i | (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(bh3.b);
            boolean z3 = y7lVar == y7l.b;
            ty8 ty8Var = ty8.a;
            nq8.g(nq8.F(nq8.A(ty8Var), 32.0f), 0, 0, yqo.H(-1050324912, av8Var, new y6g(z, z2, z3, context)), av8Var, 3072, 6);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xt6(y7lVar, z, z2, vy8Var2, i, 4);
        }
    }

    public static final void j(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function0 function0, Function1 function1) {
        boolean z;
        Object obj;
        gv9Var.getClass();
        function0.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-96947534);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 14) == 4;
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (z2 || O == obj2) {
                if (!gv9Var.isEmpty()) {
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        if (((u2f) it.next()).f == null) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                O = Boolean.valueOf(z);
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.sofa_power_rankings, av8Var);
            yf8 yf8Var = xth.a;
            int i3 = 1;
            float f2 = 16.0f;
            Object obj3 = obj2;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            tz9.s(i2 & 112, 4, av8Var, null, oea.v(R.string.full_view, av8Var), function0);
            av8Var.s(true);
            float f3 = 8.0f;
            xtc f02 = l98.f0(kda.O(n9e.q(wnn.A(l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), "wc26_power_rankings_table", av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            tz9.b(booleanValue, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 6);
            av8Var.d0(847601172);
            Iterator<E> it2 = gv9Var.iterator();
            while (it2.hasNext()) {
                u2f u2fVar = (u2f) it2.next();
                yf8 yf8Var2 = xth.a;
                dfj g = xth.g();
                boolean g2 = av8Var.g(u2fVar) | ((i2 & 896) == 256);
                Object O2 = av8Var.O();
                if (g2) {
                    obj = obj3;
                } else {
                    obj = obj3;
                    if (O2 != obj) {
                        av8 av8Var2 = av8Var;
                        av8Var = av8Var2;
                        float f4 = f3;
                        float f5 = f2;
                        f3 = f4;
                        tz9.g(u2fVar, booleanValue, l98.d0(l98.f0(tol.y(utcVar, false, false, false, 0L, null, (Function0) O2, av8Var2, 31), f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 1), f5, g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3072, 32);
                        f2 = f5;
                        obj3 = obj;
                    }
                }
                O2 = new tya(function1, u2fVar, i3);
                av8Var.n0(O2);
                av8 av8Var22 = av8Var;
                av8Var = av8Var22;
                float f42 = f3;
                float f52 = f2;
                f3 = f42;
                tz9.g(u2fVar, booleanValue, l98.d0(l98.f0(tol.y(utcVar, false, false, false, 0L, null, (Function0) O2, av8Var22, 31), f42, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f42, 1), f52, g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3072, 32);
                f2 = f52;
                obj3 = obj;
            }
            ljg.t(av8Var, false, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xm1(gv9Var, function0, function1, xtcVar, i, 3);
        }
    }

    public static int k(String str, int i) {
        return dmi.c(i, 31, str);
    }

    public static final oqf l(dma dmaVar) {
        dma K = dmaVar.K();
        return K != null ? K.p(dmaVar, true) : new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (dmaVar.e() >> 32), (int) (dmaVar.e() & 4294967295L));
    }

    public static final oqf m(dma dmaVar, boolean z) {
        dma y = y(dmaVar);
        float e2 = (int) (y.e() >> 32);
        float e3 = (int) (y.e() & 4294967295L);
        oqf p = y.p(dmaVar, z);
        float f2 = p.a;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 0.0f;
            }
            if (f2 > e2) {
                f2 = e2;
            }
        }
        float f4 = p.b;
        if (z) {
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = 0.0f;
            }
            if (f4 > e3) {
                f4 = e3;
            }
        }
        float f5 = p.c;
        if (z) {
            if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f5 = 0.0f;
            }
            if (f5 <= e2) {
                e2 = f5;
            }
            f5 = e2;
        }
        float f6 = p.d;
        if (z) {
            if (f6 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = f6;
            }
            if (f3 <= e3) {
                e3 = f3;
            }
            f6 = e3;
        }
        if (f2 == f5 || f4 == f6) {
            return oqf.e;
        }
        long w = y.w((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long w2 = y.w((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long w3 = y.w((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        long w4 = y.w((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (w >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (w2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (w4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (w3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (w & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (w2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (w4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (w3 & 4294967295L));
        return new oqf(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final kof n(ejh ejhVar) {
        ejhVar.getClass();
        return new kof(ejhVar);
    }

    public static final lof o(cwh cwhVar) {
        cwhVar.getClass();
        return new lof(cwhVar);
    }

    public static final float p(String str, jej jejVar, int i, of3 of3Var) {
        yf8 yf8Var = xth.a;
        return i - ((kx4) ((av8) of3Var).k(dh3.h)).C0(((int) (jej.a(jejVar, str, xth.b(), 1020).c >> 32)) / 2);
    }

    public static int q(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(lnb.j(i, i2, "overflow: checkedAdd(", ", ", ")"));
    }

    public static final void r(hpo hpoVar, aej aejVar) {
        if (!aejVar.d() || aejVar.a.f == 3) {
            return;
        }
        long j = aejVar.c;
        hpo.r(hpoVar, (int) (j >> 32), (int) (j & 4294967295L), 16);
    }

    public static final void s(u39 u39Var, imk imkVar) {
        ArrayList arrayList = imkVar.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kmk kmkVar = (kmk) arrayList.get(i);
            if (kmkVar instanceof mmk) {
                xae xaeVar = new xae();
                mmk mmkVar = (mmk) kmkVar;
                xaeVar.d = mmkVar.b;
                xaeVar.n = true;
                xaeVar.c();
                xaeVar.s.j(mmkVar.c);
                xaeVar.c();
                xaeVar.c();
                xaeVar.b = mmkVar.d;
                xaeVar.c();
                xaeVar.c = mmkVar.e;
                xaeVar.c();
                xaeVar.g = mmkVar.f;
                xaeVar.c();
                xaeVar.e = mmkVar.g;
                xaeVar.c();
                xaeVar.f = mmkVar.h;
                xaeVar.o = true;
                xaeVar.c();
                xaeVar.h = mmkVar.i;
                xaeVar.o = true;
                xaeVar.c();
                xaeVar.i = mmkVar.j;
                xaeVar.o = true;
                xaeVar.c();
                xaeVar.j = mmkVar.k;
                xaeVar.o = true;
                xaeVar.c();
                xaeVar.k = mmkVar.l;
                xaeVar.p = true;
                xaeVar.c();
                xaeVar.l = mmkVar.m;
                xaeVar.p = true;
                xaeVar.c();
                xaeVar.m = mmkVar.n;
                xaeVar.p = true;
                xaeVar.c();
                u39Var.e(i, xaeVar);
            } else if (kmkVar instanceof imk) {
                u39 u39Var2 = new u39();
                imk imkVar2 = (imk) kmkVar;
                u39Var2.k = imkVar2.a;
                u39Var2.c();
                u39Var2.l = imkVar2.b;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.o = imkVar2.e;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.p = imkVar2.f;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.q = imkVar2.g;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.r = imkVar2.h;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.m = imkVar2.c;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.n = imkVar2.d;
                u39Var2.s = true;
                u39Var2.c();
                u39Var2.f = imkVar2.i;
                u39Var2.g = true;
                u39Var2.c();
                s(u39Var2, imkVar2);
                u39Var.e(i, u39Var2);
            }
        }
    }

    public static int t(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (n6a.a[roundingMode.ordinal()]) {
            case 1:
                f6a.k(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                ogj.b();
                return 0;
        }
        return i3 + i5;
    }

    public static void u(ha5 ha5Var, jej jejVar, q80 q80Var, long j, dfj dfjVar) {
        aej b2 = jej.b(jejVar, q80Var, dfjVar, true, Integer.MAX_VALUE, km5.a, N(ha5Var, j), ha5Var.getLayoutDirection(), ha5Var, null, 1536);
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo hpoVar = (hpo) L0.a;
            hpoVar.I(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            r(hpoVar, b2);
            eyc.j(b2.b, ha5Var.L0().t(), 0L, null, null, null, 30);
        } finally {
            mz1.v(L0, D);
        }
    }

    public static void v(ha5 ha5Var, jej jejVar, String str, long j, dfj dfjVar, int i) {
        aej b2 = jej.b(jejVar, new q80(str), dfjVar, true, (i & 64) != 0 ? Integer.MAX_VALUE : 1, null, N(ha5Var, j), ha5Var.getLayoutDirection(), ha5Var, null, 1568);
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo hpoVar = (hpo) L0.a;
            hpoVar.I(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            r(hpoVar, b2);
            eyc.j(b2.b, ha5Var.L0().t(), 0L, null, null, null, 30);
        } finally {
            mz1.v(L0, D);
        }
    }

    public static void w(ha5 ha5Var, aej aejVar, long j, long j2, float f2, int i) {
        eyc eycVar = aejVar.b;
        zdj zdjVar = aejVar.a;
        long j3 = (i & 2) != 0 ? r13.i : j;
        float f3 = (i & 8) != 0 ? Float.NaN : f2;
        pwh pwhVar = zdjVar.b.a;
        qah qahVar = pwhVar.n;
        v8j v8jVar = pwhVar.m;
        ja5 ja5Var = pwhVar.p;
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo hpoVar = (hpo) L0.a;
            hpoVar.I(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            r(hpoVar, aejVar);
            dfj dfjVar = zdjVar.b;
            n52 b2 = dfjVar.b();
            if (b2 == null || j3 != 16) {
                uj2 t = ha5Var.L0().t();
                if (j3 == 16) {
                    j3 = dfjVar.c();
                }
                eycVar.i(t, yfa.v(j3, f3), qahVar, v8jVar, ja5Var, 3);
            } else {
                uj2 t2 = ha5Var.L0().t();
                if (Float.isNaN(f3)) {
                    f3 = dfjVar.a.a.a();
                }
                rfo.z(eycVar, t2, b2, f3, qahVar, v8jVar, ja5Var);
            }
            mz1.v(L0, D);
        } catch (Throwable th) {
            mz1.v(L0, D);
            throw th;
        }
    }

    public static final Object x(ye4 ye4Var, Function2 function2, rq3 rq3Var) {
        return ye4Var.a(new p4f(function2, null, 1), rq3Var);
    }

    public static final dma y(dma dmaVar) {
        dma dmaVar2;
        dma K = dmaVar.K();
        while (true) {
            dma dmaVar3 = K;
            dmaVar2 = dmaVar;
            dmaVar = dmaVar3;
            if (dmaVar == null) {
                break;
            }
            K = dmaVar.K();
        }
        wdd wddVar = dmaVar2 instanceof wdd ? (wdd) dmaVar2 : null;
        if (wddVar == null) {
            return dmaVar2;
        }
        wdd wddVar2 = wddVar.q;
        while (true) {
            wdd wddVar3 = wddVar2;
            wdd wddVar4 = wddVar;
            wddVar = wddVar3;
            if (wddVar == null) {
                return wddVar4;
            }
            wddVar2 = wddVar.q;
        }
    }

    public abstract List A();

    public abstract sm0 B();

    public abstract ao2 C();

    public abstract Object D();

    public abstract void K();

    public abstract void L();

    public abstract void M(efb efbVar);

    public abstract void O(List list);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r3.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sp5 z() {
        boolean z;
        List A = A();
        if (A != null) {
            z = true;
        }
        z = false;
        z1a.C(A, "%s does not have exactly one group", z);
        return (sp5) A.get(0);
    }
}
