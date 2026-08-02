package com.vk.clips.viewer.impl.di;

import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.comment.ReplyInfo;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.k15;
import xsna.n1;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s2f;

/* compiled from: ClipsViewerAdapterComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsViewerAdapterComponentImpl implements ClipsViewerAdapterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new n1(12));

    /* compiled from: ClipsViewerAdapterComponentImpl.kt */
    public static final class a implements c8m<ClipsViewerAdapterComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsViewerAdapterComponentImpl();
        }
    }

    /* compiled from: ClipsViewerAdapterComponentImpl.kt */
    public static final class b implements s2f {
        @Override // xsna.s2f
        public final VideoFile a(SdkVideoFile sdkVideoFile) {
            return k15.A(sdkVideoFile);
        }

        @Override // xsna.s2f
        public final SdkReplyInfo b(ReplyInfo replyInfo) {
            return new SdkReplyInfo(replyInfo.b, replyInfo.c);
        }

        @Override // xsna.s2f
        public final SdkVideoFile c(VideoFile videoFile) {
            return k15.B(videoFile);
        }

        @Override // xsna.s2f
        public final ClipsDraftablePlaylist d(SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist) {
            return new ClipsDraftablePlaylist(sdkClipsDraftablePlaylist.b, sdkClipsDraftablePlaylist.c, sdkClipsDraftablePlaylist.d, sdkClipsDraftablePlaylist.e);
        }

        @Override // xsna.s2f
        public final SdkClipVideoFile e(ClipVideoFile clipVideoFile) {
            return new ClipVideoFileAdapter(clipVideoFile);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerAdapterComponentImpl.class, "clipsSdkAdapter", "getClipsSdkAdapter()Lcom/vk/clips/viewer/api/adapters/ClipsSdkAdapter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent
    public final s2f e0() {
        qcy<Object> qcyVar = b[0];
        return (s2f) this.a.c();
    }
}
