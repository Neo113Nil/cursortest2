package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.stories.dto.StoriesBackgroundDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VmojiGetAvatarStoryDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetAvatarStoryDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetAvatarStoryDataResponseDto> CREATOR = new a();

    @pmi0("backgrounds")
    private final List<StoriesBackgroundDto> backgrounds;

    @pmi0("sticker_renders")
    private final List<StickersStickerRenderDto> stickerRenders;

    /* compiled from: VmojiGetAvatarStoryDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetAvatarStoryDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetAvatarStoryDataResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(VmojiGetAvatarStoryDataResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new VmojiGetAvatarStoryDataResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetAvatarStoryDataResponseDto[] newArray(int i) {
            return new VmojiGetAvatarStoryDataResponseDto[i];
        }
    }

    public VmojiGetAvatarStoryDataResponseDto(List<StoriesBackgroundDto> list, List<StickersStickerRenderDto> list2) {
        this.backgrounds = list;
        this.stickerRenders = list2;
    }

    public final List<StoriesBackgroundDto> d() {
        return this.backgrounds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersStickerRenderDto> e() {
        return this.stickerRenders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiGetAvatarStoryDataResponseDto)) {
            return false;
        }
        VmojiGetAvatarStoryDataResponseDto vmojiGetAvatarStoryDataResponseDto = (VmojiGetAvatarStoryDataResponseDto) obj;
        return epx.f(this.backgrounds, vmojiGetAvatarStoryDataResponseDto.backgrounds) && epx.f(this.stickerRenders, vmojiGetAvatarStoryDataResponseDto.stickerRenders);
    }

    public final int hashCode() {
        return this.stickerRenders.hashCode() + (this.backgrounds.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetAvatarStoryDataResponseDto(backgrounds=");
        sb.append(this.backgrounds);
        sb.append(", stickerRenders=");
        return ms9.a(')', sb, this.stickerRenders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.backgrounds);
        while (a2.hasNext()) {
            ((StoriesBackgroundDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.stickerRenders);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
