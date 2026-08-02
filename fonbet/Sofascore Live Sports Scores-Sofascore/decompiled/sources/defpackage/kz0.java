package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import com.unity3d.services.UnityAdsConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kz0 implements iw8 {
    public static final kz0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        kz0 kz0Var = new kz0();
        a = kz0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Banner", kz0Var, 8);
        uyeVar.j("w", false);
        uyeVar.j(h.b, false);
        uyeVar.j("format", true);
        uyeVar.j("bidfloor", true);
        uyeVar.j("battr", true);
        uyeVar.j("pos", true);
        uyeVar.j("api", true);
        uyeVar.j("vcm", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W((KSerializer) mz0.i[2].getValue());
        w92 w92Var = w92.c;
        KSerializer W2 = l98.W(w92Var);
        qb2 qb2Var = qb2.a;
        KSerializer W3 = l98.W(w92Var);
        KSerializer W4 = l98.W(qb2Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, W, c88.a, W2, qb2Var, W3, W4};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Byte b;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b2 = decoder.b(uyeVar);
        joa[] joaVarArr = mz0.i;
        boolean z = true;
        Byte b3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        tm8[] tm8VarArr = null;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        byte[] bArr = null;
        byte b4 = 0;
        byte[] bArr2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b2.l(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b2.l(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    tm8VarArr = (tm8[]) b2.i(uyeVar, 2, (dy4) joaVarArr[2].getValue(), tm8VarArr);
                    i |= 4;
                    break;
                case 3:
                    f = b2.s(uyeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    bArr = (byte[]) b2.i(uyeVar, 4, w92.c, bArr);
                    i |= 16;
                    break;
                case 5:
                    b4 = b2.A(uyeVar, 5);
                    i |= 32;
                    break;
                case 6:
                    bArr2 = (byte[]) b2.i(uyeVar, 6, w92.c, bArr2);
                    i |= 64;
                    break;
                case 7:
                    b3 = (Byte) b2.i(uyeVar, 7, qb2.a, b3);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        if (3 != (i & 3)) {
            oea.z(i, 3, descriptor);
            throw null;
        }
        mz0 mz0Var = new mz0();
        mz0Var.a = i2;
        mz0Var.b = i3;
        if ((i & 4) == 0) {
            mz0Var.c = null;
        } else {
            mz0Var.c = tm8VarArr;
        }
        if ((i & 8) == 0) {
            mz0Var.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            mz0Var.d = f;
        }
        if ((i & 16) == 0) {
            mz0Var.e = null;
        } else {
            mz0Var.e = bArr;
        }
        if ((i & 32) == 0) {
            mz0Var.f = (byte) 0;
        } else {
            mz0Var.f = b4;
        }
        if ((i & 64) == 0) {
            b = null;
            mz0Var.g = null;
        } else {
            b = null;
            mz0Var.g = bArr2;
        }
        if ((i & 128) == 0) {
            mz0Var.h = b;
            return mz0Var;
        }
        mz0Var.h = b3;
        return mz0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mz0 mz0Var = (mz0) obj;
        encoder.getClass();
        mz0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = mz0.i;
        int i = mz0Var.a;
        Byte b2 = mz0Var.h;
        byte b3 = mz0Var.f;
        float f = mz0Var.d;
        b.u(0, i, uyeVar);
        b.u(1, mz0Var.b, uyeVar);
        if (b.o(uyeVar) || mz0Var.c != null) {
            b.h(uyeVar, 2, (KSerializer) joaVarArr[2].getValue(), mz0Var.c);
        }
        if (b.o(uyeVar) || Float.compare(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
            b.t(uyeVar, 3, f);
        }
        if (b.o(uyeVar) || mz0Var.e != null) {
            b.h(uyeVar, 4, w92.c, mz0Var.e);
        }
        if (b.o(uyeVar) || b3 != 0) {
            b.q(uyeVar, 5, b3);
        }
        if (b.o(uyeVar) || mz0Var.g != null) {
            b.h(uyeVar, 6, w92.c, mz0Var.g);
        }
        if (b.o(uyeVar) || b2 != null) {
            b.h(uyeVar, 7, qb2.a, b2);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
