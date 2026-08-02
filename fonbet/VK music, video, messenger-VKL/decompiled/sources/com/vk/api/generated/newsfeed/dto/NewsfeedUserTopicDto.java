package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;

/* compiled from: NewsfeedUserTopicDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedUserTopicDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedUserTopicDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("is_selected")
    private final boolean isSelected;

    @pmi0("is_visible")
    private final boolean isVisible;

    @pmi0("name")
    private final String name;

    /* compiled from: NewsfeedUserTopicDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedUserTopicDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final NewsfeedUserTopicDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = 1;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                i2 = 1;
            } else {
                i2 = 1;
                z2 = i;
            }
            int readInt2 = parcel.readInt();
            int i3 = i2;
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(NewsfeedUserTopicDto.class, parcel, arrayList, i, i3);
            }
            return new NewsfeedUserTopicDto(readInt, readString, z, z2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedUserTopicDto[] newArray(int i) {
            return new NewsfeedUserTopicDto[i];
        }
    }

    public NewsfeedUserTopicDto(int i, String str, boolean z, boolean z2, List<BaseImageDto> list) {
        this.id = i;
        this.name = str;
        this.isSelected = z;
        this.isVisible = z2;
        this.image = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedUserTopicDto)) {
            return false;
        }
        NewsfeedUserTopicDto newsfeedUserTopicDto = (NewsfeedUserTopicDto) obj;
        return this.id == newsfeedUserTopicDto.id && epx.f(this.name, newsfeedUserTopicDto.name) && this.isSelected == newsfeedUserTopicDto.isSelected && this.isVisible == newsfeedUserTopicDto.isVisible && epx.f(this.image, newsfeedUserTopicDto.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + qoy.b(qoy.b(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.isSelected), 31, this.isVisible);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedUserTopicDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isVisible ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
