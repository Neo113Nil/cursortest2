package defpackage;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class od9 extends hpg {
    public final Map J;
    public DrmInitData K;

    public od9(l2a l2aVar, kc5 kc5Var, cc5 cc5Var, Map map) {
        super(l2aVar, kc5Var, cc5Var);
        this.J = map;
    }

    @Override // defpackage.hpg
    public final b q(b bVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.K;
        if (drmInitData2 == null) {
            drmInitData2 = bVar.s;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.J.get(drmInitData2.c)) != null) {
            drmInitData2 = drmInitData;
        }
        ric ricVar = bVar.l;
        ric ricVar2 = null;
        if (ricVar != null) {
            lic[] licVarArr = ricVar.a;
            int length = licVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                lic licVar = licVarArr[i2];
                if ((licVar instanceof o7f) && "com.apple.streaming.transportStreamTimestamp".equals(((o7f) licVar).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    lic[] licVarArr2 = new lic[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            licVarArr2[i < i2 ? i : i - 1] = licVarArr[i];
                        }
                        i++;
                    }
                    ricVar2 = new ric(licVarArr2);
                }
            }
            if (drmInitData2 == bVar.s || ricVar != bVar.l) {
                qm8 a = bVar.a();
                a.r = drmInitData2;
                a.k = ricVar;
                bVar = new b(a);
            }
            return super.q(bVar);
        }
        ricVar = ricVar2;
        if (drmInitData2 == bVar.s) {
        }
        qm8 a2 = bVar.a();
        a2.r = drmInitData2;
        a2.k = ricVar;
        bVar = new b(a2);
        return super.q(bVar);
    }
}
