package com.orkestapay.orkestapay.core.networking;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "", "merchantId", "", "publicKey", "environment", "Lcom/orkestapay/orkestapay/core/networking/Environment;", "(Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/core/networking/Environment;)V", "getEnvironment", "()Lcom/orkestapay/orkestapay/core/networking/Environment;", "getMerchantId", "()Ljava/lang/String;", "getPublicKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoreConfig {

    @NotNull
    private final Environment environment;

    @NotNull
    private final String merchantId;

    @NotNull
    private final String publicKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoreConfig(@NotNull String merchantId, @NotNull String publicKey) {
        this(merchantId, publicKey, null, 4, null);
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
    }

    public static /* synthetic */ CoreConfig copy$default(CoreConfig coreConfig, String str, String str2, Environment environment, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = coreConfig.merchantId;
        }
        if ((i10 & 2) != 0) {
            str2 = coreConfig.publicKey;
        }
        if ((i10 & 4) != 0) {
            environment = coreConfig.environment;
        }
        return coreConfig.copy(str, str2, environment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final CoreConfig copy(@NotNull String merchantId, @NotNull String publicKey, @NotNull Environment environment) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new CoreConfig(merchantId, publicKey, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreConfig)) {
            return false;
        }
        CoreConfig coreConfig = (CoreConfig) other;
        return Intrinsics.areEqual(this.merchantId, coreConfig.merchantId) && Intrinsics.areEqual(this.publicKey, coreConfig.publicKey) && this.environment == coreConfig.environment;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((this.merchantId.hashCode() * 31) + this.publicKey.hashCode()) * 31) + this.environment.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoreConfig(merchantId=" + this.merchantId + ", publicKey=" + this.publicKey + ", environment=" + this.environment + ')';
    }

    @JvmOverloads
    public CoreConfig(@NotNull String merchantId, @NotNull String publicKey, @NotNull Environment environment) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.merchantId = merchantId;
        this.publicKey = publicKey;
        this.environment = environment;
    }

    public /* synthetic */ CoreConfig(String str, String str2, Environment environment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? Environment.SANDBOX : environment);
    }
}
