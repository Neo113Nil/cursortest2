package lb;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import com.twilio.voice.EventKeys;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: d, reason: collision with root package name */
    public static long f55683d = 3600000;

    /* renamed from: e, reason: collision with root package name */
    public static final zzah f55684e = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", EventKeys.TIMESTAMP);

    /* renamed from: f, reason: collision with root package name */
    public static final H f55685f = new H();

    /* renamed from: a, reason: collision with root package name */
    public Task f55686a;

    /* renamed from: b, reason: collision with root package name */
    public Task f55687b;

    /* renamed from: c, reason: collision with root package name */
    public long f55688c = 0;

    public static void c(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.i());
        edit.putString("statusMessage", status.j());
        edit.putLong(EventKeys.TIMESTAMP, K9.h.c().a());
        edit.commit();
    }

    public static void d(Context context, zzajb zzajbVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", E9.c.f(zzajbVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(EventKeys.TIMESTAMP, K9.h.c().a());
        edit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth) {
        AbstractC3191o.m(context);
        AbstractC3191o.m(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.i().p());
        edit.commit();
    }

    public static void f(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        AbstractC3191o.m(context);
        AbstractC3191o.m(firebaseAuth);
        AbstractC3191o.m(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.i().p());
        edit.putString("firebaseUserUid", firebaseUser.a());
        edit.commit();
    }

    public static void g(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(EventKeys.TIMESTAMP, K9.h.c().a());
        edit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzah zzahVar = f55684e;
        int size = zzahVar.size();
        int i10 = 0;
        while (i10 < size) {
            E e10 = zzahVar.get(i10);
            i10++;
            edit.remove((String) e10);
        }
        edit.commit();
    }

    public static H k() {
        return f55685f;
    }

    public final Task a() {
        if (K9.h.c().a() - this.f55688c < f55683d) {
            return this.f55686a;
        }
        return null;
    }

    public final void b(Context context) {
        AbstractC3191o.m(context);
        h(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f55686a = null;
        this.f55688c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(FirebaseAuth firebaseAuth) {
        AbstractC3191o.m(firebaseAuth);
        char c10 = 0;
        SharedPreferences sharedPreferences = firebaseAuth.i().l().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.i().p().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (sharedPreferences.contains("recaptchaToken")) {
                    String string = sharedPreferences.getString("recaptchaToken", "");
                    String string2 = sharedPreferences.getString("operation", "");
                    this.f55688c = sharedPreferences.getLong(EventKeys.TIMESTAMP, 0L);
                    string2.getClass();
                    this.f55687b = string2.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA") ? Tasks.forResult(string) : null;
                    h(sharedPreferences);
                    return;
                }
                if (sharedPreferences.contains("statusCode")) {
                    Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                    this.f55688c = sharedPreferences.getLong(EventKeys.TIMESTAMP, 0L);
                    h(sharedPreferences);
                    this.f55686a = Tasks.forException(zzaen.zza(status));
                    return;
                }
                return;
            }
            zzajb zzajbVar = (zzajb) E9.c.c(sharedPreferences.getString("verifyAssertionRequest", ""), zzajb.CREATOR);
            String string3 = sharedPreferences.getString("operation", "");
            String string4 = sharedPreferences.getString("tenantId", null);
            String string5 = sharedPreferences.getString("firebaseUserUid", "");
            this.f55688c = sharedPreferences.getLong(EventKeys.TIMESTAMP, 0L);
            if (string4 != null) {
                firebaseAuth.z(string4);
                zzajbVar.zzb(string4);
            }
            string3.getClass();
            switch (string3.hashCode()) {
                case -98509410:
                    break;
                case 175006864:
                    if (string3.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1450464913:
                    if (string3.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (!firebaseAuth.j().a().equals(string5)) {
                        this.f55686a = null;
                        break;
                    } else {
                        this.f55686a = firebaseAuth.t0(firebaseAuth.j(), zze.m(zzajbVar));
                        break;
                    }
                case 1:
                    if (!firebaseAuth.j().a().equals(string5)) {
                        this.f55686a = null;
                        break;
                    } else {
                        this.f55686a = firebaseAuth.P(firebaseAuth.j(), zze.m(zzajbVar));
                        break;
                    }
                case 2:
                    this.f55686a = firebaseAuth.B(zze.m(zzajbVar));
                    break;
                default:
                    this.f55686a = null;
                    break;
            }
            h(sharedPreferences);
        }
    }

    public final Task j() {
        if (K9.h.c().a() - this.f55688c < f55683d) {
            return this.f55687b;
        }
        return null;
    }
}
