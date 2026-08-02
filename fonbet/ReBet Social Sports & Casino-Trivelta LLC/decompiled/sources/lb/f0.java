package lb;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f55758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5444x f55759c;

    public f0(C5444x c5444x, String str, IntegrityManager integrityManager) {
        this.f55757a = str;
        this.f55758b = integrityManager;
        Objects.requireNonNull(c5444x);
        this.f55759c = c5444x;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        String str;
        if (task.isSuccessful()) {
            this.f55759c.f55810a = ((zzahr) task.getResult()).zza();
            return this.f55758b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzahr) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f55757a.getBytes("UTF-8")), 11))).build());
        }
        str = C5444x.f55808b;
        Log.e(str, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
