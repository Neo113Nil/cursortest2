package bo.app;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB]\b\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f¨\u0006\u001e"}, d2 = {"Lbo/app/e3;", "", "", "toString", "", "hashCode", "other", "", "equals", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Ljava/lang/Integer;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/Integer;", "textColor", "g", "closeButtonColor", "b", "iconColor", "f", "iconBackgroundColor", "e", "headerTextColor", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "frameColor", "c", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lorg/json/JSONObject;", "messageThemeJson", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class e3 {
    public static final a h = new a(null);
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    private final Integer f;
    private final Integer g;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lbo/app/e3$a;", "", "", "BACKGROUND_COLOR_KEY", "Ljava/lang/String;", "CLOSE_BUTTON_COLOR_KEY", "FRAME_COLOR_KEY", "HEADER_TEXT_COLOR_KEY", "ICON_BG_COLOR_KEY", "ICON_COLOR_KEY", "TEXT_COLOR_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private e3(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) other;
        return Intrinsics.areEqual(this.a, e3Var.a) && Intrinsics.areEqual(this.b, e3Var.b) && Intrinsics.areEqual(this.c, e3Var.c) && Intrinsics.areEqual(this.d, e3Var.d) && Intrinsics.areEqual(this.e, e3Var.e) && Intrinsics.areEqual(this.f, e3Var.f) && Intrinsics.areEqual(this.g, e3Var.g);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getD() {
        return this.d;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    public int hashCode() {
        Integer num = this.a;
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

    public String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", closeButtonColor=" + this.c + ", iconColor=" + this.d + ", iconBackgroundColor=" + this.e + ", headerTextColor=" + this.f + ", frameColor=" + this.g + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e3(JSONObject messageThemeJson) {
        this(JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color"));
        Intrinsics.checkNotNullParameter(messageThemeJson, "messageThemeJson");
    }
}
