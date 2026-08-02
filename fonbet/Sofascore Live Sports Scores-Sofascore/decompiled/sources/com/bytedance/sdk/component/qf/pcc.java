package com.bytedance.sdk.component.qf;

import android.os.Bundle;
import com.bytedance.sdk.component.qf.gm.oo;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.pcc.pcc.vj;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.openadsdk.lu.oo;
import defpackage.a70;
import defpackage.dmi;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static vj pcc;
    private static gm sf;
    private vh gm;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface gm {
        void pcc(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3);

        boolean pcc();

        boolean sf();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void gm(oo ooVar);

        void pcc(oo ooVar);

        void sf(oo ooVar);
    }

    private pcc(C0050pcc c0050pcc) {
        vh.pcc pccVar = new vh.pcc();
        long j = c0050pcc.pcc;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vh.pcc sf2 = pccVar.pcc(j, timeUnit).gm(c0050pcc.gm, timeUnit).sf(c0050pcc.sf, timeUnit);
        List<kj> list = c0050pcc.vj;
        if (list != null && list.size() > 0) {
            Iterator<kj> it = c0050pcc.vj.iterator();
            while (it.hasNext()) {
                sf2.pcc(it.next());
            }
        }
        if (c0050pcc.qf != null) {
            Bundle unused = c0050pcc.qf;
        }
        Set unused2 = c0050pcc.wh;
        sf2.pcc(c0050pcc.oo);
        this.gm = sf2.pcc();
    }

    public static void pcc(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3) {
        gm gmVar = sf;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(str, str2, str3, i, str4, z, i2, i3);
    }

    public static boolean qf() {
        gm gmVar = sf;
        if (gmVar == null) {
            return false;
        }
        return gmVar.sf();
    }

    public static boolean vj() {
        vj vjVar = pcc;
        if (vjVar == null) {
            return false;
        }
        return vjVar.pcc();
    }

    public static boolean wh() {
        gm gmVar = sf;
        if (gmVar == null) {
            return false;
        }
        return gmVar.pcc();
    }

    public com.bytedance.sdk.component.qf.sf.sf gm() {
        return new com.bytedance.sdk.component.qf.sf.sf(this.gm);
    }

    public vh kj() {
        return this.gm;
    }

    public com.bytedance.sdk.component.qf.sf.pcc oo() {
        return new com.bytedance.sdk.component.qf.sf.pcc(this.gm);
    }

    public com.bytedance.sdk.component.qf.sf.oo sf() {
        return new com.bytedance.sdk.component.qf.sf.oo(this.gm);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.qf.pcc$pcc, reason: collision with other inner class name */
    public static final class C0050pcc {
        sf oo;
        private Bundle qf;
        private Set<String> wh;
        final List<kj> vj = new ArrayList();
        int pcc = 10000;
        int sf = 10000;
        int gm = 10000;

        private static int pcc(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                a70.p(dmi.y(str, " < 0"));
                return 0;
            }
            if (timeUnit == null) {
                yhk.s("unit == null");
                return 0;
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                a70.p(dmi.y(str, " too large."));
                return 0;
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            a70.p(dmi.y(str, " too small."));
            return 0;
        }

        public C0050pcc gm(long j, TimeUnit timeUnit) {
            this.gm = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0050pcc sf(long j, TimeUnit timeUnit) {
            this.sf = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0050pcc pcc(long j, TimeUnit timeUnit) {
            this.pcc = pcc("timeout", j, timeUnit);
            return this;
        }

        public C0050pcc pcc(kj kjVar) {
            this.vj.add(kjVar);
            return this;
        }

        public C0050pcc pcc(sf sfVar) {
            this.oo = sfVar;
            return this;
        }

        public C0050pcc pcc(boolean z) {
            return this;
        }

        public pcc pcc() {
            return new pcc(this);
        }
    }

    public static void pcc(vj vjVar) {
        pcc = vjVar;
    }

    public static void pcc() {
        com.bytedance.sdk.component.qf.gm.oo.pcc(oo.pcc.DEBUG);
    }

    public static void pcc(gm gmVar) {
        sf = gmVar;
    }
}
