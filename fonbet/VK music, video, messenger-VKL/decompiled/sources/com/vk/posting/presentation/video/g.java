package com.vk.posting.presentation.video;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import com.vk.posting.presentation.video.a;
import xsna.f2t0;
import xsna.xn50;

/* compiled from: VideoPickerView.kt */
/* loaded from: classes5.dex */
public final class g implements f2t0 {
    public final /* synthetic */ f a;

    public g(f fVar) {
        this.a = fVar;
    }

    @Override // xsna.f2t0
    public final void a(VideoFile videoFile) {
        xn50.a.c(this.a.c, new a.f.b(videoFile));
    }

    @Override // xsna.f2t0
    public final void b(VideoAlbum videoAlbum) {
        xn50.a.c(this.a.c, new a.f.C1538a(videoAlbum));
    }
}
