package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.of;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends tmg {
    public oo(@NonNull Context context) {
        super(context);
        this.sf = false;
    }

    public void pcc(of ofVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.tmg
    public void pcc() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.oo.1
            @Override // java.lang.Runnable
            public void run() {
                oo ooVar = oo.this;
                if (ooVar.pcc != null) {
                    ooVar.setVisibility(0);
                }
            }
        });
    }
}
