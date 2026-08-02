package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class hfg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfg b;

    public /* synthetic */ hfg(tfg tfgVar, int i) {
        this.a = i;
        this.b = tfgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        tfg tfgVar = this.b;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 1;
        switch (i) {
            case 0:
                xag xagVar = tfgVar.z;
                if (xagVar != null) {
                    hs4 hs4Var = z45.a;
                    xw3.L(s9a.c(rob.a), null, null, new nfg(xagVar, tfgVar, rq3Var, i2), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                xag xagVar2 = tfgVar.z;
                if (xagVar2 != null) {
                    hs4 hs4Var2 = z45.a;
                    xw3.L(s9a.c(rob.a), null, null, new nfg(xagVar2, tfgVar, rq3Var, i3), 3);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 2:
                xag xagVar3 = tfgVar.z;
                if (xagVar3 != null) {
                    hs4 hs4Var3 = z45.a;
                    xw3.L(s9a.c(rob.a), null, null, new nfg(xagVar3, tfgVar, rq3Var, z ? 1 : 0), 3);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                xag xagVar4 = tfgVar.z;
                if (xagVar4 != null) {
                    kig kigVar = kig.SKIP;
                    ExoPlayer exoPlayer = tfgVar.v;
                    if (exoPlayer == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    ((zag) xagVar4).i(kigVar, ((vg6) exoPlayer).getCurrentPosition());
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(tfgVar.M == jfg.b);
        }
    }
}
