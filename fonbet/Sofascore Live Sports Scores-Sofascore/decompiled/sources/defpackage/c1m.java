package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.util.Size;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import defpackage.ltl;
import defpackage.n4m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class c1m extends x5m {
    public boolean A;
    public boolean B;
    public Long C;
    public Long D;
    public final b5m E;
    public final b5m F;
    public final b5m G;
    public final b5m H;
    public final pc2 I;
    public final hof J;
    public final fdi K;
    public final fdi L;
    public boolean M;
    public final aeh N;
    public final hof O;
    public final aeh P;
    public final hof Q;
    public int R;
    public final AtomicBoolean S;
    public final yzc T;
    public boolean U;
    public final fdi V;
    public final fdi W;
    public final fdi X;
    public final fdi Y;
    public final fdi Z;
    public Size a0;
    public final mqi b0;
    public etl c;
    public boolean c0;
    public yda d;
    public boolean d0;
    public fam e;
    public boolean e0;
    public String f;
    public boolean f0;
    public final mqi g = ypa.b(new lyl(this, 1));
    public wom g0;
    public WidgetType h;
    public boolean h0;
    public String i;
    public boolean i0;
    public String j;
    public boolean j0;
    public String k;
    public apm l;
    public final aeh m;
    public final aeh n;
    public final fdm o;
    public final hof p;
    public String q;
    public final fdi r;
    public final fdi s;
    public List t;
    public final fdi u;
    public final fdi v;
    public final fdi w;
    public final fdi x;
    public final yzc y;
    public final yzc z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public static a copy$default(a aVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            aVar.getClass();
            return new a(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShouldShowPlayerState(shouldShowPlayer=");
            sb.append(this.a);
            sb.append(", shouldShowPreviewImage=");
            return lnb.r(sb, this.b, ')');
        }
    }

    public c1m() {
        f7m f7mVar = new f7m(un0.z(this), new lyl(this, 2), new lyl(this, 3));
        xw3.L(f7mVar.a, null, null, new a4m(f7mVar, null), 3);
        aeh b = beh.b(1, 0, null, 6);
        this.m = b;
        this.n = b;
        Pair pair = new Pair(0L, 0L);
        a62 a62Var = a62.b;
        fdm fdmVar = new fdm(pair, 0, 100, a62Var);
        this.o = fdmVar;
        this.p = un0.t(fdmVar.a);
        fdi a2 = gdi.a(null);
        this.r = a2;
        this.s = a2;
        km5 km5Var = km5.a;
        this.t = km5Var;
        fdi a3 = gdi.a(km5Var);
        this.u = a3;
        this.v = a3;
        fdi a4 = gdi.a(new ltl.a(null));
        this.w = a4;
        this.x = a4;
        yzc yzcVar = new yzc(null);
        this.y = yzcVar;
        this.z = yzcVar;
        this.E = new b5m();
        this.F = new b5m();
        this.G = new b5m();
        this.H = c8m.a;
        this.I = pc2.a;
        this.J = un0.H(new pog(new r4m(this, null)), un0.z(this), weh.a, 0);
        fdi a5 = gdi.a(ywl.b);
        this.K = a5;
        this.L = a5;
        aeh a6 = beh.a(0, 100, a62Var);
        this.N = a6;
        this.O = un0.t(a6);
        aeh a7 = beh.a(0, 100, a62Var);
        this.P = a7;
        this.Q = un0.t(a7);
        this.S = new AtomicBoolean(true);
        this.T = new yzc();
        fdi a8 = gdi.a(psm.a);
        this.V = a8;
        this.W = a8;
        fdi a9 = gdi.a(ori.a);
        this.X = a9;
        this.Y = a9;
        this.Z = gdi.a(a1n.a);
        this.b0 = ypa.b(new wel(15));
        this.i0 = true;
    }

    public static void basePrepareMediaFor$default(c1m c1mVar, n4m n4mVar, boolean z, boolean z2, boolean z3, Float f, int i, Object obj) {
        long floatValue;
        ExoPlayer d;
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: basePrepareMediaFor");
            return;
        }
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z5 = (i & 8) != 0 ? false : z3;
        if ((i & 16) != 0) {
            f = null;
        }
        c1mVar.getClass();
        if (n4mVar == null) {
            return;
        }
        try {
            n4m D = c1mVar.D();
            if (n4mVar.equals(D) && !z2) {
                c1mVar.B(true);
                return;
            }
            yda ydaVar = c1mVar.d;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            if (!n4mVar.equals(D)) {
                c1mVar.e0 = false;
            }
            fam famVar = c1mVar.e;
            boolean e = famVar != null ? famVar.e(n4mVar) : false;
            if (e) {
                fam famVar2 = c1mVar.e;
                if (famVar2 != null && (d = famVar2.d()) != null) {
                    floatValue = ((vg6) d).getCurrentPosition();
                }
                floatValue = 0;
            } else if (z5) {
                floatValue = c1mVar.G();
            } else {
                if (f != null) {
                    floatValue = (long) f.floatValue();
                }
                floatValue = 0;
            }
            c1mVar.n(n4mVar, D, floatValue, e, z5, z4);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static final rum h(c1m c1mVar, Bitmap bitmap) {
        Integer t;
        n4m D = c1mVar.D();
        if (D != null && (t = tz9.t(c1mVar.t, c1mVar.D())) != null) {
            int intValue = t.intValue();
            gim gimVar = D.b;
            if ((gimVar instanceof gim.e) || (gimVar instanceof gim.b)) {
                return new rum(D.a, intValue, c1mVar.G(), fgm.i(D), bitmap);
            }
            if (!(gimVar instanceof gim.d) && !(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
                zzl.b();
            }
        }
        return null;
    }

    public static /* synthetic */ void handleUIIsReadyToPlay$default(c1m c1mVar, n4m n4mVar, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: handleUIIsReadyToPlay");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c1mVar.t(n4mVar, z);
    }

    public static void saveMediaViewingRecord$blazesdk_release$default(c1m c1mVar, Bitmap bitmap, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: saveMediaViewingRecord");
            return;
        }
        if ((i & 1) != 0) {
            bitmap = null;
        }
        c1mVar.getClass();
        x5m.safeViewModelScopeIO$default(c1mVar, null, new lam(c1mVar, bitmap, null), 1, null);
    }

    public static /* synthetic */ void updatePlayPermissionAndApplyPlayPause$default(c1m c1mVar, u uVar, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: updatePlayPermissionAndApplyPlayPause");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c1mVar.k(uVar, z);
    }

    public static /* synthetic */ void updatePlayerUiInteractionState$default(c1m c1mVar, n7k n7kVar, boolean z, int i, Object obj) {
        if (obj == null) {
            c1mVar.l(n7kVar);
        } else {
            a70.m("Super calls with default arguments not supported in this target, function: updatePlayerUiInteractionState");
        }
    }

    public final void A(long j) {
        try {
            this.B = true;
            fam famVar = this.e;
            if (famVar != null) {
                famVar.a(j);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:10:0x0048, B:12:0x004c, B:13:0x004f, B:15:0x0053, B:20:0x0016, B:22:0x0024, B:26:0x002f, B:28:0x0035, B:29:0x0039, B:31:0x003d, B:33:0x0041, B:34:0x0044), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:10:0x0048, B:12:0x004c, B:13:0x004f, B:15:0x0053, B:20:0x0016, B:22:0x0024, B:26:0x002f, B:28:0x0035, B:29:0x0039, B:31:0x003d, B:33:0x0041, B:34:0x0044), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z) {
        fam famVar;
        yda ydaVar;
        fam famVar2;
        try {
            if (!this.j0) {
                if (!L()) {
                    if (M()) {
                    }
                    ydaVar = this.d;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    famVar2 = this.e;
                    if (famVar2 == null) {
                        famVar2.pause();
                        return;
                    }
                    return;
                }
            }
            if (z && Intrinsics.c(this.Z.getValue(), a1n.a)) {
                if (this.x.getValue() instanceof ltl.b) {
                    n4m D = D();
                    if (((D != null ? D.c : null) instanceof n4m.a.b) && (famVar = this.e) != null) {
                        famVar.play();
                    }
                    S();
                    return;
                }
                return;
            }
            ydaVar = this.d;
            if (ydaVar != null) {
            }
            famVar2 = this.e;
            if (famVar2 == null) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final String C() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        Intrinsics.i("broadcasterId");
        throw null;
    }

    public final n4m D() {
        ltl ltlVar = (ltl) this.w.getValue();
        if (ltlVar instanceof ltl.a) {
            return ((ltl.a) ltlVar).a;
        }
        if (ltlVar instanceof ltl.c) {
            return ((ltl.c) ltlVar).a;
        }
        if (ltlVar instanceof ltl.b) {
            return ((ltl.b) ltlVar).a;
        }
        zzl.b();
        return null;
    }

    public final long E() {
        return ((Number) ((Pair) this.o.b).b).longValue();
    }

    public final int F() {
        double G = (G() / E()) * 100.0d;
        if (Double.isNaN(G)) {
            G = 0.0d;
        }
        return Math.min(wzb.a(G), 100);
    }

    public final long G() {
        return ((Number) ((Pair) this.o.b).a).longValue();
    }

    public final String H() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        Intrinsics.i("entryId");
        throw null;
    }

    public t I() {
        return null;
    }

    public final boolean J() {
        return this.f != null;
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return false;
    }

    public boolean M() {
        return false;
    }

    public final void R() {
        try {
            k(a1n.a, false);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void S() {
        try {
            yda ydaVar = this.d;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            esf esfVar = new esf();
            esfVar.a = G();
            n4m D = D();
            n4m.a aVar = D != null ? D.c : null;
            n4m.a.C1353a c1353a = aVar instanceof n4m.a.C1353a ? (n4m.a.C1353a) aVar : null;
            if (c1353a != null) {
                this.m.b(new a(false, true));
                if (!this.e0) {
                    N();
                    this.e0 = true;
                }
                this.d = x5m.safeViewModelScopeIO$default(this, null, new u7m(c1353a, esfVar, this, null), 1, null);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void T() {
        if (this.R < 3) {
            basePrepareMediaFor$default(this, D(), false, true, false, null, 26, null);
            this.R++;
        } else {
            this.T.k(Boolean.valueOf(this.S.getAndSet(false)));
            u(qvm.a);
        }
    }

    @Override // defpackage.ltk
    public void e() {
        x();
        pwl.b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:2:0x0000, B:4:0x0006, B:8:0x001a, B:10:0x002c, B:11:0x002f, B:15:0x000d), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(long j) {
        boolean z;
        fam famVar;
        try {
            fam famVar2 = this.e;
            if ((famVar2 == null || !famVar2.isPlaying()) && this.L.getValue() != ywl.c) {
                z = false;
                this.c0 = z;
                this.C = Long.valueOf(G());
                this.A = true;
                famVar = this.e;
                if (famVar != null) {
                    famVar.seekTo(j);
                }
                B(false);
            }
            z = true;
            this.c0 = z;
            this.C = Long.valueOf(G());
            this.A = true;
            famVar = this.e;
            if (famVar != null) {
            }
            B(false);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public void j(long j, boolean z) {
        try {
            this.D = Long.valueOf(j);
            this.A = false;
            fam famVar = this.e;
            if (famVar != null) {
                famVar.seekTo(j);
            }
            if (z) {
                B(true);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public void k(u uVar, boolean z) {
        uVar.getClass();
        fdi fdiVar = this.Z;
        fdiVar.getClass();
        fdiVar.m(null, uVar);
        if (uVar.equals(a1n.a)) {
            B(true);
        } else if (uVar.equals(n1n.a)) {
            B(false);
        } else {
            zzl.b();
        }
    }

    public void l(n7k n7kVar) {
        n7kVar.getClass();
        fdi fdiVar = this.X;
        fdiVar.getClass();
        fdiVar.m(null, n7kVar);
    }

    public final void m(BlazePlayerType blazePlayerType, BlazeShareParams.BlazeShareContentType blazeShareContentType, String str, String str2, String str3, String str4) {
        blazePlayerType.getClass();
        blazeShareContentType.getClass();
        str.getClass();
        str2.getClass();
        BlazeShareParams blazeShareParams = new BlazeShareParams(str2, blazeShareContentType, str3, str4, str);
        gzk gzkVar = gzk.a;
        String C = C();
        Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
        String str5 = this.j;
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("player_broadcast_client_source_id", str5);
            intent.putExtra("on_trigger_key_broadcaster_id", C);
            intent.putExtra("on_trigger_share_key_share_params", blazeShareParams);
            intent.putExtra("player_type", (Parcelable) blazePlayerType);
            intent.putExtra("player_broadcast_event_type", (Parcelable) d.SHARE);
            if (currActivityOrApplicationContext$blazesdk_release != null) {
                LocalBroadcastManager.getInstance(currActivityOrApplicationContext$blazesdk_release).sendBroadcast(intent);
                gzk.b.add(intent);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (((r6 != null ? r6.c : null) instanceof n4m.a.C1353a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(n4m n4mVar, n4m n4mVar2, long j, boolean z, boolean z2, boolean z3) {
        fdi fdiVar = this.w;
        ltl.a aVar = new ltl.a(n4mVar);
        fdiVar.getClass();
        fdiVar.m(null, aVar);
        fam famVar = this.e;
        if (famVar != null) {
            famVar.n();
            famVar.c();
            famVar.e();
            famVar.m();
            famVar.g();
            famVar.k();
            famVar.h();
            famVar.l();
        }
        this.r.l(null);
        if (!z) {
            if (n4mVar.equals(n4mVar2) && z2) {
                B(false);
            } else {
                fam famVar2 = this.e;
                if (famVar2 != null) {
                    famVar2.i();
                }
                n4m D = D();
                if (!((D != null ? D.c : null) instanceof n4m.a.C1353a)) {
                }
                fdm fdmVar = this.o;
                Pair pair = new Pair(0L, 0L);
                if (fdmVar.a.b(pair)) {
                    fdmVar.b = pair;
                }
            }
        }
        this.K.l(ywl.b);
        fdi fdiVar2 = this.w;
        ltl.c cVar = new ltl.c(n4mVar, j, z, z3);
        fdiVar2.getClass();
        fdiVar2.m(null, cVar);
    }

    public final void o(n4m n4mVar, List list) {
        n4m.a aVar = n4mVar.c;
        boolean z = aVar instanceof n4m.a.C1353a;
        aeh aehVar = this.N;
        if (z) {
            aehVar.b(((n4m.a.C1353a) aVar).a);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aehVar.b((String) it.next());
                }
                return;
            }
            return;
        }
        if (!(aVar instanceof n4m.a.b)) {
            if (aVar instanceof p7m) {
                return;
            }
            zzl.b();
            return;
        }
        String d = ((n4m.a.b) aVar).d();
        if (d != null) {
            aehVar.b(d);
        }
        yom k = fgm.k(n4mVar);
        if (k != null) {
            this.P.b(k);
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                aehVar.b((String) it2.next());
            }
        }
    }

    public final void t(n4m n4mVar, boolean z) {
        n4mVar.getClass();
        fdi fdiVar = this.w;
        ltl ltlVar = (ltl) fdiVar.getValue();
        if ((ltlVar instanceof ltl.c) && Intrinsics.c(D(), n4mVar)) {
            ltl.b bVar = new ltl.b(n4mVar);
            fdiVar.getClass();
            fdiVar.m(null, bVar);
            n4m D = D();
            int i = 1;
            if ((D != null ? D.c : null) instanceof n4m.a.b) {
                try {
                    fam famVar = this.e;
                    if (famVar != null) {
                        famVar.g(n4mVar, new lyl(this, 4));
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                int i2 = 0;
                try {
                    fam famVar2 = this.e;
                    if (famVar2 != null) {
                        famVar2.h(n4mVar, new iyl(this, i2));
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                }
                try {
                    fam famVar3 = this.e;
                    if (famVar3 != null) {
                        famVar3.k(n4mVar, new bmj(25, this, n4mVar));
                    }
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
                try {
                    fam famVar4 = this.e;
                    if (famVar4 != null) {
                        famVar4.f(n4mVar, new iyl(this, 2));
                    }
                } catch (Throwable th4) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                }
                try {
                    fam famVar5 = this.e;
                    if (famVar5 != null) {
                        famVar5.i(n4mVar, new iyl(this, i));
                    }
                } catch (Throwable th5) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
                }
                try {
                    fam famVar6 = this.e;
                    if (famVar6 != null) {
                        famVar6.d(n4mVar, new bcl(14, this, n4mVar));
                    }
                } catch (Throwable th6) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th6, null);
                }
                try {
                    fam famVar7 = this.e;
                    if (famVar7 != null) {
                        famVar7.c(n4mVar, new lyl(this, i2));
                    }
                } catch (Throwable th7) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th7, null);
                }
                fam famVar8 = this.e;
                if (famVar8 != null) {
                    famVar8.b(new iyl(this, 3));
                }
                long j = ((ltl.c) ltlVar).b;
                this.m.b(new a(false, j <= 0));
                fam famVar9 = this.e;
                if (famVar9 != null) {
                    famVar9.j(n4mVar, j, z);
                }
            }
            boolean z2 = this.i0;
            this.i0 = true;
            B(z2);
            if (((ltl.c) ltlVar).c) {
                u(qxm.a);
            }
        }
    }

    public void u(zwm zwmVar) {
        fqm fqmVar;
        zwmVar.getClass();
        try {
            boolean z = this.A;
            b5m b5mVar = this.G;
            if (z) {
                fqm fqmVar2 = (fqm) b5mVar.d();
                if (fqmVar2 != null) {
                    fqmVar = fqm.copy$default(fqmVar2, false, false, 1, null);
                    if (fqmVar == null) {
                    }
                }
                fam famVar = this.e;
                fqmVar = new fqm(famVar != null ? famVar.isPlaying() : false, false);
            } else if (this.B) {
                fqm fqmVar3 = (fqm) b5mVar.d();
                if (fqmVar3 == null || (fqmVar = fqm.copy$default(fqmVar3, false, false, 1, null)) == null) {
                    fqmVar = new fqm(true, false);
                }
            } else if (this.L.getValue() == ywl.c) {
                fqmVar = new fqm(true, false);
            } else if (!(this.x.getValue() instanceof ltl.b)) {
                fqmVar = new fqm(true, false);
            } else if (this.S.get()) {
                fam famVar2 = this.e;
                fqmVar = new fqm(famVar2 != null && famVar2.isPlaying(), true);
            } else {
                fqmVar = new fqm(true, false);
            }
            n7k n7kVar = (n7k) this.X.getValue();
            if (Intrinsics.c(n7kVar, hag.a)) {
                fqmVar = fqm.copy$default(fqmVar, false, false, 1, null);
            } else if (!Intrinsics.c(n7kVar, ori.a)) {
                throw new ndd();
            }
            u uVar = (u) this.Z.getValue();
            if (Intrinsics.c(uVar, n1n.a)) {
                fqmVar = fqm.copy$default(fqmVar, false, false, 2, null);
            } else if (!Intrinsics.c(uVar, a1n.a)) {
                throw new ndd();
            }
            b5mVar.k(fqmVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void v(boolean z) {
        fam famVar = this.e;
        try {
            if (z) {
                if (famVar != null) {
                    famVar.j();
                }
            } else if (famVar != null) {
                famVar.f();
            }
            this.H.k(Boolean.valueOf(z));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void w(boolean z, boolean z2, n7m n7mVar, d0h d0hVar) {
        Boolean bool;
        boolean booleanValue;
        BlazeVideoManager blazeVideoManager;
        n7mVar.getClass();
        d0hVar.getClass();
        try {
            if (this.e == null) {
                k4m k4mVar = new k4m(z, n7mVar, d0hVar);
                etl etlVar = this.c;
                if (etlVar != null) {
                    wom womVar = this.g0;
                    blazeVideoManager = etlVar.b(k4mVar, womVar != null ? womVar.c() : null, un0.z(this));
                } else {
                    blazeVideoManager = null;
                }
                this.e = blazeVideoManager != null ? g(blazeVideoManager) : null;
                Q();
            }
            if (!z2 && (bool = (Boolean) this.H.d()) != null) {
                booleanValue = bool.booleanValue();
                v(booleanValue);
            }
            booleanValue = true;
            v(booleanValue);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void x() {
        fam famVar;
        try {
            fam famVar2 = this.e;
            if (famVar2 != null) {
                famVar2.n();
                famVar2.c();
                famVar2.e();
                famVar2.m();
                famVar2.g();
                famVar2.k();
                famVar2.h();
                famVar2.l();
            }
            this.r.l(null);
            if (!this.f0 && (famVar = this.e) != null) {
                famVar.release();
            }
            this.e = null;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void y(long j) {
        try {
            this.B = true;
            fam famVar = this.e;
            if (famVar != null) {
                famVar.b(j);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public void N() {
    }

    public void O() {
    }

    public void P() {
    }

    public void Q() {
    }

    public fam g(BlazeVideoManager blazeVideoManager) {
        return blazeVideoManager;
    }

    public void z(boolean z) {
    }
}
