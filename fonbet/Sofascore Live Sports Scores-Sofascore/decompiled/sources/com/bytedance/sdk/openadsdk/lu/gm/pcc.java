package com.bytedance.sdk.openadsdk.lu.gm;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.fum;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final SharedPreferences pcc;

    public pcc(Context context) {
        if (fum.pcc(context)) {
            this.pcc = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.pcc = context.getSharedPreferences("pag_monitor_record_" + fum.gm(context), 0);
    }

    public void pcc(long j) {
        SharedPreferences.Editor edit = this.pcc.edit();
        edit.putLong("last_upload_time", j);
        edit.apply();
    }

    public long pcc() {
        return this.pcc.getLong("last_upload_time", 0L);
    }
}
