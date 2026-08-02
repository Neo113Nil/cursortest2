package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderTitleDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderTitleDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderTitleDto> CREATOR = new a();

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("source_ids")
    private final List<UserId> sourceIds;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* compiled from: NewsfeedNewsfeedItemHeaderTitleDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderTitleDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTitleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId = (UserId) parcel.readParcelable(NewsfeedNewsfeedItemHeaderTitleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedNewsfeedItemHeaderTitleDto.class, parcel, arrayList, i, 1);
                }
            }
            return new NewsfeedNewsfeedItemHeaderTitleDto(userId, arrayList, parcel.readInt() != 0 ? NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTitleDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderTitleDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderTitleDto() {
        this(null, null, null, 7, null);
    }

    public final UserId d() {
        return this.sourceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.sourceIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderTitleDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = (NewsfeedNewsfeedItemHeaderTitleDto) obj;
        return epx.f(this.sourceId, newsfeedNewsfeedItemHeaderTitleDto.sourceId) && epx.f(this.sourceIds, newsfeedNewsfeedItemHeaderTitleDto.sourceIds) && epx.f(this.text, newsfeedNewsfeedItemHeaderTitleDto.text);
    }

    public final NewsfeedNewsfeedItemHeaderTextDto f() {
        return this.text;
    }

    public final int hashCode() {
        UserId userId = this.sourceId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        List<UserId> list = this.sourceIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        return hashCode2 + (newsfeedNewsfeedItemHeaderTextDto != null ? newsfeedNewsfeedItemHeaderTextDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderTitleDto(sourceId=" + this.sourceId + ", sourceIds=" + this.sourceIds + ", text=" + this.text + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.sourceId, i);
        List<UserId> list = this.sourceIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        if (newsfeedNewsfeedItemHeaderTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTextDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderTitleDto(UserId userId, List<UserId> list, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto) {
        this.sourceId = userId;
        this.sourceIds = list;
        this.text = newsfeedNewsfeedItemHeaderTextDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderTitleDto(UserId userId, List list, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto);
    }
}
