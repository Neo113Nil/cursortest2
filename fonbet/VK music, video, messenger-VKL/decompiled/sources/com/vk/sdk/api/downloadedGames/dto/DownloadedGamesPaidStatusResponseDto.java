package com.vk.sdk.api.downloadedGames.dto;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import xsna.pmi0;

/* compiled from: DownloadedGamesPaidStatusResponseDto.kt */
/* loaded from: classes5.dex */
public final class DownloadedGamesPaidStatusResponseDto {

    @pmi0("is_paid")
    private final boolean isPaid;

    public DownloadedGamesPaidStatusResponseDto(boolean z) {
        this.isPaid = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadedGamesPaidStatusResponseDto) && this.isPaid == ((DownloadedGamesPaidStatusResponseDto) obj).isPaid;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPaid);
    }

    public final String toString() {
        return c.a("DownloadedGamesPaidStatusResponseDto(isPaid=", ")", this.isPaid);
    }
}
