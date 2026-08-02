package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ma {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f25748a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f25749b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f25750c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f25751d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f25752e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f25753f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f25754g;

    public ma(JSONObject messageThemeJson) {
        Intrinsics.checkNotNullParameter(messageThemeJson, "messageThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(messageThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_color");
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_bg_color");
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color");
        this.f25748a = colorIntegerOrNull;
        this.f25749b = colorIntegerOrNull2;
        this.f25750c = colorIntegerOrNull3;
        this.f25751d = colorIntegerOrNull4;
        this.f25752e = colorIntegerOrNull5;
        this.f25753f = colorIntegerOrNull6;
        this.f25754g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return Intrinsics.areEqual(this.f25748a, maVar.f25748a) && Intrinsics.areEqual(this.f25749b, maVar.f25749b) && Intrinsics.areEqual(this.f25750c, maVar.f25750c) && Intrinsics.areEqual(this.f25751d, maVar.f25751d) && Intrinsics.areEqual(this.f25752e, maVar.f25752e) && Intrinsics.areEqual(this.f25753f, maVar.f25753f) && Intrinsics.areEqual(this.f25754g, maVar.f25754g);
    }

    public final int hashCode() {
        Integer num = this.f25748a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f25749b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f25750c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f25751d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f25752e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f25753f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f25754g;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f25748a + ", textColor=" + this.f25749b + ", closeButtonColor=" + this.f25750c + ", iconColor=" + this.f25751d + ", iconBackgroundColor=" + this.f25752e + ", headerTextColor=" + this.f25753f + ", frameColor=" + this.f25754g + ")";
    }
}
