package com.bytedance.sdk.openadsdk.core.gbb.gm;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.gbb.pcc.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.vj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.fc6;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static final List<String> pcc = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);
    private static final ConcurrentHashMap<String, Boolean> sf = new ConcurrentHashMap<>();

    public static void pcc(of ofVar) {
        vj jvi;
        ArrayList<vj.pcc> pcc2;
        of ofVar2;
        if (ofVar == null || !vj.pcc(ofVar) || (jvi = ofVar.jvi()) == null || (pcc2 = jvi.pcc()) == null || pcc2.isEmpty()) {
            return;
        }
        Iterator<vj.pcc> it = pcc2.iterator();
        while (it.hasNext()) {
            vj.pcc next = it.next();
            String oo = next.oo();
            if (TextUtils.isEmpty(oo)) {
                ofVar2 = ofVar;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj vjVar = new com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj(lu.pcc(), 0, 0);
                com.bytedance.sdk.openadsdk.core.gbb.pcc pcc3 = vjVar.pcc(oo, (File) null, new ArrayList());
                if (pcc3 != null) {
                    next.pcc(pcc3.pcc());
                    next.pcc(pcc3.tmg());
                }
                ofVar2 = ofVar;
                pcc(ofVar2, "vast_content", pcc3, elapsedRealtime, vjVar.wh);
            }
            pcc(ofVar2, next);
            ofVar = ofVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(of ofVar, File file, vj.pcc pccVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj vjVar = new com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.vj(lu.pcc(), 0, 0);
        com.bytedance.sdk.openadsdk.core.gbb.pcc pcc2 = vjVar.pcc((String) null, file, new ArrayList());
        if (pcc2 != null) {
            pccVar.pcc(pcc2.pcc());
            pccVar.pcc(pcc2.tmg());
        }
        sf(ofVar, pccVar.gm(), true, j);
        pcc(ofVar, "vast_url", pcc2, elapsedRealtime, vjVar.wh);
        sf();
    }

    private static double sf(String str) {
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            return (hashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }

    private static void sf() {
        File[] listFiles;
        File pcc2 = pcc(lu.pcc());
        if (pcc2 == null || (listFiles = pcc2.listFiles()) == null || listFiles.length <= 5) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.oo.2
            @Override // java.util.Comparator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = listFiles.length - 5;
        for (int i = 0; i < listFiles.length && i < length; i++) {
            File file = listFiles[i];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(of ofVar, final String str, final boolean z, final long j) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, ofVar.vj(), "track_url_request_result", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.oo.3
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("success", z);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void sf(final of ofVar, final String str, final com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, final long j, final sf.pcc pccVar2) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.oo.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar3 = pccVar;
                    String str2 = "load_vast_fail";
                    if (pccVar3 != null) {
                        if (!TextUtils.isEmpty(pccVar3.vy()) && !TextUtils.isEmpty(pccVar.wh()) && pccVar.kj() > 0.0d) {
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("error_code", -3);
                    } else {
                        sf.pcc pccVar4 = pccVar2;
                        if (pccVar4 != null) {
                            jSONObject.put("error_code", pccVar4.pcc);
                        }
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar5 = pccVar;
                    if (pccVar5 == null || pccVar5.sf() == null || !TextUtils.isEmpty(pccVar.sf().vj())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str, "load_vast_icon_fail", jSONObject2);
                    pccVar.pcc((com.bytedance.sdk.openadsdk.core.gbb.sf) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static double pcc(int i, double d, int i2, int i3, int i4, @Nullable String str) {
        double pcc2 = pcc(i, d, i2, i3);
        return (1.0d / ((pcc2 + 1.0d) + pcc(i4))) * sf(str);
    }

    private static double pcc(int i, double d, int i2, int i3) {
        return (d > 0.0d ? Math.abs(d - (i3 > 0 ? i2 / i3 : 0.0d)) : 0.0d) + (i > 0 ? Math.abs((i - i2) / i) : 0.0d);
    }

    private static double pcc(int i) {
        int max = Math.max(i, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(TTAdConstant.STYLE_SIZE_RADIO_3_2 - max) / 1500.0f);
        }
        return 0.0d;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        List<of> vj = pccVar.vj();
        if (vj != null) {
            Iterator<of> it = vj.iterator();
            while (it.hasNext()) {
                pcc(it.next());
            }
        }
    }

    private static void pcc(final of ofVar, final vj.pcc pccVar) {
        File pcc2;
        String gm = pccVar.gm();
        if (TextUtils.isEmpty(gm)) {
            return;
        }
        StringBuilder q = fc6.q(gm);
        q.append(ofVar.qxv());
        final String sb = q.toString();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = sf;
        if (concurrentHashMap.containsKey(sb) || (pcc2 = pcc(sb)) == null) {
            return;
        }
        if (pcc2.exists() && pcc2.length() > 0) {
            sf(ofVar, pcc2, pccVar, 0L);
            return;
        }
        concurrentHashMap.put(sb, Boolean.TRUE);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
        oo.gm(gm);
        oo.pcc(pcc2.getParent(), pcc2.getName());
        oo.oo(gm);
        oo.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.oo.1
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                if (sfVar.wh() && sfVar.vj() != null && sfVar.vj().exists()) {
                    oo.sf(ofVar, sfVar.vj(), vj.pcc.this, SystemClock.elapsedRealtime() - elapsedRealtime);
                } else {
                    oo.sf(ofVar, vj.pcc.this.gm(), false, SystemClock.elapsedRealtime() - elapsedRealtime);
                }
                oo.sf.remove(sb);
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                oo.sf(ofVar, vj.pcc.this.gm(), false, SystemClock.elapsedRealtime() - elapsedRealtime);
                oo.sf.remove(sb);
            }
        });
    }

    public static File pcc(String str) {
        String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(str);
        if (pcc2 == null) {
            return null;
        }
        return new File(pcc(lu.pcc()), pcc2);
    }

    private static File pcc(Context context) {
        return qf.sf(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    public static void pcc(final of ofVar, final String str, final com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, final long j, final sf.pcc pccVar2) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.oo.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    jSONObject.put("from", str);
                    if (pccVar != null) {
                        of ofVar2 = ofVar;
                        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar2, ofVar2.vj(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    sf.pcc pccVar3 = pccVar2;
                    if (pccVar3 != null) {
                        jSONObject.put("error_code", pccVar3.pcc);
                    }
                    of ofVar3 = ofVar;
                    com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar3, ofVar3.vj(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
