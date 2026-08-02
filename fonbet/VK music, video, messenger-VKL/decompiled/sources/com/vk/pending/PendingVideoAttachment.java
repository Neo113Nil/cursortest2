package com.vk.pending;

import androidx.annotation.NonNull;
import com.vk.api.video.VideoSave;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.fkq0;
import xsna.ju90;
import xsna.obr;
import xsna.xus;

/* loaded from: classes4.dex */
public class PendingVideoAttachment extends VideoAttachment implements ju90 {
    public static final Serializer.c<PendingVideoAttachment> CREATOR = new a();
    public int p;
    public final VideoSave.Target q;
    public final UserId r;
    public int s;
    public int t;

    public class a extends Serializer.c<PendingVideoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingVideoAttachment a(@NonNull Serializer serializer) {
            return new PendingVideoAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingVideoAttachment[i];
        }
    }

    public PendingVideoAttachment(VideoFile videoFile, VideoSave.Target target, UserId userId) {
        super(videoFile);
        this.p = com.vk.upload.impl.a.d.getAndIncrement();
        this.q = target;
        this.r = fkq0.b(userId) ? userId : obr.g().a().y();
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.p = i;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        super.O7(serializer);
        serializer.S(this.q.ordinal());
        serializer.e0(this.r);
        serializer.S(this.s);
        serializer.S(this.t);
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("video", this.k.e5());
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    @Override // xsna.ju90
    public final int S() {
        return this.p;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment
    public final int getHeight() {
        return this.t;
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.k.w9().Ab(VideoUrl.EXTERNAL_URL);
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment
    public final int getWidth() {
        return this.s;
    }

    @Override // xsna.ju90
    public final b<VideoFile> y6() {
        VideoUploadTaskNew videoUploadTaskNew = new VideoUploadTaskNew(this.k.w9().Ab(VideoUrl.EXTERNAL_URL), this.k.getTitle(), "", this.q, this.r, "PendingVideoAttachment", null, false, Collections.EMPTY_LIST, "", "", null, null, null, 0L, null, false, true, false);
        videoUploadTaskNew.d = this.p;
        return videoUploadTaskNew;
    }

    public PendingVideoAttachment(Serializer serializer) {
        super(serializer);
        this.p = com.vk.upload.impl.a.d.getAndIncrement();
        this.q = VideoSave.Target.values()[serializer.u()];
        this.r = (UserId) serializer.A(UserId.class.getClassLoader());
        this.s = serializer.u();
        this.t = serializer.u();
    }
}
