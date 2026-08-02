package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q48 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ q48(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        int i = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                iqj iqjVar = (iqj) obj;
                if (!firebaseMessaging.f.s() || iqjVar.g.a() == null) {
                    return;
                }
                synchronized (iqjVar) {
                    z = iqjVar.f;
                }
                if (z) {
                    return;
                }
                iqjVar.c(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    qea.A(cloudMessage.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
