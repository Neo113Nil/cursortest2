package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: UsersTabSettingsDto.kt */
/* loaded from: classes15.dex */
public final class UsersTabSettingsDto implements Parcelable {
    public static final Parcelable.Creator<UsersTabSettingsDto> CREATOR = new a();

    @pmi0("additional_flags")
    private final List<String> additionalFlags;

    @pmi0("can_add_button")
    private final Boolean canAddButton;

    @pmi0("collections")
    private final List<UsersTabCollectionDto> collections;

    @pmi0("content_types")
    private final List<UsersContentTypeDto> contentTypes;

    @pmi0("has_private_mark")
    private final Boolean hasPrivateMark;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("name")
    private final UsersScrollableContentTabDto name;

    @pmi0("special_values")
    private final UsersTabSpecialValuesDto specialValues;

    @pmi0("to_section_button")
    private final Boolean toSectionButton;

    /* compiled from: UsersTabSettingsDto.kt */
    public static final class a implements Parcelable.Creator<UsersTabSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersTabSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            ArrayList arrayList;
            ArrayList arrayList2;
            UsersScrollableContentTabDto createFromParcel = parcel.readInt() == 0 ? null : UsersScrollableContentTabDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            UsersTabSpecialValuesDto createFromParcel2 = parcel.readInt() == 0 ? null : UsersTabSpecialValuesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(UsersTabCollectionDto.CREATOR, parcel, arrayList3, i2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(UsersContentTypeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new UsersTabSettingsDto(createFromParcel, valueOf, valueOf2, valueOf3, valueOf4, createStringArrayList, createFromParcel2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersTabSettingsDto[] newArray(int i) {
            return new UsersTabSettingsDto[i];
        }
    }

    public UsersTabSettingsDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final Boolean Q() {
        return this.isPinned;
    }

    public final List<String> d() {
        return this.additionalFlags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canAddButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersTabSettingsDto)) {
            return false;
        }
        UsersTabSettingsDto usersTabSettingsDto = (UsersTabSettingsDto) obj;
        return this.name == usersTabSettingsDto.name && epx.f(this.isPinned, usersTabSettingsDto.isPinned) && epx.f(this.canAddButton, usersTabSettingsDto.canAddButton) && epx.f(this.toSectionButton, usersTabSettingsDto.toSectionButton) && epx.f(this.hasPrivateMark, usersTabSettingsDto.hasPrivateMark) && epx.f(this.additionalFlags, usersTabSettingsDto.additionalFlags) && epx.f(this.specialValues, usersTabSettingsDto.specialValues) && epx.f(this.collections, usersTabSettingsDto.collections) && epx.f(this.contentTypes, usersTabSettingsDto.contentTypes);
    }

    public final List<UsersTabCollectionDto> f() {
        return this.collections;
    }

    public final List<UsersContentTypeDto> g() {
        return this.contentTypes;
    }

    public final int hashCode() {
        UsersScrollableContentTabDto usersScrollableContentTabDto = this.name;
        int hashCode = (usersScrollableContentTabDto == null ? 0 : usersScrollableContentTabDto.hashCode()) * 31;
        Boolean bool = this.isPinned;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAddButton;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.toSectionButton;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasPrivateMark;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.additionalFlags;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        UsersTabSpecialValuesDto usersTabSpecialValuesDto = this.specialValues;
        int hashCode7 = (hashCode6 + (usersTabSpecialValuesDto == null ? 0 : usersTabSpecialValuesDto.hashCode())) * 31;
        List<UsersTabCollectionDto> list2 = this.collections;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersContentTypeDto> list3 = this.contentTypes;
        return hashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final UsersScrollableContentTabDto i() {
        return this.name;
    }

    public final UsersTabSpecialValuesDto j() {
        return this.specialValues;
    }

    public final Boolean k() {
        return this.toSectionButton;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersTabSettingsDto(name=");
        sb.append(this.name);
        sb.append(", isPinned=");
        sb.append(this.isPinned);
        sb.append(", canAddButton=");
        sb.append(this.canAddButton);
        sb.append(", toSectionButton=");
        sb.append(this.toSectionButton);
        sb.append(", hasPrivateMark=");
        sb.append(this.hasPrivateMark);
        sb.append(", additionalFlags=");
        sb.append(this.additionalFlags);
        sb.append(", specialValues=");
        sb.append(this.specialValues);
        sb.append(", collections=");
        sb.append(this.collections);
        sb.append(", contentTypes=");
        return ms9.a(')', sb, this.contentTypes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UsersScrollableContentTabDto usersScrollableContentTabDto = this.name;
        if (usersScrollableContentTabDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersScrollableContentTabDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isPinned;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAddButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.toSectionButton;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasPrivateMark;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeStringList(this.additionalFlags);
        UsersTabSpecialValuesDto usersTabSpecialValuesDto = this.specialValues;
        if (usersTabSpecialValuesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersTabSpecialValuesDto.writeToParcel(parcel, i);
        }
        List<UsersTabCollectionDto> list = this.collections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UsersTabCollectionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersContentTypeDto> list2 = this.contentTypes;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((UsersContentTypeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersTabSettingsDto(UsersScrollableContentTabDto usersScrollableContentTabDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list, UsersTabSpecialValuesDto usersTabSpecialValuesDto, List<UsersTabCollectionDto> list2, List<? extends UsersContentTypeDto> list3) {
        this.name = usersScrollableContentTabDto;
        this.isPinned = bool;
        this.canAddButton = bool2;
        this.toSectionButton = bool3;
        this.hasPrivateMark = bool4;
        this.additionalFlags = list;
        this.specialValues = usersTabSpecialValuesDto;
        this.collections = list2;
        this.contentTypes = list3;
    }

    public /* synthetic */ UsersTabSettingsDto(UsersScrollableContentTabDto usersScrollableContentTabDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, UsersTabSpecialValuesDto usersTabSpecialValuesDto, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : usersScrollableContentTabDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : usersTabSpecialValuesDto, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3);
    }
}
