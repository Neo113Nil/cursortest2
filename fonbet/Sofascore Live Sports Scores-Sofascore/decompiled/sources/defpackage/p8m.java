package defpackage;

import android.webkit.JavascriptInterface;
import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p8m implements fbm {
    public final /* synthetic */ xyl a;

    public p8m(xyl xylVar) {
        this.a = xylVar;
    }

    @Override // defpackage.fbm
    @JavascriptInterface
    public void readyToDisplay() {
        evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new v2m(this.a, null), 1, null);
    }
}
