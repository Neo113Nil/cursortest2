package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.content.Context;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.foundation.entity.b;
import defpackage.bem;
import defpackage.dsm;
import defpackage.eem;
import defpackage.itm;
import defpackage.jtm;
import defpackage.jwm;
import defpackage.kem;
import defpackage.lum;
import defpackage.mha;
import defpackage.pea;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static volatile dsm pcc;

    public static void pcc(final Context context) {
        kem kemVar = new kem(b.JSON_KEY_ADS) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.1
            @Override // defpackage.kem
            public boolean pcc() {
                return lu.pcc(context);
            }
        };
        kemVar.pcc(vy.class, new pcc());
        kemVar.pcc(vh.class, new tmg());
        kemVar.pcc(hc.class, new gbb());
        kemVar.pcc(gm.sf().sf);
        kemVar.gm(gm.sf().oo);
        final com.bytedance.sdk.component.kj.sf.qf tmg = rnn.tmg();
        if (tmg != null) {
            kemVar.pcc(Math.max(2, tmg.pcc() / 2));
        }
        kemVar.pcc(gm.sf().vj);
        kemVar.oo(gm.sf().wh);
        kemVar.vj(gm.sf().qf);
        kemVar.pcc(new bem() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.2
            @Override // defpackage.bem
            public ExecutorService pcc() {
                return rnn.vh();
            }

            @Override // defpackage.bem
            public ExecutorService sf() {
                return com.bytedance.sdk.component.kj.sf.qf.this;
            }
        });
        kemVar.pcc(new eem() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.3
            @Override // defpackage.eem
            public byte[] pcc(byte[] bArr) {
                return com.bytedance.sdk.component.oo.sf.sf(bArr, vj.pcc());
            }

            @Override // defpackage.eem
            public byte[] sf(byte[] bArr) {
                return com.bytedance.sdk.component.oo.sf.pcc(bArr, vj.pcc());
            }
        });
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                mha.e = applicationContext;
            } else {
                mha.e = context;
            }
        }
        pcc = new jwm(context, kemVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        pcc(new vy(pccVar));
    }

    public static void pcc(itm itmVar) {
        lum lumVar;
        if (pcc == null || itmVar == null) {
            return;
        }
        jwm jwmVar = (jwm) pcc;
        jwmVar.getClass();
        if (pea.f && (lumVar = (lum) jwmVar.c.get(itmVar.getClass())) != null) {
            if (!jwmVar.g) {
                itmVar.toString();
                jwmVar.g(itmVar);
                return;
            }
            if (jwmVar.b.vy()) {
                jwmVar.g(itmVar);
            } else {
                jwmVar.f.sendMessage(jwmVar.f.obtainMessage(1000, itmVar));
            }
            jtm jtmVar = lumVar.j;
            if (jtmVar != null) {
                jtmVar.b(1, 1);
            }
        }
    }

    public static boolean pcc() {
        return pcc != null;
    }
}
