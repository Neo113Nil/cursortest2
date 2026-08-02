package bo.app;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB-\b\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0016"}, d2 = {"Lbo/app/l3;", "", "", "toString", "", "hashCode", "other", "", "equals", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Ljava/lang/Integer;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/Integer;", "textColor", "c", "borderColor", "b", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lorg/json/JSONObject;", "buttonThemeJson", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class l3 {
    public static final a d = new a(null);
    private final Integer a;
    private final Integer b;
    private final Integer c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lbo/app/l3$a;", "", "", "BACKGROUND_COLOR_KEY", "Ljava/lang/String;", "BORDER_COLOR_KEY", "TEXT_COLOR_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private l3(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
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
    public final Integer getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) other;
        return Intrinsics.areEqual(this.a, l3Var.a) && Intrinsics.areEqual(this.b, l3Var.b) && Intrinsics.areEqual(this.c, l3Var.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", borderColor=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3(JSONObject buttonThemeJson) {
        this(JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color"));
        Intrinsics.checkNotNullParameter(buttonThemeJson, "buttonThemeJson");
    }
}
