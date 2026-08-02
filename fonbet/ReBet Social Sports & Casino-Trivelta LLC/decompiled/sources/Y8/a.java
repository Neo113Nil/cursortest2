package Y8;

import com.giphy.sdk.ui.GPHContentType;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14086a = new a();

    public final GPHContentType a(String str) {
        GPHContentType gPHContentType;
        if (str == null) {
            return GPHContentType.gif;
        }
        GPHContentType[] values = GPHContentType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                gPHContentType = null;
                break;
            }
            gPHContentType = values[i10];
            String name = gPHContentType.name();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(name, lowerCase)) {
                break;
            }
            i10++;
        }
        return gPHContentType == null ? GPHContentType.gif : gPHContentType;
    }
}
