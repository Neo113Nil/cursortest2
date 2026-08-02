package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wcm extends BroadcastReceiver {
    public final /* synthetic */ ful a;

    public wcm(ful fulVar) {
        this.a = fulVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        ful fulVar = this.a;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                return;
            }
        } else {
            action = null;
        }
        if (Intrinsics.c(action, BlazeSDK.ENABLE_UI_INTERACTION_AND_ALLOW_PLAYER_PLAY_PERMISSION)) {
            fulVar.g(ori.a);
            fulVar.e(a1n.a, true);
        }
    }
}
