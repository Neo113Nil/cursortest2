package defpackage;

import android.webkit.ValueCallback;
import com.mbridge.msdk.config.component.wei.WeiCpt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5l implements ValueCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ r5l(int i) {
        this.a = i;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                WeiCpt.c(str);
                break;
            default:
                int i = lsl.b;
                break;
        }
    }
}
