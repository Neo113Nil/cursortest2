package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostAuthorDataDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAuthorDataDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAuthorDataDto> CREATOR = new a();

    @pmi0("author")
    private final UserId author;

    @pmi0("editor")
    private final UserId editor;

    @pmi0(Hb.b)
    private final UserId publisher;

    /* compiled from: WallWallpostAuthorDataDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAuthorDataDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAuthorDataDto createFromParcel(Parcel parcel) {
            return new WallWallpostAuthorDataDto((UserId) parcel.readParcelable(WallWallpostAuthorDataDto.class.getClassLoader()), (UserId) parcel.readParcelable(WallWallpostAuthorDataDto.class.getClassLoader()), (UserId) parcel.readParcelable(WallWallpostAuthorDataDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAuthorDataDto[] newArray(int i) {
            return new WallWallpostAuthorDataDto[i];
        }
    }

    public WallWallpostAuthorDataDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAuthorDataDto)) {
            return false;
        }
        WallWallpostAuthorDataDto wallWallpostAuthorDataDto = (WallWallpostAuthorDataDto) obj;
        return epx.f(this.author, wallWallpostAuthorDataDto.author) && epx.f(this.publisher, wallWallpostAuthorDataDto.publisher) && epx.f(this.editor, wallWallpostAuthorDataDto.editor);
    }

    public final int hashCode() {
        UserId userId = this.author;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        UserId userId2 = this.publisher;
        int hashCode2 = (hashCode + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        UserId userId3 = this.editor;
        return hashCode2 + (userId3 != null ? Long.hashCode(userId3.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostAuthorDataDto(author=");
        sb.append(this.author);
        sb.append(", publisher=");
        sb.append(this.publisher);
        sb.append(", editor=");
        return gp.b(sb, this.editor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.publisher, i);
        parcel.writeParcelable(this.editor, i);
    }

    public WallWallpostAuthorDataDto(UserId userId, UserId userId2, UserId userId3) {
        this.author = userId;
        this.publisher = userId2;
        this.editor = userId3;
    }

    public /* synthetic */ WallWallpostAuthorDataDto(UserId userId, UserId userId2, UserId userId3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : userId2, (i & 4) != 0 ? null : userId3);
    }
}
