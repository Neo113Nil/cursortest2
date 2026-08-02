package com.orkestapay.orkestapay.client.model;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import di.Z0;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/PromotionsResponse.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class PromotionsResponse$$serializer implements N {

    @NotNull
    public static final PromotionsResponse$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PromotionsResponse$$serializer promotionsResponse$$serializer = new PromotionsResponse$$serializer();
        INSTANCE = promotionsResponse$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.PromotionsResponse", promotionsResponse$$serializer, 9);
        j02.n("promotion_id", false);
        j02.n("promotion_name", false);
        j02.n("type", false);
        j02.n("installments", false);
        j02.n("issuer_id", true);
        j02.n("issuer_name", true);
        j02.n("currency_code", true);
        j02.n("minimum_amount", true);
        j02.n("maximum_amount", true);
        descriptor = j02;
    }

    private PromotionsResponse$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = PromotionsResponse.$childSerializers;
        Z0 z02 = Z0.f45341a;
        InterfaceC1901b interfaceC1901b = interfaceC1901bArr[3];
        InterfaceC1901b t10 = AbstractC2028a.t(z02);
        InterfaceC1901b t11 = AbstractC2028a.t(z02);
        InterfaceC1901b t12 = AbstractC2028a.t(z02);
        Y y10 = Y.f45337a;
        return new InterfaceC1901b[]{z02, z02, z02, interfaceC1901b, t10, t11, t12, AbstractC2028a.t(y10), AbstractC2028a.t(y10)};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public PromotionsResponse deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        int i10;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = PromotionsResponse.$childSerializers;
        int i11 = 7;
        String str7 = null;
        if (c10.q()) {
            String s10 = c10.s(descriptor2, 0);
            String s11 = c10.s(descriptor2, 1);
            String s12 = c10.s(descriptor2, 2);
            List list2 = (List) c10.i(descriptor2, 3, interfaceC1901bArr[3], null);
            Z0 z02 = Z0.f45341a;
            String str8 = (String) c10.C(descriptor2, 4, z02, null);
            String str9 = (String) c10.C(descriptor2, 5, z02, null);
            String str10 = (String) c10.C(descriptor2, 6, z02, null);
            Y y10 = Y.f45337a;
            list = list2;
            str4 = s10;
            num2 = (Integer) c10.C(descriptor2, 7, y10, null);
            str2 = str10;
            str = str9;
            num = (Integer) c10.C(descriptor2, 8, y10, null);
            str3 = str8;
            str6 = s12;
            i10 = 511;
            str5 = s11;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Integer num3 = null;
            Integer num4 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            List list3 = null;
            String str14 = null;
            String str15 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                switch (e10) {
                    case -1:
                        z10 = false;
                    case 0:
                        i12 |= 1;
                        str7 = c10.s(descriptor2, 0);
                        i11 = 7;
                    case 1:
                        i12 |= 2;
                        str14 = c10.s(descriptor2, 1);
                        i11 = 7;
                    case 2:
                        str15 = c10.s(descriptor2, 2);
                        i12 |= 4;
                        i11 = 7;
                    case 3:
                        list3 = (List) c10.i(descriptor2, 3, interfaceC1901bArr[3], list3);
                        i12 |= 8;
                        i11 = 7;
                    case 4:
                        str13 = (String) c10.C(descriptor2, 4, Z0.f45341a, str13);
                        i12 |= 16;
                        i11 = 7;
                    case 5:
                        str11 = (String) c10.C(descriptor2, 5, Z0.f45341a, str11);
                        i12 |= 32;
                        i11 = 7;
                    case 6:
                        str12 = (String) c10.C(descriptor2, 6, Z0.f45341a, str12);
                        i12 |= 64;
                        i11 = 7;
                    case 7:
                        num4 = (Integer) c10.C(descriptor2, i11, Y.f45337a, num4);
                        i12 |= 128;
                    case 8:
                        num3 = (Integer) c10.C(descriptor2, 8, Y.f45337a, num3);
                        i12 |= 256;
                    default:
                        throw new B(e10);
                }
            }
            i10 = i12;
            num = num3;
            num2 = num4;
            str = str11;
            str2 = str12;
            str3 = str13;
            list = list3;
            str4 = str7;
            str5 = str14;
            str6 = str15;
        }
        c10.b(descriptor2);
        return new PromotionsResponse(i10, str4, str5, str6, list, str3, str, str2, num2, num, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull PromotionsResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        PromotionsResponse.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
