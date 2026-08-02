package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsChoicesDto.kt */
/* loaded from: classes14.dex */
public final class AdsChoicesDto implements Parcelable {
    public static final Parcelable.Creator<AdsChoicesDto> CREATOR = new a();

    @pmi0("click_link")
    private final String clickLink;

    @pmi0("close_action_text")
    private final String closeActionText;

    @pmi0("close_url")
    private final String closeUrl;

    @pmi0("icon_link")
    private final String iconLink;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<AdsChoicesOptionsDto> options;

    /* compiled from: AdsChoicesDto.kt */
    public static final class a implements Parcelable.Creator<AdsChoicesDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsChoicesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AdsChoicesOptionsDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AdsChoicesDto(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsChoicesDto[] newArray(int i) {
            return new AdsChoicesDto[i];
        }
    }

    public AdsChoicesDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.clickLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.closeActionText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsChoicesDto)) {
            return false;
        }
        AdsChoicesDto adsChoicesDto = (AdsChoicesDto) obj;
        return epx.f(this.iconLink, adsChoicesDto.iconLink) && epx.f(this.clickLink, adsChoicesDto.clickLink) && epx.f(this.closeUrl, adsChoicesDto.closeUrl) && epx.f(this.closeActionText, adsChoicesDto.closeActionText) && epx.f(this.options, adsChoicesDto.options);
    }

    public final String f() {
        return this.closeUrl;
    }

    public final String g() {
        return this.iconLink;
    }

    public final int hashCode() {
        String str = this.iconLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.closeUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.closeActionText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<AdsChoicesOptionsDto> list = this.options;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final List<AdsChoicesOptionsDto> i() {
        return this.options;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsChoicesDto(iconLink=");
        sb.append(this.iconLink);
        sb.append(", clickLink=");
        sb.append(this.clickLink);
        sb.append(", closeUrl=");
        sb.append(this.closeUrl);
        sb.append(", closeActionText=");
        sb.append(this.closeActionText);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iconLink);
        parcel.writeString(this.clickLink);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.closeActionText);
        List<AdsChoicesOptionsDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AdsChoicesOptionsDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AdsChoicesDto(String str, String str2, String str3, String str4, List<AdsChoicesOptionsDto> list) {
        this.iconLink = str;
        this.clickLink = str2;
        this.closeUrl = str3;
        this.closeActionText = str4;
        this.options = list;
    }

    public /* synthetic */ AdsChoicesDto(String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
