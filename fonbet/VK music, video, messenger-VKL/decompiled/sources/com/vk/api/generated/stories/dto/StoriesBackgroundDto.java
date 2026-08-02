package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class StoriesBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<StoriesBackgroundDto> CREATOR = new a();

    @pmi0(L2.g)
    private final String background;

    @pmi0("background_name")
    private final String backgroundName;

    @pmi0("id")
    private final Integer id;

    @pmi0("preview")
    private final String preview;

    @pmi0("url")
    private final String url;

    /* compiled from: StoriesBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<StoriesBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesBackgroundDto createFromParcel(Parcel parcel) {
            return new StoriesBackgroundDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesBackgroundDto[] newArray(int i) {
            return new StoriesBackgroundDto[i];
        }
    }

    public StoriesBackgroundDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.backgroundName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesBackgroundDto)) {
            return false;
        }
        StoriesBackgroundDto storiesBackgroundDto = (StoriesBackgroundDto) obj;
        return epx.f(this.id, storiesBackgroundDto.id) && epx.f(this.url, storiesBackgroundDto.url) && epx.f(this.preview, storiesBackgroundDto.preview) && epx.f(this.background, storiesBackgroundDto.background) && epx.f(this.backgroundName, storiesBackgroundDto.backgroundName);
    }

    public final Integer f() {
        return this.id;
    }

    public final String g() {
        return this.preview;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.preview;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.background;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesBackgroundDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", backgroundName=");
        return ho8.a(sb, this.backgroundName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.preview);
        parcel.writeString(this.background);
        parcel.writeString(this.backgroundName);
    }

    public StoriesBackgroundDto(Integer num, String str, String str2, String str3, String str4) {
        this.id = num;
        this.url = str;
        this.preview = str2;
        this.background = str3;
        this.backgroundName = str4;
    }

    public /* synthetic */ StoriesBackgroundDto(Integer num, String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
