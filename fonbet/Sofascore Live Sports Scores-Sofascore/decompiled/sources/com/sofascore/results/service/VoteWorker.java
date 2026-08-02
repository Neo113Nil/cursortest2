package com.sofascore.results.service;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.newNetwork.ChangeEventVoteBody;
import defpackage.a70;
import defpackage.c64;
import defpackage.fyk;
import defpackage.gyk;
import defpackage.gz8;
import defpackage.hdb;
import defpackage.hyk;
import defpackage.iyk;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.v2g;
import defpackage.wi9;
import defpackage.x2g;
import defpackage.y51;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/service/VoteWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lfyk;", "voteRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lfyk;)V", "z1a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VoteWorker extends AbstractRetryCoroutineWorker {
    public final fyk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoteWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull fyk fykVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        fykVar.getClass();
        this.b = fykVar;
    }

    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    public final Object a(rq3 rq3Var) {
        String e = getInputData().e("ACTION");
        if (Intrinsics.c(e, "ADD_VOTE")) {
            int a = getInputData().a("EVENT_ID", 0);
            long c = getInputData().c("EVENT_TIMESTAMP", 0L);
            String e2 = getInputData().e("CHOICE");
            String str = e2 == null ? "" : e2;
            VoteType fromOrdinal = VoteType.INSTANCE.getFromOrdinal(getInputData().a("VOTE_TYPE", 0));
            if (fromOrdinal == null) {
                fromOrdinal = VoteType.WHO_WILL_WIN;
            }
            return c(a, c, str, fromOrdinal, (sq3) rq3Var);
        }
        if (!Intrinsics.c(e, "CHANGE_VOTE")) {
            return jdb.a();
        }
        int a2 = getInputData().a("EVENT_ID", 0);
        String e3 = getInputData().e("CHOICE");
        if (e3 == null) {
            e3 = "";
        }
        String e4 = getInputData().e("OLD_CHOICE");
        String str2 = e4 == null ? "" : e4;
        VoteType fromOrdinal2 = VoteType.INSTANCE.getFromOrdinal(getInputData().a("VOTE_TYPE", 0));
        if (fromOrdinal2 == null) {
            fromOrdinal2 = VoteType.WHO_WILL_WIN;
        }
        return d(a2, e3, str2, fromOrdinal2, (sq3) rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, long j, String str, VoteType voteType, sq3 sq3Var) {
        gyk gykVar;
        int i2;
        x2g x2gVar;
        if (sq3Var instanceof gyk) {
            gykVar = (gyk) sq3Var;
            int i3 = gykVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gykVar.t = i3 - Integer.MIN_VALUE;
                gyk gykVar2 = gykVar;
                Object obj = gykVar2.r;
                lu3 lu3Var = lu3.a;
                i2 = gykVar2.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    gykVar2.t = 1;
                    obj = this.b.a(i, str, j, voteType, null, gykVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    return jdb.a();
                }
                if (x2gVar instanceof t2g) {
                    return ((t2g) x2gVar).a instanceof wi9 ? jdb.a() : new hdb();
                }
                zzl.b();
                return null;
            }
        }
        gykVar = new gyk(this, sq3Var);
        gyk gykVar22 = gykVar;
        Object obj2 = gykVar22.r;
        lu3 lu3Var2 = lu3.a;
        i2 = gykVar22.t;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof v2g)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r0 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, String str, String str2, VoteType voteType, sq3 sq3Var) {
        hyk hykVar;
        int i2;
        if (sq3Var instanceof hyk) {
            hykVar = (hyk) sq3Var;
            int i3 = hykVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hykVar.x = i3 - Integer.MIN_VALUE;
                hyk hykVar2 = hykVar;
                Object obj = hykVar2.v;
                Object obj2 = lu3.a;
                i2 = hykVar2.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    hykVar2.s = str;
                    hykVar2.t = str2;
                    hykVar2.u = voteType;
                    hykVar2.r = i;
                    hykVar2.x = 1;
                    Object U = gz8.U(hykVar2, this.b.a.a, false, true, new y51(str, i, voteType.getValue(), 15));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = hykVar2.r;
                    voteType = hykVar2.u;
                    str2 = hykVar2.t;
                    str = hykVar2.s;
                    y6a.M(obj);
                }
                hykVar2.s = null;
                hykVar2.t = null;
                hykVar2.u = null;
                hykVar2.r = i;
                hykVar2.x = 2;
                Object e = e(i, str, str2, voteType, hykVar2);
                return e != obj2 ? obj2 : e;
            }
        }
        hykVar = new hyk(this, sq3Var);
        hyk hykVar22 = hykVar;
        Object obj3 = hykVar22.v;
        Object obj22 = lu3.a;
        i2 = hykVar22.x;
        if (i2 != 0) {
        }
        hykVar22.s = null;
        hykVar22.t = null;
        hykVar22.u = null;
        hykVar22.r = i;
        hykVar22.x = 2;
        Object e2 = e(i, str, str2, voteType, hykVar22);
        if (e2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8.g(r14, true, r1) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8.g(r14, r13, r1) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if (r0 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, String str, String str2, VoteType voteType, sq3 sq3Var) {
        iyk iykVar;
        int i2;
        x2g x2gVar;
        if (sq3Var instanceof iyk) {
            iykVar = (iyk) sq3Var;
            int i3 = iykVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iykVar.u = i3 - Integer.MIN_VALUE;
                Object obj = iykVar.s;
                lu3 lu3Var = lu3.a;
                i2 = iykVar.u;
                fyk fykVar = this.b;
                if (i2 != 0) {
                    y6a.M(obj);
                    ChangeEventVoteBody changeEventVoteBody = new ChangeEventVoteBody(str2, str, voteType.getSerializedValue());
                    iykVar.r = i;
                    iykVar.u = 1;
                    fykVar.getClass();
                    obj = yaa.P(new c64(fykVar, i, changeEventVoteBody, (rq3) null, 22), iykVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return jdb.a();
                        }
                        if (i2 == 3) {
                            y6a.M(obj);
                            return jdb.a();
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = iykVar.r;
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    iykVar.r = i;
                    iykVar.u = 2;
                } else {
                    if (!(x2gVar instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    Throwable th = ((t2g) x2gVar).a;
                    if (!(th instanceof wi9)) {
                        return new hdb();
                    }
                    boolean z = ((wi9) th).a == 403;
                    iykVar.r = i;
                    iykVar.u = 3;
                }
                return lu3Var;
            }
        }
        iykVar = new iyk(this, sq3Var);
        Object obj2 = iykVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = iykVar.u;
        fyk fykVar2 = this.b;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof v2g)) {
        }
        return lu3Var2;
    }
}
