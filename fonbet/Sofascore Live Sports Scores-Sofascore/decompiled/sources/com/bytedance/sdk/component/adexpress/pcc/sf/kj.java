package com.bytedance.sdk.component.adexpress.pcc.sf;

import com.ironsource.C4427z5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private static com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc;

    public static void gm() {
        gm.pcc(vj.kj(), sf(), "temp_pkg_info.json");
    }

    public static void oo() {
        gm.sf(vj.kj(), sf(), "temp_pkg_info.json");
        pcc = null;
    }

    public static void pcc() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(vj.kj(), "temp_pkg_info.json");
                long length = file.length();
                Long valueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[valueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc2 = com.bytedance.sdk.component.adexpress.pcc.gm.pcc.pcc(new JSONObject(new String(bArr, C4427z5.O)));
                        if (pcc2 != null) {
                            pcc = pcc2;
                            pcc2.gm();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf() {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        synchronized (kj.class) {
            pccVar = pcc;
        }
        return pccVar;
    }

    public static boolean sf(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar) {
        return gm.gm(sf(), pccVar);
    }

    public static synchronized void pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar) {
        synchronized (kj.class) {
            if (pccVar != null) {
                if (pccVar.kj()) {
                    pcc = pccVar;
                }
            }
        }
    }

    public static boolean pcc(String str) {
        return gm.pcc(sf(), str);
    }
}
