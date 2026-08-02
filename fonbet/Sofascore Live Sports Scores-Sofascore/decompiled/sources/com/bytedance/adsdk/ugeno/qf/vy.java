package com.bytedance.adsdk.ugeno.qf;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends Handler {
    private final WeakReference<pcc> pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(Message message);
    }

    public vy(Looper looper, pcc pccVar) {
        super(looper);
        this.pcc = new WeakReference<>(pccVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        pcc pccVar = this.pcc.get();
        if (pccVar == null || message == null) {
            return;
        }
        pccVar.pcc(message);
    }
}
