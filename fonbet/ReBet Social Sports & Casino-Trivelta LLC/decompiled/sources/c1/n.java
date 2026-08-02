package c1;

import c1.p;
import e1.Z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class n {
    public static boolean a(p.a aVar) {
        if (aVar.f26780a == -1 || aVar.f26781b == -1) {
            return false;
        }
        int i10 = aVar.f26782c;
        return i10 == 2 || i10 == 4;
    }

    public static boolean b(p.a aVar, p.a aVar2) {
        return aVar.f26780a == aVar2.f26780a && a(aVar) && a(aVar2);
    }

    public static float c(float f10) {
        return Z.n(f10 * (f10 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    public static float d(ByteBuffer byteBuffer, boolean z10, boolean z11) {
        return z11 ? z10 ? byteBuffer.getShort() : c(byteBuffer.getFloat()) : z10 ? e(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    public static float e(short s10) {
        return s10 / (s10 < 0 ? 32768 : 32767);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, p.a aVar, ByteBuffer byteBuffer2, p.a aVar2, t tVar, int i10, boolean z10, boolean z11) {
        boolean z12 = aVar.f26782c == 2;
        boolean z13 = aVar2.f26782c == 2;
        int h10 = tVar.h();
        int j10 = tVar.j();
        float[] fArr = new float[h10];
        float[] fArr2 = new float[j10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (z10) {
                int position = byteBuffer2.position();
                for (int i12 = 0; i12 < j10; i12++) {
                    fArr2[i12] = d(byteBuffer2, z13, z13);
                }
                byteBuffer2.position(position);
            }
            for (int i13 = 0; i13 < h10; i13++) {
                fArr[i13] = d(byteBuffer, z12, z13);
            }
            for (int i14 = 0; i14 < j10; i14++) {
                for (int i15 = 0; i15 < h10; i15++) {
                    fArr2[i14] = fArr2[i14] + (fArr[i15] * tVar.i(i15, i14));
                }
                if (z13) {
                    byteBuffer2.putShort((short) Z.n(fArr2[i14], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z11 ? Z.n(fArr2[i14], -1.0f, 1.0f) : fArr2[i14]);
                }
                fArr2[i14] = 0.0f;
            }
        }
        return byteBuffer2;
    }
}
