package com.orkestapay.orkestapay.client.model;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.orkestapay.orkestapay.client.enums.CardType;
import com.twilio.voice.EventKeys;
import di.C4093i;
import di.J0;
import di.N;
import di.Z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/CardResponse.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/CardResponse;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/CardResponse;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/CardResponse;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class CardResponse$$serializer implements N {

    @NotNull
    public static final CardResponse$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        CardResponse$$serializer cardResponse$$serializer = new CardResponse$$serializer();
        INSTANCE = cardResponse$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.CardResponse", cardResponse$$serializer, 9);
        j02.n("bin", false);
        j02.n("last_four", false);
        j02.n("brand", false);
        j02.n("card_type", false);
        j02.n("expiration_month", false);
        j02.n("expiration_year", false);
        j02.n("holder_name", false);
        j02.n("holder_last_name", false);
        j02.n("one_time_use", false);
        descriptor = j02;
    }

    private CardResponse$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        InterfaceC1901b[] interfaceC1901bArr;
        interfaceC1901bArr = CardResponse.$childSerializers;
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{z02, z02, z02, interfaceC1901bArr[3], z02, z02, z02, AbstractC2028a.t(z02), C4093i.f45370a};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public CardResponse deserialize(@NotNull e decoder) {
        InterfaceC1901b[] interfaceC1901bArr;
        boolean z10;
        String str;
        CardType cardType;
        int i10;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        interfaceC1901bArr = CardResponse.$childSerializers;
        if (c10.q()) {
            String s10 = c10.s(descriptor2, 0);
            String s11 = c10.s(descriptor2, 1);
            String s12 = c10.s(descriptor2, 2);
            CardType cardType2 = (CardType) c10.i(descriptor2, 3, interfaceC1901bArr[3], null);
            String s13 = c10.s(descriptor2, 4);
            String s14 = c10.s(descriptor2, 5);
            String s15 = c10.s(descriptor2, 6);
            cardType = cardType2;
            str2 = s10;
            str = (String) c10.C(descriptor2, 7, Z0.f45341a, null);
            str7 = s15;
            str6 = s14;
            z10 = c10.t(descriptor2, 8);
            str5 = s13;
            str4 = s12;
            i10 = 511;
            str3 = s11;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            int i11 = 0;
            CardType cardType3 = null;
            while (z11) {
                int e10 = c10.e(descriptor2);
                switch (e10) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        str9 = c10.s(descriptor2, 0);
                        continue;
                    case 1:
                        i11 |= 2;
                        str10 = c10.s(descriptor2, 1);
                        continue;
                    case 2:
                        str11 = c10.s(descriptor2, 2);
                        i11 |= 4;
                        continue;
                    case 3:
                        cardType3 = (CardType) c10.i(descriptor2, 3, interfaceC1901bArr[3], cardType3);
                        i11 |= 8;
                        break;
                    case 4:
                        str12 = c10.s(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str13 = c10.s(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        str14 = c10.s(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        str8 = (String) c10.C(descriptor2, 7, Z0.f45341a, str8);
                        i11 |= 128;
                        break;
                    case 8:
                        z12 = c10.t(descriptor2, 8);
                        i11 |= 256;
                        break;
                    default:
                        throw new B(e10);
                }
            }
            z10 = z12;
            str = str8;
            cardType = cardType3;
            i10 = i11;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str6 = str13;
            str7 = str14;
        }
        c10.b(descriptor2);
        return new CardResponse(i10, str2, str3, str4, cardType, str5, str6, str7, str, z10, null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull CardResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        CardResponse.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
