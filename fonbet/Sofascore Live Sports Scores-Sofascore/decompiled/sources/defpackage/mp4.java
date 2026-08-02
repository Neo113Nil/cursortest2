package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp4 implements ec3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oif b;

    public /* synthetic */ mp4(oif oifVar, int i) {
        this.a = i;
        this.b = oifVar;
    }

    @Override // defpackage.ec3
    public final Object l(vng vngVar) {
        FirebaseMessaging lambda$getComponents$0;
        u48 lambda$getComponents$02;
        lxf lambda$getComponents$03;
        int i = this.a;
        oif oifVar = this.b;
        switch (i) {
            case 0:
                return new op4((Context) vngVar.e(Context.class), ((r38) vngVar.e(r38.class)).d(), vngVar.i(oif.a(a99.class)), vngVar.j(nu4.class), (Executor) vngVar.h(oifVar));
            case 1:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(oifVar, vngVar);
                return lambda$getComponents$0;
            case 2:
                lambda$getComponents$02 = FirebasePerfRegistrar.lambda$getComponents$0(oifVar, vngVar);
                return lambda$getComponents$02;
            default:
                lambda$getComponents$03 = RemoteConfigRegistrar.lambda$getComponents$0(oifVar, vngVar);
                return lambda$getComponents$03;
        }
    }
}
