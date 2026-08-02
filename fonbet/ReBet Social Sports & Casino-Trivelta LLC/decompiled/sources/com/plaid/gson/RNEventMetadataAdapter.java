package com.plaid.gson;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventViewName;
import com.twilio.voice.EventKeys;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/gson/RNEventMetadataAdapter;", "Lcom/google/gson/p;", "Lcom/plaid/link/event/LinkEventMetadata;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/o;", "context", "Lcom/google/gson/h;", "serialize", "(Lcom/plaid/link/event/LinkEventMetadata;Ljava/lang/reflect/Type;Lcom/google/gson/o;)Lcom/google/gson/h;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNEventMetadataAdapter implements p {
    @Override // com.google.gson.p
    @NotNull
    public h serialize(@Nullable LinkEventMetadata src, @Nullable Type typeOfSrc, @Nullable o context) {
        String str;
        if (src == null) {
            return new k();
        }
        k kVar = new k();
        kVar.p("errorType", src.getErrorType());
        kVar.p("errorCode", src.getErrorCode());
        kVar.p("errorMessage", src.getErrorMessage());
        kVar.p("exitStatus", src.getExitStatus());
        kVar.p("institutionId", src.getInstitutionId());
        kVar.p("institutionName", src.getInstitutionName());
        kVar.p("institutionSearchQuery", src.getInstitutionSearchQuery());
        kVar.p("accountNumberMask", src.getAccountNumberMask());
        kVar.p("isUpdateMode", src.isUpdateMode());
        kVar.p("matchReason", src.getMatchReason());
        kVar.p("routingNumber", src.getRoutingNumber());
        kVar.p("selection", src.getSelection());
        kVar.p("linkSessionId", src.getLinkSessionId());
        kVar.p("mfaType", src.getMfaType());
        kVar.p("requestId", src.getRequestId());
        kVar.p("issueId", src.getIssueId());
        kVar.p("issueDescription", src.getIssueDescription());
        kVar.p("issueDetectedAt", src.getIssueDetectedAt());
        kVar.p(EventKeys.TIMESTAMP, src.getTimestamp());
        LinkEventViewName viewName = src.getViewName();
        if (viewName == null || (str = viewName.getJsonValue()) == null) {
            str = "";
        }
        kVar.p("viewName", str);
        kVar.p("metadata_json", src.getMetadataJson());
        kVar.p("metadataJson", src.getMetadataJson());
        return kVar;
    }
}
