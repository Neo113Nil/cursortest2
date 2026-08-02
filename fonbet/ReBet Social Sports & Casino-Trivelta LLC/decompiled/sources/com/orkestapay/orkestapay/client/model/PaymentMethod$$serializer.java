package com.orkestapay.orkestapay.client.model;

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
import di.Z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/PaymentMethod.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/PaymentMethod;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class PaymentMethod$$serializer implements N {

    @NotNull
    public static final PaymentMethod$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PaymentMethod$$serializer paymentMethod$$serializer = new PaymentMethod$$serializer();
        INSTANCE = paymentMethod$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.PaymentMethod", paymentMethod$$serializer, 6);
        j02.n("alias", false);
        j02.n("customer_id", false);
        j02.n("device_session_id", false);
        j02.n("type", false);
        j02.n("card", false);
        j02.n("billing_address", true);
        descriptor = j02;
    }

    private PaymentMethod$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = PaymentMethod.$childSerializers;
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02), interfaceC1901bArr[3], Card$$serializer.INSTANCE, AbstractC2028a.t(BillingAddress$$serializer.INSTANCE)};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public PaymentMethod deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        int i10;
        String str;
        String str2;
        String str3;
        PaymentMethodType paymentMethodType;
        Card card;
        BillingAddress billingAddress;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = PaymentMethod.$childSerializers;
        int i11 = 5;
        String str4 = null;
        if (c10.q()) {
            Z0 z02 = Z0.f45341a;
            String str5 = (String) c10.C(descriptor2, 0, z02, null);
            String str6 = (String) c10.C(descriptor2, 1, z02, null);
            String str7 = (String) c10.C(descriptor2, 2, z02, null);
            PaymentMethodType paymentMethodType2 = (PaymentMethodType) c10.i(descriptor2, 3, interfaceC1901bArr[3], null);
            Card card2 = (Card) c10.i(descriptor2, 4, Card$$serializer.INSTANCE, null);
            paymentMethodType = paymentMethodType2;
            str3 = str7;
            billingAddress = (BillingAddress) c10.C(descriptor2, 5, BillingAddress$$serializer.INSTANCE, null);
            card = card2;
            i10 = 63;
            str2 = str6;
            str = str5;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str8 = null;
            String str9 = null;
            PaymentMethodType paymentMethodType3 = null;
            Card card3 = null;
            BillingAddress billingAddress2 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                switch (e10) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                    case 0:
                        str4 = (String) c10.C(descriptor2, 0, Z0.f45341a, str4);
                        i12 |= 1;
                        i11 = 5;
                    case 1:
                        str8 = (String) c10.C(descriptor2, 1, Z0.f45341a, str8);
                        i12 |= 2;
                    case 2:
                        str9 = (String) c10.C(descriptor2, 2, Z0.f45341a, str9);
                        i12 |= 4;
                    case 3:
                        paymentMethodType3 = (PaymentMethodType) c10.i(descriptor2, 3, interfaceC1901bArr[3], paymentMethodType3);
                        i12 |= 8;
                    case 4:
                        card3 = (Card) c10.i(descriptor2, 4, Card$$serializer.INSTANCE, card3);
                        i12 |= 16;
                    case 5:
                        billingAddress2 = (BillingAddress) c10.C(descriptor2, i11, BillingAddress$$serializer.INSTANCE, billingAddress2);
                        i12 |= 32;
                    default:
                        throw new B(e10);
                }
            }
            i10 = i12;
            str = str4;
            str2 = str8;
            str3 = str9;
            paymentMethodType = paymentMethodType3;
            card = card3;
            billingAddress = billingAddress2;
        }
        c10.b(descriptor2);
        return new PaymentMethod(i10, str, str2, str3, paymentMethodType, card, billingAddress, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull PaymentMethod value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        PaymentMethod.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
