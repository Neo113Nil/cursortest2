package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.api.generated.video.dto.VideoSaveAssistantAlbumResponseDto;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import xsna.dfr0;
import xsna.izs;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sxl0;
import xsna.yfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    public /* synthetic */ c(d dVar, int i) {
        this.b = i;
        this.c = dVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VideoSaveAssistantAlbumResponseDto videoSaveAssistantAlbumResponseDto = (VideoSaveAssistantAlbumResponseDto) obj;
                d dVar = this.c;
                return rsg0.D0(yfb.x(dVar.g.v(videoSaveAssistantAlbumResponseDto.d(), videoSaveAssistantAlbumResponseDto.q()))).h(new dfr0(new sxl0(dVar, 10), 3));
            default:
                this.c.j.b(i.a.a);
                return s3q0.a;
        }
    }
}
