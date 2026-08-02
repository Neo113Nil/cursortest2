package com.vk.sdk.api.audio.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.kr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xy6;
import xsna.zcl;

/* compiled from: AudioAudioDto.kt */
/* loaded from: classes5.dex */
public final class AudioAudioDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("artist")
    private final String artist;

    @pmi0("date")
    private final Integer date;

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("performer")
    private final String performer;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public AudioAudioDto(String str, int i, UserId userId, String str2, int i2, String str3, String str4, Integer num, Integer num2, String str5) {
        this.artist = str;
        this.id = i;
        this.ownerId = userId;
        this.title = str2;
        this.duration = i2;
        this.accessKey = str3;
        this.url = str4;
        this.date = num;
        this.albumId = num2;
        this.performer = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioDto)) {
            return false;
        }
        AudioAudioDto audioAudioDto = (AudioAudioDto) obj;
        return epx.f(this.artist, audioAudioDto.artist) && this.id == audioAudioDto.id && epx.f(this.ownerId, audioAudioDto.ownerId) && epx.f(this.title, audioAudioDto.title) && this.duration == audioAudioDto.duration && epx.f(this.accessKey, audioAudioDto.accessKey) && epx.f(this.url, audioAudioDto.url) && epx.f(this.date, audioAudioDto.date) && epx.f(this.albumId, audioAudioDto.albumId) && epx.f(this.performer, audioAudioDto.performer);
    }

    public final int hashCode() {
        int a = shy.a(this.duration, urd0.a(bh10.a(shy.a(this.id, this.artist.hashCode() * 31, 31), 31, this.ownerId.b), 31, this.title), 31);
        String str = this.accessKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.date;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.performer;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.artist;
        int i = this.id;
        UserId userId = this.ownerId;
        String str2 = this.title;
        int i2 = this.duration;
        String str3 = this.accessKey;
        String str4 = this.url;
        Integer num = this.date;
        Integer num2 = this.albumId;
        String str5 = this.performer;
        StringBuilder b = xy6.b(i, "AudioAudioDto(artist=", str, ", id=", ", ownerId=");
        b.append(userId);
        b.append(", title=");
        b.append(str2);
        b.append(", duration=");
        jax0.a(i2, ", accessKey=", str3, ", url=", b);
        kr.b(num, str4, ", date=", ", albumId=", b);
        b.append(num2);
        b.append(", performer=");
        b.append(str5);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ AudioAudioDto(String str, int i, UserId userId, String str2, int i2, String str3, String str4, Integer num, Integer num2, String str5, int i3, zcl zclVar) {
        this(str, i, userId, str2, i2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : str5);
    }
}
