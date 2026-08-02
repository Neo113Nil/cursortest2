package ah;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: ah.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2018j {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f16059a = SetsKt.setOf((Object[]) new Character[]{'(', ')', Character.valueOf(Typography.less), Character.valueOf(Typography.greater), '@', ',', ';', ':', '\\', Character.valueOf(Typography.quote), '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(String str) {
        if (str.length() < 2 || StringsKt.first(str) != '\"' || StringsKt.last(str) != '\"') {
            return false;
        }
        int i10 = 1;
        while (true) {
            String str2 = str;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.quote, i10, false, 4, (Object) null);
            if (indexOf$default == StringsKt.getLastIndex(str2)) {
                break;
            }
            int i11 = 0;
            for (int i12 = indexOf$default - 1; str2.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = indexOf$default + 1;
            if (i10 >= str2.length()) {
                break;
            }
            str = str2;
        }
    }

    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f16059a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(str, sb2);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final void e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                sb2.append("\\\\");
            } else if (charAt == '\n') {
                sb2.append("\\n");
            } else if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\t') {
                sb2.append("\\t");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(charAt);
            }
        }
        sb2.append("\"");
    }
}
