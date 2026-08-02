package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.AdBannerStyle;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;

/* compiled from: UiBlockAdBanner.kt */
/* loaded from: classes16.dex */
public final class UiBlockAdBanner extends UIBlock {
    public static final Serializer.c<UiBlockAdBanner> CREATOR = new a();
    public final String A;
    public final String y;
    public final AdBannerStyle z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UiBlockAdBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UiBlockAdBanner a(Serializer serializer) {
            return new UiBlockAdBanner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiBlockAdBanner[i];
        }
    }

    public UiBlockAdBanner(com.vk.catalog2.common.dto.api.ui.a aVar, String str, AdBannerStyle adBannerStyle, String str2) {
        super(aVar);
        this.y = str;
        this.z = adBannerStyle;
        this.A = str2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        AdBannerStyle adBannerStyle = this.z;
        serializer.j0(adBannerStyle != null ? adBannerStyle.h() : null);
        serializer.j0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UiBlockAdBanner) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UiBlockAdBanner uiBlockAdBanner = (UiBlockAdBanner) obj;
        return epx.f(this.y, uiBlockAdBanner.y) && this.z == uiBlockAdBanner.z && epx.f(this.A, uiBlockAdBanner.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("UiBlockAdVideoBanner[id: ");
        sb.append(this.y);
        sb.append(", bannerStyle: ");
        sb.append(this.z);
        sb.append(", sdkSource: ");
        return ho8.a(sb, this.A, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UiBlockAdBanner(Ab(), this.y, this.z, this.A);
    }

    public UiBlockAdBanner(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.y = H == null ? "" : H;
        AdBannerStyle.a aVar = AdBannerStyle.Companion;
        String H2 = serializer.H();
        aVar.getClass();
        this.z = AdBannerStyle.a.a(H2);
        String H3 = serializer.H();
        this.A = H3 != null ? H3 : "";
    }
}
