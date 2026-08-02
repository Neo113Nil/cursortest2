package com.google.firebase.installations;

import B8.c;
import B8.d;
import C8.d;
import C8.f;
import Ly.RunnableC3601a;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k8.e;
import n8.r;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import y8.InterfaceC10861a;
import z8.C11000c;
import z8.C11001d;
import z8.InterfaceC10999b;

/* loaded from: classes.dex */
public final class c implements InterfaceC10999b {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f59558m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f59559n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final k8.e f59560a;

    /* renamed from: b, reason: collision with root package name */
    private final C8.c f59561b;

    /* renamed from: c, reason: collision with root package name */
    private final B8.c f59562c;

    /* renamed from: d, reason: collision with root package name */
    private final h f59563d;

    /* renamed from: e, reason: collision with root package name */
    private final r<B8.b> f59564e;

    /* renamed from: f, reason: collision with root package name */
    private final C11001d f59565f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f59566g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f59567h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f59568i;

    /* renamed from: j, reason: collision with root package name */
    private String f59569j;

    /* renamed from: k, reason: collision with root package name */
    private HashSet f59570k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f59571l;

    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f59572a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f59572a.getAndIncrement())));
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59573a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f59574b;

        static {
            int[] iArr = new int[f.b.values().length];
            f59574b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59574b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59574b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f59573a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59573a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final k8.e eVar, @NonNull InterfaceC10861a<w8.h> interfaceC10861a, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        C8.c cVar = new C8.c(eVar.i(), interfaceC10861a);
        B8.c cVar2 = new B8.c(eVar);
        h b11 = h.b();
        r<B8.b> rVar = new r<>(new InterfaceC10861a() { // from class: z8.a
            @Override // y8.InterfaceC10861a
            public final Object get() {
                return new B8.b(e.this);
            }
        });
        C11001d c11001d = new C11001d();
        this.f59566g = new Object();
        this.f59570k = new HashSet();
        this.f59571l = new ArrayList();
        this.f59560a = eVar;
        this.f59561b = cVar;
        this.f59562c = cVar2;
        this.f59563d = b11;
        this.f59564e = rVar;
        this.f59565f = c11001d;
        this.f59567h = executorService;
        this.f59568i = executor;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(c cVar) {
        B8.d c11;
        B8.d h11;
        cVar.getClass();
        Object obj = f59558m;
        synchronized (obj) {
            try {
                com.google.firebase.installations.b a11 = com.google.firebase.installations.b.a(cVar.f59560a.i());
                try {
                    c11 = cVar.f59562c.c();
                    if (a11 != null) {
                        a11.b();
                    }
                } catch (Throwable th2) {
                    if (a11 != null) {
                        a11.b();
                    }
                    throw th2;
                }
            } finally {
            }
        }
        try {
            if (!(c11.f() == c.a.REGISTER_ERROR)) {
                if (!(c11.f() == c.a.UNREGISTERED)) {
                    if (cVar.f59563d.c(c11)) {
                        h11 = cVar.f(c11);
                        synchronized (obj) {
                            try {
                                com.google.firebase.installations.b a12 = com.google.firebase.installations.b.a(cVar.f59560a.i());
                                try {
                                    cVar.f59562c.b(h11);
                                    if (a12 != null) {
                                        a12.b();
                                    }
                                } catch (Throwable th3) {
                                    if (a12 != null) {
                                        a12.b();
                                    }
                                    throw th3;
                                }
                            } finally {
                            }
                        }
                        synchronized (cVar) {
                            if (cVar.f59570k.size() != 0 && !TextUtils.equals(c11.c(), h11.c())) {
                                Iterator it = cVar.f59570k.iterator();
                                while (it.hasNext()) {
                                    ((A8.a) it.next()).a();
                                }
                            }
                        }
                        if (h11.f() == c.a.REGISTERED) {
                            String c12 = h11.c();
                            synchronized (cVar) {
                                cVar.f59569j = c12;
                            }
                        }
                        if (h11.f() == c.a.REGISTER_ERROR) {
                            cVar.i(new C11000c());
                            return;
                        } else if (h11.f() == c.a.NOT_GENERATED || h11.f() == c.a.ATTEMPT_MIGRATION) {
                            cVar.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                            return;
                        } else {
                            cVar.j(h11);
                            return;
                        }
                    }
                    return;
                }
            }
            h11 = cVar.h(c11);
            synchronized (obj) {
            }
        } catch (C11000c e11) {
            cVar.i(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:6:0x000d, B:8:0x001b, B:13:0x0029, B:15:0x0039, B:17:0x0061, B:18:0x0068, B:20:0x003f, B:22:0x0047, B:24:0x0059), top: B:5:0x000d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:4:0x0003, B:26:0x0082, B:27:0x0088, B:34:0x009a, B:35:0x009d, B:6:0x000d, B:8:0x001b, B:13:0x0029, B:15:0x0039, B:17:0x0061, B:18:0x0068, B:20:0x003f, B:22:0x0047, B:24:0x0059), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        B8.d c11;
        boolean z11;
        String a11;
        synchronized (f59558m) {
            try {
                com.google.firebase.installations.b a12 = com.google.firebase.installations.b.a(this.f59560a.i());
                try {
                    c11 = this.f59562c.c();
                    if (c11.f() != c.a.NOT_GENERATED && c11.f() != c.a.ATTEMPT_MIGRATION) {
                        z11 = false;
                        if (z11) {
                            k8.e eVar = this.f59560a;
                            boolean equals = eVar.k().equals("CHIME_ANDROID_SDK");
                            C11001d c11001d = this.f59565f;
                            if ((equals || eVar.r()) && c11.f() == c.a.ATTEMPT_MIGRATION) {
                                a11 = this.f59564e.get().a();
                                if (TextUtils.isEmpty(a11)) {
                                    c11001d.getClass();
                                    a11 = C11001d.a();
                                }
                            } else {
                                c11001d.getClass();
                                a11 = C11001d.a();
                            }
                            B8.c cVar = this.f59562c;
                            d.a h11 = c11.h();
                            h11.d(a11);
                            h11.g(c.a.UNREGISTERED);
                            c11 = h11.a();
                            cVar.b(c11);
                        }
                        if (a12 != null) {
                            a12.b();
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                    if (a12 != null) {
                    }
                } catch (Throwable th2) {
                    if (a12 != null) {
                        a12.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        j(c11);
        this.f59568i.execute(new com.appsflyer.b(this, 1));
    }

    private B8.d f(@NonNull B8.d dVar) throws C11000c {
        C8.f b11 = this.f59561b.b(this.f59560a.l().b(), dVar.c(), this.f59560a.l().e(), dVar.e());
        int i11 = b.f59574b[b11.b().ordinal()];
        if (i11 == 1) {
            String c11 = b11.c();
            long d11 = b11.d();
            h hVar = this.f59563d;
            hVar.getClass();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(hVar.a());
            d.a h11 = dVar.h();
            h11.b(c11);
            h11.c(d11);
            h11.h(seconds);
            return h11.a();
        }
        if (i11 == 2) {
            d.a h12 = dVar.h();
            h12.e("BAD CONFIG");
            h12.g(c.a.REGISTER_ERROR);
            return h12.a();
        }
        if (i11 != 3) {
            throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f59569j = null;
        }
        d.a h13 = dVar.h();
        h13.g(c.a.NOT_GENERATED);
        return h13.a();
    }

    private void g() {
        k8.e eVar = this.f59560a;
        Preconditions.checkNotEmpty(eVar.l().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(eVar.l().e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(eVar.l().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c11 = eVar.l().c();
        int i11 = h.f59581e;
        Preconditions.checkArgument(c11.contains(ProductContainerDTO.RATIO_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.d(eVar.l().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private B8.d h(B8.d dVar) throws C11000c {
        String c11 = (dVar.c() == null || dVar.c().length() != 11) ? null : this.f59564e.get().c();
        k8.e eVar = this.f59560a;
        C8.d a11 = this.f59561b.a(eVar.l().b(), dVar.c(), eVar.l().e(), eVar.l().c(), c11);
        int i11 = b.f59573a[a11.e().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new C11000c("Firebase Installations Service is unavailable. Please try again later.");
            }
            d.a h11 = dVar.h();
            h11.e("BAD CONFIG");
            h11.g(c.a.REGISTER_ERROR);
            return h11.a();
        }
        String c12 = a11.c();
        String d11 = a11.d();
        h hVar = this.f59563d;
        hVar.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(hVar.a());
        String c13 = a11.b().c();
        long d12 = a11.b().d();
        d.a h12 = dVar.h();
        h12.d(c12);
        h12.g(c.a.REGISTERED);
        h12.b(c13);
        h12.f(d11);
        h12.c(d12);
        h12.h(seconds);
        return h12.a();
    }

    private void i(Exception exc) {
        synchronized (this.f59566g) {
            try {
                Iterator it = this.f59571l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j(B8.d dVar) {
        synchronized (this.f59566g) {
            try {
                Iterator it = this.f59571l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z8.InterfaceC10999b
    @NonNull
    public final Task a() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = new d(this.f59563d, taskCompletionSource);
        synchronized (this.f59566g) {
            this.f59571l.add(dVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f59567h.execute(new RunnableC3601a(this, 2));
        return task;
    }

    @Override // z8.InterfaceC10999b
    @NonNull
    public final Task<String> getId() {
        String str;
        g();
        synchronized (this) {
            str = this.f59569j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e eVar = new e(taskCompletionSource);
        synchronized (this.f59566g) {
            this.f59571l.add(eVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f59567h.execute(new com.appsflyer.a(this, 1));
        return task;
    }
}
