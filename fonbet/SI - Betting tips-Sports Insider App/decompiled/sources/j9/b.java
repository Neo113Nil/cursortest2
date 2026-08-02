package j9;

import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f18286c;

    public b(c cVar, int i5, long j) {
        this.f18286c = cVar;
        this.f18284a = i5;
        this.f18285b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f18286c;
        int i5 = this.f18284a;
        final long j = this.f18285b;
        synchronized (cVar) {
            final int i10 = i5 - 1;
            final Task c2 = cVar.f18289c.c(3 - i10);
            final Task b10 = cVar.f18290d.b();
            d5.X(c2, b10).h(cVar.f18292f, new w7.a() { // from class: j9.a
                @Override // w7.a
                public final Object f(Task task) {
                    Boolean valueOf;
                    c cVar2 = c.this;
                    Task task2 = c2;
                    Task task3 = b10;
                    long j6 = j;
                    int i11 = i10;
                    if (!task2.isSuccessful()) {
                        return d5.p(new i9.c("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return d5.p(new i9.c("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    g gVar = (g) task2.getResult();
                    e eVar = (e) task3.getResult();
                    e eVar2 = gVar.f18313b;
                    if (eVar2 != null) {
                        valueOf = Boolean.valueOf(eVar2.f18307f >= j6);
                    } else {
                        valueOf = Boolean.valueOf(gVar.f18312a == 1);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.a(i11, j6);
                        return d5.q(null);
                    }
                    if (gVar.f18313b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return d5.q(null);
                    }
                    if (eVar == null) {
                        eVar = e.c().a();
                    }
                    e eVar3 = gVar.f18313b;
                    JSONObject jSONObject = eVar.f18306e;
                    JSONObject jSONObject2 = eVar3.f18302a;
                    JSONObject jSONObject3 = eVar3.f18303b;
                    JSONObject jSONObject4 = eVar3.f18306e;
                    JSONObject jSONObject5 = e.a(new JSONObject(jSONObject2.toString())).f18303b;
                    HashMap b11 = eVar.b();
                    HashMap b12 = eVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = eVar.f18303b;
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
                        } else if (b11.containsKey(next) != b12.containsKey(next)) {
                            hashSet.add(next);
                        } else if (b11.containsKey(next) && b12.containsKey(next) && !((Map) b11.get(next)).equals(b12.get(next))) {
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
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return d5.q(null);
                    }
                    synchronized (cVar2) {
                        Iterator it = cVar2.f18287a.iterator();
                        while (it.hasNext()) {
                            ((j) it.next()).getClass();
                        }
                    }
                    return d5.q(null);
                }
            });
        }
    }
}
