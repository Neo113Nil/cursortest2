package i9;

import androidx.appcompat.app.v0;
import j9.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i8.c f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11013b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.d f11014c;

    /* renamed from: d, reason: collision with root package name */
    public final j9.d f11015d;

    /* renamed from: e, reason: collision with root package name */
    public final j9.d f11016e;

    /* renamed from: f, reason: collision with root package name */
    public final j9.h f11017f;

    /* renamed from: g, reason: collision with root package name */
    public final j9.i f11018g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.util.network.b f11019h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f11020i;

    public b(i8.c cVar, Executor executor, j9.d dVar, j9.d dVar2, j9.d dVar3, j9.h hVar, j9.i iVar, io.sentry.util.network.b bVar, v0 v0Var) {
        this.f11012a = cVar;
        this.f11013b = executor;
        this.f11014c = dVar;
        this.f11015d = dVar2;
        this.f11016e = dVar3;
        this.f11017f = hVar;
        this.f11018g = iVar;
        this.f11019h = bVar;
        this.f11020i = v0Var;
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final void a(boolean z5) {
        io.sentry.util.network.b bVar = this.f11019h;
        synchronized (bVar) {
            ((k) bVar.f17177c).k(z5);
            if (!z5) {
                bVar.a();
            }
        }
    }
}
