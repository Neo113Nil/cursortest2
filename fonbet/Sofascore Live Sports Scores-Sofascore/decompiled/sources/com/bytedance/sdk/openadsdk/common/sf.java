package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import defpackage.p03;
import defpackage.wt3;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static final HashMap<String, sf> pcc = new HashMap<>();
    private static final HashMap<String, pcc> sf = new HashMap<>();
    private final Context gm;
    private final pcc oo;
    private final String vj;
    private final Map<of, Long> wh = Collections.synchronizedMap(new HashMap());

    private sf(Context context, String str) {
        this.gm = context;
        pcc pccVar = sf.get(str);
        this.oo = pccVar == null ? new pcc(str) : pccVar;
        this.vj = str;
    }

    public void gm(String str) {
        this.oo.wh(str);
    }

    public boolean oo(String str) {
        return this.oo.qf(str);
    }

    public void pcc() {
        File[] listFiles;
        try {
            boolean qf = com.bytedance.sdk.openadsdk.core.ork.qf(this.vj);
            File file = new File(this.gm.getDataDir(), qf ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.sf.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(sf.this.vj);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles) {
                    if (qf) {
                        try {
                            com.bytedance.sdk.component.utils.qf.gm(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.gm.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(sf());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.qf.gm(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public String sf(String str) {
        try {
            String sf2 = this.oo.sf(str);
            if (TextUtils.isEmpty(sf2)) {
                return null;
            }
            return sf2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String sf() {
        return ((p03) CacheDirFactory.getICacheDir(0)).u();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        protected final String pcc;
        private final HashSet<String> qf = new HashSet<>();
        String sf = "material_data";
        String gm = "has_played";
        String oo = "create_time";
        String vj = "in_use_process";
        String wh = "req_id";

        public pcc(String str) {
            this.pcc = TextUtils.isEmpty(str) ? "" : str;
        }

        public String gm(String str) {
            try {
                return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf(pcc(str), this.wh, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void kj(String str) {
            try {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc(str));
                this.qf.remove(str);
            } catch (Throwable unused) {
            }
        }

        public long oo(String str) {
            try {
                return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc(str), this.oo, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public void pcc(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String pcc = pcc(codeId);
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.gm, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.oo, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.sf, str);
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.vj, "");
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.wh, str2);
                this.qf.remove(codeId);
            } catch (Throwable unused) {
            }
        }

        public boolean qf(String str) {
            String pcc;
            String sf;
            try {
                pcc = pcc(str);
                sf = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf(pcc, this.vj, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(sf)) {
                return false;
            }
            if (sf.equals(com.bytedance.sdk.component.utils.fum.sf(com.bytedance.sdk.openadsdk.core.lu.pcc())) && !this.qf.contains(str)) {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc, this.vj, "");
                return false;
            }
            return true;
        }

        public String sf(String str) {
            try {
                return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf(pcc(str), this.sf, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean vj(String str) {
            try {
                return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc(str), this.gm, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public void wh(String str) {
            try {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc(pcc(str), this.vj, com.bytedance.sdk.component.utils.fum.sf(com.bytedance.sdk.openadsdk.core.lu.pcc()));
                this.qf.add(str);
            } catch (Throwable unused) {
            }
        }

        public String pcc(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return wt3.m(this.pcc, "_cache_", new StringBuilder(), str);
        }
    }

    public static sf pcc(String str) {
        sf sfVar;
        HashMap<String, sf> hashMap = pcc;
        sf sfVar2 = hashMap.get(str);
        if (sfVar2 != null) {
            return sfVar2;
        }
        synchronized (sf.class) {
            try {
                sfVar = hashMap.get(str);
                if (sfVar == null) {
                    sfVar = new sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), str);
                    hashMap.put(str, sfVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sfVar;
    }

    public static void pcc(String str, pcc pccVar) {
        sf.put(str, pccVar);
    }

    public void pcc(String str, of ofVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String gm = this.oo.gm(str);
        String qxv = ofVar != null ? ofVar.qxv() : "";
        if (TextUtils.isEmpty(gm) || TextUtils.isEmpty(qxv) || gm.equals(qxv)) {
            this.oo.kj(str);
        }
    }

    public void pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        of qf;
        if ((pccVar != null && pccVar.qf() != null && pccVar.qf().duh()) || pccVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (qf = pccVar.qf()) == null || qf.msk() == 2) {
            return;
        }
        try {
            this.oo.pcc(adSlot, pccVar.tmg(), pccVar.gm());
        } catch (Throwable unused) {
        }
    }

    public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, boolean z) {
        if (pccVar == null || !pccVar.wh()) {
            return false;
        }
        if (z) {
            Iterator<of> it = pccVar.vj().iterator();
            while (it.hasNext()) {
                if (!pcc(it.next())) {
                    it.remove();
                }
            }
        }
        return pccVar.wh();
    }

    public String pcc(String str, long j) {
        long oo = this.oo.oo(str);
        boolean vj = this.oo.vj(str);
        if (System.currentTimeMillis() - oo >= j || vj) {
            return null;
        }
        return sf(str);
    }

    private boolean pcc(of ofVar) {
        if (ofVar != null) {
            return atb.gm(ofVar) || ofVar.kez() != null;
        }
        return false;
    }
}
