package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioPlaylistPermissionsDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistPermissionsDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistPermissionsDto> CREATOR = new a();

    @pmi0("boom_download")
    private final Boolean boomDownload;

    @pmi0("delete")
    private final Boolean delete;

    @pmi0("edit")
    private final Boolean edit;

    @pmi0("follow")
    private final Boolean follow;

    @pmi0("play")
    private final Boolean play;

    @pmi0("save_as_copy")
    private final Boolean saveAsCopy;

    @pmi0("share")
    private final Boolean share;

    @pmi0("view_content")
    private final Boolean viewContent;

    @pmi0("view_content_queue")
    private final Boolean viewContentQueue;

    /* compiled from: AudioPlaylistPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistPermissionsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean bool = null;
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
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioPlaylistPermissionsDto(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistPermissionsDto[] newArray(int i) {
            return new AudioPlaylistPermissionsDto[i];
        }
    }

    public AudioPlaylistPermissionsDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final Boolean d() {
        return this.boomDownload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.delete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistPermissionsDto)) {
            return false;
        }
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = (AudioPlaylistPermissionsDto) obj;
        return epx.f(this.play, audioPlaylistPermissionsDto.play) && epx.f(this.share, audioPlaylistPermissionsDto.share) && epx.f(this.edit, audioPlaylistPermissionsDto.edit) && epx.f(this.follow, audioPlaylistPermissionsDto.follow) && epx.f(this.delete, audioPlaylistPermissionsDto.delete) && epx.f(this.boomDownload, audioPlaylistPermissionsDto.boomDownload) && epx.f(this.saveAsCopy, audioPlaylistPermissionsDto.saveAsCopy) && epx.f(this.viewContent, audioPlaylistPermissionsDto.viewContent) && epx.f(this.viewContentQueue, audioPlaylistPermissionsDto.viewContentQueue);
    }

    public final Boolean f() {
        return this.edit;
    }

    public final Boolean g() {
        return this.follow;
    }

    public final int hashCode() {
        Boolean bool = this.play;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.share;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.edit;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.follow;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.delete;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.boomDownload;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.saveAsCopy;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.viewContent;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.viewContentQueue;
        return hashCode8 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public final Boolean i() {
        return this.play;
    }

    public final Boolean j() {
        return this.saveAsCopy;
    }

    public final Boolean k() {
        return this.share;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistPermissionsDto(play=");
        sb.append(this.play);
        sb.append(", share=");
        sb.append(this.share);
        sb.append(", edit=");
        sb.append(this.edit);
        sb.append(", follow=");
        sb.append(this.follow);
        sb.append(", delete=");
        sb.append(this.delete);
        sb.append(", boomDownload=");
        sb.append(this.boomDownload);
        sb.append(", saveAsCopy=");
        sb.append(this.saveAsCopy);
        sb.append(", viewContent=");
        sb.append(this.viewContent);
        sb.append(", viewContentQueue=");
        return tn.a(sb, this.viewContentQueue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.play;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.share;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.edit;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.follow;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.delete;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.boomDownload;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.saveAsCopy;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.viewContent;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.viewContentQueue;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
    }

    public AudioPlaylistPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this.play = bool;
        this.share = bool2;
        this.edit = bool3;
        this.follow = bool4;
        this.delete = bool5;
        this.boomDownload = bool6;
        this.saveAsCopy = bool7;
        this.viewContent = bool8;
        this.viewContentQueue = bool9;
    }

    public /* synthetic */ AudioPlaylistPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9);
    }
}
