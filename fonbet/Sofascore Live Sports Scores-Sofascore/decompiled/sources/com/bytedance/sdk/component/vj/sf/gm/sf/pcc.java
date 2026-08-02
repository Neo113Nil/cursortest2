package com.bytedance.sdk.component.vj.sf.gm.sf;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.vj.sf.gm.wh;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.vj.sf.gm.sf.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0056pcc {
        void pcc();

        void pcc(Drawable drawable);

        void pcc(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(byte[] bArr, wh whVar, InterfaceC0056pcc interfaceC0056pcc) {
        FileOutputStream fileOutputStream;
        Throwable th;
        File pcc;
        try {
            pcc = qf.pcc(whVar.pcc(), "P_GIF_CACHE", "P_U_GIF_FILE");
            fileOutputStream = new FileOutputStream(pcc);
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(pcc));
                if (interfaceC0056pcc != null) {
                    interfaceC0056pcc.pcc(decodeDrawable);
                }
            } else if (interfaceC0056pcc != null) {
                interfaceC0056pcc.pcc(bArr);
            }
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                lo.pcc("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (interfaceC0056pcc != null) {
                    interfaceC0056pcc.pcc();
                }
            } catch (Throwable th4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th4;
            }
        }
    }

    public void pcc(byte[] bArr, InterfaceC0056pcc interfaceC0056pcc) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0056pcc != null) {
                interfaceC0056pcc.pcc(bArr);
                return;
            }
            return;
        }
        try {
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(wrap));
            if (interfaceC0056pcc != null) {
                interfaceC0056pcc.pcc(decodeDrawable);
            }
        } catch (Throwable th) {
            lo.gm("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0056pcc != null) {
                interfaceC0056pcc.pcc();
            }
        }
    }

    public void pcc(byte[] bArr, wh whVar, InterfaceC0056pcc interfaceC0056pcc) {
        if (Build.VERSION.SDK_INT <= 30) {
            pcc(bArr, interfaceC0056pcc, whVar);
        } else {
            pcc(bArr, interfaceC0056pcc);
        }
    }

    private void pcc(final byte[] bArr, final InterfaceC0056pcc interfaceC0056pcc, final wh whVar) {
        try {
            whVar.kj().submit(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.sf.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.sf(bArr, whVar, interfaceC0056pcc);
                }
            });
        } catch (Throwable th) {
            lo.gm("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0056pcc != null) {
                interfaceC0056pcc.pcc();
            }
        }
    }
}
