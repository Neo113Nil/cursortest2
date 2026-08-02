package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0481 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1549;

    public C0481(C0470 c0470) {
        this.f1549 = c0470;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0470 c0470 = this.f1549;
        if (!c0470.f1524) {
            c0470.f1521 = null;
            return;
        }
        HashMap hashMap = new HashMap(c0470.f1523);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f1549.f1522.post((Runnable) hashMap.get((InterfaceC0686) it.next()));
        }
        C0470 c04702 = this.f1549;
        if (c04702.f1521 == null) {
            c04702.f1521 = new ChoreographerFrameCallbackC0482(this);
        }
        Choreographer.getInstance().postFrameCallback(this.f1549.f1521);
    }
}
