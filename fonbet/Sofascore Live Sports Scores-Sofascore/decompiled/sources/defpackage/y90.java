package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.Fb;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y90 implements iw8 {
    public static final y90 a;
    private static final /* synthetic */ uye descriptor;

    static {
        y90 y90Var = new y90();
        a = y90Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.App", y90Var, 12);
        uyeVar.j("name", true);
        uyeVar.j("bundle", true);
        uyeVar.j(U3.j.D, true);
        uyeVar.j("storeurl", true);
        uyeVar.j("ver", true);
        uyeVar.j("keywords", true);
        uyeVar.j("cat", true);
        uyeVar.j("sectioncat", true);
        uyeVar.j("pagecat", true);
        uyeVar.j("privacypolicy", true);
        uyeVar.j("paid", true);
        uyeVar.j(Fb.b, true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = ja0.m;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W(uhiVar);
        KSerializer W6 = l98.W(uhiVar);
        KSerializer W7 = l98.W((KSerializer) joaVarArr[6].getValue());
        KSerializer W8 = l98.W((KSerializer) joaVarArr[7].getValue());
        KSerializer W9 = l98.W((KSerializer) joaVarArr[8].getValue());
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, W8, W9, l98.W(qb2Var), l98.W(qb2Var), l98.W(ugf.a)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Byte, java.lang.String, java.lang.String[], ygf] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        ?? r1;
        boolean z;
        String str;
        ygf ygfVar;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = ja0.m;
        ygf ygfVar2 = null;
        Byte b2 = null;
        Byte b3 = null;
        String[] strArr = null;
        boolean z2 = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (z2) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    ygfVar = ygfVar2;
                    z2 = false;
                    ygfVar2 = ygfVar;
                case 0:
                    ygfVar = ygfVar2;
                    str2 = (String) b.i(uyeVar, 0, uhi.a, str2);
                    i |= 1;
                    z2 = z2;
                    ygfVar2 = ygfVar;
                case 1:
                    z = z2;
                    str = str2;
                    str3 = (String) b.i(uyeVar, 1, uhi.a, str3);
                    i |= 2;
                    z2 = z;
                    str2 = str;
                case 2:
                    z = z2;
                    str = str2;
                    str4 = (String) b.i(uyeVar, 2, uhi.a, str4);
                    i |= 4;
                    z2 = z;
                    str2 = str;
                case 3:
                    z = z2;
                    str = str2;
                    str5 = (String) b.i(uyeVar, 3, uhi.a, str5);
                    i |= 8;
                    z2 = z;
                    str2 = str;
                case 4:
                    z = z2;
                    str = str2;
                    str6 = (String) b.i(uyeVar, 4, uhi.a, str6);
                    i |= 16;
                    z2 = z;
                    str2 = str;
                case 5:
                    z = z2;
                    str = str2;
                    str7 = (String) b.i(uyeVar, 5, uhi.a, str7);
                    i |= 32;
                    z2 = z;
                    str2 = str;
                case 6:
                    z = z2;
                    str = str2;
                    strArr2 = (String[]) b.i(uyeVar, 6, (dy4) joaVarArr[6].getValue(), strArr2);
                    i |= 64;
                    z2 = z;
                    str2 = str;
                case 7:
                    z = z2;
                    str = str2;
                    strArr3 = (String[]) b.i(uyeVar, 7, (dy4) joaVarArr[7].getValue(), strArr3);
                    i |= 128;
                    z2 = z;
                    str2 = str;
                case 8:
                    z = z2;
                    str = str2;
                    strArr = (String[]) b.i(uyeVar, 8, (dy4) joaVarArr[8].getValue(), strArr);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z2 = z;
                    str2 = str;
                case 9:
                    z = z2;
                    str = str2;
                    b3 = (Byte) b.i(uyeVar, 9, qb2.a, b3);
                    i |= 512;
                    z2 = z;
                    str2 = str;
                case 10:
                    z = z2;
                    str = str2;
                    b2 = (Byte) b.i(uyeVar, 10, qb2.a, b2);
                    i |= 1024;
                    z2 = z;
                    str2 = str;
                case 11:
                    z = z2;
                    str = str2;
                    ygfVar2 = (ygf) b.i(uyeVar, 11, ugf.a, ygfVar2);
                    i |= a.o;
                    z2 = z;
                    str2 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        ygf ygfVar3 = ygfVar2;
        b.c(uyeVar);
        ja0 ja0Var = new ja0();
        if ((i & 1) == 0) {
            r1 = 0;
            ja0Var.a = null;
        } else {
            r1 = 0;
            ja0Var.a = str2;
        }
        if ((i & 2) == 0) {
            ja0Var.b = r1;
        } else {
            ja0Var.b = str3;
        }
        if ((i & 4) == 0) {
            ja0Var.c = r1;
        } else {
            ja0Var.c = str4;
        }
        if ((i & 8) == 0) {
            ja0Var.d = r1;
        } else {
            ja0Var.d = str5;
        }
        if ((i & 16) == 0) {
            ja0Var.e = r1;
        } else {
            ja0Var.e = str6;
        }
        if ((i & 32) == 0) {
            ja0Var.f = r1;
        } else {
            ja0Var.f = str7;
        }
        if ((i & 64) == 0) {
            ja0Var.g = r1;
        } else {
            ja0Var.g = strArr2;
        }
        if ((i & 128) == 0) {
            ja0Var.h = r1;
        } else {
            ja0Var.h = strArr3;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            ja0Var.i = r1;
        } else {
            ja0Var.i = strArr;
        }
        if ((i & 512) == 0) {
            ja0Var.j = r1;
        } else {
            ja0Var.j = b3;
        }
        if ((i & 1024) == 0) {
            ja0Var.k = r1;
        } else {
            ja0Var.k = b2;
        }
        if ((i & a.o) == 0) {
            ja0Var.l = r1;
            return ja0Var;
        }
        ja0Var.l = ygfVar3;
        return ja0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        joa[] joaVarArr;
        ja0 ja0Var = (ja0) obj;
        encoder.getClass();
        ja0Var.getClass();
        ygf ygfVar = ja0Var.l;
        Byte b = ja0Var.k;
        Byte b2 = ja0Var.j;
        String[] strArr = ja0Var.i;
        String[] strArr2 = ja0Var.h;
        String[] strArr3 = ja0Var.g;
        String str = ja0Var.f;
        String str2 = ja0Var.d;
        String str3 = ja0Var.c;
        String str4 = ja0Var.b;
        String str5 = ja0Var.a;
        uye uyeVar = descriptor;
        wf3 b3 = encoder.b(uyeVar);
        joa[] joaVarArr2 = ja0.m;
        if (!b3.o(uyeVar) && str5 == null) {
            joaVarArr = joaVarArr2;
        } else {
            joaVarArr = joaVarArr2;
            b3.h(uyeVar, 0, uhi.a, str5);
        }
        if (b3.o(uyeVar) || str4 != null) {
            b3.h(uyeVar, 1, uhi.a, str4);
        }
        if (b3.o(uyeVar) || str3 != null) {
            b3.h(uyeVar, 2, uhi.a, str3);
        }
        if (b3.o(uyeVar) || str2 != null) {
            b3.h(uyeVar, 3, uhi.a, str2);
        }
        if (b3.o(uyeVar) || ja0Var.e != null) {
            b3.h(uyeVar, 4, uhi.a, ja0Var.e);
        }
        if (b3.o(uyeVar) || str != null) {
            b3.h(uyeVar, 5, uhi.a, str);
        }
        if (b3.o(uyeVar) || strArr3 != null) {
            b3.h(uyeVar, 6, (KSerializer) joaVarArr[6].getValue(), strArr3);
        }
        if (b3.o(uyeVar) || strArr2 != null) {
            b3.h(uyeVar, 7, (KSerializer) joaVarArr[7].getValue(), strArr2);
        }
        if (b3.o(uyeVar) || strArr != null) {
            b3.h(uyeVar, 8, (KSerializer) joaVarArr[8].getValue(), strArr);
        }
        if (b3.o(uyeVar) || b2 != null) {
            b3.h(uyeVar, 9, qb2.a, b2);
        }
        if (b3.o(uyeVar) || b != null) {
            b3.h(uyeVar, 10, qb2.a, b);
        }
        if (b3.o(uyeVar) || ygfVar != null) {
            b3.h(uyeVar, 11, ugf.a, ygfVar);
        }
        b3.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
