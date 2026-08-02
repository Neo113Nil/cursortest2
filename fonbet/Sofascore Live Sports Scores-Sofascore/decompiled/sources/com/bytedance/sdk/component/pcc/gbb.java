package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb {
    public final String gm;
    public final String kj;
    public final String oo;
    public final int pcc;
    public final String qf;
    public final String sf;
    public final String vj;
    public final String wh;

    private gbb(pcc pccVar) {
        this.sf = pccVar.pcc;
        this.gm = pccVar.sf;
        this.oo = pccVar.gm;
        this.vj = pccVar.oo;
        this.wh = pccVar.vj;
        this.qf = pccVar.wh;
        this.pcc = 1;
        this.kj = pccVar.qf;
    }

    public static boolean pcc(gbb gbbVar) {
        return gbbVar == null || gbbVar.pcc != 1 || TextUtils.isEmpty(gbbVar.oo) || TextUtils.isEmpty(gbbVar.vj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.oo);
        sb.append(", params: ");
        sb.append(this.vj);
        sb.append(", callbackId: ");
        sb.append(this.wh);
        sb.append(", type: ");
        sb.append(this.gm);
        sb.append(", version: ");
        return mz1.o(sb, this.sf, ", ");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        private String gm;
        private String oo;
        private String pcc;
        private String qf;
        private String sf;
        private String vj;
        private String wh;

        public gbb pcc() {
            return new gbb(this);
        }

        public pcc gm(String str) {
            this.gm = str;
            return this;
        }

        public pcc oo(String str) {
            this.oo = str;
            return this;
        }

        public pcc qf(String str) {
            this.qf = str;
            return this;
        }

        public pcc sf(String str) {
            this.sf = str;
            return this;
        }

        public pcc vj(String str) {
            this.vj = str;
            return this;
        }

        public pcc wh(String str) {
            this.wh = str;
            return this;
        }

        private pcc() {
        }

        public pcc pcc(String str) {
            this.pcc = str;
            return this;
        }
    }

    public static gbb pcc(String str, int i) {
        return new gbb(str, i);
    }

    public static pcc pcc() {
        return new pcc();
    }

    private gbb(String str, int i) {
        this.sf = null;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = str;
        this.qf = null;
        this.pcc = i;
        this.kj = null;
    }
}
