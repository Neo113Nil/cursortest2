package gatewayprotocol.v1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.m;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionEventRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransactionEventRequestKt {
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    /* compiled from: TransactionEventRequestKt.kt */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 b2\u00020\u0001:\u0002bcB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010E\u001a\u00020FH\u0001J\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020HJ\u0006\u0010J\u001a\u00020HJ\u0006\u0010K\u001a\u00020HJ\u0006\u0010L\u001a\u00020HJ\u0006\u0010M\u001a\u00020HJ\u0006\u0010N\u001a\u00020HJ\u0006\u0010O\u001a\u00020HJ\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u00020QJ\u0006\u0010S\u001a\u00020QJ%\u0010T\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@2\u0006\u0010\u0005\u001a\u00020AH\u0007¢\u0006\u0002\bUJ+\u0010V\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020A0XH\u0007¢\u0006\u0002\bYJ\u001d\u0010Z\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@H\u0007¢\u0006\u0002\b[J&\u0010\\\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@2\u0006\u0010\u0005\u001a\u00020AH\u0087\n¢\u0006\u0002\b]J,\u0010\\\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020A0XH\u0087\n¢\u0006\u0002\b^J.\u0010_\u001a\u00020H*\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@2\u0006\u0010`\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020AH\u0087\u0002¢\u0006\u0002\baR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u001d\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0@8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006d"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;)V", "value", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "appStore", "getAppStore", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "setAppStore", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;)V", "", "appStoreValue", "getAppStoreValue", "()I", "setAppStoreValue", "(I)V", "", "customStore", "getCustomStore", "()Ljava/lang/String;", "setCustomStore", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "googlePlayBillingLibraryVersion", "getGooglePlayBillingLibraryVersion", "setGooglePlayBillingLibraryVersion", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "origin", "getOrigin", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "setOrigin", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "originValue", "getOriginValue", "setOriginValue", "Lcom/google/protobuf/ByteString;", "receipt", "getReceipt", "()Lcom/google/protobuf/ByteString;", "setReceipt", "(Lcom/google/protobuf/ByteString;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "storeKitVersion", "getStoreKitVersion", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "setStoreKitVersion", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;)V", "storeKitVersionValue", "getStoreKitVersionValue", "setStoreKitVersionValue", "transactionData", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "getTransactionData", "()Lcom/google/protobuf/kotlin/DslList;", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "clearAppStore", "", "clearCustomStore", "clearDynamicDeviceInfo", "clearGooglePlayBillingLibraryVersion", "clearOrigin", "clearReceipt", "clearStaticDeviceInfo", "clearStoreKitVersion", "hasDynamicDeviceInfo", "", "hasReceipt", "hasStaticDeviceInfo", m.l, "addTransactionData", "addAll", "values", "", "addAllTransactionData", "clear", "clearTransactionData", "plusAssign", "plusAssignTransactionData", "plusAssignAllTransactionData", "set", FirebaseAnalytics.Param.INDEX, "setTransactionData", k.M, "TransactionDataProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            TransactionEventRequestOuterClass.TransactionEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            Intrinsics.checkNotNullExpressionValue(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final void setAppStore(TransactionEventRequestOuterClass.StoreType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppStore(value);
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final void setAppStoreValue(int i) {
            this._builder.setAppStoreValue(i);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final String getCustomStore() {
            String customStore = this._builder.getCustomStore();
            Intrinsics.checkNotNullExpressionValue(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final void setCustomStore(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public final /* synthetic */ DslList getTransactionData() {
            List<TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            Intrinsics.checkNotNullExpressionValue(transactionDataList, "_builder.getTransactionDataList()");
            return new DslList(transactionDataList);
        }

        public final /* synthetic */ void addTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTransactionData(value);
        }

        public final /* synthetic */ void plusAssignTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addTransactionData(dslList, value);
        }

        public final /* synthetic */ void addAllTransactionData(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void plusAssignAllTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, Iterable<TransactionEventRequestOuterClass.TransactionData> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionData(i, value);
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        public final TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            TransactionEventRequestOuterClass.TransactionOrigin origin = this._builder.getOrigin();
            Intrinsics.checkNotNullExpressionValue(origin, "_builder.getOrigin()");
            return origin;
        }

        public final void setOrigin(TransactionEventRequestOuterClass.TransactionOrigin value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOrigin(value);
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final void setOriginValue(int i) {
            this._builder.setOriginValue(i);
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion = this._builder.getStoreKitVersion();
            Intrinsics.checkNotNullExpressionValue(storeKitVersion, "_builder.getStoreKitVersion()");
            return storeKitVersion;
        }

        public final void setStoreKitVersion(TransactionEventRequestOuterClass.StoreKitVersion value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStoreKitVersion(value);
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final void setStoreKitVersionValue(int i) {
            this._builder.setStoreKitVersionValue(i);
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        public final String getGooglePlayBillingLibraryVersion() {
            String googlePlayBillingLibraryVersion = this._builder.getGooglePlayBillingLibraryVersion();
            Intrinsics.checkNotNullExpressionValue(googlePlayBillingLibraryVersion, "_builder.getGooglePlayBillingLibraryVersion()");
            return googlePlayBillingLibraryVersion;
        }

        public final void setGooglePlayBillingLibraryVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGooglePlayBillingLibraryVersion(value);
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }

        public final ByteString getReceipt() {
            ByteString receipt = this._builder.getReceipt();
            Intrinsics.checkNotNullExpressionValue(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final void setReceipt(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReceipt(value);
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }
    }

    private TransactionEventRequestKt() {
    }
}
