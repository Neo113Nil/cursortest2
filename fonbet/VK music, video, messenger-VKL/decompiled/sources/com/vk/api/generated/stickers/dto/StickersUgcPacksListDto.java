package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersUgcPacksListDto.kt */
/* loaded from: classes15.dex */
public final class StickersUgcPacksListDto implements Parcelable {
    public static final Parcelable.Creator<StickersUgcPacksListDto> CREATOR = new a();

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("can_hide_keyboard")
    private final boolean canHideKeyboard;

    @pmi0("is_banned")
    private final Boolean isBanned;

    @pmi0("is_keyboard_hidden")
    private final boolean isKeyboardHidden;

    @pmi0("items")
    private final List<StickersUgcPacksListItemDto> items;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("show_keyboard_onboarding")
    private final Boolean showKeyboardOnboarding;

    /* compiled from: StickersUgcPacksListDto.kt */
    public static final class a implements Parcelable.Creator<StickersUgcPacksListDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUgcPacksListDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            Boolean valueOf2;
            UserId userId = (UserId) parcel.readParcelable(StickersUgcPacksListDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                z = true;
                if (i == readInt) {
                    break;
                }
                i = en.a(StickersUgcPacksListItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z = false;
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            return new StickersUgcPacksListDto(userId, arrayList, z3, z, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUgcPacksListDto[] newArray(int i) {
            return new StickersUgcPacksListDto[i];
        }
    }

    public StickersUgcPacksListDto(UserId userId, List<StickersUgcPacksListItemDto> list, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.ownerId = userId;
        this.items = list;
        this.canHideKeyboard = z;
        this.isKeyboardHidden = z2;
        this.canEdit = bool;
        this.isBanned = bool2;
        this.showKeyboardOnboarding = bool3;
    }

    public final Boolean d() {
        return this.canEdit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.canHideKeyboard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersUgcPacksListDto)) {
            return false;
        }
        StickersUgcPacksListDto stickersUgcPacksListDto = (StickersUgcPacksListDto) obj;
        return epx.f(this.ownerId, stickersUgcPacksListDto.ownerId) && epx.f(this.items, stickersUgcPacksListDto.items) && this.canHideKeyboard == stickersUgcPacksListDto.canHideKeyboard && this.isKeyboardHidden == stickersUgcPacksListDto.isKeyboardHidden && epx.f(this.canEdit, stickersUgcPacksListDto.canEdit) && epx.f(this.isBanned, stickersUgcPacksListDto.isBanned) && epx.f(this.showKeyboardOnboarding, stickersUgcPacksListDto.showKeyboardOnboarding);
    }

    public final List<StickersUgcPacksListItemDto> f() {
        return this.items;
    }

    public final Boolean g() {
        return this.showKeyboardOnboarding;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(fw3.a(Long.hashCode(this.ownerId.b) * 31, 31, this.items), 31, this.canHideKeyboard), 31, this.isKeyboardHidden);
        Boolean bool = this.canEdit;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBanned;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showKeyboardOnboarding;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isBanned;
    }

    public final boolean j() {
        return this.isKeyboardHidden;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersUgcPacksListDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", canHideKeyboard=");
        sb.append(this.canHideKeyboard);
        sb.append(", isKeyboardHidden=");
        sb.append(this.isKeyboardHidden);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", isBanned=");
        sb.append(this.isBanned);
        sb.append(", showKeyboardOnboarding=");
        return tn.a(sb, this.showKeyboardOnboarding, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StickersUgcPacksListItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canHideKeyboard ? 1 : 0);
        parcel.writeInt(this.isKeyboardHidden ? 1 : 0);
        Boolean bool = this.canEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBanned;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.showKeyboardOnboarding;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ StickersUgcPacksListDto(UserId userId, List list, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(userId, list, z, z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3);
    }
}
