package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4094gc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k48 implements l48 {
    public static final Object l = new Object();
    public final r38 a;
    public final i48 b;
    public final k1d c;
    public final tik d;
    public final koa e;
    public final Object f;
    public final ExecutorService g;
    public final j5h h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public k48(r38 r38Var, vff vffVar, ExecutorService executorService, j5h j5hVar) {
        r38Var.a();
        i48 i48Var = new i48(r38Var.a, vffVar);
        k1d k1dVar = new k1d(r38Var, 11);
        kif kifVar = kif.b;
        if (kifVar == null) {
            kifVar = new kif(3);
            kif.b = kifVar;
        }
        tik tikVar = tik.b;
        if (tikVar == null) {
            tikVar = new tik(kifVar);
            tik.b = tikVar;
        }
        koa koaVar = new koa(new dc3(r38Var, 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = r38Var;
        this.b = i48Var;
        this.c = k1dVar;
        this.d = tikVar;
        this.e = koaVar;
        this.g = executorService;
        this.h = j5hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r5 = r6.c;
        r2 = r2.a();
        r2.a = r3;
        r2.b = 3;
        r2 = r2.a();
        r5.u(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        uu0 w;
        int i;
        synchronized (l) {
            try {
                r38 r38Var = this.a;
                r38Var.a();
                z41 n = z41.n(r38Var.a);
                try {
                    w = this.c.w();
                    int i2 = w.b;
                    i = 2;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (n != null) {
                        n.w();
                    }
                } catch (Throwable th) {
                    if (n != null) {
                        n.w();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(w);
        this.h.execute(new j48(this, i));
    }

    public final uu0 b(uu0 uu0Var) {
        String str;
        int responseCode;
        iv0 iv0Var;
        iv0 iv0Var2;
        i48 i48Var = this.b;
        r38 r38Var = this.a;
        r38Var.a();
        String str2 = r38Var.c.a;
        String str3 = uu0Var.a;
        r38 r38Var2 = this.a;
        r38Var2.a();
        String str4 = r38Var2.c.h;
        String str5 = uu0Var.d;
        r5a r5aVar = i48Var.c;
        if (!r5aVar.a()) {
            throw new m48("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = i48.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        int i = 0;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = i48Var.c(a, str2);
            try {
                try {
                    c.setRequestMethod(C4094gc.b);
                    c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c.setDoOutput(true);
                    i48.h(c);
                    responseCode = c.getResponseCode();
                    r5aVar.f(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                str = str5;
            }
            if (responseCode >= 200 && responseCode < 300) {
                iv0Var2 = i48.f(c);
            } else {
                i48.b(c, null);
                str = str5;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    iv0Var = new iv0(3, 0L, null);
                } else {
                    if (responseCode == 429) {
                        throw new m48("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        iv0Var = new iv0(2, 0L, null);
                    }
                    i++;
                    str5 = str;
                }
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                iv0Var2 = iv0Var;
            }
            int C = wt3.C(iv0Var2.c);
            if (C == 0) {
                String str6 = iv0Var2.a;
                long j = iv0Var2.b;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                tu0 a2 = uu0Var.a();
                a2.c = str6;
                a2.e = j;
                byte b = (byte) (a2.h | 1);
                a2.f = currentTimeMillis;
                a2.h = (byte) (b | 2);
                return a2.a();
            }
            if (C == 1) {
                tu0 a3 = uu0Var.a();
                a3.g = "BAD CONFIG";
                a3.b = 5;
                return a3.a();
            }
            if (C != 2) {
                throw new m48("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.i = null;
            }
            tu0 a4 = uu0Var.a();
            a4.b = 2;
            return a4.a();
        }
        throw new m48("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        kx8 kx8Var = new kx8(taskCompletionSource);
        synchronized (this.f) {
            this.k.add(kx8Var);
        }
        Task task = taskCompletionSource.getTask();
        this.g.execute(new j48(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ax8 ax8Var = new ax8(this.d, taskCompletionSource);
        synchronized (this.f) {
            this.k.add(ax8Var);
        }
        Task task = taskCompletionSource.getTask();
        this.g.execute(new j48(this, 1));
        return task;
    }

    public final void e() {
        r38 r38Var = this.a;
        r38Var.a();
        Preconditions.g(r38Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r38Var.a();
        Preconditions.g(r38Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r38Var.a();
        Preconditions.g(r38Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r38Var.a();
        String str = r38Var.c.b;
        Pattern pattern = tik.a;
        Preconditions.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        r38Var.a();
        Preconditions.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", tik.a.matcher(r38Var.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ("[DEFAULT]".equals(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(uu0 uu0Var) {
        PublicKey publicKey;
        r38 r38Var = this.a;
        r38Var.a();
        String str = r38Var.b;
        if (!str.equals("CHIME_ANDROID_SDK")) {
            r38Var.a();
        }
        if (uu0Var.b == 1) {
            jda jdaVar = ((fr9) this.e.get()).a;
            String str2 = null;
            String str3 = (String) jdaVar.b(fr9.d, null);
            if (str3 != null) {
                str2 = str3;
            } else {
                String str4 = (String) jdaVar.b(fr9.c, null);
                if (str4 != null) {
                    try {
                        publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str4, 8)));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                        e.toString();
                        publicKey = null;
                    }
                    if (publicKey != null) {
                        try {
                            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                            str2 = Base64.encodeToString(digest, 0, 8, 11);
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                }
            }
            return TextUtils.isEmpty(str2) ? hlf.a() : str2;
        }
        return hlf.a();
    }

    public final uu0 g(uu0 uu0Var) {
        int responseCode;
        lu0 e;
        String str = uu0Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            fr9 fr9Var = (fr9) this.e.get();
            fr9Var.getClass();
            String[] strArr = fr9.e;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = (String) fr9Var.a.b(new e5f(fc6.n("|T|", fr9Var.b, "|", strArr[i])), null);
                if (str3 == null || str3.isEmpty()) {
                    i++;
                } else if (str3.startsWith("{")) {
                    try {
                        str2 = new JSONObject(str3).getString("token");
                    } catch (JSONException unused) {
                    }
                } else {
                    str2 = str3;
                }
            }
        }
        r38 r38Var = this.a;
        r38Var.a();
        String str4 = r38Var.c.a;
        r38Var.a();
        String str5 = r38Var.c.h;
        r38Var.a();
        String str6 = r38Var.c.b;
        i48 i48Var = this.b;
        r5a r5aVar = i48Var.c;
        if (!r5aVar.a()) {
            throw new m48("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = i48.a("projects/" + str5 + "/installations");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = i48Var.c(a, str4);
            try {
                try {
                    c.setRequestMethod(C4094gc.b);
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    i48.g(c, str, str6);
                    responseCode = c.getResponseCode();
                    r5aVar.f(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e = i48.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    i48.b(c, str6);
                    if (responseCode == 429) {
                        throw new m48("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        lu0 lu0Var = new lu0(null, null, null, null, 2);
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e = lu0Var;
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int C = wt3.C(e.e);
                if (C != 0) {
                    if (C != 1) {
                        throw new m48("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    tu0 a2 = uu0Var.a();
                    a2.g = "BAD CONFIG";
                    a2.b = 5;
                    return a2.a();
                }
                String str7 = e.b;
                String str8 = e.c;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                iv0 iv0Var = e.d;
                String str9 = iv0Var.a;
                long j = iv0Var.b;
                tu0 a3 = uu0Var.a();
                a3.a = str7;
                a3.b = 4;
                a3.c = str9;
                a3.d = str8;
                a3.e = j;
                byte b = (byte) (a3.h | 1);
                a3.f = currentTimeMillis;
                a3.h = (byte) (b | 2);
                return a3.a();
            } catch (Throwable th) {
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new m48("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((ndi) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(uu0 uu0Var) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((ndi) it.next()).b(uu0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
