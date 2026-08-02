package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.a70;
import defpackage.au3;
import defpackage.big;
import defpackage.g8h;
import defpackage.hs4;
import defpackage.idb;
import defpackage.inb;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.m8h;
import defpackage.md4;
import defpackage.ogj;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.uij;
import defpackage.v8h;
import defpackage.wca;
import defpackage.ww9;
import defpackage.y6a;
import defpackage.z45;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lg8h;", "sessionManager", "Luij;", "timeouts", "Lau3;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lg8h;Luij;Lau3;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters a;
    public final g8h b;
    public final uij c;
    public final au3 d;
    public final String e;

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull g8h g8hVar, @NotNull uij uijVar, @NotNull au3 au3Var) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = g8hVar;
        this.c = uijVar;
        this.d = au3Var;
        md4 inputData = getInputData();
        g8hVar.getClass();
        String e = inputData.e("KEY");
        if (e != null) {
            this.e = e;
        } else {
            a70.r("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        v8h v8hVar;
        int i;
        jdb jdbVar;
        if (rq3Var instanceof v8h) {
            v8hVar = (v8h) rq3Var;
            int i2 = v8hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v8hVar.t = i2 - Integer.MIN_VALUE;
                Object obj = v8hVar.r;
                lu3 lu3Var = lu3.a;
                i = v8hVar.t;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    this.c.getClass();
                    ogj ogjVar = inb.m;
                    big bigVar = new big(this, rq3Var2, 7);
                    v8hVar.t = 1;
                    obj = wca.K(ogjVar, bigVar, v8hVar);
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
                jdbVar = (jdb) obj;
                if (jdbVar == null) {
                    return jdbVar;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                md4 md4Var = new md4(linkedHashMap);
                ww9.I(md4Var);
                return new idb(md4Var);
            }
        }
        v8hVar = new v8h(this, (sq3) rq3Var);
        Object obj2 = v8hVar.r;
        lu3 lu3Var2 = lu3.a;
        i = v8hVar.t;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        jdbVar = (jdb) obj2;
        if (jdbVar == null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: getCoroutineContext, reason: from getter */
    public final au3 getD() {
        return this.d;
    }

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        this(context, workerParameters, m8h.a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionWorker(Context context, WorkerParameters workerParameters, g8h g8hVar, uij uijVar, au3 au3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, r3, r4, au3Var);
        g8h g8hVar2 = (i & 4) != 0 ? m8h.a : g8hVar;
        uij uijVar2 = (i & 8) != 0 ? new uij() : uijVar;
        if ((i & 16) != 0) {
            hs4 hs4Var = z45.a;
            au3Var = rob.a;
        }
    }
}
