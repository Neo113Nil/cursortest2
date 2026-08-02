package com.vk.ecomm.market.good.ui.holder.contentholder;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketLinkedContentSourceDto;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.qoy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MarketProductMediaContentHolder.kt */
/* loaded from: classes18.dex */
public final class MediaContentItem implements Parcelable {
    public static final Parcelable.Creator<MediaContentItem> CREATOR = new a();
    public final MarketProductLinkedContentItemDto b;
    public final boolean c;
    public final int d;

    /* compiled from: MarketProductMediaContentHolder.kt */
    public static final class a implements Parcelable.Creator<MediaContentItem> {
        @Override // android.os.Parcelable.Creator
        public final MediaContentItem createFromParcel(Parcel parcel) {
            return new MediaContentItem((MarketProductLinkedContentItemDto) parcel.readParcelable(MediaContentItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaContentItem[] newArray(int i) {
            return new MediaContentItem[i];
        }
    }

    public MediaContentItem(MarketProductLinkedContentItemDto marketProductLinkedContentItemDto, boolean z, int i) {
        this.b = marketProductLinkedContentItemDto;
        this.c = z;
        this.d = i;
    }

    public static MediaContentItem a(MediaContentItem mediaContentItem) {
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        int i = mediaContentItem.d;
        mediaContentItem.getClass();
        return new MediaContentItem(marketProductLinkedContentItemDto, true, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MediaContentItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MediaContentItem mediaContentItem = (MediaContentItem) obj;
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = this.b;
        if (marketProductLinkedContentItemDto.d() == mediaContentItem.b.d() && epx.f(marketProductLinkedContentItemDto.f(), mediaContentItem.b.f()) && epx.f(marketProductLinkedContentItemDto.e(), mediaContentItem.b.e())) {
            VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
            Integer s1 = g != null ? g.s1() : null;
            VideoVideoFullDto g2 = mediaContentItem.b.g();
            if (epx.f(s1, g2 != null ? g2.s1() : null)) {
                VideoVideoFullDto g3 = marketProductLinkedContentItemDto.g();
                UserId q = g3 != null ? g3.q() : null;
                VideoVideoFullDto g4 = mediaContentItem.b.g();
                if (epx.f(q, g4 != null ? g4.q() : null) && this.c == mediaContentItem.c && this.d == mediaContentItem.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = this.b;
        int hashCode = marketProductLinkedContentItemDto.d().hashCode() * 31;
        MarketLinkedContentSourceDto f = marketProductLinkedContentItemDto.f();
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        PhotosPhotoDto e = marketProductLinkedContentItemDto.e();
        int hashCode3 = (hashCode2 + (e != null ? e.hashCode() : 0)) * 31;
        VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
        Integer s1 = g != null ? g.s1() : null;
        int hashCode4 = (hashCode3 + (s1 != null ? s1.hashCode() : 0)) * 31;
        VideoVideoFullDto g2 = marketProductLinkedContentItemDto.g();
        UserId q = g2 != null ? g2.q() : null;
        return qoy.b((hashCode4 + (q != null ? q.hashCode() : 0)) * 31, 31, this.c) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaContentItem(mediaContent=");
        sb.append(this.b);
        sb.append(", isConfirmed=");
        sb.append(this.c);
        sb.append(", heightLimit=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }

    public /* synthetic */ MediaContentItem(MarketProductLinkedContentItemDto marketProductLinkedContentItemDto, boolean z, int i, int i2, zcl zclVar) {
        this(marketProductLinkedContentItemDto, z, (i2 & 4) != 0 ? 0 : i);
    }
}
