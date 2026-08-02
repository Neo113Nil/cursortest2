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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/PaymentMethodData.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class PaymentMethodData$$serializer implements N {

    @NotNull
    public static final PaymentMethodData$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PaymentMethodData$$serializer paymentMethodData$$serializer = new PaymentMethodData$$serializer();
        INSTANCE = paymentMethodData$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.PaymentMethodData", paymentMethodData$$serializer, 3);
        j02.n("type", false);
        j02.n("name", true);
        j02.n("properties", false);
        descriptor = j02;
    }

    private PaymentMethodData$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = PaymentMethodData.$childSerializers;
        return new InterfaceC1901b[]{interfaceC1901bArr[0], AbstractC2028a.t(Z0.f45341a), PaymentMethodProperties$$serializer.INSTANCE};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public PaymentMethodData deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        int i10;
        PaymentMethodType paymentMethodType;
        String str;
        PaymentMethodProperties paymentMethodProperties;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = PaymentMethodData.$childSerializers;
        PaymentMethodType paymentMethodType2 = null;
        if (c10.q()) {
            paymentMethodType = (PaymentMethodType) c10.i(descriptor2, 0, interfaceC1901bArr[0], null);
            str = (String) c10.C(descriptor2, 1, Z0.f45341a, null);
            paymentMethodProperties = (PaymentMethodProperties) c10.i(descriptor2, 2, PaymentMethodProperties$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str2 = null;
            PaymentMethodProperties paymentMethodProperties2 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                if (e10 == -1) {
                    z10 = false;
                } else if (e10 == 0) {
                    paymentMethodType2 = (PaymentMethodType) c10.i(descriptor2, 0, interfaceC1901bArr[0], paymentMethodType2);
                    i11 |= 1;
                } else if (e10 == 1) {
                    str2 = (String) c10.C(descriptor2, 1, Z0.f45341a, str2);
                    i11 |= 2;
                } else {
                    if (e10 != 2) {
                        throw new B(e10);
                    }
                    paymentMethodProperties2 = (PaymentMethodProperties) c10.i(descriptor2, 2, PaymentMethodProperties$$serializer.INSTANCE, paymentMethodProperties2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            paymentMethodType = paymentMethodType2;
            str = str2;
            paymentMethodProperties = paymentMethodProperties2;
        }
        c10.b(descriptor2);
        return new PaymentMethodData(i10, paymentMethodType, str, paymentMethodProperties, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull PaymentMethodData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        PaymentMethodData.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
