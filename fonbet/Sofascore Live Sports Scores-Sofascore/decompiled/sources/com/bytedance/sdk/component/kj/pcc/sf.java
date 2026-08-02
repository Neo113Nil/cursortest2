package com.bytedance.sdk.component.kj.pcc;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.tsz;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends tsz implements gm {
    private final HandlerThread sf;

    public sf(HandlerThread handlerThread, tsz.pcc pccVar) {
        super(handlerThread.getLooper(), pccVar);
        this.sf = handlerThread;
    }

    @Override // com.bytedance.sdk.component.kj.pcc.gm
    public void pcc() {
        removeCallbacksAndMessages(null);
        WeakReference<tsz.pcc> weakReference = this.pcc;
        if (weakReference != null) {
            weakReference.clear();
            this.pcc = null;
        }
    }

    public void sf() {
        HandlerThread handlerThread = this.sf;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void pcc(tsz.pcc pccVar) {
        this.pcc = new WeakReference<>(pccVar);
    }
}
