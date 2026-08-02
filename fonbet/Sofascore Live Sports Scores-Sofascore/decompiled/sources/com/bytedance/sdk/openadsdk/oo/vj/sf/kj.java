package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import defpackage.cga;
import defpackage.nem;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends gm {
    private long gm;
    private int oo;
    private final nem pcc;
    private long sf;

    public kj(nem nemVar) {
        this.pcc = nemVar;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(pcc pccVar) {
        FileInputStream fileInputStream;
        int i;
        int i2;
        if (!this.pcc.jsj()) {
            return;
        }
        String vj = this.pcc.vj();
        String nac = this.pcc.nac();
        File R = cga.R(vj, nac);
        File C = cga.C(vj, nac);
        if (C.exists()) {
            R = C;
        }
        try {
            if (R.exists()) {
                long length = R.length();
                if (length > 0) {
                    FileInputStream fileInputStream2 = null;
                    try {
                        fileInputStream = new FileInputStream(R);
                        i = 8;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        byte[] bArr = new byte[8];
                        long j = 0;
                        while (fileInputStream.read(bArr) == i) {
                            int i3 = i;
                            long j2 = ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << i3) | (bArr[3] & 255);
                            if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                                break;
                            }
                            long j3 = j2 - 8;
                            if (j3 > 0 && fileInputStream.skip(j3) < j3) {
                                break;
                            }
                            j += j2;
                            i = i3;
                        }
                        i2 = (int) ((j * 100.0f) / length);
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused4) {
                            }
                        }
                        i2 = -1;
                        pccVar.oo().put("moov_box_pos", i2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused5) {
                            }
                        }
                        throw th;
                    }
                    pccVar.oo().put("moov_box_pos", i2);
                    return;
                }
            }
            pccVar.oo().put("moov_box_pos", i2);
            return;
        } catch (JSONException unused6) {
            return;
        }
        i2 = -1;
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
            jSONObject.put("video_start_duration", this.sf);
            jSONObject.put("video_cache_size", this.gm);
            jSONObject.put("is_auto_play", this.oo);
        } catch (Throwable th) {
            lo.gm("FeedPlayModel", th.getMessage());
        }
    }

    public void pcc(long j) {
        this.sf = j;
    }
}
