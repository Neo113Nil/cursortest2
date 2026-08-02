package com.bytedance.sdk.openadsdk.ork;

import android.content.Context;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.bytedance.sdk.component.vj.fum;
import com.bytedance.sdk.component.vj.jr;
import com.bytedance.sdk.component.vj.lo;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.sf.gm.vj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.utils.nn;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static ork pcc(String str) {
        return pcc.sf(str);
    }

    public static boolean sf() {
        return pcc.pcc;
    }

    public static ork pcc(lu luVar) {
        return pcc.sf(luVar);
    }

    public static InputStream pcc(String str, String str2) {
        return pcc.sf(str, str2);
    }

    public static boolean pcc(String str, String str2, String str3) {
        return pcc.sf(str, str2, str3);
    }

    public static jr pcc() {
        return pcc.sf;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        private static final jr sf = pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
        private static int gm = 10;
        private static int oo = 15;
        private static int vj = 30;
        public static boolean pcc = false;

        private static jr pcc(Context context) {
            pcc();
            return com.bytedance.sdk.component.vj.sf.gm.sf.pcc(context, new vj.pcc().pcc(new com.bytedance.sdk.component.vj.sf.gm.pcc.sf(0, gm, oo, vj, new File(CacheDirFactory.getImageCacheDir("image_p")))).pcc(pcc).pcc(new lo() { // from class: com.bytedance.sdk.openadsdk.ork.oo.pcc.2
                @Override // com.bytedance.sdk.component.vj.lo
                public ExecutorService pcc() {
                    return rnn.sf();
                }

                @Override // com.bytedance.sdk.component.vj.lo
                public ExecutorService sf() {
                    return rnn.gm();
                }
            }).pcc(new fum() { // from class: com.bytedance.sdk.openadsdk.ork.oo.pcc.1
                @Override // com.bytedance.sdk.component.vj.fum
                public void pcc(int i, String str) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(str, true);
                }
            }).pcc(new C0123pcc()).pcc());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ork sf(lu luVar) {
            return pcc(sf.pcc(luVar.pcc()).pcc(luVar.sf()).sf(luVar.gm()).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).pcc(luVar.qf()));
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.bytedance.sdk.openadsdk.ork.oo$pcc$pcc, reason: collision with other inner class name */
        public static class C0123pcc implements com.bytedance.sdk.component.vj.oo {
            private C0123pcc() {
            }

            private Map<String, String> pcc(com.bytedance.sdk.component.vj.vj vjVar, gbb gbbVar) {
                if (!vjVar.sf()) {
                    return null;
                }
                wh qf = gbbVar.qf();
                HashMap hashMap = new HashMap();
                int pcc = qf.pcc();
                for (int i = 0; i < pcc; i++) {
                    String pcc2 = qf.pcc(i);
                    String sf = qf.sf(i);
                    if (pcc2 != null) {
                        hashMap.put(pcc2, sf);
                    }
                }
                return hashMap;
            }

            @Override // com.bytedance.sdk.component.vj.oo
            /* renamed from: sf, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.vj.pcc.gm pcc(com.bytedance.sdk.component.vj.vj vjVar) {
                vh kj = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().kj();
                tmg sf = new tmg.pcc().sf(vjVar.pcc()).pcc().sf();
                gbb gbbVar = null;
                com.bytedance.sdk.component.vj.pcc.oo ooVar = vjVar.gm() ? new com.bytedance.sdk.component.vj.pcc.oo() : null;
                if (ooVar != null) {
                    ooVar.pcc(System.currentTimeMillis());
                }
                try {
                    gbbVar = kj.pcc(sf).sf();
                    if (ooVar != null) {
                        ooVar.sf(System.currentTimeMillis());
                    }
                    return new com.bytedance.sdk.component.vj.pcc.gm(gbbVar.gm(), gbbVar.wh().oo(), "", pcc(vjVar, gbbVar));
                } catch (Throwable th) {
                    try {
                        return pcc(ooVar, th);
                    } finally {
                        com.bytedance.sdk.component.utils.ork.pcc(gbbVar);
                    }
                }
            }

            private com.bytedance.sdk.component.vj.pcc.gm pcc(com.bytedance.sdk.component.vj.pcc.oo ooVar, Throwable th) {
                th.getMessage();
                if (ooVar != null) {
                    ooVar.gm(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.vj.pcc.gm gmVar = new com.bytedance.sdk.component.vj.pcc.gm(98765, th, "net failed");
                gmVar.pcc(ooVar);
                return gmVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ork sf(String str) {
            return pcc(sf.pcc(str).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream sf(String str, String str2) {
            return sf.pcc(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean sf(String str, String str2, String str3) {
            return sf.pcc(str, str2, str3);
        }

        public static void pcc() {
            gm = com.bytedance.sdk.openadsdk.yt.vj.pcc("image_config", "bitmap_cache_count", 10);
            oo = com.bytedance.sdk.openadsdk.yt.vj.pcc("image_config", "data_cache_count", 15);
            vj = com.bytedance.sdk.openadsdk.yt.vj.pcc("image_config", "disk_cache_count", 30);
            pcc = com.bytedance.sdk.openadsdk.yt.vj.pcc("img_need_scale", 0) == 1;
        }

        private static ork pcc(ork orkVar) {
            return nn.pcc() ? orkVar.pcc(new vj()) : orkVar;
        }
    }
}
