package Yb;

import Yb.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    public static Class f14118f;

    /* renamed from: g, reason: collision with root package name */
    public static Class f14119g;

    /* renamed from: h, reason: collision with root package name */
    public static Class f14120h;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14121a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14122b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14123c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f14124d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14125e;

    public class a implements InvocationHandler {

        /* renamed from: Yb.f$a$a, reason: collision with other inner class name */
        public class RunnableC0291a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f14127a;

            public RunnableC0291a(int i10) {
                this.f14127a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f14127a);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        public final /* synthetic */ void b() {
            try {
                String str = (String) f.f14120h.getMethod("getInstallReferrer", null).invoke(f.f14118f.getMethod("getInstallReferrer", null).invoke(f.this.f14122b, null), null);
                SharedPreferences.Editor edit = f.this.f14121a.edit();
                edit.putString("installReferrer", str);
                edit.apply();
                f.f14118f.getMethod("endConnection", null).invoke(f.this.f14122b, null);
            } catch (Exception e10) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                e10.printStackTrace(System.err);
            }
        }

        public void d(int i10) {
            if (i10 != 0) {
                return;
            }
            f.this.f14124d.execute(new Runnable() { // from class: Yb.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.a.this.b();
                }
            });
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        f.this.f14125e.post(new RunnableC0291a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                f.this.f14125e.post(new b());
                return null;
            } catch (Exception e10) {
                throw new RuntimeException("unexpected invocation exception: " + e10.getMessage());
            }
        }

        public a() {
        }

        public void c() {
        }
    }

    static {
        try {
            f14118f = InstallReferrerClient.class;
            f14119g = InstallReferrerStateListener.class;
            f14120h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    public f(final Context context) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f14124d = newSingleThreadExecutor;
        this.f14125e = new Handler(Looper.getMainLooper());
        this.f14121a = context.getSharedPreferences("react-native-device-info", 0);
        if (f14118f == null || f14119g == null || f14120h == null) {
            return;
        }
        newSingleThreadExecutor.execute(new Runnable() { // from class: Yb.d
            @Override // java.lang.Runnable
            public final void run() {
                f.this.h(context);
            }
        });
    }

    public final /* synthetic */ void h(Context context) {
        try {
            Object invoke = f14118f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f14122b = invoke.getClass().getMethod("build", null).invoke(invoke, null);
            this.f14123c = Proxy.newProxyInstance(f14119g.getClassLoader(), new Class[]{f14119g}, new a());
            f14118f.getMethod("startConnection", f14119g).invoke(this.f14122b, this.f14123c);
        } catch (Exception e10) {
            System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
            e10.printStackTrace(System.err);
        }
    }
}
