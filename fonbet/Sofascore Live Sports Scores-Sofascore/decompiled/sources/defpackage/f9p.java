package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f9p extends map {
    public final /* synthetic */ int a;
    public final Object b;

    public f9p(String[] strArr) {
        this.a = 2;
        this.b = Arrays.asList(strArr);
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) ((map) obj).read(e7nVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                e7nVar.zza();
                while (e7nVar.a0()) {
                    arrayList.add(Long.valueOf(((Number) ((map) obj).read(e7nVar)).longValue()));
                }
                e7nVar.M();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (e7nVar.Q0() == 9) {
                    e7nVar.j0();
                    return null;
                }
                e7nVar.T();
                List list = (List) obj;
                long[] jArr = new long[list.size()];
                while (e7nVar.Q0() != 4) {
                    int indexOf = list.indexOf(e7nVar.e0());
                    if (indexOf >= 0) {
                        jArr[indexOf] = e7nVar.r0();
                    } else {
                        e7nVar.E0();
                    }
                }
                e7nVar.Z();
                return new GregorianCalendar(a6n.a(jArr[0]), a6n.a(jArr[1]), a6n.a(jArr[2]), a6n.a(jArr[3]), a6n.a(jArr[4]), a6n.a(jArr[5]));
        }
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((map) obj2).write(f7nVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                f7nVar.m();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ((map) obj2).write(f7nVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                f7nVar.n();
                break;
            default:
                if (obj == null) {
                    f7nVar.f0();
                    break;
                } else {
                    f7nVar.p();
                    Calendar calendar = (Calendar) obj;
                    long[] jArr = {calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                    int i3 = 0;
                    while (true) {
                        List list = (List) obj2;
                        if (i3 >= list.size()) {
                            f7nVar.t();
                            break;
                        } else {
                            f7nVar.C((String) list.get(i3));
                            f7nVar.a0(jArr[i3]);
                            i3++;
                        }
                    }
                }
        }
    }

    public /* synthetic */ f9p(map mapVar, int i) {
        this.a = i;
        this.b = mapVar;
    }
}
