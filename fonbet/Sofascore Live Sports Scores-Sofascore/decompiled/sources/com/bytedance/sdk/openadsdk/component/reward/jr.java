package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr {
    private static final ConcurrentHashMap<pcc, jr> pcc = new ConcurrentHashMap<>();
    private final pcc gm;
    private final Context sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String gm;
        final String oo;
        final String vj;

        pcc(String str, String str2, String str3) {
            this.gm = str;
            this.oo = str2;
            this.vj = str3;
        }
    }

    private jr(Context context, pcc pccVar) {
        this.sf = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        this.gm = pccVar;
    }

    public static jr pcc(Context context, pcc pccVar) {
        ConcurrentHashMap<pcc, jr> concurrentHashMap = pcc;
        if (!concurrentHashMap.containsKey(pccVar)) {
            synchronized (jr.class) {
                try {
                    if (!concurrentHashMap.containsKey(pccVar)) {
                        concurrentHashMap.put(pccVar, new jr(context, pccVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(pccVar);
    }

    public void pcc(String str, of ofVar) {
        com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo).pcc(str, ofVar);
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo).pcc();
    }

    public void pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (pccVar == null || pccVar.qf() == null || !pccVar.qf().duh()) {
            com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo).pcc(adSlot, pccVar);
        }
    }

    public String pcc(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.sf pcc2 = com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo);
        String pcc3 = pcc2.pcc(str, 10500000L);
        if (z && !TextUtils.isEmpty(pcc3) && pcc2.oo(str)) {
            return null;
        }
        return pcc3;
    }

    public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        return com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo).pcc(pccVar, true);
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.common.sf.pcc(this.gm.oo).gm(str);
    }
}
