package com.orkestapay.orkestapay.core.googlepay;

import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayConstants;", "", "()V", "PAYMENT_GATEWAY_TOKENIZATION_NAME", "", "PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS", "", "getPAYMENT_GATEWAY_TOKENIZATION_PARAMETERS", "()Ljava/util/Map;", "SUPPORTED_METHODS", "", "getSUPPORTED_METHODS", "()Ljava/util/List;", "SUPPORTED_NETWORKS", "getSUPPORTED_NETWORKS", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayConstants {

    @NotNull
    public static final GooglePayConstants INSTANCE = new GooglePayConstants();

    @NotNull
    private static final List<String> SUPPORTED_NETWORKS = CollectionsKt.listOf((Object[]) new String[]{"AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA"});

    @NotNull
    private static final List<String> SUPPORTED_METHODS = CollectionsKt.listOf((Object[]) new String[]{"PAN_ONLY", "CRYPTOGRAM_3DS"});

    @NotNull
    private static final String PAYMENT_GATEWAY_TOKENIZATION_NAME = "orkestapay";

    @NotNull
    private static final Map<String, String> PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS = MapsKt.mapOf(TuplesKt.to(EventKeys.GATEWAY, PAYMENT_GATEWAY_TOKENIZATION_NAME), TuplesKt.to("gatewayMerchantId", "mch_5ded0b1bc6cf4abca17fdb6a37e30853"));

    private GooglePayConstants() {
    }

    @NotNull
    public final Map<String, String> getPAYMENT_GATEWAY_TOKENIZATION_PARAMETERS() {
        return PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS;
    }

    @NotNull
    public final List<String> getSUPPORTED_METHODS() {
        return SUPPORTED_METHODS;
    }

    @NotNull
    public final List<String> getSUPPORTED_NETWORKS() {
        return SUPPORTED_NETWORKS;
    }
}
