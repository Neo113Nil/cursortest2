package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoAccessDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoAccessDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoAccessDto> CREATOR = new a();

    @pmi0("can_comment")
    private final Boolean canComment;

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_download")
    private final Boolean canDownload;

    @pmi0("can_like")
    private final Boolean canLike;

    @pmi0("can_make_duet")
    private final Boolean canMakeDuet;

    @pmi0("can_repost")
    private final Boolean canRepost;

    @pmi0("can_subscribe")
    private final Boolean canSubscribe;

    @pmi0("edit")
    private final ShortVideoShortVideoAccessEditDto edit;

    /* compiled from: ShortVideoShortVideoAccessDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoAccessDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAccessDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean bool = null;
            ShortVideoShortVideoAccessEditDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoShortVideoAccessEditDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoShortVideoAccessDto(createFromParcel, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAccessDto[] newArray(int i) {
            return new ShortVideoShortVideoAccessDto[i];
        }
    }

    public ShortVideoShortVideoAccessDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Boolean d() {
        return this.canComment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canDelete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoAccessDto)) {
            return false;
        }
        ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto = (ShortVideoShortVideoAccessDto) obj;
        return epx.f(this.edit, shortVideoShortVideoAccessDto.edit) && epx.f(this.canDelete, shortVideoShortVideoAccessDto.canDelete) && epx.f(this.canComment, shortVideoShortVideoAccessDto.canComment) && epx.f(this.canLike, shortVideoShortVideoAccessDto.canLike) && epx.f(this.canRepost, shortVideoShortVideoAccessDto.canRepost) && epx.f(this.canSubscribe, shortVideoShortVideoAccessDto.canSubscribe) && epx.f(this.canMakeDuet, shortVideoShortVideoAccessDto.canMakeDuet) && epx.f(this.canDownload, shortVideoShortVideoAccessDto.canDownload);
    }

    public final Boolean f() {
        return this.canDownload;
    }

    public final Boolean g() {
        return this.canLike;
    }

    public final int hashCode() {
        ShortVideoShortVideoAccessEditDto shortVideoShortVideoAccessEditDto = this.edit;
        int hashCode = (shortVideoShortVideoAccessEditDto == null ? 0 : shortVideoShortVideoAccessEditDto.hashCode()) * 31;
        Boolean bool = this.canDelete;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canComment;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canLike;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canRepost;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canSubscribe;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canMakeDuet;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.canDownload;
        return hashCode7 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean i() {
        return this.canMakeDuet;
    }

    public final Boolean j() {
        return this.canRepost;
    }

    public final Boolean k() {
        return this.canSubscribe;
    }

    public final ShortVideoShortVideoAccessEditDto l() {
        return this.edit;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoAccessDto(edit=");
        sb.append(this.edit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", canLike=");
        sb.append(this.canLike);
        sb.append(", canRepost=");
        sb.append(this.canRepost);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", canMakeDuet=");
        sb.append(this.canMakeDuet);
        sb.append(", canDownload=");
        return tn.a(sb, this.canDownload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShortVideoShortVideoAccessEditDto shortVideoShortVideoAccessEditDto = this.edit;
        if (shortVideoShortVideoAccessEditDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoAccessEditDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canComment;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canLike;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canRepost;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canSubscribe;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canMakeDuet;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.canDownload;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
    }

    public ShortVideoShortVideoAccessDto(ShortVideoShortVideoAccessEditDto shortVideoShortVideoAccessEditDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.edit = shortVideoShortVideoAccessEditDto;
        this.canDelete = bool;
        this.canComment = bool2;
        this.canLike = bool3;
        this.canRepost = bool4;
        this.canSubscribe = bool5;
        this.canMakeDuet = bool6;
        this.canDownload = bool7;
    }

    public /* synthetic */ ShortVideoShortVideoAccessDto(ShortVideoShortVideoAccessEditDto shortVideoShortVideoAccessEditDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : shortVideoShortVideoAccessEditDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) != 0 ? null : bool7);
    }
}
