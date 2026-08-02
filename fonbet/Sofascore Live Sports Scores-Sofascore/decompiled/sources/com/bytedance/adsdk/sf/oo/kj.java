package com.bytedance.adsdk.sf.oo;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.sf.tmg;
import com.ironsource.C4427z5;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private final qf pcc;
    private final wh sf;

    public kj(qf qfVar, wh whVar) {
        this.pcc = qfVar;
        this.sf = whVar;
    }

    private tmg<com.bytedance.adsdk.sf.qf> gm(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                oo pcc = this.sf.pcc(str);
                if (!pcc.pcc()) {
                    tmg<com.bytedance.adsdk.sf.qf> tmgVar = new tmg<>(new IllegalArgumentException(pcc.oo()));
                    try {
                        pcc.close();
                    } catch (IOException unused) {
                    }
                    return tmgVar;
                }
                tmg<com.bytedance.adsdk.sf.qf> pcc2 = pcc(context, str, pcc.sf(), pcc.gm(), str2);
                pcc2.pcc();
                try {
                    pcc.close();
                } catch (IOException unused2) {
                }
                return pcc2;
            } finally {
            }
        } catch (Exception e) {
            tmg<com.bytedance.adsdk.sf.qf> tmgVar2 = new tmg<>(e);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused3) {
                }
            }
            return tmgVar2;
        }
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        tmg<com.bytedance.adsdk.sf.qf> pcc;
        gm gmVar;
        qf qfVar;
        if (str2 == null) {
            str2 = C4427z5.M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            gm gmVar2 = gm.ZIP;
            pcc = pcc(context, str, inputStream, str3);
            gmVar = gmVar2;
        } else {
            gmVar = gm.JSON;
            pcc = pcc(str, inputStream, str3);
        }
        if (str3 != null && pcc.pcc() != null && (qfVar = this.pcc) != null) {
            qfVar.pcc(str, gmVar);
        }
        return pcc;
    }

    private com.bytedance.adsdk.sf.qf sf(Context context, String str, String str2) {
        qf qfVar;
        Pair<gm, InputStream> pcc;
        if (str2 == null || (qfVar = this.pcc) == null || (pcc = qfVar.pcc(str)) == null) {
            return null;
        }
        gm gmVar = (gm) pcc.first;
        InputStream inputStream = (InputStream) pcc.second;
        tmg<com.bytedance.adsdk.sf.qf> pcc2 = gmVar == gm.ZIP ? com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.sf.kj.sf(inputStream, str2);
        if (pcc2.pcc() != null) {
            return pcc2.pcc();
        }
        return null;
    }

    public tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, String str2) {
        com.bytedance.adsdk.sf.qf sf = sf(context, str, str2);
        if (sf != null) {
            return new tmg<>(sf);
        }
        return gm(context, str, str2);
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(Context context, String str, InputStream inputStream, String str2) throws IOException {
        qf qfVar;
        if (str2 != null && (qfVar = this.pcc) != null) {
            return com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(new FileInputStream(qfVar.pcc(str, inputStream, gm.ZIP))), str);
        }
        return com.bytedance.adsdk.sf.kj.pcc(context, new ZipInputStream(inputStream), (String) null);
    }

    private tmg<com.bytedance.adsdk.sf.qf> pcc(String str, InputStream inputStream, String str2) throws IOException {
        qf qfVar;
        if (str2 != null && (qfVar = this.pcc) != null) {
            return com.bytedance.adsdk.sf.kj.sf(new FileInputStream(qfVar.pcc(str, inputStream, gm.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.sf.kj.sf(inputStream, (String) null);
    }
}
