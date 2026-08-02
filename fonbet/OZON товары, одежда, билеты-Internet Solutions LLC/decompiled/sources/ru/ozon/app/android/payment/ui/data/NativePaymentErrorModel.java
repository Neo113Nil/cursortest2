package ru.ozon.app.android.payment.ui.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.wallet.WalletConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/payment/ui/data/NativePaymentErrorModel;", "", "", "statusCode", "<init>", "(Ljava/lang/String;II)V", "I", "getStatusCode", "()I", "Companion", "ERROR_CODE_AUTHENTICATION_FAILURE", "ERROR_CODE_BUYER_ACCOUNT_ERROR", "ERROR_CODE_DEVELOPER_ERROR", "ERROR_CODE_INTERNAL_ERROR", "ERROR_CODE_INVALID_PARAMETERS", "ERROR_CODE_MERCHANT_ACCOUNT_ERROR", "ERROR_CODE_SERVICE_UNAVAILABLE", "ERROR_CODE_UNKNOWN", "ERROR_CODE_UNSUPPORTED_API_VERSION", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NativePaymentErrorModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NativePaymentErrorModel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final NativePaymentErrorModel ERROR_CODE_AUTHENTICATION_FAILURE = new NativePaymentErrorModel("ERROR_CODE_AUTHENTICATION_FAILURE", 0, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE);
    public static final NativePaymentErrorModel ERROR_CODE_BUYER_ACCOUNT_ERROR = new NativePaymentErrorModel("ERROR_CODE_BUYER_ACCOUNT_ERROR", 1, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR);
    public static final NativePaymentErrorModel ERROR_CODE_DEVELOPER_ERROR = new NativePaymentErrorModel("ERROR_CODE_DEVELOPER_ERROR", 2, 10);
    public static final NativePaymentErrorModel ERROR_CODE_INTERNAL_ERROR = new NativePaymentErrorModel("ERROR_CODE_INTERNAL_ERROR", 3, 8);
    public static final NativePaymentErrorModel ERROR_CODE_INVALID_PARAMETERS = new NativePaymentErrorModel("ERROR_CODE_INVALID_PARAMETERS", 4, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
    public static final NativePaymentErrorModel ERROR_CODE_MERCHANT_ACCOUNT_ERROR = new NativePaymentErrorModel("ERROR_CODE_MERCHANT_ACCOUNT_ERROR", 5, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR);
    public static final NativePaymentErrorModel ERROR_CODE_SERVICE_UNAVAILABLE = new NativePaymentErrorModel("ERROR_CODE_SERVICE_UNAVAILABLE", 6, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE);
    public static final NativePaymentErrorModel ERROR_CODE_UNKNOWN = new NativePaymentErrorModel("ERROR_CODE_UNKNOWN", 7, WalletConstants.ERROR_CODE_UNKNOWN);
    public static final NativePaymentErrorModel ERROR_CODE_UNSUPPORTED_API_VERSION = new NativePaymentErrorModel("ERROR_CODE_UNSUPPORTED_API_VERSION", 8, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);

    @NotNull
    private static final Map<Integer, NativePaymentErrorModel> values;
    private final int statusCode;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/payment/ui/data/NativePaymentErrorModel$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/payment/ui/data/NativePaymentErrorModel;", "getValues", "()Ljava/util/Map;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Integer;)Lru/ozon/app/android/payment/ui/data/NativePaymentErrorModel;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NativePaymentErrorModel fromValue(Integer value) {
            NativePaymentErrorModel nativePaymentErrorModel;
            return (value == null || (nativePaymentErrorModel = NativePaymentErrorModel.INSTANCE.getValues().get(value)) == null) ? NativePaymentErrorModel.ERROR_CODE_UNKNOWN : nativePaymentErrorModel;
        }

        @NotNull
        public final Map<Integer, NativePaymentErrorModel> getValues() {
            return NativePaymentErrorModel.values;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ NativePaymentErrorModel[] $values() {
        return new NativePaymentErrorModel[]{ERROR_CODE_AUTHENTICATION_FAILURE, ERROR_CODE_BUYER_ACCOUNT_ERROR, ERROR_CODE_DEVELOPER_ERROR, ERROR_CODE_INTERNAL_ERROR, ERROR_CODE_INVALID_PARAMETERS, ERROR_CODE_MERCHANT_ACCOUNT_ERROR, ERROR_CODE_SERVICE_UNAVAILABLE, ERROR_CODE_UNKNOWN, ERROR_CODE_UNSUPPORTED_API_VERSION};
    }

    static {
        NativePaymentErrorModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        NativePaymentErrorModel[] values2 = values();
        int h11 = U.h(values2.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (NativePaymentErrorModel nativePaymentErrorModel : values2) {
            linkedHashMap.put(Integer.valueOf(nativePaymentErrorModel.statusCode), nativePaymentErrorModel);
        }
        values = linkedHashMap;
    }

    private NativePaymentErrorModel(String str, int i11, int i12) {
        this.statusCode = i12;
    }

    public static NativePaymentErrorModel valueOf(String str) {
        return (NativePaymentErrorModel) Enum.valueOf(NativePaymentErrorModel.class, str);
    }

    public static NativePaymentErrorModel[] values() {
        return (NativePaymentErrorModel[]) $VALUES.clone();
    }
}
