package c;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f26395a = new C();

    public static final String a(C c10, Object obj) {
        c10.getClass();
        if (obj instanceof String) {
            return "\"" + b((String) obj) + Typography.quote;
        }
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map data = (Map) obj;
            Intrinsics.checkNotNullParameter(data, "data");
            return "{" + CollectionsKt.joinToString$default(data.entrySet(), ",", null, null, 0, null, C2468u.f26689d, 30, null) + '}';
        }
        if (obj instanceof List) {
            return "[" + CollectionsKt.joinToString$default((Iterable) obj, ",", null, null, 0, null, C2472y.f26726d, 30, null) + ']';
        }
        if (obj == null) {
            return "null";
        }
        return "\"" + b(obj.toString()) + Typography.quote;
    }

    public static String b(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "\\", "\\\\", false, 4, (Object) null), "\"", "\\\"", false, 4, (Object) null), "\b", "\\b", false, 4, (Object) null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null), "\t", "\\t", false, 4, (Object) null), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "\\u0000", false, 4, (Object) null);
    }
}
