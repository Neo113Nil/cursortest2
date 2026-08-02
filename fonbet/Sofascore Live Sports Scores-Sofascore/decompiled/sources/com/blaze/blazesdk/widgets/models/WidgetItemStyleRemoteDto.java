package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0013\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011HÆ\u0003Jv\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0007HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006E"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;", "", "title", "Lcom/blaze/blazesdk/widgets/models/WidgetItemTitleStyleRemoteDto;", "statusIndicator", "Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "cornerRadius", "", "image", "Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;", "paddings", "Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "badge", "Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;", "cornerRadiusRatio", "Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "<init>", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemTitleStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;Ljava/lang/String;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getTitle", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemTitleStyleRemoteDto;", "setTitle", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemTitleStyleRemoteDto;)V", "getStatusIndicator", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;", "setStatusIndicator", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getImage", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;", "setImage", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;)V", "getPaddings", "()Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "setPaddings", "(Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;)V", "getBadge", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;", "setBadge", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;)V", "getCornerRadiusRatio", "()Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "setCornerRadiusRatio", "(Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemTitleStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;Ljava/lang/String;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemStyleRemoteDto {
    public static final int $stable = 8;

    @b6h(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
    @Nullable
    private String backgroundColor;

    @b6h("badge")
    @Nullable
    private WidgetItemBadgeStyleRemoteDto badge;

    @b6h("cornerRadius")
    @Nullable
    private Float cornerRadius;

    @b6h("cornerRadiusRatio")
    @Nullable
    private OverridableValueRemoteDto<Float> cornerRadiusRatio;

    @b6h("image")
    @Nullable
    private WidgetItemImageStyleRemoteDto image;

    @b6h("paddings")
    @Nullable
    private InsetsRemoteDto paddings;

    @b6h("statusIndicator")
    @Nullable
    private WidgetItemStatusIndicatorStyleRemoteDto statusIndicator;

    @b6h("title")
    @Nullable
    private WidgetItemTitleStyleRemoteDto title;

    public WidgetItemStyleRemoteDto(@Nullable WidgetItemTitleStyleRemoteDto widgetItemTitleStyleRemoteDto, @Nullable WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto, @Nullable String str, @Nullable Float f, @Nullable WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto, @Nullable InsetsRemoteDto insetsRemoteDto, @Nullable WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto, @Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto) {
        this.title = widgetItemTitleStyleRemoteDto;
        this.statusIndicator = widgetItemStatusIndicatorStyleRemoteDto;
        this.backgroundColor = str;
        this.cornerRadius = f;
        this.image = widgetItemImageStyleRemoteDto;
        this.paddings = insetsRemoteDto;
        this.badge = widgetItemBadgeStyleRemoteDto;
        this.cornerRadiusRatio = overridableValueRemoteDto;
    }

    public static /* synthetic */ WidgetItemStyleRemoteDto copy$default(WidgetItemStyleRemoteDto widgetItemStyleRemoteDto, WidgetItemTitleStyleRemoteDto widgetItemTitleStyleRemoteDto, WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto, String str, Float f, WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto, InsetsRemoteDto insetsRemoteDto, WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            widgetItemTitleStyleRemoteDto = widgetItemStyleRemoteDto.title;
        }
        if ((i & 2) != 0) {
            widgetItemStatusIndicatorStyleRemoteDto = widgetItemStyleRemoteDto.statusIndicator;
        }
        if ((i & 4) != 0) {
            str = widgetItemStyleRemoteDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            f = widgetItemStyleRemoteDto.cornerRadius;
        }
        if ((i & 16) != 0) {
            widgetItemImageStyleRemoteDto = widgetItemStyleRemoteDto.image;
        }
        if ((i & 32) != 0) {
            insetsRemoteDto = widgetItemStyleRemoteDto.paddings;
        }
        if ((i & 64) != 0) {
            widgetItemBadgeStyleRemoteDto = widgetItemStyleRemoteDto.badge;
        }
        if ((i & 128) != 0) {
            overridableValueRemoteDto = widgetItemStyleRemoteDto.cornerRadiusRatio;
        }
        WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto2 = widgetItemBadgeStyleRemoteDto;
        OverridableValueRemoteDto overridableValueRemoteDto2 = overridableValueRemoteDto;
        WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto2 = widgetItemImageStyleRemoteDto;
        InsetsRemoteDto insetsRemoteDto2 = insetsRemoteDto;
        return widgetItemStyleRemoteDto.copy(widgetItemTitleStyleRemoteDto, widgetItemStatusIndicatorStyleRemoteDto, str, f, widgetItemImageStyleRemoteDto2, insetsRemoteDto2, widgetItemBadgeStyleRemoteDto2, overridableValueRemoteDto2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final WidgetItemTitleStyleRemoteDto getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WidgetItemStatusIndicatorStyleRemoteDto getStatusIndicator() {
        return this.statusIndicator;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final WidgetItemImageStyleRemoteDto getImage() {
        return this.image;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InsetsRemoteDto getPaddings() {
        return this.paddings;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final WidgetItemBadgeStyleRemoteDto getBadge() {
        return this.badge;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> component8() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    public final WidgetItemStyleRemoteDto copy(@Nullable WidgetItemTitleStyleRemoteDto title, @Nullable WidgetItemStatusIndicatorStyleRemoteDto statusIndicator, @Nullable String backgroundColor, @Nullable Float cornerRadius, @Nullable WidgetItemImageStyleRemoteDto image, @Nullable InsetsRemoteDto paddings, @Nullable WidgetItemBadgeStyleRemoteDto badge, @Nullable OverridableValueRemoteDto<Float> cornerRadiusRatio) {
        return new WidgetItemStyleRemoteDto(title, statusIndicator, backgroundColor, cornerRadius, image, paddings, badge, cornerRadiusRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemStyleRemoteDto)) {
            return false;
        }
        WidgetItemStyleRemoteDto widgetItemStyleRemoteDto = (WidgetItemStyleRemoteDto) other;
        return Intrinsics.c(this.title, widgetItemStyleRemoteDto.title) && Intrinsics.c(this.statusIndicator, widgetItemStyleRemoteDto.statusIndicator) && Intrinsics.c(this.backgroundColor, widgetItemStyleRemoteDto.backgroundColor) && Intrinsics.c(this.cornerRadius, widgetItemStyleRemoteDto.cornerRadius) && Intrinsics.c(this.image, widgetItemStyleRemoteDto.image) && Intrinsics.c(this.paddings, widgetItemStyleRemoteDto.paddings) && Intrinsics.c(this.badge, widgetItemStyleRemoteDto.badge) && Intrinsics.c(this.cornerRadiusRatio, widgetItemStyleRemoteDto.cornerRadiusRatio);
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final WidgetItemBadgeStyleRemoteDto getBadge() {
        return this.badge;
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
    public final WidgetItemImageStyleRemoteDto getImage() {
        return this.image;
    }

    @Nullable
    public final InsetsRemoteDto getPaddings() {
        return this.paddings;
    }

    @Nullable
    public final WidgetItemStatusIndicatorStyleRemoteDto getStatusIndicator() {
        return this.statusIndicator;
    }

    @Nullable
    public final WidgetItemTitleStyleRemoteDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        WidgetItemTitleStyleRemoteDto widgetItemTitleStyleRemoteDto = this.title;
        int hashCode = (widgetItemTitleStyleRemoteDto == null ? 0 : widgetItemTitleStyleRemoteDto.hashCode()) * 31;
        WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto = this.statusIndicator;
        int hashCode2 = (hashCode + (widgetItemStatusIndicatorStyleRemoteDto == null ? 0 : widgetItemStatusIndicatorStyleRemoteDto.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.cornerRadius;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto = this.image;
        int hashCode5 = (hashCode4 + (widgetItemImageStyleRemoteDto == null ? 0 : widgetItemImageStyleRemoteDto.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto = this.paddings;
        int hashCode6 = (hashCode5 + (insetsRemoteDto == null ? 0 : insetsRemoteDto.hashCode())) * 31;
        WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto = this.badge;
        int hashCode7 = (hashCode6 + (widgetItemBadgeStyleRemoteDto == null ? 0 : widgetItemBadgeStyleRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<Float> overridableValueRemoteDto = this.cornerRadiusRatio;
        return hashCode7 + (overridableValueRemoteDto != null ? overridableValueRemoteDto.hashCode() : 0);
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBadge(@Nullable WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto) {
        this.badge = widgetItemBadgeStyleRemoteDto;
    }

    public final void setCornerRadius(@Nullable Float f) {
        this.cornerRadius = f;
    }

    public final void setCornerRadiusRatio(@Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto) {
        this.cornerRadiusRatio = overridableValueRemoteDto;
    }

    public final void setImage(@Nullable WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto) {
        this.image = widgetItemImageStyleRemoteDto;
    }

    public final void setPaddings(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.paddings = insetsRemoteDto;
    }

    public final void setStatusIndicator(@Nullable WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto) {
        this.statusIndicator = widgetItemStatusIndicatorStyleRemoteDto;
    }

    public final void setTitle(@Nullable WidgetItemTitleStyleRemoteDto widgetItemTitleStyleRemoteDto) {
        this.title = widgetItemTitleStyleRemoteDto;
    }

    @NotNull
    public String toString() {
        return "WidgetItemStyleRemoteDto(title=" + this.title + ", statusIndicator=" + this.statusIndicator + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", image=" + this.image + ", paddings=" + this.paddings + ", badge=" + this.badge + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ')';
    }
}
