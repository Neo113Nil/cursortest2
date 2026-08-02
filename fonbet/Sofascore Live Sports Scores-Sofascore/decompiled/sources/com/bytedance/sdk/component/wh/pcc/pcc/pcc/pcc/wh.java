package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends qf {
    public wh(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context, pccVar);
    }

    public static String pcc(String str) {
        return lnb.o("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf
    public byte gm() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf, com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        return com.bytedance.sdk.component.wh.pcc.qf.wh().gm().vj();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf
    public byte pcc() {
        return (byte) 1;
    }
}
