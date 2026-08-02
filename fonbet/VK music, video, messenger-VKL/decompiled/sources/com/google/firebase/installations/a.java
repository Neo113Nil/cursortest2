package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.a;
import com.google.firebase.installations.remote.b;
import com.google.firebase.installations.remote.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import ru.ok.android.commons.http.Http;
import xsna.aqt;
import xsna.cqy;
import xsna.exc0;
import xsna.f9e0;
import xsna.fjk;
import xsna.fst;
import xsna.fwe0;
import xsna.guk0;
import xsna.gwv;
import xsna.h3r0;
import xsna.o8i;
import xsna.sir;
import xsna.sli0;
import xsna.u7g0;
import xsna.uir;
import xsna.vhr;
import xsna.yfb;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes.dex */
public final class a implements uir {
    public static final Object m = new Object();
    public final vhr a;
    public final c b;
    public final PersistedInstallation c;
    public final h3r0 d;
    public final cqy<gwv> e;
    public final fwe0 f;
    public final Object g;
    public final ExecutorService h;
    public final sli0 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class C0137a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a(final vhr vhrVar, @NonNull f9e0 f9e0Var, @NonNull ExecutorService executorService, @NonNull sli0 sli0Var) {
        vhrVar.a();
        c cVar = new c(vhrVar.a, f9e0Var);
        PersistedInstallation persistedInstallation = new PersistedInstallation(vhrVar);
        if (yfb.b == null) {
            yfb.b = new yfb();
        }
        yfb yfbVar = yfb.b;
        if (h3r0.d == null) {
            h3r0.d = new h3r0(yfbVar);
        }
        h3r0 h3r0Var = h3r0.d;
        cqy<gwv> cqyVar = new cqy<>(new f9e0() { // from class: xsna.rir
            @Override // xsna.f9e0
            public final Object get() {
                return new gwv(vhr.this);
            }
        });
        fwe0 fwe0Var = new fwe0();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = vhrVar;
        this.b = cVar;
        this.c = persistedInstallation;
        this.d = h3r0Var;
        this.e = cqyVar;
        this.f = fwe0Var;
        this.h = executorService;
        this.i = sli0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if ("[DEFAULT]".equals(r4.b) != false) goto L17;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:6:0x000e, B:8:0x001a, B:13:0x0024, B:15:0x0035, B:17:0x0062, B:18:0x0069, B:20:0x0042, B:22:0x0048, B:24:0x005a), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:4:0x0003, B:26:0x0082, B:27:0x0088, B:34:0x0099, B:35:0x009c, B:6:0x000e, B:8:0x001a, B:13:0x0024, B:15:0x0035, B:17:0x0062, B:18:0x0069, B:20:0x0042, B:22:0x0048, B:24:0x005a), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        com.google.firebase.installations.local.a c;
        boolean z;
        String a;
        synchronized (m) {
            try {
                vhr vhrVar = this.a;
                vhrVar.a();
                fjk a2 = fjk.a(vhrVar.a);
                try {
                    c = this.c.c();
                    PersistedInstallation.RegistrationStatus registrationStatus = c.c;
                    if (registrationStatus != PersistedInstallation.RegistrationStatus.NOT_GENERATED && registrationStatus != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                        z = false;
                        if (z) {
                            fwe0 fwe0Var = this.f;
                            vhr vhrVar2 = this.a;
                            vhrVar2.a();
                            if (!vhrVar2.b.equals("CHIME_ANDROID_SDK")) {
                                vhrVar2.a();
                            }
                            if (c.c == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                                a = this.e.get().a();
                                if (TextUtils.isEmpty(a)) {
                                    fwe0Var.getClass();
                                    a = fwe0.a();
                                }
                                PersistedInstallation persistedInstallation = this.c;
                                a.C0138a h = c.h();
                                h.a = a;
                                h.b(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                                c = h.a();
                                persistedInstallation.b(c);
                            }
                            fwe0Var.getClass();
                            a = fwe0.a();
                            PersistedInstallation persistedInstallation2 = this.c;
                            a.C0138a h2 = c.h();
                            h2.a = a;
                            h2.b(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                            c = h2.a();
                            persistedInstallation2.b(c);
                        }
                        if (a2 != null) {
                            a2.b();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    if (a2 != null) {
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f(c);
        this.i.execute(new Runnable() { // from class: xsna.tir
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                com.google.firebase.installations.local.a c2;
                com.google.firebase.installations.local.a d;
                com.google.firebase.installations.a aVar = com.google.firebase.installations.a.this;
                Object obj = com.google.firebase.installations.a.m;
                synchronized (obj) {
                    try {
                        vhr vhrVar3 = aVar.a;
                        vhrVar3.a();
                        fjk a3 = fjk.a(vhrVar3.a);
                        try {
                            c2 = aVar.c.c();
                            if (a3 != null) {
                                a3.b();
                            }
                        } catch (Throwable th3) {
                            if (a3 != null) {
                                a3.b();
                            }
                            throw th3;
                        }
                    } finally {
                    }
                }
                try {
                    if (!(c2.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR)) {
                        if (!(c2.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED)) {
                            if (aVar.d.a(c2)) {
                                d = aVar.b(c2);
                                synchronized (obj) {
                                    try {
                                        vhr vhrVar4 = aVar.a;
                                        vhrVar4.a();
                                        fjk a4 = fjk.a(vhrVar4.a);
                                        try {
                                            aVar.c.b(d);
                                            if (a4 != null) {
                                                a4.b();
                                            }
                                        } catch (Throwable th4) {
                                            if (a4 != null) {
                                                a4.b();
                                            }
                                            throw th4;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (aVar) {
                                    if (aVar.k.size() != 0 && !TextUtils.equals(c2.b, d.b)) {
                                        Iterator it = aVar.k.iterator();
                                        while (it.hasNext()) {
                                            ((y6r) it.next()).a();
                                        }
                                    }
                                }
                                if (d.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                                    String str = d.b;
                                    synchronized (aVar) {
                                        aVar.j = str;
                                    }
                                }
                                if (d.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                                    aVar.e(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                                    return;
                                }
                                PersistedInstallation.RegistrationStatus registrationStatus2 = d.c;
                                if (registrationStatus2 == PersistedInstallation.RegistrationStatus.NOT_GENERATED || registrationStatus2 == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                                    aVar.e(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    aVar.f(d);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    d = aVar.d(c2);
                    synchronized (obj) {
                    }
                } catch (FirebaseInstallationsException e) {
                    aVar.e(e);
                }
            }
        });
    }

    public final com.google.firebase.installations.local.a b(@NonNull com.google.firebase.installations.local.a aVar) throws FirebaseInstallationsException {
        int responseCode;
        b f;
        c cVar = this.b;
        vhr vhrVar = this.a;
        vhrVar.a();
        String str = vhrVar.c.a;
        String str2 = aVar.b;
        vhr vhrVar2 = this.a;
        vhrVar2.a();
        String str3 = vhrVar2.c.g;
        String str4 = aVar.e;
        u7g0 u7g0Var = cVar.c;
        if (!u7g0Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL a = c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = cVar.c(a, str);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty(Http.Header.AUTHORIZATION, "FIS_v2 " + str4);
                    c.setDoOutput(true);
                    c.h(c);
                    responseCode = c.getResponseCode();
                    u7g0Var.b(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f = c.f(c);
            } else {
                c.b(c, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    b.a a2 = TokenResult.a();
                    a2.b(TokenResult.ResponseCode.AUTH_ERROR);
                    f = a2.a();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        b.a a3 = TokenResult.a();
                        a3.b(TokenResult.ResponseCode.BAD_CONFIG);
                        f = a3.a();
                    }
                }
            }
            int i2 = C0137a.b[f.b().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    a.C0138a h = aVar.h();
                    h.g = "BAD CONFIG";
                    h.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                    return h.a();
                }
                if (i2 != 3) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
                synchronized (this) {
                    this.j = null;
                }
                a.C0138a h2 = aVar.h();
                h2.b(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
                return h2.a();
            }
            String c2 = f.c();
            long d = f.d();
            h3r0 h3r0Var = this.d;
            h3r0Var.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            h3r0Var.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            a.C0138a h3 = aVar.h();
            h3.c = c2;
            h3.e = Long.valueOf(d);
            h3.f = Long.valueOf(seconds);
            return h3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void c() {
        vhr vhrVar = this.a;
        vhrVar.a();
        exc0.g(vhrVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        vhrVar.a();
        exc0.g(vhrVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        vhrVar.a();
        exc0.g(vhrVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        vhrVar.a();
        String str = vhrVar.c.b;
        Pattern pattern = h3r0.c;
        exc0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        vhrVar.a();
        exc0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", h3r0.c.matcher(vhrVar.c.a).matches());
    }

    public final com.google.firebase.installations.local.a d(com.google.firebase.installations.local.a aVar) throws FirebaseInstallationsException {
        int responseCode;
        com.google.firebase.installations.remote.a e;
        String str = aVar.b;
        String c = (str == null || str.length() != 11) ? null : this.e.get().c();
        vhr vhrVar = this.a;
        vhrVar.a();
        String str2 = vhrVar.c.a;
        vhrVar.a();
        String str3 = vhrVar.c.g;
        vhrVar.a();
        String str4 = vhrVar.c.b;
        c cVar = this.b;
        u7g0 u7g0Var = cVar.c;
        if (!u7g0Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL a = c.a("projects/" + str3 + "/installations");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c2 = cVar.c(a, str2);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (c != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", c);
                    }
                    c.g(c2, str, str4);
                    responseCode = c2.getResponseCode();
                    u7g0Var.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e = c.e(c2);
                } else {
                    c.b(c2, str4, str2, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        a.C0139a a2 = InstallationResponse.a();
                        a2.e(InstallationResponse.ResponseCode.BAD_CONFIG);
                        e = a2.a();
                    }
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
                int i2 = C0137a.a[e.e().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                    a.C0138a h = aVar.h();
                    h.g = "BAD CONFIG";
                    h.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                    return h.a();
                }
                String c3 = e.c();
                String d = e.d();
                h3r0 h3r0Var = this.d;
                h3r0Var.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                h3r0Var.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                String c4 = e.b().c();
                long d2 = e.b().d();
                a.C0138a h2 = aVar.h();
                h2.a = c3;
                h2.b(PersistedInstallation.RegistrationStatus.REGISTERED);
                h2.c = c4;
                h2.d = d;
                h2.e = Long.valueOf(d2);
                h2.f = Long.valueOf(seconds);
                return h2.a();
            } catch (Throwable th) {
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void e(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((guk0) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(com.google.firebase.installations.local.a aVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((guk0) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.uir
    @NonNull
    public final Task<String> getId() {
        String str;
        c();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fst fstVar = new fst(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(fstVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.h.execute(new sir(this, 0));
        return task;
    }

    @Override // xsna.uir
    @NonNull
    public final Task getToken() {
        c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        aqt aqtVar = new aqt(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(aqtVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new o8i(this, 2));
        return task;
    }
}
