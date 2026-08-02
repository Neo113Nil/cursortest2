package com.plaid.gson;

import com.google.gson.Gson;
import com.google.gson.d;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/plaid/gson/PlaidJsonConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "convert", "", "linkSuccess", "Lcom/plaid/link/result/LinkSuccess;", "linkExit", "Lcom/plaid/link/result/LinkExit;", "linkEvent", "Lcom/plaid/link/event/LinkEvent;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaidJsonConverter {

    /* renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt.lazy(new Function0() { // from class: gc.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Gson gson_delegate$lambda$1;
            gson_delegate$lambda$1 = PlaidJsonConverter.gson_delegate$lambda$1();
            return gson_delegate$lambda$1;
        }
    });

    private final Gson getGson() {
        Object value = this.gson.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Gson) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        d dVar = new d();
        dVar.f(LinkAccount.class, new RNAccountAdapter());
        dVar.f(LinkInstitution.class, new RNLinkInstitutionAdapter());
        dVar.f(LinkAccountType.class, new AccountTypeAdapter());
        dVar.f(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        dVar.f(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        dVar.f(LinkEventViewName.class, new LinkEventViewNameAdapter());
        dVar.f(LinkEventName.class, new LinkEventNameAdapter());
        dVar.f(LinkEventMetadata.class, new RNEventMetadataAdapter());
        dVar.f(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        dVar.f(LinkErrorType.class, new PlaidErrorTypeAdapter());
        dVar.f(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        return dVar.b();
    }

    @NotNull
    public final String convert(@NotNull LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        String v10 = getGson().v(linkSuccess);
        Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
        return v10;
    }

    @NotNull
    public final String convert(@NotNull LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        String v10 = getGson().v(linkExit);
        Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
        return v10;
    }

    @NotNull
    public final String convert(@NotNull LinkEvent linkEvent) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        String v10 = getGson().v(linkEvent);
        Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
        return StringsKt.replace$default(v10, "event_name", "event", false, 4, (Object) null);
    }
}
