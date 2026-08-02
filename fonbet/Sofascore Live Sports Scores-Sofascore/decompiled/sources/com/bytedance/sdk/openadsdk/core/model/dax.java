package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements com.bytedance.sdk.component.adexpress.gm {
    public String dax;
    public boolean gbb;
    public final float gm;
    public JSONObject hc;
    public int jr;
    public int kj;
    public int nac;
    public final float oo;
    public SparseArray<gm.pcc> ork;
    public final float pcc;
    public final String qf;
    public final float sf;
    public int tmg;
    public final boolean vh;
    public final long vj;
    public JSONObject vy;
    public final long wh;

    private dax(@NonNull pcc pccVar) {
        this.gbb = false;
        this.pcc = pccVar.qf;
        this.sf = pccVar.wh;
        this.gm = pccVar.vj;
        this.oo = pccVar.oo;
        this.vj = pccVar.gm;
        this.wh = pccVar.sf;
        this.qf = pccVar.vy;
        this.ork = pccVar.pcc;
        this.vh = pccVar.nac;
        this.kj = pccVar.ork;
        this.vy = pccVar.vh;
        this.tmg = pccVar.tmg;
        this.hc = pccVar.hc;
        this.gbb = pccVar.gbb;
        this.jr = pccVar.kj;
        this.dax = pccVar.jr;
        this.nac = pccVar.dax;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private int dax;
        private long gm;
        private JSONObject hc;
        private String jr;
        private int kj;
        private boolean nac;
        private float oo;
        private int ork;
        private float qf;
        private long sf;
        private int tmg;
        private JSONObject vh;
        private float vj;
        private String vy;
        private float wh;
        private boolean gbb = false;
        protected SparseArray<gm.pcc> pcc = new SparseArray<>();

        public dax pcc() {
            return new dax(this);
        }

        public pcc gm(int i) {
            this.kj = i;
            return this;
        }

        public pcc oo(float f) {
            this.qf = f;
            return this;
        }

        public pcc sf(int i) {
            this.ork = i;
            return this;
        }

        public pcc gm(float f) {
            this.wh = f;
            return this;
        }

        public pcc oo(int i) {
            this.dax = i;
            return this;
        }

        public pcc sf(long j) {
            this.gm = j;
            return this;
        }

        public pcc sf(float f) {
            this.vj = f;
            return this;
        }

        public pcc sf(JSONObject jSONObject) {
            this.hc = jSONObject;
            return this;
        }

        public pcc pcc(int i) {
            this.tmg = i;
            return this;
        }

        public pcc sf(boolean z) {
            this.gbb = z;
            return this;
        }

        public pcc pcc(JSONObject jSONObject) {
            this.vh = jSONObject;
            return this;
        }

        public pcc sf(String str) {
            this.jr = str;
            return this;
        }

        public pcc pcc(boolean z) {
            this.nac = z;
            return this;
        }

        public pcc pcc(long j) {
            this.sf = j;
            return this;
        }

        public pcc pcc(float f) {
            this.oo = f;
            return this;
        }

        public pcc pcc(String str) {
            this.vy = str;
            return this;
        }

        public pcc pcc(SparseArray<gm.pcc> sparseArray) {
            this.pcc = sparseArray;
            return this;
        }
    }
}
