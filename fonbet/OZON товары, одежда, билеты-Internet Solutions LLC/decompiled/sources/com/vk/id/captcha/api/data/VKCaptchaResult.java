package com.vk.id.captcha.api.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "", "<init>", "()V", "Error", "Success", "Lcom/vk/id/captcha/api/data/VKCaptchaResult$Error;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult$Success;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class VKCaptchaResult {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaResult$Error;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "error", "", "domain", "<init>", "(Lcom/vk/id/captcha/api/data/VKCaptchaError;Ljava/lang/String;)V", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "getError", "()Lcom/vk/id/captcha/api/data/VKCaptchaError;", "Ljava/lang/String;", "getDomain", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends VKCaptchaResult {
        private final String domain;

        @NotNull
        private final VKCaptchaError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull VKCaptchaError vKCaptchaError, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(vKCaptchaError, "");
            this.error = vKCaptchaError;
            this.domain = str;
        }

        @NotNull
        public final VKCaptchaError getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaResult$Success;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "", "token", "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getDomain"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends VKCaptchaResult {
        private final String domain;

        @NotNull
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.token = str;
            this.domain = str2;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }
    }

    private VKCaptchaResult() {
    }

    public /* synthetic */ VKCaptchaResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
