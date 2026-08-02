package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.newNetwork.post.PremiumTokenResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.service.SyncWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gqi extends hoi implements Function2 {
    public boolean A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ SyncWorker D;
    public final /* synthetic */ ProfileData E;
    public zu4 r;
    public av4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public zu4 x;
    public zu4 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqi(SyncWorker syncWorker, ProfileData profileData, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = syncWorker;
        this.E = profileData;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gqi gqiVar = new gqi(this.D, this.E, rq3Var);
        gqiVar.C = obj;
        return gqiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gqi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a2, code lost:
    
        if (r4 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0162, code lost:
    
        if (r4 == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARN: Type inference failed for: r11v15, types: [zu4] */
    /* JADX WARN: Type inference failed for: r12v12, types: [zu4] */
    /* JADX WARN: Type inference failed for: r13v19, types: [zu4] */
    /* JADX WARN: Type inference failed for: r13v22, types: [zu4] */
    /* JADX WARN: Type inference failed for: r15v16, types: [zu4] */
    /* JADX WARN: Type inference failed for: r15v19, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v26, types: [g9i, kea] */
    /* JADX WARN: Type inference failed for: r5v35, types: [av4, java.lang.Object, java.util.concurrent.CancellationException, zu4] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, nu3, rq3] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        Object P;
        ?? r5;
        Long createdTimestamp;
        Boolean bool;
        boolean c;
        zu4 p;
        av4 t;
        av4 t2;
        zu4 t3;
        lu3 lu3Var;
        zu4 zu4Var;
        av4 av4Var;
        int i2;
        boolean z;
        zu4 zu4Var2;
        zu4 zu4Var3;
        boolean z2;
        String str2;
        SharedPreferences d;
        Object obj2;
        av4 av4Var2;
        zu4 zu4Var4;
        zu4 zu4Var5;
        av4 av4Var3;
        int i3;
        zu4 zu4Var6;
        zu4 zu4Var7;
        zu4 zu4Var8;
        av4 av4Var4;
        av4 av4Var5;
        int i4;
        zu4 zu4Var9;
        zu4 zu4Var10;
        zu4 zu4Var11;
        zu4 zu4Var12;
        av4 av4Var6;
        zu4 zu4Var13;
        zu4 zu4Var14;
        av4 av4Var7;
        av4 av4Var8;
        av4 av4Var9;
        av4 t4;
        ?? r52;
        ?? r2;
        SyncWorker syncWorker;
        av4 av4Var10;
        ku3 ku3Var = (ku3) this.C;
        lu3 lu3Var2 = lu3.a;
        int i5 = 8;
        int i6 = 2;
        int i7 = 5;
        int i8 = 3;
        int i9 = 0;
        int i10 = 1;
        rq3 rq3Var = null;
        switch (this.B) {
            case 0:
                y6a.M(obj);
                i = this.D.c.b().getHasServerAds() != this.E.hasAds() ? 1 : 0;
                bfk bfkVar = this.D.c;
                ProfileData profileData = this.E;
                Boolean valueOf = Boolean.valueOf(profileData.hasAds());
                Boolean hasPremium = this.E.getHasPremium();
                this.C = ku3Var;
                this.z = i;
                this.B = 1;
                str = null;
                Object a = rf4.a(bfkVar.a).a(new t53(profileData, valueOf, hasPremium, rq3Var, 12), this);
                if (a != lu3Var2) {
                    a = Unit.a;
                    break;
                }
                break;
            case 1:
                i = this.z;
                y6a.M(obj);
                str = null;
                if (i != 0) {
                    ad2 ad2Var = qv5.a;
                    qv5.a(w42.a);
                }
                r5 = str;
                if (Intrinsics.c(this.E.getHasPremium(), Boolean.TRUE)) {
                    el elVar = this.D.l;
                    this.C = ku3Var;
                    this.z = i;
                    this.B = 2;
                    elVar.getClass();
                    P = yaa.P(new dl(elVar, "", (String) null, (Long) null, (Long) null, (rq3) null), this);
                    str2 = str;
                    break;
                }
                SyncWorker syncWorker2 = this.D;
                syncWorker2.p = xw3.L(syncWorker2.b, r5, r5, new vki(syncWorker2, (rq3) r5, i7), 3);
                createdTimestamp = this.E.getCreatedTimestamp();
                if (createdTimestamp == null) {
                    bool = Boolean.valueOf(yaa.w() - createdTimestamp.longValue() < 60);
                } else {
                    bool = r5;
                }
                c = Intrinsics.c(bool, Boolean.TRUE);
                SyncWorker syncWorker3 = this.D;
                if (!c) {
                    jid jidVar = syncWorker3.n;
                    Context applicationContext = syncWorker3.getApplicationContext();
                    applicationContext.getClass();
                    this.C = r5;
                    this.z = i;
                    this.A = c;
                    this.B = 3;
                    jidVar.getClass();
                    if (s9a.r(new aid(jidVar, applicationContext, r5, i9), this) != lu3Var2) {
                        z2 = c;
                        obj2 = r5;
                        lu3Var = lu3Var2;
                        r52 = obj2;
                        r2 = this.D.p;
                        if (r2 != 0) {
                            r2.e(r52);
                            Unit unit = Unit.a;
                        }
                        syncWorker = this.D;
                        this.C = r52;
                        this.r = r52;
                        this.s = r52;
                        this.t = r52;
                        this.u = r52;
                        this.v = r52;
                        this.w = r52;
                        this.x = r52;
                        this.y = r52;
                        this.z = i;
                        this.A = z2;
                        this.B = 14;
                        if (syncWorker.g(this) == lu3Var) {
                            return lu3Var;
                        }
                        return Unit.a;
                    }
                    return lu3Var2;
                }
                p = yaa.p(ku3Var, (syncWorker3.o.getBoolean("PINNED_LEAGUES_SYNCED_BLOCKED", false) || this.E.getPinnedLeagues() == null) ? false : true, new fqi(this.D, this.E, r5, i7));
                av4 t5 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, i10), 3);
                t = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, i5), 3);
                t2 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, i6), 3);
                t3 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, 6), 3);
                av4 t6 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, 7), 3);
                av4 t7 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, 9), 3);
                av4 t8 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, 4), 3);
                av4 t9 = xw3.t(ku3Var, r5, new fqi(this.D, this.E, r5, 0), 3);
                this.C = ku3Var;
                this.r = p;
                this.s = t;
                this.t = t2;
                this.u = t3;
                this.v = t6;
                this.w = t7;
                this.x = t8;
                this.y = t9;
                this.z = i;
                this.A = c;
                this.B = 4;
                lu3Var = lu3Var2;
                if (t5.w(this) == lu3Var) {
                    return lu3Var;
                }
                zu4Var = t7;
                av4Var = t6;
                i2 = i;
                z = c;
                zu4Var2 = t8;
                zu4Var3 = t9;
                av4Var2 = r5;
                this.C = ku3Var;
                this.r = p;
                this.s = av4Var2;
                this.t = t2;
                this.u = t3;
                this.v = av4Var;
                this.w = zu4Var;
                this.x = zu4Var2;
                this.y = zu4Var3;
                this.z = i2;
                this.A = z;
                this.B = 5;
                if (t.T(this) != lu3Var) {
                    return lu3Var;
                }
                zu4Var4 = t3;
                zu4Var5 = p;
                av4Var3 = av4Var2;
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var3;
                this.t = av4Var3;
                this.u = zu4Var4;
                this.v = av4Var;
                this.w = zu4Var;
                this.x = zu4Var2;
                this.y = zu4Var3;
                this.z = i2;
                this.A = z;
                this.B = 6;
                if (t2.T(this) != lu3Var) {
                    return lu3Var;
                }
                i3 = i2;
                zu4Var6 = zu4Var3;
                zu4Var7 = zu4Var2;
                zu4Var8 = zu4Var;
                av4Var4 = av4Var3;
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var4;
                this.t = av4Var4;
                this.u = av4Var4;
                this.v = av4Var;
                this.w = zu4Var8;
                this.x = zu4Var7;
                this.y = zu4Var6;
                this.z = i3;
                this.A = z;
                this.B = 7;
                av4Var5 = av4Var4;
                if (zu4Var4.T(this) == lu3Var) {
                    return lu3Var;
                }
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var5;
                this.t = av4Var5;
                this.u = av4Var5;
                this.v = av4Var5;
                this.w = zu4Var8;
                this.x = zu4Var7;
                this.y = zu4Var6;
                this.z = i3;
                this.A = z;
                this.B = 8;
                if (av4Var.T(this) == lu3Var) {
                    return lu3Var;
                }
                i4 = i3;
                zu4Var9 = zu4Var6;
                zu4Var10 = zu4Var7;
                zu4Var11 = zu4Var8;
                zu4Var12 = zu4Var5;
                av4Var6 = av4Var5;
                if (zu4Var12 != null) {
                    this.C = ku3Var;
                    this.r = av4Var6;
                    this.s = av4Var6;
                    this.t = av4Var6;
                    this.u = av4Var6;
                    this.v = av4Var6;
                    this.w = zu4Var11;
                    this.x = zu4Var10;
                    this.y = zu4Var9;
                    this.z = i4;
                    this.A = z;
                    this.B = 9;
                    av4Var6 = av4Var6;
                    if (zu4Var12.T(this) == lu3Var) {
                        return lu3Var;
                    }
                    Unit unit2 = Unit.a;
                }
                zu4Var13 = zu4Var9;
                zu4Var14 = zu4Var10;
                this.C = ku3Var;
                this.r = av4Var6;
                this.s = av4Var6;
                this.t = av4Var6;
                this.u = av4Var6;
                this.v = av4Var6;
                this.w = av4Var6;
                this.x = zu4Var14;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 10;
                av4Var7 = av4Var6;
                if (zu4Var11.T(this) == lu3Var) {
                    return lu3Var;
                }
                this.C = ku3Var;
                this.r = av4Var7;
                this.s = av4Var7;
                this.t = av4Var7;
                this.u = av4Var7;
                this.v = av4Var7;
                this.w = av4Var7;
                this.x = av4Var7;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 11;
                av4Var8 = av4Var7;
                if (zu4Var14.T(this) == lu3Var) {
                    return lu3Var;
                }
                this.C = ku3Var;
                this.r = av4Var8;
                this.s = av4Var8;
                this.t = av4Var8;
                this.u = av4Var8;
                this.v = av4Var8;
                this.w = av4Var8;
                this.x = av4Var8;
                this.y = av4Var8;
                this.z = i4;
                this.A = z;
                this.B = 12;
                av4Var9 = av4Var8;
                if (zu4Var13.T(this) == lu3Var) {
                    return lu3Var;
                }
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                    return lu3Var;
                }
                z2 = z;
                i = i4;
                av4Var10 = av4Var9;
                ugj.a.getClass();
                Unit unit3 = Unit.a;
                r52 = av4Var10;
                r2 = this.D.p;
                if (r2 != 0) {
                }
                syncWorker = this.D;
                this.C = r52;
                this.r = r52;
                this.s = r52;
                this.t = r52;
                this.u = r52;
                this.v = r52;
                this.w = r52;
                this.x = r52;
                this.y = r52;
                this.z = i;
                this.A = z2;
                this.B = 14;
                if (syncWorker.g(this) == lu3Var) {
                }
                return Unit.a;
            case 2:
                i = this.z;
                y6a.M(obj);
                P = obj;
                str2 = null;
                PremiumTokenResponse premiumTokenResponse = (PremiumTokenResponse) yaa.x((x2g) P);
                r5 = str2;
                if (premiumTokenResponse != null) {
                    SyncWorker syncWorker4 = this.D;
                    String token = premiumTokenResponse.getToken();
                    if (token == null || token.length() == 0) {
                        Context applicationContext2 = syncWorker4.getApplicationContext();
                        applicationContext2.getClass();
                        nv.q0(applicationContext2, 3, str2);
                    }
                    Context applicationContext3 = syncWorker4.getApplicationContext();
                    applicationContext3.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext4);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putString("PR_XAIST", premiumTokenResponse.getToken());
                    Unit unit4 = Unit.a;
                    edit.apply();
                    r5 = str2;
                }
                SyncWorker syncWorker22 = this.D;
                syncWorker22.p = xw3.L(syncWorker22.b, r5, r5, new vki(syncWorker22, (rq3) r5, i7), 3);
                createdTimestamp = this.E.getCreatedTimestamp();
                if (createdTimestamp == null) {
                }
                c = Intrinsics.c(bool, Boolean.TRUE);
                SyncWorker syncWorker32 = this.D;
                if (!c) {
                }
                break;
            case 3:
                z2 = this.A;
                i = this.z;
                y6a.M(obj);
                obj2 = null;
                lu3Var = lu3Var2;
                r52 = obj2;
                r2 = this.D.p;
                if (r2 != 0) {
                }
                syncWorker = this.D;
                this.C = r52;
                this.r = r52;
                this.s = r52;
                this.t = r52;
                this.u = r52;
                this.v = r52;
                this.w = r52;
                this.x = r52;
                this.y = r52;
                this.z = i;
                this.A = z2;
                this.B = 14;
                if (syncWorker.g(this) == lu3Var) {
                }
                return Unit.a;
            case 4:
                z = this.A;
                int i11 = this.z;
                zu4 zu4Var15 = this.y;
                zu4Var2 = this.x;
                zu4Var = this.w;
                ?? r13 = this.v;
                t3 = this.u;
                ?? r15 = this.t;
                av4 av4Var11 = this.s;
                p = this.r;
                y6a.M(obj);
                zu4Var3 = zu4Var15;
                t2 = r15;
                lu3Var = lu3Var2;
                i2 = i11;
                av4Var = r13;
                t = av4Var11;
                av4Var2 = null;
                this.C = ku3Var;
                this.r = p;
                this.s = av4Var2;
                this.t = t2;
                this.u = t3;
                this.v = av4Var;
                this.w = zu4Var;
                this.x = zu4Var2;
                this.y = zu4Var3;
                this.z = i2;
                this.A = z;
                this.B = 5;
                if (t.T(this) != lu3Var) {
                }
                break;
            case 5:
                z = this.A;
                i2 = this.z;
                zu4Var3 = this.y;
                zu4Var2 = this.x;
                zu4Var = this.w;
                ?? r132 = this.v;
                zu4 zu4Var16 = this.u;
                ?? r152 = this.t;
                zu4 zu4Var17 = this.r;
                y6a.M(obj);
                t2 = r152;
                av4Var3 = null;
                lu3Var = lu3Var2;
                av4Var = r132;
                zu4Var4 = zu4Var16;
                zu4Var5 = zu4Var17;
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var3;
                this.t = av4Var3;
                this.u = zu4Var4;
                this.v = av4Var;
                this.w = zu4Var;
                this.x = zu4Var2;
                this.y = zu4Var3;
                this.z = i2;
                this.A = z;
                this.B = 6;
                if (t2.T(this) != lu3Var) {
                }
                break;
            case 6:
                z = this.A;
                i3 = this.z;
                zu4Var6 = this.y;
                zu4Var7 = this.x;
                zu4Var8 = this.w;
                ?? r12 = this.v;
                zu4Var4 = this.u;
                zu4Var5 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                av4Var = r12;
                av4Var4 = null;
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var4;
                this.t = av4Var4;
                this.u = av4Var4;
                this.v = av4Var;
                this.w = zu4Var8;
                this.x = zu4Var7;
                this.y = zu4Var6;
                this.z = i3;
                this.A = z;
                this.B = 7;
                av4Var5 = av4Var4;
                if (zu4Var4.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var5;
                this.t = av4Var5;
                this.u = av4Var5;
                this.v = av4Var5;
                this.w = zu4Var8;
                this.x = zu4Var7;
                this.y = zu4Var6;
                this.z = i3;
                this.A = z;
                this.B = 8;
                if (av4Var.T(this) == lu3Var) {
                }
                break;
            case 7:
                z = this.A;
                int i12 = this.z;
                zu4 zu4Var18 = this.y;
                zu4 zu4Var19 = this.x;
                zu4 zu4Var20 = this.w;
                ?? r11 = this.v;
                zu4 zu4Var21 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                av4Var = r11;
                zu4Var5 = zu4Var21;
                zu4Var8 = zu4Var20;
                zu4Var7 = zu4Var19;
                zu4Var6 = zu4Var18;
                i3 = i12;
                av4Var5 = null;
                this.C = ku3Var;
                this.r = zu4Var5;
                this.s = av4Var5;
                this.t = av4Var5;
                this.u = av4Var5;
                this.v = av4Var5;
                this.w = zu4Var8;
                this.x = zu4Var7;
                this.y = zu4Var6;
                this.z = i3;
                this.A = z;
                this.B = 8;
                if (av4Var.T(this) == lu3Var) {
                }
                break;
            case 8:
                z = this.A;
                int i13 = this.z;
                zu4Var9 = this.y;
                zu4Var10 = this.x;
                zu4Var11 = this.w;
                zu4Var12 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                i4 = i13;
                av4Var6 = null;
                if (zu4Var12 != null) {
                }
                zu4Var13 = zu4Var9;
                zu4Var14 = zu4Var10;
                this.C = ku3Var;
                this.r = av4Var6;
                this.s = av4Var6;
                this.t = av4Var6;
                this.u = av4Var6;
                this.v = av4Var6;
                this.w = av4Var6;
                this.x = zu4Var14;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 10;
                av4Var7 = av4Var6;
                if (zu4Var11.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = av4Var7;
                this.s = av4Var7;
                this.t = av4Var7;
                this.u = av4Var7;
                this.v = av4Var7;
                this.w = av4Var7;
                this.x = av4Var7;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 11;
                av4Var8 = av4Var7;
                if (zu4Var14.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = av4Var8;
                this.s = av4Var8;
                this.t = av4Var8;
                this.u = av4Var8;
                this.v = av4Var8;
                this.w = av4Var8;
                this.x = av4Var8;
                this.y = av4Var8;
                this.z = i4;
                this.A = z;
                this.B = 12;
                av4Var9 = av4Var8;
                if (zu4Var13.T(this) == lu3Var) {
                }
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                }
                break;
            case 9:
                z = this.A;
                i4 = this.z;
                zu4 zu4Var22 = this.y;
                zu4 zu4Var23 = this.x;
                zu4 zu4Var24 = this.w;
                y6a.M(obj);
                lu3Var = lu3Var2;
                zu4Var11 = zu4Var24;
                zu4Var10 = zu4Var23;
                zu4Var9 = zu4Var22;
                av4Var6 = null;
                Unit unit22 = Unit.a;
                zu4Var13 = zu4Var9;
                zu4Var14 = zu4Var10;
                this.C = ku3Var;
                this.r = av4Var6;
                this.s = av4Var6;
                this.t = av4Var6;
                this.u = av4Var6;
                this.v = av4Var6;
                this.w = av4Var6;
                this.x = zu4Var14;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 10;
                av4Var7 = av4Var6;
                if (zu4Var11.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = av4Var7;
                this.s = av4Var7;
                this.t = av4Var7;
                this.u = av4Var7;
                this.v = av4Var7;
                this.w = av4Var7;
                this.x = av4Var7;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 11;
                av4Var8 = av4Var7;
                if (zu4Var14.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = av4Var8;
                this.s = av4Var8;
                this.t = av4Var8;
                this.u = av4Var8;
                this.v = av4Var8;
                this.w = av4Var8;
                this.x = av4Var8;
                this.y = av4Var8;
                this.z = i4;
                this.A = z;
                this.B = 12;
                av4Var9 = av4Var8;
                if (zu4Var13.T(this) == lu3Var) {
                }
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                }
                break;
            case 10:
                z = this.A;
                i4 = this.z;
                zu4 zu4Var25 = this.y;
                zu4Var14 = this.x;
                y6a.M(obj);
                lu3Var = lu3Var2;
                zu4Var13 = zu4Var25;
                av4Var7 = null;
                this.C = ku3Var;
                this.r = av4Var7;
                this.s = av4Var7;
                this.t = av4Var7;
                this.u = av4Var7;
                this.v = av4Var7;
                this.w = av4Var7;
                this.x = av4Var7;
                this.y = zu4Var13;
                this.z = i4;
                this.A = z;
                this.B = 11;
                av4Var8 = av4Var7;
                if (zu4Var14.T(this) == lu3Var) {
                }
                this.C = ku3Var;
                this.r = av4Var8;
                this.s = av4Var8;
                this.t = av4Var8;
                this.u = av4Var8;
                this.v = av4Var8;
                this.w = av4Var8;
                this.x = av4Var8;
                this.y = av4Var8;
                this.z = i4;
                this.A = z;
                this.B = 12;
                av4Var9 = av4Var8;
                if (zu4Var13.T(this) == lu3Var) {
                }
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                }
                break;
            case 11:
                z = this.A;
                i4 = this.z;
                zu4 zu4Var26 = this.y;
                y6a.M(obj);
                lu3Var = lu3Var2;
                zu4Var13 = zu4Var26;
                av4Var8 = null;
                this.C = ku3Var;
                this.r = av4Var8;
                this.s = av4Var8;
                this.t = av4Var8;
                this.u = av4Var8;
                this.v = av4Var8;
                this.w = av4Var8;
                this.x = av4Var8;
                this.y = av4Var8;
                this.z = i4;
                this.A = z;
                this.B = 12;
                av4Var9 = av4Var8;
                if (zu4Var13.T(this) == lu3Var) {
                }
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                }
                break;
            case 12:
                z = this.A;
                i4 = this.z;
                y6a.M(obj);
                lu3Var = lu3Var2;
                av4Var9 = null;
                ugj.a.getClass();
                t4 = xw3.t(ku3Var, av4Var9, new fqi(this.D, this.E, av4Var9, i8), 3);
                this.C = av4Var9;
                this.r = av4Var9;
                this.s = av4Var9;
                this.t = av4Var9;
                this.u = av4Var9;
                this.v = av4Var9;
                this.w = av4Var9;
                this.x = av4Var9;
                this.y = av4Var9;
                this.z = i4;
                this.A = z;
                this.B = 13;
                if (t4.w(this) != lu3Var) {
                }
                break;
            case 13:
                z2 = this.A;
                i = this.z;
                y6a.M(obj);
                lu3Var = lu3Var2;
                av4Var10 = null;
                ugj.a.getClass();
                Unit unit32 = Unit.a;
                r52 = av4Var10;
                r2 = this.D.p;
                if (r2 != 0) {
                }
                syncWorker = this.D;
                this.C = r52;
                this.r = r52;
                this.s = r52;
                this.t = r52;
                this.u = r52;
                this.v = r52;
                this.w = r52;
                this.x = r52;
                this.y = r52;
                this.z = i;
                this.A = z2;
                this.B = 14;
                if (syncWorker.g(this) == lu3Var) {
                }
                return Unit.a;
            case 14:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
