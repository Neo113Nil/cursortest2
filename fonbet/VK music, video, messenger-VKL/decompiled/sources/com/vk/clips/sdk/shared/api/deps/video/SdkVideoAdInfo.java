package com.vk.clips.sdk.shared.api.deps.video;

import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import xsna.epx;
import xsna.qoy;

/* compiled from: SdkVideoAdInfo.kt */
/* loaded from: classes17.dex */
public final class SdkVideoAdInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SdkVideoAdInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final UserId e;
    public final SdkOwner f;
    public final String g;
    public final SdkVideoAdsType h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final SdkImages m;
    public final SdkAdsChoices n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SdkVideoAdInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SdkVideoAdInfo a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            Long x = serializer.x();
            Object obj = null;
            UserId userId = x != null ? new UserId(x.longValue()) : null;
            SdkOwner sdkOwner = (SdkOwner) serializer.A(SdkOwner.class.getClassLoader());
            String H4 = serializer.H();
            SdkVideoAdsType.a aVar = SdkVideoAdsType.Companion;
            String H5 = serializer.H();
            aVar.getClass();
            Iterator<E> it = SdkVideoAdsType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((SdkVideoAdsType) next).i(), H5)) {
                    obj = next;
                    break;
                }
            }
            SdkVideoAdsType sdkVideoAdsType = (SdkVideoAdsType) obj;
            if (sdkVideoAdsType == null) {
                sdkVideoAdsType = SdkVideoAdsType.UNKNOWN;
            }
            return new SdkVideoAdInfo(H, H2, H3, userId, sdkOwner, H4, sdkVideoAdsType, serializer.m(), serializer.H(), serializer.H(), serializer.H(), (SdkImages) serializer.A(SdkImages.class.getClassLoader()), (SdkAdsChoices) serializer.A(SdkAdsChoices.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkVideoAdInfo[i];
        }
    }

    public SdkVideoAdInfo(String str, String str2, String str3, UserId userId, SdkOwner sdkOwner, String str4, SdkVideoAdsType sdkVideoAdsType, boolean z, String str5, String str6, String str7, SdkImages sdkImages, SdkAdsChoices sdkAdsChoices) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = userId;
        this.f = sdkOwner;
        this.g = str4;
        this.h = sdkVideoAdsType;
        this.i = z;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = sdkImages;
        this.n = sdkAdsChoices;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        UserId userId = this.e;
        serializer.b0(userId != null ? Long.valueOf(userId.b) : null);
        serializer.e0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h.i());
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.e0(this.m);
        serializer.e0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkVideoAdInfo)) {
            return false;
        }
        SdkVideoAdInfo sdkVideoAdInfo = (SdkVideoAdInfo) obj;
        return epx.f(this.b, sdkVideoAdInfo.b) && epx.f(this.c, sdkVideoAdInfo.c) && epx.f(this.d, sdkVideoAdInfo.d) && epx.f(this.e, sdkVideoAdInfo.e) && epx.f(this.f, sdkVideoAdInfo.f) && epx.f(this.g, sdkVideoAdInfo.g) && this.h == sdkVideoAdInfo.h && this.i == sdkVideoAdInfo.i && epx.f(this.j, sdkVideoAdInfo.j) && epx.f(this.k, sdkVideoAdInfo.k) && epx.f(this.l, sdkVideoAdInfo.l) && epx.f(this.m, sdkVideoAdInfo.m) && epx.f(this.n, sdkVideoAdInfo.n);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.e;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        SdkOwner sdkOwner = this.f;
        int hashCode5 = (hashCode4 + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31;
        String str4 = this.g;
        int b = qoy.b((this.h.hashCode() + ((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SdkImages sdkImages = this.m;
        int hashCode9 = (hashCode8 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        SdkAdsChoices sdkAdsChoices = this.n;
        return hashCode9 + (sdkAdsChoices != null ? sdkAdsChoices.hashCode() : 0);
    }

    public final String toString() {
        return "SdkVideoAdInfo(title=" + this.b + ", disclaimer=" + this.c + ", ageRestrictions=" + this.d + ", ownerId=" + this.e + ", owner=" + this.f + ", ownerTitle=" + this.g + ", adsType=" + this.h + ", hasCtaButton=" + this.i + ", advertiserInfoUrl=" + this.j + ", adMarker=" + this.k + ", pattern=" + this.l + ", photoIcon=" + this.m + ", adsChoices=" + this.n + ')';
    }
}
