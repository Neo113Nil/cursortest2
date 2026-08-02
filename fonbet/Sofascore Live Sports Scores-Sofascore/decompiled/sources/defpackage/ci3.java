package defpackage;

import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ci3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ci3(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final ji3 ji3Var = (ji3) this.d;
                int i = this.b;
                final long j = this.c;
                synchronized (ji3Var) {
                    final int i2 = i - 1;
                    final Task e = ((ji3) ji3Var.c).e(3 - i2);
                    final Task b = ((di3) ji3Var.f).b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{e, b}).continueWithTask((ScheduledExecutorService) ji3Var.g, new Continuation() { // from class: bi3
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) {
                            Boolean valueOf;
                            ji3 ji3Var2 = ji3.this;
                            Task task2 = e;
                            Task task3 = b;
                            long j2 = j;
                            int i3 = i2;
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new f58("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new f58("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            ii3 ii3Var = (ii3) task2.getResult();
                            fi3 fi3Var = (fi3) task3.getResult();
                            fi3 fi3Var2 = ii3Var.b;
                            if (fi3Var2 != null) {
                                valueOf = Boolean.valueOf(fi3Var2.f >= j2);
                            } else {
                                valueOf = Boolean.valueOf(ii3Var.a == 1);
                            }
                            if (!valueOf.booleanValue()) {
                                ji3Var2.b(i3, j2);
                                return Tasks.forResult(null);
                            }
                            if (ii3Var.b == null) {
                                return Tasks.forResult(null);
                            }
                            if (fi3Var == null) {
                                fi3Var = fi3.d().a();
                            }
                            fi3 fi3Var3 = ii3Var.b;
                            JSONObject jSONObject = fi3Var.e;
                            JSONObject jSONObject2 = fi3Var3.a;
                            JSONObject jSONObject3 = fi3Var3.b;
                            JSONObject jSONObject4 = fi3Var3.e;
                            JSONObject jSONObject5 = fi3.a(new JSONObject(jSONObject2.toString())).b;
                            HashMap c = fi3Var.c();
                            HashMap c2 = fi3Var3.c();
                            HashMap b2 = fi3Var.b();
                            HashMap b3 = fi3Var3.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = fi3Var.b;
                            Iterator<String> keys = jSONObject6.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (c.containsKey(next) != c2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (c.containsKey(next) && c2.containsKey(next) && !((Map) c.get(next)).equals(c2.get(next))) {
                                    hashSet.add(next);
                                } else if (b2.containsKey(next) != b3.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (b3.containsKey(next) && b2.containsKey(next) && !((JSONObject) b3.get(next)).toString().equals(((JSONObject) b2.get(next)).toString())) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject5.remove(next);
                                }
                            }
                            Iterator<String> keys2 = jSONObject5.keys();
                            while (keys2.hasNext()) {
                                hashSet.add(keys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                return Tasks.forResult(null);
                            }
                            ms0 ms0Var = new ms0(hashSet);
                            synchronized (ji3Var2) {
                                Iterator it = ((LinkedHashSet) ji3Var2.a).iterator();
                                while (it.hasNext()) {
                                    ((mi3) it.next()).b(ms0Var);
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
                return;
            default:
                zzaex zzaexVar = (zzaex) this.d;
                int i3 = this.b;
                long j2 = this.c;
                zzaexVar.getClass();
                String str = zzfm.a;
                zzaexVar.b.e(i3, j2);
                return;
        }
    }
}
