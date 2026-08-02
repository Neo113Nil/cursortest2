package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.room.MultiInstanceInvalidationService;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C4094gc;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.network.api.FantasyAPI;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.network.api.RegistrationCoroutinesAPI;
import com.sofascore.results.service.RegistrationWorker;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hc4 implements xff {
    public final /* synthetic */ int a;
    public final mc4 b;
    public final int c;

    public /* synthetic */ hc4(mc4 mc4Var, int i, int i2) {
        this.a = i2;
        this.b = mc4Var;
        this.c = i;
    }

    @Override // defpackage.yff
    public final Object get() {
        iod iodVar;
        SharedPreferences d;
        Object rm6Var;
        Object ie2Var;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                mc4 mc4Var = this.b;
                w00 w00Var = mc4Var.c;
                int i3 = this.c;
                if (i3 == 0) {
                    return new d3g();
                }
                if (i3 == 1) {
                    return new sef((SharedPreferences) mc4Var.l.get(), (j0j) mc4Var.I.get(), (wve) mc4Var.J.get(), (w3b) mc4Var.H.get());
                }
                if (i3 == 2) {
                    return new amd(w00Var.b, (cg4) mc4Var.K0.get());
                }
                if (i3 == 3) {
                    return new bli(w00Var.b, (bfk) mc4Var.k.get(), (el) mc4Var.w.get(), (SharedPreferences) mc4Var.l.get());
                }
                throw new AssertionError(i3);
            default:
                int i4 = this.c;
                int i5 = i4 / 100;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i4);
                    }
                    if (i4 == 100) {
                        return new unk((NetworkCoroutineAPI) this.b.v.get());
                    }
                    throw new AssertionError(i4);
                }
                int i6 = 16;
                int i7 = 0;
                switch (i4) {
                    case 0:
                        return new lc4(this, 10);
                    case 1:
                        return new el((NetworkCoroutineAPI) this.b.v.get());
                    case 2:
                        mc4 mc4Var2 = this.b;
                        hpo hpoVar = mc4Var2.a;
                        jod jodVar = (jod) mc4Var2.o.get();
                        ps3 ps3Var = (ps3) this.b.p.get();
                        p71 p71Var = (p71) this.b.q.get();
                        ie2 ie2Var2 = (ie2) this.b.r.get();
                        q7a q7aVar = (q7a) this.b.s.get();
                        q7a q7aVar2 = (q7a) this.b.t.get();
                        fj9 fj9Var = (fj9) this.b.u.get();
                        jodVar.getClass();
                        ps3Var.getClass();
                        p71Var.getClass();
                        ie2Var2.getClass();
                        q7aVar.getClass();
                        q7aVar2.getClass();
                        fj9Var.getClass();
                        iod a = jodVar.a();
                        a.c.add(p71Var);
                        a.c.add(q7aVar);
                        a.c.add(q7aVar2);
                        a.d.add(fj9Var);
                        a.l = ie2Var2;
                        w45 w45Var = (w45) hpoVar.a;
                        w45Var.getClass();
                        a.a = w45Var;
                        jod jodVar2 = new jod(a);
                        ujg ujgVar = new ujg(18);
                        ujgVar.G("https://" + uaa.c);
                        ((ArrayList) ujgVar.e).add(ps3Var);
                        ujgVar.d = jodVar2;
                        Object e = ujgVar.H().e(NetworkCoroutineAPI.class);
                        e.getClass();
                        return (NetworkCoroutineAPI) e;
                    case 3:
                        mc4 mc4Var3 = this.b;
                        bka bkaVar = mc4Var3.b;
                        Context context = mc4Var3.c.b;
                        q7a q7aVar3 = (q7a) mc4Var3.i.get();
                        q7a q7aVar4 = (q7a) this.b.m.get();
                        q7a q7aVar5 = (q7a) this.b.n.get();
                        bkaVar.getClass();
                        q7aVar3.getClass();
                        q7aVar4.getClass();
                        q7aVar5.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        if (sharedPreferences.getBoolean("DEV_MODE_UNSAFE_NETWORK", false)) {
                            try {
                                TrustManager[] trustManagerArr = {new x3g(0)};
                                SSLContext sSLContext = SSLContext.getInstance("SSL");
                                sSLContext.init(null, trustManagerArr, new SecureRandom());
                                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                                iodVar = new iod();
                                socketFactory.getClass();
                                TrustManager trustManager = trustManagerArr[0];
                                trustManager.getClass();
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                if (!socketFactory.equals(iodVar.q) || !x509TrustManager.equals(iodVar.r)) {
                                    iodVar.E = null;
                                }
                                iodVar.q = socketFactory;
                                gie gieVar = gie.a;
                                iodVar.w = gie.a.c(x509TrustManager);
                                iodVar.r = x509TrustManager;
                                w3g w3gVar = new w3g();
                                if (!w3gVar.equals(iodVar.u)) {
                                    iodVar.E = null;
                                }
                                iodVar.u = w3gVar;
                            } catch (Exception e2) {
                                is8.h(e2);
                                return null;
                            }
                        } else {
                            iodVar = new iod();
                        }
                        iodVar.d.add(q7aVar3);
                        iodVar.d.add(q7aVar4);
                        iodVar.d.add(q7aVar5);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        iodVar.b = new t9d(50L, timeUnit);
                        timeUnit.getClass();
                        iodVar.B = yol.b("interval", 10L, timeUnit);
                        return new jod(iodVar);
                    case 4:
                        this.b.d.getClass();
                        return new u3g(i7);
                    case 5:
                        mc4 mc4Var4 = this.b;
                        n2f n2fVar = mc4Var4.d;
                        Context context2 = mc4Var4.c.b;
                        bfk bfkVar = (bfk) mc4Var4.k.get();
                        n2fVar.getClass();
                        bfkVar.getClass();
                        final y3g y3gVar = new y3g(i7, context2, bfkVar);
                        final SharedPreferences sharedPreferences2 = (SharedPreferences) this.b.l.get();
                        n2fVar.getClass();
                        sharedPreferences2.getClass();
                        return new q7a() { // from class: v3g
                            @Override // defpackage.q7a
                            public final d2g intercept(p7a p7aVar) {
                                epf epfVar = (epf) p7aVar;
                                qzf qzfVar = epfVar.e;
                                pzf b = qzfVar.b();
                                String str = qzfVar.b;
                                boolean c = Intrinsics.c(str, C4094gc.a);
                                boolean c2 = Intrinsics.c(str, "HEAD");
                                String valueOf = String.valueOf(Integer.parseInt(iii.H(6, "260720003")));
                                String string = sharedPreferences2.getString("AUTH_TOKEN", null);
                                if (!c && !c2 && string != null) {
                                    b.c("Authorization", "Bearer ".concat(string));
                                    b.c("app-version", valueOf);
                                }
                                d2g b2 = epfVar.b(new qzf(b));
                                String a2 = b2.f.a("X-Token-Refresh");
                                if ((a2 != null ? a2 : null) != null) {
                                    Context context3 = (Context) y3gVar.b;
                                    Pair[] pairArr = {new Pair("ACTION", "REFRESH")};
                                    hpo hpoVar2 = new hpo(18);
                                    Pair pair = pairArr[0];
                                    hpoVar2.B(pair.b, (String) pair.a);
                                    md4 l = hpoVar2.l();
                                    vxd.h(context3).b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(RegistrationWorker.class, l).a());
                                }
                                return b2;
                            }
                        };
                    case 6:
                        return new bfk((ku3) this.b.j.get(), pd0.s(this.b.c.b));
                    case 7:
                        mc4 mc4Var5 = this.b;
                        it7 it7Var = mc4Var5.e;
                        return ((ia0) mc4Var5.c.b).a;
                    case 8:
                        Context context3 = this.b.c.b;
                        SharedPreferences sharedPreferences3 = uic.j;
                        if (sharedPreferences3 != null) {
                            return sharedPreferences3;
                        }
                        Context applicationContext2 = context3.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        return d;
                    case 9:
                        mc4 mc4Var6 = this.b;
                        bka bkaVar2 = mc4Var6.b;
                        n2f n2fVar2 = mc4Var6.d;
                        Context context4 = mc4Var6.c.b;
                        bfk bfkVar2 = (bfk) mc4Var6.k.get();
                        n2fVar2.getClass();
                        bfkVar2.getClass();
                        y3g y3gVar2 = new y3g(i7, context4, bfkVar2);
                        bkaVar2.getClass();
                        return new t3g(y3gVar2, i2);
                    case 10:
                        hpo hpoVar2 = this.b.a;
                        bga bgaVar = vga.a;
                        Regex regex = zdc.e;
                        zdc v = bea.v("application/json; charset=UTF8");
                        bgaVar.getClass();
                        rm6Var = new rm6(v, new yia(bgaVar, i6));
                        return rm6Var;
                    case 11:
                        hpo hpoVar3 = this.b.a;
                        return new p71();
                    case 12:
                        mc4 mc4Var7 = this.b;
                        bka bkaVar3 = mc4Var7.b;
                        Context context5 = mc4Var7.c.b;
                        bkaVar3.getClass();
                        ie2Var = new ie2(new File(context5.getCacheDir(), "responses"), 52428800L);
                        return ie2Var;
                    case 13:
                        bka bkaVar4 = this.b.b;
                        bkaVar4.getClass();
                        return new t3g(bkaVar4, i);
                    case 14:
                        mc4 mc4Var8 = this.b;
                        bka bkaVar5 = mc4Var8.b;
                        Context context6 = mc4Var8.c.b;
                        bkaVar5.getClass();
                        return new t3g(context6, i7);
                    case 15:
                        this.b.b.getClass();
                        fj9 fj9Var2 = new fj9();
                        rm5 rm5Var = rm5.a;
                        fj9Var2.a = rm5Var;
                        fj9Var2.b = rm5Var;
                        fj9Var2.c = ej9.a;
                        fj9Var2.c = ej9.b;
                        return fj9Var2;
                    case 16:
                        return (ye4) rf4.c.getValue(this.b.c.b, rf4.a[1]);
                    case 17:
                        return new lc4(this, 19);
                    case 18:
                        AppDatabase appDatabase = (AppDatabase) this.b.z.get();
                        appDatabase.getClass();
                        fr2 c = appDatabase.c();
                        w3a.q(c);
                        return new cs2(c, (NetworkCoroutineAPI) this.b.v.get(), (NetworkCoroutineAPI) this.b.B.get());
                    case 19:
                        Context context7 = this.b.c.b;
                        wj9 wj9Var = new wj9(context7, 24);
                        int[] R0 = CollectionsKt.R0(CollectionsKt.S0(new IntRange(0, 88, 1)));
                        Context applicationContext3 = context7.getApplicationContext();
                        applicationContext3.getClass();
                        f6g w = i9a.w(applicationContext3, AppDatabase.class, "sofascore.db");
                        w.i = true;
                        njc[] njcVarArr = (njc[]) wj9Var.c;
                        w.a((njc[]) Arrays.copyOf(njcVarArr, njcVarArr.length));
                        w.j = w.c != null ? new Intent(w.b, (Class<?>) MultiInstanceInvalidationService.class) : null;
                        int[] copyOf = Arrays.copyOf(R0, R0.length);
                        int length = copyOf.length;
                        while (i7 < length) {
                            w.l.add(Integer.valueOf(copyOf[i7]));
                            i7++;
                        }
                        w.q = true;
                        return (AppDatabase) w.b();
                    case 20:
                        mc4 mc4Var9 = this.b;
                        hpo hpoVar4 = mc4Var9.a;
                        jod jodVar3 = (jod) mc4Var9.A.get();
                        ps3 ps3Var2 = (ps3) this.b.p.get();
                        q7a q7aVar6 = (q7a) this.b.t.get();
                        fj9 fj9Var3 = (fj9) this.b.u.get();
                        jodVar3.getClass();
                        ps3Var2.getClass();
                        q7aVar6.getClass();
                        fj9Var3.getClass();
                        iod a2 = jodVar3.a();
                        a2.c.add(q7aVar6);
                        a2.d.add(fj9Var3);
                        jod jodVar4 = new jod(a2);
                        ujg ujgVar2 = new ujg(18);
                        ujgVar2.G("https://" + uaa.c);
                        ((ArrayList) ujgVar2.e).add(ps3Var2);
                        ujgVar2.d = jodVar4;
                        Object e3 = ujgVar2.H().e(NetworkCoroutineAPI.class);
                        e3.getClass();
                        return (NetworkCoroutineAPI) e3;
                    case 21:
                        mc4 mc4Var10 = this.b;
                        n2f n2fVar3 = mc4Var10.d;
                        q7a q7aVar7 = (q7a) mc4Var10.i.get();
                        n2fVar3.getClass();
                        q7aVar7.getClass();
                        iod a3 = new jod().a();
                        a3.d.add(q7aVar7);
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        a3.b = new t9d(50L, timeUnit2);
                        timeUnit2.getClass();
                        a3.B = yol.b("interval", 10L, timeUnit2);
                        ie2Var = new jod(a3);
                        return ie2Var;
                    case 22:
                        return new lc4(this, 20);
                    case 23:
                        FantasyAPI fantasyAPI = (FantasyAPI) this.b.E.get();
                        AppDatabase appDatabase2 = (AppDatabase) this.b.z.get();
                        appDatabase2.getClass();
                        rp6 f = appDatabase2.f();
                        w3a.q(f);
                        return new wi7(fantasyAPI, f);
                    case 24:
                        mc4 mc4Var11 = this.b;
                        hpo hpoVar5 = mc4Var11.a;
                        jod jodVar5 = (jod) mc4Var11.o.get();
                        ps3 ps3Var3 = (ps3) this.b.p.get();
                        p71 p71Var2 = (p71) this.b.q.get();
                        ie2 ie2Var3 = (ie2) this.b.r.get();
                        q7a q7aVar8 = (q7a) this.b.s.get();
                        q7a q7aVar9 = (q7a) this.b.t.get();
                        fj9 fj9Var4 = (fj9) this.b.u.get();
                        jodVar5.getClass();
                        ps3Var3.getClass();
                        p71Var2.getClass();
                        ie2Var3.getClass();
                        q7aVar8.getClass();
                        q7aVar9.getClass();
                        fj9Var4.getClass();
                        iod a4 = jodVar5.a();
                        a4.c.add(p71Var2);
                        a4.c.add(q7aVar8);
                        a4.c.add(q7aVar9);
                        a4.d.add(fj9Var4);
                        a4.l = ie2Var3;
                        w45 w45Var2 = (w45) hpoVar5.a;
                        w45Var2.getClass();
                        a4.a = w45Var2;
                        jod jodVar6 = new jod(a4);
                        ujg ujgVar3 = new ujg(18);
                        ujgVar3.G("https://" + uaa.c);
                        ((ArrayList) ujgVar3.e).add(ps3Var3);
                        ujgVar3.d = jodVar6;
                        Object e4 = ujgVar3.H().e(FantasyAPI.class);
                        e4.getClass();
                        return (FantasyAPI) e4;
                    case 25:
                        return new jid((bfk) this.b.k.get(), (w3b) this.b.H.get(), (j0j) this.b.I.get(), (wve) this.b.J.get(), (qa6) this.b.K.get(), (tak) this.b.L.get(), (wi7) this.b.F.get(), (dhk) this.b.N.get(), (SharedPreferences) this.b.l.get());
                    case 26:
                        AppDatabase appDatabase3 = (AppDatabase) this.b.z.get();
                        appDatabase3.getClass();
                        irj s = appDatabase3.s();
                        w3a.q(s);
                        return new w3b(s, (NetworkCoroutineAPI) this.b.v.get(), (NetworkCoroutineAPI) this.b.G.get());
                    case 27:
                        mc4 mc4Var12 = this.b;
                        hpo hpoVar6 = mc4Var12.a;
                        jod jodVar7 = (jod) mc4Var12.o.get();
                        ps3 ps3Var4 = (ps3) this.b.p.get();
                        p71 p71Var3 = (p71) this.b.q.get();
                        q7a q7aVar10 = (q7a) this.b.t.get();
                        fj9 fj9Var5 = (fj9) this.b.u.get();
                        jodVar7.getClass();
                        ps3Var4.getClass();
                        p71Var3.getClass();
                        q7aVar10.getClass();
                        fj9Var5.getClass();
                        iod a5 = jodVar7.a();
                        a5.c.add(p71Var3);
                        a5.c.add(q7aVar10);
                        a5.d.add(fj9Var5);
                        jod jodVar8 = new jod(a5);
                        ujg ujgVar4 = new ujg(18);
                        ujgVar4.G("https://" + uaa.c);
                        ((ArrayList) ujgVar4.e).add(ps3Var4);
                        ujgVar4.d = jodVar8;
                        Object e5 = ujgVar4.H().e(NetworkCoroutineAPI.class);
                        e5.getClass();
                        return (NetworkCoroutineAPI) e5;
                    case 28:
                        AppDatabase appDatabase4 = (AppDatabase) this.b.z.get();
                        appDatabase4.getClass();
                        fvi r = appDatabase4.r();
                        w3a.q(r);
                        return new j0j(r, (NetworkCoroutineAPI) this.b.v.get());
                    case 29:
                        AppDatabase appDatabase5 = (AppDatabase) this.b.z.get();
                        appDatabase5.getClass();
                        aoe n = appDatabase5.n();
                        w3a.q(n);
                        return new wve(n, (NetworkCoroutineAPI) this.b.v.get());
                    case 30:
                        AppDatabase appDatabase6 = (AppDatabase) this.b.z.get();
                        appDatabase6.getClass();
                        v76 e6 = appDatabase6.e();
                        w3a.q(e6);
                        return new qa6(e6);
                    case 31:
                        AppDatabase appDatabase7 = (AppDatabase) this.b.z.get();
                        appDatabase7.getClass();
                        mak u = appDatabase7.u();
                        w3a.q(u);
                        AppDatabase appDatabase8 = (AppDatabase) this.b.z.get();
                        appDatabase8.getClass();
                        v76 e7 = appDatabase8.e();
                        w3a.q(e7);
                        return new tak(u, e7);
                    case 32:
                        NetworkCoroutineAPI networkCoroutineAPI = (NetworkCoroutineAPI) this.b.v.get();
                        RegistrationCoroutinesAPI registrationCoroutinesAPI = (RegistrationCoroutinesAPI) this.b.M.get();
                        NetworkCoroutineAPI networkCoroutineAPI2 = (NetworkCoroutineAPI) this.b.G.get();
                        AppDatabase appDatabase9 = (AppDatabase) this.b.z.get();
                        appDatabase9.getClass();
                        ghk v2 = appDatabase9.v();
                        w3a.q(v2);
                        return new dhk(networkCoroutineAPI, registrationCoroutinesAPI, networkCoroutineAPI2, v2);
                    case 33:
                        mc4 mc4Var13 = this.b;
                        hpo hpoVar7 = mc4Var13.a;
                        jod jodVar9 = (jod) mc4Var13.o.get();
                        ps3 ps3Var5 = (ps3) this.b.p.get();
                        p71 p71Var4 = (p71) this.b.q.get();
                        q7a q7aVar11 = (q7a) this.b.t.get();
                        fj9 fj9Var6 = (fj9) this.b.u.get();
                        jodVar9.getClass();
                        ps3Var5.getClass();
                        p71Var4.getClass();
                        q7aVar11.getClass();
                        fj9Var6.getClass();
                        iod a6 = jodVar9.a();
                        a6.c.add(p71Var4);
                        a6.c.add(q7aVar11);
                        a6.d.add(fj9Var6);
                        jod jodVar10 = new jod(a6);
                        ujg ujgVar5 = new ujg(18);
                        ujgVar5.G("https://" + uaa.c);
                        ((ArrayList) ujgVar5.e).add(ps3Var5);
                        ujgVar5.d = jodVar10;
                        Object e8 = ujgVar5.H().e(RegistrationCoroutinesAPI.class);
                        e8.getClass();
                        return (RegistrationCoroutinesAPI) e8;
                    case 34:
                        rm6Var = new udl((w3b) this.b.H.get(), (qa6) this.b.K.get(), (wve) this.b.J.get(), (j0j) this.b.I.get(), (irk) this.b.P.get(), (wi7) this.b.F.get(), (fyk) this.b.Q.get(), (zte) this.b.R.get());
                        return rm6Var;
                    case 35:
                        AppDatabase appDatabase10 = (AppDatabase) this.b.z.get();
                        appDatabase10.getClass();
                        erk w2 = appDatabase10.w();
                        w3a.q(w2);
                        return new irk(w2);
                    case 36:
                        AppDatabase appDatabase11 = (AppDatabase) this.b.z.get();
                        appDatabase11.getClass();
                        zxk x = appDatabase11.x();
                        w3a.q(x);
                        return new fyk(x, (NetworkCoroutineAPI) this.b.G.get(), (NetworkCoroutineAPI) this.b.v.get());
                    case 37:
                        AppDatabase appDatabase12 = (AppDatabase) this.b.z.get();
                        appDatabase12.getClass();
                        wte o = appDatabase12.o();
                        w3a.q(o);
                        return new zte(o, (NetworkCoroutineAPI) this.b.G.get(), (NetworkCoroutineAPI) this.b.v.get());
                    case 38:
                        return new lc4(this, 21);
                    case 39:
                        return new s96((NetworkCoroutineAPI) this.b.v.get(), (NetworkCoroutineAPI) this.b.G.get());
                    case 40:
                        return new lc4(this, 22);
                    case 41:
                        return new z2a((NetworkCoroutineAPI) this.b.B.get());
                    case 42:
                        return new lc4(this, 23);
                    case 43:
                        return new lc4(this, 24);
                    case 44:
                        return new lc4(this, 25);
                    case 45:
                        return new lc4(this, 26);
                    case 46:
                        AppDatabase appDatabase13 = (AppDatabase) this.b.z.get();
                        appDatabase13.getClass();
                        thd m = appDatabase13.m();
                        w3a.q(m);
                        return new yhd(m);
                    case 47:
                        return new lc4(this, 0);
                    case 48:
                        AppDatabase appDatabase14 = (AppDatabase) this.b.z.get();
                        appDatabase14.getClass();
                        zyh q = appDatabase14.q();
                        w3a.q(q);
                        return new gzh(q, (NetworkCoroutineAPI) this.b.G.get());
                    case 49:
                        return new lc4(this, 1);
                    case 50:
                        return new vrj((NetworkCoroutineAPI) this.b.v.get());
                    case 51:
                        return new lc4(this, 2);
                    case 52:
                        return new lc4(this, 3);
                    case 53:
                        return new lc4(this, 4);
                    case 54:
                        return new lc4(this, 5);
                    case 55:
                        NetworkCoroutineAPI networkCoroutineAPI3 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase15 = (AppDatabase) this.b.z.get();
                        appDatabase15.getClass();
                        q2l y = appDatabase15.y();
                        w3a.q(y);
                        return new a3l(networkCoroutineAPI3, y);
                    case 56:
                        return new lc4(this, 6);
                    case 57:
                        return new lc4(this, 7);
                    case 58:
                        return new lc4(this, 8);
                    case 59:
                        NetworkCoroutineAPI networkCoroutineAPI4 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase16 = (AppDatabase) this.b.z.get();
                        appDatabase16.getClass();
                        x8c j = appDatabase16.j();
                        w3a.q(j);
                        AppDatabase appDatabase17 = (AppDatabase) this.b.z.get();
                        appDatabase17.getClass();
                        dx7 g = appDatabase17.g();
                        w3a.q(g);
                        return new m7c(networkCoroutineAPI4, j, g);
                    case 60:
                        AppDatabase appDatabase18 = (AppDatabase) this.b.z.get();
                        appDatabase18.getClass();
                        r3k t = appDatabase18.t();
                        w3a.q(t);
                        return new z3k(t, (NetworkCoroutineAPI) this.b.v.get());
                    case 61:
                        AppDatabase appDatabase19 = (AppDatabase) this.b.z.get();
                        appDatabase19.getClass();
                        l24 d2 = appDatabase19.d();
                        w3a.q(d2);
                        return new e64(d2, (NetworkCoroutineAPI) this.b.v.get());
                    case 62:
                        return new umd((NetworkCoroutineAPI) this.b.v.get());
                    case 63:
                        return new lc4(this, 9);
                    case 64:
                        return new lc4(this, 11);
                    case 65:
                        return new lc4(this, 12);
                    case 66:
                        return new lc4(this, 13);
                    case 67:
                        return new lc4(this, 14);
                    case 68:
                        return new lc4(this, 15);
                    case 69:
                        return new lc4(this, 16);
                    case 70:
                        return new lc4(this, 17);
                    case 71:
                        return new lc4(this, 18);
                    case 72:
                        mc4 mc4Var14 = this.b;
                        ug5 ug5Var = mc4Var14.f;
                        SharedPreferences sharedPreferences4 = (SharedPreferences) mc4Var14.l.get();
                        sharedPreferences4.getClass();
                        km5 km5Var = bpg.a;
                        mi6 mi6Var = l8f.a;
                        return new ti6(sharedPreferences4);
                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                        return new had(this.b.c.b);
                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                        it7 it7Var2 = this.b.e;
                        v38 v38Var = (v38) r38.c().b(v38.class);
                        v38Var.getClass();
                        return v38Var;
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        mc4 mc4Var15 = this.b;
                        return new f5d(mc4Var15.c.b, (bfk) mc4Var15.k.get(), (s5d) this.b.F0.get(), (yea) this.b.G0.get());
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        mc4 mc4Var16 = this.b;
                        Context context8 = mc4Var16.c.b;
                        AppDatabase appDatabase20 = (AppDatabase) mc4Var16.z.get();
                        appDatabase20.getClass();
                        z4d l = appDatabase20.l();
                        w3a.q(l);
                        return new s5d(context8, l);
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        ccd ccdVar = this.b.g;
                        bga bgaVar2 = vga.a;
                        w3a.q(bgaVar2);
                        return bgaVar2;
                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                        return new lx6((bfk) this.b.k.get(), (wi7) this.b.F.get());
                    case 79:
                        mc4 mc4Var17 = this.b;
                        return new tll(mc4Var17.c.b, (w3b) mc4Var17.H.get(), (j0j) this.b.I.get(), (cg4) this.b.K0.get());
                    case 80:
                        ye4 ye4Var = (ye4) this.b.J0.get();
                        ye4Var.getClass();
                        return new cg4(ye4Var);
                    case 81:
                        return (ye4) rf4.b.getValue(this.b.c.b, rf4.a[0]);
                    case 82:
                        return new p1f(this.b.c.b, (SharedPreferences) this.b.l.get());
                    case 83:
                        return new g39((NetworkCoroutineAPI) this.b.v.get());
                    case 84:
                        NetworkCoroutineAPI networkCoroutineAPI5 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase21 = (AppDatabase) this.b.z.get();
                        appDatabase21.getClass();
                        t82 b = appDatabase21.b();
                        w3a.q(b);
                        return new c92(networkCoroutineAPI5, b);
                    case 85:
                        NetworkCoroutineAPI networkCoroutineAPI6 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase22 = (AppDatabase) this.b.z.get();
                        appDatabase22.getClass();
                        dqc k = appDatabase22.k();
                        w3a.q(k);
                        return new wqc(networkCoroutineAPI6, k);
                    case 86:
                        NetworkCoroutineAPI networkCoroutineAPI7 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase23 = (AppDatabase) this.b.z.get();
                        appDatabase23.getClass();
                        gwg p = appDatabase23.p();
                        w3a.q(p);
                        return new uwg(networkCoroutineAPI7, p, (yea) this.b.G0.get());
                    case 87:
                        return new pai((NetworkCoroutineAPI) this.b.v.get());
                    case 88:
                        return new zf5((NetworkCoroutineAPI) this.b.v.get());
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        return new iqk((NetworkCoroutineAPI) this.b.v.get(), (bfk) this.b.k.get());
                    case 90:
                        return new ru6((cg4) this.b.K0.get());
                    case 91:
                        return new qw7();
                    case 92:
                        mc4 mc4Var18 = this.b;
                        rm6Var = new kgl(mc4Var18.c.b, (cg4) mc4Var18.K0.get(), (j0j) this.b.I.get(), (w3b) this.b.H.get(), (wve) this.b.J.get(), this.b.a());
                        return rm6Var;
                    case 93:
                        return new oi5((NetworkCoroutineAPI) this.b.v.get());
                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        NetworkCoroutineAPI networkCoroutineAPI8 = (NetworkCoroutineAPI) this.b.v.get();
                        AppDatabase appDatabase24 = (AppDatabase) this.b.z.get();
                        appDatabase24.getClass();
                        se9 h = appDatabase24.h();
                        w3a.q(h);
                        return new ue9(networkCoroutineAPI8, h);
                    case 95:
                        return new zsb((NetworkCoroutineAPI) this.b.v.get());
                    case 96:
                        return new lue((NetworkCoroutineAPI) this.b.v.get());
                    case 97:
                        return new fta((NetworkCoroutineAPI) this.b.v.get());
                    case 98:
                        return new ctf((NetworkCoroutineAPI) this.b.v.get());
                    case 99:
                        return new qxj((NetworkCoroutineAPI) this.b.v.get());
                    default:
                        throw new AssertionError(i4);
                }
        }
    }
}
