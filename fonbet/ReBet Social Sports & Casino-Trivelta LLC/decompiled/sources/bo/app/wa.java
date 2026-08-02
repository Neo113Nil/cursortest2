package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f26197a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f26198b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f26199c;

    public wa(JSONObject buttonThemeJson) {
        Intrinsics.checkNotNullParameter(buttonThemeJson, "buttonThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color");
        this.f26197a = colorIntegerOrNull;
        this.f26198b = colorIntegerOrNull2;
        this.f26199c = colorIntegerOrNull3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return Intrinsics.areEqual(this.f26197a, waVar.f26197a) && Intrinsics.areEqual(this.f26198b, waVar.f26198b) && Intrinsics.areEqual(this.f26199c, waVar.f26199c);
    }

    public final int hashCode() {
        Integer num = this.f26197a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f26198b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f26199c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f26197a + ", textColor=" + this.f26198b + ", borderColor=" + this.f26199c + ")";
    }
}
