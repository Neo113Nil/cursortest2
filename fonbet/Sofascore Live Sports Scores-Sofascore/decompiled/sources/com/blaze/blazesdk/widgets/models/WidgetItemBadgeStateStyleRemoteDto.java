package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0010\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0010\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0013\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0010HÆ\u0003J\u0013\u0010B\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0010HÆ\u0003J\u0013\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0010HÆ\u0003Jª\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00102\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00102\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\t\u0010I\u001a\u00020\bHÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0002\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00102\"\u0004\b6\u00104R(\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00102\"\u0004\b8\u00104¨\u0006J"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;", "", C4018c8.k, "", "width", "", "height", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "cornerRadius", "", "borderColor", "borderWidth", "textStyle", "Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;", "text", "Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "backgroundImage", "cornerRadiusRatio", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHeight", "setHeight", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getBorderColor", "setBorderColor", "getBorderWidth", "setBorderWidth", "getTextStyle", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;", "setTextStyle", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;)V", "getText", "()Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "setText", "(Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getBackgroundImage", "setBackgroundImage", "getCornerRadiusRatio", "setCornerRadiusRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;", "equals", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemBadgeStateStyleRemoteDto {
    public static final int $stable = 8;

    @b6h(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
    @Nullable
    private String backgroundColor;

    @b6h("backgroundImage")
    @Nullable
    private OverridableValueRemoteDto<String> backgroundImage;

    @b6h("borderColor")
    @Nullable
    private String borderColor;

    @b6h("borderWidth")
    @Nullable
    private Integer borderWidth;

    @b6h("cornerRadius")
    @Nullable
    private Float cornerRadius;

    @b6h("cornerRadiusRatio")
    @Nullable
    private OverridableValueRemoteDto<Float> cornerRadiusRatio;

    @b6h("height")
    @Nullable
    private Integer height;

    @b6h(C4018c8.k)
    @Nullable
    private Boolean isVisible;

    @b6h("text")
    @Nullable
    private OverridableValueRemoteDto<String> text;

    @b6h("textStyle")
    @Nullable
    private WidgetItemTextStyleRemoteDto textStyle;

    @b6h("width")
    @Nullable
    private Integer width;

    public WidgetItemBadgeStateStyleRemoteDto(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Float f, @Nullable String str2, @Nullable Integer num3, @Nullable WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto, @Nullable OverridableValueRemoteDto<String> overridableValueRemoteDto, @Nullable OverridableValueRemoteDto<String> overridableValueRemoteDto2, @Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto3) {
        this.isVisible = bool;
        this.width = num;
        this.height = num2;
        this.backgroundColor = str;
        this.cornerRadius = f;
        this.borderColor = str2;
        this.borderWidth = num3;
        this.textStyle = widgetItemTextStyleRemoteDto;
        this.text = overridableValueRemoteDto;
        this.backgroundImage = overridableValueRemoteDto2;
        this.cornerRadiusRatio = overridableValueRemoteDto3;
    }

    public static /* synthetic */ WidgetItemBadgeStateStyleRemoteDto copy$default(WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto, Boolean bool, Integer num, Integer num2, String str, Float f, String str2, Integer num3, WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto2, OverridableValueRemoteDto overridableValueRemoteDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = widgetItemBadgeStateStyleRemoteDto.isVisible;
        }
        if ((i & 2) != 0) {
            num = widgetItemBadgeStateStyleRemoteDto.width;
        }
        if ((i & 4) != 0) {
            num2 = widgetItemBadgeStateStyleRemoteDto.height;
        }
        if ((i & 8) != 0) {
            str = widgetItemBadgeStateStyleRemoteDto.backgroundColor;
        }
        if ((i & 16) != 0) {
            f = widgetItemBadgeStateStyleRemoteDto.cornerRadius;
        }
        if ((i & 32) != 0) {
            str2 = widgetItemBadgeStateStyleRemoteDto.borderColor;
        }
        if ((i & 64) != 0) {
            num3 = widgetItemBadgeStateStyleRemoteDto.borderWidth;
        }
        if ((i & 128) != 0) {
            widgetItemTextStyleRemoteDto = widgetItemBadgeStateStyleRemoteDto.textStyle;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            overridableValueRemoteDto = widgetItemBadgeStateStyleRemoteDto.text;
        }
        if ((i & 512) != 0) {
            overridableValueRemoteDto2 = widgetItemBadgeStateStyleRemoteDto.backgroundImage;
        }
        if ((i & 1024) != 0) {
            overridableValueRemoteDto3 = widgetItemBadgeStateStyleRemoteDto.cornerRadiusRatio;
        }
        OverridableValueRemoteDto overridableValueRemoteDto4 = overridableValueRemoteDto2;
        OverridableValueRemoteDto overridableValueRemoteDto5 = overridableValueRemoteDto3;
        WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto2 = widgetItemTextStyleRemoteDto;
        OverridableValueRemoteDto overridableValueRemoteDto6 = overridableValueRemoteDto;
        String str3 = str2;
        Integer num4 = num3;
        Float f2 = f;
        Integer num5 = num2;
        return widgetItemBadgeStateStyleRemoteDto.copy(bool, num, num5, str, f2, str3, num4, widgetItemTextStyleRemoteDto2, overridableValueRemoteDto6, overridableValueRemoteDto4, overridableValueRemoteDto5);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    public final OverridableValueRemoteDto<String> component10() {
        return this.backgroundImage;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> component11() {
        return this.cornerRadiusRatio;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final WidgetItemTextStyleRemoteDto getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    public final OverridableValueRemoteDto<String> component9() {
        return this.text;
    }

    @NotNull
    public final WidgetItemBadgeStateStyleRemoteDto copy(@Nullable Boolean isVisible, @Nullable Integer width, @Nullable Integer height, @Nullable String backgroundColor, @Nullable Float cornerRadius, @Nullable String borderColor, @Nullable Integer borderWidth, @Nullable WidgetItemTextStyleRemoteDto textStyle, @Nullable OverridableValueRemoteDto<String> text, @Nullable OverridableValueRemoteDto<String> backgroundImage, @Nullable OverridableValueRemoteDto<Float> cornerRadiusRatio) {
        return new WidgetItemBadgeStateStyleRemoteDto(isVisible, width, height, backgroundColor, cornerRadius, borderColor, borderWidth, textStyle, text, backgroundImage, cornerRadiusRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemBadgeStateStyleRemoteDto)) {
            return false;
        }
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto = (WidgetItemBadgeStateStyleRemoteDto) other;
        return Intrinsics.c(this.isVisible, widgetItemBadgeStateStyleRemoteDto.isVisible) && Intrinsics.c(this.width, widgetItemBadgeStateStyleRemoteDto.width) && Intrinsics.c(this.height, widgetItemBadgeStateStyleRemoteDto.height) && Intrinsics.c(this.backgroundColor, widgetItemBadgeStateStyleRemoteDto.backgroundColor) && Intrinsics.c(this.cornerRadius, widgetItemBadgeStateStyleRemoteDto.cornerRadius) && Intrinsics.c(this.borderColor, widgetItemBadgeStateStyleRemoteDto.borderColor) && Intrinsics.c(this.borderWidth, widgetItemBadgeStateStyleRemoteDto.borderWidth) && Intrinsics.c(this.textStyle, widgetItemBadgeStateStyleRemoteDto.textStyle) && Intrinsics.c(this.text, widgetItemBadgeStateStyleRemoteDto.text) && Intrinsics.c(this.backgroundImage, widgetItemBadgeStateStyleRemoteDto.backgroundImage) && Intrinsics.c(this.cornerRadiusRatio, widgetItemBadgeStateStyleRemoteDto.cornerRadiusRatio);
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final OverridableValueRemoteDto<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    @Nullable
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final OverridableValueRemoteDto<String> getText() {
        return this.text;
    }

    @Nullable
    public final WidgetItemTextStyleRemoteDto getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Boolean bool = this.isVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.cornerRadius;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.borderColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.borderWidth;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto = this.textStyle;
        int hashCode8 = (hashCode7 + (widgetItemTextStyleRemoteDto == null ? 0 : widgetItemTextStyleRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<String> overridableValueRemoteDto = this.text;
        int hashCode9 = (hashCode8 + (overridableValueRemoteDto == null ? 0 : overridableValueRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<String> overridableValueRemoteDto2 = this.backgroundImage;
        int hashCode10 = (hashCode9 + (overridableValueRemoteDto2 == null ? 0 : overridableValueRemoteDto2.hashCode())) * 31;
        OverridableValueRemoteDto<Float> overridableValueRemoteDto3 = this.cornerRadiusRatio;
        return hashCode10 + (overridableValueRemoteDto3 != null ? overridableValueRemoteDto3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundImage(@Nullable OverridableValueRemoteDto<String> overridableValueRemoteDto) {
        this.backgroundImage = overridableValueRemoteDto;
    }

    public final void setBorderColor(@Nullable String str) {
        this.borderColor = str;
    }

    public final void setBorderWidth(@Nullable Integer num) {
        this.borderWidth = num;
    }

    public final void setCornerRadius(@Nullable Float f) {
        this.cornerRadius = f;
    }

    public final void setCornerRadiusRatio(@Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto) {
        this.cornerRadiusRatio = overridableValueRemoteDto;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setText(@Nullable OverridableValueRemoteDto<String> overridableValueRemoteDto) {
        this.text = overridableValueRemoteDto;
    }

    public final void setTextStyle(@Nullable WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto) {
        this.textStyle = widgetItemTextStyleRemoteDto;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.isVisible = bool;
    }

    public final void setWidth(@Nullable Integer num) {
        this.width = num;
    }

    @NotNull
    public String toString() {
        return "WidgetItemBadgeStateStyleRemoteDto(isVisible=" + this.isVisible + ", width=" + this.width + ", height=" + this.height + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", textStyle=" + this.textStyle + ", text=" + this.text + ", backgroundImage=" + this.backgroundImage + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ')';
    }
}
