package com.bytedance.sdk.component.wh.pcc.wh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements sf {
    private final Context pcc;
    private final vj sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc extends com.bytedance.sdk.component.wh.pcc.vj.vj {
        private final String gm;
        private final Map<String, String> oo;
        private final oo sf;

        private pcc(oo ooVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.sf = ooVar;
            this.gm = str;
            this.oo = map;
        }

        private String gm(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("{TS}") || str.contains("__TS__")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                }
                if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.gm)) {
                    return str.replace("{UID}", this.gm).replace("__UID__", this.gm);
                }
            }
            return str;
        }

        public boolean pcc(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.wh.pcc.vj.oo ooVar;
            com.bytedance.sdk.component.wh.pcc.vj jr = qf.wh().jr();
            if (jr == null || qf.wh().vj() == null || !jr.gm() || !pcc(this.sf.sf())) {
                return;
            }
            if (this.sf.oo() >= jr.gm(this.sf.wh())) {
                gm.this.sf.gm(this.sf);
                return;
            }
            try {
                if (this.sf.vh()) {
                    gm.this.sf.pcc(this.sf);
                }
                if (jr.pcc(gm.this.pcc())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String sf = this.sf.sf();
                    if (jr.wh() == 0) {
                        sf = gm(this.sf.sf());
                        if (this.sf.gm()) {
                            sf = sf(sf);
                        }
                    }
                    com.bytedance.sdk.component.wh.pcc.vj.gm ork = jr.ork();
                    if (ork == null) {
                        return;
                    }
                    ork.pcc(Command.HTTP_HEADER_USER_AGENT, jr.vy());
                    ork.pcc("csj_client_source_from", "1");
                    if (this.oo != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.oo.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        ork.pcc("csj_extra_info", jSONObject.toString());
                    }
                    ork.pcc(sf);
                    try {
                        ooVar = ork.pcc();
                        try {
                            ooVar.pcc();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        ooVar = null;
                    }
                    oo ooVar2 = this.sf;
                    ooVar2.pcc(ooVar2.oo() + 1);
                    if (ooVar != null && ooVar.pcc()) {
                        gm.this.sf.gm(this.sf);
                        this.sf.sf();
                        jr.pcc(true, 200, System.currentTimeMillis() - currentTimeMillis, this.sf);
                        return;
                    }
                    if (ooVar != null) {
                        this.sf.sf(ooVar.sf());
                        this.sf.gm(ooVar.gm());
                    }
                    if (ooVar == null || ooVar.sf() != 8848) {
                        this.sf.sf();
                        int oo = this.sf.oo();
                        int gm = jr.gm(this.sf.wh());
                        gm gmVar = gm.this;
                        if (oo >= gm) {
                            gmVar.sf.gm(this.sf);
                            this.sf.sf();
                        } else {
                            gmVar.sf.sf(this.sf);
                        }
                    } else {
                        ooVar.gm();
                        gm.this.sf.gm(this.sf);
                    }
                    jr.pcc(false, this.sf.kj(), System.currentTimeMillis() - currentTimeMillis, this.sf);
                }
            } catch (Throwable unused3) {
            }
        }

        public String sf(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    str = str.replace("[ss_random]", String.valueOf(gm.gm().nextLong()));
                    return str.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                }
            }
            return str;
        }
    }

    public gm(Context context, vj vjVar) {
        this.pcc = context;
        this.sf = vjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random gm() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.sf
    public void pcc(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.wh.pcc.vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || jr.oo() == null || !jr.gm() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jr.oo().execute(new pcc(new oo(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    public Context pcc() {
        Context context = this.pcc;
        return context == null ? qf.wh().vj() : context;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.sf
    public Runnable pcc(final oo ooVar, final String str, final Map<String, String> map) {
        if (ooVar == null || TextUtils.isEmpty(ooVar.pcc())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.wh.pcc.wh.gm.1
            @Override // java.lang.Runnable
            public void run() {
                if (gm.this.sf.pcc(ooVar.pcc()) != null) {
                    new pcc(ooVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.sf
    public void pcc(final String str, final boolean z) {
        com.bytedance.sdk.component.wh.pcc.vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || !jr.gm()) {
            return;
        }
        com.bytedance.sdk.component.wh.pcc.vj.vj vjVar = new com.bytedance.sdk.component.wh.pcc.vj.vj("trackFailedUrls") { // from class: com.bytedance.sdk.component.wh.pcc.wh.gm.2
            @Override // java.lang.Runnable
            public void run() {
                gm.this.pcc(gm.this.sf.pcc(), str, z);
            }
        };
        vjVar.pcc(1);
        if (jr.oo() != null) {
            jr.oo().execute(vjVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(List<oo> list, String str, boolean z) {
        gm gmVar;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.wh.pcc.vj jr = qf.wh().jr();
        for (oo ooVar : list) {
            if (jr == null || jr.oo() == null) {
                gmVar = this;
                str2 = str;
            } else {
                ooVar.pcc(z);
                gmVar = this;
                str2 = str;
                jr.oo().execute(new pcc(ooVar, str2, null));
            }
            this = gmVar;
            str = str2;
        }
    }
}
