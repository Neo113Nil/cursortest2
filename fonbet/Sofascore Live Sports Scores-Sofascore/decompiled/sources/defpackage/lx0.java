package defpackage;

import com.ironsource.AbstractC4031d3;
import com.ironsource.Ba;
import com.ironsource.J2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class lx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ba b;
    public final /* synthetic */ J2 c;
    public final /* synthetic */ AbstractC4031d3 d;

    public /* synthetic */ lx0(Ba ba, J2 j2, AbstractC4031d3 abstractC4031d3, int i) {
        this.a = i;
        this.b = ba;
        this.c = j2;
        this.d = abstractC4031d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AbstractC4031d3 abstractC4031d3 = this.d;
        J2 j2 = this.c;
        Ba ba = this.b;
        switch (i) {
            case 0:
                Ba.a(ba, j2, abstractC4031d3);
                break;
            default:
                Ba.d.a(ba, j2, abstractC4031d3);
                break;
        }
    }
}
