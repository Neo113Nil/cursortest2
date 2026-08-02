package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedDzenBlockItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenBlockItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenBlockItemDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("dzen_id")
    private final String dzenId;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: NewsfeedDzenBlockItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenBlockItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenBlockItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(NewsfeedDzenBlockItemDto.class, parcel, arrayList, i, 1);
            }
            return new NewsfeedDzenBlockItemDto(readString, readString2, arrayList, parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(NewsfeedDzenBlockItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenBlockItemDto[] newArray(int i) {
            return new NewsfeedDzenBlockItemDto[i];
        }
    }

    public NewsfeedDzenBlockItemDto(String str, String str2, List<BaseImageDto> list, String str3, BaseLinkButtonDto baseLinkButtonDto) {
        this.dzenId = str;
        this.title = str2;
        this.image = list;
        this.trackCode = str3;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.dzenId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenBlockItemDto)) {
            return false;
        }
        NewsfeedDzenBlockItemDto newsfeedDzenBlockItemDto = (NewsfeedDzenBlockItemDto) obj;
        return epx.f(this.dzenId, newsfeedDzenBlockItemDto.dzenId) && epx.f(this.title, newsfeedDzenBlockItemDto.title) && epx.f(this.image, newsfeedDzenBlockItemDto.image) && epx.f(this.trackCode, newsfeedDzenBlockItemDto.trackCode) && epx.f(this.button, newsfeedDzenBlockItemDto.button);
    }

    public final List<BaseImageDto> f() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(this.dzenId.hashCode() * 31, 31, this.title), 31, this.image), 31, this.trackCode);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "NewsfeedDzenBlockItemDto(dzenId=" + this.dzenId + ", title=" + this.title + ", image=" + this.image + ", trackCode=" + this.trackCode + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dzenId);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ NewsfeedDzenBlockItemDto(String str, String str2, List list, String str3, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, list, str3, (i & 16) != 0 ? null : baseLinkButtonDto);
    }
}
