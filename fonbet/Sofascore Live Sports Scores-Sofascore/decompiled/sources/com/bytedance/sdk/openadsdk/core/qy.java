package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qy implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene pcc;

    public qy(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.pcc = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        jsj.pcc(1, this.pcc, i);
        return com.bytedance.sdk.component.utils.pcc.pcc(jSONObject);
    }
}
