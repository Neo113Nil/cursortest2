package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;

/* compiled from: AdsHtml5GameDto.kt */
/* loaded from: classes14.dex */
public final class AdsHtml5GameDto implements Parcelable {
    public static final Parcelable.Creator<AdsHtml5GameDto> CREATOR = new a();

    @pmi0("autolaunch")
    private final boolean autolaunch;

    @pmi0("inapp_actions")
    private final List<AdsHtml5GameInappActionDto> inappActions;

    @pmi0("launch_button_text")
    private final String launchButtonText;

    @pmi0("source_url")
    private final String sourceUrl;

    @pmi0("teaser_photo")
    private final List<BaseImageDto> teaserPhoto;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("viewport_ratio")
    private final float viewportRatio;

    /* compiled from: AdsHtml5GameDto.kt */
    public static final class a implements Parcelable.Creator<AdsHtml5GameDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsHtml5GameDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
                i2 = 1;
            } else {
                i = 0;
                i2 = 1;
            }
            String readString3 = parcel.readString();
            int i3 = i2;
            float readFloat = parcel.readFloat();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i4 = i;
            while (i4 != readInt) {
                i4 = bo.b(AdsHtml5GameDto.class, parcel, arrayList, i4, i3);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AdsHtml5GameInappActionDto.CREATOR, parcel, arrayList2, i, i3);
            }
            return new AdsHtml5GameDto(readString, readString2, z, readString3, readFloat, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsHtml5GameDto[] newArray(int i) {
            return new AdsHtml5GameDto[i];
        }
    }

    public AdsHtml5GameDto(String str, String str2, boolean z, String str3, float f, List<BaseImageDto> list, List<AdsHtml5GameInappActionDto> list2) {
        this.trackCode = str;
        this.launchButtonText = str2;
        this.autolaunch = z;
        this.sourceUrl = str3;
        this.viewportRatio = f;
        this.teaserPhoto = list;
        this.inappActions = list2;
    }

    public final boolean d() {
        return this.autolaunch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AdsHtml5GameInappActionDto> e() {
        return this.inappActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHtml5GameDto)) {
            return false;
        }
        AdsHtml5GameDto adsHtml5GameDto = (AdsHtml5GameDto) obj;
        return epx.f(this.trackCode, adsHtml5GameDto.trackCode) && epx.f(this.launchButtonText, adsHtml5GameDto.launchButtonText) && this.autolaunch == adsHtml5GameDto.autolaunch && epx.f(this.sourceUrl, adsHtml5GameDto.sourceUrl) && Float.compare(this.viewportRatio, adsHtml5GameDto.viewportRatio) == 0 && epx.f(this.teaserPhoto, adsHtml5GameDto.teaserPhoto) && epx.f(this.inappActions, adsHtml5GameDto.inappActions);
    }

    public final String f() {
        return this.launchButtonText;
    }

    public final String g() {
        return this.sourceUrl;
    }

    public final int hashCode() {
        return this.inappActions.hashCode() + fw3.a(b.a(this.viewportRatio, urd0.a(qoy.b(urd0.a(this.trackCode.hashCode() * 31, 31, this.launchButtonText), 31, this.autolaunch), 31, this.sourceUrl), 31), 31, this.teaserPhoto);
    }

    public final List<BaseImageDto> i() {
        return this.teaserPhoto;
    }

    public final float j() {
        return this.viewportRatio;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsHtml5GameDto(trackCode=");
        sb.append(this.trackCode);
        sb.append(", launchButtonText=");
        sb.append(this.launchButtonText);
        sb.append(", autolaunch=");
        sb.append(this.autolaunch);
        sb.append(", sourceUrl=");
        sb.append(this.sourceUrl);
        sb.append(", viewportRatio=");
        sb.append(this.viewportRatio);
        sb.append(", teaserPhoto=");
        sb.append(this.teaserPhoto);
        sb.append(", inappActions=");
        return ms9.a(')', sb, this.inappActions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.trackCode);
        parcel.writeString(this.launchButtonText);
        parcel.writeInt(this.autolaunch ? 1 : 0);
        parcel.writeString(this.sourceUrl);
        parcel.writeFloat(this.viewportRatio);
        Iterator a2 = ao.a(parcel, this.teaserPhoto);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.inappActions);
        while (a3.hasNext()) {
            ((AdsHtml5GameInappActionDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
