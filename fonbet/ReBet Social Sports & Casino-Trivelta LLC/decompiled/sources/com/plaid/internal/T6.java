package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSdkResultExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkResultExtensions.kt\ncom/plaid/internal/workflow/extensions/SdkResultExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1855#2,2:47\n*S KotlinDebug\n*F\n+ 1 SdkResultExtensions.kt\ncom/plaid/internal/workflow/extensions/SdkResultExtensionsKt\n*L\n17#1:47,2\n*E\n"})
/* loaded from: classes3.dex */
public final class T6 {
    @Nullable
    public static final LinkResult a(@NotNull Channel$Message.SDKResult sDKResult) {
        Intrinsics.checkNotNullParameter(sDKResult, "<this>");
        LinkInstitution linkInstitution = null;
        if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS) {
            if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR) {
                return null;
            }
            String linkSessionId = sDKResult.getMetadata().getLinkSessionId();
            String institutionId = sDKResult.getMetadata().getInstitution().getInstitutionId();
            String name = sDKResult.getMetadata().getInstitution().getName();
            String requestId = sDKResult.getMetadata().getRequestId();
            LinkExitMetadataStatus fromString = LinkExitMetadataStatus.INSTANCE.fromString(sDKResult.getMetadata().getStatus());
            String metadataJson = sDKResult.getMetadataJson();
            if (name != null && name.length() != 0 && institutionId != null && institutionId.length() != 0) {
                linkInstitution = new LinkInstitution(name, institutionId);
            }
            LinkExitMetadata linkExitMetadata = new LinkExitMetadata(fromString, linkInstitution, linkSessionId, requestId, metadataJson);
            String errorCode = sDKResult.getError().getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            String errorMessage = sDKResult.getError().getErrorMessage();
            Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
            String displayMessage = sDKResult.getError().getDisplayMessage();
            Intrinsics.checkNotNullExpressionValue(displayMessage, "getDisplayMessage(...)");
            String errorJson = sDKResult.getErrorJson();
            Intrinsics.checkNotNullExpressionValue(errorJson, "getErrorJson(...)");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
            Intrinsics.checkNotNullParameter(errorJson, "errorJson");
            return new LinkExit(new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson), linkExitMetadata);
        }
        ArrayList accounts = new ArrayList();
        List<SdkResult$SDKResult.Metadata.Account> accountsList = sDKResult.getMetadata().getAccountsList();
        Intrinsics.checkNotNullExpressionValue(accountsList, "getAccountsList(...)");
        for (SdkResult$SDKResult.Metadata.Account account : accountsList) {
            Intrinsics.checkNotNull(account);
            Intrinsics.checkNotNullParameter(account, "<this>");
            String id2 = account.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            accounts.add(new LinkAccount(id2, account.getName(), account.getMask(), LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType()), LinkAccountVerificationStatus.INSTANCE.convert(account.getVerificationStatus()), null, 32, null));
        }
        String institutionId2 = sDKResult.getMetadata().getInstitution().getInstitutionId();
        String name2 = sDKResult.getMetadata().getInstitution().getName();
        String linkSessionId2 = sDKResult.getMetadata().getLinkSessionId();
        Intrinsics.checkNotNullExpressionValue(linkSessionId2, "getLinkSessionId(...)");
        String metadataJson2 = sDKResult.getMetadataJson();
        Intrinsics.checkNotNullExpressionValue(metadataJson2, "getMetadataJson(...)");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(linkSessionId2, "linkSessionId");
        Intrinsics.checkNotNullParameter(metadataJson2, "metadataJson");
        if (institutionId2 != null && institutionId2.length() != 0 && name2 != null && name2.length() != 0) {
            linkInstitution = new LinkInstitution(institutionId2, name2);
        }
        LinkSuccessMetadata metadata = new LinkSuccessMetadata(linkInstitution, accounts, linkSessionId2, metadataJson2);
        String publicToken = sDKResult.getPublicToken();
        Intrinsics.checkNotNullExpressionValue(publicToken, "getPublicToken(...)");
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }
}
