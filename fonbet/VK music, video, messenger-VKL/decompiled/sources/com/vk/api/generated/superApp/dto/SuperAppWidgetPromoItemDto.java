package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppWidgetPromoItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetPromoItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetPromoItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("badge_text")
    private final String badgeText;

    @pmi0("images")
    private final List<SuperAppUniversalWidgetImageItemDto> images;

    @pmi0("title")
    private final String title;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetPromoItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetPromoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetPromoItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new SuperAppWidgetPromoItemDto(readString, readString2, valueOf, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetPromoItemDto[] newArray(int i) {
            return new SuperAppWidgetPromoItemDto[i];
        }
    }

    public SuperAppWidgetPromoItemDto() {
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
        if (!(obj instanceof SuperAppWidgetPromoItemDto)) {
            return false;
        }
        SuperAppWidgetPromoItemDto superAppWidgetPromoItemDto = (SuperAppWidgetPromoItemDto) obj;
        return epx.f(this.badgeText, superAppWidgetPromoItemDto.badgeText) && epx.f(this.title, superAppWidgetPromoItemDto.title) && epx.f(this.appId, superAppWidgetPromoItemDto.appId) && epx.f(this.webviewUrl, superAppWidgetPromoItemDto.webviewUrl) && epx.f(this.images, superAppWidgetPromoItemDto.images);
    }

    public final int hashCode() {
        String str = this.badgeText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.webviewUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SuperAppUniversalWidgetImageItemDto> list = this.images;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetPromoItemDto(badgeText=");
        sb.append(this.badgeText);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.badgeText);
        parcel.writeString(this.title);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.webviewUrl);
        List<SuperAppUniversalWidgetImageItemDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public SuperAppWidgetPromoItemDto(String str, String str2, Integer num, String str3, List<SuperAppUniversalWidgetImageItemDto> list) {
        this.badgeText = str;
        this.title = str2;
        this.appId = num;
        this.webviewUrl = str3;
        this.images = list;
    }

    public /* synthetic */ SuperAppWidgetPromoItemDto(String str, String str2, Integer num, String str3, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }
}
