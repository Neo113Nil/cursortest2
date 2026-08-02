package c;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class R0 extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2438e f26493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C2438e c2438e) {
        super(1);
        this.f26493d = c2438e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof String) {
            str = "\"" + StringsKt.replace$default(StringsKt.replace$default((String) value, "\"", "\\\"", false, 4, (Object) null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, (Object) null) + Typography.quote;
        } else if (value instanceof Number) {
            str = ((Number) value).toString();
        } else {
            if (!(value instanceof Boolean)) {
                if (value instanceof Map) {
                    C2438e c2438e = this.f26493d;
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    c2438e.getClass();
                    str = "{" + CollectionsKt.joinToString$default(((Map) value).entrySet(), ",", null, null, 0, null, new R0(c2438e), 30, null) + '}';
                } else if (value == null) {
                    str = "null";
                } else {
                    str = "\"" + value + Typography.quote;
                }
                return "\"" + str2 + "\":" + str;
            }
            str = String.valueOf(((Boolean) value).booleanValue());
        }
        return "\"" + str2 + "\":" + str;
    }
}
