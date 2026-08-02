package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiCharacterPreviewDto.kt */
/* loaded from: classes15.dex */
public final class VmojiCharacterPreviewDto implements Parcelable {
    public static final Parcelable.Creator<VmojiCharacterPreviewDto> CREATOR = new a();

    @pmi0("background_color")
    private final VmojiCharacterPreviewBackgroundColorDto backgroundColor;

    @pmi0("body")
    private final String body;

    @pmi0(TtmlNode.TAG_HEAD)
    private final String head;

    @pmi0("stickers")
    private final List<String> stickers;

    /* compiled from: VmojiCharacterPreviewDto.kt */
    public static final class a implements Parcelable.Creator<VmojiCharacterPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterPreviewDto createFromParcel(Parcel parcel) {
            return new VmojiCharacterPreviewDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VmojiCharacterPreviewBackgroundColorDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterPreviewDto[] newArray(int i) {
            return new VmojiCharacterPreviewDto[i];
        }
    }

    public VmojiCharacterPreviewDto() {
        this(null, null, null, null, 15, null);
    }

    public final VmojiCharacterPreviewBackgroundColorDto d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.body;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiCharacterPreviewDto)) {
            return false;
        }
        VmojiCharacterPreviewDto vmojiCharacterPreviewDto = (VmojiCharacterPreviewDto) obj;
        return epx.f(this.head, vmojiCharacterPreviewDto.head) && epx.f(this.body, vmojiCharacterPreviewDto.body) && epx.f(this.backgroundColor, vmojiCharacterPreviewDto.backgroundColor) && epx.f(this.stickers, vmojiCharacterPreviewDto.stickers);
    }

    public final String f() {
        return this.head;
    }

    public final List<String> g() {
        return this.stickers;
    }

    public final int hashCode() {
        String str = this.head;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VmojiCharacterPreviewBackgroundColorDto vmojiCharacterPreviewBackgroundColorDto = this.backgroundColor;
        int hashCode3 = (hashCode2 + (vmojiCharacterPreviewBackgroundColorDto == null ? 0 : vmojiCharacterPreviewBackgroundColorDto.hashCode())) * 31;
        List<String> list = this.stickers;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiCharacterPreviewDto(head=");
        sb.append(this.head);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", stickers=");
        return ms9.a(')', sb, this.stickers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.head);
        parcel.writeString(this.body);
        VmojiCharacterPreviewBackgroundColorDto vmojiCharacterPreviewBackgroundColorDto = this.backgroundColor;
        if (vmojiCharacterPreviewBackgroundColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiCharacterPreviewBackgroundColorDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.stickers);
    }

    public VmojiCharacterPreviewDto(String str, String str2, VmojiCharacterPreviewBackgroundColorDto vmojiCharacterPreviewBackgroundColorDto, List<String> list) {
        this.head = str;
        this.body = str2;
        this.backgroundColor = vmojiCharacterPreviewBackgroundColorDto;
        this.stickers = list;
    }

    public /* synthetic */ VmojiCharacterPreviewDto(String str, String str2, VmojiCharacterPreviewBackgroundColorDto vmojiCharacterPreviewBackgroundColorDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : vmojiCharacterPreviewBackgroundColorDto, (i & 8) != 0 ? null : list);
    }
}
