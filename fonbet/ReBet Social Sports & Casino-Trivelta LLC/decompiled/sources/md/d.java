package md;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes4.dex */
public class d implements Callback {

    /* renamed from: c, reason: collision with root package name */
    public static final b f56499c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final e f56500a;

    /* renamed from: b, reason: collision with root package name */
    public final b f56501b;

    public interface b {
        Object extract(Object obj);
    }

    public d(e eVar, b bVar) {
        this.f56500a = eVar;
        this.f56501b = bVar;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th2) {
        e eVar = this.f56500a;
        if (eVar != null) {
            eVar.onError(c.c(th2));
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        if (this.f56500a != null) {
            if (response.isSuccessful()) {
                this.f56500a.onSuccess(this.f56501b.extract(response.body()));
            } else {
                this.f56500a.onError(c.b(response));
            }
        }
    }

    public d(e eVar) {
        this(eVar, f56499c);
    }

    public static final class a implements b {
        @Override // md.d.b
        public Object extract(Object obj) {
            return obj;
        }
    }
}
