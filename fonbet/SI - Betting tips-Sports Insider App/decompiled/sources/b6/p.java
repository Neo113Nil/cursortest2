package b6;

import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.e0;
import com.android.billingclient.api.o0;
import com.android.billingclient.api.t0;
import com.google.android.gms.internal.play_billing.p1;
import gf.x;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y1.a0;
import y1.b0;
import y1.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements aa.f {

    /* renamed from: e, reason: collision with root package name */
    public static p f3076e;

    /* renamed from: f, reason: collision with root package name */
    public static p f3077f;

    /* renamed from: a, reason: collision with root package name */
    public int f3078a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3079b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3080c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3081d;

    public p(int i5, gg.a aVar, hg.g gVar, CoroutineContext coroutineContext) {
        this.f3079b = gVar;
        this.f3078a = i5;
        this.f3080c = aVar;
        this.f3081d = coroutineContext;
    }

    public static synchronized p h(Context context) {
        p pVar;
        synchronized (p.class) {
            try {
                if (f3076e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new e0("MessengerIpcClient")));
                    p pVar2 = new p();
                    pVar2.f3081d = new m(pVar2);
                    pVar2.f3078a = 1;
                    pVar2.f3080c = unconfigurableScheduledExecutorService;
                    pVar2.f3079b = context.getApplicationContext();
                    f3076e = pVar2;
                }
                pVar = f3076e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public void a(File file) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        linkedList.add(file);
        int i5 = 0;
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove();
            if (file != file2) {
                stack.push(file2);
            }
            File[] listFiles = file2.listFiles();
            Objects.requireNonNull(listFiles);
            for (File file3 : listFiles) {
                if (file3.isDirectory()) {
                    linkedList.add(file3);
                } else if (!file3.delete()) {
                    throw new IOException("Failed to delete trashed file " + file3.getName());
                }
                i5++;
                if (i5 >= 100) {
                    ((ba.d) this.f3079b).a("Deferring further cleanup to next tick.");
                    return;
                }
            }
        }
        while (!stack.isEmpty()) {
            File file4 = (File) stack.pop();
            if (!file4.delete()) {
                throw new IOException("Failed to delete trashed folder " + file4.getName());
            }
        }
    }

    public b0 b(int i5, b0 b0Var, b0 b0Var2, boolean z5) {
        d0 d0Var = (d0) this.f3079b;
        s.o oVar = (s.o) this.f3080c;
        b0 b0Var3 = (b0) oVar.d(i5);
        if (b0Var2 != null) {
            if (Intrinsics.areEqual(b0Var3, b0Var2) && Intrinsics.areEqual(b0Var3.f25535c, b0Var2.f25535c)) {
                return b0Var3;
            }
            b0Var3 = null;
        } else if (b0Var3 != null) {
            return b0Var3;
        }
        if (z5) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            Iterator it = bg.n.a(new x(6, oVar)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    b0Var3 = null;
                    break;
                }
                b0 b0Var4 = (b0) it.next();
                b0Var3 = (!(b0Var4 instanceof d0) || Intrinsics.areEqual(b0Var4, b0Var)) ? null : ((d0) b0Var4).f25543g.b(i5, d0Var, b0Var2, true);
                if (b0Var3 != null) {
                    break;
                }
            }
        }
        if (b0Var3 != null) {
            return b0Var3;
        }
        d0 d0Var2 = d0Var.f25535c;
        if (d0Var2 == null || Intrinsics.areEqual(d0Var2, b0Var)) {
            return null;
        }
        d0 d0Var3 = d0Var.f25535c;
        Intrinsics.checkNotNull(d0Var3);
        return d0Var3.f25543g.b(i5, d0Var, b0Var2, z5);
    }

    @Override // aa.f
    public void c() {
        try {
            a((File) this.f3080c);
            this.f3078a = 0;
        } catch (Throwable th2) {
            int i5 = this.f3078a;
            this.f3078a = i5 + 1;
            if (i5 >= 5) {
                ((ba.d) this.f3079b).f("Trash cleaner failed 5 times in a row, shutting down.", th2);
                ((aa.g) this.f3081d).d();
            }
        }
    }

    @Override // aa.f
    public void d() {
        f3077f = null;
    }

    public a0 e(a0 a0Var, kh.g navDeepLinkRequest, boolean z5, b0 lastVisited) {
        a0 a0Var2;
        d0 d0Var = (d0) this.f3079b;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        Iterator it = d0Var.iterator();
        while (true) {
            b2.n nVar = (b2.n) it;
            if (!nVar.hasNext()) {
                break;
            }
            b0 b0Var = (b0) nVar.next();
            a0Var2 = Intrinsics.areEqual(b0Var, lastVisited) ? null : b0Var.f(navDeepLinkRequest);
            if (a0Var2 != null) {
                arrayList.add(a0Var2);
            }
        }
        a0 a0Var3 = (a0) CollectionsKt.M(arrayList);
        d0 d0Var2 = d0Var.f25535c;
        if (d0Var2 != null && z5 && !Intrinsics.areEqual(d0Var2, lastVisited)) {
            a0Var2 = d0Var2.j(navDeepLinkRequest, d0Var);
        }
        a0[] elements = {a0Var, a0Var3, a0Var2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (a0) CollectionsKt.M(kotlin.collections.p.q(elements));
    }

    public void f(int i5) {
        d0 d0Var = (d0) this.f3079b;
        if (i5 != d0Var.f25534b.f3017e) {
            this.f3078a = i5;
            this.f3081d = null;
        } else {
            throw new IllegalArgumentException(("Start destination " + i5 + " cannot use the same id as the graph " + d0Var).toString());
        }
    }

    public void g(Throwable th2) {
        o0 o0Var = (o0) this.f3081d;
        if (th2 instanceof TimeoutException) {
            o0Var.T(114, 28, t0.F);
            p1.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            o0Var.T(107, 28, t0.F);
            p1.h("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f3080c).run();
    }

    public synchronized w7.m i(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((m) this.f3081d).d(nVar)) {
                m mVar = new m(this);
                this.f3081d = mVar;
                mVar.d(nVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return nVar.f3072b.f24979a;
    }

    public p() {
        this.f3078a = Integer.MAX_VALUE;
    }
}
