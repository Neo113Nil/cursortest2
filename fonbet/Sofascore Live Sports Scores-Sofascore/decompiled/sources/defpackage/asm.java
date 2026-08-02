package defpackage;

import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class asm implements Runnable {
    public long a;
    public boolean b;
    public final /* synthetic */ gm c;

    public asm(gm gmVar) {
        this.c = gmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qem qemVar;
        qem qemVar2;
        long j;
        tsz tszVar;
        tsz tszVar2;
        long unused;
        gm gmVar = this.c;
        qemVar = ((csm) gmVar).ork;
        if (qemVar != null) {
            try {
                if (!this.b) {
                    qemVar2 = ((csm) gmVar).ork;
                    pwm pwmVar = (pwm) qemVar2;
                    pwmVar.getClass();
                    try {
                        j = pwmVar.i.getCurrentPosition();
                    } catch (Throwable unused2) {
                        j = 0;
                    }
                    ((csm) gmVar).jr = Math.max(this.a, j);
                }
                unused = ((csm) gmVar).jr;
            } catch (Throwable th) {
                th.toString();
            }
        }
        tszVar = ((csm) gmVar).dax;
        if (tszVar != null) {
            tszVar2 = ((csm) gmVar).dax;
            tszVar2.sendEmptyMessageDelayed(100, 0L);
        }
    }
}
