package com.vk.api.generated.uxpolls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseRequestParamDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxpollsConfigDto.kt */
/* loaded from: classes15.dex */
public final class UxpollsConfigDto implements Parcelable {
    public static final Parcelable.Creator<UxpollsConfigDto> CREATOR = new a();

    @pmi0("webapp_translations")
    private final List<BaseRequestParamDto> webappTranslations;

    @pmi0("webapp_url")
    private final String webappUrl;

    /* compiled from: UxpollsConfigDto.kt */
    public static final class a implements Parcelable.Creator<UxpollsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final UxpollsConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseRequestParamDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UxpollsConfigDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UxpollsConfigDto[] newArray(int i) {
            return new UxpollsConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UxpollsConfigDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<BaseRequestParamDto> d() {
        return this.webappTranslations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.webappUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxpollsConfigDto)) {
            return false;
        }
        UxpollsConfigDto uxpollsConfigDto = (UxpollsConfigDto) obj;
        return epx.f(this.webappUrl, uxpollsConfigDto.webappUrl) && epx.f(this.webappTranslations, uxpollsConfigDto.webappTranslations);
    }

    public final int hashCode() {
        String str = this.webappUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseRequestParamDto> list = this.webappTranslations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxpollsConfigDto(webappUrl=");
        sb.append(this.webappUrl);
        sb.append(", webappTranslations=");
        return ms9.a(')', sb, this.webappTranslations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.webappUrl);
        List<BaseRequestParamDto> list = this.webappTranslations;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseRequestParamDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public UxpollsConfigDto(String str, List<BaseRequestParamDto> list) {
        this.webappUrl = str;
        this.webappTranslations = list;
    }

    public /* synthetic */ UxpollsConfigDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
