package com.vk.api.generated.voicerooms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGradientPointDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VoiceroomsCoverDto.kt */
/* loaded from: classes15.dex */
public final class VoiceroomsCoverDto implements Parcelable {
    public static final Parcelable.Creator<VoiceroomsCoverDto> CREATOR = new a();

    @pmi0("crop")
    private final String crop;

    @pmi0("gradient")
    private final List<BaseGradientPointDto> gradient;

    @pmi0("photo")
    private final String photo;

    @pmi0("photo_original")
    private final String photoOriginal;

    @pmi0("solid_color")
    private final String solidColor;

    /* compiled from: VoiceroomsCoverDto.kt */
    public static final class a implements Parcelable.Creator<VoiceroomsCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final VoiceroomsCoverDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VoiceroomsCoverDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VoiceroomsCoverDto(readString, readString2, readString3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceroomsCoverDto[] newArray(int i) {
            return new VoiceroomsCoverDto[i];
        }
    }

    public VoiceroomsCoverDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceroomsCoverDto)) {
            return false;
        }
        VoiceroomsCoverDto voiceroomsCoverDto = (VoiceroomsCoverDto) obj;
        return epx.f(this.photo, voiceroomsCoverDto.photo) && epx.f(this.photoOriginal, voiceroomsCoverDto.photoOriginal) && epx.f(this.crop, voiceroomsCoverDto.crop) && epx.f(this.gradient, voiceroomsCoverDto.gradient) && epx.f(this.solidColor, voiceroomsCoverDto.solidColor);
    }

    public final int hashCode() {
        String str = this.photo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photoOriginal;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crop;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseGradientPointDto> list = this.gradient;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.solidColor;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceroomsCoverDto(photo=");
        sb.append(this.photo);
        sb.append(", photoOriginal=");
        sb.append(this.photoOriginal);
        sb.append(", crop=");
        sb.append(this.crop);
        sb.append(", gradient=");
        sb.append(this.gradient);
        sb.append(", solidColor=");
        return ho8.a(sb, this.solidColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo);
        parcel.writeString(this.photoOriginal);
        parcel.writeString(this.crop);
        List<BaseGradientPointDto> list = this.gradient;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.solidColor);
    }

    public VoiceroomsCoverDto(String str, String str2, String str3, List<BaseGradientPointDto> list, String str4) {
        this.photo = str;
        this.photoOriginal = str2;
        this.crop = str3;
        this.gradient = list;
        this.solidColor = str4;
    }

    public /* synthetic */ VoiceroomsCoverDto(String str, String str2, String str3, List list, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4);
    }
}
