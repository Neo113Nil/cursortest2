package com.sofascore.results.service;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.model.network.response.UserRegionResponse;
import com.sofascore.results.branding.BrandingConfigWorker;
import defpackage.a52;
import defpackage.a5d;
import defpackage.a5f;
import defpackage.a70;
import defpackage.aba;
import defpackage.ad2;
import defpackage.aid;
import defpackage.b0a;
import defpackage.big;
import defpackage.cl;
import defpackage.cs2;
import defpackage.dhk;
import defpackage.dv3;
import defpackage.e64;
import defpackage.egk;
import defpackage.el;
import defpackage.fkk;
import defpackage.fyk;
import defpackage.gz8;
import defpackage.h42;
import defpackage.ihk;
import defpackage.irk;
import defpackage.jdb;
import defpackage.jid;
import defpackage.jx9;
import defpackage.ke0;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.lu3;
import defpackage.m1f;
import defpackage.m7c;
import defpackage.mha;
import defpackage.mme;
import defpackage.n9e;
import defpackage.nf6;
import defpackage.nge;
import defpackage.oci;
import defpackage.pci;
import defpackage.pdk;
import defpackage.qa6;
import defpackage.qci;
import defpackage.qv5;
import defpackage.rha;
import defpackage.rq3;
import defpackage.s38;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.u0a;
import defpackage.udl;
import defpackage.uic;
import defpackage.vxd;
import defpackage.waa;
import defpackage.wld;
import defpackage.x2g;
import defpackage.x42;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.z3k;
import defpackage.z4d;
import defpackage.zte;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u00ad\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/sofascore/results/service/StartWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Ldhk;", "userRepository", "Lm7c;", "mediaPostsRepository", "Lfyk;", "voteRepository", "Lzte;", "playerOfTheMatchVoteRepository", "Lirk;", "videoRepository", "Lcs2;", "chatMessageRepository", "Lz3k;", "tvChannelsRepository", "Lqa6;", "eventStageRepository", "Le64;", "crowdsourcingRepository", "Lel;", "adsRepository", "Ljid;", "notificationsSyncUseCase", "Lwld;", "oddsProviderInitializer", "Ljx9;", "inAppPurchaseBillingInitializer", "Lnge;", "pickemCheckTournamentsInitializer", "Lfkk;", "valuableUserInitializer", "Lihk;", "userSegmentationInitializer", "Lz4d;", "natsEventDao", "Ludl;", "cache", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ldhk;Lm7c;Lfyk;Lzte;Lirk;Lcs2;Lz3k;Lqa6;Le64;Lel;Ljid;Lwld;Ljx9;Lnge;Lfkk;Lihk;Lz4d;Ludl;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartWorker extends CoroutineWorker {
    public final dhk a;
    public final m7c b;
    public final fyk c;
    public final zte d;
    public final irk e;
    public final cs2 f;
    public final z3k g;
    public final qa6 h;
    public final e64 i;
    public final el j;
    public final jid k;
    public final wld l;
    public final jx9 m;
    public final nge n;
    public final fkk o;
    public final ihk p;
    public final z4d q;
    public final udl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull dhk dhkVar, @NotNull m7c m7cVar, @NotNull fyk fykVar, @NotNull zte zteVar, @NotNull irk irkVar, @NotNull cs2 cs2Var, @NotNull z3k z3kVar, @NotNull qa6 qa6Var, @NotNull e64 e64Var, @NotNull el elVar, @NotNull jid jidVar, @NotNull wld wldVar, @NotNull jx9 jx9Var, @NotNull nge ngeVar, @NotNull fkk fkkVar, @NotNull ihk ihkVar, @NotNull z4d z4dVar, @NotNull udl udlVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        dhkVar.getClass();
        m7cVar.getClass();
        fykVar.getClass();
        zteVar.getClass();
        irkVar.getClass();
        cs2Var.getClass();
        z3kVar.getClass();
        qa6Var.getClass();
        e64Var.getClass();
        elVar.getClass();
        jidVar.getClass();
        wldVar.getClass();
        jx9Var.getClass();
        ngeVar.getClass();
        fkkVar.getClass();
        ihkVar.getClass();
        z4dVar.getClass();
        udlVar.getClass();
        this.a = dhkVar;
        this.b = m7cVar;
        this.c = fykVar;
        this.d = zteVar;
        this.e = irkVar;
        this.f = cs2Var;
        this.g = z3kVar;
        this.h = qa6Var;
        this.i = e64Var;
        this.j = elVar;
        this.k = jidVar;
        this.l = wldVar;
        this.m = jx9Var;
        this.n = ngeVar;
        this.o = fkkVar;
        this.p = ihkVar;
        this.q = z4dVar;
        this.r = udlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        pci pciVar;
        int i;
        if (sq3Var instanceof pci) {
            pciVar = (pci) sq3Var;
            int i2 = pciVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pciVar.t = i2 - Integer.MIN_VALUE;
                Object obj = pciVar.r;
                lu3 lu3Var = lu3.a;
                i = pciVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pciVar.t = 1;
                    udl udlVar = this.r;
                    udlVar.getClass();
                    if (s9a.r(new pdk(udlVar, rq3Var, 9), pciVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ad2 ad2Var = qv5.a;
                qv5.a(a52.a);
                qv5.a(x42.a);
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                aba.E(applicationContext);
                return Unit.a;
            }
        }
        pciVar = new pci(this, sq3Var);
        Object obj2 = pciVar.r;
        lu3 lu3Var2 = lu3.a;
        i = pciVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        ad2 ad2Var2 = qv5.a;
        qv5.a(a52.a);
        qv5.a(x42.a);
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        aba.E(applicationContext2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
    
        r6 = kotlin.text.StringsKt__StringsKt.split$default(r9, new java.lang.String[]{"-"}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        qci qciVar;
        int i;
        long j;
        long j2;
        String str;
        int i2;
        SharedPreferences d;
        SharedPreferences d2;
        SharedPreferences d3;
        SharedPreferences d4;
        x2g x2gVar;
        UserRegionResponse userRegionResponse;
        SharedPreferences sharedPreferences;
        UserRegionResponse userRegionResponse2;
        long j3;
        long j4;
        x2g x2gVar2;
        List split$default;
        Context applicationContext;
        UserRegionResponse userRegionResponse3;
        SharedPreferences sharedPreferences2;
        SharedPreferences d5;
        if (sq3Var instanceof qci) {
            qciVar = (qci) sq3Var;
            int i3 = qciVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qciVar.z = i3 - Integer.MIN_VALUE;
                Object obj = qciVar.x;
                lu3 lu3Var = lu3.a;
                i = qciVar.z;
                int i4 = 3;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext3 = applicationContext2.getApplicationContext();
                        synchronized (uic.i) {
                            d4 = a5f.d(applicationContext3);
                            uic.j = d4;
                        }
                        d4.getClass();
                        sharedPreferences3 = d4;
                    }
                    int i5 = sharedPreferences3.getInt("PREF_DEV_MODE_MCC", 0);
                    if (i5 > 0) {
                        Context applicationContext4 = getApplicationContext();
                        applicationContext4.getClass();
                        rha.D(applicationContext4);
                        return Unit.a;
                    }
                    long w = yaa.w();
                    Context applicationContext5 = getApplicationContext();
                    applicationContext5.getClass();
                    SharedPreferences sharedPreferences4 = uic.j;
                    if (sharedPreferences4 == null) {
                        Context applicationContext6 = applicationContext5.getApplicationContext();
                        synchronized (uic.i) {
                            d3 = a5f.d(applicationContext6);
                            uic.j = d3;
                        }
                        d3.getClass();
                        sharedPreferences4 = d3;
                    }
                    long j5 = sharedPreferences4.getLong("REGION_USER_LAST_TIMESTAMP", 0L);
                    if (w - j5 > 86400) {
                        Context applicationContext7 = getApplicationContext();
                        applicationContext7.getClass();
                        if (waa.D(applicationContext7)) {
                            Context applicationContext8 = getApplicationContext();
                            applicationContext8.getClass();
                            SharedPreferences sharedPreferences5 = uic.j;
                            if (sharedPreferences5 == null) {
                                Context applicationContext9 = applicationContext8.getApplicationContext();
                                synchronized (uic.i) {
                                    d2 = a5f.d(applicationContext9);
                                    uic.j = d2;
                                }
                                d2.getClass();
                                sharedPreferences5 = d2;
                            }
                            SharedPreferences.Editor edit = sharedPreferences5.edit();
                            edit.getClass();
                            edit.putLong("REGION_USER_LAST_TIMESTAMP", w);
                            Unit unit = Unit.a;
                            edit.apply();
                            Context applicationContext10 = getApplicationContext();
                            applicationContext10.getClass();
                            SharedPreferences sharedPreferences6 = uic.j;
                            if (sharedPreferences6 == null) {
                                Context applicationContext11 = applicationContext10.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext11);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences6 = d;
                            }
                            String string = sharedPreferences6.getString("REGION_USER_COUNTRY_ALPHA", null);
                            dhk dhkVar = this.a;
                            qciVar.u = string;
                            qciVar.r = i5;
                            qciVar.s = w;
                            qciVar.t = j5;
                            qciVar.z = 1;
                            dhkVar.getClass();
                            Object P = yaa.P(new egk(dhkVar, rq3Var, i4), qciVar);
                            if (P != lu3Var) {
                                j = w;
                                j2 = j5;
                                str = string;
                                i2 = i5;
                                obj = P;
                            }
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        userRegionResponse3 = qciVar.w;
                        y6a.M(obj);
                        userRegionResponse = userRegionResponse3;
                        Context applicationContext12 = getApplicationContext();
                        applicationContext12.getClass();
                        rha.D(applicationContext12);
                        Context applicationContext13 = getApplicationContext();
                        applicationContext13.getClass();
                        if (userRegionResponse != null) {
                            n9e.u(applicationContext13, new mme(userRegionResponse, 22));
                        }
                        return Unit.a;
                    }
                    j3 = qciVar.t;
                    j4 = qciVar.s;
                    i2 = qciVar.r;
                    userRegionResponse2 = qciVar.w;
                    x2gVar2 = qciVar.v;
                    str = qciVar.u;
                    y6a.M(obj);
                    Context applicationContext14 = getApplicationContext();
                    applicationContext14.getClass();
                    sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext15 = applicationContext14.getApplicationContext();
                        synchronized (uic.i) {
                            d5 = a5f.d(applicationContext15);
                            uic.j = d5;
                        }
                        d5.getClass();
                        sharedPreferences2 = d5;
                    }
                    if (!sharedPreferences2.getBoolean("UserHasCustomizedSportOrder", false)) {
                        Context applicationContext16 = getApplicationContext();
                        applicationContext16.getClass();
                        ktd A = mha.A(new ktd(OrderedSportsWorker.class));
                        mha.y(A);
                        vxd.h(applicationContext16).b("OrderedSportsWorker-".concat(""), nf6.a, (ltd) A.a());
                    }
                    ad2 ad2Var = qv5.a;
                    qv5.a(h42.a);
                    x2gVar = x2gVar2;
                    userRegionResponse = userRegionResponse2;
                    j = j4;
                    j2 = j3;
                    if (x2gVar instanceof t2g) {
                        s38.a().c(((t2g) x2gVar).a);
                    }
                    applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    if (b0a.G(applicationContext) == null) {
                        Context applicationContext17 = getApplicationContext();
                        applicationContext17.getClass();
                        b0a.P(applicationContext17, dv3.c());
                    }
                    if (str == null) {
                        Context applicationContext18 = getApplicationContext();
                        applicationContext18.getClass();
                        String G = b0a.G(applicationContext18);
                        if (G != null) {
                            z4d z4dVar = this.q;
                            qciVar.u = null;
                            qciVar.v = null;
                            qciVar.w = userRegionResponse;
                            qciVar.r = i2;
                            qciVar.s = j;
                            qciVar.t = j2;
                            qciVar.z = 3;
                            a5d a5dVar = (a5d) z4dVar;
                            Object T = gz8.T(qciVar, a5dVar.a, new cl(a5dVar, G, null, 18));
                            if (T != lu3Var) {
                                T = Unit.a;
                            }
                            if (T != lu3Var) {
                                userRegionResponse3 = userRegionResponse;
                                userRegionResponse = userRegionResponse3;
                            }
                            return lu3Var;
                        }
                    }
                    Context applicationContext122 = getApplicationContext();
                    applicationContext122.getClass();
                    rha.D(applicationContext122);
                    Context applicationContext132 = getApplicationContext();
                    applicationContext132.getClass();
                    if (userRegionResponse != null) {
                    }
                    return Unit.a;
                }
                j2 = qciVar.t;
                j = qciVar.s;
                i2 = qciVar.r;
                String str2 = qciVar.u;
                y6a.M(obj);
                str = str2;
                x2gVar = (x2g) obj;
                userRegionResponse = (UserRegionResponse) yaa.x(x2gVar);
                if (userRegionResponse != null) {
                    Context applicationContext19 = getApplicationContext();
                    applicationContext19.getClass();
                    SharedPreferences sharedPreferences7 = uic.j;
                    if (sharedPreferences7 == null) {
                        Context applicationContext20 = applicationContext19.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext20);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    } else {
                        sharedPreferences = sharedPreferences7;
                    }
                    String string2 = sharedPreferences.getString("REGION_ANALYTICS_REGION", "");
                    if (string2 == null || !string2.equals(userRegionResponse.getRegionCode()) || !dv3.c().equals(userRegionResponse.getAlpha2())) {
                        Context applicationContext21 = getApplicationContext();
                        applicationContext21.getClass();
                        String regionCode = userRegionResponse.getRegionCode();
                        String str3 = (regionCode == null || split$default == null) ? null : (String) CollectionsKt.j0(split$default);
                        b0a.Q(applicationContext21, str3);
                        Context applicationContext22 = getApplicationContext();
                        applicationContext22.getClass();
                        b0a.P(applicationContext22, userRegionResponse.getAlpha2());
                        Calendar calendar = ke0.a;
                        Context applicationContext23 = getApplicationContext();
                        applicationContext23.getClass();
                        ke0.e(applicationContext23);
                        Context applicationContext24 = getApplicationContext();
                        applicationContext24.getClass();
                        u0a.C(applicationContext24);
                        udl udlVar = this.r;
                        qciVar.u = str;
                        qciVar.v = x2gVar;
                        qciVar.w = userRegionResponse;
                        qciVar.r = i2;
                        qciVar.s = j;
                        qciVar.t = j2;
                        qciVar.z = 2;
                        if (udlVar.f(qciVar) != lu3Var) {
                            long j6 = j;
                            userRegionResponse2 = userRegionResponse;
                            j3 = j2;
                            j4 = j6;
                            x2gVar2 = x2gVar;
                            Context applicationContext142 = getApplicationContext();
                            applicationContext142.getClass();
                            sharedPreferences2 = uic.j;
                            if (sharedPreferences2 == null) {
                            }
                            if (!sharedPreferences2.getBoolean("UserHasCustomizedSportOrder", false)) {
                            }
                            ad2 ad2Var2 = qv5.a;
                            qv5.a(h42.a);
                            x2gVar = x2gVar2;
                            userRegionResponse = userRegionResponse2;
                            j = j4;
                            j2 = j3;
                        }
                        return lu3Var;
                    }
                }
                if (x2gVar instanceof t2g) {
                }
                applicationContext = getApplicationContext();
                applicationContext.getClass();
                if (b0a.G(applicationContext) == null) {
                }
                if (str == null) {
                }
                Context applicationContext1222 = getApplicationContext();
                applicationContext1222.getClass();
                rha.D(applicationContext1222);
                Context applicationContext1322 = getApplicationContext();
                applicationContext1322.getClass();
                if (userRegionResponse != null) {
                }
                return Unit.a;
            }
        }
        qciVar = new qci(this, sq3Var);
        Object obj2 = qciVar.x;
        lu3 lu3Var2 = lu3.a;
        i = qciVar.z;
        int i42 = 3;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        userRegionResponse = (UserRegionResponse) yaa.x(x2gVar);
        if (userRegionResponse != null) {
        }
        if (x2gVar instanceof t2g) {
        }
        applicationContext = getApplicationContext();
        applicationContext.getClass();
        if (b0a.G(applicationContext) == null) {
        }
        if (str == null) {
        }
        Context applicationContext12222 = getApplicationContext();
        applicationContext12222.getClass();
        rha.D(applicationContext12222);
        Context applicationContext13222 = getApplicationContext();
        applicationContext13222.getClass();
        if (userRegionResponse != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (a(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (defpackage.tz9.P(r12, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (b(r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        oci ociVar;
        int i;
        if (rq3Var instanceof oci) {
            ociVar = (oci) rq3Var;
            int i2 = ociVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ociVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ociVar.r;
                Object obj2 = lu3.a;
                i = ociVar.t;
                int i3 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    ociVar.t = 1;
                } else if (i == 1) {
                    y6a.M(obj);
                } else if (i == 2) {
                    y6a.M(obj);
                    ociVar.t = 3;
                    Object r = s9a.r(new big(this, rq3Var2, 27), ociVar);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                } else if (i == 3) {
                    y6a.M(obj);
                    ociVar.t = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            y6a.M(obj);
                            return jdb.a();
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    ociVar.t = 5;
                    jid jidVar = this.k;
                    jidVar.getClass();
                    Object r2 = s9a.r(new aid(jidVar, applicationContext, rq3Var2, i3), ociVar);
                    if (r2 != obj2) {
                        r2 = Unit.a;
                    }
                }
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                ktd A = mha.A(new ktd(BrandingConfigWorker.class));
                mha.y(A);
                vxd.h(applicationContext2).b("BrandingConfigWorker-".concat(""), nf6.a, (ltd) A.a());
                m1f m1fVar = new m1f(this, rq3Var2, 23);
                ociVar.t = 2;
            }
        }
        ociVar = new oci(this, (sq3) rq3Var);
        Object obj3 = ociVar.r;
        Object obj22 = lu3.a;
        i = ociVar.t;
        int i32 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        Context applicationContext22 = getApplicationContext();
        applicationContext22.getClass();
        ktd A2 = mha.A(new ktd(BrandingConfigWorker.class));
        mha.y(A2);
        vxd.h(applicationContext22).b("BrandingConfigWorker-".concat(""), nf6.a, (ltd) A2.a());
        m1f m1fVar2 = new m1f(this, rq3Var22, 23);
        ociVar.t = 2;
    }
}
