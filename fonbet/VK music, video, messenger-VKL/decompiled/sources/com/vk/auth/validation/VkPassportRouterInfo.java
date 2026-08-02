package com.vk.auth.validation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.utils.VkPassportPage;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import xsna.epx;
import xsna.fw3;
import xsna.zcl;

/* compiled from: VkPassportRouterInfo.kt */
/* loaded from: classes.dex */
public final class VkPassportRouterInfo implements Parcelable {
    public static final Parcelable.Creator<VkPassportRouterInfo> CREATOR = new a();
    public final String b;
    public final VkAuthCredentials c;
    public final VkAuthMetaInfo d;
    public final UtilityTokens e;
    public final VkPassportPage f;

    /* compiled from: VkPassportRouterInfo.kt */
    /* loaded from: classes15.dex */
    public static final class a implements Parcelable.Creator<VkPassportRouterInfo> {
        @Override // android.os.Parcelable.Creator
        public final VkPassportRouterInfo createFromParcel(Parcel parcel) {
            return new VkPassportRouterInfo(parcel.readString(), (VkAuthCredentials) parcel.readParcelable(VkPassportRouterInfo.class.getClassLoader()), VkAuthMetaInfo.CREATOR.createFromParcel(parcel), (UtilityTokens) parcel.readParcelable(VkPassportRouterInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : VkPassportPage.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkPassportRouterInfo[] newArray(int i) {
            return new VkPassportRouterInfo[i];
        }
    }

    public VkPassportRouterInfo(String str, VkAuthCredentials vkAuthCredentials, VkAuthMetaInfo vkAuthMetaInfo, UtilityTokens utilityTokens, VkPassportPage vkPassportPage) {
        this.b = str;
        this.c = vkAuthCredentials;
        this.d = vkAuthMetaInfo;
        this.e = utilityTokens;
        this.f = vkPassportPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPassportRouterInfo)) {
            return false;
        }
        VkPassportRouterInfo vkPassportRouterInfo = (VkPassportRouterInfo) obj;
        return epx.f(this.b, vkPassportRouterInfo.b) && epx.f(this.c, vkPassportRouterInfo.c) && epx.f(this.d, vkPassportRouterInfo.d) && epx.f(this.e, vkPassportRouterInfo.e) && this.f == vkPassportRouterInfo.f;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VkAuthCredentials vkAuthCredentials = this.c;
        int a2 = fw3.a((this.d.hashCode() + ((hashCode + (vkAuthCredentials == null ? 0 : vkAuthCredentials.hashCode())) * 31)) * 31, 31, this.e.b);
        VkPassportPage vkPassportPage = this.f;
        return a2 + (vkPassportPage != null ? vkPassportPage.hashCode() : 0);
    }

    public final String toString() {
        return "VkPassportRouterInfo(accessToken=" + this.b + ", credentials=" + this.c + ", authMetaInfo=" + this.d + ", utilityTokens=" + this.e + ", page=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
        VkPassportPage vkPassportPage = this.f;
        if (vkPassportPage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkPassportPage.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkPassportRouterInfo(String str, VkAuthCredentials vkAuthCredentials, VkAuthMetaInfo vkAuthMetaInfo, UtilityTokens utilityTokens, VkPassportPage vkPassportPage, int i, zcl zclVar) {
        this(str, vkAuthCredentials, vkAuthMetaInfo, utilityTokens, (i & 16) != 0 ? null : vkPassportPage);
    }
}
