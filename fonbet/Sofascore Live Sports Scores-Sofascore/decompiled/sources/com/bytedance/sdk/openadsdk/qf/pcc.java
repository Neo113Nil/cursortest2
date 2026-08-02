package com.bytedance.sdk.openadsdk.qf;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.gm;
import com.bytedance.sdk.component.sf.pcc.hc;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.vj;
import com.bytedance.sdk.component.sf.pcc.vy;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.ironsource.mediationsdk.metadata.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements INetWork {
    protected vh pcc;
    protected vh sf;

    public pcc() {
        vh.pcc pccVar = new vh.pcc();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.pcc = pccVar.pcc(10L, timeUnit).sf(10L, timeUnit).gm(10L, timeUnit).pcc();
        this.sf = new vh.pcc().pcc(10L, timeUnit).sf(30L, timeUnit).gm(30L, timeUnit).pcc();
    }

    private Map<String, String> pcc(wh whVar) {
        if (whVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < whVar.pcc(); i++) {
            hashMap.put(whVar.pcc(i), whVar.sf(i));
        }
        return hashMap;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        gbb sf = this.pcc.pcc(new tmg.pcc().pcc().sf(str).pcc("gecko").sf()).sf();
        return new Response(pcc(sf.qf()), sf.gm() == 200 ? sf.wh().sf() : null, sf.gm(), sf.vj());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        vj.pcc pccVar = new vj.pcc();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                pccVar.pcc((String) pair.first, (String) pair.second);
            }
        }
        gbb sf = this.pcc.pcc(new tmg.pcc().sf(str).pcc((hc) pccVar.pcc()).pcc("gecko").sf()).sf();
        return new Response(pcc(sf.qf()), sf.gm() == 200 ? sf.wh().sf() : null, sf.gm(), sf.vj());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        int gm;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        int i = 0;
        try {
            try {
                gbb sf = this.sf.pcc(new tmg.pcc().pcc().pcc("gecko").sf(str).sf()).sf();
                gm = sf.gm();
                try {
                    bufferedInputStream = new BufferedInputStream(sf.wh().gm());
                } catch (Exception e) {
                    e = e;
                    i = gm;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[a.o];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, a.o);
                if (read == -1) {
                    CloseableUtils.close(bufferedInputStream);
                    return;
                }
                bufferOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e3) {
            e = e3;
            i = gm;
            bufferedInputStream2 = bufferedInputStream;
            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            CloseableUtils.close(bufferedInputStream2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.pcc.pcc(new tmg.pcc().pcc().sf(str).pcc("gecko").sf()).pcc(new gm() { // from class: com.bytedance.sdk.openadsdk.qf.pcc.1
            @Override // com.bytedance.sdk.component.sf.pcc.gm
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.sf.pcc.gm
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        gbb sf = this.pcc.pcc(new tmg.pcc().sf(str).pcc(hc.pcc(vy.pcc("application/json; charset=utf-8"), str2)).pcc("gecko").sf()).sf();
        return new Response(pcc(sf.qf()), sf.gm() == 200 ? sf.wh().sf() : null, sf.gm(), sf.vj());
    }
}
