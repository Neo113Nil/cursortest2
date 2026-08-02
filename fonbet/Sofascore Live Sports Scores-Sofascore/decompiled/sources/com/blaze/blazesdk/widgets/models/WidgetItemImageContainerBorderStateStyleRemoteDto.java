package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.ironsource.C4018c8;
import defpackage.b6h;
import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006$"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStateStyleRemoteDto;", "", C4018c8.k, "", "color", "", "insets", "", "width", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getInsets", "()Ljava/lang/Integer;", "setInsets", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStateStyleRemoteDto;", "equals", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemImageContainerBorderStateStyleRemoteDto {
    public static final int $stable = 8;

    @b6h("color")
    @Nullable
    private String color;

    @b6h("insets")
    @Nullable
    private Integer insets;

    @b6h(C4018c8.k)
    @Nullable
    private Boolean isVisible;

    @b6h("width")
    @Nullable
    private Integer width;

    public WidgetItemImageContainerBorderStateStyleRemoteDto(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.isVisible = bool;
        this.color = str;
        this.insets = num;
        this.width = num2;
    }

    public static /* synthetic */ WidgetItemImageContainerBorderStateStyleRemoteDto copy$default(WidgetItemImageContainerBorderStateStyleRemoteDto widgetItemImageContainerBorderStateStyleRemoteDto, Boolean bool, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = widgetItemImageContainerBorderStateStyleRemoteDto.isVisible;
        }
        if ((i & 2) != 0) {
            str = widgetItemImageContainerBorderStateStyleRemoteDto.color;
        }
        if ((i & 4) != 0) {
            num = widgetItemImageContainerBorderStateStyleRemoteDto.insets;
        }
        if ((i & 8) != 0) {
            num2 = widgetItemImageContainerBorderStateStyleRemoteDto.width;
        }
        return widgetItemImageContainerBorderStateStyleRemoteDto.copy(bool, str, num, num2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getInsets() {
        return this.insets;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @NotNull
    public final WidgetItemImageContainerBorderStateStyleRemoteDto copy(@Nullable Boolean isVisible, @Nullable String color, @Nullable Integer insets, @Nullable Integer width) {
        return new WidgetItemImageContainerBorderStateStyleRemoteDto(isVisible, color, insets, width);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemImageContainerBorderStateStyleRemoteDto)) {
            return false;
        }
        WidgetItemImageContainerBorderStateStyleRemoteDto widgetItemImageContainerBorderStateStyleRemoteDto = (WidgetItemImageContainerBorderStateStyleRemoteDto) other;
        return Intrinsics.c(this.isVisible, widgetItemImageContainerBorderStateStyleRemoteDto.isVisible) && Intrinsics.c(this.color, widgetItemImageContainerBorderStateStyleRemoteDto.color) && Intrinsics.c(this.insets, widgetItemImageContainerBorderStateStyleRemoteDto.insets) && Intrinsics.c(this.width, widgetItemImageContainerBorderStateStyleRemoteDto.width);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getInsets() {
        return this.insets;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Boolean bool = this.isVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.insets;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setInsets(@Nullable Integer num) {
        this.insets = num;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.isVisible = bool;
    }

    public final void setWidth(@Nullable Integer num) {
        this.width = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WidgetItemImageContainerBorderStateStyleRemoteDto(isVisible=");
        sb.append(this.isVisible);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", insets=");
        sb.append(this.insets);
        sb.append(", width=");
        return bf3.n(sb, this.width, ')');
    }
}
