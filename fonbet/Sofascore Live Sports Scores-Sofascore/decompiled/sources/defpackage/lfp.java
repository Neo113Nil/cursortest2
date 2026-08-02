package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lfp extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        ArrayList arrayList = new ArrayList();
        e7nVar.zza();
        while (e7nVar.a0()) {
            try {
                arrayList.add(Integer.valueOf(e7nVar.u0()));
            } catch (NumberFormatException e) {
                throw new o9p(16, e);
            }
        }
        e7nVar.M();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.m();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            f7nVar.a0(r5.get(i));
        }
        f7nVar.n();
    }
}
