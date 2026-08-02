package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsGetAddToProfileModalCardButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAddToProfileModalCardButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAddToProfileModalCardButtonDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppForProfileModalCardButtonDto f62app;

    @pmi0("button_id")
    private final int buttonId;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("name_myself")
    private final String nameMyself;

    @pmi0("name_their")
    private final String nameTheir;

    /* compiled from: AppsGetAddToProfileModalCardButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAddToProfileModalCardButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAddToProfileModalCardButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(AppsGetAddToProfileModalCardButtonDto.class, parcel, arrayList, i, 1);
                }
            }
            return new AppsGetAddToProfileModalCardButtonDto(readInt, readString, readString2, arrayList, parcel.readInt() != 0 ? AppsAppForProfileModalCardButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAddToProfileModalCardButtonDto[] newArray(int i) {
            return new AppsGetAddToProfileModalCardButtonDto[i];
        }
    }

    public AppsGetAddToProfileModalCardButtonDto(int i, String str, String str2, List<BaseImageDto> list, AppsAppForProfileModalCardButtonDto appsAppForProfileModalCardButtonDto) {
        this.buttonId = i;
        this.nameMyself = str;
        this.nameTheir = str2;
        this.icons = list;
        this.f62app = appsAppForProfileModalCardButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAddToProfileModalCardButtonDto)) {
            return false;
        }
        AppsGetAddToProfileModalCardButtonDto appsGetAddToProfileModalCardButtonDto = (AppsGetAddToProfileModalCardButtonDto) obj;
        return this.buttonId == appsGetAddToProfileModalCardButtonDto.buttonId && epx.f(this.nameMyself, appsGetAddToProfileModalCardButtonDto.nameMyself) && epx.f(this.nameTheir, appsGetAddToProfileModalCardButtonDto.nameTheir) && epx.f(this.icons, appsGetAddToProfileModalCardButtonDto.icons) && epx.f(this.f62app, appsGetAddToProfileModalCardButtonDto.f62app);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.buttonId) * 31, 31, this.nameMyself), 31, this.nameTheir);
        List<BaseImageDto> list = this.icons;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        AppsAppForProfileModalCardButtonDto appsAppForProfileModalCardButtonDto = this.f62app;
        return hashCode + (appsAppForProfileModalCardButtonDto != null ? appsAppForProfileModalCardButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsGetAddToProfileModalCardButtonDto(buttonId=" + this.buttonId + ", nameMyself=" + this.nameMyself + ", nameTheir=" + this.nameTheir + ", icons=" + this.icons + ", app=" + this.f62app + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.buttonId);
        parcel.writeString(this.nameMyself);
        parcel.writeString(this.nameTheir);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        AppsAppForProfileModalCardButtonDto appsAppForProfileModalCardButtonDto = this.f62app;
        if (appsAppForProfileModalCardButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppForProfileModalCardButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetAddToProfileModalCardButtonDto(int i, String str, String str2, List list, AppsAppForProfileModalCardButtonDto appsAppForProfileModalCardButtonDto, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : appsAppForProfileModalCardButtonDto);
    }
}
