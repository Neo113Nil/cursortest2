package com.bytedance.sdk.component.qf.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.mz1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm {
    public File pcc;
    public File sf;
    private volatile boolean vh;

    public pcc(vh vhVar) {
        super(vhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ork() {
        try {
            this.pcc.delete();
        } catch (Throwable unused) {
        }
        try {
            this.sf.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean qf(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean vj(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long wh(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:31|(3:33|(2:36|34)|37)|38|(1:40)|41|42|(4:44|45|46|(4:48|(2:50|51)|52|(4:63|64|65|(8:67|68|69|70|71|(1:75)|76|(3:77|78|(10:80|81|82|(6:84|(1:86)|87|88|89|(1:91)(3:92|93|94))|122|123|87|88|89|(0)(0))(6:126|(1:128)|129|(1:170)|133|(6:160|161|162|164|165|166)(2:139|(6:141|142|143|145|146|147)(5:151|152|154|155|156)))))(9:175|176|68|69|70|71|(2:73|75)|76|(4:77|78|(0)(0)|91)))(2:58|(2:60|61)(1:62))))|183|52|(1:54)|63|64|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0174, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x016c A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #11 {all -> 0x0171, blocks: (B:67:0x0167, B:175:0x016c), top: B:65:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #11 {all -> 0x0171, blocks: (B:67:0x0167, B:175:0x016c), top: B:65:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7 A[LOOP:1: B:77:0x0196->B:91:0x01c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb A[SYNTHETIC] */
    @Override // com.bytedance.sdk.component.qf.sf.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.qf.sf pcc() {
        com.bytedance.sdk.component.qf.sf sfVar;
        long j;
        long j2;
        InputStream inputStream;
        InputStream gm;
        byte[] bArr;
        int i;
        int read;
        pcc pccVar = this;
        File file = pccVar.pcc;
        if (file == null || pccVar.sf == null) {
            return null;
        }
        if (file.exists() && pccVar.pcc.length() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.qf.sf sfVar2 = new com.bytedance.sdk.component.qf.sf(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            sfVar2.pcc(pccVar.pcc);
            return sfVar2;
        }
        long length = pccVar.sf.length();
        if (length < 0) {
            length = 0;
        }
        tmg.pcc pccVar2 = new tmg.pcc();
        pccVar2.pcc((Object) pccVar.oo());
        pccVar.pcc(pccVar2);
        pccVar.sf(Command.HTTP_HEADER_RANGE, lnb.l(length, "-", new StringBuilder("bytes=")));
        if (TextUtils.isEmpty(pccVar.kj)) {
            return null;
        }
        try {
            pccVar2.sf(pccVar.kj);
            pccVar.sf(pccVar2);
            try {
                com.bytedance.sdk.component.sf.pcc.sf pcc = pccVar.gm.pcc(pccVar2.pcc().sf());
                if (pcc == null) {
                    return null;
                }
                gbb sf = pcc.sf();
                if (sf != null) {
                    pccVar.pcc(sf.vy());
                }
                if (sf == null || !sf.oo()) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                wh qf = sf.qf();
                if (qf != null) {
                    for (int i2 = 0; i2 < qf.pcc(); i2++) {
                        hashMap.put(qf.pcc(i2), qf.sf(i2));
                    }
                }
                com.bytedance.sdk.component.qf.sf sfVar3 = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, null, sf.sf(), sf.pcc());
                long pcc2 = sf.wh().pcc();
                if (pcc2 <= 0) {
                    pcc2 = wh(hashMap);
                }
                long length2 = pccVar.sf.length();
                boolean vj = vj(hashMap);
                sfVar = null;
                if (vj) {
                    pcc2 += length2;
                    try {
                        String str = (String) hashMap.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            j = 0;
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (pcc2 - 1)) == -1) {
                                Objects.toString(pccVar.sf);
                                pccVar.ork();
                                return null;
                            }
                            if (pcc2 <= j && pccVar.sf.exists() && pccVar.sf.length() == pcc2) {
                                if (!pccVar.sf.renameTo(pccVar.pcc)) {
                                    return null;
                                }
                                sfVar3.pcc(pccVar.pcc);
                                return sfVar3;
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(pccVar.sf, "rw");
                            if (vj) {
                                randomAccessFile.setLength(j);
                                j2 = 0;
                                gm = sf.wh().gm();
                                if (qf(hashMap)) {
                                    gm = new GZIPInputStream(gm);
                                }
                                bArr = new byte[16384];
                                i = 0;
                                long j3 = 0;
                                while (true) {
                                    read = gm.read(bArr, i, 16384 - i);
                                    inputStream = gm;
                                    if (read != -1) {
                                    }
                                    gm = inputStream;
                                }
                            } else {
                                randomAccessFile.seek(length);
                                j2 = length;
                                try {
                                    gm = sf.wh().gm();
                                    try {
                                        if (qf(hashMap) && !(gm instanceof GZIPInputStream)) {
                                            gm = new GZIPInputStream(gm);
                                        }
                                        bArr = new byte[16384];
                                        i = 0;
                                        long j32 = 0;
                                        while (true) {
                                            read = gm.read(bArr, i, 16384 - i);
                                            inputStream = gm;
                                            if (read != -1) {
                                                if (read != 0) {
                                                    randomAccessFile.seek(j2);
                                                    randomAccessFile.write(bArr, 0, i);
                                                }
                                                if (!vj || length == 0) {
                                                    pcc2 = pccVar.sf.length();
                                                }
                                                if (pcc2 <= 0 || !pccVar.sf.exists() || pccVar.sf.length() != pcc2) {
                                                    pccVar.sf.length();
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused) {
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Throwable unused2) {
                                                    }
                                                    return null;
                                                }
                                                if (!pccVar.sf.renameTo(pccVar.pcc)) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused3) {
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Throwable unused4) {
                                                    }
                                                    return null;
                                                }
                                                sfVar3.pcc(pccVar.pcc);
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused5) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused6) {
                                                }
                                                return sfVar3;
                                            }
                                            i += read;
                                            j32 += read;
                                            try {
                                                try {
                                                    if (j32 % 16384 != 0) {
                                                        if (j32 == pcc2 - length) {
                                                        }
                                                        pccVar = this;
                                                        if (!pccVar.vh) {
                                                            throw new IOException("net is cancel");
                                                        }
                                                        gm = inputStream;
                                                    }
                                                    if (!pccVar.vh) {
                                                    }
                                                } catch (Throwable unused7) {
                                                    if (!vj) {
                                                        try {
                                                            pccVar.ork();
                                                        } finally {
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Throwable unused8) {
                                                        }
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Throwable unused9) {
                                                    }
                                                    return null;
                                                }
                                                randomAccessFile.seek(j2);
                                                randomAccessFile.write(bArr, 0, i);
                                                j2 += i;
                                                i = 0;
                                                pccVar = this;
                                            } catch (Throwable unused10) {
                                                pccVar = this;
                                            }
                                        }
                                    } catch (Throwable unused11) {
                                        inputStream = gm;
                                    }
                                } catch (Throwable unused12) {
                                    inputStream = null;
                                }
                            }
                        }
                    } catch (IOException unused13) {
                        pccVar.ork();
                        return sfVar;
                    }
                }
                j = 0;
                if (pcc2 <= j) {
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pccVar.sf, "rw");
                if (vj) {
                }
            } catch (IOException unused14) {
                sfVar = null;
            }
        } catch (IllegalArgumentException unused15) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void sf() {
        this.vh = true;
        super.sf();
    }

    public void pcc(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.pcc = new File(str, str2);
        this.sf = new File(str, dmi.y(str2, ".temp"));
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void pcc(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        File file = this.pcc;
        if (file == null || this.sf == null) {
            if (pccVar != null) {
                pccVar.pcc(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.pcc.length() != 0 && pccVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.qf.sf sfVar = new com.bytedance.sdk.component.qf.sf(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            sfVar.pcc(this.pcc);
            pccVar.pcc(this, sfVar);
            return;
        }
        long length = this.sf.length();
        final long j = length >= 0 ? length : 0L;
        tmg.pcc pccVar2 = new tmg.pcc();
        pccVar2.pcc((Object) oo());
        pcc(pccVar2);
        sf(Command.HTTP_HEADER_RANGE, lnb.l(j, "-", new StringBuilder("bytes=")));
        if (TextUtils.isEmpty(this.kj)) {
            pccVar.pcc(this, new IOException("Url is Empty"));
            return;
        }
        try {
            pccVar2.sf(this.kj);
            if (!TextUtils.isEmpty(this.vj)) {
                pccVar2.pcc(this.vj);
            }
            int i = this.wh;
            if (i > 0) {
                pccVar2.pcc(i);
            }
            sf(pccVar2);
            com.bytedance.sdk.component.sf.pcc.sf pcc = this.gm.pcc(pccVar2.pcc().sf());
            if (pcc == null) {
                pccVar.pcc(this, new IOException("new call error"));
            } else {
                pcc.pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bytedance.sdk.component.qf.sf.pcc.1
                    /* JADX WARN: Code restructure failed: missing block: B:79:0x0220, code lost:
                    
                        r9.close();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:99:0x021e, code lost:
                    
                        if (0 != 0) goto L106;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0158 A[Catch: all -> 0x0144, TryCatch #2 {all -> 0x0144, blocks: (B:45:0x012b, B:47:0x0139, B:49:0x013d, B:50:0x0147, B:51:0x014e, B:53:0x0158, B:55:0x0164, B:57:0x0175, B:61:0x0180, B:62:0x0187, B:63:0x016c, B:66:0x018a, B:68:0x0192, B:71:0x019e, B:73:0x01a8, B:75:0x01b4, B:77:0x01c0, B:87:0x01cf, B:88:0x01dc, B:91:0x01f6), top: B:44:0x012b }] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0188 A[SYNTHETIC] */
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar2, gbb gbbVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        byte[] bArr;
                        int i2;
                        long j3;
                        int read;
                        if (pccVar == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (gbbVar == null) {
                            return;
                        }
                        pcc.this.pcc(gbbVar.vy());
                        wh qf = gbbVar.qf();
                        if (qf != null) {
                            for (int i3 = 0; i3 < qf.pcc(); i3++) {
                                hashMap.put(qf.pcc(i3), qf.sf(i3));
                            }
                        }
                        com.bytedance.sdk.component.qf.sf sfVar3 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, null, gbbVar.sf(), gbbVar.pcc());
                        if (!gbbVar.oo()) {
                            pccVar.pcc(pcc.this, sfVar3);
                            return;
                        }
                        long pcc2 = gbbVar.wh().pcc();
                        long j4 = 0;
                        if (pcc2 <= 0) {
                            pcc2 = pcc.wh(hashMap);
                        }
                        boolean vj = pcc.vj(hashMap);
                        if (vj) {
                            pcc2 += j;
                            String str = (String) hashMap.get("Content-Range");
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = "bytes " + j + "-" + (pcc2 - 1);
                                if (TextUtils.indexOf(str, str2) == -1) {
                                    pcc.this.ork();
                                    com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                                    pcc pccVar4 = pcc.this;
                                    StringBuilder s = mz1.s("The Content-Range Header is invalid Assume[", str2, "] vs Real[", str, "], please remove the temporary file [");
                                    s.append(pcc.this.sf);
                                    s.append("].");
                                    pccVar3.pcc(pccVar4, new IOException(s.toString()));
                                    return;
                                }
                            }
                        }
                        if (pcc2 > 0 && pcc.this.sf.exists() && pcc.this.sf.length() == pcc2) {
                            pcc pccVar5 = pcc.this;
                            if (!pccVar5.sf.renameTo(pccVar5.pcc)) {
                                pccVar.pcc(pcc.this, new IOException("Rename fail"));
                                return;
                            } else {
                                sfVar3.pcc(pcc.this.pcc);
                                pccVar.pcc(pcc.this, sfVar3);
                                return;
                            }
                        }
                        InputStream inputStream = null;
                        try {
                            randomAccessFile = new RandomAccessFile(pcc.this.sf, "rw");
                        } catch (Throwable unused) {
                            randomAccessFile = null;
                        }
                        if (vj) {
                            randomAccessFile.seek(j);
                            j2 = j;
                            try {
                                inputStream = gbbVar.wh().gm();
                                if (pcc.qf(hashMap) && !(inputStream instanceof GZIPInputStream)) {
                                    inputStream = new GZIPInputStream(inputStream);
                                }
                                bArr = new byte[16384];
                                long j5 = 0;
                                i2 = 0;
                                while (true) {
                                    j3 = j4;
                                    read = inputStream.read(bArr, i2, 16384 - i2);
                                    if (read == -1) {
                                        i2 += read;
                                        j5 += read;
                                        if (j5 % 16384 == j3 || j5 == pcc2 - j) {
                                            randomAccessFile.seek(j2);
                                            randomAccessFile.write(bArr, 0, i2);
                                            j2 += i2;
                                            i2 = 0;
                                        }
                                        if (pcc.this.vh) {
                                            throw new IOException("net is cancel");
                                        }
                                        j4 = j3;
                                    } else {
                                        if (i2 != 0) {
                                            randomAccessFile.seek(j2);
                                            randomAccessFile.write(bArr, 0, i2);
                                        }
                                        if (!vj) {
                                            pcc2 = pcc.this.sf.length();
                                        }
                                        if (pcc2 > j3 && pcc.this.sf.exists() && pcc.this.sf.length() == pcc2) {
                                            pcc pccVar6 = pcc.this;
                                            if (pccVar6.sf.renameTo(pccVar6.pcc)) {
                                                sfVar3.pcc(pcc.this.pcc);
                                                pccVar.pcc(pcc.this, sfVar3);
                                            } else {
                                                pccVar.pcc(pcc.this, new IOException("Rename fail"));
                                            }
                                        } else {
                                            com.bytedance.sdk.component.qf.pcc.pcc pccVar7 = pccVar;
                                            pcc pccVar8 = pcc.this;
                                            StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                            sb.append(pcc.this.sf.length() == pcc2);
                                            pccVar7.pcc(pccVar8, new IOException(sb.toString()));
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    pccVar.pcc(pcc.this, new IOException(th.getMessage()));
                                    if (!vj) {
                                        pcc.this.ork();
                                    }
                                } finally {
                                }
                            }
                        } else {
                            randomAccessFile.setLength(0L);
                            j2 = 0;
                            inputStream = gbbVar.wh().gm();
                            if (pcc.qf(hashMap)) {
                                inputStream = new GZIPInputStream(inputStream);
                            }
                            bArr = new byte[16384];
                            long j52 = 0;
                            i2 = 0;
                            while (true) {
                                j3 = j4;
                                read = inputStream.read(bArr, i2, 16384 - i2);
                                if (read == -1) {
                                }
                                j4 = j3;
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused2) {
                        }
                    }

                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar2, IOException iOException) {
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            pccVar3.pcc(pcc.this, iOException);
                        }
                        pcc.this.ork();
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            pccVar.pcc(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }
}
