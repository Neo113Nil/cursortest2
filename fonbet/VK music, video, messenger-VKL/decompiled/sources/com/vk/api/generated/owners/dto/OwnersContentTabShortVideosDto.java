package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: OwnersContentTabShortVideosDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabShortVideosDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabShortVideosDto> CREATOR = new a();

    @pmi0("base_configuration")
    private final OwnersContentTabBaseDto baseConfiguration;

    @pmi0("co_owner_invitations_count")
    private final Integer coOwnerInvitationsCount;

    @pmi0("collections")
    private final List<OwnersContentTabCollectionDto> collections;

    /* compiled from: OwnersContentTabShortVideosDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabShortVideosDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabShortVideosDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            OwnersContentTabBaseDto createFromParcel = parcel.readInt() == 0 ? null : OwnersContentTabBaseDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OwnersContentTabCollectionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new OwnersContentTabShortVideosDto(createFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabShortVideosDto[] newArray(int i) {
            return new OwnersContentTabShortVideosDto[i];
        }
    }

    public OwnersContentTabShortVideosDto() {
        this(null, null, null, 7, null);
    }

    public final OwnersContentTabBaseDto d() {
        return this.baseConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.coOwnerInvitationsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentTabShortVideosDto)) {
            return false;
        }
        OwnersContentTabShortVideosDto ownersContentTabShortVideosDto = (OwnersContentTabShortVideosDto) obj;
        return epx.f(this.baseConfiguration, ownersContentTabShortVideosDto.baseConfiguration) && epx.f(this.collections, ownersContentTabShortVideosDto.collections) && epx.f(this.coOwnerInvitationsCount, ownersContentTabShortVideosDto.coOwnerInvitationsCount);
    }

    public final List<OwnersContentTabCollectionDto> f() {
        return this.collections;
    }

    public final int hashCode() {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        int hashCode = (ownersContentTabBaseDto == null ? 0 : ownersContentTabBaseDto.hashCode()) * 31;
        List<OwnersContentTabCollectionDto> list = this.collections;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.coOwnerInvitationsCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersContentTabShortVideosDto(baseConfiguration=");
        sb.append(this.baseConfiguration);
        sb.append(", collections=");
        sb.append(this.collections);
        sb.append(", coOwnerInvitationsCount=");
        return uqi.b(sb, this.coOwnerInvitationsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        if (ownersContentTabBaseDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabBaseDto.writeToParcel(parcel, i);
        }
        List<OwnersContentTabCollectionDto> list = this.collections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((OwnersContentTabCollectionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.coOwnerInvitationsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public OwnersContentTabShortVideosDto(OwnersContentTabBaseDto ownersContentTabBaseDto, List<OwnersContentTabCollectionDto> list, Integer num) {
        this.baseConfiguration = ownersContentTabBaseDto;
        this.collections = list;
        this.coOwnerInvitationsCount = num;
    }

    public /* synthetic */ OwnersContentTabShortVideosDto(OwnersContentTabBaseDto ownersContentTabBaseDto, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabBaseDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
