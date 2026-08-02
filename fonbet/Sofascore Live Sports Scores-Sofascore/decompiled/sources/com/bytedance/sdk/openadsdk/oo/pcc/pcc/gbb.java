package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.iem;
import defpackage.iwm;
import defpackage.ydm;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends iwm {
    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(hc hcVar, iem iemVar) {
        String pcc = com.bytedance.sdk.openadsdk.qy.pcc.pcc(hcVar.ork(), hcVar.vy());
        com.bytedance.sdk.openadsdk.oo.pcc.gm gmVar = new com.bytedance.sdk.openadsdk.oo.pcc.gm();
        gmVar.pcc(Command.HTTP_HEADER_USER_AGENT, kun.oo());
        gmVar.pcc("csj_client_source_from", "1");
        gmVar.pcc(pcc);
        com.bytedance.sdk.component.wh.pcc.vj.oo pcc2 = gmVar.pcc();
        com.bytedance.sdk.component.wh.pcc.wh.oo ooVar = new com.bytedance.sdk.component.wh.pcc.wh.oo(hcVar.wh(), pcc, hcVar.vy(), hcVar.kj(), hcVar.vh());
        ooVar.sf(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hcVar);
        if (pcc2 != null && pcc2.pcc()) {
            iemVar.f(arrayList, true);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new com.bytedance.sdk.openadsdk.oo.pcc.vy(true, ooVar));
            return;
        }
        if (pcc2 != null) {
            ooVar.sf(pcc2.sf());
            ooVar.gm(pcc2.gm());
        }
        if (hcVar.vj() < pcc(hcVar.vh())) {
            iemVar.f(arrayList, false);
        } else {
            iemVar.f(arrayList, true);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new com.bytedance.sdk.openadsdk.oo.pcc.vy(false, ooVar));
        }
    }

    @Override // defpackage.iwm
    public int kj() {
        return gm.pcc().gm().wh;
    }

    @Override // defpackage.iwm
    public String oo() {
        return "track_urls";
    }

    @Override // defpackage.iwm
    public long ork() {
        return gm.pcc().gm().kj;
    }

    @Override // defpackage.iwm
    public ydm qf() {
        return sf.pcc();
    }

    @Override // defpackage.iwm
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public hc pcc(String str, byte[] bArr, int i, int i2) {
        try {
            hc hcVar = new hc(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            hcVar.pcc(i);
            hcVar.sf(i2);
            return hcVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.iwm
    public long vj() {
        return gm.pcc().gm().gm;
    }

    @Override // defpackage.iwm
    public int vy() {
        return gm.pcc().gm().qf;
    }

    @Override // defpackage.iwm
    public boolean wh() {
        return sf.sf();
    }

    @Override // defpackage.iwm
    public int sf() {
        return gm.pcc().gm().sf;
    }

    @Override // defpackage.iwm
    public void pcc(ArrayList<hc> arrayList, final iem iemVar) {
        if (!lu.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc())) {
            iemVar.f(arrayList, false);
            return;
        }
        Iterator<hc> it = arrayList.iterator();
        while (it.hasNext()) {
            final hc next = it.next();
            if (!com.bytedance.sdk.component.qf.gm.wh.pcc(next.ork())) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                iemVar.f(arrayList2, true);
            } else if (next.vj() >= pcc(next.vh())) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(next);
                iemVar.f(arrayList3, true);
            } else {
                rnn.pcc().submit(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.gbb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gbb.this.pcc(next, iemVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.iwm
    public long pcc() {
        return gm.pcc().gm().pcc;
    }

    public int pcc(String str) {
        com.bytedance.sdk.openadsdk.oo.pcc.ork mua = com.bytedance.sdk.openadsdk.core.settings.vh.sf().mua();
        if (mua == null) {
            return 3;
        }
        return mua.pcc(str);
    }
}
