package com.unity3d.ads.core.domain.billing;

import com.inmobi.unification.sdk.InitializationStatus;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "", "<init>", "()V", InitializationStatus.SUCCESS, "Failure", "NotFound", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ProductDetailsResult {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;)V", "getBillingResult", "()Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends ProductDetailsResult {

        @NotNull
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull BillingResultBridge billingResultBridge) {
            super(null);
            billingResultBridge.getClass();
            this.billingResult = billingResultBridge;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        @NotNull
        public final Failure copy(@NotNull BillingResultBridge billingResult) {
            billingResult.getClass();
            return new Failure(billingResult);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.c(this.billingResult, ((Failure) other).billingResult);
        }

        @NotNull
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotFound extends ProductDetailsResult {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "productDetailsJson", "", "<init>", "(Ljava/lang/String;)V", "getProductDetailsJson", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends ProductDetailsResult {

        @NotNull
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String str) {
            super(null);
            str.getClass();
            this.productDetailsJson = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        @NotNull
        public final Success copy(@NotNull String productDetailsJson) {
            productDetailsJson.getClass();
            return new Success(productDetailsJson);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.c(this.productDetailsJson, ((Success) other).productDetailsJson);
        }

        @NotNull
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.q(new StringBuilder("Success(productDetailsJson="), this.productDetailsJson, ')');
        }
    }

    public /* synthetic */ ProductDetailsResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductDetailsResult() {
    }
}
