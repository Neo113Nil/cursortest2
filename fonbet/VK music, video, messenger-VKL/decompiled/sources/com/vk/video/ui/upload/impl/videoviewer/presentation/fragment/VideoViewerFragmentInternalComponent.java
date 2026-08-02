package com.vk.video.ui.upload.impl.videoviewer.presentation.fragment;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.e1m0;
import xsna.fp;
import xsna.fpf0;
import xsna.mlf0;
import xsna.nrt0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VideoViewerFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class VideoViewerFragmentInternalComponent implements DiScopedComponent<nrt0> {
    public final nrt0 a;
    public final AppContextDiComponent b;
    public final nwy c = new nwy(new e1m0(12));
    public final nwy d = new nwy(new mlf0(this, 22));
    public static final /* synthetic */ qcy<Object>[] f = {new PropertyReference1Impl(VideoViewerFragmentInternalComponent.class, "videoViewerNetworkApi", "getVideoViewerNetworkApi()Lcom/vk/video/ui/upload/impl/videoviewer/domain/repository/VideoViewerNetworkApi;", 0), fp.c(0, VideoViewerFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/videoviewer/presentation/feature/store/VideoViewerViewStateMapper;", fpf0.a)};
    public static final a e = new a();

    /* compiled from: VideoViewerFragmentInternalComponent.kt */
    public static final class a {
    }

    public VideoViewerFragmentInternalComponent(nrt0 nrt0Var, AppContextDiComponent appContextDiComponent) {
        this.a = nrt0Var;
        this.b = appContextDiComponent;
    }
}
