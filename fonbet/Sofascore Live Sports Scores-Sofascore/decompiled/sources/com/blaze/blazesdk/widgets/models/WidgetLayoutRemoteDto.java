package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0013\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rHÆ\u0003Jj\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00069"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetLayoutRemoteDto;", "", "horizontalItemsSpacing", "", "verticalItemsSpacing", "itemRatio", "", "margins", "Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "columns", "widgetItemStyle", "Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;", "maxDisplayItemsCount", "Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getHorizontalItemsSpacing", "()Ljava/lang/Integer;", "setHorizontalItemsSpacing", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVerticalItemsSpacing", "setVerticalItemsSpacing", "getItemRatio", "()Ljava/lang/Float;", "setItemRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getMargins", "()Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "setMargins", "(Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;)V", "getColumns", "setColumns", "getWidgetItemStyle", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;", "setWidgetItemStyle", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;)V", "getMaxDisplayItemsCount", "()Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "setMaxDisplayItemsCount", "(Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/WidgetItemStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetLayoutRemoteDto;", "equals", "", "other", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetLayoutRemoteDto {
    public static final int $stable = 8;

    @b6h("columns")
    @Nullable
    private Integer columns;

    @b6h("horizontalItemsSpacing")
    @Nullable
    private Integer horizontalItemsSpacing;

    @b6h("itemRatio")
    @Nullable
    private Float itemRatio;

    @b6h("margins")
    @Nullable
    private InsetsRemoteDto margins;

    @b6h("maxDisplayItemsCount")
    @Nullable
    private OverridableValueRemoteDto<Integer> maxDisplayItemsCount;

    @b6h("verticalItemsSpacing")
    @Nullable
    private Integer verticalItemsSpacing;

    @b6h("widgetItemStyle")
    @Nullable
    private WidgetItemStyleRemoteDto widgetItemStyle;

    public WidgetLayoutRemoteDto(@Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable InsetsRemoteDto insetsRemoteDto, @Nullable Integer num3, @Nullable WidgetItemStyleRemoteDto widgetItemStyleRemoteDto, @Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto) {
        this.horizontalItemsSpacing = num;
        this.verticalItemsSpacing = num2;
        this.itemRatio = f;
        this.margins = insetsRemoteDto;
        this.columns = num3;
        this.widgetItemStyle = widgetItemStyleRemoteDto;
        this.maxDisplayItemsCount = overridableValueRemoteDto;
    }

    public static /* synthetic */ WidgetLayoutRemoteDto copy$default(WidgetLayoutRemoteDto widgetLayoutRemoteDto, Integer num, Integer num2, Float f, InsetsRemoteDto insetsRemoteDto, Integer num3, WidgetItemStyleRemoteDto widgetItemStyleRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = widgetLayoutRemoteDto.horizontalItemsSpacing;
        }
        if ((i & 2) != 0) {
            num2 = widgetLayoutRemoteDto.verticalItemsSpacing;
        }
        if ((i & 4) != 0) {
            f = widgetLayoutRemoteDto.itemRatio;
        }
        if ((i & 8) != 0) {
            insetsRemoteDto = widgetLayoutRemoteDto.margins;
        }
        if ((i & 16) != 0) {
            num3 = widgetLayoutRemoteDto.columns;
        }
        if ((i & 32) != 0) {
            widgetItemStyleRemoteDto = widgetLayoutRemoteDto.widgetItemStyle;
        }
        if ((i & 64) != 0) {
            overridableValueRemoteDto = widgetLayoutRemoteDto.maxDisplayItemsCount;
        }
        WidgetItemStyleRemoteDto widgetItemStyleRemoteDto2 = widgetItemStyleRemoteDto;
        OverridableValueRemoteDto overridableValueRemoteDto2 = overridableValueRemoteDto;
        Integer num4 = num3;
        Float f2 = f;
        return widgetLayoutRemoteDto.copy(num, num2, f2, insetsRemoteDto, num4, widgetItemStyleRemoteDto2, overridableValueRemoteDto2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getHorizontalItemsSpacing() {
        return this.horizontalItemsSpacing;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getVerticalItemsSpacing() {
        return this.verticalItemsSpacing;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getItemRatio() {
        return this.itemRatio;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getColumns() {
        return this.columns;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final WidgetItemStyleRemoteDto getWidgetItemStyle() {
        return this.widgetItemStyle;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> component7() {
        return this.maxDisplayItemsCount;
    }

    @NotNull
    public final WidgetLayoutRemoteDto copy(@Nullable Integer horizontalItemsSpacing, @Nullable Integer verticalItemsSpacing, @Nullable Float itemRatio, @Nullable InsetsRemoteDto margins, @Nullable Integer columns, @Nullable WidgetItemStyleRemoteDto widgetItemStyle, @Nullable OverridableValueRemoteDto<Integer> maxDisplayItemsCount) {
        return new WidgetLayoutRemoteDto(horizontalItemsSpacing, verticalItemsSpacing, itemRatio, margins, columns, widgetItemStyle, maxDisplayItemsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetLayoutRemoteDto)) {
            return false;
        }
        WidgetLayoutRemoteDto widgetLayoutRemoteDto = (WidgetLayoutRemoteDto) other;
        return Intrinsics.c(this.horizontalItemsSpacing, widgetLayoutRemoteDto.horizontalItemsSpacing) && Intrinsics.c(this.verticalItemsSpacing, widgetLayoutRemoteDto.verticalItemsSpacing) && Intrinsics.c(this.itemRatio, widgetLayoutRemoteDto.itemRatio) && Intrinsics.c(this.margins, widgetLayoutRemoteDto.margins) && Intrinsics.c(this.columns, widgetLayoutRemoteDto.columns) && Intrinsics.c(this.widgetItemStyle, widgetLayoutRemoteDto.widgetItemStyle) && Intrinsics.c(this.maxDisplayItemsCount, widgetLayoutRemoteDto.maxDisplayItemsCount);
    }

    @Nullable
    public final Integer getColumns() {
        return this.columns;
    }

    @Nullable
    public final Integer getHorizontalItemsSpacing() {
        return this.horizontalItemsSpacing;
    }

    @Nullable
    public final Float getItemRatio() {
        return this.itemRatio;
    }

    @Nullable
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> getMaxDisplayItemsCount() {
        return this.maxDisplayItemsCount;
    }

    @Nullable
    public final Integer getVerticalItemsSpacing() {
        return this.verticalItemsSpacing;
    }

    @Nullable
    public final WidgetItemStyleRemoteDto getWidgetItemStyle() {
        return this.widgetItemStyle;
    }

    public int hashCode() {
        Integer num = this.horizontalItemsSpacing;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.verticalItemsSpacing;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.itemRatio;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto = this.margins;
        int hashCode4 = (hashCode3 + (insetsRemoteDto == null ? 0 : insetsRemoteDto.hashCode())) * 31;
        Integer num3 = this.columns;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        WidgetItemStyleRemoteDto widgetItemStyleRemoteDto = this.widgetItemStyle;
        int hashCode6 = (hashCode5 + (widgetItemStyleRemoteDto == null ? 0 : widgetItemStyleRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<Integer> overridableValueRemoteDto = this.maxDisplayItemsCount;
        return hashCode6 + (overridableValueRemoteDto != null ? overridableValueRemoteDto.hashCode() : 0);
    }

    public final void setColumns(@Nullable Integer num) {
        this.columns = num;
    }

    public final void setHorizontalItemsSpacing(@Nullable Integer num) {
        this.horizontalItemsSpacing = num;
    }

    public final void setItemRatio(@Nullable Float f) {
        this.itemRatio = f;
    }

    public final void setMargins(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.margins = insetsRemoteDto;
    }

    public final void setMaxDisplayItemsCount(@Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto) {
        this.maxDisplayItemsCount = overridableValueRemoteDto;
    }

    public final void setVerticalItemsSpacing(@Nullable Integer num) {
        this.verticalItemsSpacing = num;
    }

    public final void setWidgetItemStyle(@Nullable WidgetItemStyleRemoteDto widgetItemStyleRemoteDto) {
        this.widgetItemStyle = widgetItemStyleRemoteDto;
    }

    @NotNull
    public String toString() {
        return "WidgetLayoutRemoteDto(horizontalItemsSpacing=" + this.horizontalItemsSpacing + ", verticalItemsSpacing=" + this.verticalItemsSpacing + ", itemRatio=" + this.itemRatio + ", margins=" + this.margins + ", columns=" + this.columns + ", widgetItemStyle=" + this.widgetItemStyle + ", maxDisplayItemsCount=" + this.maxDisplayItemsCount + ')';
    }
}
