package ub;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.C4196f;
import ib.InterfaceC4541a;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.w;
import org.json.JSONArray;
import org.json.JSONObject;
import ub.j;
import wb.InterfaceC6736b;

/* renamed from: ub.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6540f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6736b f66235a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f66236b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6736b f66237c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f66238d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f66239e;

    public C6540f(final Context context, final String str, Set set, InterfaceC6736b interfaceC6736b, Executor executor) {
        this(new w(new InterfaceC6736b() { // from class: ub.c
            @Override // wb.InterfaceC6736b
            public final Object get() {
                return C6540f.d(context, str);
            }
        }), set, executor, interfaceC6736b, context);
    }

    public static /* synthetic */ String c(C6540f c6540f) {
        String byteArrayOutputStream;
        synchronized (c6540f) {
            try {
                u uVar = (u) c6540f.f66235a.get();
                List g10 = uVar.g();
                uVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < g10.size(); i10++) {
                    v vVar = (v) g10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", vVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) vVar.b()));
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

    public static /* synthetic */ u d(Context context, String str) {
        return new u(context, str);
    }

    public static /* synthetic */ C6540f e(D d10, InterfaceC5577d interfaceC5577d) {
        return new C6540f((Context) interfaceC5577d.a(Context.class), ((C4196f) interfaceC5577d.a(C4196f.class)).r(), interfaceC5577d.d(InterfaceC6541g.class), interfaceC5577d.f(Eb.i.class), (Executor) interfaceC5577d.c(d10));
    }

    public static /* synthetic */ Void f(C6540f c6540f) {
        synchronized (c6540f) {
            ((u) c6540f.f66235a.get()).o(System.currentTimeMillis(), ((Eb.i) c6540f.f66237c.get()).a());
        }
        return null;
    }

    public static C5576c g() {
        final D a10 = D.a(InterfaceC4541a.class, Executor.class);
        return C5576c.d(C6540f.class, i.class, j.class).b(mb.q.j(Context.class)).b(mb.q.j(C4196f.class)).b(mb.q.m(InterfaceC6541g.class)).b(mb.q.l(Eb.i.class)).b(mb.q.k(a10)).f(new mb.g() { // from class: ub.b
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return C6540f.e(D.this, interfaceC5577d);
            }
        }).d();
    }

    @Override // ub.i
    public Task a() {
        return !u0.p.a(this.f66236b) ? Tasks.forResult("") : Tasks.call(this.f66239e, new Callable() { // from class: ub.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6540f.c(C6540f.this);
            }
        });
    }

    @Override // ub.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        u uVar = (u) this.f66235a.get();
        if (!uVar.m(currentTimeMillis)) {
            return j.a.NONE;
        }
        uVar.k();
        return j.a.GLOBAL;
    }

    public Task h() {
        return this.f66238d.size() <= 0 ? Tasks.forResult(null) : !u0.p.a(this.f66236b) ? Tasks.forResult(null) : Tasks.call(this.f66239e, new Callable() { // from class: ub.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6540f.f(C6540f.this);
            }
        });
    }

    public C6540f(InterfaceC6736b interfaceC6736b, Set set, Executor executor, InterfaceC6736b interfaceC6736b2, Context context) {
        this.f66235a = interfaceC6736b;
        this.f66238d = set;
        this.f66239e = executor;
        this.f66237c = interfaceC6736b2;
        this.f66236b = context;
    }
}
