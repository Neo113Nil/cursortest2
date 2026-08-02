package com.braze.models.theme;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f660a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public a(JSONObject messageThemeJson) {
        Intrinsics.checkNotNullParameter(messageThemeJson, "messageThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.BG_COLOR);
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR);
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_COLOR);
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_BG_COLOR);
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color");
        this.f660a = colorIntegerOrNull;
        this.b = colorIntegerOrNull2;
        this.c = colorIntegerOrNull3;
        this.d = colorIntegerOrNull4;
        this.e = colorIntegerOrNull5;
        this.f = colorIntegerOrNull6;
        this.g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f660a, aVar.f660a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
    }

    public final int hashCode() {
        Integer num = this.f660a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f660a + ", textColor=" + this.b + ", closeButtonColor=" + this.c + ", iconColor=" + this.d + ", iconBackgroundColor=" + this.e + ", headerTextColor=" + this.f + ", frameColor=" + this.g + ")";
    }
}
