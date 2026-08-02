package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallCreateCommentEntryPointDto.kt */
/* loaded from: classes15.dex */
public final class WallCreateCommentEntryPointDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallCreateCommentEntryPointDto[] $VALUES;

    @pmi0("comments_modal")
    public static final WallCreateCommentEntryPointDto COMMENTS_MODAL;

    @pmi0("comments_section")
    public static final WallCreateCommentEntryPointDto COMMENTS_SECTION;

    @pmi0("comments_thread")
    public static final WallCreateCommentEntryPointDto COMMENTS_THREAD;

    @pmi0("comments_thread_modal")
    public static final WallCreateCommentEntryPointDto COMMENTS_THREAD_MODAL;
    public static final Parcelable.Creator<WallCreateCommentEntryPointDto> CREATOR;

    @pmi0("inline_comment")
    public static final WallCreateCommentEntryPointDto INLINE_COMMENT;
    private final String value;

    /* compiled from: WallCreateCommentEntryPointDto.kt */
    public static final class a implements Parcelable.Creator<WallCreateCommentEntryPointDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCreateCommentEntryPointDto createFromParcel(Parcel parcel) {
            return WallCreateCommentEntryPointDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallCreateCommentEntryPointDto[] newArray(int i) {
            return new WallCreateCommentEntryPointDto[i];
        }
    }

    static {
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto = new WallCreateCommentEntryPointDto("COMMENTS_SECTION", 0, "comments_section");
        COMMENTS_SECTION = wallCreateCommentEntryPointDto;
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto2 = new WallCreateCommentEntryPointDto("COMMENTS_THREAD", 1, "comments_thread");
        COMMENTS_THREAD = wallCreateCommentEntryPointDto2;
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto3 = new WallCreateCommentEntryPointDto("COMMENTS_MODAL", 2, "comments_modal");
        COMMENTS_MODAL = wallCreateCommentEntryPointDto3;
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto4 = new WallCreateCommentEntryPointDto("COMMENTS_THREAD_MODAL", 3, "comments_thread_modal");
        COMMENTS_THREAD_MODAL = wallCreateCommentEntryPointDto4;
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto5 = new WallCreateCommentEntryPointDto("INLINE_COMMENT", 4, "inline_comment");
        INLINE_COMMENT = wallCreateCommentEntryPointDto5;
        WallCreateCommentEntryPointDto[] wallCreateCommentEntryPointDtoArr = {wallCreateCommentEntryPointDto, wallCreateCommentEntryPointDto2, wallCreateCommentEntryPointDto3, wallCreateCommentEntryPointDto4, wallCreateCommentEntryPointDto5};
        $VALUES = wallCreateCommentEntryPointDtoArr;
        $ENTRIES = new asp(wallCreateCommentEntryPointDtoArr);
        CREATOR = new a();
    }

    private WallCreateCommentEntryPointDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallCreateCommentEntryPointDto valueOf(String str) {
        return (WallCreateCommentEntryPointDto) Enum.valueOf(WallCreateCommentEntryPointDto.class, str);
    }

    public static WallCreateCommentEntryPointDto[] values() {
        return (WallCreateCommentEntryPointDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
