package defpackage;

import androidx.core.app.NotificationCompat;
import com.adsbynimbus.render.mraid.Host;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nf9 implements iw8 {
    public static final nf9 a;
    private static final /* synthetic */ uye descriptor;

    static {
        nf9 nf9Var = new nf9();
        a = nf9Var;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.Host", nf9Var, 13);
        uyeVar.j("CurrentAppOrientation", false);
        uyeVar.j("CurrentPosition", false);
        uyeVar.j(U3.i.o, false);
        uyeVar.j("PlacementType", false);
        uyeVar.j("MaxSize", false);
        uyeVar.j("ScreenSize", false);
        uyeVar.j("OrientationProperties", true);
        uyeVar.j("ResizeProperties", true);
        uyeVar.j("DefaultPosition", false);
        uyeVar.j("State", false);
        uyeVar.j("ExpandProperties", false);
        uyeVar.j("supports", false);
        uyeVar.j("Version", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Host.$childSerializers;
        h2f h2fVar = h2f.a;
        uhi uhiVar = uhi.a;
        gjh gjhVar = gjh.a;
        return new KSerializer[]{ge0.a, h2fVar, gz1.a, uhiVar, gjhVar, gjhVar, l98.W(kwd.a), l98.W(y0g.a), h2fVar, uhiVar, uh6.a, joaVarArr[11].getValue(), uhiVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        joa[] joaVarArr3;
        boolean z;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joaVarArr = Host.$childSerializers;
        Map map = null;
        wh6 wh6Var = null;
        l2f l2fVar = null;
        boolean z2 = true;
        a1g a1gVar = null;
        int i = 0;
        ie0 ie0Var = null;
        l2f l2fVar2 = null;
        boolean z3 = false;
        String str = null;
        ljh ljhVar = null;
        ljh ljhVar2 = null;
        mwd mwdVar = null;
        String str2 = null;
        String str3 = null;
        while (z2) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z2 = false;
                case 0:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    ie0Var = (ie0) b.w(uyeVar, 0, ge0.a, ie0Var);
                    i |= 1;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 1:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    l2fVar2 = (l2f) b.w(uyeVar, 1, h2f.a, l2fVar2);
                    i |= 2;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z3 = b.B(uyeVar, 2);
                    i |= 4;
                    joaVarArr = joaVarArr2;
                case 3:
                    joaVarArr2 = joaVarArr;
                    str = b.n(uyeVar, 3);
                    i |= 8;
                    joaVarArr = joaVarArr2;
                case 4:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    ljhVar = (ljh) b.w(uyeVar, 4, gjh.a, ljhVar);
                    i |= 16;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 5:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    ljhVar2 = (ljh) b.w(uyeVar, 5, gjh.a, ljhVar2);
                    i |= 32;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 6:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    mwdVar = (mwd) b.i(uyeVar, 6, kwd.a, mwdVar);
                    i |= 64;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 7:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    a1gVar = (a1g) b.i(uyeVar, 7, y0g.a, a1gVar);
                    i |= 128;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 8:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    l2fVar = (l2f) b.w(uyeVar, 8, h2f.a, l2fVar);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 9:
                    joaVarArr2 = joaVarArr;
                    str2 = b.n(uyeVar, 9);
                    i |= 512;
                    joaVarArr = joaVarArr2;
                case 10:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    wh6Var = (wh6) b.w(uyeVar, 10, uh6.a, wh6Var);
                    i |= 1024;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 11:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    map = (Map) b.w(uyeVar, 11, (dy4) joaVarArr3[11].getValue(), map);
                    i |= a.o;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 12:
                    joaVarArr2 = joaVarArr;
                    str3 = b.n(uyeVar, 12);
                    i |= 4096;
                    joaVarArr = joaVarArr2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(uyeVar);
        return new Host(i, ie0Var, l2fVar2, z3, str, ljhVar, ljhVar2, mwdVar, a1gVar, l2fVar, str2, wh6Var, map, str3, (t5h) null);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Host host = (Host) obj;
        encoder.getClass();
        host.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        Host.write$Self$static_release(host, b, uyeVar);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
