package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemRecognizeBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosGetRecognitionBlockExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetRecognitionBlockExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetRecognitionBlockExtendedResponseDto> CREATOR = new a();

    @pmi0("block")
    private final NewsfeedItemRecognizeBlockDto block;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: PhotosGetRecognitionBlockExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetRecognitionBlockExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetRecognitionBlockExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(PhotosGetRecognitionBlockExtendedResponseDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(PhotosGetRecognitionBlockExtendedResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new PhotosGetRecognitionBlockExtendedResponseDto(arrayList, arrayList2, parcel.readInt() == 0 ? null : NewsfeedItemRecognizeBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetRecognitionBlockExtendedResponseDto[] newArray(int i) {
            return new PhotosGetRecognitionBlockExtendedResponseDto[i];
        }
    }

    public PhotosGetRecognitionBlockExtendedResponseDto(List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto) {
        this.profiles = list;
        this.groups = list2;
        this.block = newsfeedItemRecognizeBlockDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetRecognitionBlockExtendedResponseDto)) {
            return false;
        }
        PhotosGetRecognitionBlockExtendedResponseDto photosGetRecognitionBlockExtendedResponseDto = (PhotosGetRecognitionBlockExtendedResponseDto) obj;
        return epx.f(this.profiles, photosGetRecognitionBlockExtendedResponseDto.profiles) && epx.f(this.groups, photosGetRecognitionBlockExtendedResponseDto.groups) && epx.f(this.block, photosGetRecognitionBlockExtendedResponseDto.block);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.profiles.hashCode() * 31, 31, this.groups);
        NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto = this.block;
        return a2 + (newsfeedItemRecognizeBlockDto == null ? 0 : newsfeedItemRecognizeBlockDto.hashCode());
    }

    public final String toString() {
        return "PhotosGetRecognitionBlockExtendedResponseDto(profiles=" + this.profiles + ", groups=" + this.groups + ", block=" + this.block + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.profiles);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.groups);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto = this.block;
        if (newsfeedItemRecognizeBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemRecognizeBlockDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PhotosGetRecognitionBlockExtendedResponseDto(List list, List list2, NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto, int i, zcl zclVar) {
        this(list, list2, (i & 4) != 0 ? null : newsfeedItemRecognizeBlockDto);
    }
}
