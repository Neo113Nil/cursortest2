package com.bytedance.sdk.component.sf.pcc;

import com.bytedance.sdk.component.qf.pcc;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vh implements Cloneable {
    public TimeUnit gm;
    public final pcc.sf kj;
    public long oo;
    public List<kj> pcc;
    public TimeUnit qf;
    public long sf;
    public TimeUnit vj;
    public long wh;

    public vh(pcc pccVar) {
        this.sf = pccVar.gm;
        this.oo = pccVar.vj;
        this.wh = pccVar.qf;
        List<kj> list = pccVar.pcc;
        this.gm = pccVar.oo;
        this.vj = pccVar.wh;
        this.qf = pccVar.kj;
        this.pcc = list;
        this.kj = pccVar.sf;
    }

    public pcc gm() {
        return new pcc(this);
    }

    public pcc.sf pcc() {
        return this.kj;
    }

    public abstract sf pcc(tmg tmgVar);

    public abstract oo sf();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        public long gm;
        public TimeUnit kj;
        public TimeUnit oo;
        public final List<kj> pcc;
        public long qf;
        pcc.sf sf;
        public long vj;
        public TimeUnit wh;

        public pcc(vh vhVar) {
            this.pcc = new ArrayList();
            this.gm = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.oo = timeUnit;
            this.vj = Ua.s;
            this.wh = timeUnit;
            this.qf = Ua.s;
            this.kj = timeUnit;
            this.gm = vhVar.sf;
            this.oo = vhVar.gm;
            this.vj = vhVar.oo;
            this.wh = vhVar.vj;
            this.qf = vhVar.wh;
            this.kj = vhVar.qf;
        }

        public pcc gm(long j, TimeUnit timeUnit) {
            this.qf = j;
            this.kj = timeUnit;
            return this;
        }

        public pcc pcc(kj kjVar) {
            this.pcc.add(kjVar);
            return this;
        }

        public pcc sf(long j, TimeUnit timeUnit) {
            this.vj = j;
            this.wh = timeUnit;
            return this;
        }

        public pcc pcc(long j, TimeUnit timeUnit) {
            this.gm = j;
            this.oo = timeUnit;
            return this;
        }

        public pcc pcc(pcc.sf sfVar) {
            this.sf = sfVar;
            return this;
        }

        public vh pcc() {
            return com.bytedance.sdk.component.sf.pcc.pcc.pcc.pcc(this);
        }

        public pcc(String str) {
            this.pcc = new ArrayList();
            this.gm = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.oo = timeUnit;
            this.vj = Ua.s;
            this.wh = timeUnit;
            this.qf = Ua.s;
            this.kj = timeUnit;
        }

        public pcc() {
            this.pcc = new ArrayList();
            this.gm = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.oo = timeUnit;
            this.vj = Ua.s;
            this.wh = timeUnit;
            this.qf = Ua.s;
            this.kj = timeUnit;
        }
    }
}
