package Me;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import og.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7650a = new a();

    public final String a(String fileName, String time) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(time, "time");
        String replace$default = StringsKt.replace$default(new Regex(":").replace(new Regex("\\)").replace(new Regex("\\(").replace(fileName, ""), ""), "-"), ' ', '_', false, 4, (Object) null);
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) replace$default, ".", 0, false, 6, (Object) null);
        if (!i.d(Integer.valueOf(lastIndexOf$default), 0)) {
            return replace$default + '_' + time;
        }
        String substring = replace$default.substring(lastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        StringBuilder sb2 = new StringBuilder();
        String substring2 = replace$default.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        sb2.append('_');
        sb2.append(time);
        sb2.append('.');
        sb2.append(substring);
        return sb2.toString();
    }
}
