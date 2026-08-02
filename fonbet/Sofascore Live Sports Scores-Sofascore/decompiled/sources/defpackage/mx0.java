package defpackage;

import com.ironsource.Ba;
import com.ironsource.J2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class mx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ba b;
    public final /* synthetic */ J2 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ mx0(Ba ba, J2 j2, Long l, int i) {
        this.a = i;
        this.b = ba;
        this.c = j2;
        this.d = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Long l = this.d;
        J2 j2 = this.c;
        Ba ba = this.b;
        switch (i) {
            case 0:
                Ba.a(ba, j2, l);
                break;
            default:
                Ba.d.a(ba, j2, l);
                break;
        }
    }
}
