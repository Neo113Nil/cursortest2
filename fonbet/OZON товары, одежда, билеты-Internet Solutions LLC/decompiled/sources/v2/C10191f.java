package v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.C5155y;
import androidx.collection.Z;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v2.C10195j;
import x2.InterfaceC10646a;

/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10191f {

    /* renamed from: a, reason: collision with root package name */
    static final C5155y<String, Typeface> f101689a = new C5155y<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadPoolExecutor f101690b;

    /* renamed from: c, reason: collision with root package name */
    static final Object f101691c;

    /* renamed from: d, reason: collision with root package name */
    static final Z<String, ArrayList<InterfaceC10646a<b>>> f101692d;

    /* renamed from: v2.f$a */
    final class a implements Callable<b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f101693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f101694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C10190e f101695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f101696d;

        a(String str, Context context, C10190e c10190e, int i11) {
            this.f101693a = str;
            this.f101694b = context;
            this.f101695c = c10190e;
            this.f101696d = i11;
        }

        @Override // java.util.concurrent.Callable
        public final b call() throws Exception {
            return C10191f.a(this.f101693a, this.f101694b, this.f101695c, this.f101696d);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC10196k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f101690b = threadPoolExecutor;
        f101691c = new Object();
        f101692d = new Z<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static b a(@NonNull String str, @NonNull Context context, @NonNull C10190e c10190e, int i11) {
        C5155y<String, Typeface> c5155y = f101689a;
        Typeface typeface = c5155y.get(str);
        if (typeface != null) {
            return new b(typeface);
        }
        try {
            C10195j.a a11 = C10189d.a(context, c10190e);
            int i12 = 1;
            if (a11.b() != 0) {
                if (a11.b() == 1) {
                    i12 = -2;
                    if (i12 != 0) {
                        return new b(i12);
                    }
                    Typeface a12 = androidx.core.graphics.g.a(context, a11.a(), i11);
                    if (a12 == null) {
                        return new b(-3);
                    }
                    c5155y.put(str, a12);
                    return new b(a12);
                }
                i12 = -3;
                if (i12 != 0) {
                }
            } else {
                C10195j.b[] a13 = a11.a();
                if (a13 != null && a13.length != 0) {
                    int length = a13.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i12 = 0;
                            break;
                        }
                        int a14 = a13[i13].a();
                        if (a14 == 0) {
                            i13++;
                        } else if (a14 >= 0) {
                            i12 = a14;
                        }
                    }
                }
                if (i12 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new b(-1);
        }
    }

    static Typeface b(@NonNull Context context, @NonNull C10190e c10190e, int i11, @NonNull C10188c c10188c) {
        String str = c10190e.b() + "-" + i11;
        Typeface typeface = f101689a.get(str);
        if (typeface != null) {
            c10188c.a(new b(typeface));
            return typeface;
        }
        C10192g c10192g = new C10192g(c10188c);
        synchronized (f101691c) {
            try {
                Z<String, ArrayList<InterfaceC10646a<b>>> z11 = f101692d;
                ArrayList<InterfaceC10646a<b>> arrayList = z11.get(str);
                if (arrayList != null) {
                    arrayList.add(c10192g);
                    return null;
                }
                ArrayList<InterfaceC10646a<b>> arrayList2 = new ArrayList<>();
                arrayList2.add(c10192g);
                z11.put(str, arrayList2);
                f101690b.execute(new RunnableC10197l(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new CallableC10193h(str, context, c10190e, i11), new C10194i(str)));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface c(@NonNull Context context, @NonNull C10190e c10190e, @NonNull C10188c c10188c, int i11, int i12) {
        String str = c10190e.b() + "-" + i11;
        Typeface typeface = f101689a.get(str);
        if (typeface != null) {
            c10188c.a(new b(typeface));
            return typeface;
        }
        if (i12 == -1) {
            b a11 = a(str, context, c10190e, i11);
            c10188c.a(a11);
            return a11.f101697a;
        }
        try {
            try {
                try {
                    b bVar = (b) f101690b.submit(new a(str, context, c10190e, i11)).get(i12, TimeUnit.MILLISECONDS);
                    c10188c.a(bVar);
                    return bVar.f101697a;
                } catch (InterruptedException e11) {
                    throw e11;
                }
            } catch (ExecutionException e12) {
                throw new RuntimeException(e12);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            c10188c.a(new b(-3));
            return null;
        }
    }

    /* renamed from: v2.f$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f101697a;

        /* renamed from: b, reason: collision with root package name */
        final int f101698b;

        b(int i11) {
            this.f101697a = null;
            this.f101698b = i11;
        }

        @SuppressLint({"WrongConstant"})
        b(@NonNull Typeface typeface) {
            this.f101697a = typeface;
            this.f101698b = 0;
        }
    }
}
