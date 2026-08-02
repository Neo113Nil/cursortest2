package com.bytedance.sdk.component.vj.sf.gm.pcc.pcc;

import com.bytedance.sdk.component.utils.ork;
import com.bytedance.sdk.component.vj.gm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements gm {
    private int pcc;
    private pcc sf;

    public sf(File file, long j) {
        int i = (int) j;
        this.pcc = i;
        this.sf = pcc.pcc(i, file);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public boolean sf(String str) {
        try {
            InputStream pcc = this.sf.pcc(str);
            boolean z = pcc != null;
            ork.pcc(pcc);
            return z;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                ork.pcc(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, byte[] bArr) {
        pcc pccVar = this.sf;
        if (pccVar == null || bArr == null || str == null) {
            return false;
        }
        return pccVar.pcc(str, bArr);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    /* renamed from: sf, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] pcc(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        pcc pccVar = this.sf;
        if (pccVar != null && str != null) {
            try {
                inputStream = pccVar.pcc(str);
                if (inputStream != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            ork.pcc(inputStream);
                            ork.pcc(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        ork.pcc(inputStream);
                        ork.pcc(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ork.pcc(inputStream);
                    ork.pcc(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStream = null;
            }
            ork.pcc(inputStream);
            ork.pcc(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.vj.gm
    public InputStream pcc(String str) {
        pcc pccVar = this.sf;
        if (pccVar == null) {
            return null;
        }
        return pccVar.pcc(str);
    }
}
