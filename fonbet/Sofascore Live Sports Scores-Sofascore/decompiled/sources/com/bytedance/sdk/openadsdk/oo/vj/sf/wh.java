package com.bytedance.sdk.openadsdk.oo.vj.sf;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.lo;
import defpackage.nem;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends gm {
    private long gm;
    private int oo = 0;
    private final nem pcc;
    private long sf;

    public wh(nem nemVar) {
        this.pcc = nemVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        if (r1 == null) goto L26;
     */
    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(pcc pccVar) {
        MediaExtractor mediaExtractor;
        int i;
        super.pcc(pccVar);
        JSONObject oo = pccVar.oo();
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.pcc.vj(), this.pcc.nac());
        if (file.exists()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String absolutePath = file.getAbsolutePath();
            try {
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(absolutePath);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i2 = 0; i2 < trackCount; i2++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                        String string = trackFormat.getString("mime");
                        if (string != null && (("video/avc".equals(string) || "video/hevc".equals(string)) && trackFormat.containsKey("level"))) {
                            i = trackFormat.getInteger("level");
                            mediaExtractor.release();
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                mediaExtractor = null;
            }
            mediaExtractor.release();
            i = -1;
            try {
                oo.put("level", i);
                oo.put("level_cost_time", SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (JSONException unused3) {
            }
        }
    }

    public void sf(long j) {
        this.gm = j;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.sf);
            jSONObject.put("buffers_time", this.gm);
            jSONObject.put("video_backup", this.oo);
        } catch (Throwable th) {
            lo.gm("FeedOverModel", th.getMessage());
        }
    }

    public void pcc(long j) {
        this.sf = j;
    }
}
