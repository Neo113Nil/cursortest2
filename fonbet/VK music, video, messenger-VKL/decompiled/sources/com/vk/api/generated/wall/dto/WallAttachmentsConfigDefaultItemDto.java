package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: WallAttachmentsConfigDefaultItemDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsConfigDefaultItemDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsConfigDefaultItemDto> CREATOR = new a();

    @pmi0(TtmlNode.TAG_STYLE)
    private final List<WallWallpostAttachmentStyleDto> style;

    @pmi0("type")
    private final String type;

    /* compiled from: WallAttachmentsConfigDefaultItemDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsConfigDefaultItemDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigDefaultItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(WallAttachmentsConfigDefaultItemDto.class, parcel, arrayList, i, 1);
            }
            return new WallAttachmentsConfigDefaultItemDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigDefaultItemDto[] newArray(int i) {
            return new WallAttachmentsConfigDefaultItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallAttachmentsConfigDefaultItemDto(String str, List<? extends WallWallpostAttachmentStyleDto> list) {
        this.type = str;
        this.style = list;
    }

    public final List<WallWallpostAttachmentStyleDto> d() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachmentsConfigDefaultItemDto)) {
            return false;
        }
        WallAttachmentsConfigDefaultItemDto wallAttachmentsConfigDefaultItemDto = (WallAttachmentsConfigDefaultItemDto) obj;
        return epx.f(this.type, wallAttachmentsConfigDefaultItemDto.type) && epx.f(this.style, wallAttachmentsConfigDefaultItemDto.style);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallAttachmentsConfigDefaultItemDto(type=");
        sb.append(this.type);
        sb.append(", style=");
        return ms9.a(')', sb, this.style);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.style);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
