package defpackage;

import com.ironsource.Lb;
import com.ironsource.Sb;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class arg implements l.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ arg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.b
    public final void a(Lb lb) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Sb.a((Sb) obj, lb);
                break;
            default:
                ((e) obj).a(lb);
                break;
        }
    }
}
