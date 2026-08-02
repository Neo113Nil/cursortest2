package gatewayprotocol.v1;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionDataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    /* compiled from: TransactionDataKt.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u000209H\u0001J\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020;J\u0006\u0010=\u001a\u00020;J\u0006\u0010>\u001a\u00020;J\u0006\u0010?\u001a\u00020;J\u0006\u0010@\u001a\u00020;J\u0006\u0010A\u001a\u00020;J\u0006\u0010B\u001a\u00020;J\u0006\u0010C\u001a\u00020;J\u0006\u0010D\u001a\u00020;J\u0006\u0010E\u001a\u00020FJ\u0006\u0010G\u001a\u00020FJ\u0006\u0010H\u001a\u00020FJ\u0006\u0010I\u001a\u00020FR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R$\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R$\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R$\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006K"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "", "jwsRepresentation", "getJwsRepresentation", "()Ljava/lang/String;", "setJwsRepresentation", "(Ljava/lang/String;)V", AppLovinEventTypes.USER_VIEWED_PRODUCT, "getProduct", "setProduct", InAppPurchaseMetaData.KEY_PRODUCT_ID, "getProductId", "setProductId", "receipt", "getReceipt$annotations", "()V", "getReceipt", "setReceipt", InAppPurchaseMetaData.KEY_SIGNATURE, "getSignature", "setSignature", "Lcom/google/protobuf/Timestamp;", "timestamp", "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "transaction", "getTransaction", "setTransaction", "transactionId", "getTransactionId", "setTransactionId", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "transactionState", "getTransactionState", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "setTransactionState", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;)V", "", "transactionStateValue", "getTransactionStateValue", "()I", "setTransactionStateValue", "(I)V", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "clearEventId", "", "clearJwsRepresentation", "clearProduct", "clearProductId", "clearReceipt", "clearSignature", "clearTimestamp", "clearTransaction", "clearTransactionId", "clearTransactionState", "hasJwsRepresentation", "", "hasReceipt", "hasSignature", "hasTimestamp", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @Deprecated(message = "Field receipt is deprecated")
        public static /* synthetic */ void getReceipt$annotations() {
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TransactionDataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            Intrinsics.checkNotNullExpressionValue(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final void setTimestamp(Timestamp value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "_builder.getProductId()");
            return productId;
        }

        public final void setProductId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProductId(value);
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            Intrinsics.checkNotNullExpressionValue(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final void setEventId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventId(value);
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            Intrinsics.checkNotNullExpressionValue(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        public final void setTransactionId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            Intrinsics.checkNotNullExpressionValue(product, "_builder.getProduct()");
            return product;
        }

        public final void setProduct(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProduct(value);
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            Intrinsics.checkNotNullExpressionValue(transaction, "_builder.getTransaction()");
            return transaction;
        }

        public final void setTransaction(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransaction(value);
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            Intrinsics.checkNotNullExpressionValue(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final void setReceipt(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReceipt(value);
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            Intrinsics.checkNotNullExpressionValue(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionState(value);
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final void setTransactionStateValue(int i) {
            this._builder.setTransactionStateValue(i);
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            Intrinsics.checkNotNullExpressionValue(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        public final void setJwsRepresentation(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setJwsRepresentation(value);
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final String getSignature() {
            String signature = this._builder.getSignature();
            Intrinsics.checkNotNullExpressionValue(signature, "_builder.getSignature()");
            return signature;
        }

        public final void setSignature(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSignature(value);
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }
    }

    private TransactionDataKt() {
    }
}
