package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.ProfileData;
import defpackage.a70;
import defpackage.bfk;
import defpackage.dhk;
import defpackage.jdb;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.lu3;
import defpackage.mha;
import defpackage.nf6;
import defpackage.rf4;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.t53;
import defpackage.v2g;
import defpackage.vxd;
import defpackage.wi9;
import defpackage.x2g;
import defpackage.y6a;
import defpackage.zbf;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/results/service/ProfileWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Ldhk;", "userRepository", "Lbfk;", "userAccountManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ldhk;Lbfk;)V", "sha", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileWorker extends AbstractRetryCoroutineWorker {
    public final dhk b;
    public final bfk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull dhk dhkVar, @NotNull bfk bfkVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        dhkVar.getClass();
        bfkVar.getClass();
        this.b = dhkVar;
        this.c = bfkVar;
    }

    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    public final Object a(rq3 rq3Var) {
        return Intrinsics.c(getInputData().e("ACTION"), "SYNC") ? c((sq3) rq3Var) : jdb.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013a, code lost:
    
        if (r6.d(r2) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0076, code lost:
    
        if (r1 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0061, code lost:
    
        if (r1 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        zbf zbfVar;
        int i;
        UserAccount userAccount;
        x2g x2gVar;
        long j;
        ProfileData profileData;
        if (sq3Var instanceof zbf) {
            zbfVar = (zbf) sq3Var;
            int i2 = zbfVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zbfVar.x = i2 - Integer.MIN_VALUE;
                Object obj = zbfVar.v;
                Object obj2 = lu3.a;
                i = zbfVar.x;
                bfk bfkVar = this.c;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    zbfVar.x = 1;
                    obj = bfkVar.c(zbfVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            userAccount = zbfVar.r;
                            y6a.M(obj);
                            x2gVar = (x2g) obj;
                            if (!(x2gVar instanceof t2g)) {
                                if (!(x2gVar instanceof v2g)) {
                                    zzl.b();
                                    return null;
                                }
                                ProfileData profileData2 = (ProfileData) ((v2g) x2gVar).a;
                                long syncTimestamp = userAccount.getSyncTimestamp();
                                zbfVar.r = null;
                                zbfVar.s = x2gVar;
                                zbfVar.t = profileData2;
                                zbfVar.u = syncTimestamp;
                                zbfVar.x = 3;
                                j = syncTimestamp;
                                Object a = rf4.a(bfkVar.a).a(new t53(profileData2, rq3Var, rq3Var, rq3Var, 12), zbfVar);
                                if (a != obj2) {
                                    a = Unit.a;
                                }
                                if (a != obj2) {
                                    profileData = profileData2;
                                    if (profileData.getSyncTimestamp() > j) {
                                    }
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    ktd A = mha.A(new ktd(WeeklyChallengeWorker.class));
                                    mha.y(A);
                                    vxd.h(applicationContext).b("WeeklyChallengeWorker-".concat(""), nf6.a, (ltd) A.a());
                                }
                                return obj2;
                            }
                            if (!(x2gVar instanceof t2g)) {
                            }
                            return jdb.a();
                        }
                        if (i != 3) {
                            if (i != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            return jdb.a();
                        }
                        j = zbfVar.u;
                        profileData = zbfVar.t;
                        x2gVar = zbfVar.s;
                        y6a.M(obj);
                        if (profileData.getSyncTimestamp() > j) {
                            Context applicationContext2 = getApplicationContext();
                            applicationContext2.getClass();
                            ktd A2 = mha.A(new ktd(SyncWorker.class));
                            mha.y(A2);
                            vxd.h(applicationContext2).b("SyncWorker-".concat(""), nf6.a, (ltd) A2.a());
                        }
                        Context applicationContext3 = getApplicationContext();
                        applicationContext3.getClass();
                        ktd A3 = mha.A(new ktd(WeeklyChallengeWorker.class));
                        mha.y(A3);
                        vxd.h(applicationContext3).b("WeeklyChallengeWorker-".concat(""), nf6.a, (ltd) A3.a());
                        if (!(x2gVar instanceof t2g)) {
                            Throwable th = ((t2g) x2gVar).a;
                            if ((th instanceof wi9) && ((wi9) th).a == 404) {
                                zbfVar.r = null;
                                zbfVar.s = x2gVar;
                                zbfVar.t = null;
                                zbfVar.x = 4;
                            }
                        } else if (!(x2gVar instanceof v2g)) {
                            zzl.b();
                            return null;
                        }
                        return jdb.a();
                    }
                    y6a.M(obj);
                }
                userAccount = (UserAccount) obj;
                String id = userAccount.getId();
                zbfVar.r = userAccount;
                zbfVar.x = 2;
                obj = this.b.e(id, zbfVar);
            }
        }
        zbfVar = new zbf(this, sq3Var);
        Object obj3 = zbfVar.v;
        Object obj22 = lu3.a;
        i = zbfVar.x;
        bfk bfkVar2 = this.c;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        userAccount = (UserAccount) obj3;
        String id2 = userAccount.getId();
        zbfVar.r = userAccount;
        zbfVar.x = 2;
        obj3 = this.b.e(id2, zbfVar);
    }
}
