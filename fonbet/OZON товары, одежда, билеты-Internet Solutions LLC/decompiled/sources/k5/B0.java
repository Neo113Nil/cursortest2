package k5;

import android.content.Context;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class B0 extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0 f70515a;

    B0(C0 c02) {
        this.f70515a = c02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Task task) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return;
        }
        this.f70515a.a(Integer.valueOf(((SafetyNetApi.VerifyAppsUserResponse) task.getResult()).isVerifyAppsEnabled() ? 1 : 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        C0 c02 = this.f70515a;
        c02.a(null);
        context = c02.f70517e;
        Task isVerifyAppsEnabled = SafetyNet.getClient(context).isVerifyAppsEnabled();
        isVerifyAppsEnabled.addOnFailureListener(new OnFailureListener() { // from class: k5.z0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                B0.this.getClass();
            }
        });
        isVerifyAppsEnabled.addOnCompleteListener(InterfaceC7518g2.f70740b, new OnCompleteListener() { // from class: k5.A0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                B0.this.b(task);
            }
        });
    }
}
