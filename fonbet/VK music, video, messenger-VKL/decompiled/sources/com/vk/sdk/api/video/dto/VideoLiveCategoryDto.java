package com.vk.sdk.api.video.dto;

import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: VideoLiveCategoryDto.kt */
/* loaded from: classes5.dex */
public final class VideoLiveCategoryDto {

    @pmi0("id")
    private final int id;

    @pmi0("label")
    private final String label;

    @pmi0("sublist")
    private final List<VideoLiveCategoryDto> sublist;

    public VideoLiveCategoryDto(int i, String str, List<VideoLiveCategoryDto> list) {
        this.id = i;
        this.label = str;
        this.sublist = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveCategoryDto)) {
            return false;
        }
        VideoLiveCategoryDto videoLiveCategoryDto = (VideoLiveCategoryDto) obj;
        return this.id == videoLiveCategoryDto.id && epx.f(this.label, videoLiveCategoryDto.label) && epx.f(this.sublist, videoLiveCategoryDto.sublist);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.label);
        List<VideoLiveCategoryDto> list = this.sublist;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.label;
        return vp.b(")", kh10.a(i, "VideoLiveCategoryDto(id=", ", label=", str, ", sublist="), this.sublist);
    }

    public /* synthetic */ VideoLiveCategoryDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
