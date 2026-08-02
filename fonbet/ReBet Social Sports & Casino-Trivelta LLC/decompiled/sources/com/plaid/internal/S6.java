package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSdkEventExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkEventExtensions.kt\ncom/plaid/internal/workflow/extensions/SdkEventExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: classes3.dex */
public final class S6 {
    @NotNull
    public static final LinkEvent a(@NotNull Common$SDKEvent common$SDKEvent) {
        LinkEventMetadata metadata;
        Intrinsics.checkNotNullParameter(common$SDKEvent, "<this>");
        if (common$SDKEvent.hasMetadata()) {
            String brandName = common$SDKEvent.getMetadata().getBrandName();
            String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            String errorType = common$SDKEvent.getMetadata().getErrorType();
            String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            String mfaType = common$SDKEvent.getMetadata().getMfaType();
            String requestId = common$SDKEvent.getMetadata().getRequestId();
            String selection = common$SDKEvent.getMetadata().getSelection();
            String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            String viewName = common$SDKEvent.getMetadata().getViewName();
            Intrinsics.checkNotNull(errorCode);
            Intrinsics.checkNotNull(errorMessage);
            Intrinsics.checkNotNull(errorType);
            Intrinsics.checkNotNull(exitStatus);
            Intrinsics.checkNotNull(institutionId);
            Intrinsics.checkNotNull(institutionName);
            Intrinsics.checkNotNull(institutionSearchQuery);
            Intrinsics.checkNotNull(linkSessionId);
            Intrinsics.checkNotNull(mfaType);
            Intrinsics.checkNotNull(requestId);
            Intrinsics.checkNotNull(timestamp);
            Intrinsics.checkNotNull(viewName);
            Intrinsics.checkNotNull(brandName);
            Intrinsics.checkNotNull(selection);
            metadata = C3804z2.a((r33 & 1) != 0 ? "" : errorCode, (r33 & 2) != 0 ? "" : errorMessage, (r33 & 4) != 0 ? "" : errorType, (r33 & 8) != 0 ? "" : exitStatus, (r33 & 16) != 0 ? "" : institutionId, (r33 & 32) != 0 ? "" : institutionName, (r33 & 64) != 0 ? "" : institutionSearchQuery, "", linkSessionId, (r33 & 512) != 0 ? "" : mfaType, (r33 & 1024) != 0 ? "" : requestId, timestamp, (r33 & 4096) != 0 ? "" : viewName, brandName, (r33 & 16384) != 0 ? "" : selection, "{}");
        } else {
            String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            Intrinsics.checkNotNullExpressionValue(brandName2, "getBrandName(...)");
            metadata = C3804z2.a((r33 & 1) != 0 ? "" : null, (r33 & 2) != 0 ? "" : null, (r33 & 4) != 0 ? "" : null, (r33 & 8) != 0 ? "" : null, (r33 & 16) != 0 ? "" : null, (r33 & 32) != 0 ? "" : null, (r33 & 64) != 0 ? "" : null, "", "", (r33 & 512) != 0 ? "" : null, (r33 & 1024) != 0 ? "" : null, "", (r33 & 4096) != 0 ? "" : null, brandName2, (r33 & 16384) != 0 ? "" : null, "{}");
        }
        String eventName = common$SDKEvent.getEventName();
        Intrinsics.checkNotNullExpressionValue(eventName, "getEventName(...)");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }

    @NotNull
    public static final LinkEvent a(@NotNull Channel$Message.SDKEvent sDKEvent) {
        Intrinsics.checkNotNullParameter(sDKEvent, "<this>");
        String brandName = sDKEvent.getMetadata().getBrandName();
        String errorCode = sDKEvent.getMetadata().getErrorCode();
        String errorMessage = sDKEvent.getMetadata().getErrorMessage();
        String errorType = sDKEvent.getMetadata().getErrorType();
        String exitStatus = sDKEvent.getMetadata().getExitStatus();
        String institutionId = sDKEvent.getMetadata().getInstitutionId();
        String institutionName = sDKEvent.getMetadata().getInstitutionName();
        String institutionSearchQuery = sDKEvent.getMetadata().getInstitutionSearchQuery();
        String issueId = sDKEvent.getMetadata().getIssueId();
        String linkSessionId = sDKEvent.getMetadata().getLinkSessionId();
        String mfaType = sDKEvent.getMetadata().getMfaType();
        String requestId = sDKEvent.getMetadata().getRequestId();
        String selection = sDKEvent.getMetadata().getSelection();
        String timestamp = sDKEvent.getMetadata().getTimestamp();
        String viewName = sDKEvent.getMetadata().getViewName();
        String metadataJson = sDKEvent.getMetadataJson();
        if (StringsKt.isBlank(metadataJson)) {
            metadataJson = "{}";
        }
        String str = metadataJson;
        Intrinsics.checkNotNull(errorCode);
        Intrinsics.checkNotNull(errorMessage);
        Intrinsics.checkNotNull(errorType);
        Intrinsics.checkNotNull(exitStatus);
        Intrinsics.checkNotNull(institutionId);
        Intrinsics.checkNotNull(institutionName);
        Intrinsics.checkNotNull(institutionSearchQuery);
        Intrinsics.checkNotNull(issueId);
        Intrinsics.checkNotNull(linkSessionId);
        Intrinsics.checkNotNull(mfaType);
        Intrinsics.checkNotNull(requestId);
        Intrinsics.checkNotNull(timestamp);
        Intrinsics.checkNotNull(viewName);
        Intrinsics.checkNotNull(brandName);
        Intrinsics.checkNotNull(selection);
        Intrinsics.checkNotNull(str);
        LinkEventMetadata metadata = C3804z2.a(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType, requestId, timestamp, viewName, brandName, selection, str);
        String eventName = sDKEvent.getEventName();
        Intrinsics.checkNotNullExpressionValue(eventName, "getEventName(...)");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }
}
