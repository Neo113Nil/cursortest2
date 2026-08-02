package spay.sdk.domain.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lspay/sdk/domain/model/response/BindingPaymentFeatures;", "", "dtoValue", "", "needConfirmation", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getDtoValue", "()Ljava/lang/String;", "getNeedConfirmation", "()Z", "FORCE_SSL", "AUTO_PAYMENT", "FORCE_TDS", "FORCE_FULL_TDS", "VERIFY", FraudMonInfo.UNKNOWN, "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum BindingPaymentFeatures {
    FORCE_SSL("FORCE_SSL", false),
    AUTO_PAYMENT("AUTO_PAYMENT", false),
    FORCE_TDS(" FORCE_TDS", false, 2, null),
    FORCE_FULL_TDS("FORCE_FULL_TDS", false, 2, null),
    VERIFY("VERIFY", false, 2, null),
    UNKNOWN("", false, 2, null);


    @NotNull
    private final String dtoValue;
    private final boolean needConfirmation;

    BindingPaymentFeatures(String str, boolean z11) {
        this.dtoValue = str;
        this.needConfirmation = z11;
    }

    @NotNull
    public final String getDtoValue() {
        return this.dtoValue;
    }

    public final boolean getNeedConfirmation() {
        return this.needConfirmation;
    }

    /* synthetic */ BindingPaymentFeatures(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}
