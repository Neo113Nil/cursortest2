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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003Jn\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0004\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R \u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R \u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!¨\u00068"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;", "", "position", "Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;", C4018c8.k, "", "margins", "Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "statusTitlePadding", "liveUnreadState", "Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;", "liveReadState", "unreadState", "readState", "<init>", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;Ljava/lang/Boolean;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;)V", "getPosition", "()Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;", "setPosition", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;)V", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMargins", "()Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "setMargins", "(Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;)V", "getStatusTitlePadding", "setStatusTitlePadding", "getLiveUnreadState", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;", "setLiveUnreadState", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;)V", "getLiveReadState", "setLiveReadState", "getUnreadState", "setUnreadState", "getReadState", "setReadState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;Ljava/lang/Boolean;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStateStyleRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemStatusIndicatorStyleRemoteDto;", "equals", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemStatusIndicatorStyleRemoteDto {
    public static final int $stable = 8;

    @b6h(C4018c8.k)
    @Nullable
    private Boolean isVisible;

    @b6h("liveReadState")
    @Nullable
    private WidgetItemStatusIndicatorStateStyleRemoteDto liveReadState;

    @b6h("liveUnreadState")
    @Nullable
    private WidgetItemStatusIndicatorStateStyleRemoteDto liveUnreadState;

    @b6h("margins")
    @Nullable
    private InsetsRemoteDto margins;

    @b6h("position")
    @Nullable
    private ObjectPositioningRemoteDto position;

    @b6h("readState")
    @Nullable
    private WidgetItemStatusIndicatorStateStyleRemoteDto readState;

    @b6h("statusTitlePadding")
    @Nullable
    private InsetsRemoteDto statusTitlePadding;

    @b6h("unreadState")
    @Nullable
    private WidgetItemStatusIndicatorStateStyleRemoteDto unreadState;

    public WidgetItemStatusIndicatorStyleRemoteDto(@Nullable ObjectPositioningRemoteDto objectPositioningRemoteDto, @Nullable Boolean bool, @Nullable InsetsRemoteDto insetsRemoteDto, @Nullable InsetsRemoteDto insetsRemoteDto2, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto2, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto3, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto4) {
        this.position = objectPositioningRemoteDto;
        this.isVisible = bool;
        this.margins = insetsRemoteDto;
        this.statusTitlePadding = insetsRemoteDto2;
        this.liveUnreadState = widgetItemStatusIndicatorStateStyleRemoteDto;
        this.liveReadState = widgetItemStatusIndicatorStateStyleRemoteDto2;
        this.unreadState = widgetItemStatusIndicatorStateStyleRemoteDto3;
        this.readState = widgetItemStatusIndicatorStateStyleRemoteDto4;
    }

    public static /* synthetic */ WidgetItemStatusIndicatorStyleRemoteDto copy$default(WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto, ObjectPositioningRemoteDto objectPositioningRemoteDto, Boolean bool, InsetsRemoteDto insetsRemoteDto, InsetsRemoteDto insetsRemoteDto2, WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto, WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto2, WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto3, WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            objectPositioningRemoteDto = widgetItemStatusIndicatorStyleRemoteDto.position;
        }
        if ((i & 2) != 0) {
            bool = widgetItemStatusIndicatorStyleRemoteDto.isVisible;
        }
        if ((i & 4) != 0) {
            insetsRemoteDto = widgetItemStatusIndicatorStyleRemoteDto.margins;
        }
        if ((i & 8) != 0) {
            insetsRemoteDto2 = widgetItemStatusIndicatorStyleRemoteDto.statusTitlePadding;
        }
        if ((i & 16) != 0) {
            widgetItemStatusIndicatorStateStyleRemoteDto = widgetItemStatusIndicatorStyleRemoteDto.liveUnreadState;
        }
        if ((i & 32) != 0) {
            widgetItemStatusIndicatorStateStyleRemoteDto2 = widgetItemStatusIndicatorStyleRemoteDto.liveReadState;
        }
        if ((i & 64) != 0) {
            widgetItemStatusIndicatorStateStyleRemoteDto3 = widgetItemStatusIndicatorStyleRemoteDto.unreadState;
        }
        if ((i & 128) != 0) {
            widgetItemStatusIndicatorStateStyleRemoteDto4 = widgetItemStatusIndicatorStyleRemoteDto.readState;
        }
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto5 = widgetItemStatusIndicatorStateStyleRemoteDto3;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto6 = widgetItemStatusIndicatorStateStyleRemoteDto4;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto7 = widgetItemStatusIndicatorStateStyleRemoteDto;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto8 = widgetItemStatusIndicatorStateStyleRemoteDto2;
        return widgetItemStatusIndicatorStyleRemoteDto.copy(objectPositioningRemoteDto, bool, insetsRemoteDto, insetsRemoteDto2, widgetItemStatusIndicatorStateStyleRemoteDto7, widgetItemStatusIndicatorStateStyleRemoteDto8, widgetItemStatusIndicatorStateStyleRemoteDto5, widgetItemStatusIndicatorStateStyleRemoteDto6);
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
    public final InsetsRemoteDto getStatusTitlePadding() {
        return this.statusTitlePadding;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getLiveReadState() {
        return this.liveReadState;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getUnreadState() {
        return this.unreadState;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getReadState() {
        return this.readState;
    }

    @NotNull
    public final WidgetItemStatusIndicatorStyleRemoteDto copy(@Nullable ObjectPositioningRemoteDto position, @Nullable Boolean isVisible, @Nullable InsetsRemoteDto margins, @Nullable InsetsRemoteDto statusTitlePadding, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto liveUnreadState, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto liveReadState, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto unreadState, @Nullable WidgetItemStatusIndicatorStateStyleRemoteDto readState) {
        return new WidgetItemStatusIndicatorStyleRemoteDto(position, isVisible, margins, statusTitlePadding, liveUnreadState, liveReadState, unreadState, readState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemStatusIndicatorStyleRemoteDto)) {
            return false;
        }
        WidgetItemStatusIndicatorStyleRemoteDto widgetItemStatusIndicatorStyleRemoteDto = (WidgetItemStatusIndicatorStyleRemoteDto) other;
        return Intrinsics.c(this.position, widgetItemStatusIndicatorStyleRemoteDto.position) && Intrinsics.c(this.isVisible, widgetItemStatusIndicatorStyleRemoteDto.isVisible) && Intrinsics.c(this.margins, widgetItemStatusIndicatorStyleRemoteDto.margins) && Intrinsics.c(this.statusTitlePadding, widgetItemStatusIndicatorStyleRemoteDto.statusTitlePadding) && Intrinsics.c(this.liveUnreadState, widgetItemStatusIndicatorStyleRemoteDto.liveUnreadState) && Intrinsics.c(this.liveReadState, widgetItemStatusIndicatorStyleRemoteDto.liveReadState) && Intrinsics.c(this.unreadState, widgetItemStatusIndicatorStyleRemoteDto.unreadState) && Intrinsics.c(this.readState, widgetItemStatusIndicatorStyleRemoteDto.readState);
    }

    @Nullable
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getLiveReadState() {
        return this.liveReadState;
    }

    @Nullable
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getLiveUnreadState() {
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
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getReadState() {
        return this.readState;
    }

    @Nullable
    public final InsetsRemoteDto getStatusTitlePadding() {
        return this.statusTitlePadding;
    }

    @Nullable
    public final WidgetItemStatusIndicatorStateStyleRemoteDto getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        ObjectPositioningRemoteDto objectPositioningRemoteDto = this.position;
        int hashCode = (objectPositioningRemoteDto == null ? 0 : objectPositioningRemoteDto.hashCode()) * 31;
        Boolean bool = this.isVisible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto = this.margins;
        int hashCode3 = (hashCode2 + (insetsRemoteDto == null ? 0 : insetsRemoteDto.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto2 = this.statusTitlePadding;
        int hashCode4 = (hashCode3 + (insetsRemoteDto2 == null ? 0 : insetsRemoteDto2.hashCode())) * 31;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto = this.liveUnreadState;
        int hashCode5 = (hashCode4 + (widgetItemStatusIndicatorStateStyleRemoteDto == null ? 0 : widgetItemStatusIndicatorStateStyleRemoteDto.hashCode())) * 31;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto2 = this.liveReadState;
        int hashCode6 = (hashCode5 + (widgetItemStatusIndicatorStateStyleRemoteDto2 == null ? 0 : widgetItemStatusIndicatorStateStyleRemoteDto2.hashCode())) * 31;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto3 = this.unreadState;
        int hashCode7 = (hashCode6 + (widgetItemStatusIndicatorStateStyleRemoteDto3 == null ? 0 : widgetItemStatusIndicatorStateStyleRemoteDto3.hashCode())) * 31;
        WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto4 = this.readState;
        return hashCode7 + (widgetItemStatusIndicatorStateStyleRemoteDto4 != null ? widgetItemStatusIndicatorStateStyleRemoteDto4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setLiveReadState(@Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto) {
        this.liveReadState = widgetItemStatusIndicatorStateStyleRemoteDto;
    }

    public final void setLiveUnreadState(@Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto) {
        this.liveUnreadState = widgetItemStatusIndicatorStateStyleRemoteDto;
    }

    public final void setMargins(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.margins = insetsRemoteDto;
    }

    public final void setPosition(@Nullable ObjectPositioningRemoteDto objectPositioningRemoteDto) {
        this.position = objectPositioningRemoteDto;
    }

    public final void setReadState(@Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto) {
        this.readState = widgetItemStatusIndicatorStateStyleRemoteDto;
    }

    public final void setStatusTitlePadding(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.statusTitlePadding = insetsRemoteDto;
    }

    public final void setUnreadState(@Nullable WidgetItemStatusIndicatorStateStyleRemoteDto widgetItemStatusIndicatorStateStyleRemoteDto) {
        this.unreadState = widgetItemStatusIndicatorStateStyleRemoteDto;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.isVisible = bool;
    }

    @NotNull
    public String toString() {
        return "WidgetItemStatusIndicatorStyleRemoteDto(position=" + this.position + ", isVisible=" + this.isVisible + ", margins=" + this.margins + ", statusTitlePadding=" + this.statusTitlePadding + ", liveUnreadState=" + this.liveUnreadState + ", liveReadState=" + this.liveReadState + ", unreadState=" + this.unreadState + ", readState=" + this.readState + ')';
    }
}
