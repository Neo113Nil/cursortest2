package k5;

import Ve.Sp;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
final class r extends D0<String> implements v3 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70834e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final Sp f70835f;

    /* renamed from: g, reason: collision with root package name */
    private volatile String f70836g;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f70837h;

    r(@NonNull Sp sp, @NonNull Context context) {
        super(Mm0.e.AgentAppInfo);
        this.f70834e = context;
        this.f70835f = sp;
    }

    public static /* synthetic */ String w(r rVar) {
        Context context = rVar.f70834e;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.labelRes;
        return i11 == 0 ? context.getPackageManager().getApplicationLabel(applicationInfo).toString() : context.getString(i11);
    }

    public static /* synthetic */ String y(r rVar) {
        Context context = rVar.f70834e;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Override // k5.v3
    @NonNull
    public final Pm0.a<?> c() {
        return this.f70835f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        StringBuilder sb2 = new StringBuilder();
        if (this.f70836g == null) {
            this.f70836g = (String) n(new Callable() { // from class: k5.q
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return r.w(r.this);
                }
            });
        }
        sb2.append(this.f70836g);
        sb2.append(" ");
        if (this.f70837h == null) {
            this.f70837h = (String) n(new Callable() { // from class: k5.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return r.y(r.this);
                }
            });
        }
        sb2.append(this.f70837h);
        sb2.append(" ");
        sb2.append(Build.CPU_ABI);
        return sb2.toString();
    }
}
