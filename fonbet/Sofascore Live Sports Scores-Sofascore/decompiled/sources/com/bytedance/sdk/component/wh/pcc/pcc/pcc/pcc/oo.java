package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends pcc {
    public oo(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context, pccVar);
    }

    public static String gm(String str) {
        return lnb.o("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc
    public byte oo() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc, com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        com.bytedance.sdk.component.wh.pcc.pcc.vj gm = com.bytedance.sdk.component.wh.pcc.qf.wh().gm();
        if (gm != null) {
            return gm.pcc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public long wh() {
        return com.bytedance.sdk.component.wh.pcc.qf.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc
    public byte gm() {
        return (byte) 1;
    }
}
