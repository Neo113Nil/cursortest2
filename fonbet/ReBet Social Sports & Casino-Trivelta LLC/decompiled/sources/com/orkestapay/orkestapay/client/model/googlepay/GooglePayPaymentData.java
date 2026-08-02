package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.l;
import Zh.n;
import bi.f;
import ci.d;
import di.U0;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentData;", "", "<init>", "()V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentData;Lci/d;Lbi/f;)V", "getApiVersionMinor", "()I", "apiVersionMinor", "getApiVersion", "apiVersion", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "getPaymentMethodData", "()Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "paymentMethodData", "Companion", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayDataResult;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class GooglePayPaymentData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<InterfaceC1901b> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<InterfaceC1901b>() { // from class: com.orkestapay.orkestapay.client.model.googlepay.GooglePayPaymentData.Companion.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final InterfaceC1901b invoke() {
            return new l("com.orkestapay.orkestapay.client.model.googlepay.GooglePayPaymentData", Reflection.getOrCreateKotlinClass(GooglePayPaymentData.class), new KClass[]{Reflection.getOrCreateKotlinClass(GooglePayDataResult.class), Reflection.getOrCreateKotlinClass(PaymentMethodGooglePayDetails.class)}, new InterfaceC1901b[]{GooglePayDataResult$$serializer.INSTANCE, PaymentMethodGooglePayDetails$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentData$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentData;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC1901b get$cachedSerializer() {
            return (InterfaceC1901b) GooglePayPaymentData.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GooglePayPaymentData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getApiVersion();

    public abstract int getApiVersionMinor();

    @NotNull
    public abstract PaymentMethodDataGooglePay getPaymentMethodData();

    private GooglePayPaymentData() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GooglePayPaymentData(int i10, U0 u02) {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(GooglePayPaymentData self, d output, f serialDesc) {
    }
}
