package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.oo.vy;
import com.bytedance.sdk.component.adexpress.pcc.gm.pcc;
import com.ironsource.C4427z5;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    static Object pcc = new Object();

    public static com.bytedance.sdk.component.adexpress.pcc.gm.sf gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc2 = qf.pcc().pcc(str);
        if (pcc2 != null) {
            pcc2.pcc(Long.valueOf(System.currentTimeMillis()));
            pcc(pcc2);
        }
        return pcc2;
    }

    public static String oo(String str) {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo = oo();
        if (oo == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return wh();
        }
        Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = oo.pcc();
        if (pcc2 == null || pcc2.size() <= 0 || (pccVar = pcc2.get(str)) == null) {
            return null;
        }
        return pccVar.oo();
    }

    public static pcc pcc(String str, vy.pcc pccVar, String str2, String str3) {
        File file;
        pcc pccVar2 = new pcc();
        if (TextUtils.isEmpty(str3)) {
            file = null;
        } else {
            file = sf(str3, str);
            if (file != null) {
                pccVar2.pcc(1);
            }
        }
        if (file == null && (file = qf(str)) != null) {
            pccVar2.pcc(3);
        }
        if (file == null && (file = wh(str)) != null) {
            pccVar2.pcc(2);
        }
        if (TextUtils.isEmpty(str3)) {
            if (!vj(str)) {
                pccVar2.pcc(6);
            }
        } else if (!pcc(str, str3)) {
            pccVar2.pcc(4);
        }
        pccVar2.sf();
        if (file != null) {
            try {
                pccVar2.pcc(new WebResourceResponse(pccVar.pcc(), C4427z5.O, new FileInputStream(file)));
            } catch (Throwable unused) {
            }
        }
        return pccVar2;
    }

    private static File qf(String str) {
        List<Pair<String, String>> sf;
        pcc.sf vj = oo().vj();
        if (vj != null && (sf = vj.sf()) != null && sf.size() > 0) {
            for (Pair<String, String> pair : sf) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(vj.kj(), (String) pair.first);
                }
            }
        }
        return null;
    }

    private static File sf(String str, String str2) {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo = oo();
        if (oo != null && vj()) {
            Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = oo.pcc();
            if (pcc2.size() != 0 && (pccVar = pcc2.get(str)) != null) {
                Iterator<pcc.C0043pcc> it = pccVar.wh().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    pcc.C0043pcc next = it.next();
                    if (next.pcc() != null && next.pcc().equals(str2)) {
                        File file = new File(vj.kj(), com.bytedance.sdk.component.utils.vj.pcc(next.pcc()));
                        String pcc3 = com.bytedance.sdk.component.utils.vj.pcc(file);
                        if (next.sf() == null || !next.sf().equals(pcc3)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    private static boolean vj(String str) {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo;
        List<pcc.C0043pcc> wh;
        if (!vj() || (oo = oo()) == null || (wh = oo.wh()) == null) {
            return false;
        }
        for (pcc.C0043pcc c0043pcc : wh) {
            if (c0043pcc != null && TextUtils.equals(str, c0043pcc.pcc())) {
                return true;
            }
        }
        return false;
    }

    private static File wh(String str) {
        if (vj()) {
            Iterator<pcc.C0043pcc> it = oo().wh().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pcc.C0043pcc next = it.next();
                if (next.pcc() != null && next.pcc().equals(str)) {
                    File file = new File(vj.kj(), com.bytedance.sdk.component.utils.vj.pcc(next.pcc()));
                    String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(file);
                    if (next.sf() == null || !next.sf().equals(pcc2)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static String gm() {
        return wh.gm();
    }

    public static com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo() {
        return vj.sf().wh();
    }

    public static boolean vj() {
        return vj.sf().vj();
    }

    private static String wh() {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo = oo();
        if (oo == null) {
            return null;
        }
        return oo.oo();
    }

    public static com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc(String str) {
        return qf.pcc().pcc(str);
    }

    public static void pcc(com.bytedance.sdk.component.adexpress.pcc.gm.oo ooVar) {
        qf.pcc().pcc(ooVar, ooVar.wh);
    }

    private static void pcc(final com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar) {
        com.bytedance.sdk.component.adexpress.oo.oo.pcc(new com.bytedance.sdk.component.kj.sf.gm("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.pcc.sf.sf.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (sf.pcc) {
                    wh.pcc().pcc(sfVar, true);
                }
            }
        }, 10);
    }

    public static void pcc() {
        vj.sf();
    }

    private static boolean pcc(String str, String str2) {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc oo;
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        if (!vj() || (oo = oo()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = oo.pcc();
        if (pcc2.size() == 0 || (pccVar = pcc2.get(str2)) == null) {
            return false;
        }
        for (pcc.C0043pcc c0043pcc : pccVar.wh()) {
            if (c0043pcc != null && TextUtils.equals(str, c0043pcc.pcc())) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> sf(String str) {
        return qf.pcc().sf(str);
    }

    public static boolean pcc(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }

    public static void sf() {
        try {
            kj.oo();
            File kj = vj.kj();
            if (kj == null || !kj.exists()) {
                return;
            }
            if (kj.getParentFile() != null) {
                com.bytedance.sdk.component.utils.qf.gm(kj.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.qf.gm(kj);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean sf(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
