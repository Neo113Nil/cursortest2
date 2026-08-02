package w8;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.core.os.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n8.InterfaceC8452b;
import n8.w;
import org.json.JSONArray;
import org.json.JSONObject;
import w8.i;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class e implements h, i {

    /* renamed from: a, reason: collision with root package name */
    private final d f103622a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f103623b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10861a<H8.h> f103624c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<f> f103625d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f103626e;

    e() {
        throw null;
    }

    private e(Context context, String str, Set<f> set, InterfaceC10861a<H8.h> interfaceC10861a, Executor executor) {
        this.f103622a = new d(context, str);
        this.f103625d = set;
        this.f103626e = executor;
        this.f103624c = interfaceC10861a;
        this.f103623b = context;
    }

    public static /* synthetic */ String c(e eVar) {
        String byteArrayOutputStream;
        synchronized (eVar) {
            try {
                j jVar = (j) eVar.f103622a.get();
                ArrayList c11 = jVar.c();
                jVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < c11.size(); i11++) {
                    k kVar = (k) c11.get(i11);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", kVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) kVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    public static e d(w wVar, InterfaceC8452b interfaceC8452b) {
        return new e((Context) interfaceC8452b.a(Context.class), ((k8.e) interfaceC8452b.a(k8.e.class)).m(), interfaceC8452b.c(w.a(f.class)), interfaceC8452b.d(H8.h.class), (Executor) interfaceC8452b.e(wVar));
    }

    public static /* synthetic */ void e(e eVar) {
        synchronized (eVar) {
            ((j) eVar.f103622a.get()).i(System.currentTimeMillis(), eVar.f103624c.get().getUserAgent());
        }
    }

    @Override // w8.h
    public final Task<String> a() {
        if (!n.a(this.f103623b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f103626e, new Callable() { // from class: w8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.c(e.this);
            }
        });
    }

    @Override // w8.i
    @NonNull
    public final synchronized i.a b() {
        boolean h11;
        long currentTimeMillis = System.currentTimeMillis();
        j jVar = (j) this.f103622a.get();
        synchronized (jVar) {
            h11 = jVar.h(currentTimeMillis);
        }
        if (!h11) {
            return i.a.NONE;
        }
        jVar.f();
        return i.a.GLOBAL;
    }

    public final void f() {
        if (this.f103625d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!n.a(this.f103623b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f103626e, new Callable() { // from class: w8.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    e.e(e.this);
                    return null;
                }
            });
        }
    }
}
