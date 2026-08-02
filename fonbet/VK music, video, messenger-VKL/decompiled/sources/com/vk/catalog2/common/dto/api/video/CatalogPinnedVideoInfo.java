package com.vk.catalog2.common.dto.api.video;

import com.vk.core.serialize.Serializer;
import com.vk.libvideo.author.VideoPinType;
import xsna.epx;

/* compiled from: CatalogPinnedVideoInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogPinnedVideoInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogPinnedVideoInfo> CREATOR = new a();
    public final String b;
    public final VideoPinType c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogPinnedVideoInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogPinnedVideoInfo a(Serializer serializer) {
            return new CatalogPinnedVideoInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogPinnedVideoInfo[i];
        }
    }

    public CatalogPinnedVideoInfo(String str, VideoPinType videoPinType) {
        this.b = str;
        this.c = videoPinType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPinnedVideoInfo)) {
            return false;
        }
        CatalogPinnedVideoInfo catalogPinnedVideoInfo = (CatalogPinnedVideoInfo) obj;
        return epx.f(this.b, catalogPinnedVideoInfo.b) && this.c == catalogPinnedVideoInfo.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoPinType videoPinType = this.c;
        return hashCode + (videoPinType == null ? 0 : videoPinType.hashCode());
    }

    public final String toString() {
        return "CatalogPinnedVideoInfo(videoRawId=" + this.b + ", pinType=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogPinnedVideoInfo(Serializer serializer) {
        this(r0 == null ? "" : r0, (VideoPinType) serializer.A(VideoPinType.class.getClassLoader()));
        String H = serializer.H();
    }
}
