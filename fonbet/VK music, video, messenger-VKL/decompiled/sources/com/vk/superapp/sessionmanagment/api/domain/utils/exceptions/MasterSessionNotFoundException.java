package com.vk.superapp.sessionmanagment.api.domain.utils.exceptions;

import com.vk.dto.common.id.UserId;

/* compiled from: MasterSessionNotFoundException.kt */
/* loaded from: classes6.dex */
public final class MasterSessionNotFoundException extends IllegalStateException {
    public MasterSessionNotFoundException(UserId userId) {
        super("Master session with UserId " + userId + " not found");
    }
}
