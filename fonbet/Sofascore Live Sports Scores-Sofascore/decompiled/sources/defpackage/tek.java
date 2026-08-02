package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tek implements iw8 {
    public static final tek a;
    private static final /* synthetic */ uye descriptor;

    static {
        tek tekVar = new tek();
        a = tekVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.User.Extension", tekVar, 10);
        uyeVar.j(U3.j.b0, true);
        uyeVar.j("admob_gde_signals", true);
        uyeVar.j("facebook_buyeruid", true);
        uyeVar.j("inmobi_buyeruid", true);
        uyeVar.j("unity_buyeruid", true);
        uyeVar.j("vungle_buyeruid", true);
        uyeVar.j("eids", true);
        uyeVar.j("mfx_buyerdata", true);
        uyeVar.j("mintegral_sdk", true);
        uyeVar.j("moloco_buyeruid", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = vek.k;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W(uhiVar)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String, java.util.Map, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        ?? r1;
        joa[] joaVarArr;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr2 = vek.k;
        String str = null;
        Map map = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Set set = null;
        Map map2 = null;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    joaVarArr = joaVarArr2;
                    str2 = (String) b.i(uyeVar, 0, uhi.a, str2);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr = joaVarArr2;
                    str3 = (String) b.i(uyeVar, 1, uhi.a, str3);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr = joaVarArr2;
                    str4 = (String) b.i(uyeVar, 2, uhi.a, str4);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr = joaVarArr2;
                    str5 = (String) b.i(uyeVar, 3, uhi.a, str5);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr = joaVarArr2;
                    str6 = (String) b.i(uyeVar, 4, uhi.a, str6);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr = joaVarArr2;
                    str7 = (String) b.i(uyeVar, 5, uhi.a, str7);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr = joaVarArr2;
                    set = (Set) b.i(uyeVar, 6, (dy4) joaVarArr[6].getValue(), set);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr = joaVarArr2;
                    map2 = (Map) b.i(uyeVar, 7, (dy4) joaVarArr[7].getValue(), map2);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr = joaVarArr2;
                    map = (Map) b.i(uyeVar, 8, (dy4) joaVarArr[8].getValue(), map);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr = joaVarArr2;
                    str = (String) b.i(uyeVar, 9, uhi.a, str);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr2 = joaVarArr;
        }
        b.c(uyeVar);
        vek vekVar = new vek();
        if ((i & 1) == 0) {
            r1 = 0;
            vekVar.a = null;
        } else {
            r1 = 0;
            vekVar.a = str2;
        }
        if ((i & 2) == 0) {
            vekVar.b = r1;
        } else {
            vekVar.b = str3;
        }
        if ((i & 4) == 0) {
            vekVar.c = r1;
        } else {
            vekVar.c = str4;
        }
        if ((i & 8) == 0) {
            vekVar.d = r1;
        } else {
            vekVar.d = str5;
        }
        if ((i & 16) == 0) {
            vekVar.e = r1;
        } else {
            vekVar.e = str6;
        }
        if ((i & 32) == 0) {
            vekVar.f = r1;
        } else {
            vekVar.f = str7;
        }
        if ((i & 64) == 0) {
            vekVar.g = r1;
        } else {
            vekVar.g = set;
        }
        if ((i & 128) == 0) {
            vekVar.h = r1;
        } else {
            vekVar.h = map2;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            vekVar.i = r1;
        } else {
            vekVar.i = map;
        }
        if ((i & 512) == 0) {
            vekVar.j = r1;
            return vekVar;
        }
        vekVar.j = str;
        return vekVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vek vekVar = (vek) obj;
        encoder.getClass();
        vekVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = vek.k;
        if (b.o(uyeVar) || vekVar.a != null) {
            b.h(uyeVar, 0, uhi.a, vekVar.a);
        }
        if (b.o(uyeVar) || vekVar.b != null) {
            b.h(uyeVar, 1, uhi.a, vekVar.b);
        }
        if (b.o(uyeVar) || vekVar.c != null) {
            b.h(uyeVar, 2, uhi.a, vekVar.c);
        }
        if (b.o(uyeVar) || vekVar.d != null) {
            b.h(uyeVar, 3, uhi.a, vekVar.d);
        }
        if (b.o(uyeVar) || vekVar.e != null) {
            b.h(uyeVar, 4, uhi.a, vekVar.e);
        }
        if (b.o(uyeVar) || vekVar.f != null) {
            b.h(uyeVar, 5, uhi.a, vekVar.f);
        }
        if (b.o(uyeVar) || vekVar.g != null) {
            b.h(uyeVar, 6, (KSerializer) joaVarArr[6].getValue(), vekVar.g);
        }
        if (b.o(uyeVar) || vekVar.h != null) {
            b.h(uyeVar, 7, (KSerializer) joaVarArr[7].getValue(), vekVar.h);
        }
        if (b.o(uyeVar) || vekVar.i != null) {
            b.h(uyeVar, 8, (KSerializer) joaVarArr[8].getValue(), vekVar.i);
        }
        if (b.o(uyeVar) || vekVar.j != null) {
            b.h(uyeVar, 9, uhi.a, vekVar.j);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
