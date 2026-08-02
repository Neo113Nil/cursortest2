package lb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f55702a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f55703b;

    /* renamed from: c, reason: collision with root package name */
    public zzahs f55704c;

    /* renamed from: d, reason: collision with root package name */
    public C4196f f55705d;

    /* renamed from: e, reason: collision with root package name */
    public FirebaseAuth f55706e;

    /* renamed from: f, reason: collision with root package name */
    public N f55707f;

    public T(C4196f c4196f, FirebaseAuth firebaseAuth) {
        this(c4196f, firebaseAuth, new Q());
    }

    public static /* synthetic */ void c(T t10, zzahs zzahsVar, Task task, String str) {
        synchronized (t10.f55702a) {
            t10.f55704c = zzahsVar;
            t10.f55703b.put(str, task);
        }
    }

    public static String g(String str) {
        return zzac.zzc(str) ? "*" : str;
    }

    public final Task a(String str, Boolean bool) {
        Task f10;
        String g10 = g(str);
        return (bool.booleanValue() || (f10 = f(g10)) == null) ? this.f55706e.X("RECAPTCHA_ENTERPRISE").continueWithTask(new S(this, g10)) : f10;
    }

    public final Task b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String g10 = g(str);
        Task f10 = f(g10);
        if (bool.booleanValue() || f10 == null) {
            f10 = a(g10, bool);
        }
        return f10.continueWithTask(new V(this, recaptchaAction));
    }

    public final boolean d(String str) {
        String zzb;
        AbstractC3191o.m(str);
        zzahs zzahsVar = this.f55704c;
        if (zzahsVar == null || (zzb = zzahsVar.zzb(str)) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }

    public final boolean e(String str) {
        boolean z10;
        synchronized (this.f55702a) {
            try {
                zzahs zzahsVar = this.f55704c;
                z10 = zzahsVar != null && zzahsVar.zzc(str);
            } finally {
            }
        }
        return z10;
    }

    public final Task f(String str) {
        Task task;
        synchronized (this.f55702a) {
            task = (Task) this.f55703b.get(str);
        }
        return task;
    }

    public T(C4196f c4196f, FirebaseAuth firebaseAuth, N n10) {
        this.f55702a = new Object();
        this.f55703b = new HashMap();
        this.f55705d = c4196f;
        this.f55706e = firebaseAuth;
        this.f55707f = n10;
    }
}
