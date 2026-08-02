package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ha9 extends f3 {
    public final List o;
    public final ArrayList p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha9(ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2);
        arrayList.getClass();
        this.o = arrayList;
        this.p = arrayList2;
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        Object obj = this.o.get(i);
        Object obj2 = this.p.get(i2);
        if ((obj instanceof r5c) && (obj2 instanceof r5c)) {
            return ((r5c) obj).a.getId() == ((r5c) obj2).a.getId();
        }
        if ((obj instanceof a6c) && (obj2 instanceof a6c)) {
            return Intrinsics.c(((a6c) obj).a.b, ((a6c) obj2).a.b);
        }
        if ((obj instanceof d6c) && (obj2 instanceof d6c)) {
            return Intrinsics.c(((d6c) obj).a, ((d6c) obj2).a);
        }
        return false;
    }

    @Override // defpackage.f3, defpackage.o02
    public final int W() {
        return this.p.size();
    }

    @Override // defpackage.f3, defpackage.o02
    public final int X() {
        return this.o.size();
    }
}
