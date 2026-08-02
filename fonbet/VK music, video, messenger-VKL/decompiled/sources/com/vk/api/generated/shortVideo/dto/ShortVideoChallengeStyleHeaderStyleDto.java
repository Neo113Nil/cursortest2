package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoChallengeStyleHeaderStyleDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeStyleHeaderStyleDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeStyleHeaderStyleDto> CREATOR = new a();

    @pmi0(L2.g)
    private final List<String> background;

    @pmi0("left_image")
    private final List<BaseImageDto> leftImage;

    @pmi0("right_image")
    private final List<BaseImageDto> rightImage;

    @pmi0("title_color")
    private final String titleColor;

    /* compiled from: ShortVideoChallengeStyleHeaderStyleDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeStyleHeaderStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeStyleHeaderStyleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(ShortVideoChallengeStyleHeaderStyleDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(ShortVideoChallengeStyleHeaderStyleDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new ShortVideoChallengeStyleHeaderStyleDto(readString, arrayList, arrayList2, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeStyleHeaderStyleDto[] newArray(int i) {
            return new ShortVideoChallengeStyleHeaderStyleDto[i];
        }
    }

    public ShortVideoChallengeStyleHeaderStyleDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<String> d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.titleColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeStyleHeaderStyleDto)) {
            return false;
        }
        ShortVideoChallengeStyleHeaderStyleDto shortVideoChallengeStyleHeaderStyleDto = (ShortVideoChallengeStyleHeaderStyleDto) obj;
        return epx.f(this.titleColor, shortVideoChallengeStyleHeaderStyleDto.titleColor) && epx.f(this.leftImage, shortVideoChallengeStyleHeaderStyleDto.leftImage) && epx.f(this.rightImage, shortVideoChallengeStyleHeaderStyleDto.rightImage) && epx.f(this.background, shortVideoChallengeStyleHeaderStyleDto.background);
    }

    public final int hashCode() {
        String str = this.titleColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.leftImage;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.rightImage;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.background;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChallengeStyleHeaderStyleDto(titleColor=");
        sb.append(this.titleColor);
        sb.append(", leftImage=");
        sb.append(this.leftImage);
        sb.append(", rightImage=");
        sb.append(this.rightImage);
        sb.append(", background=");
        return ms9.a(')', sb, this.background);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.titleColor);
        List<BaseImageDto> list = this.leftImage;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.rightImage;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeStringList(this.background);
    }

    public ShortVideoChallengeStyleHeaderStyleDto(String str, List<BaseImageDto> list, List<BaseImageDto> list2, List<String> list3) {
        this.titleColor = str;
        this.leftImage = list;
        this.rightImage = list2;
        this.background = list3;
    }

    public /* synthetic */ ShortVideoChallengeStyleHeaderStyleDto(String str, List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
