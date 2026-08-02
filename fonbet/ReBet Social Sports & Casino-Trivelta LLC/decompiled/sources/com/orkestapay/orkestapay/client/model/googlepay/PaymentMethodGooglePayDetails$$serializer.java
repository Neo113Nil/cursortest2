package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class PaymentMethodGooglePayDetails$$serializer implements N {

    @NotNull
    public static final PaymentMethodGooglePayDetails$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PaymentMethodGooglePayDetails$$serializer paymentMethodGooglePayDetails$$serializer = new PaymentMethodGooglePayDetails$$serializer();
        INSTANCE = paymentMethodGooglePayDetails$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePayDetails", paymentMethodGooglePayDetails$$serializer, 5);
        j02.n("type", true);
        j02.n("wallet_type", true);
        j02.n("api_version_minor", false);
        j02.n("api_version", false);
        j02.n("payment_method_data", false);
        descriptor = j02;
    }

    private PaymentMethodGooglePayDetails$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = PaymentMethodGooglePayDetails.$childSerializers;
        InterfaceC1901b t10 = AbstractC2028a.t(interfaceC1901bArr[0]);
        InterfaceC1901b t11 = AbstractC2028a.t(interfaceC1901bArr[1]);
        Y y10 = Y.f45337a;
        return new InterfaceC1901b[]{t10, t11, y10, y10, PaymentMethodDataGooglePay$$serializer.INSTANCE};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public PaymentMethodGooglePayDetails deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        int i10;
        int i11;
        int i12;
        PaymentMethodType paymentMethodType;
        PaymentMethodType paymentMethodType2;
        PaymentMethodDataGooglePay paymentMethodDataGooglePay;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = PaymentMethodGooglePayDetails.$childSerializers;
        int i13 = 0;
        if (c10.q()) {
            PaymentMethodType paymentMethodType3 = (PaymentMethodType) c10.C(descriptor2, 0, interfaceC1901bArr[0], null);
            PaymentMethodType paymentMethodType4 = (PaymentMethodType) c10.C(descriptor2, 1, interfaceC1901bArr[1], null);
            int F10 = c10.F(descriptor2, 2);
            paymentMethodType2 = paymentMethodType4;
            paymentMethodType = paymentMethodType3;
            i10 = c10.F(descriptor2, 3);
            paymentMethodDataGooglePay = (PaymentMethodDataGooglePay) c10.i(descriptor2, 4, PaymentMethodDataGooglePay$$serializer.INSTANCE, null);
            i11 = F10;
            i12 = 31;
        } else {
            int i14 = 1;
            int i15 = 0;
            int i16 = 0;
            PaymentMethodType paymentMethodType5 = null;
            PaymentMethodType paymentMethodType6 = null;
            PaymentMethodDataGooglePay paymentMethodDataGooglePay2 = null;
            int i17 = 0;
            while (i14 != 0) {
                int e10 = c10.e(descriptor2);
                int i18 = i13;
                if (e10 == -1) {
                    i13 = i18;
                    i14 = i13;
                } else if (e10 != 0) {
                    if (e10 == 1) {
                        paymentMethodType6 = (PaymentMethodType) c10.C(descriptor2, 1, interfaceC1901bArr[1], paymentMethodType6);
                        i16 |= 2;
                    } else if (e10 == 2) {
                        i17 = c10.F(descriptor2, 2);
                        i16 |= 4;
                    } else if (e10 == 3) {
                        i15 = c10.F(descriptor2, 3);
                        i16 |= 8;
                    } else {
                        if (e10 != 4) {
                            throw new B(e10);
                        }
                        paymentMethodDataGooglePay2 = (PaymentMethodDataGooglePay) c10.i(descriptor2, 4, PaymentMethodDataGooglePay$$serializer.INSTANCE, paymentMethodDataGooglePay2);
                        i16 |= 16;
                    }
                    i13 = i18;
                } else {
                    paymentMethodType5 = (PaymentMethodType) c10.C(descriptor2, i18, interfaceC1901bArr[i18], paymentMethodType5);
                    i16 |= 1;
                    i13 = i18;
                }
            }
            i10 = i15;
            i11 = i17;
            i12 = i16;
            paymentMethodType = paymentMethodType5;
            paymentMethodType2 = paymentMethodType6;
            paymentMethodDataGooglePay = paymentMethodDataGooglePay2;
        }
        c10.b(descriptor2);
        return new PaymentMethodGooglePayDetails(i12, paymentMethodType, paymentMethodType2, i11, i10, paymentMethodDataGooglePay, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull PaymentMethodGooglePayDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        PaymentMethodGooglePayDetails.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
