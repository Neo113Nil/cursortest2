package spay.sdk.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lspay/sdk/domain/model/AuthMethod;", "", "ByAuthToken", "ByMobileApp", "ByPhoneNumber", "ByRefreshToken", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AuthMethod {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ByAuthToken extends AuthMethod {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ByMobileApp extends AuthMethod {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/AuthMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ByPhoneNumber extends AuthMethod {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/AuthMethod;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ByRefreshToken extends AuthMethod {
    }
}
