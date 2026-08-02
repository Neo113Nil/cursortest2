package Y8;

import com.giphy.sdk.core.models.enums.RatingType;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14088a = new c();

    public final RatingType a(String str) {
        if (str != null) {
            RatingType[] values = RatingType.values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                RatingType ratingType = values[i10];
                String name = ratingType.name();
                String str2 = str;
                String lowerCase = StringsKt.replace$default(str2, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(name, lowerCase)) {
                    return ratingType;
                }
                i10++;
                str = str2;
            }
        }
        return null;
    }
}
