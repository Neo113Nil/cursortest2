package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AudioPhotoDto.kt */
/* loaded from: classes14.dex */
public final class AudioPhotoDto implements Parcelable {
    public static final Parcelable.Creator<AudioPhotoDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final String id;

    @pmi0("photo_1200")
    private final String photo1200;

    @pmi0("photo_135")
    private final String photo135;

    @pmi0("photo_270")
    private final String photo270;

    @pmi0("photo_300")
    private final String photo300;

    @pmi0("photo_34")
    private final String photo34;

    @pmi0("photo_600")
    private final String photo600;

    @pmi0("photo_68")
    private final String photo68;

    @pmi0("sizes")
    private final List<AudioPhotoSizesDto> sizes;

    @pmi0("width")
    private final int width;

    /* compiled from: AudioPhotoDto.kt */
    public static final class a implements Parcelable.Creator<AudioPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPhotoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(AudioPhotoSizesDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AudioPhotoDto(readInt, readInt2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPhotoDto[] newArray(int i) {
            return new AudioPhotoDto[i];
        }
    }

    public AudioPhotoDto(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<AudioPhotoSizesDto> list) {
        this.width = i;
        this.height = i2;
        this.id = str;
        this.photo34 = str2;
        this.photo68 = str3;
        this.photo135 = str4;
        this.photo270 = str5;
        this.photo300 = str6;
        this.photo600 = str7;
        this.photo1200 = str8;
        this.sizes = list;
    }

    public final String d() {
        return this.photo1200;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo135;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotoDto)) {
            return false;
        }
        AudioPhotoDto audioPhotoDto = (AudioPhotoDto) obj;
        return this.width == audioPhotoDto.width && this.height == audioPhotoDto.height && epx.f(this.id, audioPhotoDto.id) && epx.f(this.photo34, audioPhotoDto.photo34) && epx.f(this.photo68, audioPhotoDto.photo68) && epx.f(this.photo135, audioPhotoDto.photo135) && epx.f(this.photo270, audioPhotoDto.photo270) && epx.f(this.photo300, audioPhotoDto.photo300) && epx.f(this.photo600, audioPhotoDto.photo600) && epx.f(this.photo1200, audioPhotoDto.photo1200) && epx.f(this.sizes, audioPhotoDto.sizes);
    }

    public final String f() {
        return this.photo270;
    }

    public final String g() {
        return this.photo300;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, Integer.hashCode(this.width) * 31, 31);
        String str = this.id;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo34;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo68;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo135;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo270;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo300;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo600;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photo1200;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<AudioPhotoSizesDto> list = this.sizes;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.photo34;
    }

    public final String j() {
        return this.photo600;
    }

    public final String k() {
        return this.photo68;
    }

    public final List<AudioPhotoSizesDto> l() {
        return this.sizes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPhotoDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", photo34=");
        sb.append(this.photo34);
        sb.append(", photo68=");
        sb.append(this.photo68);
        sb.append(", photo135=");
        sb.append(this.photo135);
        sb.append(", photo270=");
        sb.append(this.photo270);
        sb.append(", photo300=");
        sb.append(this.photo300);
        sb.append(", photo600=");
        sb.append(this.photo600);
        sb.append(", photo1200=");
        sb.append(this.photo1200);
        sb.append(", sizes=");
        return ms9.a(')', sb, this.sizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.id);
        parcel.writeString(this.photo34);
        parcel.writeString(this.photo68);
        parcel.writeString(this.photo135);
        parcel.writeString(this.photo270);
        parcel.writeString(this.photo300);
        parcel.writeString(this.photo600);
        parcel.writeString(this.photo1200);
        List<AudioPhotoSizesDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AudioPhotoSizesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioPhotoDto(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & 1024) != 0 ? null : list);
    }
}
