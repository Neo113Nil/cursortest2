package a9;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1924a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1924a f15105a = new C1924a();

    public final String a(String value) {
        String valueOf;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() <= 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = value.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            valueOf = CharsKt.titlecase(charAt, locale);
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb2.append((Object) valueOf);
        String substring = value.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    public final String b(String str) {
        String a10;
        if (str == null) {
            return null;
        }
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        int i10 = 0;
        for (Object obj : split$default) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i10 == 0) {
                a10 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(a10, "toLowerCase(...)");
            } else {
                a10 = f15105a.a(str2);
            }
            arrayList.add(a10);
            i10 = i11;
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
