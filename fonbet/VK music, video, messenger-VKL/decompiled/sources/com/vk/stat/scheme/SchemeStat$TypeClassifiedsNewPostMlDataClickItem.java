package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsNewPostMlDataClickItem {

    @pmi0("content_id")
    private final int contentId;

    @pmi0("has_post_photo")
    private final boolean hasPostPhoto;

    @pmi0("has_post_price")
    private final boolean hasPostPrice;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("photo_ml_response")
    private final PhotoMlResponse photoMlResponse;

    @pmi0("post_ml_response")
    private final PostMlResponse postMlResponse;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PhotoMlResponse {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoMlResponse[] $VALUES;

        @pmi0("name")
        public static final PhotoMlResponse NAME;

        @pmi0("none")
        public static final PhotoMlResponse NONE;

        @pmi0("not_found")
        public static final PhotoMlResponse NOT_FOUND;

        static {
            PhotoMlResponse photoMlResponse = new PhotoMlResponse("NAME", 0);
            NAME = photoMlResponse;
            PhotoMlResponse photoMlResponse2 = new PhotoMlResponse("NONE", 1);
            NONE = photoMlResponse2;
            PhotoMlResponse photoMlResponse3 = new PhotoMlResponse("NOT_FOUND", 2);
            NOT_FOUND = photoMlResponse3;
            PhotoMlResponse[] photoMlResponseArr = {photoMlResponse, photoMlResponse2, photoMlResponse3};
            $VALUES = photoMlResponseArr;
            $ENTRIES = new asp(photoMlResponseArr);
        }

        private PhotoMlResponse(String str, int i) {
        }

        public static PhotoMlResponse valueOf(String str) {
            return (PhotoMlResponse) Enum.valueOf(PhotoMlResponse.class, str);
        }

        public static PhotoMlResponse[] values() {
            return (PhotoMlResponse[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostMlResponse {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostMlResponse[] $VALUES;

        @pmi0("model")
        public static final PostMlResponse MODEL;

        @pmi0("name")
        public static final PostMlResponse NAME;

        @pmi0("none")
        public static final PostMlResponse NONE;

        static {
            PostMlResponse postMlResponse = new PostMlResponse("NONE", 0);
            NONE = postMlResponse;
            PostMlResponse postMlResponse2 = new PostMlResponse("MODEL", 1);
            MODEL = postMlResponse2;
            PostMlResponse postMlResponse3 = new PostMlResponse("NAME", 2);
            NAME = postMlResponse3;
            PostMlResponse[] postMlResponseArr = {postMlResponse, postMlResponse2, postMlResponse3};
            $VALUES = postMlResponseArr;
            $ENTRIES = new asp(postMlResponseArr);
        }

        private PostMlResponse(String str, int i) {
        }

        public static PostMlResponse valueOf(String str) {
            return (PostMlResponse) Enum.valueOf(PostMlResponse.class, str);
        }

        public static PostMlResponse[] values() {
            return (PostMlResponse[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsNewPostMlDataClickItem(long j, int i, PostMlResponse postMlResponse, boolean z, boolean z2, PhotoMlResponse photoMlResponse) {
        this.ownerId = j;
        this.contentId = i;
        this.postMlResponse = postMlResponse;
        this.hasPostPrice = z;
        this.hasPostPhoto = z2;
        this.photoMlResponse = photoMlResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsNewPostMlDataClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsNewPostMlDataClickItem schemeStat$TypeClassifiedsNewPostMlDataClickItem = (SchemeStat$TypeClassifiedsNewPostMlDataClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsNewPostMlDataClickItem.ownerId && this.contentId == schemeStat$TypeClassifiedsNewPostMlDataClickItem.contentId && this.postMlResponse == schemeStat$TypeClassifiedsNewPostMlDataClickItem.postMlResponse && this.hasPostPrice == schemeStat$TypeClassifiedsNewPostMlDataClickItem.hasPostPrice && this.hasPostPhoto == schemeStat$TypeClassifiedsNewPostMlDataClickItem.hasPostPhoto && this.photoMlResponse == schemeStat$TypeClassifiedsNewPostMlDataClickItem.photoMlResponse;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.postMlResponse.hashCode() + shy.a(this.contentId, Long.hashCode(this.ownerId) * 31, 31)) * 31, 31, this.hasPostPrice), 31, this.hasPostPhoto);
        PhotoMlResponse photoMlResponse = this.photoMlResponse;
        return b + (photoMlResponse == null ? 0 : photoMlResponse.hashCode());
    }

    public final String toString() {
        return "TypeClassifiedsNewPostMlDataClickItem(ownerId=" + this.ownerId + ", contentId=" + this.contentId + ", postMlResponse=" + this.postMlResponse + ", hasPostPrice=" + this.hasPostPrice + ", hasPostPhoto=" + this.hasPostPhoto + ", photoMlResponse=" + this.photoMlResponse + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsNewPostMlDataClickItem(long j, int i, PostMlResponse postMlResponse, boolean z, boolean z2, PhotoMlResponse photoMlResponse, int i2, zcl zclVar) {
        this(j, i, postMlResponse, z, z2, (i2 & 32) != 0 ? null : photoMlResponse);
    }
}
