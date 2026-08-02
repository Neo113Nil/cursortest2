package defpackage;

import android.window.OnBackInvokedCallback;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.sdk.controller.ControllerActivity;
import com.mbridge.msdk.config.activity.backdispatcher.b;
import com.vungle.ads.internal.ui.l;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h90 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                ((ub0) obj).I();
                break;
            case 2:
                ((ControllerActivity) obj).g();
                break;
            case 3:
                InMobiAdActivity.a((InMobiAdActivity) obj);
                break;
            case 4:
                ((iyb) obj).c();
                break;
            case 5:
                ((npd) obj).a();
                break;
            case 6:
                ((Runnable) obj).run();
                break;
            case 7:
                ((b) obj).a();
                break;
            default:
                l.b((l) obj);
                break;
        }
    }
}
