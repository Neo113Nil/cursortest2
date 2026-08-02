package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eyi extends f3 {
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyi(ArrayList arrayList, List list, boolean z) {
        super(arrayList, list);
        arrayList.getClass();
        this.o = z;
    }

    @Override // defpackage.f3, defpackage.o02
    public final boolean H(int i, int i2) {
        return !this.o && Intrinsics.c(this.m.get(i), this.n.get(i2));
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        qyi qyiVar = (qyi) this.m.get(i);
        qyi qyiVar2 = (qyi) this.n.get(i2);
        return qyiVar.a.getId() == qyiVar2.a.getId() && qyiVar.b.d() == qyiVar2.b.d();
    }
}
