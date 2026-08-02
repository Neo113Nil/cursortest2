package gh;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a0 {
    public static b0 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.n b10 = b0.f10117d.b(0, str);
        if (b10 == null) {
            throw new IllegalArgumentException(d9.e.e('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((kotlin.collections.t0) b10.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((kotlin.collections.t0) b10.a()).get(2)).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i5 = b10.b().f19235b;
        while (true) {
            int i10 = i5 + 1;
            if (i10 >= str.length()) {
                return new b0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kotlin.text.n b11 = b0.f10118e.b(i10, str);
            if (b11 == null) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb2.append(substring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(d9.e.k(sb2, str, '\"').toString());
            }
            kotlin.text.m mVar = b11.f19282c;
            MatchGroup a7 = mVar.a(1);
            String str3 = a7 != null ? a7.f19244a : null;
            if (str3 == null) {
                i5 = b11.b().f19235b;
            } else {
                MatchGroup a10 = mVar.a(2);
                String str4 = a10 != null ? a10.f19244a : null;
                if (str4 == null) {
                    MatchGroup a11 = mVar.a(3);
                    Intrinsics.checkNotNull(a11);
                    str4 = a11.f19244a;
                } else if (StringsKt.S(str4, '\'') && StringsKt.C(str4, '\'') && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i5 = b11.b().f19235b;
            }
        }
    }

    public static b0 b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
