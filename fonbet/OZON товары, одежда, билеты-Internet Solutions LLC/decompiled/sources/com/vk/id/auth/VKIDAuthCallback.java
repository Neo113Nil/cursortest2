package com.vk.id.auth;

import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/vk/id/auth/VKIDAuthCallback;", "", "onAuth", "", "accessToken", "Lcom/vk/id/AccessToken;", "onAuthCode", "data", "Lcom/vk/id/auth/AuthCodeData;", "isCompletion", "", "onFail", "fail", "Lcom/vk/id/VKIDAuthFail;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface VKIDAuthCallback {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAuthCode(@NotNull VKIDAuthCallback vKIDAuthCallback, @NotNull AuthCodeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    void onAuth(@NotNull AccessToken accessToken);

    void onAuthCode(@NotNull AuthCodeData data, boolean isCompletion);

    void onFail(@NotNull VKIDAuthFail fail);
}
