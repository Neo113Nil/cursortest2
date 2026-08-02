package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qv1 implements iw8 {
    public static final qv1 a;
    private static final /* synthetic */ uye descriptor;

    static {
        qv1 qv1Var = new qv1();
        a = qv1Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.response.BidResponse", qv1Var, 19);
        uyeVar.j("type", false);
        uyeVar.j("auction_id", false);
        uyeVar.j("adomain", true);
        uyeVar.j("bid_in_cents", true);
        uyeVar.j("bid_raw", true);
        uyeVar.j("content_type", true);
        uyeVar.j("crid", true);
        uyeVar.j("height", true);
        uyeVar.j("width", true);
        uyeVar.j("is_interstitial", true);
        uyeVar.j("markup", false);
        uyeVar.j("network", true);
        uyeVar.j(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, true);
        uyeVar.j("is_mraid", true);
        uyeVar.j("position", false);
        uyeVar.j("trackers", true);
        uyeVar.j(IronSourceConstants.EVENTS_DURATION, true);
        uyeVar.j("exp", true);
        uyeVar.j("external_notifications", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = sv1.t;
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{uhiVar, uhiVar, l98.W((KSerializer) joaVarArr[2].getValue()), a7aVar, c88.a, l98.W(uhiVar), l98.W(uhiVar), a7aVar, a7aVar, qb2Var, uhiVar, uhiVar, l98.W(uhiVar), qb2Var, uhiVar, joaVarArr[15].getValue(), a7aVar, a7aVar, joaVarArr[18].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        joa[] joaVarArr;
        int i;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr2 = sv1.t;
        float f = 0.0f;
        Map map = null;
        Map map2 = null;
        boolean z = true;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        int i4 = 0;
        int i5 = 0;
        byte b2 = 0;
        String str6 = null;
        String str7 = null;
        byte b3 = 0;
        String str8 = null;
        int i6 = 0;
        int i7 = 0;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    joaVarArr = joaVarArr2;
                    z = false;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 0:
                    joaVarArr = joaVarArr2;
                    str2 = b.n(uyeVar, 0);
                    i2 |= 1;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 1:
                    joaVarArr = joaVarArr2;
                    str3 = b.n(uyeVar, 1);
                    i2 |= 2;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 2:
                    joaVarArr = joaVarArr2;
                    strArr = (String[]) b.i(uyeVar, 2, (dy4) joaVarArr[2].getValue(), strArr);
                    i2 |= 4;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 3:
                    joaVarArr = joaVarArr2;
                    i3 = b.l(uyeVar, 3);
                    i2 |= 8;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 4:
                    joaVarArr = joaVarArr2;
                    f = b.s(uyeVar, 4);
                    i2 |= 16;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 5:
                    joaVarArr = joaVarArr2;
                    str4 = (String) b.i(uyeVar, 5, uhi.a, str4);
                    i2 |= 32;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 6:
                    joaVarArr = joaVarArr2;
                    str5 = (String) b.i(uyeVar, 6, uhi.a, str5);
                    i2 |= 64;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 7:
                    joaVarArr = joaVarArr2;
                    i4 = b.l(uyeVar, 7);
                    i2 |= 128;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 8:
                    joaVarArr = joaVarArr2;
                    i5 = b.l(uyeVar, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 9:
                    joaVarArr = joaVarArr2;
                    b2 = b.A(uyeVar, 9);
                    i2 |= 512;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 10:
                    joaVarArr = joaVarArr2;
                    str6 = b.n(uyeVar, 10);
                    i2 |= 1024;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 11:
                    joaVarArr = joaVarArr2;
                    str7 = b.n(uyeVar, 11);
                    i2 |= a.o;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 12:
                    joaVarArr = joaVarArr2;
                    str = (String) b.i(uyeVar, 12, uhi.a, str);
                    i2 |= 4096;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 13:
                    joaVarArr = joaVarArr2;
                    b3 = b.A(uyeVar, 13);
                    i2 |= 8192;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 14:
                    joaVarArr = joaVarArr2;
                    str8 = b.n(uyeVar, 14);
                    i2 |= 16384;
                    continue;
                    joaVarArr2 = joaVarArr;
                case 15:
                    joaVarArr = joaVarArr2;
                    map2 = (Map) b.w(uyeVar, 15, (dy4) joaVarArr[15].getValue(), map2);
                    i = 32768;
                    break;
                case 16:
                    joaVarArr = joaVarArr2;
                    i6 = b.l(uyeVar, 16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    break;
                case 17:
                    joaVarArr = joaVarArr2;
                    i7 = b.l(uyeVar, 17);
                    i = 131072;
                    break;
                case 18:
                    joaVarArr = joaVarArr2;
                    map = (Map) b.w(uyeVar, 18, (dy4) joaVarArr2[18].getValue(), map);
                    i = 262144;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            i2 |= i;
            joaVarArr2 = joaVarArr;
        }
        b.c(uyeVar);
        return new sv1(i2, str2, str3, strArr, i3, f, str4, str5, i4, i5, b2, str6, str7, str, b3, str8, map2, i6, i7, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v20 int, still in use, count: 2, list:
          (r3v20 int) from 0x0142: IF  (r3v20 int) != (-1 int)  -> B:46:0x0144 A[HIDDEN] (LINE:323)
          (r3v20 int) from 0x0144: PHI (r3v24 int) = (r3v20 int) binds: [B:57:0x0142] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv1.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
