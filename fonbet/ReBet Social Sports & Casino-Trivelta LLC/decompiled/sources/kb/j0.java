package kb;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j0 extends lb.K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f54401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionCodeSettings f54402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f54403c;

    public j0(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.f54401a = str;
        this.f54402b = actionCodeSettings;
        Objects.requireNonNull(firebaseAuth);
        this.f54403c = firebaseAuth;
    }

    @Override // lb.K
    public final Task c(String str) {
        C4196f c4196f;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.f54401a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.f54401a);
        }
        FirebaseAuth firebaseAuth = this.f54403c;
        zzacq zzacqVar = firebaseAuth.f37561e;
        c4196f = firebaseAuth.f37557a;
        String str3 = this.f54401a;
        ActionCodeSettings actionCodeSettings = this.f54402b;
        str2 = this.f54403c.f37567k;
        return zzacqVar.zza(c4196f, str3, actionCodeSettings, str2, str);
    }
}
