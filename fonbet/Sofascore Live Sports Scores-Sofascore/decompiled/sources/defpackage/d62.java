package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class d62 extends ot8 implements ct8 {
    public static final d62 b = new d62(3, g62.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g62 g62Var = (g62) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g62.d;
        g62Var.getClass();
        if (obj3 == i62.l) {
            obj3 = new eo2(g62Var.p());
        }
        return new go2(obj3);
    }
}
