package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: ProductDetailsResult.kt */
/* loaded from: classes14.dex */
public abstract class ProductDetailsResult {

    /* compiled from: ProductDetailsResult.kt */
    public static final class Failure extends ProductDetailsResult {
        private final BillingResultBridge billingResult;

        public Failure(BillingResultBridge billingResultBridge) {
            super(null);
            this.billingResult = billingResultBridge;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        public final Failure copy(BillingResultBridge billingResultBridge) {
            return new Failure(billingResultBridge);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && epx.f(this.billingResult, ((Failure) obj).billingResult);
        }

        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    /* compiled from: ProductDetailsResult.kt */
    public static final class NotFound extends ProductDetailsResult {
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* compiled from: ProductDetailsResult.kt */
    public static final class Success extends ProductDetailsResult {
        private final String productDetailsJson;

        public Success(String str) {
            super(null);
            this.productDetailsJson = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.productDetailsJson;
        }

        public final Success copy(String str) {
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && epx.f(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        public String toString() {
            return ho8.a(new StringBuilder("Success(productDetailsJson="), this.productDetailsJson, ')');
        }
    }

    public /* synthetic */ ProductDetailsResult(zcl zclVar) {
        this();
    }

    private ProductDetailsResult() {
    }
}
