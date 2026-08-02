package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppBirthdayItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppBirthdayItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppBirthdayItemDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("text")
    private final String text;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppBirthdayItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppBirthdayItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppBirthdayItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppBirthdayItemDto.class.getClassLoader());
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppBirthdayItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppBirthdayItemDto(readString, readString2, readString3, readString4, superAppUniversalWidgetActionDto, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppBirthdayItemDto[] newArray(int i) {
            return new SuperAppBirthdayItemDto[i];
        }
    }

    public SuperAppBirthdayItemDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppBirthdayItemDto)) {
            return false;
        }
        SuperAppBirthdayItemDto superAppBirthdayItemDto = (SuperAppBirthdayItemDto) obj;
        return epx.f(this.id, superAppBirthdayItemDto.id) && epx.f(this.text, superAppBirthdayItemDto.text) && epx.f(this.subtitle, superAppBirthdayItemDto.subtitle) && epx.f(this.webviewUrl, superAppBirthdayItemDto.webviewUrl) && epx.f(this.action, superAppBirthdayItemDto.action) && epx.f(this.appId, superAppBirthdayItemDto.appId) && epx.f(this.image, superAppBirthdayItemDto.image);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webviewUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode5 = (hashCode4 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppBirthdayItemDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.webviewUrl);
        parcel.writeParcelable(this.action, i);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public SuperAppBirthdayItemDto(String str, String str2, String str3, String str4, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num, List<BaseImageDto> list) {
        this.id = str;
        this.text = str2;
        this.subtitle = str3;
        this.webviewUrl = str4;
        this.action = superAppUniversalWidgetActionDto;
        this.appId = num;
        this.image = list;
    }

    public /* synthetic */ SuperAppBirthdayItemDto(String str, String str2, String str3, String str4, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : superAppUniversalWidgetActionDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list);
    }
}
