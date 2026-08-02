package com.bytedance.sdk.openadsdk.oo.pcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements com.bytedance.sdk.component.wh.pcc.pcc.vj {
    public static final oo pcc = new oo();
    private volatile SQLiteDatabase sf;

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String gm() {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String oo() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public SQLiteDatabase pcc(Context context) {
        if (this.sf == null) {
            synchronized (this) {
                try {
                    if (this.sf == null) {
                        this.sf = com.bytedance.sdk.openadsdk.core.wh.pcc(context).pcc().pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String sf() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String vj() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String wh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String pcc() {
        return "loghighpriority";
    }
}
