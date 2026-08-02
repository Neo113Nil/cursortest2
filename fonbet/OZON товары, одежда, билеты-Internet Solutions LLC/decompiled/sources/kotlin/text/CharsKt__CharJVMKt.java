package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i11) {
        if (2 <= i11 && i11 < 37) {
            return i11;
        }
        StringBuilder f7 = P4.f.f(i11, "radix ", " was not in valid range ");
        f7.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(f7.toString());
    }
}
