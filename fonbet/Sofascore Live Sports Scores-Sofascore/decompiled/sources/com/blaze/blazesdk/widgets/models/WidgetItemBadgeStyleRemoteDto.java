package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.ironsource.C4018c8;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003Jn\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0004\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R \u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R \u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!¨\u00068"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;", "", "position", "Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;", C4018c8.k, "", "margins", "Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "insets", "liveUnreadState", "Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;", "liveReadState", "unreadState", "readState", "<init>", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;Ljava/lang/Boolean;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;)V", "getPosition", "()Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;", "setPosition", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;)V", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMargins", "()Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "setMargins", "(Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;)V", "getInsets", "setInsets", "getLiveUnreadState", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;", "setLiveUnreadState", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;)V", "getLiveReadState", "setLiveReadState", "getUnreadState", "setUnreadState", "getReadState", "setReadState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;Ljava/lang/Boolean;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStateStyleRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemBadgeStyleRemoteDto;", "equals", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemBadgeStyleRemoteDto {
    public static final int $stable = 8;

    @b6h("insets")
    @Nullable
    private InsetsRemoteDto insets;

    @b6h(C4018c8.k)
    @Nullable
    private Boolean isVisible;

    @b6h("liveReadState")
    @Nullable
    private WidgetItemBadgeStateStyleRemoteDto liveReadState;

    @b6h("liveUnreadState")
    @Nullable
    private WidgetItemBadgeStateStyleRemoteDto liveUnreadState;

    @b6h("margins")
    @Nullable
    private InsetsRemoteDto margins;

    @b6h("position")
    @Nullable
    private ObjectPositioningRemoteDto position;

    @b6h("readState")
    @Nullable
    private WidgetItemBadgeStateStyleRemoteDto readState;

    @b6h("unreadState")
    @Nullable
    private WidgetItemBadgeStateStyleRemoteDto unreadState;

    public WidgetItemBadgeStyleRemoteDto(@Nullable ObjectPositioningRemoteDto objectPositioningRemoteDto, @Nullable Boolean bool, @Nullable InsetsRemoteDto insetsRemoteDto, @Nullable InsetsRemoteDto insetsRemoteDto2, @Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto, @Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto2, @Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto3, @Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto4) {
        this.position = objectPositioningRemoteDto;
        this.isVisible = bool;
        this.margins = insetsRemoteDto;
        this.insets = insetsRemoteDto2;
        this.liveUnreadState = widgetItemBadgeStateStyleRemoteDto;
        this.liveReadState = widgetItemBadgeStateStyleRemoteDto2;
        this.unreadState = widgetItemBadgeStateStyleRemoteDto3;
        this.readState = widgetItemBadgeStateStyleRemoteDto4;
    }

    public static /* synthetic */ WidgetItemBadgeStyleRemoteDto copy$default(WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto, ObjectPositioningRemoteDto objectPositioningRemoteDto, Boolean bool, InsetsRemoteDto insetsRemoteDto, InsetsRemoteDto insetsRemoteDto2, WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto, WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto2, WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto3, WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            objectPositioningRemoteDto = widgetItemBadgeStyleRemoteDto.position;
        }
        if ((i & 2) != 0) {
            bool = widgetItemBadgeStyleRemoteDto.isVisible;
        }
        if ((i & 4) != 0) {
            insetsRemoteDto = widgetItemBadgeStyleRemoteDto.margins;
        }
        if ((i & 8) != 0) {
            insetsRemoteDto2 = widgetItemBadgeStyleRemoteDto.insets;
        }
        if ((i & 16) != 0) {
            widgetItemBadgeStateStyleRemoteDto = widgetItemBadgeStyleRemoteDto.liveUnreadState;
        }
        if ((i & 32) != 0) {
            widgetItemBadgeStateStyleRemoteDto2 = widgetItemBadgeStyleRemoteDto.liveReadState;
        }
        if ((i & 64) != 0) {
            widgetItemBadgeStateStyleRemoteDto3 = widgetItemBadgeStyleRemoteDto.unreadState;
        }
        if ((i & 128) != 0) {
            widgetItemBadgeStateStyleRemoteDto4 = widgetItemBadgeStyleRemoteDto.readState;
        }
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto5 = widgetItemBadgeStateStyleRemoteDto3;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto6 = widgetItemBadgeStateStyleRemoteDto4;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto7 = widgetItemBadgeStateStyleRemoteDto;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto8 = widgetItemBadgeStateStyleRemoteDto2;
        return widgetItemBadgeStyleRemoteDto.copy(objectPositioningRemoteDto, bool, insetsRemoteDto, insetsRemoteDto2, widgetItemBadgeStateStyleRemoteDto7, widgetItemBadgeStateStyleRemoteDto8, widgetItemBadgeStateStyleRemoteDto5, widgetItemBadgeStateStyleRemoteDto6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ObjectPositioningRemoteDto getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InsetsRemoteDto getInsets() {
        return this.insets;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final WidgetItemBadgeStateStyleRemoteDto getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final WidgetItemBadgeStateStyleRemoteDto getLiveReadState() {
        return this.liveReadState;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final WidgetItemBadgeStateStyleRemoteDto getUnreadState() {
        return this.unreadState;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final WidgetItemBadgeStateStyleRemoteDto getReadState() {
        return this.readState;
    }

    @NotNull
    public final WidgetItemBadgeStyleRemoteDto copy(@Nullable ObjectPositioningRemoteDto position, @Nullable Boolean isVisible, @Nullable InsetsRemoteDto margins, @Nullable InsetsRemoteDto insets, @Nullable WidgetItemBadgeStateStyleRemoteDto liveUnreadState, @Nullable WidgetItemBadgeStateStyleRemoteDto liveReadState, @Nullable WidgetItemBadgeStateStyleRemoteDto unreadState, @Nullable WidgetItemBadgeStateStyleRemoteDto readState) {
        return new WidgetItemBadgeStyleRemoteDto(position, isVisible, margins, insets, liveUnreadState, liveReadState, unreadState, readState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemBadgeStyleRemoteDto)) {
            return false;
        }
        WidgetItemBadgeStyleRemoteDto widgetItemBadgeStyleRemoteDto = (WidgetItemBadgeStyleRemoteDto) other;
        return Intrinsics.c(this.position, widgetItemBadgeStyleRemoteDto.position) && Intrinsics.c(this.isVisible, widgetItemBadgeStyleRemoteDto.isVisible) && Intrinsics.c(this.margins, widgetItemBadgeStyleRemoteDto.margins) && Intrinsics.c(this.insets, widgetItemBadgeStyleRemoteDto.insets) && Intrinsics.c(this.liveUnreadState, widgetItemBadgeStyleRemoteDto.liveUnreadState) && Intrinsics.c(this.liveReadState, widgetItemBadgeStyleRemoteDto.liveReadState) && Intrinsics.c(this.unreadState, widgetItemBadgeStyleRemoteDto.unreadState) && Intrinsics.c(this.readState, widgetItemBadgeStyleRemoteDto.readState);
    }

    @Nullable
    public final InsetsRemoteDto getInsets() {
        return this.insets;
    }

    @Nullable
    public final WidgetItemBadgeStateStyleRemoteDto getLiveReadState() {
        return this.liveReadState;
    }

    @Nullable
    public final WidgetItemBadgeStateStyleRemoteDto getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @Nullable
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    public final ObjectPositioningRemoteDto getPosition() {
        return this.position;
    }

    @Nullable
    public final WidgetItemBadgeStateStyleRemoteDto getReadState() {
        return this.readState;
    }

    @Nullable
    public final WidgetItemBadgeStateStyleRemoteDto getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        ObjectPositioningRemoteDto objectPositioningRemoteDto = this.position;
        int hashCode = (objectPositioningRemoteDto == null ? 0 : objectPositioningRemoteDto.hashCode()) * 31;
        Boolean bool = this.isVisible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto = this.margins;
        int hashCode3 = (hashCode2 + (insetsRemoteDto == null ? 0 : insetsRemoteDto.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto2 = this.insets;
        int hashCode4 = (hashCode3 + (insetsRemoteDto2 == null ? 0 : insetsRemoteDto2.hashCode())) * 31;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto = this.liveUnreadState;
        int hashCode5 = (hashCode4 + (widgetItemBadgeStateStyleRemoteDto == null ? 0 : widgetItemBadgeStateStyleRemoteDto.hashCode())) * 31;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto2 = this.liveReadState;
        int hashCode6 = (hashCode5 + (widgetItemBadgeStateStyleRemoteDto2 == null ? 0 : widgetItemBadgeStateStyleRemoteDto2.hashCode())) * 31;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto3 = this.unreadState;
        int hashCode7 = (hashCode6 + (widgetItemBadgeStateStyleRemoteDto3 == null ? 0 : widgetItemBadgeStateStyleRemoteDto3.hashCode())) * 31;
        WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto4 = this.readState;
        return hashCode7 + (widgetItemBadgeStateStyleRemoteDto4 != null ? widgetItemBadgeStateStyleRemoteDto4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setInsets(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.insets = insetsRemoteDto;
    }

    public final void setLiveReadState(@Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto) {
        this.liveReadState = widgetItemBadgeStateStyleRemoteDto;
    }

    public final void setLiveUnreadState(@Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto) {
        this.liveUnreadState = widgetItemBadgeStateStyleRemoteDto;
    }

    public final void setMargins(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.margins = insetsRemoteDto;
    }

    public final void setPosition(@Nullable ObjectPositioningRemoteDto objectPositioningRemoteDto) {
        this.position = objectPositioningRemoteDto;
    }

    public final void setReadState(@Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto) {
        this.readState = widgetItemBadgeStateStyleRemoteDto;
    }

    public final void setUnreadState(@Nullable WidgetItemBadgeStateStyleRemoteDto widgetItemBadgeStateStyleRemoteDto) {
        this.unreadState = widgetItemBadgeStateStyleRemoteDto;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.isVisible = bool;
    }

    @NotNull
    public String toString() {
        return "WidgetItemBadgeStyleRemoteDto(position=" + this.position + ", isVisible=" + this.isVisible + ", margins=" + this.margins + ", insets=" + this.insets + ", liveUnreadState=" + this.liveUnreadState + ", liveReadState=" + this.liveReadState + ", unreadState=" + this.unreadState + ", readState=" + this.readState + ')';
    }
}
