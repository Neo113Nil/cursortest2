package com.vk.newsfeed.posting.impl.domain.model.attachment;

import android.content.Context;
import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.cvz;
import xsna.drm0;
import xsna.e43;
import xsna.hd60;
import xsna.hg10;
import xsna.jeq0;
import xsna.myc0;
import xsna.oeq0;
import xsna.shy;
import xsna.vu5;

/* compiled from: LocalVideoAttachment.kt */
/* loaded from: classes4.dex */
public final class LocalVideoAttachment extends VideoAttachment implements cvz {
    public static final Serializer.c<LocalVideoAttachment> CREATOR = new b();
    public final LocalMediaEntry.Video p;
    public final int q;
    public final int r;

    /* compiled from: LocalVideoAttachment.kt */
    public static final class a {

        /* compiled from: LocalVideoAttachment.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment$a$a, reason: collision with other inner class name */
        public static final class C1420a {
            public final VideoFileOld a;
            public final int b;
            public final int c;

            public C1420a(VideoFileOld videoFileOld, int i, int i2) {
                this.a = videoFileOld;
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1420a)) {
                    return false;
                }
                C1420a c1420a = (C1420a) obj;
                return this.a.equals(c1420a.a) && this.b == c1420a.b && this.c == c1420a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VideoFileData(file=");
                sb.append(this.a);
                sb.append(", width=");
                sb.append(this.b);
                sb.append(", height=");
                return vu5.b(sb, this.c, ')');
            }
        }

        public static LocalVideoAttachment a(LocalMediaEntry.Video video) {
            C1420a c1420a;
            Uri g;
            MediaUtils.f d;
            Uri uri = video.b.k;
            String uri2 = uri.toString();
            String n = com.vk.core.files.a.n(uri);
            if (n == null || (g = jeq0.g(n)) == null) {
                VideoFileOld videoFileOld = new VideoFileOld();
                videoFileOld.c = com.vk.upload.impl.a.d.getAndIncrement();
                c1420a = new C1420a(videoFileOld, 0, 0);
            } else {
                Uri f = oeq0.f(uri, g);
                if (oeq0.e(f)) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    d = MediaUtils.a.c(context, f, false);
                } else {
                    d = MediaUtils.a.d(uri2);
                }
                if (d == null) {
                    d = MediaUtils.a.d(drm0.U(uri2, "file://"));
                }
                int i = (d != null ? d.f : 0) / 1000;
                int i2 = d != null ? d.a : 0;
                int i3 = d != null ? d.b : 0;
                VideoFileOld videoFileOld2 = new VideoFileOld();
                videoFileOld2.p0 = hd60.a().a().r();
                videoFileOld2.q0 = hd60.a().a().u();
                videoFileOld2.q = (int) (System.currentTimeMillis() / 1000);
                videoFileOld2.e = i;
                HashMap hashMap = new HashMap();
                VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                String uri3 = f.toString();
                if (uri3 != null) {
                    String str = myc0.f(uri3) ? uri3 : null;
                    if (str != null) {
                        VideoUrlStorage.b bVar = VideoUrlStorage.c;
                        VideoUrlStorage.d.b(hashMap, videoUrl, str);
                    }
                }
                videoFileOld2.f = new VideoUrlStorage(hashMap);
                String lastPathSegment = Uri.parse(n).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                videoFileOld2.l = lastPathSegment;
                videoFileOld2.c = com.vk.upload.impl.a.d.getAndIncrement();
                videoFileOld2.I = false;
                videoFileOld2.B = false;
                videoFileOld2.C = false;
                videoFileOld2.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(f.toString(), i2, i3, null, (char) 0, false, 56, null)));
                videoFileOld2.m0 = i2;
                videoFileOld2.n0 = i3;
                c1420a = new C1420a(videoFileOld2, i2, i3);
            }
            return new LocalVideoAttachment(video, c1420a.a, c1420a.b, c1420a.c);
        }

        public static LocalVideoAttachment b(JSONObject jSONObject) {
            try {
                int i = jSONObject.getInt("type");
                int i2 = jSONObject.getInt("local_media_id");
                Uri parse = Uri.parse(jSONObject.getString("local_media_path"));
                long j = jSONObject.getLong("local_media_date_taken");
                int i3 = jSONObject.getInt("local_media_width");
                int i4 = jSONObject.getInt("local_media_height");
                long j2 = jSONObject.getLong("local_media_date_modified");
                long j3 = jSONObject.getLong("local_media_size");
                MediaStoreVideoEntry mediaStoreVideoEntry = i != 17 ? i != 18 ? null : new MediaStoreVideoEntry(i2, parse, j, i3, i4, j2, j3, jSONObject.getLong("local_media_duration")) : (MediaStoreVideoEntry) new MediaStoreImageEntry(i2, parse, j, i3, i4, j2, j3, jSONObject.getInt("local_media_photo_exif_orientation"));
                if (mediaStoreVideoEntry == null) {
                    return null;
                }
                return a(new LocalMediaEntry.Video(mediaStoreVideoEntry));
            } catch (JSONException e) {
                L.g("Can't parse json to LocalVideoAttachment", e);
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<LocalVideoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LocalVideoAttachment a(Serializer serializer) {
            return new LocalVideoAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocalVideoAttachment[i];
        }
    }

    public LocalVideoAttachment(LocalMediaEntry.Video video, VideoFile videoFile, int i, int i2) {
        super(videoFile);
        this.q = i;
        this.r = i2;
        this.p = video;
    }

    @Override // xsna.cvz
    public final LocalMediaEntry M3() {
        return this.p;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.p);
        serializer.S(this.q);
        serializer.S(this.r);
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, xsna.tec0
    public final JSONObject Q3() {
        return hg10.s(this.p.b);
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment
    public final int getHeight() {
        return this.r;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment
    public final int getWidth() {
        return this.q;
    }

    public LocalVideoAttachment(Serializer serializer) {
        super(serializer);
        this.p = (LocalMediaEntry.Video) serializer.A(LocalMediaEntry.Video.class.getClassLoader());
        this.q = serializer.u();
        this.r = serializer.u();
    }
}
