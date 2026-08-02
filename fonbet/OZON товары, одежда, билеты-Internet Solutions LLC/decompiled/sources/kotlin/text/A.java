package kotlin.text;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class A extends x {
    @NotNull
    public static final ArrayList o(@NotNull String str, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        y transform = y.f71980b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        i0.a(i11, i12);
        int length = str.length();
        int i13 = 0;
        ArrayList arrayList = new ArrayList((length / i12) + (length % i12 == 0 ? 0 : 1));
        while (i13 >= 0 && i13 < length) {
            int i14 = i13 + i11;
            if (i14 < 0 || i14 > length) {
                if (!z11) {
                    break;
                }
                i14 = length;
            }
            arrayList.add(transform.invoke(str.subSequence(i13, i14)));
            i13 += i12;
        }
        return arrayList;
    }
}
