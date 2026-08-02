package Qc;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f9631a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9632b = new LinkedHashMap();

    public final int a(Context context, String str, String str2) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String replace$default = StringsKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null);
        String str3 = str2 + "/" + replace$default;
        synchronized (this) {
            Map map = f9632b;
            Integer num = (Integer) map.get(str3);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(replace$default, str2, context.getPackageName());
            map.put(str3, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        StringsKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null);
        int a10 = a(context, name, "drawable");
        if (a10 != 0) {
            return Uri.parse("res:/" + a10);
        }
        int a11 = a(context, name, "raw");
        if (a11 != 0) {
            return Uri.parse("res:/" + a11);
        }
        if (!StringsKt.startsWith$default(name, "asset:/", false, 2, (Object) null)) {
            return Uri.parse("file:///android_asset/" + name);
        }
        return Uri.parse("file:///android_asset/" + StringsKt.removePrefix(name, (CharSequence) "asset:/"));
    }
}
