package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.newNetwork.cpc.ValuableUserVersionsResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fkk {
    public final Context a;
    public final dhk b;
    public final SharedPreferences c;

    public fkk(dhk dhkVar, Context context, SharedPreferences sharedPreferences) {
        dhkVar.getClass();
        sharedPreferences.getClass();
        this.a = context;
        this.b = dhkVar;
        this.c = sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0176, code lost:
    
        if (r0 == r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        ekk ekkVar;
        int i;
        Set<String> stringSet;
        long j;
        Task forException;
        long j2;
        long j3;
        long j4;
        z3n z3nVar;
        String str;
        List<String> versions;
        if (sq3Var instanceof ekk) {
            ekkVar = (ekk) sq3Var;
            int i2 = ekkVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ekkVar.y = i2 - Integer.MIN_VALUE;
                ekk ekkVar2 = ekkVar;
                Object obj = ekkVar2.w;
                lu3 lu3Var = lu3.a;
                i = ekkVar2.y;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long j5 = this.c.getLong("VALUABLE_USER_FIRST_RUN", 0L);
                    long j6 = this.c.getLong("VALUABLE_USER_LAST_TIMESTAMP_v2", 0L);
                    stringSet = this.c.getStringSet("VALUABLE_USER_VERSIONS_SENT", rm5.a);
                    if (j5 == 0) {
                        SharedPreferences.Editor edit = this.c.edit();
                        edit.getClass();
                        edit.putLong("VALUABLE_USER_FIRST_RUN", currentTimeMillis);
                        edit.apply();
                        j = currentTimeMillis;
                    } else {
                        j = j5;
                    }
                    if (currentTimeMillis - j6 > 86400 && currentTimeMillis - j < 5184000) {
                        SharedPreferences.Editor edit2 = this.c.edit();
                        edit2.getClass();
                        edit2.putLong("VALUABLE_USER_LAST_TIMESTAMP_v2", currentTimeMillis);
                        edit2.apply();
                        ekkVar2.u = stringSet;
                        ekkVar2.r = currentTimeMillis;
                        ekkVar2.s = j;
                        ekkVar2.t = j6;
                        ekkVar2.y = 1;
                        oog oogVar = new oog(z9a.b(ekkVar2));
                        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.a);
                        firebaseAnalytics.getClass();
                        try {
                            synchronized (FirebaseAnalytics.class) {
                                try {
                                    z3nVar = firebaseAnalytics.b;
                                    if (z3nVar == null) {
                                        z3nVar = new z3n(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                                        firebaseAnalytics.b = z3nVar;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            forException = Tasks.call(z3nVar, new v35(firebaseAnalytics, 6));
                        } catch (RuntimeException e) {
                            zzez zzezVar = firebaseAnalytics.a;
                            zzezVar.getClass();
                            zzezVar.c(new tzn(zzezVar, "Failed to schedule task for getAppInstanceId", (Object) null));
                            forException = Tasks.forException(e);
                        }
                        forException.addOnSuccessListener(new yia(new x09(oogVar, 3), 25));
                        obj = oogVar.b();
                        lu3 lu3Var2 = lu3.a;
                        if (obj != lu3Var) {
                            long j7 = j;
                            j2 = currentTimeMillis;
                            j3 = j7;
                            j4 = j6;
                            str = (String) obj;
                            if (str != null) {
                            }
                        }
                        return lu3Var;
                    }
                } else if (i == 1) {
                    long j8 = ekkVar2.t;
                    long j9 = ekkVar2.s;
                    j2 = ekkVar2.r;
                    Set<String> set = ekkVar2.u;
                    y6a.M(obj);
                    j4 = j8;
                    j3 = j9;
                    stringSet = set;
                    str = (String) obj;
                    if (str != null) {
                        dhk dhkVar = this.b;
                        ekkVar2.u = stringSet;
                        ekkVar2.v = str;
                        ekkVar2.r = j2;
                        ekkVar2.s = j3;
                        ekkVar2.t = j4;
                        ekkVar2.y = 2;
                        dhkVar.getClass();
                        obj = yaa.P(new egk(dhkVar, rq3Var, 4), ekkVar2);
                    }
                } else if (i == 2) {
                    j4 = ekkVar2.t;
                    j3 = ekkVar2.s;
                    j2 = ekkVar2.r;
                    str = ekkVar2.v;
                    stringSet = ekkVar2.u;
                    y6a.M(obj);
                    long j10 = j3;
                    String str2 = str;
                    long j11 = j4;
                    Set<String> set2 = stringSet;
                    long j12 = j2;
                    ValuableUserVersionsResponse valuableUserVersionsResponse = (ValuableUserVersionsResponse) yaa.x((x2g) obj);
                    if (valuableUserVersionsResponse != null && (versions = valuableUserVersionsResponse.getVersions()) != null) {
                        jk jkVar = new jk((List) versions, (Object) this, (Object) set2, (Serializable) iii.H(3, str2), (Serializable) str2, (rq3) null, 25);
                        ekkVar2.u = null;
                        ekkVar2.v = null;
                        ekkVar2.r = j12;
                        ekkVar2.s = j10;
                        ekkVar2.t = j11;
                        ekkVar2.y = 3;
                        if (s9a.r(jkVar, ekkVar2) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set3 = ekkVar2.u;
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        ekkVar = new ekk(this, sq3Var);
        ekk ekkVar22 = ekkVar;
        Object obj2 = ekkVar22.w;
        lu3 lu3Var3 = lu3.a;
        i = ekkVar22.y;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
