package com.vk.sdk.api.audio.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.tq;
import xsna.zcl;

/* compiled from: AudioPlaylistPermissionsDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistPermissionsDto {

    @pmi0("boom_download")
    private final Boolean boomDownload;

    @pmi0("delete")
    private final Boolean delete;

    @pmi0("edit")
    private final Boolean edit;

    @pmi0("follow")
    private final Boolean follow;

    @pmi0("play")
    private final Boolean play;

    @pmi0("share")
    private final Boolean share;

    public AudioPlaylistPermissionsDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistPermissionsDto)) {
            return false;
        }
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = (AudioPlaylistPermissionsDto) obj;
        return epx.f(this.play, audioPlaylistPermissionsDto.play) && epx.f(this.share, audioPlaylistPermissionsDto.share) && epx.f(this.edit, audioPlaylistPermissionsDto.edit) && epx.f(this.follow, audioPlaylistPermissionsDto.follow) && epx.f(this.delete, audioPlaylistPermissionsDto.delete) && epx.f(this.boomDownload, audioPlaylistPermissionsDto.boomDownload);
    }

    public final int hashCode() {
        Boolean bool = this.play;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.share;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.edit;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.follow;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.delete;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.boomDownload;
        return hashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.play;
        Boolean bool2 = this.share;
        Boolean bool3 = this.edit;
        Boolean bool4 = this.follow;
        Boolean bool5 = this.delete;
        Boolean bool6 = this.boomDownload;
        StringBuilder sb = new StringBuilder("AudioPlaylistPermissionsDto(play=");
        sb.append(bool);
        sb.append(", share=");
        sb.append(bool2);
        sb.append(", edit=");
        tq.i(sb, bool3, ", follow=", bool4, ", delete=");
        sb.append(bool5);
        sb.append(", boomDownload=");
        sb.append(bool6);
        sb.append(")");
        return sb.toString();
    }

    public AudioPlaylistPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.play = bool;
        this.share = bool2;
        this.edit = bool3;
        this.follow = bool4;
        this.delete = bool5;
        this.boomDownload = bool6;
    }

    public /* synthetic */ AudioPlaylistPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6);
    }
}
