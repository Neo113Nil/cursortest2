package com.vk.push.core.utils;

import android.os.Binder;
import com.vk.push.core.domain.model.CallingAppIds;

/* compiled from: BinderExtensions.kt */
/* loaded from: classes5.dex */
public final class BinderExtensionsKt {
    public static final CallingAppIds getCallingIds(Binder binder) {
        return new CallingAppIds(Binder.getCallingUid(), Binder.getCallingPid());
    }
}
