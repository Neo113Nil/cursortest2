package com.sofascore.results.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.newNetwork.UserInitResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.SyncNetworkResponse;
import com.sofascore.model.profile.UserInfoRequest;
import defpackage.a3l;
import defpackage.a5f;
import defpackage.a70;
import defpackage.ad2;
import defpackage.aid;
import defpackage.bfk;
import defpackage.dhk;
import defpackage.dla;
import defpackage.dv3;
import defpackage.e42;
import defpackage.egk;
import defpackage.f42;
import defpackage.fyk;
import defpackage.fzh;
import defpackage.gdb;
import defpackage.gz8;
import defpackage.hdb;
import defpackage.hvf;
import defpackage.i2g;
import defpackage.iii;
import defpackage.ivf;
import defpackage.j52;
import defpackage.jca;
import defpackage.jdb;
import defpackage.jid;
import defpackage.jvf;
import defpackage.k42;
import defpackage.ke0;
import defpackage.kvf;
import defpackage.l42;
import defpackage.lu3;
import defpackage.lvf;
import defpackage.m42;
import defpackage.mvf;
import defpackage.n42;
import defpackage.ngk;
import defpackage.nxk;
import defpackage.o42;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.tub;
import defpackage.uic;
import defpackage.v2g;
import defpackage.wi9;
import defpackage.wt3;
import defpackage.x2g;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.zte;
import defpackage.zzl;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BU\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sofascore/results/service/RegistrationWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lbfk;", "userAccountManager", "Ldhk;", "userRepository", "Landroid/content/SharedPreferences;", "preferences", "Lfyk;", "voteRepository", "Lzte;", "playerOfTheMatchVoteRepository", "La3l;", "weeklyChallengeRepository", "Ljid;", "notificationsSyncUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lbfk;Ldhk;Landroid/content/SharedPreferences;Lfyk;Lzte;La3l;Ljid;)V", "u0a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationWorker extends AbstractRetryCoroutineWorker {
    public final bfk b;
    public final dhk c;
    public final SharedPreferences d;
    public final fyk e;
    public final zte f;
    public final a3l g;
    public final jid h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull bfk bfkVar, @NotNull dhk dhkVar, @NotNull SharedPreferences sharedPreferences, @NotNull fyk fykVar, @NotNull zte zteVar, @NotNull a3l a3lVar, @NotNull jid jidVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        bfkVar.getClass();
        dhkVar.getClass();
        sharedPreferences.getClass();
        fykVar.getClass();
        zteVar.getClass();
        a3lVar.getClass();
        jidVar.getClass();
        this.b = bfkVar;
        this.c = dhkVar;
        this.d = sharedPreferences;
        this.e = fykVar;
        this.f = zteVar;
        this.g = a3lVar;
        this.h = jidVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    public final Object a(rq3 rq3Var) {
        String e = getInputData().e("ACTION");
        if (e == null) {
            return jdb.a();
        }
        switch (e.hashCode()) {
            case -2043999862:
                if (e.equals("LOGOUT")) {
                    return h((sq3) rq3Var);
                }
                break;
            case 2251950:
                if (e.equals("INFO")) {
                    return e((sq3) rq3Var);
                }
                break;
            case 2252048:
                if (e.equals("INIT")) {
                    return f((sq3) rq3Var);
                }
                break;
            case 72611657:
                if (e.equals("LOGIN")) {
                    return g((sq3) rq3Var);
                }
                break;
            case 1112890233:
                if (e.equals("DELETE_ACCOUNT")) {
                    return d((sq3) rq3Var);
                }
                break;
            case 1803427515:
                if (e.equals("REFRESH")) {
                    return i((sq3) rq3Var);
                }
                break;
        }
        return new gdb();
    }

    public final UserInfoRequest c(boolean z) {
        String str;
        getApplicationContext().getClass();
        SharedPreferences sharedPreferences = this.d;
        if (z) {
            String string = sharedPreferences.getString("DEV_NAME", Build.MODEL + " " + Build.MANUFACTURER);
            if (string == null) {
                string = "";
            }
            str = string;
        } else {
            str = null;
        }
        String string2 = sharedPreferences.getString("REGION_USER_LAST_REGION", null);
        int parseInt = Integer.parseInt(iii.H(6, "260720003"));
        int i = Build.VERSION.SDK_INT;
        String a = dla.a();
        String c = dv3.c();
        Calendar calendar = ke0.a;
        return new UserInfoRequest("android", parseInt, i, a, c, ke0.c(), str, string2, null, sharedPreferences.getString("ADVERTISING_ID", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        hvf hvfVar;
        int i;
        x2g x2gVar;
        if (sq3Var instanceof hvf) {
            hvfVar = (hvf) sq3Var;
            int i2 = hvfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hvfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = hvfVar.r;
                lu3 lu3Var = lu3.a;
                i = hvfVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hvfVar.t = 1;
                    dhk dhkVar = this.c;
                    dhkVar.getClass();
                    obj = yaa.P(new egk(dhkVar, rq3Var, 0), hvfVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    ad2 ad2Var = qv5.a;
                    qv5.a(f42.a);
                } else {
                    if (!(x2gVar instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    ad2 ad2Var2 = qv5.a;
                    qv5.a(e42.a);
                }
                return jdb.a();
            }
        }
        hvfVar = new hvf(this, sq3Var);
        Object obj2 = hvfVar.r;
        lu3 lu3Var2 = lu3.a;
        i = hvfVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof v2g)) {
        }
        return jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        ivf ivfVar;
        int i;
        RegistrationWorker registrationWorker;
        if (sq3Var instanceof ivf) {
            ivfVar = (ivf) sq3Var;
            int i2 = ivfVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ivfVar.u = i2 - Integer.MIN_VALUE;
                Object obj = ivfVar.s;
                Object obj2 = lu3.a;
                i = ivfVar.u;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    ivfVar.r = this;
                    ivfVar.u = 1;
                    obj = this.b.c(ivfVar);
                    if (obj != obj2) {
                        registrationWorker = this;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    return !(((x2g) obj) instanceof v2g) ? new hdb() : jdb.a();
                }
                registrationWorker = ivfVar.r;
                y6a.M(obj);
                UserInfoRequest c = registrationWorker.c(jca.M((UserAccount) obj));
                ivfVar.r = null;
                ivfVar.u = 2;
                dhk dhkVar = this.c;
                dhkVar.getClass();
                obj = yaa.P(new ngk(dhkVar, c, rq3Var, i3), ivfVar);
            }
        }
        ivfVar = new ivf(this, sq3Var);
        Object obj3 = ivfVar.s;
        Object obj22 = lu3.a;
        i = ivfVar.u;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        UserInfoRequest c2 = registrationWorker.c(jca.M((UserAccount) obj3));
        ivfVar.r = null;
        ivfVar.u = 2;
        dhk dhkVar2 = this.c;
        dhkVar2.getClass();
        obj3 = yaa.P(new ngk(dhkVar2, c2, rq3Var2, i32), ivfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        jvf jvfVar;
        int i;
        UserAccount userAccount;
        SharedPreferences d;
        if (sq3Var instanceof jvf) {
            jvfVar = (jvf) sq3Var;
            int i2 = jvfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jvfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = jvfVar.r;
                Object obj2 = lu3.a;
                i = jvfVar.t;
                int i3 = 0;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    bfk bfkVar = this.b;
                    jvfVar.t = 1;
                    obj = bfkVar.c(jvfVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return jdb.a();
                    }
                    y6a.M(obj);
                    x2g x2gVar = (x2g) obj;
                    if (!(x2gVar instanceof v2g)) {
                        if (x2gVar instanceof t2g) {
                            return new hdb();
                        }
                        zzl.b();
                        return null;
                    }
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    String token = ((UserInitResponse) ((v2g) x2gVar).a).getToken();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    if (token == null) {
                        edit.remove("AUTH_TOKEN");
                    } else {
                        edit.putString("AUTH_TOKEN", token);
                    }
                    Unit unit = Unit.a;
                    edit.apply();
                    wt3.v(this.d, "INIT_DONE", true);
                    jid jidVar = this.h;
                    Context applicationContext3 = getApplicationContext();
                    applicationContext3.getClass();
                    jvfVar.t = 3;
                    jidVar.getClass();
                    obj = s9a.r(new aid(jidVar, applicationContext3, rq3Var, i3), jvfVar);
                }
                userAccount = (UserAccount) obj;
                UserInfoRequest c = c(jca.M(userAccount));
                Calendar calendar = ke0.a;
                Context applicationContext4 = getApplicationContext();
                applicationContext4.getClass();
                c.setUuid(ke0.d(applicationContext4));
                if (userAccount.getIsLoggedIn()) {
                    c.setKeepOldData(Boolean.TRUE);
                }
                dhk dhkVar = this.c;
                jvfVar.t = 2;
                dhkVar.getClass();
                obj = yaa.P(new ngk(dhkVar, c, rq3Var, i3), jvfVar);
            }
        }
        jvfVar = new jvf(this, sq3Var);
        Object obj3 = jvfVar.r;
        Object obj22 = lu3.a;
        i = jvfVar.t;
        int i32 = 0;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        userAccount = (UserAccount) obj3;
        UserInfoRequest c2 = c(jca.M(userAccount));
        Calendar calendar2 = ke0.a;
        Context applicationContext42 = getApplicationContext();
        applicationContext42.getClass();
        c2.setUuid(ke0.d(applicationContext42));
        if (userAccount.getIsLoggedIn()) {
        }
        dhk dhkVar2 = this.c;
        jvfVar.t = 2;
        dhkVar2.getClass();
        obj3 = yaa.P(new ngk(dhkVar2, c2, rq3Var2, i32), jvfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (defpackage.jid.c(r10.h, r11, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r10.f.b(r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0092, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        kvf kvfVar;
        int i;
        String string;
        ProfileData profileData;
        if (sq3Var instanceof kvf) {
            kvfVar = (kvf) sq3Var;
            int i2 = kvfVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kvfVar.u = i2 - Integer.MIN_VALUE;
                Object obj = kvfVar.s;
                Object obj2 = lu3.a;
                i = kvfVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    kvfVar.u = 1;
                    obj = this.b.c(kvfVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i == 2) {
                        y6a.M(obj);
                        x2g x2gVar = (x2g) obj;
                        boolean z = x2gVar instanceof v2g;
                        j52 j52Var = k42.a;
                        if (z) {
                            ProfileData userAccount = ((SyncNetworkResponse) ((v2g) x2gVar).a).getUserAccount();
                            if (userAccount == null) {
                                return new gdb();
                            }
                            String id = userAccount.getId();
                            if (id != null && id.length() != 0) {
                                kvfVar.r = userAccount;
                                kvfVar.u = 3;
                                if (this.e.b(kvfVar) != obj2) {
                                    profileData = userAccount;
                                    kvfVar.r = profileData;
                                    kvfVar.u = 4;
                                }
                                return obj2;
                            }
                            qv5.a(j52Var);
                        } else {
                            if (!(x2gVar instanceof t2g)) {
                                zzl.b();
                                return null;
                            }
                            Throwable th = ((t2g) x2gVar).a;
                            if (th instanceof wi9) {
                                wi9 wi9Var = (wi9) th;
                                i2g i2gVar = wi9Var.c.c;
                                if (i2gVar == null || (string = i2gVar.string()) == null) {
                                    return new gdb();
                                }
                                if (wi9Var.a == 422 && StringsKt.J(string, "UserAccount deleted", false)) {
                                    j52Var = l42.a;
                                }
                                qv5.a(j52Var);
                            } else {
                                qv5.a(j52Var);
                            }
                        }
                        return jdb.a();
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            ad2 ad2Var = qv5.a;
                            qv5.a(m42.a);
                            return jdb.a();
                        }
                        profileData = kvfVar.r;
                        y6a.M(obj);
                        List<Integer> pinnedLeagues = profileData.getPinnedLeagues();
                        if (pinnedLeagues == null || pinnedLeagues.isEmpty()) {
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            kvfVar.r = null;
                            kvfVar.u = 5;
                        }
                        ad2 ad2Var2 = qv5.a;
                        qv5.a(m42.a);
                        return jdb.a();
                    }
                    profileData = kvfVar.r;
                    y6a.M(obj);
                    kvfVar.r = profileData;
                    kvfVar.u = 4;
                }
                UserAccount userAccount2 = (UserAccount) obj;
                HashMap f = tub.f(new Pair("type", userAccount2.getType()), new Pair("accessToken", userAccount2.getToken()));
                kvfVar.u = 2;
                dhk dhkVar = this.c;
                dhkVar.getClass();
                obj = yaa.P(new fzh(dhkVar, f, rq3Var, 10), kvfVar);
            }
        }
        kvfVar = new kvf(this, sq3Var);
        Object obj3 = kvfVar.s;
        Object obj22 = lu3.a;
        i = kvfVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        UserAccount userAccount22 = (UserAccount) obj3;
        HashMap f2 = tub.f(new Pair("type", userAccount22.getType()), new Pair("accessToken", userAccount22.getToken()));
        kvfVar.u = 2;
        dhk dhkVar2 = this.c;
        dhkVar2.getClass();
        obj3 = yaa.P(new fzh(dhkVar2, f2, rq3Var2, 10), kvfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r10.b.d(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r10.f.b(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r10.e.b(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(sq3 sq3Var) {
        lvf lvfVar;
        int i;
        x2g x2gVar;
        if (sq3Var instanceof lvf) {
            lvfVar = (lvf) sq3Var;
            int i2 = lvfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lvfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = lvfVar.r;
                lu3 lu3Var = lu3.a;
                i = lvfVar.t;
                rq3 rq3Var = null;
                int i3 = 3;
                if (i != 0) {
                    y6a.M(obj);
                    lvfVar.t = 1;
                    dhk dhkVar = this.c;
                    dhkVar.getClass();
                    obj = yaa.P(new egk(dhkVar, rq3Var, 7), lvfVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else if (i == 2) {
                    y6a.M(obj);
                    lvfVar.t = 3;
                } else if (i == 3) {
                    y6a.M(obj);
                    lvfVar.t = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(o42.a);
                        return jdb.a();
                    }
                    y6a.M(obj);
                    lvfVar.t = 5;
                }
                x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    if (!(x2gVar instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    ad2 ad2Var2 = qv5.a;
                    qv5.a(n42.a);
                    return jdb.a();
                }
                lvfVar.t = 2;
                Object U = gz8.U(lvfVar, this.g.b.a, false, true, new nxk(i3));
                if (U != lu3Var) {
                    U = Unit.a;
                }
                if (U != lu3Var) {
                    U = Unit.a;
                }
            }
        }
        lvfVar = new lvf(this, sq3Var);
        Object obj2 = lvfVar.r;
        lu3 lu3Var2 = lu3.a;
        i = lvfVar.t;
        rq3 rq3Var2 = null;
        int i32 = 3;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar instanceof v2g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(sq3 sq3Var) {
        mvf mvfVar;
        int i;
        UserInitResponse userInitResponse;
        SharedPreferences d;
        if (sq3Var instanceof mvf) {
            mvfVar = (mvf) sq3Var;
            int i2 = mvfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mvfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = mvfVar.r;
                lu3 lu3Var = lu3.a;
                i = mvfVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.i) {
                        return jdb.a();
                    }
                    this.i = true;
                    dhk dhkVar = this.c;
                    mvfVar.t = 1;
                    dhkVar.getClass();
                    obj = yaa.P(new egk(dhkVar, rq3Var, 6), mvfVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                userInitResponse = (UserInitResponse) yaa.x((x2g) obj);
                if (userInitResponse != null) {
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    String token = userInitResponse.getToken();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    if (token == null) {
                        edit.remove("AUTH_TOKEN");
                    } else {
                        edit.putString("AUTH_TOKEN", token);
                    }
                    Unit unit = Unit.a;
                    edit.apply();
                }
                this.i = false;
                return jdb.a();
            }
        }
        mvfVar = new mvf(this, sq3Var);
        Object obj2 = mvfVar.r;
        lu3 lu3Var2 = lu3.a;
        i = mvfVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        userInitResponse = (UserInitResponse) yaa.x((x2g) obj2);
        if (userInitResponse != null) {
        }
        this.i = false;
        return jdb.a();
    }
}
