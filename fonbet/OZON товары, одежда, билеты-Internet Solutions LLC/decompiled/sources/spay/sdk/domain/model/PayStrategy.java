package spay.sdk.domain.model;

import B0.A0;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.AuthMethod;
import spay.sdk.domain.model.BnplMethod;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lspay/sdk/domain/model/PayStrategy;", "", "toolType", "Lspay/sdk/api/SPaymentTool;", "(Lspay/sdk/api/SPaymentTool;)V", "getToolType", "()Lspay/sdk/api/SPaymentTool;", "BasePay", "PartsStartPay", "PayOnline", "PayWithBinding", "PayWithBonuses", "PayWithPartsOnly", "PayWithPhoneNumber", "Lspay/sdk/domain/model/PayStrategy$BasePay;", "Lspay/sdk/domain/model/PayStrategy$PartsStartPay;", "Lspay/sdk/domain/model/PayStrategy$PayOnline;", "Lspay/sdk/domain/model/PayStrategy$PayWithBinding;", "Lspay/sdk/domain/model/PayStrategy$PayWithBonuses;", "Lspay/sdk/domain/model/PayStrategy$PayWithPartsOnly;", "Lspay/sdk/domain/model/PayStrategy$PayWithPhoneNumber;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PayStrategy {

    @NotNull
    private final SPaymentTool toolType;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$BasePay;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/DeprecatedPaymentMethod;", "Lspay/sdk/domain/model/BnplMethod$FourPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BasePay extends PayStrategy implements AuthMethod.ByMobileApp, AuthMethod.ByRefreshToken, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, DeprecatedPaymentMethod, BnplMethod.FourPartPayment {

        @NotNull
        public static final BasePay INSTANCE = new BasePay();

        /* JADX WARN: Multi-variable type inference failed */
        private BasePay() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PartsStartPay;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PartsStartPay extends PayStrategy implements AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {

        @NotNull
        public static final PartsStartPay INSTANCE = new PartsStartPay();

        /* JADX WARN: Multi-variable type inference failed */
        private PartsStartPay() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0011\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayOnline;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class PayOnline extends PayStrategy implements AuthMethod.ByMobileApp, AuthMethod.ByRefreshToken, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {
        private final String bindingId;

        /* JADX WARN: Multi-variable type inference failed */
        public PayOnline() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PayOnline copy$default(PayOnline payOnline, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payOnline.bindingId;
            }
            return payOnline.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        @NotNull
        public final PayOnline copy(String bindingId) {
            return new PayOnline(bindingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayOnline) && Intrinsics.d(this.bindingId, ((PayOnline) other).bindingId);
        }

        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            String str = this.bindingId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("PayOnline(bindingId=", this.bindingId, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PayOnline(String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.bindingId = str;
        }

        public /* synthetic */ PayOnline(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithBinding;", "Lspay/sdk/domain/model/PayStrategy;", "bindingId", "", "version", "Lspay/sdk/domain/model/PayStrategy$PayWithBinding$FeatureVersion;", "wasFraudMonReview", "", "(Ljava/lang/String;Lspay/sdk/domain/model/PayStrategy$PayWithBinding$FeatureVersion;Z)V", "getBindingId", "()Ljava/lang/String;", "getVersion", "()Lspay/sdk/domain/model/PayStrategy$PayWithBinding$FeatureVersion;", "getWasFraudMonReview", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "FeatureVersion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class PayWithBinding extends PayStrategy {

        @NotNull
        private final String bindingId;

        @NotNull
        private final FeatureVersion version;
        private final boolean wasFraudMonReview;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithBinding$FeatureVersion;", "", "(Ljava/lang/String;I)V", "DEPRECATED", "MVP0", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum FeatureVersion {
            DEPRECATED,
            MVP0
        }

        public /* synthetic */ PayWithBinding(String str, FeatureVersion featureVersion, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, featureVersion, (i11 & 4) != 0 ? false : z11);
        }

        public static /* synthetic */ PayWithBinding copy$default(PayWithBinding payWithBinding, String str, FeatureVersion featureVersion, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payWithBinding.bindingId;
            }
            if ((i11 & 2) != 0) {
                featureVersion = payWithBinding.version;
            }
            if ((i11 & 4) != 0) {
                z11 = payWithBinding.wasFraudMonReview;
            }
            return payWithBinding.copy(str, featureVersion, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final FeatureVersion getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getWasFraudMonReview() {
            return this.wasFraudMonReview;
        }

        @NotNull
        public final PayWithBinding copy(@NotNull String bindingId, @NotNull FeatureVersion version, boolean wasFraudMonReview) {
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            Intrinsics.checkNotNullParameter(version, "version");
            return new PayWithBinding(bindingId, version, wasFraudMonReview);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayWithBinding)) {
                return false;
            }
            PayWithBinding payWithBinding = (PayWithBinding) other;
            return Intrinsics.d(this.bindingId, payWithBinding.bindingId) && this.version == payWithBinding.version && this.wasFraudMonReview == payWithBinding.wasFraudMonReview;
        }

        @NotNull
        public final String getBindingId() {
            return this.bindingId;
        }

        @NotNull
        public final FeatureVersion getVersion() {
            return this.version;
        }

        public final boolean getWasFraudMonReview() {
            return this.wasFraudMonReview;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.version.hashCode() + (this.bindingId.hashCode() * 31)) * 31;
            boolean z11 = this.wasFraudMonReview;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        @NotNull
        public String toString() {
            String str = this.bindingId;
            FeatureVersion featureVersion = this.version;
            boolean z11 = this.wasFraudMonReview;
            StringBuilder sb2 = new StringBuilder("PayWithBinding(bindingId=");
            sb2.append(str);
            sb2.append(", version=");
            sb2.append(featureVersion);
            sb2.append(", wasFraudMonReview=");
            return a.a(")", sb2, z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PayWithBinding(@NotNull String bindingId, @NotNull FeatureVersion version, boolean z11) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            Intrinsics.checkNotNullParameter(version, "version");
            this.bindingId = bindingId;
            this.version = version;
            this.wasFraudMonReview = z11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithBonuses;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PayWithBonuses extends PayStrategy implements AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber {

        @NotNull
        public static final PayWithBonuses INSTANCE = new PayWithBonuses();

        /* JADX WARN: Multi-variable type inference failed */
        private PayWithBonuses() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithPartsOnly;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PayWithPartsOnly extends PayStrategy implements AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, AuthMethod.ByRefreshToken, BnplMethod.SixPartPayment {

        @NotNull
        public static final PayWithPartsOnly INSTANCE = new PayWithPartsOnly();

        /* JADX WARN: Multi-variable type inference failed */
        private PayWithPartsOnly() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithPhoneNumber;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "toolType", "Lspay/sdk/api/SPaymentTool;", "(Lspay/sdk/api/SPaymentTool;)V", "getToolType", "()Lspay/sdk/api/SPaymentTool;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class PayWithPhoneNumber extends PayStrategy implements AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {

        @NotNull
        private final SPaymentTool toolType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithPhoneNumber(@NotNull SPaymentTool toolType) {
            super(toolType, null);
            Intrinsics.checkNotNullParameter(toolType, "toolType");
            this.toolType = toolType;
        }

        public static /* synthetic */ PayWithPhoneNumber copy$default(PayWithPhoneNumber payWithPhoneNumber, SPaymentTool sPaymentTool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sPaymentTool = payWithPhoneNumber.getToolType();
            }
            return payWithPhoneNumber.copy(sPaymentTool);
        }

        @NotNull
        public final SPaymentTool component1() {
            return getToolType();
        }

        @NotNull
        public final PayWithPhoneNumber copy(@NotNull SPaymentTool toolType) {
            Intrinsics.checkNotNullParameter(toolType, "toolType");
            return new PayWithPhoneNumber(toolType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWithPhoneNumber) && getToolType() == ((PayWithPhoneNumber) other).getToolType();
        }

        @Override // spay.sdk.domain.model.PayStrategy
        @NotNull
        public SPaymentTool getToolType() {
            return this.toolType;
        }

        public int hashCode() {
            return getToolType().hashCode();
        }

        @NotNull
        public String toString() {
            return "PayWithPhoneNumber(toolType=" + getToolType() + ")";
        }
    }

    public /* synthetic */ PayStrategy(SPaymentTool sPaymentTool, DefaultConstructorMarker defaultConstructorMarker) {
        this(sPaymentTool);
    }

    @NotNull
    public SPaymentTool getToolType() {
        return this.toolType;
    }

    private PayStrategy(SPaymentTool sPaymentTool) {
        this.toolType = sPaymentTool;
    }

    public /* synthetic */ PayStrategy(SPaymentTool sPaymentTool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? SPaymentTool.CARDS : sPaymentTool, null);
    }
}
