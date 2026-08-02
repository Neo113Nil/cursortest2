package com.plaid.internal;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.C3556a6;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class L2 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static LinkExit b(@Nullable Throwable th2, @Nullable String str) {
        return new LinkExit(a(th2, str), null, 2, 0 == true ? 1 : 0);
    }

    public static String a(String str, String str2, String str3) {
        return "{\"error_code\":\"" + str + "\",\"error_message\":\"" + str2 + "\",\"display_message\":\"" + str3 + "\"}";
    }

    @NotNull
    public static LinkError a(@Nullable Throwable th2, @Nullable String str) {
        if (th2 instanceof B2) {
            C3556a6.a.a(C3556a6.f39823a, th2);
            String str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists";
            if (str != null && str.length() != 0) {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists" + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str;
            }
            return LinkError.INSTANCE.fromException$link_sdk_release(new LinkException(str2));
        }
        return LinkError.INSTANCE.fromException$link_sdk_release(th2);
    }

    public static LinkExitMetadata a(int i10, String str) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return new LinkExitMetadata(null, null, null, str, null);
    }

    @NotNull
    public static LinkSuccess a(@NotNull String publicToken, @NotNull LinkSuccessMetadata metadata) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    @NotNull
    public static LinkSuccess a(@NotNull LinkedHashMap linkData, @NotNull List accounts) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        return LinkSuccess.INSTANCE.fromMap$link_sdk_release(linkData, accounts);
    }

    @NotNull
    public static LinkSuccessMetadata a(@NotNull ArrayList accounts, @Nullable String str, @Nullable String str2, @NotNull String linkSessionId, @NotNull String metadataJson) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        return new LinkSuccessMetadata((str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(str, str2), accounts, linkSessionId, metadataJson);
    }

    @NotNull
    public static LinkAccount a(@NotNull D1 account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return LinkAccount.INSTANCE.fromResponse$link_sdk_release(account);
    }

    @NotNull
    public static String a(@NotNull String linkSessionId, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return "{\"link_session_id\":\"" + linkSessionId + "\",\"request_id\":\"" + requestId + "\"}";
    }
}
