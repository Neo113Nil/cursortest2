package com.vk.id.captcha.api.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "Cancelled", "NetworkError", "WebviewIsUpdatingError", "Lcom/vk/id/captcha/api/data/VKCaptchaError$Cancelled;", "Lcom/vk/id/captcha/api/data/VKCaptchaError$NetworkError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError$WebviewIsUpdatingError;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class VKCaptchaError {
    private final Throwable error;

    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$Cancelled;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancelled extends VKCaptchaError {
        /* JADX WARN: Multi-variable type inference failed */
        public Cancelled() {
            super("You've cancelled the captcha flow", null, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$NetworkError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkError extends VKCaptchaError {
        public /* synthetic */ NetworkError(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull String str, Throwable th2) {
            super(str, th2, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/api/data/VKCaptchaError$WebviewIsUpdatingError;", "Lcom/vk/id/captcha/api/data/VKCaptchaError;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebviewIsUpdatingError extends VKCaptchaError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebviewIsUpdatingError(@NotNull String str, Throwable th2) {
            super(str, th2, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public /* synthetic */ VKCaptchaError(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    private VKCaptchaError(String str, Throwable th2) {
        this.message = str;
        this.error = th2;
    }
}
