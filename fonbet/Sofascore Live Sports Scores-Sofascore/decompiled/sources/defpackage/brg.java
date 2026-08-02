package defpackage;

import com.ironsource.Sb;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class brg implements l.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ brg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Sb.a((Sb) obj, aVar);
                break;
            case 1:
                Sb.b((Sb) obj, aVar);
                break;
            default:
                ((e) obj).a(aVar);
                break;
        }
    }
}
