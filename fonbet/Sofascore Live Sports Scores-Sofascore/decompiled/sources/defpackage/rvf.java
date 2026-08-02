package defpackage;

import com.inmobi.sdk.InMobiSdk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rvf implements iw8 {
    public static final rvf a;
    private static final /* synthetic */ uye descriptor;

    static {
        rvf rvfVar = new rvf();
        a = rvfVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Regs.Extension", rvfVar, 4);
        uyeVar.j(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        uyeVar.j("us_privacy", true);
        uyeVar.j("gpp", true);
        uyeVar.j("gpp_sid", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(qb2.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Byte b2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                b2 = (Byte) b.i(uyeVar, 0, qb2.a, b2);
                i |= 1;
            } else if (o == 1) {
                str = (String) b.i(uyeVar, 1, uhi.a, str);
                i |= 2;
            } else if (o == 2) {
                str2 = (String) b.i(uyeVar, 2, uhi.a, str2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                str3 = (String) b.i(uyeVar, 3, uhi.a, str3);
                i |= 8;
            }
        }
        b.c(uyeVar);
        tvf tvfVar = new tvf();
        if ((i & 1) == 0) {
            tvfVar.a = null;
        } else {
            tvfVar.a = b2;
        }
        if ((i & 2) == 0) {
            tvfVar.b = null;
        } else {
            tvfVar.b = str;
        }
        if ((i & 4) == 0) {
            tvfVar.c = null;
        } else {
            tvfVar.c = str2;
        }
        if ((i & 8) == 0) {
            tvfVar.d = null;
            return tvfVar;
        }
        tvfVar.d = str3;
        return tvfVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tvf tvfVar = (tvf) obj;
        encoder.getClass();
        tvfVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || tvfVar.a != null) {
            b.h(uyeVar, 0, qb2.a, tvfVar.a);
        }
        if (b.o(uyeVar) || tvfVar.b != null) {
            b.h(uyeVar, 1, uhi.a, tvfVar.b);
        }
        if (b.o(uyeVar) || tvfVar.c != null) {
            b.h(uyeVar, 2, uhi.a, tvfVar.c);
        }
        if (b.o(uyeVar) || tvfVar.d != null) {
            b.h(uyeVar, 3, uhi.a, tvfVar.d);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
