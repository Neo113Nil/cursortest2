package spay.sdk.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lspay/sdk/domain/model/BnplMethod;", "", "FourPartPayment", "NoPartPayment", "SixPartPayment", "Lspay/sdk/domain/model/BnplMethod$FourPartPayment;", "Lspay/sdk/domain/model/BnplMethod$NoPartPayment;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface BnplMethod {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/BnplMethod$FourPartPayment;", "Lspay/sdk/domain/model/BnplMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FourPartPayment extends BnplMethod {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/BnplMethod$NoPartPayment;", "Lspay/sdk/domain/model/BnplMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface NoPartPayment extends BnplMethod {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "Lspay/sdk/domain/model/BnplMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SixPartPayment extends BnplMethod {
    }
}
