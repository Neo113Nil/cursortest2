package com.bytedance.sdk.component.qf.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.hc;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.vy;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends gm {
    hc pcc;

    public oo(vh vhVar) {
        super(vhVar);
        this.pcc = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] wh(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException unused) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
            th = th;
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            if (byteArrayOutputStream != null) {
                throw th;
            }
            byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
        try {
            gZIPOutputStream.write(str.getBytes(C4427z5.O));
            try {
                gZIPOutputStream.close();
            } catch (IOException unused5) {
            }
        } catch (IOException unused6) {
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (gZIPOutputStream != null) {
            }
            if (byteArrayOutputStream != null) {
            }
        }
        bArr = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return bArr;
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public com.bytedance.sdk.component.qf.sf pcc() {
        com.bytedance.sdk.component.qf.sf sfVar;
        try {
            tmg.pcc pccVar = new tmg.pcc();
            if (TextUtils.isEmpty(this.kj)) {
                return new com.bytedance.sdk.component.qf.sf(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            pccVar.sf(this.kj);
            if (this.pcc == null) {
                return new com.bytedance.sdk.component.qf.sf(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            sf(pccVar);
            pccVar.pcc((Object) oo());
            pcc(pccVar);
            gbb sf = this.gm.pcc(pccVar.pcc(this.pcc).sf()).sf();
            if (sf == null) {
                return null;
            }
            pcc(sf.vy());
            HashMap hashMap = new HashMap();
            wh qf = sf.qf();
            if (qf != null) {
                for (int i = 0; i < qf.pcc(); i++) {
                    String pcc = qf.pcc(i);
                    String sf2 = qf.sf(i);
                    hashMap.put(pcc, sf2);
                    if (pcc != null && pcc.equalsIgnoreCase("content-type")) {
                        hashMap.put("content-type", sf2 == null ? "" : sf2.toLowerCase());
                    }
                }
            }
            jr wh = sf.wh();
            if (com.bytedance.sdk.component.qf.gm.pcc.pcc(hashMap)) {
                byte[] oo = wh.oo();
                sfVar = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, null, sf.sf(), sf.pcc());
                sfVar.pcc(oo);
            } else if (this.ork) {
                byte[] oo2 = wh.oo();
                sfVar = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, new String(oo2, pcc(pcc(wh))), sf.sf(), sf.pcc());
                sfVar.pcc(oo2);
            } else {
                if (wh == null) {
                    throw new IOException(sf.vj());
                }
                sfVar = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, wh.sf(), sf.sf(), sf.pcc());
            }
            pcc(sfVar, sf);
            return sfVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.qf.sf(false, IronSourceConstants.errorCode_biddingDataException, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void vj(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.pcc = hc.pcc(vy.pcc("application/json; charset=utf-8"), str);
    }

    public void pcc(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "{}";
        }
        this.pcc = hc.pcc(vy.pcc("application/json; charset=utf-8"), str);
    }

    public void pcc(String str, byte[] bArr) {
        this.pcc = hc.pcc(vy.pcc(str), bArr);
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void pcc(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        try {
            tmg.pcc pccVar2 = new tmg.pcc();
            if (TextUtils.isEmpty(this.kj)) {
                pccVar.pcc(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.vj)) {
                pccVar2.pcc(this.vj);
            }
            int i = this.wh;
            if (i > 0) {
                pccVar2.pcc(i);
            }
            pccVar2.sf(this.kj);
            if (this.pcc == null) {
                if (pccVar != null) {
                    pccVar.pcc(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                sf(pccVar2);
                pccVar2.pcc((Object) oo());
                pcc(pccVar2);
                this.gm.pcc(pccVar2.pcc(this.pcc).sf()).pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bytedance.sdk.component.qf.sf.oo.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.sf.pcc.wh] */
                    /* JADX WARN: Type inference failed for: r13v4, types: [com.bytedance.sdk.component.qf.pcc.pcc] */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.qf.sf] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.qf.sf] */
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
                        Throwable th;
                        ?? r2;
                        ?? r22;
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            oo ooVar = oo.this;
                            if (gbbVar == null) {
                                pccVar3.pcc(ooVar, new IOException("No response"));
                                return;
                            }
                            ooVar.pcc(gbbVar.vy());
                            IOException iOException = null;
                            try {
                                HashMap hashMap = new HashMap();
                                ?? qf = gbbVar.qf();
                                if (qf != 0) {
                                    r22 = 0;
                                    while (r22 < qf.pcc()) {
                                        String pcc = qf.pcc(r22);
                                        String sf = qf.sf(r22);
                                        hashMap.put(pcc, sf);
                                        if (pcc != null && pcc.equalsIgnoreCase("content-type")) {
                                            hashMap.put("content-type", sf == null ? "" : sf.toLowerCase());
                                        }
                                        r22++;
                                    }
                                }
                                jr wh = gbbVar.wh();
                                try {
                                    if (com.bytedance.sdk.component.qf.gm.pcc.pcc(hashMap)) {
                                        byte[] oo = wh.oo();
                                        com.bytedance.sdk.component.qf.sf sfVar2 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, null, gbbVar.sf(), gbbVar.pcc());
                                        sfVar2.pcc(oo);
                                        r22 = sfVar2;
                                    } else if (oo.this.ork) {
                                        byte[] oo2 = wh.oo();
                                        oo ooVar2 = oo.this;
                                        com.bytedance.sdk.component.qf.sf sfVar3 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, new String(oo2, ooVar2.pcc(ooVar2.pcc(wh))), gbbVar.sf(), gbbVar.pcc());
                                        sfVar3.pcc(oo2);
                                        r22 = sfVar3;
                                    } else {
                                        if (wh == null) {
                                            throw new IOException(gbbVar.vj());
                                        }
                                        r22 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, wh.sf(), gbbVar.sf(), gbbVar.pcc());
                                    }
                                    oo.this.pcc((com.bytedance.sdk.component.qf.sf) r22, gbbVar);
                                    r2 = r22;
                                } catch (Throwable th2) {
                                    th = th2;
                                    iOException = r22;
                                    r2 = iOException;
                                    iOException = new IOException(th);
                                    ?? r13 = pccVar;
                                    if (r2 == 0) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            ?? r132 = pccVar;
                            if (r2 == 0) {
                                r132.pcc(oo.this, r2);
                                return;
                            }
                            if (!(r132 instanceof com.bytedance.sdk.component.qf.pcc.sf)) {
                                oo ooVar3 = oo.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                r132.pcc(ooVar3, iOException);
                                return;
                            }
                            com.bytedance.sdk.component.qf.pcc.sf sfVar4 = (com.bytedance.sdk.component.qf.pcc.sf) r132;
                            oo ooVar4 = oo.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            sfVar4.pcc(ooVar4, iOException, new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), null, null, gbbVar.sf(), gbbVar.pcc()));
                        }
                    }

                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            pccVar3.pcc(oo.this, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            pccVar.pcc(this, new IOException(th.getMessage()));
        }
    }

    public void pcc(String str, boolean z) {
        if (z) {
            pcc("application/json; charset=utf-8", wh(str));
            sf("Content-Encoding", "gzip");
        } else {
            vj(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset pcc(vy vyVar) {
        try {
            return vyVar != null ? vyVar.pcc(com.bytedance.sdk.component.sf.pcc.sf.vy.pcc) : com.bytedance.sdk.component.sf.pcc.sf.vy.pcc;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.sf.pcc.sf.vy.pcc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vy pcc(jr jrVar) {
        try {
            return jrVar.vj();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.qf.sf sfVar, gbb gbbVar) {
        if (sfVar == null || gbbVar == null) {
            return;
        }
        sfVar.pcc(gbbVar.kj());
    }
}
