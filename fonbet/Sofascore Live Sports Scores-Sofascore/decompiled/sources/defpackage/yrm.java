package defpackage;

import com.bytedance.sdk.component.kj.pcc.pcc;
import com.bytedance.sdk.component.utils.tsz;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yrm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ csm b;

    public /* synthetic */ yrm(csm csmVar, int i) {
        this.a = i;
        this.b = csmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qem qemVar;
        qem qemVar2;
        qem qemVar3;
        qem qemVar4;
        qem qemVar5;
        qem qemVar6;
        qem qemVar7;
        qem qemVar8;
        qem qemVar9;
        qem qemVar10;
        qem qemVar11;
        qem qemVar12;
        qem qemVar13;
        List<WeakReference> list;
        tsz tszVar;
        tsz tszVar2;
        tsz tszVar3;
        tsz tszVar4;
        tsz tszVar5;
        tsz tszVar6;
        tsz tszVar7;
        tsz tszVar8;
        tsz tszVar9;
        qem unused;
        int i = this.a;
        csm csmVar = this.b;
        switch (i) {
            case 0:
                qemVar2 = csmVar.ork;
                if (qemVar2 == null) {
                    try {
                        csmVar.ork = new pwm();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    qemVar3 = csmVar.ork;
                    if (qemVar3 != null) {
                        unused = csmVar.ork;
                        csmVar.jsj = "0";
                        qemVar4 = csmVar.ork;
                        ((pwm) qemVar4).a = csmVar;
                        qemVar5 = csmVar.ork;
                        ((pwm) qemVar5).b = csmVar;
                        qemVar6 = csmVar.ork;
                        ((pwm) qemVar6).f = csmVar;
                        qemVar7 = csmVar.ork;
                        ((pwm) qemVar7).c = csmVar;
                        qemVar8 = csmVar.ork;
                        ((pwm) qemVar8).d = csmVar;
                        qemVar9 = csmVar.ork;
                        ((pwm) qemVar9).g = csmVar;
                        qemVar10 = csmVar.ork;
                        ((pwm) qemVar10).e = csmVar;
                        try {
                            qemVar11 = csmVar.ork;
                            ((pwm) qemVar11).i.setLooping(false);
                        } catch (Throwable unused2) {
                        }
                        csmVar.vh = false;
                        break;
                    }
                }
                break;
            case 1:
                if (csmVar.qf()) {
                    qemVar12 = csmVar.ork;
                    if (qemVar12 != null) {
                        try {
                            qemVar13 = csmVar.ork;
                            ((pwm) qemVar13).i.start();
                            list = csmVar.gm;
                            for (WeakReference weakReference : list) {
                                if (weakReference != null && weakReference.get() != null) {
                                    ((gtm) weakReference.get()).vj(csmVar);
                                }
                            }
                            csmVar.gbb = 206;
                            break;
                        } catch (Throwable th2) {
                            th2.getMessage();
                            return;
                        }
                    }
                }
                break;
            case 2:
                tszVar = csmVar.dax;
                if (tszVar != null) {
                    tszVar2 = csmVar.dax;
                    tszVar2.sendEmptyMessage(101);
                    break;
                }
                break;
            case 3:
                tszVar3 = csmVar.dax;
                if (tszVar3 != null) {
                    tszVar4 = csmVar.dax;
                    tszVar4.sendEmptyMessage(101);
                    break;
                }
                break;
            case 4:
                tszVar5 = csmVar.dax;
                if (tszVar5 != null) {
                    tszVar6 = csmVar.dax;
                    tszVar6.sendEmptyMessage(104);
                    break;
                }
                break;
            case 5:
                tszVar7 = csmVar.dax;
                if (tszVar7 != null) {
                    tszVar8 = csmVar.dax;
                    if (tszVar8.getLooper() != null) {
                        try {
                            pcc pcc = pcc.pcc();
                            tszVar9 = csmVar.dax;
                            pcc.pcc(tszVar9);
                            csmVar.dax = null;
                            break;
                        } catch (Throwable unused3) {
                            return;
                        }
                    }
                }
                break;
            default:
                try {
                    qemVar = csmVar.ork;
                    ((pwm) qemVar).i.pause();
                    csmVar.gbb = 207;
                    csmVar.mu = false;
                    break;
                } catch (Throwable unused4) {
                    return;
                }
        }
    }
}
