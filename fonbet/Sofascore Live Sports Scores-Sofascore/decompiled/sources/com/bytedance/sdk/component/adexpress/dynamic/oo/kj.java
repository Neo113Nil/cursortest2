package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.me4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private boolean gbb;
    private float gm;
    private String hc;
    private float kj;
    private float oo;
    private List<kj> ork;
    private String pcc;
    private float qf;
    private float sf;
    private List<List<kj>> tmg;
    private kj vh;
    private float vj;
    private vj vy;
    private float wh;
    private Map<String, String> jr = new HashMap();
    private Map<Integer, String> dax = new HashMap();

    public float dax() {
        wh vj = this.vy.vj();
        return (vj.tmg() * 2.0f) + vj.gbb() + vj.nac() + gbb();
    }

    public void fum() {
        List<List<kj>> list = this.tmg;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<kj> list2 : this.tmg) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.tmg = arrayList;
    }

    public int gbb() {
        wh vj = this.vy.vj();
        return vj.hpk() + vj.ri();
    }

    public void gm(String str) {
        this.vy.vj().wh(str);
    }

    public boolean gpj() {
        return this.gbb;
    }

    public int hc() {
        wh vj = this.vy.vj();
        return vj.zsj() + vj.fmh();
    }

    public float jr() {
        wh vj = this.vy.vj();
        return (vj.tmg() * 2.0f) + vj.dax() + vj.jr() + hc();
    }

    public float kj() {
        return this.wh;
    }

    public Map<String, String> lo() {
        return this.jr;
    }

    public boolean lu() {
        List<kj> list = this.ork;
        return list == null || list.size() <= 0;
    }

    public List<List<kj>> nac() {
        return this.tmg;
    }

    public String of() {
        return this.vy.vj().of();
    }

    public float oo() {
        return this.oo;
    }

    public vj ork() {
        return this.vy;
    }

    public String pcc(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vy.sf());
        sb.append(":");
        sb.append(this.pcc);
        if (this.vy.vj() != null) {
            sb.append(":");
            sb.append(this.vy.vj().kez());
        }
        return me4.g(i, ":", sb);
    }

    public float qf() {
        return this.gm;
    }

    public Map<Integer, String> sf() {
        return this.dax;
    }

    public kj tmg() {
        return this.vh;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutUnit{id='");
        sb.append(this.pcc);
        sb.append("', x=");
        sb.append(this.sf);
        sb.append(", y=");
        sb.append(this.gm);
        sb.append(", width=");
        sb.append(this.wh);
        sb.append(", height=");
        sb.append(this.qf);
        sb.append(", remainWidth=");
        sb.append(this.kj);
        sb.append(", rootBrick=");
        sb.append(this.vy);
        sb.append(", childrenBrickUnits=");
        return fc6.p(sb, this.ork, '}');
    }

    public boolean tz() {
        return TextUtils.equals(this.vy.vj().mk(), "flex");
    }

    public List<kj> vh() {
        return this.ork;
    }

    public float vj() {
        return this.vj;
    }

    public float vy() {
        return this.qf;
    }

    public float wh() {
        return this.sf;
    }

    public boolean yt() {
        return this.vy.vj().qc() < 0 || this.vy.vj().wax() < 0 || this.vy.vj().ra() < 0 || this.vy.vj().rt() < 0;
    }

    public void oo(float f) {
        this.gm = f;
    }

    public void qf(float f) {
        this.kj = f;
    }

    public void sf(String str) {
        this.pcc = str;
    }

    public void vj(float f) {
        this.wh = f;
    }

    public void wh(float f) {
        this.qf = f;
    }

    public void sf(float f) {
        this.vj = f;
    }

    public void sf(List<List<kj>> list) {
        this.tmg = list;
    }

    public void gm(float f) {
        this.sf = f;
    }

    public String gm() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.hc = str;
    }

    public void pcc(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.dax.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString(U3.i.X));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(float f) {
        this.oo = f;
    }

    public void pcc(vj vjVar) {
        this.vy = vjVar;
    }

    public void pcc(List<kj> list) {
        this.ork = list;
    }

    public void pcc(kj kjVar) {
        this.vh = kjVar;
    }

    public void pcc(boolean z) {
        this.gbb = z;
    }

    public void pcc(String str, String str2) {
        this.jr.put(str, str2);
    }

    public String pcc() {
        return this.hc;
    }
}
