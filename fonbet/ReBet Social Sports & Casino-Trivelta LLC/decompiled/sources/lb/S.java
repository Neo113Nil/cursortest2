package lb;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class S implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f55701b;

    public S(T t10, String str) {
        this.f55700a = str;
        Objects.requireNonNull(t10);
        this.f55701b = t10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new P((String) AbstractC3191o.m(((Exception) AbstractC3191o.m(task.getException())).getMessage())));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String zza = zzahsVar.zza();
        if (zzac.zzc(zza)) {
            return Tasks.forException(new P("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f55700a));
        }
        List<String> zza2 = zzt.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f55700a);
        }
        T t10 = this.f55701b;
        Task a10 = t10.f55707f.a((Application) t10.f55705d.l(), str);
        T.c(this.f55701b, zzahsVar, a10, this.f55700a);
        return a10;
    }
}
