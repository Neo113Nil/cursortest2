package com.bytedance.sdk.openadsdk.core.jr.gm;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.utils.vj;
import com.bytedance.sdk.component.utils.ye;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.tz.pcc.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.C4427z5;
import defpackage.dmi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile pcc pcc;
    private String sf;
    private final Map<of, sf> gm = new ConcurrentHashMap();
    private final Map<String, JSONObject> oo = new ConcurrentHashMap();
    private final AtomicBoolean vj = new AtomicBoolean(false);
    private final Set<String> wh = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.qf.sf.pcc> qf = new ConcurrentHashMap<>();
    private final Map<String, String> kj = new ConcurrentHashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.gm.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0085pcc {
        void pcc(boolean z);
    }

    private pcc() {
    }

    public static void gm(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String oo() {
        File file = new File(vj(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String vj() {
        if (TextUtils.isEmpty(this.sf)) {
            try {
                File pcc2 = qf.pcc(lu.pcc(), lu.pcc().getCacheDir(), "playable");
                if (!pcc2.exists()) {
                    pcc2.mkdirs();
                }
                this.sf = pcc2.getAbsolutePath();
            } catch (Throwable th) {
                lo.gm("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.sf;
    }

    public void pcc(final of ofVar, final InterfaceC0085pcc interfaceC0085pcc) {
        File file;
        if (oo.pcc().sf() && ofVar != null && atb.wh(ofVar) && ofVar.gqd() != null && !TextUtils.isEmpty(ofVar.gqd().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -705, "server bidding pre render");
            pcc(interfaceC0085pcc, false);
            return;
        }
        if (ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().i)) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -701, (String) null);
            pcc(interfaceC0085pcc, false);
            return;
        }
        final String str = ofVar.kez().i;
        if (this.wh.contains(str)) {
            return;
        }
        this.gm.put(ofVar, new sf().pcc(System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar);
        String pcc2 = vj.pcc(str);
        final File file2 = new File(oo(), pcc2);
        String str2 = this.kj.get(pcc2);
        if (TextUtils.isEmpty(str2)) {
            file = pcc(file2);
            if (file != null && file.exists()) {
                this.kj.put(pcc2, file.getAbsolutePath());
            }
        } else {
            file = new File(str2);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -702, (String) null);
            gm(file2);
            this.gm.remove(ofVar);
            pcc(interfaceC0085pcc, true);
            return;
        }
        try {
            qf.gm(file2);
        } catch (Throwable unused) {
        }
        this.wh.add(str);
        File file3 = new File(vj(), dmi.y(pcc2, ".zip"));
        com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
        this.qf.put(str, oo);
        oo.gm(str);
        oo.pcc(file3.getParent(), file3.getName());
        oo.pcc(7);
        oo.sf("playable_download");
        oo.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.2
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, final com.bytedance.sdk.component.qf.sf sfVar) {
                pcc.this.wh.remove(str);
                pcc.this.qf.remove(str);
                final sf sfVar2 = (sf) pcc.this.gm.remove(ofVar);
                if (sfVar2 != null) {
                    sfVar2.sf(System.currentTimeMillis());
                }
                if (sfVar.wh() && sfVar.vj() != null && sfVar.vj().exists()) {
                    rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long j;
                            long j2;
                            try {
                                sf sfVar3 = sfVar2;
                                if (sfVar3 != null) {
                                    sfVar3.gm(System.currentTimeMillis());
                                }
                                ye.pcc(sfVar.vj().getAbsolutePath(), file2.getAbsolutePath());
                                sf sfVar4 = sfVar2;
                                if (sfVar4 != null) {
                                    sfVar4.oo(System.currentTimeMillis());
                                }
                                sf sfVar5 = sfVar2;
                                if (sfVar5 != null) {
                                    j = sfVar5.pcc();
                                    j2 = sfVar2.sf();
                                } else {
                                    j = 0;
                                    j2 = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, j, j2);
                                pcc.sf(file2);
                                z = true;
                                try {
                                    File pcc3 = pcc.pcc(file2);
                                    if (pcc3 != null && pcc3.exists()) {
                                        pcc.this.kj.put(file2.getName(), pcc3.getAbsolutePath());
                                    }
                                    pcc.this.pcc(pcc.this.oo(pcc3), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                lo.pcc("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                sfVar.vj().delete();
                            } catch (Throwable unused3) {
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            pcc.this.pcc(interfaceC0085pcc, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, sfVar.pcc() != 0 ? sfVar.pcc() : -700, (String) null);
                    pcc.this.pcc(interfaceC0085pcc, false);
                }
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                pcc.this.wh.remove(str);
                pcc.this.qf.remove(str);
                pcc.this.gm.remove(ofVar);
                com.bytedance.sdk.openadsdk.core.jr.gm.sf.pcc(ofVar, -700, iOException.getMessage());
                pcc.this.pcc(interfaceC0085pcc, false);
            }
        });
    }

    public void sf(of ofVar) {
        if (ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().i) || !com.bytedance.sdk.openadsdk.yt.vj.pcc("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.qf.sf.pcc pccVar = this.qf.get(ofVar.kez().i);
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        long gm;
        long oo;
        long pcc;
        long sf;

        private sf() {
        }

        public sf gm(long j) {
            this.gm = j;
            return this;
        }

        public sf oo(long j) {
            this.oo = j;
            return this;
        }

        public long pcc() {
            return this.sf - this.pcc;
        }

        public long sf() {
            return this.oo - this.gm;
        }

        public sf pcc(long j) {
            this.pcc = j;
            return this;
        }

        public sf sf(long j) {
            this.sf = j;
            return this;
        }
    }

    public Map<String, String> gm() {
        return this.kj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File oo(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return vj(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public void sf() {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || this.vj.get()) {
            return;
        }
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String oo = pcc.this.oo();
                    if (!TextUtils.isEmpty(oo)) {
                        File file = new File(oo);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                if (file2 != null) {
                                    try {
                                        File pcc2 = pcc.pcc(file2);
                                        if (pcc2 != null && pcc2.exists()) {
                                            pcc.this.kj.put(file2.getName(), pcc2.getAbsolutePath());
                                        }
                                        pcc.this.pcc(pcc.this.oo(pcc2), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.tz.pcc.gm.pcc().pcc(pcc.this.kj);
                pcc.this.vj.set(true);
            }
        });
    }

    public static void sf(File file) {
        gm(file);
        try {
            ork.sf().hc().pcc(file);
        } catch (Throwable unused) {
        }
    }

    private boolean vj(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public boolean pcc(of ofVar) {
        if (this.vj.get() && ofVar != null && ofVar.kez() != null && ofVar.kez().i != null) {
            try {
                if (!TextUtils.isEmpty(this.kj.get(vj.pcc(ofVar.kez().i)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pcc(File file, boolean z) {
        byte[] oo;
        String sf2;
        try {
            if (!vj(file) || (oo = qf.oo(file)) == null || oo.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                sf2 = com.bytedance.sdk.component.utils.pcc.gm(new String(oo));
            } else {
                sf2 = com.bytedance.sdk.component.oo.pcc.sf(new String(oo), com.bytedance.sdk.openadsdk.core.pcc.sf());
            }
            if (TextUtils.isEmpty(sf2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(sf2);
            if (z && jSONObject.length() > 0) {
                this.oo.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse pcc(String str, String str2, String str3) {
        WebResourceResponse pcc2;
        String str4;
        File pcc3;
        try {
            pcc2 = com.bytedance.sdk.openadsdk.tz.pcc.gm.pcc().pcc(str3);
        } catch (Throwable th) {
            lo.pcc("PlayableCache", "playable intercept error: ", th);
        }
        if (pcc2 != null) {
            return pcc2;
        }
        if (this.vj.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                str4 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String pcc4 = vj.pcc(str);
            if (TextUtils.isEmpty(pcc4)) {
                return null;
            }
            String str5 = this.kj.get(pcc4);
            if (!TextUtils.isEmpty(str5)) {
                pcc3 = new File(str5);
            } else {
                pcc3 = pcc(new File(oo(), pcc4));
                if (pcc3 != null && pcc3.exists()) {
                    this.kj.put(pcc4, pcc3.getAbsolutePath());
                }
            }
            if (pcc3 != null && pcc3.exists()) {
                String pcc5 = pcc(str2);
                if (TextUtils.isEmpty(pcc5)) {
                    return null;
                }
                String replace = str3.replace(pcc5, "");
                if (!TextUtils.isEmpty(replace) && !replace.startsWith("https://") && !replace.startsWith("http://")) {
                    File file = new File(pcc3, replace);
                    if (file.exists() && pcc(pcc4, replace, file) && file.getCanonicalPath().startsWith(pcc3.getCanonicalPath())) {
                        return new WebResourceResponse(str4, C4427z5.O, new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File pcc(File file) {
        File[] listFiles;
        if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return pcc(file3);
                }
            }
        }
        return null;
    }

    private String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            String str2 = split[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            String str3 = split[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean pcc(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.oo.get(str);
            if (jSONObject == null) {
                return true;
            }
            String optString = jSONObject.optString(str2);
            if (optString != null && optString.equalsIgnoreCase(vj.pcc(file))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final InterfaceC0085pcc interfaceC0085pcc, final boolean z) {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.gm.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0085pcc interfaceC0085pcc2 = interfaceC0085pcc;
                if (interfaceC0085pcc2 != null) {
                    interfaceC0085pcc2.pcc(z);
                }
            }
        });
    }
}
