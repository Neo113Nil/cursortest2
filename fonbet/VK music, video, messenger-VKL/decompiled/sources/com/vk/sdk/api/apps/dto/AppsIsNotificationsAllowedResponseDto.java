package com.vk.sdk.api.apps.dto;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import xsna.pmi0;

/* compiled from: AppsIsNotificationsAllowedResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsIsNotificationsAllowedResponseDto {

    @pmi0("is_allowed")
    private final boolean isAllowed;

    public AppsIsNotificationsAllowedResponseDto(boolean z) {
        this.isAllowed = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsIsNotificationsAllowedResponseDto) && this.isAllowed == ((AppsIsNotificationsAllowedResponseDto) obj).isAllowed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAllowed);
    }

    public final String toString() {
        return c.a("AppsIsNotificationsAllowedResponseDto(isAllowed=", ")", this.isAllowed);
    }
}
