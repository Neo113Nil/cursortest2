package defpackage;

import java.util.function.BiConsumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tqb implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tqb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((mp9) obj3).invoke(obj, obj2);
                break;
            default:
                p4d p4dVar = (p4d) obj3;
                u5d u5dVar = (u5d) obj2;
                if (u5dVar.j == null && u5dVar.g.get() == null) {
                    p4dVar.P0(u5dVar.i, u5dVar.h, true);
                    break;
                }
                break;
        }
    }
}
