package gh;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w {
    public static Headers a(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(namesAndValues, namesAndValues.length);
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (strArr[i10] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i10] = StringsKt.Z(inputNamesAndValues[i10]).toString();
        }
        int a7 = of.c.a(0, strArr.length - 1, 2);
        if (a7 >= 0) {
            while (true) {
                String str = strArr[i5];
                String str2 = strArr[i5 + 1];
                y4.a.w(str);
                y4.a.x(str2, str);
                if (i5 == a7) {
                    break;
                }
                i5 += 2;
            }
        }
        return new Headers(strArr);
    }
}
