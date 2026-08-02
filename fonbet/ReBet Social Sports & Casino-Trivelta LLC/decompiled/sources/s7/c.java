package s7;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookRequestError;
import g6.C4339K;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C6445a;
import t7.EnumC6446b;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f64801a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f64802b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0900c f64803c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f64804d;

    /* renamed from: e, reason: collision with root package name */
    public C6445a f64805e;

    public class a implements Consumer {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C4339K c4339k) {
            if (c.this.f64803c != null) {
                c.this.f64803c.a(c4339k);
            }
        }
    }

    public class b implements Supplier {
        public b() {
        }

        @Override // java.util.function.Supplier
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4339K get() {
            String uuid = UUID.randomUUID().toString();
            try {
                c.this.f64802b.put("requestID", uuid);
                Intent intent = new Intent();
                String string = c.this.f64802b.getString("type");
                c.this.f64805e.e(string, uuid, c.this.f64802b);
                if (!string.equals(EnumC6446b.GET_ACCESS_TOKEN.toString()) && !string.equals(EnumC6446b.IS_ENV_READY.toString())) {
                    String string2 = c.this.f64801a.getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).getString("daemonPackageName", null);
                    if (string2 == null) {
                        return s7.b.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection"), uuid);
                    }
                    intent.setPackage(string2);
                }
                intent.setAction("com.facebook.gamingservices.DAEMON_REQUEST");
                Iterator<String> keys = c.this.f64802b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    intent.putExtra(next, c.this.f64802b.getString(next));
                }
                CompletableFuture completableFuture = new CompletableFuture();
                c.this.f64804d.put(uuid, completableFuture);
                c.this.f64801a.sendBroadcast(intent);
                c.this.f64805e.h(string, uuid, c.this.f64802b);
                return (C4339K) completableFuture.get();
            } catch (InterruptedException | ExecutionException | JSONException unused) {
                return s7.b.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), uuid);
            }
        }
    }

    /* renamed from: s7.c$c, reason: collision with other inner class name */
    public interface InterfaceC0900c {
        void a(C4339K c4339k);
    }

    public c(Context context, JSONObject jSONObject, InterfaceC0900c interfaceC0900c) {
        this.f64801a = context;
        this.f64802b = jSONObject;
        this.f64803c = interfaceC0900c;
        this.f64804d = s7.b.g(context).h();
        this.f64805e = C6445a.b(context);
    }

    public static void h(Context context, JSONObject jSONObject, InterfaceC0900c interfaceC0900c, EnumC6446b enumC6446b) {
        try {
            new c(context, jSONObject == null ? new JSONObject().put("type", enumC6446b.toString()) : jSONObject.put("type", enumC6446b.toString()), interfaceC0900c).g();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (interfaceC0900c != null) {
                interfaceC0900c.a(s7.b.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }

    public final CompletableFuture f() {
        return CompletableFuture.supplyAsync(new b());
    }

    public final void g() {
        f().thenAccept((Consumer) new a());
    }
}
