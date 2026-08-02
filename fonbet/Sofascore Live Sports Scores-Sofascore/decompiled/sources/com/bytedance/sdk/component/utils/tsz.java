package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tsz extends Handler {
    protected WeakReference<pcc> pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(Message message);
    }

    public tsz(pcc pccVar) {
        if (pccVar != null) {
            this.pcc = new WeakReference<>(pccVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pcc pccVar;
        WeakReference<pcc> weakReference = this.pcc;
        if (weakReference == null || (pccVar = weakReference.get()) == null || message == null) {
            return;
        }
        pccVar.pcc(message);
    }

    public tsz(Looper looper, pcc pccVar) {
        super(looper);
        if (pccVar != null) {
            this.pcc = new WeakReference<>(pccVar);
        }
    }
}
