package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q69 implements q55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q69(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.q55
    public final void d() {
        switch (this.a) {
            case 0:
                r69 r69Var = (r69) this.b;
                r69Var.c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                lsb lsbVar = (lsb) this.c;
                synchronized (xyc.b) {
                    try {
                        LinkedHashMap linkedHashMap = xyc.c;
                        xyc xycVar = (xyc) linkedHashMap.get(str);
                        if (xycVar != null) {
                            xycVar.a.remove(lsbVar);
                            if (xycVar.a.isEmpty()) {
                                linkedHashMap.remove(str);
                                xycVar.stopWatching();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
