package com.vk.camera.clips.core.drafts;

import android.os.Parcel;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.s3q0;
import xsna.uqi;
import xsna.w9y;
import xsna.zcl;

/* compiled from: DraftUserRelatedData.kt */
/* loaded from: classes14.dex */
public final class DraftUserRelatedData implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<DraftUserRelatedData> CREATOR = new b();
    public static final a g = new a();
    public final UserId b;
    public final List<CoOwnerItem> c;
    public final ClipsDraftablePlaylist d;
    public final String e;
    public final Integer f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<DraftUserRelatedData> {
        @Override // xsna.aay
        public final DraftUserRelatedData a(JSONObject jSONObject) {
            String D;
            UserId userId = new UserId(jSONObject.getLong("user_id"));
            ArrayList a = aay.a.a(jSONObject, "coauthors", CoOwnerItem.g);
            ClipsDraftablePlaylist clipsDraftablePlaylist = (ClipsDraftablePlaylist) aay.a.c(jSONObject, "playlist", ClipsDraftablePlaylist.f);
            ClipsVideoAttachmentData clipsVideoAttachmentData = (ClipsVideoAttachmentData) aay.a.c(jSONObject, "video", ClipsVideoAttachmentData.i);
            if (clipsVideoAttachmentData == null || (D = clipsVideoAttachmentData.e) == null) {
                D = f370.D(jSONObject, "attached_video_id");
            }
            return new DraftUserRelatedData(userId, a, clipsDraftablePlaylist, D, f370.x(jSONObject, "attached_video_album_id"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DraftUserRelatedData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DraftUserRelatedData a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            ArrayList k = serializer.k(CoOwnerItem.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new DraftUserRelatedData(userId, k, (ClipsDraftablePlaylist) serializer.G(ClipsDraftablePlaylist.class.getClassLoader()), serializer.H(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DraftUserRelatedData[i];
        }
    }

    public DraftUserRelatedData(UserId userId, List<CoOwnerItem> list, ClipsDraftablePlaylist clipsDraftablePlaylist, String str, Integer num) {
        this.b = userId;
        this.c = list;
        this.d = clipsDraftablePlaylist;
        this.e = str;
        this.f = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.W(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.V(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.d(Long.valueOf(this.b.b), "user_id");
        w9yVar.e(this.c, "coauthors");
        w9yVar.g("playlist", this.d);
        w9yVar.e(this.e, "attached_video_id");
        w9yVar.c(this.f, "attached_video_album_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftUserRelatedData)) {
            return false;
        }
        DraftUserRelatedData draftUserRelatedData = (DraftUserRelatedData) obj;
        return epx.f(this.b, draftUserRelatedData.b) && epx.f(this.c, draftUserRelatedData.c) && epx.f(this.d, draftUserRelatedData.d) && epx.f(this.e, draftUserRelatedData.e) && epx.f(this.f, draftUserRelatedData.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        List<CoOwnerItem> list = this.c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ClipsDraftablePlaylist clipsDraftablePlaylist = this.d;
        int hashCode3 = (hashCode2 + (clipsDraftablePlaylist == null ? 0 : clipsDraftablePlaylist.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftUserRelatedData(userId=");
        sb.append(this.b);
        sb.append(", coauthors=");
        sb.append(this.c);
        sb.append(", playlist=");
        sb.append(this.d);
        sb.append(", attachedVideoId=");
        sb.append(this.e);
        sb.append(", attachedVideoAlbumId=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ DraftUserRelatedData(UserId userId, List list, ClipsDraftablePlaylist clipsDraftablePlaylist, String str, Integer num, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : clipsDraftablePlaylist, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
    }
}
