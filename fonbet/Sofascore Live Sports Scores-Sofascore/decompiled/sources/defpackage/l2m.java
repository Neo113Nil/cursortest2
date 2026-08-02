package defpackage;

import com.inmobi.media.AbstractC3349cl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3349cl b;
    public final /* synthetic */ Map c;

    public /* synthetic */ l2m(AbstractC3349cl abstractC3349cl, HashMap hashMap, int i) {
        this.a = i;
        this.b = abstractC3349cl;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Map map = this.c;
        AbstractC3349cl abstractC3349cl = this.b;
        switch (i) {
            case 0:
                AbstractC3349cl.b(abstractC3349cl, map);
                break;
            default:
                AbstractC3349cl.a(abstractC3349cl, map);
                break;
        }
    }
}
