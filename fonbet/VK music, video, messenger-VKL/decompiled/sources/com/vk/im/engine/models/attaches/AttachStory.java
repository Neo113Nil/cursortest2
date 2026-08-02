package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.camera.PhotoParams;
import com.vk.im.engine.models.camera.UploadParams;
import com.vk.im.engine.models.camera.VideoParams;
import java.io.File;
import xsna.bo;
import xsna.bpn0;
import xsna.epx;
import xsna.ftx0;
import xsna.fvr;
import xsna.fw3;
import xsna.g5;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.vu5;
import xsna.xg5;
import xsna.ysx0;
import xsna.zcl;

/* compiled from: AttachStory.kt */
/* loaded from: classes2.dex */
public final class AttachStory implements AttachWithId, ysx0, ftx0 {
    public static final Serializer.c<AttachStory> CREATOR = new a();
    public final StoryEntry b;
    public int c;
    public AttachSyncState d;
    public final ImageList e;
    public final ImageList f;
    public final UploadParams g;
    public final VideoParams h;
    public final PhotoParams i;
    public final long j;
    public final bpn0 k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachStory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachStory a(Serializer serializer) {
            return new AttachStory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachStory[i];
        }
    }

    public AttachStory(StoryEntry storyEntry, int i, AttachSyncState attachSyncState, ImageList imageList, ImageList imageList2, UploadParams uploadParams, VideoParams videoParams, PhotoParams photoParams, long j) {
        this.b = storyEntry;
        this.c = i;
        this.d = attachSyncState;
        this.e = imageList;
        this.f = imageList2;
        this.g = uploadParams;
        this.h = videoParams;
        this.i = photoParams;
        this.j = j;
        this.k = new bpn0(new g5(this, 4));
    }

    public static AttachStory a(AttachStory attachStory, StoryEntry storyEntry, int i, ImageList imageList, int i2) {
        if ((i2 & 1) != 0) {
            storyEntry = attachStory.b;
        }
        StoryEntry storyEntry2 = storyEntry;
        if ((i2 & 2) != 0) {
            i = attachStory.c;
        }
        int i3 = i;
        AttachSyncState attachSyncState = attachStory.d;
        if ((i2 & 8) != 0) {
            imageList = attachStory.e;
        }
        ImageList imageList2 = attachStory.f;
        UploadParams uploadParams = attachStory.g;
        VideoParams videoParams = attachStory.h;
        PhotoParams photoParams = attachStory.i;
        long j = attachStory.j;
        attachStory.getClass();
        return new AttachStory(storyEntry2, i3, attachSyncState, imageList, imageList2, uploadParams, videoParams, photoParams, j);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StoryEntry storyEntry = this.b;
        String str2 = storyEntry.o;
        if (str2 == null || str2.length() == 0) {
            StringBuilder a2 = t33.a("https://", str, "/story");
            a2.append(storyEntry.d);
            a2.append('_');
            a2.append(storyEntry.c);
            return a2.toString();
        }
        StringBuilder a3 = t33.a("https://", str, "/story");
        a3.append(storyEntry.d);
        a3.append('_');
        a3.append(storyEntry.c);
        a3.append("?access_key=");
        a3.append(storyEntry.o);
        return a3.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.c);
        serializer.S(this.d.h());
        serializer.i0(this.b);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.Y(this.j);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    public final boolean b(Peer peer, long j) {
        boolean i = i(j);
        StoryEntry storyEntry = this.b;
        return !storyEntry.k && !storyEntry.B && storyEntry.C && (!i || xg5.a().a(storyEntry.d)) && (!storyEntry.i0 || fvr.p(storyEntry, com.vk.dto.common.a.b(peer)));
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return a(this, this.b, 0, null, 510);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.ysx0
    public final boolean e() {
        return this.b.i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachStory)) {
            return false;
        }
        AttachStory attachStory = (AttachStory) obj;
        return epx.f(this.b, attachStory.b) && this.c == attachStory.c && this.d == attachStory.d && epx.f(this.e, attachStory.e) && epx.f(this.f, attachStory.f) && epx.f(this.g, attachStory.g) && epx.f(this.h, attachStory.h) && epx.f(this.i, attachStory.i) && this.j == attachStory.j;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.f);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b.c;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(bo.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e.b), 31, this.f.b);
        UploadParams uploadParams = this.g;
        int hashCode = (a2 + (uploadParams == null ? 0 : uploadParams.hashCode())) * 31;
        VideoParams videoParams = this.h;
        int hashCode2 = (hashCode + (videoParams == null ? 0 : videoParams.hashCode())) * 31;
        PhotoParams photoParams = this.i;
        return Long.hashCode(this.j) + ((hashCode2 + (photoParams != null ? photoParams.b.hashCode() : 0)) * 31);
    }

    public final boolean i(long j) {
        Long l;
        StoryEntry storyEntry = this.b;
        return (storyEntry.f == 0 || (l = storyEntry.g) == null || l.longValue() >= j) ? false : true;
    }

    @Override // xsna.ftx0
    public final File i1() {
        File file;
        PhotoParams photoParams = this.i;
        if (photoParams != null && (file = photoParams.b) != null) {
            return file;
        }
        VideoParams videoParams = this.h;
        if (videoParams != null) {
            return videoParams.b;
        }
        return null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.b.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachStory(story=");
        sb.append(this.b);
        sb.append(", localId=");
        sb.append(this.c);
        sb.append(", syncState=");
        sb.append(this.d);
        sb.append(", localImages=");
        sb.append(this.e);
        sb.append(", remoteImages=");
        sb.append(this.f);
        sb.append(", uploadParams=");
        sb.append(this.g);
        sb.append(", videoParams=");
        sb.append(this.h);
        sb.append(", photoParams=");
        sb.append(this.i);
        sb.append(", lastSyncTime=");
        return vu5.a(')', this.j, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AttachStory(StoryEntry storyEntry, int i, AttachSyncState attachSyncState, ImageList imageList, ImageList imageList2, UploadParams uploadParams, VideoParams videoParams, PhotoParams photoParams, long j, int i2, zcl zclVar) {
        this(storyEntry, i, attachSyncState, imageList, imageList2, uploadParams, videoParams, photoParams, j);
        i = (i2 & 2) != 0 ? 0 : i;
        attachSyncState = (i2 & 4) != 0 ? AttachSyncState.DONE : attachSyncState;
        imageList = (i2 & 8) != 0 ? new ImageList(null, 1, null) : imageList;
        if ((i2 & 16) != 0) {
            String Cb = storyEntry.Cb(true);
            imageList2 = new ImageList(new Image(Cb == null ? "" : Cb));
        }
        uploadParams = (i2 & 32) != 0 ? null : uploadParams;
        videoParams = (i2 & 64) != 0 ? null : videoParams;
        photoParams = (i2 & 128) != 0 ? null : photoParams;
        if ((i2 & 256) != 0) {
            j = (storyEntry.n != null ? r12.b0() : 0) * 1000;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachStory(Serializer serializer) {
        this((StoryEntry) serializer.G(StoryEntry.class.getClassLoader()), r2, r3, (ImageList) serializer.G(ImageList.class.getClassLoader()), (ImageList) serializer.G(ImageList.class.getClassLoader()), (UploadParams) serializer.G(UploadParams.class.getClassLoader()), (VideoParams) serializer.G(VideoParams.class.getClassLoader()), (PhotoParams) serializer.G(PhotoParams.class.getClassLoader()), serializer.w());
        int u = serializer.u();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachStory(UploadParams uploadParams, VideoParams videoParams, PhotoParams photoParams) {
        this(r1, 0, AttachSyncState.UPLOAD_REQUIRED, ImageList.a.b((videoParams == null || (r2 = videoParams.d) == null) ? photoParams != null ? photoParams.b : null : r2), new ImageList(null, 1, null), uploadParams, videoParams, photoParams, 0L, 256, null);
        File file;
        StoryEntry storyEntry = new StoryEntry();
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
    }
}
