package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesAudioMessageDto.kt */
/* loaded from: classes5.dex */
public final class MessagesAudioMessageDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("link_mp3")
    private final String linkMp3;

    @pmi0("link_ogg")
    private final String linkOgg;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("transcript_error")
    private final Integer transcriptError;

    @pmi0("waveform")
    private final List<Integer> waveform;

    public MessagesAudioMessageDto(int i, int i2, String str, String str2, UserId userId, List<Integer> list, String str3, Integer num) {
        this.duration = i;
        this.id = i2;
        this.linkMp3 = str;
        this.linkOgg = str2;
        this.ownerId = userId;
        this.waveform = list;
        this.accessKey = str3;
        this.transcriptError = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAudioMessageDto)) {
            return false;
        }
        MessagesAudioMessageDto messagesAudioMessageDto = (MessagesAudioMessageDto) obj;
        return this.duration == messagesAudioMessageDto.duration && this.id == messagesAudioMessageDto.id && epx.f(this.linkMp3, messagesAudioMessageDto.linkMp3) && epx.f(this.linkOgg, messagesAudioMessageDto.linkOgg) && epx.f(this.ownerId, messagesAudioMessageDto.ownerId) && epx.f(this.waveform, messagesAudioMessageDto.waveform) && epx.f(this.accessKey, messagesAudioMessageDto.accessKey) && epx.f(this.transcriptError, messagesAudioMessageDto.transcriptError);
    }

    public final int hashCode() {
        int a = fw3.a(bh10.a(urd0.a(urd0.a(shy.a(this.id, Integer.hashCode(this.duration) * 31, 31), 31, this.linkMp3), 31, this.linkOgg), 31, this.ownerId.b), 31, this.waveform);
        String str = this.accessKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.transcriptError;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = this.duration;
        int i2 = this.id;
        String str = this.linkMp3;
        String str2 = this.linkOgg;
        UserId userId = this.ownerId;
        List<Integer> list = this.waveform;
        String str3 = this.accessKey;
        Integer num = this.transcriptError;
        StringBuilder a = odj.a(i, i2, "MessagesAudioMessageDto(duration=", ", id=", ", linkMp3=");
        n6j.b(a, str, ", linkOgg=", str2, ", ownerId=");
        a.append(userId);
        a.append(", waveform=");
        a.append(list);
        a.append(", accessKey=");
        a.append(str3);
        a.append(", transcriptError=");
        a.append(num);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ MessagesAudioMessageDto(int i, int i2, String str, String str2, UserId userId, List list, String str3, Integer num, int i3, zcl zclVar) {
        this(i, i2, str, str2, userId, list, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : num);
    }
}
