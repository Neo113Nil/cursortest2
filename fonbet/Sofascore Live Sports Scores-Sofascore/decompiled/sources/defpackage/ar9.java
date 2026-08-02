package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.Ua;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ar9 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final f79 a;
    public final Context b;
    public final String c;
    public final l48 d;
    public final rd4 e;
    public ju0 f;

    public ar9(Context context, String str, l48 l48Var, rd4 rd4Var) {
        if (context == null) {
            a70.p("appContext must not be null");
            throw null;
        }
        if (str == null) {
            a70.p("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = l48Var;
        this.e = rd4Var;
        this.a = new f79();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)|4|(7:15|16|7|8|9|10|11)|6|7|8|9|10|11) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h48 b(boolean z) {
        String str;
        if (!((Boolean) new ny(0, hcc.f, yx3.class, "isNotMainThread", "isNotMainThread()Z", 0, 5).invoke()).booleanValue()) {
            Thread.currentThread().getName();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l48 l48Var = this.d;
        String str2 = null;
        if (z) {
            try {
                str = ((mu0) Tasks.await(((k48) l48Var).d(), Ua.s, timeUnit)).a;
            } catch (Exception unused) {
            }
            str2 = (String) Tasks.await(((k48) l48Var).c(), Ua.s, timeUnit);
            return new h48(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((k48) l48Var).c(), Ua.s, timeUnit);
        return new h48(str2, str);
    }

    public final synchronized ju0 c() {
        ju0 ju0Var;
        String str;
        ju0 ju0Var2 = this.f;
        if (ju0Var2 != null && (ju0Var2.b != null || !this.e.i())) {
            return this.f;
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        if (this.e.i()) {
            h48 b = b(false);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new h48(str, null);
            }
            if (Objects.equals(b.a, string)) {
                ju0Var = new ju0(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
                this.f = ju0Var;
            } else {
                ju0Var = new ju0(a(sharedPreferences, b.a), b.a, b.b);
                this.f = ju0Var;
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            ju0Var = new ju0(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
            this.f = ju0Var;
        } else {
            ju0Var = new ju0(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
            this.f = ju0Var;
        }
        Objects.toString(ju0Var);
        return this.f;
    }

    public final String d() {
        String str;
        f79 f79Var = this.a;
        Context context = this.b;
        synchronized (f79Var) {
            try {
                String str2 = f79Var.b;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    f79Var.b = str2;
                }
                str = "".equals(str2) ? null : f79Var.b;
            } finally {
            }
        }
        return str;
    }
}
