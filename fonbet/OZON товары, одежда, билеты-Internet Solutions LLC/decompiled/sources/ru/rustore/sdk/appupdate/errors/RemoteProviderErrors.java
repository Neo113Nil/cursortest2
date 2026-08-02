package ru.rustore.sdk.appupdate.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wl0.C10568a;
import wl0.c;
import wl0.f;
import wl0.g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/rustore/sdk/appupdate/errors/RemoteProviderErrors;", "", "<init>", "()V", "", "errorCode", "", "message", "Lwl0/c;", "toRuStoreException", "(ILjava/lang/String;)Lwl0/c;", "ERROR_COMMON", "I", "USER_UNAUTHORIZED_ERROR", "USER_BLOCKED", "OWNER_BLOCKED", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteProviderErrors {
    private static final int ERROR_COMMON = 999;

    @NotNull
    public static final RemoteProviderErrors INSTANCE = new RemoteProviderErrors();
    private static final int OWNER_BLOCKED = 1005;
    private static final int USER_BLOCKED = 1004;
    private static final int USER_UNAUTHORIZED_ERROR = 1001;

    private RemoteProviderErrors() {
    }

    @NotNull
    public final c toRuStoreException(int errorCode, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return errorCode != 999 ? errorCode != 1001 ? errorCode != 1004 ? errorCode != 1005 ? new RuStoreInstallException(errorCode) : new C10568a() : new f() : new g() : new c(message);
    }
}
