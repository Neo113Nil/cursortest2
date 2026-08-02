package com.bytedance.sdk.component.adexpress.vj;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.pcc.lo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private WeakReference<lo> pcc;

    public oo(lo loVar) {
        this.pcc = new WeakReference<>(loVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<lo> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().invokeMethod(str);
    }

    public void pcc(lo loVar) {
        this.pcc = new WeakReference<>(loVar);
    }
}
