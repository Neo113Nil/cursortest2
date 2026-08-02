package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallAddCommentEntryPointDto.kt */
/* loaded from: classes15.dex */
public final class WallAddCommentEntryPointDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallAddCommentEntryPointDto[] $VALUES;

    @pmi0("comments_modal")
    public static final WallAddCommentEntryPointDto COMMENTS_MODAL;

    @pmi0("comments_section")
    public static final WallAddCommentEntryPointDto COMMENTS_SECTION;

    @pmi0("comments_thread")
    public static final WallAddCommentEntryPointDto COMMENTS_THREAD;

    @pmi0("comments_thread_modal")
    public static final WallAddCommentEntryPointDto COMMENTS_THREAD_MODAL;
    public static final Parcelable.Creator<WallAddCommentEntryPointDto> CREATOR;

    @pmi0("inline_comment")
    public static final WallAddCommentEntryPointDto INLINE_COMMENT;
    private final String value;

    /* compiled from: WallAddCommentEntryPointDto.kt */
    public static final class a implements Parcelable.Creator<WallAddCommentEntryPointDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAddCommentEntryPointDto createFromParcel(Parcel parcel) {
            return WallAddCommentEntryPointDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallAddCommentEntryPointDto[] newArray(int i) {
            return new WallAddCommentEntryPointDto[i];
        }
    }

    static {
        WallAddCommentEntryPointDto wallAddCommentEntryPointDto = new WallAddCommentEntryPointDto("COMMENTS_SECTION", 0, "comments_section");
        COMMENTS_SECTION = wallAddCommentEntryPointDto;
        WallAddCommentEntryPointDto wallAddCommentEntryPointDto2 = new WallAddCommentEntryPointDto("COMMENTS_THREAD", 1, "comments_thread");
        COMMENTS_THREAD = wallAddCommentEntryPointDto2;
        WallAddCommentEntryPointDto wallAddCommentEntryPointDto3 = new WallAddCommentEntryPointDto("COMMENTS_MODAL", 2, "comments_modal");
        COMMENTS_MODAL = wallAddCommentEntryPointDto3;
        WallAddCommentEntryPointDto wallAddCommentEntryPointDto4 = new WallAddCommentEntryPointDto("COMMENTS_THREAD_MODAL", 3, "comments_thread_modal");
        COMMENTS_THREAD_MODAL = wallAddCommentEntryPointDto4;
        WallAddCommentEntryPointDto wallAddCommentEntryPointDto5 = new WallAddCommentEntryPointDto("INLINE_COMMENT", 4, "inline_comment");
        INLINE_COMMENT = wallAddCommentEntryPointDto5;
        WallAddCommentEntryPointDto[] wallAddCommentEntryPointDtoArr = {wallAddCommentEntryPointDto, wallAddCommentEntryPointDto2, wallAddCommentEntryPointDto3, wallAddCommentEntryPointDto4, wallAddCommentEntryPointDto5};
        $VALUES = wallAddCommentEntryPointDtoArr;
        $ENTRIES = new asp(wallAddCommentEntryPointDtoArr);
        CREATOR = new a();
    }

    private WallAddCommentEntryPointDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallAddCommentEntryPointDto valueOf(String str) {
        return (WallAddCommentEntryPointDto) Enum.valueOf(WallAddCommentEntryPointDto.class, str);
    }

    public static WallAddCommentEntryPointDto[] values() {
        return (WallAddCommentEntryPointDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
