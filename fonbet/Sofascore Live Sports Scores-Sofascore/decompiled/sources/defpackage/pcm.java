package defpackage;

import android.webkit.JavascriptInterface;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pcm implements ujm {
    public final /* synthetic */ String a;
    public final /* synthetic */ m0m b;

    public pcm(String str, m0m m0mVar) {
        this.a = str;
        this.b = m0mVar;
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void goToNextItem() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 5));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void goToNextPage() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 3));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void goToPreviousItem() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 4));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void goToPreviousPage() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 2));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void hapticFeedback(String str) {
        str.getClass();
        boolean J = StringsKt.J(str, "correctAnswerFeedback", true);
        m0m m0mVar = this.b;
        if (J) {
            lpl lplVar = lpl.CORRECT;
            int i = m0m.e;
            m0mVar.getClass();
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new agm(m0mVar, lplVar, null), 1, null);
            return;
        }
        if (StringsKt.J(str, "wrongAnswerFeedback", true)) {
            lpl lplVar2 = lpl.WRONG;
            int i2 = m0m.e;
            m0mVar.getClass();
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new agm(m0mVar, lplVar2, null), 1, null);
            return;
        }
        if (StringsKt.J(str, "selectionFeedback", true)) {
            lpl lplVar3 = lpl.SELECTION;
            int i3 = m0m.e;
            m0mVar.getClass();
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new agm(m0mVar, lplVar3, null), 1, null);
        }
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void pause() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 0));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void play() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 1));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void postMessage(String str) {
        str.getClass();
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void postResponse(String str) {
        str.getClass();
        m0m m0mVar = this.b;
        if (Intrinsics.c(this.a, m0mVar.a)) {
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new aam(m0mVar, str, null), 1, null);
        }
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void readyToDisplay() {
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new kbm(m0mVar, 6));
    }

    @Override // defpackage.ujm
    @JavascriptInterface
    public void setAppContext(String str) {
        str.getClass();
        m0m m0mVar = this.b;
        m0m.a(m0mVar, new ufl(10, m0mVar, str));
    }
}
