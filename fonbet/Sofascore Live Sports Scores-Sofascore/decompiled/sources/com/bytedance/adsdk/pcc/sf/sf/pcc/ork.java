package com.bytedance.adsdk.pcc.sf.sf.pcc;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private com.bytedance.adsdk.pcc.sf.pcc.pcc gm;
    private boolean oo;
    private com.bytedance.adsdk.pcc.sf.sf.pcc[] pcc;
    private String sf;

    public ork(String str) {
        this.sf = str;
    }

    public boolean gm() {
        return this.oo;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        com.bytedance.adsdk.pcc.sf.pcc.pcc pccVar = new com.bytedance.adsdk.pcc.sf.pcc.pcc();
        this.gm = pccVar;
        pccVar.pcc(this.sf);
        Object[] objArr = new Object[this.pcc.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.pcc.sf.sf.pcc[] pccVarArr = this.pcc;
            if (i >= pccVarArr.length) {
                this.gm.pcc(objArr);
                return com.bytedance.adsdk.pcc.nac.pcc(this.sf).pcc(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.pcc.sf.sf.pcc pccVar2 = pccVarArr[i];
            if (pccVar2 != null) {
                objArr[i] = pccVar2.pcc(map);
            }
            i++;
        }
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sf);
        sb.append("(");
        com.bytedance.adsdk.pcc.sf.sf.pcc[] pccVarArr = this.pcc;
        if (pccVarArr != null && pccVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.pcc.sf.sf.pcc[] pccVarArr2 = this.pcc;
                if (i >= pccVarArr2.length) {
                    break;
                }
                sb.append(pccVarArr2[i].sf());
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void pcc(boolean z) {
        this.oo = z;
    }

    public void pcc(com.bytedance.adsdk.pcc.sf.sf.pcc[] pccVarArr) {
        this.pcc = pccVarArr;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.sf.METHOD;
    }
}
