package i9;

import androidx.appcompat.app.v0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.w0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements w7.f, w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11011a;

    public /* synthetic */ a(b bVar) {
        this.f11011a = bVar;
    }

    @Override // w7.f
    public Task e(Object obj) {
        b bVar = this.f11011a;
        Task b10 = bVar.f11014c.b();
        Task b11 = bVar.f11015d.b();
        return d5.X(b10, b11).h(bVar.f11013b, new androidx.transition.i(bVar, b10, b11, 3));
    }

    @Override // w7.a
    public Object f(Task task) {
        boolean z5;
        b bVar = this.f11011a;
        if (task.isSuccessful()) {
            j9.d dVar = bVar.f11014c;
            synchronized (dVar) {
                dVar.f18300c = d5.q(null);
            }
            dVar.f18299b.a();
            j9.e eVar = (j9.e) task.getResult();
            if (eVar != null) {
                JSONArray jSONArray = eVar.f18305d;
                i8.c cVar = bVar.f11012a;
                if (cVar != null) {
                    try {
                        cVar.c(b.b(jSONArray));
                    } catch (i8.a e7) {
                        w0.n("FirebaseRemoteConfig", "Could not update ABT experiments.", e7);
                    } catch (JSONException e9) {
                        w0.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e9);
                    }
                }
                v0 v0Var = bVar.f11020i;
                try {
                    ((io.sentry.util.network.b) v0Var.f364b).g(eVar);
                    Iterator it = ((Set) v0Var.f366d).iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        ((Executor) v0Var.f365c).execute(new aa.d(7));
                    }
                } catch (d e10) {
                    w0.n("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                w0.d("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
