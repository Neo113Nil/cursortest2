package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsMiniAppAttachDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniAppAttachDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniAppAttachDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f65app;

    @pmi0("button")
    private final AppsMiniAppAttachButtonDto button;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_default_description")
    private final Boolean isDefaultDescription;

    @pmi0("is_default_icon")
    private final Boolean isDefaultIcon;

    @pmi0("should_open_by_url")
    private final Boolean shouldOpenByUrl;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsMiniAppAttachDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniAppAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsMiniAppAttachDto.class, parcel, arrayList, i, 1);
            }
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(AppsMiniAppAttachDto.class.getClassLoader());
            AppsMiniAppAttachButtonDto createFromParcel = parcel.readInt() == 0 ? null : AppsMiniAppAttachButtonDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsMiniAppAttachDto(readString, readString2, arrayList, appsAppMinDto, createFromParcel, readString3, valueOf, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachDto[] newArray(int i) {
            return new AppsMiniAppAttachDto[i];
        }
    }

    public AppsMiniAppAttachDto(String str, String str2, List<BaseImageDto> list, AppsAppMinDto appsAppMinDto, AppsMiniAppAttachButtonDto appsMiniAppAttachButtonDto, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.title = str;
        this.description = str2;
        this.images = list;
        this.f65app = appsAppMinDto;
        this.button = appsMiniAppAttachButtonDto;
        this.buttonText = str3;
        this.isDefaultDescription = bool;
        this.isDefaultIcon = bool2;
        this.shouldOpenByUrl = bool3;
    }

    public final AppsAppMinDto d() {
        return this.f65app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsMiniAppAttachButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniAppAttachDto)) {
            return false;
        }
        AppsMiniAppAttachDto appsMiniAppAttachDto = (AppsMiniAppAttachDto) obj;
        return epx.f(this.title, appsMiniAppAttachDto.title) && epx.f(this.description, appsMiniAppAttachDto.description) && epx.f(this.images, appsMiniAppAttachDto.images) && epx.f(this.f65app, appsMiniAppAttachDto.f65app) && epx.f(this.button, appsMiniAppAttachDto.button) && epx.f(this.buttonText, appsMiniAppAttachDto.buttonText) && epx.f(this.isDefaultDescription, appsMiniAppAttachDto.isDefaultDescription) && epx.f(this.isDefaultIcon, appsMiniAppAttachDto.isDefaultIcon) && epx.f(this.shouldOpenByUrl, appsMiniAppAttachDto.shouldOpenByUrl);
    }

    public final String f() {
        return this.buttonText;
    }

    public final List<BaseImageDto> g() {
        return this.images;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.images);
        AppsAppMinDto appsAppMinDto = this.f65app;
        int hashCode = (a2 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        AppsMiniAppAttachButtonDto appsMiniAppAttachButtonDto = this.button;
        int hashCode2 = (hashCode + (appsMiniAppAttachButtonDto == null ? 0 : appsMiniAppAttachButtonDto.hashCode())) * 31;
        String str = this.buttonText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDefaultDescription;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultIcon;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldOpenByUrl;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniAppAttachDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", app=");
        sb.append(this.f65app);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", isDefaultDescription=");
        sb.append(this.isDefaultDescription);
        sb.append(", isDefaultIcon=");
        sb.append(this.isDefaultIcon);
        sb.append(", shouldOpenByUrl=");
        return tn.a(sb, this.shouldOpenByUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.f65app, i);
        AppsMiniAppAttachButtonDto appsMiniAppAttachButtonDto = this.button;
        if (appsMiniAppAttachButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniAppAttachButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.buttonText);
        Boolean bool = this.isDefaultDescription;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isDefaultIcon;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.shouldOpenByUrl;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ AppsMiniAppAttachDto(String str, String str2, List list, AppsAppMinDto appsAppMinDto, AppsMiniAppAttachButtonDto appsMiniAppAttachButtonDto, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : appsAppMinDto, (i & 16) != 0 ? null : appsMiniAppAttachButtonDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3);
    }
}
