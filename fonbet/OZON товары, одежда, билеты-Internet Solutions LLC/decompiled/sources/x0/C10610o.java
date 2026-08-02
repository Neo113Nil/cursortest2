package x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import x0.C10583L;

/* renamed from: x0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10610o {
    @NotNull
    public static final List<Integer> a(@NotNull InterfaceC10620y interfaceC10620y, @NotNull C10583L c10583l, @NotNull C10606k c10606k) {
        IntRange intRange;
        if (!c10606k.d() && c10583l.isEmpty()) {
            return kotlin.collections.K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        if (c10606k.d()) {
            intRange = new IntRange(c10606k.c(), Math.min(c10606k.b(), interfaceC10620y.getItemCount() - 1), 1);
        } else {
            IntRange.INSTANCE.getClass();
            intRange = IntRange.f71831f;
        }
        int size = c10583l.size();
        for (int i11 = 0; i11 < size; i11++) {
            C10583L.a aVar = (C10583L.a) c10583l.get(i11);
            int a11 = C10621z.a(aVar.getIndex(), aVar.getKey(), interfaceC10620y);
            int f71842a = intRange.getF71842a();
            if ((a11 > intRange.getF71843b() || f71842a > a11) && a11 >= 0 && a11 < interfaceC10620y.getItemCount()) {
                arrayList.add(Integer.valueOf(a11));
            }
        }
        int f71842a2 = intRange.getF71842a();
        int f71843b = intRange.getF71843b();
        if (f71842a2 <= f71843b) {
            while (true) {
                arrayList.add(Integer.valueOf(f71842a2));
                if (f71842a2 == f71843b) {
                    break;
                }
                f71842a2++;
            }
        }
        return arrayList;
    }
}
