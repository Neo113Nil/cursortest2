package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r05 implements iw8 {
    public static final r05 a;
    private static final /* synthetic */ uye descriptor;

    static {
        r05 r05Var = new r05();
        a = r05Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Device", r05Var, 18);
        uyeVar.j(L6.d0, false);
        uyeVar.j("ifa", false);
        uyeVar.j(L6.t, false);
        uyeVar.j(L6.B, false);
        uyeVar.j("hwv", true);
        uyeVar.j(L6.F, false);
        uyeVar.j(L6.G, false);
        uyeVar.j(h.b, false);
        uyeVar.j("w", false);
        uyeVar.j("pxratio", true);
        uyeVar.j("language", true);
        uyeVar.j("devicetype", true);
        uyeVar.j(C4427z5.e, true);
        uyeVar.j("dnt", true);
        uyeVar.j("lmt", true);
        uyeVar.j("geo", true);
        uyeVar.j("ip", true);
        uyeVar.j(L6.R0, true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(c88.a);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(tw8.a);
        KSerializer W5 = l98.W(uhiVar);
        KSerializer W6 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar, uhiVar, W, uhiVar, uhiVar, a7aVar, a7aVar, W2, W3, qb2Var, qb2Var, qb2Var, qb2Var, W4, W5, W6};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        String str4 = null;
        vw8 vw8Var = null;
        String str5 = null;
        String str6 = null;
        Float f = null;
        int i2 = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    str = str8;
                    z = false;
                    str8 = str;
                case 0:
                    str = str8;
                    i2 |= 1;
                    str7 = b.n(uyeVar, 0);
                    str8 = str;
                case 1:
                    str3 = str7;
                    str8 = b.n(uyeVar, 1);
                    i2 |= 2;
                    str7 = str3;
                case 2:
                    str3 = str7;
                    str9 = b.n(uyeVar, 2);
                    i2 |= 4;
                    str7 = str3;
                case 3:
                    str3 = str7;
                    str10 = b.n(uyeVar, 3);
                    i2 |= 8;
                    str7 = str3;
                case 4:
                    str2 = str7;
                    str = str8;
                    str11 = (String) b.i(uyeVar, 4, uhi.a, str11);
                    i2 |= 16;
                    str7 = str2;
                    str8 = str;
                case 5:
                    str3 = str7;
                    str12 = b.n(uyeVar, 5);
                    i2 |= 32;
                    str7 = str3;
                case 6:
                    str3 = str7;
                    str13 = b.n(uyeVar, 6);
                    i2 |= 64;
                    str7 = str3;
                case 7:
                    str3 = str7;
                    i3 = b.l(uyeVar, 7);
                    i2 |= 128;
                    str7 = str3;
                case 8:
                    str3 = str7;
                    i4 = b.l(uyeVar, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str7 = str3;
                case 9:
                    str2 = str7;
                    str = str8;
                    f = (Float) b.i(uyeVar, 9, c88.a, f);
                    i2 |= 512;
                    str7 = str2;
                    str8 = str;
                case 10:
                    str2 = str7;
                    str = str8;
                    str5 = (String) b.i(uyeVar, 10, uhi.a, str5);
                    i2 |= 1024;
                    str7 = str2;
                    str8 = str;
                case 11:
                    str3 = str7;
                    b2 = b.A(uyeVar, 11);
                    i2 |= a.o;
                    str7 = str3;
                case 12:
                    str3 = str7;
                    b3 = b.A(uyeVar, 12);
                    i2 |= 4096;
                    str7 = str3;
                case 13:
                    str3 = str7;
                    b4 = b.A(uyeVar, 13);
                    i2 |= 8192;
                    str7 = str3;
                case 14:
                    str3 = str7;
                    b5 = b.A(uyeVar, 14);
                    i2 |= 16384;
                    str7 = str3;
                case 15:
                    str2 = str7;
                    str = str8;
                    vw8Var = (vw8) b.i(uyeVar, 15, tw8.a, vw8Var);
                    i = 32768;
                    i2 |= i;
                    str7 = str2;
                    str8 = str;
                case 16:
                    str2 = str7;
                    str = str8;
                    str4 = (String) b.i(uyeVar, 16, uhi.a, str4);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    str7 = str2;
                    str8 = str;
                case 17:
                    str2 = str7;
                    str = str8;
                    str6 = (String) b.i(uyeVar, 17, uhi.a, str6);
                    i = 131072;
                    i2 |= i;
                    str7 = str2;
                    str8 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(uyeVar);
        return new t05(i2, str7, str8, str9, str10, str11, str12, str13, i3, i4, f, str5, b2, b3, b4, b5, vw8Var, str4, str6);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t05 t05Var = (t05) obj;
        encoder.getClass();
        t05Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        String str = t05Var.a;
        String str2 = t05Var.r;
        String str3 = t05Var.q;
        vw8 vw8Var = t05Var.p;
        byte b2 = t05Var.o;
        byte b3 = t05Var.n;
        byte b4 = t05Var.l;
        b.y(uyeVar, 0, str);
        b.y(uyeVar, 1, t05Var.b);
        b.y(uyeVar, 2, t05Var.c);
        b.y(uyeVar, 3, t05Var.d);
        if (b.o(uyeVar) || t05Var.e != null) {
            b.h(uyeVar, 4, uhi.a, t05Var.e);
        }
        b.y(uyeVar, 5, t05Var.f);
        b.y(uyeVar, 6, t05Var.g);
        b.u(7, t05Var.h, uyeVar);
        b.u(8, t05Var.i, uyeVar);
        if (b.o(uyeVar) || t05Var.j != null) {
            b.h(uyeVar, 9, c88.a, t05Var.j);
        }
        if (b.o(uyeVar) || t05Var.k != null) {
            b.h(uyeVar, 10, uhi.a, t05Var.k);
        }
        if (b.o(uyeVar) || b4 != 0) {
            b.q(uyeVar, 11, b4);
        }
        if (b.o(uyeVar) || t05Var.m != 0) {
            b.q(uyeVar, 12, t05Var.m);
        }
        if (b.o(uyeVar) || b3 != 0) {
            b.q(uyeVar, 13, b3);
        }
        if (b.o(uyeVar) || b2 != 0) {
            b.q(uyeVar, 14, b2);
        }
        if (b.o(uyeVar) || vw8Var != null) {
            b.h(uyeVar, 15, tw8.a, vw8Var);
        }
        if (b.o(uyeVar) || str3 != null) {
            b.h(uyeVar, 16, uhi.a, str3);
        }
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 17, uhi.a, str2);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
