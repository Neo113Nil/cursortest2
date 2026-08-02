package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r3d implements iw8 {
    public static final r3d a;
    private static final /* synthetic */ uye descriptor;

    static {
        r3d r3dVar = new r3d();
        a = r3dVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Native", r3dVar, 6);
        uyeVar.j("bidfloor", true);
        uyeVar.j("request", true);
        uyeVar.j("ver", true);
        uyeVar.j("api", true);
        uyeVar.j("battr", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        w92 w92Var = w92.c;
        return new KSerializer[]{c88.a, W, W2, l98.W(w92Var), l98.W(w92Var), l98.W(yj6.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        float f = 0.0f;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        ak6 ak6Var = null;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    f = b.s(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.i(uyeVar, 1, uhi.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.i(uyeVar, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    bArr = (byte[]) b.i(uyeVar, 3, w92.c, bArr);
                    i |= 8;
                    break;
                case 4:
                    bArr2 = (byte[]) b.i(uyeVar, 4, w92.c, bArr2);
                    i |= 16;
                    break;
                case 5:
                    ak6Var = (ak6) b.i(uyeVar, 5, yj6.a, ak6Var);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(uyeVar);
        t3d t3dVar = new t3d();
        if ((i & 1) == 0) {
            t3dVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            t3dVar.a = f;
        }
        if ((i & 2) == 0) {
            t3dVar.b = null;
        } else {
            t3dVar.b = str;
        }
        if ((i & 4) == 0) {
            t3dVar.c = null;
        } else {
            t3dVar.c = str2;
        }
        if ((i & 8) == 0) {
            t3dVar.d = null;
        } else {
            t3dVar.d = bArr;
        }
        if ((i & 16) == 0) {
            t3dVar.e = null;
        } else {
            t3dVar.e = bArr2;
        }
        if ((i & 32) == 0) {
            t3dVar.f = null;
            return t3dVar;
        }
        t3dVar.f = ak6Var;
        return t3dVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t3d t3dVar = (t3d) obj;
        encoder.getClass();
        t3dVar.getClass();
        ak6 ak6Var = t3dVar.f;
        byte[] bArr = t3dVar.e;
        byte[] bArr2 = t3dVar.d;
        String str = t3dVar.c;
        String str2 = t3dVar.b;
        float f = t3dVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || Float.compare(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
            b.t(uyeVar, 0, f);
        }
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 1, uhi.a, str2);
        }
        if (b.o(uyeVar) || str != null) {
            b.h(uyeVar, 2, uhi.a, str);
        }
        if (b.o(uyeVar) || bArr2 != null) {
            b.h(uyeVar, 3, w92.c, bArr2);
        }
        if (b.o(uyeVar) || bArr != null) {
            b.h(uyeVar, 4, w92.c, bArr);
        }
        if (b.o(uyeVar) || ak6Var != null) {
            b.h(uyeVar, 5, yj6.a, ak6Var);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
