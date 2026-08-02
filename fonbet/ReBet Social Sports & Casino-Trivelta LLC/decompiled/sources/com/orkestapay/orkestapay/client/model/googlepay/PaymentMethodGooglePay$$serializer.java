package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.orkestapay.orkestapay.client.model.BillingAddress;
import com.orkestapay.orkestapay.client.model.BillingAddress$$serializer;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class PaymentMethodGooglePay$$serializer implements N {

    @NotNull
    public static final PaymentMethodGooglePay$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PaymentMethodGooglePay$$serializer paymentMethodGooglePay$$serializer = new PaymentMethodGooglePay$$serializer();
        INSTANCE = paymentMethodGooglePay$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePay", paymentMethodGooglePay$$serializer, 5);
        j02.n("google_pay", false);
        j02.n("type", false);
        j02.n("customer_id", true);
        j02.n("alias", true);
        j02.n("billing_address", true);
        descriptor = j02;
    }

    private PaymentMethodGooglePay$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = PaymentMethodGooglePay.$childSerializers;
        InterfaceC1901b interfaceC1901b = interfaceC1901bArr[1];
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{PaymentMethodGooglePayDetails$$serializer.INSTANCE, interfaceC1901b, AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(BillingAddress$$serializer.INSTANCE)};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public PaymentMethodGooglePay deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        int i10;
        PaymentMethodGooglePayDetails paymentMethodGooglePayDetails;
        PaymentMethodType paymentMethodType;
        String str;
        String str2;
        BillingAddress billingAddress;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = PaymentMethodGooglePay.$childSerializers;
        PaymentMethodGooglePayDetails paymentMethodGooglePayDetails2 = null;
        if (c10.q()) {
            PaymentMethodGooglePayDetails paymentMethodGooglePayDetails3 = (PaymentMethodGooglePayDetails) c10.i(descriptor2, 0, PaymentMethodGooglePayDetails$$serializer.INSTANCE, null);
            PaymentMethodType paymentMethodType2 = (PaymentMethodType) c10.i(descriptor2, 1, interfaceC1901bArr[1], null);
            Z0 z02 = Z0.f45341a;
            String str3 = (String) c10.C(descriptor2, 2, z02, null);
            paymentMethodType = paymentMethodType2;
            paymentMethodGooglePayDetails = paymentMethodGooglePayDetails3;
            str2 = (String) c10.C(descriptor2, 3, z02, null);
            billingAddress = (BillingAddress) c10.C(descriptor2, 4, BillingAddress$$serializer.INSTANCE, null);
            str = str3;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            PaymentMethodType paymentMethodType3 = null;
            String str4 = null;
            String str5 = null;
            BillingAddress billingAddress2 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                if (e10 == -1) {
                    z10 = false;
                } else if (e10 == 0) {
                    paymentMethodGooglePayDetails2 = (PaymentMethodGooglePayDetails) c10.i(descriptor2, 0, PaymentMethodGooglePayDetails$$serializer.INSTANCE, paymentMethodGooglePayDetails2);
                    i11 |= 1;
                } else if (e10 == 1) {
                    paymentMethodType3 = (PaymentMethodType) c10.i(descriptor2, 1, interfaceC1901bArr[1], paymentMethodType3);
                    i11 |= 2;
                } else if (e10 == 2) {
                    str4 = (String) c10.C(descriptor2, 2, Z0.f45341a, str4);
                    i11 |= 4;
                } else if (e10 == 3) {
                    str5 = (String) c10.C(descriptor2, 3, Z0.f45341a, str5);
                    i11 |= 8;
                } else {
                    if (e10 != 4) {
                        throw new B(e10);
                    }
                    billingAddress2 = (BillingAddress) c10.C(descriptor2, 4, BillingAddress$$serializer.INSTANCE, billingAddress2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            paymentMethodGooglePayDetails = paymentMethodGooglePayDetails2;
            paymentMethodType = paymentMethodType3;
            str = str4;
            str2 = str5;
            billingAddress = billingAddress2;
        }
        c10.b(descriptor2);
        return new PaymentMethodGooglePay(i10, paymentMethodGooglePayDetails, paymentMethodType, str, str2, billingAddress, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull PaymentMethodGooglePay value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        PaymentMethodGooglePay.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
