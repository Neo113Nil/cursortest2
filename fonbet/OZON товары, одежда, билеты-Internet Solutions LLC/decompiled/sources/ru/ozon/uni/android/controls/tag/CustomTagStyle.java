package ru.ozon.uni.android.controls.tag;

import T7.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/controls/tag/CustomTagStyle;", "", "Lru/ozon/uni/android/uikitsdk/Color;", "backgroundColor", "", "textColor", "iconColor", "closeIconColor", "<init>", "(Lru/ozon/uni/android/uikitsdk/Color;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "getIconColor", "getCloseIconColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CustomTagStyle {
    private final Color backgroundColor;
    private final Integer closeIconColor;
    private final Integer iconColor;
    private final Integer textColor;

    public CustomTagStyle() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTagStyle)) {
            return false;
        }
        CustomTagStyle customTagStyle = (CustomTagStyle) other;
        return Intrinsics.d(this.backgroundColor, customTagStyle.backgroundColor) && Intrinsics.d(this.textColor, customTagStyle.textColor) && Intrinsics.d(this.iconColor, customTagStyle.iconColor) && Intrinsics.d(this.closeIconColor, customTagStyle.closeIconColor);
    }

    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getCloseIconColor() {
        return this.closeIconColor;
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        Color color = this.backgroundColor;
        int hashCode = (color == null ? 0 : color.hashCode()) * 31;
        Integer num = this.textColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.iconColor;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.closeIconColor;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Color color = this.backgroundColor;
        Integer num = this.textColor;
        Integer num2 = this.iconColor;
        Integer num3 = this.closeIconColor;
        StringBuilder sb2 = new StringBuilder("CustomTagStyle(backgroundColor=");
        sb2.append(color);
        sb2.append(", textColor=");
        sb2.append(num);
        sb2.append(", iconColor=");
        return Z.c(sb2, num2, ", closeIconColor=", num3, ")");
    }

    public CustomTagStyle(Color color, Integer num, Integer num2, Integer num3) {
        this.backgroundColor = color;
        this.textColor = num;
        this.iconColor = num2;
        this.closeIconColor = num3;
    }

    public /* synthetic */ CustomTagStyle(Color color, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : color, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}
