package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: WallPostingSettingsAttachmentsDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsAttachmentsDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsAttachmentsDto> CREATOR = new a();

    @pmi0("action_button_remembered")
    private final WallAttachmentsListAttachmentActionButtonDto actionButtonRemembered;

    @pmi0("action_buttons")
    private final List<WallAttachmentsActionButtonDto> actionButtons;

    @pmi0("audio")
    private final WallPostingSettingsAttachmentsAudioDto audio;

    @pmi0("carousel")
    private final WallAttachmentsConfigCarouselDto carousel;

    /* renamed from: default, reason: not valid java name */
    @pmi0(BuildConfig.FLAVOR)
    private final List<WallAttachmentsConfigDefaultItemDto> f28default;

    @pmi0("donut_goal_action_buttons")
    private final List<WallAttachmentsActionButtonDto> donutGoalActionButtons;

    @pmi0("donut_level_action_buttons")
    private final List<WallAttachmentsActionButtonDto> donutLevelActionButtons;

    @pmi0("exceptions")
    private final List<WallAttachmentsConfigExceptionDto> exceptions;

    @pmi0("geo")
    private final WallPostingSettingsAttachmentsGeoDto geo;

    @pmi0("grid")
    private final List<String> grid;

    @pmi0("is_market_link_attachment_available")
    private final boolean isMarketLinkAttachmentAvailable;

    @pmi0("is_message_to_bc_attachment_available")
    private final boolean isMessageToBcAttachmentAvailable;

    @pmi0("is_online_booking_attachment_available")
    private final boolean isOnlineBookingAttachmentAvailable;

    @pmi0("is_product_attachment_available")
    private final boolean isProductAttachmentAvailable;

    /* compiled from: WallPostingSettingsAttachmentsDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsAttachmentsDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(WallAttachmentsActionButtonDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            WallAttachmentsListAttachmentActionButtonDto createFromParcel = parcel.readInt() == 0 ? null : WallAttachmentsListAttachmentActionButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(WallAttachmentsActionButtonDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(WallAttachmentsActionButtonDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(WallAttachmentsConfigExceptionDto.CREATOR, parcel, arrayList4, i5, 1);
                }
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(WallAttachmentsConfigDefaultItemDto.CREATOR, parcel, arrayList5, i, 1);
                }
            }
            return new WallPostingSettingsAttachmentsDto(z, z2, z3, z4, arrayList, createFromParcel, arrayList2, arrayList3, arrayList4, createStringArrayList, arrayList5, parcel.readInt() == 0 ? null : WallAttachmentsConfigCarouselDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingSettingsAttachmentsGeoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingSettingsAttachmentsAudioDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsDto[] newArray(int i) {
            return new WallPostingSettingsAttachmentsDto[i];
        }
    }

    public WallPostingSettingsAttachmentsDto(boolean z, boolean z2, boolean z3, boolean z4, List<WallAttachmentsActionButtonDto> list, WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto, List<WallAttachmentsActionButtonDto> list2, List<WallAttachmentsActionButtonDto> list3, List<WallAttachmentsConfigExceptionDto> list4, List<String> list5, List<WallAttachmentsConfigDefaultItemDto> list6, WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto, WallPostingSettingsAttachmentsGeoDto wallPostingSettingsAttachmentsGeoDto, WallPostingSettingsAttachmentsAudioDto wallPostingSettingsAttachmentsAudioDto) {
        this.isOnlineBookingAttachmentAvailable = z;
        this.isProductAttachmentAvailable = z2;
        this.isMarketLinkAttachmentAvailable = z3;
        this.isMessageToBcAttachmentAvailable = z4;
        this.actionButtons = list;
        this.actionButtonRemembered = wallAttachmentsListAttachmentActionButtonDto;
        this.donutLevelActionButtons = list2;
        this.donutGoalActionButtons = list3;
        this.exceptions = list4;
        this.grid = list5;
        this.f28default = list6;
        this.carousel = wallAttachmentsConfigCarouselDto;
        this.geo = wallPostingSettingsAttachmentsGeoDto;
        this.audio = wallPostingSettingsAttachmentsAudioDto;
    }

    public final WallAttachmentsListAttachmentActionButtonDto d() {
        return this.actionButtonRemembered;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallAttachmentsActionButtonDto> e() {
        return this.actionButtons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsAttachmentsDto)) {
            return false;
        }
        WallPostingSettingsAttachmentsDto wallPostingSettingsAttachmentsDto = (WallPostingSettingsAttachmentsDto) obj;
        return this.isOnlineBookingAttachmentAvailable == wallPostingSettingsAttachmentsDto.isOnlineBookingAttachmentAvailable && this.isProductAttachmentAvailable == wallPostingSettingsAttachmentsDto.isProductAttachmentAvailable && this.isMarketLinkAttachmentAvailable == wallPostingSettingsAttachmentsDto.isMarketLinkAttachmentAvailable && this.isMessageToBcAttachmentAvailable == wallPostingSettingsAttachmentsDto.isMessageToBcAttachmentAvailable && epx.f(this.actionButtons, wallPostingSettingsAttachmentsDto.actionButtons) && epx.f(this.actionButtonRemembered, wallPostingSettingsAttachmentsDto.actionButtonRemembered) && epx.f(this.donutLevelActionButtons, wallPostingSettingsAttachmentsDto.donutLevelActionButtons) && epx.f(this.donutGoalActionButtons, wallPostingSettingsAttachmentsDto.donutGoalActionButtons) && epx.f(this.exceptions, wallPostingSettingsAttachmentsDto.exceptions) && epx.f(this.grid, wallPostingSettingsAttachmentsDto.grid) && epx.f(this.f28default, wallPostingSettingsAttachmentsDto.f28default) && epx.f(this.carousel, wallPostingSettingsAttachmentsDto.carousel) && epx.f(this.geo, wallPostingSettingsAttachmentsDto.geo) && epx.f(this.audio, wallPostingSettingsAttachmentsDto.audio);
    }

    public final WallPostingSettingsAttachmentsAudioDto f() {
        return this.audio;
    }

    public final List<WallAttachmentsActionButtonDto> g() {
        return this.donutGoalActionButtons;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.isOnlineBookingAttachmentAvailable) * 31, 31, this.isProductAttachmentAvailable), 31, this.isMarketLinkAttachmentAvailable), 31, this.isMessageToBcAttachmentAvailable);
        List<WallAttachmentsActionButtonDto> list = this.actionButtons;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto = this.actionButtonRemembered;
        int hashCode2 = (hashCode + (wallAttachmentsListAttachmentActionButtonDto == null ? 0 : wallAttachmentsListAttachmentActionButtonDto.hashCode())) * 31;
        List<WallAttachmentsActionButtonDto> list2 = this.donutLevelActionButtons;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WallAttachmentsActionButtonDto> list3 = this.donutGoalActionButtons;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<WallAttachmentsConfigExceptionDto> list4 = this.exceptions;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.grid;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<WallAttachmentsConfigDefaultItemDto> list6 = this.f28default;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto = this.carousel;
        int hashCode8 = (hashCode7 + (wallAttachmentsConfigCarouselDto == null ? 0 : wallAttachmentsConfigCarouselDto.hashCode())) * 31;
        WallPostingSettingsAttachmentsGeoDto wallPostingSettingsAttachmentsGeoDto = this.geo;
        int hashCode9 = (hashCode8 + (wallPostingSettingsAttachmentsGeoDto == null ? 0 : wallPostingSettingsAttachmentsGeoDto.hashCode())) * 31;
        WallPostingSettingsAttachmentsAudioDto wallPostingSettingsAttachmentsAudioDto = this.audio;
        return hashCode9 + (wallPostingSettingsAttachmentsAudioDto != null ? wallPostingSettingsAttachmentsAudioDto.hashCode() : 0);
    }

    public final List<WallAttachmentsActionButtonDto> i() {
        return this.donutLevelActionButtons;
    }

    public final WallPostingSettingsAttachmentsGeoDto j() {
        return this.geo;
    }

    public final boolean k() {
        return this.isProductAttachmentAvailable;
    }

    public final String toString() {
        return "WallPostingSettingsAttachmentsDto(isOnlineBookingAttachmentAvailable=" + this.isOnlineBookingAttachmentAvailable + ", isProductAttachmentAvailable=" + this.isProductAttachmentAvailable + ", isMarketLinkAttachmentAvailable=" + this.isMarketLinkAttachmentAvailable + ", isMessageToBcAttachmentAvailable=" + this.isMessageToBcAttachmentAvailable + ", actionButtons=" + this.actionButtons + ", actionButtonRemembered=" + this.actionButtonRemembered + ", donutLevelActionButtons=" + this.donutLevelActionButtons + ", donutGoalActionButtons=" + this.donutGoalActionButtons + ", exceptions=" + this.exceptions + ", grid=" + this.grid + ", default=" + this.f28default + ", carousel=" + this.carousel + ", geo=" + this.geo + ", audio=" + this.audio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isOnlineBookingAttachmentAvailable ? 1 : 0);
        parcel.writeInt(this.isProductAttachmentAvailable ? 1 : 0);
        parcel.writeInt(this.isMarketLinkAttachmentAvailable ? 1 : 0);
        parcel.writeInt(this.isMessageToBcAttachmentAvailable ? 1 : 0);
        List<WallAttachmentsActionButtonDto> list = this.actionButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((WallAttachmentsActionButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto = this.actionButtonRemembered;
        if (wallAttachmentsListAttachmentActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachmentsListAttachmentActionButtonDto.writeToParcel(parcel, i);
        }
        List<WallAttachmentsActionButtonDto> list2 = this.donutLevelActionButtons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((WallAttachmentsActionButtonDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<WallAttachmentsActionButtonDto> list3 = this.donutGoalActionButtons;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((WallAttachmentsActionButtonDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<WallAttachmentsConfigExceptionDto> list4 = this.exceptions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((WallAttachmentsConfigExceptionDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.grid);
        List<WallAttachmentsConfigDefaultItemDto> list5 = this.f28default;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((WallAttachmentsConfigDefaultItemDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto = this.carousel;
        if (wallAttachmentsConfigCarouselDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachmentsConfigCarouselDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsAttachmentsGeoDto wallPostingSettingsAttachmentsGeoDto = this.geo;
        if (wallPostingSettingsAttachmentsGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsAttachmentsGeoDto.writeToParcel(parcel, i);
        }
        WallPostingSettingsAttachmentsAudioDto wallPostingSettingsAttachmentsAudioDto = this.audio;
        if (wallPostingSettingsAttachmentsAudioDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsAttachmentsAudioDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallPostingSettingsAttachmentsDto(boolean z, boolean z2, boolean z3, boolean z4, List list, WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto, List list2, List list3, List list4, List list5, List list6, WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto, WallPostingSettingsAttachmentsGeoDto wallPostingSettingsAttachmentsGeoDto, WallPostingSettingsAttachmentsAudioDto wallPostingSettingsAttachmentsAudioDto, int i, zcl zclVar) {
        this(z, z2, z3, z4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : wallAttachmentsListAttachmentActionButtonDto, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : list4, (i & 512) != 0 ? null : list5, (i & 1024) != 0 ? null : list6, (i & 2048) != 0 ? null : wallAttachmentsConfigCarouselDto, (i & 4096) != 0 ? null : wallPostingSettingsAttachmentsGeoDto, (i & 8192) != 0 ? null : wallPostingSettingsAttachmentsAudioDto);
    }
}
