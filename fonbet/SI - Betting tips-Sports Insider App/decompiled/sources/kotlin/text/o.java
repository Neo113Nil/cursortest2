package kotlin.text;

import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o {
    public o(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static String a(String literal) {
        Intrinsics.checkNotNullParameter(literal, "literal");
        String quote = Pattern.quote(literal);
        Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
        return quote;
    }
}
