package F6;

import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3567a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3568b = MapsKt.mapOf(TuplesKt.to("mkv", "video/x-matroska"), TuplesKt.to("glb", "model/gltf-binary"));

    public static final String b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String a10 = f3567a.a(path);
        if (a10 == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = a10.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String a11 = b.a(lowerCase);
        return a11 == null ? (String) f3568b.get(lowerCase) : a11;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return StringsKt.startsWith$default(str, "video/", false, 2, (Object) null);
        }
        return false;
    }

    public final String a(String str) {
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0 || lastIndexOf$default == str.length() - 1) {
            return null;
        }
        String substring = str.substring(lastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
