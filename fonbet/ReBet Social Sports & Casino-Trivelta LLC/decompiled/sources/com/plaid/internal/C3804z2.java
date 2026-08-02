package com.plaid.internal;

import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventViewName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3804z2 {
    @NotNull
    public static LinkEventMetadata a(@NotNull String errorCode, @NotNull String errorMessage, @NotNull String errorType, @NotNull String exitStatus, @NotNull String institutionId, @NotNull String institutionName, @NotNull String institutionSearchQuery, @NotNull String issueId, @NotNull String linkSessionId, @NotNull String mfaType, @NotNull String requestId, @NotNull String timestamp, @NotNull String viewName, @NotNull String brandName, @NotNull String selection, @NotNull String metadataJson) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(exitStatus, "exitStatus");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(institutionSearchQuery, "institutionSearchQuery");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(mfaType, "mfaType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, null, null, issueId, linkSessionId, mfaType, requestId, selection, timestamp, LinkEventViewName.INSTANCE.fromString$link_sdk_release(viewName), metadataJson, null, null, null, null, 3932928, null);
    }
}
