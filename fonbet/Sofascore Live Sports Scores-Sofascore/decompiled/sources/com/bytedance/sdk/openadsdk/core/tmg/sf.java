package com.bytedance.sdk.openadsdk.core.tmg;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class sf {
    private static com.bytedance.sdk.openadsdk.core.tmg.pcc pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private static final sf pcc = new sf();
    }

    private sf() {
        pcc = new com.bytedance.sdk.openadsdk.core.tmg.pcc();
    }

    public boolean gm() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar == null) {
            return false;
        }
        return pccVar.sf();
    }

    public String oo() {
        String oo;
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        return (pccVar == null || (oo = pccVar.oo()) == null) ? "" : oo;
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar;
        if (TextUtils.isEmpty(str) || (pccVar = pcc) == null) {
            return;
        }
        pccVar.pcc(str);
    }

    public int qf() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.qf();
        }
        return 1;
    }

    public void sf(String str) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar;
        if (TextUtils.isEmpty(str) || (pccVar = pcc) == null) {
            return;
        }
        pccVar.sf(str);
    }

    public String vj() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        return pccVar != null ? pccVar.vj() : "";
    }

    public long wh() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return 0L;
    }

    public static sf sf() {
        return pcc.pcc;
    }

    public void pcc(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(map);
        }
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    public void pcc(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(str, map);
        }
    }

    public Map<String, String> pcc(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            return pccVar.pcc(str, bArr);
        }
        return new HashMap();
    }

    public void pcc(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.tmg.pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(motionEvent);
        }
    }
}
