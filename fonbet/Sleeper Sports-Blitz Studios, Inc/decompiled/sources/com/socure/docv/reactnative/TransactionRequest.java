package com.socure.docv.reactnative;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/reactnative/TransactionRequest;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/reactnative/TransactionRequest$TransactionConfig;", "previousReferenceId", "", "<init>", "(Lcom/socure/docv/reactnative/TransactionRequest$TransactionConfig;Ljava/lang/String;)V", "getConfig", "()Lcom/socure/docv/reactnative/TransactionRequest$TransactionConfig;", "getPreviousReferenceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "TransactionConfig", "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransactionRequest {
    private final TransactionConfig config;
    private final String previousReferenceId;

    public static /* synthetic */ TransactionRequest copy$default(TransactionRequest transactionRequest, TransactionConfig transactionConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionConfig = transactionRequest.config;
        }
        if ((i & 2) != 0) {
            str = transactionRequest.previousReferenceId;
        }
        return transactionRequest.copy(transactionConfig, str);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionConfig getConfig() {
        return this.config;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreviousReferenceId() {
        return this.previousReferenceId;
    }

    public final TransactionRequest copy(TransactionConfig config, String previousReferenceId) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new TransactionRequest(config, previousReferenceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionRequest)) {
            return false;
        }
        TransactionRequest transactionRequest = (TransactionRequest) other;
        return Intrinsics.areEqual(this.config, transactionRequest.config) && Intrinsics.areEqual(this.previousReferenceId, transactionRequest.previousReferenceId);
    }

    public int hashCode() {
        int hashCode = this.config.hashCode() * 31;
        String str = this.previousReferenceId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TransactionRequest(config=" + this.config + ", previousReferenceId=" + this.previousReferenceId + ")";
    }

    public TransactionRequest(TransactionConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.previousReferenceId = str;
    }

    public /* synthetic */ TransactionRequest(TransactionConfig transactionConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transactionConfig, (i & 2) != 0 ? null : str);
    }

    public final TransactionConfig getConfig() {
        return this.config;
    }

    public final String getPreviousReferenceId() {
        return this.previousReferenceId;
    }

    /* compiled from: Api.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/reactnative/TransactionRequest$TransactionConfig;", "", "useCaseKey", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUseCaseKey", "()Ljava/lang/String;", "getLanguage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransactionConfig {
        private final String language;
        private final String useCaseKey;

        public static /* synthetic */ TransactionConfig copy$default(TransactionConfig transactionConfig, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionConfig.useCaseKey;
            }
            if ((i & 2) != 0) {
                str2 = transactionConfig.language;
            }
            return transactionConfig.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUseCaseKey() {
            return this.useCaseKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public final TransactionConfig copy(String useCaseKey, String language) {
            Intrinsics.checkNotNullParameter(useCaseKey, "useCaseKey");
            Intrinsics.checkNotNullParameter(language, "language");
            return new TransactionConfig(useCaseKey, language);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionConfig)) {
                return false;
            }
            TransactionConfig transactionConfig = (TransactionConfig) other;
            return Intrinsics.areEqual(this.useCaseKey, transactionConfig.useCaseKey) && Intrinsics.areEqual(this.language, transactionConfig.language);
        }

        public int hashCode() {
            return (this.useCaseKey.hashCode() * 31) + this.language.hashCode();
        }

        public String toString() {
            return "TransactionConfig(useCaseKey=" + this.useCaseKey + ", language=" + this.language + ")";
        }

        public TransactionConfig(String useCaseKey, String language) {
            Intrinsics.checkNotNullParameter(useCaseKey, "useCaseKey");
            Intrinsics.checkNotNullParameter(language, "language");
            this.useCaseKey = useCaseKey;
            this.language = language;
        }

        public final String getUseCaseKey() {
            return this.useCaseKey;
        }

        public /* synthetic */ TransactionConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "en" : str2);
        }

        public final String getLanguage() {
            return this.language;
        }
    }
}
