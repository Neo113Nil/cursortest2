package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonContextDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BaseOwnerButtonActionDto.kt */
/* loaded from: classes14.dex */
public final class BaseOwnerButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<BaseOwnerButtonActionDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f72app;

    @pmi0("context")
    private final DiscoverCarouselButtonContextDto context;

    @pmi0("target")
    private final BaseOwnerButtonActionTargetDto target;

    @pmi0("type")
    private final BaseLinkButtonActionTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: BaseOwnerButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<BaseOwnerButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonActionDto createFromParcel(Parcel parcel) {
            return new BaseOwnerButtonActionDto(BaseOwnerButtonActionTargetDto.CREATOR.createFromParcel(parcel), BaseLinkButtonActionTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : AppsAppDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DiscoverCarouselButtonContextDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonActionDto[] newArray(int i) {
            return new BaseOwnerButtonActionDto[i];
        }
    }

    public BaseOwnerButtonActionDto(BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, String str, AppsAppDto appsAppDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto) {
        this.target = baseOwnerButtonActionTargetDto;
        this.type = baseLinkButtonActionTypeDto;
        this.url = str;
        this.f72app = appsAppDto;
        this.context = discoverCarouselButtonContextDto;
    }

    public final BaseOwnerButtonActionTargetDto d() {
        return this.target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonActionTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOwnerButtonActionDto)) {
            return false;
        }
        BaseOwnerButtonActionDto baseOwnerButtonActionDto = (BaseOwnerButtonActionDto) obj;
        return this.target == baseOwnerButtonActionDto.target && this.type == baseOwnerButtonActionDto.type && epx.f(this.url, baseOwnerButtonActionDto.url) && epx.f(this.f72app, baseOwnerButtonActionDto.f72app) && epx.f(this.context, baseOwnerButtonActionDto.context);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.type.hashCode() + (this.target.hashCode() * 31)) * 31, 31, this.url);
        AppsAppDto appsAppDto = this.f72app;
        int hashCode = (a2 + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = this.context;
        return hashCode + (discoverCarouselButtonContextDto != null ? discoverCarouselButtonContextDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseOwnerButtonActionDto(target=" + this.target + ", type=" + this.type + ", url=" + this.url + ", app=" + this.f72app + ", context=" + this.context + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.target.writeToParcel(parcel, i);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        AppsAppDto appsAppDto = this.f72app;
        if (appsAppDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppDto.writeToParcel(parcel, i);
        }
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = this.context;
        if (discoverCarouselButtonContextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverCarouselButtonContextDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseOwnerButtonActionDto(BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, String str, AppsAppDto appsAppDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto, int i, zcl zclVar) {
        this(baseOwnerButtonActionTargetDto, baseLinkButtonActionTypeDto, str, (i & 8) != 0 ? null : appsAppDto, (i & 16) != 0 ? null : discoverCarouselButtonContextDto);
    }
}
