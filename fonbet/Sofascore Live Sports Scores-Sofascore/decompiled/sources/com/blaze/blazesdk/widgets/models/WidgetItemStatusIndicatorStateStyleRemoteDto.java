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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u0013\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0007HÆ\u0003J\u008a\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\rHÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u0006B"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;", "", C4018c8.k, "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "backgroundImage", "Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "textStyle", "Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;", "text", "borderColor", "borderWidth", "", "cornerRadius", "", "cornerRadiusRatio", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getBackgroundImage", "()Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "setBackgroundImage", "(Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getTextStyle", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;", "setTextStyle", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;)V", "getText", "setText", "getBorderColor", "setBorderColor", "getBorderWidth", "()Ljava/lang/Integer;", "setBorderWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getCornerRadiusRatio", "setCornerRadiusRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemTextStyleRemoteDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;", "equals", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemStatusIndicatorStateStyleRemoteDto {
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

    @b6h(C4018c8.k)
    @Nullable
    private Boolean isVisible;

    @b6h("text")
    @Nullable
    private String text;

    @b6h("textStyle")
    @Nullable
    private WidgetItemTextStyleRemoteDto textStyle;

    public WidgetItemStatusIndicatorStateStyleRemoteDto(@Nullable Boolean bool, @Nullable String str, @Nullable OverridableValueRemoteDto<String> overridableValueRemoteDto, @Nullable WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Float f, @Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto2) {
        this.isVisible = bool;
        this.backgroundColor = str;
        this.backgroundImage = overridableValueRemoteDto;
        this.textStyle = widgetItemTextStyleRemoteDto;
        this.text = str2;
        this.borderColor = str3;
        this.borderWidth = num;
        this.cornerRadius = f;
        this.cornerRadiusRatio = overridableValueRemoteDto2;
    }

    public static /* synthetic */ WidgetItemStatusIndicatorStateStyleRemoteDto copy$default(WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto, Boolean bool, String str, OverridableValueRemoteDto overridableValueRemoteDto, WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto, String str2, String str3, Integer num, Float f, OverridableValueRemoteDto overridableValueRemoteDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = widgetItemStatusIndicatorStateStyleRemoteDto.isVisible;
        }
        if ((i & 2) != 0) {
            str = widgetItemStatusIndicatorStateStyleRemoteDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            overridableValueRemoteDto = widgetItemStatusIndicatorStateStyleRemoteDto.backgroundImage;
        }
        if ((i & 8) != 0) {
            widgetItemTextStyleRemoteDto = widgetItemStatusIndicatorStateStyleRemoteDto.textStyle;
        }
        if ((i & 16) != 0) {
            str2 = widgetItemStatusIndicatorStateStyleRemoteDto.text;
        }
        if ((i & 32) != 0) {
            str3 = widgetItemStatusIndicatorStateStyleRemoteDto.borderColor;
        }
        if ((i & 64) != 0) {
            num = widgetItemStatusIndicatorStateStyleRemoteDto.borderWidth;
        }
        if ((i & 128) != 0) {
            f = widgetItemStatusIndicatorStateStyleRemoteDto.cornerRadius;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            overridableValueRemoteDto2 = widgetItemStatusIndicatorStateStyleRemoteDto.cornerRadiusRatio;
        }
        Float f2 = f;
        OverridableValueRemoteDto overridableValueRemoteDto3 = overridableValueRemoteDto2;
        String str4 = str3;
        Integer num2 = num;
        String str5 = str2;
        OverridableValueRemoteDto overridableValueRemoteDto4 = overridableValueRemoteDto;
        return widgetItemStatusIndicatorStateStyleRemoteDto.copy(bool, str, overridableValueRemoteDto4, widgetItemTextStyleRemoteDto, str5, str4, num2, f2, overridableValueRemoteDto3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final OverridableValueRemoteDto<String> component3() {
        return this.backgroundImage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final WidgetItemTextStyleRemoteDto getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
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
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> component9() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    public final WidgetItemStatusIndicatorStateStyleRemoteDto copy(@Nullable Boolean isVisible, @Nullable String backgroundColor, @Nullable OverridableValueRemoteDto<String> backgroundImage, @Nullable WidgetItemTextStyleRemoteDto textStyle, @Nullable String text, @Nullable String borderColor, @Nullable Integer borderWidth, @Nullable Float cornerRadius, @Nullable OverridableValueRemoteDto<Float> cornerRadiusRatio) {
        return new WidgetItemStatusIndicatorStateStyleRemoteDto(isVisible, backgroundColor, backgroundImage, textStyle, text, borderColor, borderWidth, cornerRadius, cornerRadiusRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemStatusIndicatorStateStyleRemoteDto)) {
            return false;
        }
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto = (WidgetItemStatusIndicatorStateStyleRemoteDto) other;
        return Intrinsics.c(this.isVisible, widgetItemStatusIndicatorStateStyleRemoteDto.isVisible) && Intrinsics.c(this.backgroundColor, widgetItemStatusIndicatorStateStyleRemoteDto.backgroundColor) && Intrinsics.c(this.backgroundImage, widgetItemStatusIndicatorStateStyleRemoteDto.backgroundImage) && Intrinsics.c(this.textStyle, widgetItemStatusIndicatorStateStyleRemoteDto.textStyle) && Intrinsics.c(this.text, widgetItemStatusIndicatorStateStyleRemoteDto.text) && Intrinsics.c(this.borderColor, widgetItemStatusIndicatorStateStyleRemoteDto.borderColor) && Intrinsics.c(this.borderWidth, widgetItemStatusIndicatorStateStyleRemoteDto.borderWidth) && Intrinsics.c(this.cornerRadius, widgetItemStatusIndicatorStateStyleRemoteDto.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, widgetItemStatusIndicatorStateStyleRemoteDto.cornerRadiusRatio);
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
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final WidgetItemTextStyleRemoteDto getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        Boolean bool = this.isVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OverridableValueRemoteDto<String> overridableValueRemoteDto = this.backgroundImage;
        int hashCode3 = (hashCode2 + (overridableValueRemoteDto == null ? 0 : overridableValueRemoteDto.hashCode())) * 31;
        WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto = this.textStyle;
        int hashCode4 = (hashCode3 + (widgetItemTextStyleRemoteDto == null ? 0 : widgetItemTextStyleRemoteDto.hashCode())) * 31;
        String str2 = this.text;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.borderColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.borderWidth;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.cornerRadius;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        OverridableValueRemoteDto<Float> overridableValueRemoteDto2 = this.cornerRadiusRatio;
        return hashCode8 + (overridableValueRemoteDto2 != null ? overridableValueRemoteDto2.hashCode() : 0);
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

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTextStyle(@Nullable WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto) {
        this.textStyle = widgetItemTextStyleRemoteDto;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.isVisible = bool;
    }

    @NotNull
    public String toString() {
        return "WidgetItemStatusIndicatorStateStyleRemoteDto(isVisible=" + this.isVisible + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", textStyle=" + this.textStyle + ", text=" + this.text + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", cornerRadius=" + this.cornerRadius + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ')';
    }
}
