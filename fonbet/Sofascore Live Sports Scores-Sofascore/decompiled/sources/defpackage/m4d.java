package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m4d implements BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ m4d(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                x4d x4dVar = (x4d) obj2;
                ConcurrentHashMap concurrentHashMap = x4dVar.m;
                ConcurrentHashMap concurrentHashMap2 = x4dVar.l;
                x4dVar.j.set(false);
                x4dVar.h.b();
                Future future = x4dVar.i;
                if (future != null) {
                    try {
                        if (!future.isCancelled()) {
                            x4dVar.i.cancel(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                concurrentHashMap2.clear();
                concurrentHashMap.clear();
                x4dVar.n.clear();
                x4dVar.o.clear();
                break;
            case 1:
                final x4d x4dVar2 = (x4d) obj2;
                if (x4dVar2.g.get() == null) {
                    x4dVar2.l.forEach(new BiConsumer() { // from class: w4d
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj3, Object obj4) {
                            int i3 = i2;
                            x4d x4dVar3 = x4dVar2;
                            String str = (String) obj3;
                            u5d u5dVar = (u5d) obj4;
                            switch (i3) {
                                case 0:
                                    x4dVar3.a.P0(u5dVar.i, str, true);
                                    break;
                                default:
                                    x4dVar3.a.P0(str, u5dVar.h, true);
                                    break;
                            }
                        }
                    });
                    x4dVar2.m.forEach(new BiConsumer() { // from class: w4d
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj3, Object obj4) {
                            int i3 = i;
                            x4d x4dVar3 = x4dVar2;
                            String str = (String) obj3;
                            u5d u5dVar = (u5d) obj4;
                            switch (i3) {
                                case 0:
                                    x4dVar3.a.P0(u5dVar.i, str, true);
                                    break;
                                default:
                                    x4dVar3.a.P0(str, u5dVar.h, true);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                u5d u5dVar = (u5d) obj2;
                bo3 bo3Var = u5dVar.k;
                if (bo3Var != null) {
                    bo3Var.b();
                }
                u5dVar.j = null;
                u5dVar.k = null;
                break;
        }
    }
}
