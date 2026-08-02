package com.vk.api.generated.memories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MemoriesIsNewMemoriesAvailableResponseDto.kt */
/* loaded from: classes15.dex */
public final class MemoriesIsNewMemoriesAvailableResponseDto implements Parcelable {
    public static final Parcelable.Creator<MemoriesIsNewMemoriesAvailableResponseDto> CREATOR = new a();

    @pmi0("albums")
    private final Boolean albums;

    @pmi0("first_audio")
    private final Boolean firstAudio;

    @pmi0("first_avatar")
    private final Boolean firstAvatar;

    @pmi0("first_post")
    private final Boolean firstPost;

    @pmi0("first_story")
    private final Boolean firstStory;

    @pmi0("friendships")
    private final Boolean friendships;

    @pmi0("photos")
    private final Boolean photos;

    @pmi0("posts")
    private final Boolean posts;

    @pmi0("stories")
    private final Boolean stories;

    @pmi0("year_summary")
    private final Boolean yearSummary;

    /* compiled from: MemoriesIsNewMemoriesAvailableResponseDto.kt */
    public static final class a implements Parcelable.Creator<MemoriesIsNewMemoriesAvailableResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MemoriesIsNewMemoriesAvailableResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
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
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MemoriesIsNewMemoriesAvailableResponseDto(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MemoriesIsNewMemoriesAvailableResponseDto[] newArray(int i) {
            return new MemoriesIsNewMemoriesAvailableResponseDto[i];
        }
    }

    public MemoriesIsNewMemoriesAvailableResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final Boolean d() {
        return this.albums;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.firstAudio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoriesIsNewMemoriesAvailableResponseDto)) {
            return false;
        }
        MemoriesIsNewMemoriesAvailableResponseDto memoriesIsNewMemoriesAvailableResponseDto = (MemoriesIsNewMemoriesAvailableResponseDto) obj;
        return epx.f(this.posts, memoriesIsNewMemoriesAvailableResponseDto.posts) && epx.f(this.photos, memoriesIsNewMemoriesAvailableResponseDto.photos) && epx.f(this.stories, memoriesIsNewMemoriesAvailableResponseDto.stories) && epx.f(this.albums, memoriesIsNewMemoriesAvailableResponseDto.albums) && epx.f(this.yearSummary, memoriesIsNewMemoriesAvailableResponseDto.yearSummary) && epx.f(this.friendships, memoriesIsNewMemoriesAvailableResponseDto.friendships) && epx.f(this.firstAvatar, memoriesIsNewMemoriesAvailableResponseDto.firstAvatar) && epx.f(this.firstPost, memoriesIsNewMemoriesAvailableResponseDto.firstPost) && epx.f(this.firstAudio, memoriesIsNewMemoriesAvailableResponseDto.firstAudio) && epx.f(this.firstStory, memoriesIsNewMemoriesAvailableResponseDto.firstStory);
    }

    public final Boolean f() {
        return this.firstAvatar;
    }

    public final Boolean g() {
        return this.firstPost;
    }

    public final int hashCode() {
        Boolean bool = this.posts;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.photos;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.stories;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.albums;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.yearSummary;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.friendships;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.firstAvatar;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.firstPost;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.firstAudio;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.firstStory;
        return hashCode9 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final Boolean i() {
        return this.firstStory;
    }

    public final Boolean j() {
        return this.friendships;
    }

    public final Boolean k() {
        return this.photos;
    }

    public final Boolean l() {
        return this.posts;
    }

    public final Boolean n() {
        return this.stories;
    }

    public final Boolean o() {
        return this.yearSummary;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoriesIsNewMemoriesAvailableResponseDto(posts=");
        sb.append(this.posts);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", stories=");
        sb.append(this.stories);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", yearSummary=");
        sb.append(this.yearSummary);
        sb.append(", friendships=");
        sb.append(this.friendships);
        sb.append(", firstAvatar=");
        sb.append(this.firstAvatar);
        sb.append(", firstPost=");
        sb.append(this.firstPost);
        sb.append(", firstAudio=");
        sb.append(this.firstAudio);
        sb.append(", firstStory=");
        return tn.a(sb, this.firstStory, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.posts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.photos;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.stories;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.albums;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.yearSummary;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.friendships;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.firstAvatar;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.firstPost;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.firstAudio;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.firstStory;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
    }

    public MemoriesIsNewMemoriesAvailableResponseDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        this.posts = bool;
        this.photos = bool2;
        this.stories = bool3;
        this.albums = bool4;
        this.yearSummary = bool5;
        this.friendships = bool6;
        this.firstAvatar = bool7;
        this.firstPost = bool8;
        this.firstAudio = bool9;
        this.firstStory = bool10;
    }

    public /* synthetic */ MemoriesIsNewMemoriesAvailableResponseDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9, (i & 512) != 0 ? null : bool10);
    }
}
