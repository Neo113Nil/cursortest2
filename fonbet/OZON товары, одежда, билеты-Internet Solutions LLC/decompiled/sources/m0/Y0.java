package m0;

import java.util.ArrayList;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Y0 implements InterfaceC8019v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f73646a;

    Y0(float f7, float f11, AbstractC8015t abstractC8015t) {
        IntRange o11 = kotlin.ranges.h.o(0, abstractC8015t.b());
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        C7665d it = o11.iterator();
        while (it.hasNext()) {
            arrayList.add(new J(f7, f11, abstractC8015t.a(it.b())));
        }
        this.f73646a = arrayList;
    }

    @Override // m0.InterfaceC8019v
    public final I get(int i11) {
        return (J) this.f73646a.get(i11);
    }
}
