package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ltc extends dy9 {
    @Override // defpackage.dy9
    public final void e(Object obj, Object obj2) {
        mtc mtcVar = (mtc) obj;
        mtcVar.getClass();
        ArrayDeque arrayDeque = mtc.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(mtcVar);
        }
    }
}
