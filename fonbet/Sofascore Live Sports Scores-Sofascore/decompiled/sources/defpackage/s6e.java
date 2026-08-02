package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s6e {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6e b;

    public /* synthetic */ s6e(u6e u6eVar, int i) {
        this.a = i;
        this.b = u6eVar;
    }

    public final void a(List list) {
        int i = this.a;
        u6e u6eVar = this.b;
        switch (i) {
            case 0:
                if (list != null && !list.isEmpty()) {
                    u6eVar.h++;
                    u6eVar.f = true;
                }
                p6e p6eVar = u6eVar.a;
                if (list == null) {
                    list = km5.a;
                }
                p6eVar.h(list);
                break;
            default:
                if (list != null && !list.isEmpty()) {
                    u6eVar.g++;
                    u6eVar.e = true;
                }
                p6e p6eVar2 = u6eVar.a;
                if (list == null) {
                    list = km5.a;
                }
                p6eVar2.c(list);
                break;
        }
    }
}
