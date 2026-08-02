package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: PhotosPhotoTagDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoTagDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoTagDto> CREATOR = new a();

    @pmi0("date")
    private final int date;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("placer_id")
    private final int placerId;

    @pmi0("tagged_name")
    private final String taggedName;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("viewed")
    private final BaseBoolIntDto viewed;

    @pmi0("x")
    private final float x;

    @pmi0("x2")
    private final float x2;

    @pmi0("y")
    private final float y;

    @pmi0("y2")
    private final float y2;

    /* compiled from: PhotosPhotoTagDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoTagDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoTagDto createFromParcel(Parcel parcel) {
            return new PhotosPhotoTagDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(PhotosPhotoTagDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoTagDto.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoTagDto[] newArray(int i) {
            return new PhotosPhotoTagDto[i];
        }
    }

    public PhotosPhotoTagDto(int i, int i2, int i3, String str, UserId userId, BaseBoolIntDto baseBoolIntDto, float f, float f2, float f3, float f4, String str2) {
        this.date = i;
        this.id = i2;
        this.placerId = i3;
        this.taggedName = str;
        this.userId = userId;
        this.viewed = baseBoolIntDto;
        this.x = f;
        this.x2 = f2;
        this.y = f3;
        this.y2 = f4;
        this.description = str2;
    }

    public final int d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.placerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoTagDto)) {
            return false;
        }
        PhotosPhotoTagDto photosPhotoTagDto = (PhotosPhotoTagDto) obj;
        return this.date == photosPhotoTagDto.date && this.id == photosPhotoTagDto.id && this.placerId == photosPhotoTagDto.placerId && epx.f(this.taggedName, photosPhotoTagDto.taggedName) && epx.f(this.userId, photosPhotoTagDto.userId) && this.viewed == photosPhotoTagDto.viewed && Float.compare(this.x, photosPhotoTagDto.x) == 0 && Float.compare(this.x2, photosPhotoTagDto.x2) == 0 && Float.compare(this.y, photosPhotoTagDto.y) == 0 && Float.compare(this.y2, photosPhotoTagDto.y2) == 0 && epx.f(this.description, photosPhotoTagDto.description);
    }

    public final String f() {
        return this.taggedName;
    }

    public final BaseBoolIntDto g() {
        return this.viewed;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int a2 = b.a(this.y2, b.a(this.y, b.a(this.x2, b.a(this.x, wp.b(this.viewed, bh10.a(urd0.a(shy.a(this.placerId, shy.a(this.id, Integer.hashCode(this.date) * 31, 31), 31), 31, this.taggedName), 31, this.userId.b), 31), 31), 31), 31), 31);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final float i() {
        return this.x;
    }

    public final float j() {
        return this.x2;
    }

    public final float k() {
        return this.y;
    }

    public final float l() {
        return this.y2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoTagDto(date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", placerId=");
        sb.append(this.placerId);
        sb.append(", taggedName=");
        sb.append(this.taggedName);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", viewed=");
        sb.append(this.viewed);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", x2=");
        sb.append(this.x2);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", y2=");
        sb.append(this.y2);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
        parcel.writeInt(this.id);
        parcel.writeInt(this.placerId);
        parcel.writeString(this.taggedName);
        parcel.writeParcelable(this.userId, i);
        parcel.writeParcelable(this.viewed, i);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.x2);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.y2);
        parcel.writeString(this.description);
    }

    public /* synthetic */ PhotosPhotoTagDto(int i, int i2, int i3, String str, UserId userId, BaseBoolIntDto baseBoolIntDto, float f, float f2, float f3, float f4, String str2, int i4, zcl zclVar) {
        this(i, i2, i3, str, userId, baseBoolIntDto, f, f2, f3, f4, (i4 & 1024) != 0 ? null : str2);
    }
}
