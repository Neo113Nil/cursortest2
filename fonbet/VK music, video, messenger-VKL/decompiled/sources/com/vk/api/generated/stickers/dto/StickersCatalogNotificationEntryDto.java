package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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

/* compiled from: StickersCatalogNotificationEntryDto.kt */
/* loaded from: classes15.dex */
public final class StickersCatalogNotificationEntryDto implements Parcelable {
    public static final Parcelable.Creator<StickersCatalogNotificationEntryDto> CREATOR = new a();

    @pmi0("button")
    private final StickersCatalogNotificationButtonDto button;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final String layout;

    @pmi0("message")
    private final String message;

    @pmi0("title")
    private final String title;

    /* compiled from: StickersCatalogNotificationEntryDto.kt */
    public static final class a implements Parcelable.Creator<StickersCatalogNotificationEntryDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationEntryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StickersCatalogNotificationEntryDto.class, parcel, arrayList, i, 1);
                }
            }
            return new StickersCatalogNotificationEntryDto(readString, readString2, readString3, arrayList, parcel.readInt() != 0 ? StickersCatalogNotificationButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationEntryDto[] newArray(int i) {
            return new StickersCatalogNotificationEntryDto[i];
        }
    }

    public StickersCatalogNotificationEntryDto(String str, String str2, String str3, List<BaseImageDto> list, StickersCatalogNotificationButtonDto stickersCatalogNotificationButtonDto) {
        this.layout = str;
        this.title = str2;
        this.message = str3;
        this.images = list;
        this.button = stickersCatalogNotificationButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersCatalogNotificationEntryDto)) {
            return false;
        }
        StickersCatalogNotificationEntryDto stickersCatalogNotificationEntryDto = (StickersCatalogNotificationEntryDto) obj;
        return epx.f(this.layout, stickersCatalogNotificationEntryDto.layout) && epx.f(this.title, stickersCatalogNotificationEntryDto.title) && epx.f(this.message, stickersCatalogNotificationEntryDto.message) && epx.f(this.images, stickersCatalogNotificationEntryDto.images) && epx.f(this.button, stickersCatalogNotificationEntryDto.button);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.layout.hashCode() * 31, 31, this.title), 31, this.message);
        List<BaseImageDto> list = this.images;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        StickersCatalogNotificationButtonDto stickersCatalogNotificationButtonDto = this.button;
        return hashCode + (stickersCatalogNotificationButtonDto != null ? stickersCatalogNotificationButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "StickersCatalogNotificationEntryDto(layout=" + this.layout + ", title=" + this.title + ", message=" + this.message + ", images=" + this.images + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.layout);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        StickersCatalogNotificationButtonDto stickersCatalogNotificationButtonDto = this.button;
        if (stickersCatalogNotificationButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersCatalogNotificationButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StickersCatalogNotificationEntryDto(String str, String str2, String str3, List list, StickersCatalogNotificationButtonDto stickersCatalogNotificationButtonDto, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : stickersCatalogNotificationButtonDto);
    }
}
