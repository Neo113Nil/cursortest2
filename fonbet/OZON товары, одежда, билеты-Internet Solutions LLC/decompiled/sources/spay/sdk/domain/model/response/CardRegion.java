package spay.sdk.domain.model.response;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lspay/sdk/domain/model/response/CardRegion;", "", "dtoValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDtoValue", "()Ljava/lang/String;", "LOCAL", FraudMonInfo.UNKNOWN, "DOMESTIC", "INTERNATIONAL", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CardRegion {
    LOCAL("LOCAL"),
    UNKNOWN("UNKNOWN_CARD_REGION"),
    DOMESTIC("DOMESTIC"),
    INTERNATIONAL("INTERNATIONAL");


    @NotNull
    private final String dtoValue;

    CardRegion(String str) {
        this.dtoValue = str;
    }

    @NotNull
    public final String getDtoValue() {
        return this.dtoValue;
    }
}
