package com.vk.sdk.api.docs.dto;

import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DocsDocPreviewAudioMsgDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewAudioMsgDto {

    @pmi0("duration")
    private final int duration;

    @pmi0("link_mp3")
    private final String linkMp3;

    @pmi0("link_ogg")
    private final String linkOgg;

    @pmi0("waveform")
    private final List<Integer> waveform;

    public DocsDocPreviewAudioMsgDto(int i, String str, String str2, List<Integer> list) {
        this.duration = i;
        this.linkMp3 = str;
        this.linkOgg = str2;
        this.waveform = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewAudioMsgDto)) {
            return false;
        }
        DocsDocPreviewAudioMsgDto docsDocPreviewAudioMsgDto = (DocsDocPreviewAudioMsgDto) obj;
        return this.duration == docsDocPreviewAudioMsgDto.duration && epx.f(this.linkMp3, docsDocPreviewAudioMsgDto.linkMp3) && epx.f(this.linkOgg, docsDocPreviewAudioMsgDto.linkOgg) && epx.f(this.waveform, docsDocPreviewAudioMsgDto.waveform);
    }

    public final int hashCode() {
        return this.waveform.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.duration) * 31, 31, this.linkMp3), 31, this.linkOgg);
    }

    public final String toString() {
        int i = this.duration;
        String str = this.linkMp3;
        String str2 = this.linkOgg;
        List<Integer> list = this.waveform;
        StringBuilder a = kh10.a(i, "DocsDocPreviewAudioMsgDto(duration=", ", linkMp3=", str, ", linkOgg=");
        a.append(str2);
        a.append(", waveform=");
        a.append(list);
        a.append(")");
        return a.toString();
    }
}
