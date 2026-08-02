package com.vk.id.internal.auth;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.vk.id.auth.VKIDAuthCallback;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0010R4\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "", "<init>", "()V", "authCallbacks", "", "Lcom/vk/id/auth/VKIDAuthCallback;", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", ProductAction.ACTION_ADD, "", "callback", "getAll", "clear", "isEmpty", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthCallbacksHolder {
    private Set<VKIDAuthCallback> authCallbacks = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void add(@NotNull VKIDAuthCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.authCallbacks.add(callback);
    }

    public final void clear() {
        this.authCallbacks.clear();
    }

    @NotNull
    public final Set<VKIDAuthCallback> getAll() {
        Set<VKIDAuthCallback> authCallbacks = this.authCallbacks;
        Intrinsics.checkNotNullExpressionValue(authCallbacks, "authCallbacks");
        return authCallbacks;
    }

    public final boolean isEmpty() {
        return this.authCallbacks.isEmpty();
    }
}
