package com.bytedance.sdk.openadsdk.oo.pcc;

import android.content.Context;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.wh.pcc.pcc;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import defpackage.pea;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static final AtomicBoolean pcc = new AtomicBoolean(false);
    public static final AtomicBoolean sf = new AtomicBoolean(false);
    public static AtomicInteger gm = new AtomicInteger(0);

    public static void gm() {
        try {
            com.bytedance.sdk.component.wh.pcc.sf.oo();
            com.bytedance.sdk.component.wh.pcc.sf.vj();
        } catch (Throwable th) {
            lo.gm("AdLogSwitchUtils", th.getMessage());
        }
        pea.f = false;
    }

    public static void pcc(Context context) {
        try {
            if (pcc.compareAndSet(false, true)) {
                com.bytedance.sdk.component.wh.pcc.sf.pcc(new pcc.C0058pcc().pcc(new wh()).sf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.kj.sf()).gm(com.bytedance.sdk.openadsdk.oo.pcc.pcc.kj.gm()).pcc(com.bytedance.sdk.openadsdk.oo.pcc.pcc.kj.pcc()).pcc(new qf()).pcc(oo.pcc).sf(lu.oo().hc()).pcc(lu.oo().gbb()).pcc(lu.oo().rt()).pcc(), context);
                sf();
            }
        } catch (Throwable unused) {
            pcc.set(false);
        }
        if (!sf.compareAndSet(false, true) || com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc() == 1) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc(context);
        } catch (Throwable unused2) {
            sf.set(false);
        }
    }

    public static void sf() {
        com.bytedance.sdk.component.wh.pcc.sf.gm();
        pea.f = true;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar2 = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(pccVar.qf(), pccVar);
        pccVar2.gm(pccVar.kj() ? (byte) 1 : (byte) 2);
        pccVar2.sf((byte) 0);
        if (com.bytedance.sdk.component.wh.pcc.sf.sf()) {
            pcc(lu.pcc());
        }
        int pcc2 = com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc();
        if (pcc2 == 2) {
            com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc(pccVar);
        } else if (pcc2 != 3) {
            com.bytedance.sdk.component.wh.pcc.sf.pcc(pccVar2);
        } else {
            com.bytedance.sdk.component.wh.pcc.sf.pcc(pccVar2);
            com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc(pccVar);
        }
    }

    public static com.bytedance.sdk.openadsdk.dax.sf.gm pcc() {
        return kj.pcc;
    }

    public static void pcc(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("track") { // from class: com.bytedance.sdk.openadsdk.oo.pcc.sf.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.wh.pcc.sf.sf()) {
                    sf.pcc(lu.pcc());
                }
                if (!com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc() || !com.bytedance.sdk.openadsdk.oo.pcc.pcc.gm.pcc().gm().oo) {
                    com.bytedance.sdk.component.wh.pcc.sf.pcc(hc.pcc(lu.pcc()), list, true, i, str);
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.openadsdk.oo.pcc.pcc.hc pcc2 = com.bytedance.sdk.openadsdk.oo.pcc.pcc.hc.pcc((String) it.next(), true, i, str);
                    if (pcc2 != null) {
                        com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc(pcc2);
                    }
                }
            }
        });
    }

    public static void pcc(String str) {
        pcc(str, false);
    }

    public static void pcc(String str, boolean z) {
        if (com.bytedance.sdk.component.wh.pcc.sf.sf()) {
            pcc(lu.pcc());
        }
        com.bytedance.sdk.component.wh.pcc.sf.pcc(str, z);
    }
}
