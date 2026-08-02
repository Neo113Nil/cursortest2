package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mgi implements j1g {
    public final ArrayList a;
    public final ca2 b;
    public final kn4 c;

    public mgi(ArrayList arrayList, ca2 ca2Var, kn4 kn4Var) {
        this.a = arrayList;
        this.b = ca2Var;
        this.c = kn4Var;
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        return !((Boolean) uvdVar.c(gy8.b)).booleanValue() && ktm.z(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, uvdVar);
    }
}
