package com.orkestapay.orkestapay.client.model;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.appsflyer.AdRevenueScheme;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/client/model/BillingAddress.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/client/model/BillingAddress;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class BillingAddress$$serializer implements N {

    @NotNull
    public static final BillingAddress$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        BillingAddress$$serializer billingAddress$$serializer = new BillingAddress$$serializer();
        INSTANCE = billingAddress$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.client.model.BillingAddress", billingAddress$$serializer, 11);
        j02.n("first_name", false);
        j02.n("last_name", true);
        j02.n("email", false);
        j02.n("phone", false);
        j02.n("type", true);
        j02.n("line_1", false);
        j02.n("line_2", true);
        j02.n("city", false);
        j02.n("state", false);
        j02.n(AdRevenueScheme.COUNTRY, false);
        j02.n("zip_code", false);
        descriptor = j02;
    }

    private BillingAddress$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(Phone$$serializer.INSTANCE), AbstractC2028a.t(z02), z02, AbstractC2028a.t(z02), z02, z02, z02, z02};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public BillingAddress deserialize(@NotNull e decoder) {
        int i10;
        String str;
        String str2;
        Phone phone;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 10;
        String str11 = null;
        if (c10.q()) {
            Z0 z02 = Z0.f45341a;
            String str12 = (String) c10.C(descriptor2, 0, z02, null);
            String str13 = (String) c10.C(descriptor2, 1, z02, null);
            String str14 = (String) c10.C(descriptor2, 2, z02, null);
            Phone phone2 = (Phone) c10.C(descriptor2, 3, Phone$$serializer.INSTANCE, null);
            String str15 = (String) c10.C(descriptor2, 4, z02, null);
            String s10 = c10.s(descriptor2, 5);
            String str16 = (String) c10.C(descriptor2, 6, z02, null);
            String s11 = c10.s(descriptor2, 7);
            String s12 = c10.s(descriptor2, 8);
            String s13 = c10.s(descriptor2, 9);
            str = str16;
            str10 = c10.s(descriptor2, 10);
            str9 = s13;
            str7 = s11;
            str8 = s12;
            str6 = s10;
            phone = phone2;
            i10 = 2047;
            str2 = str15;
            str3 = str14;
            str5 = str13;
            str4 = str12;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str17 = null;
            String str18 = null;
            Phone phone3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                switch (e10) {
                    case -1:
                        z10 = false;
                        i11 = 10;
                    case 0:
                        str11 = (String) c10.C(descriptor2, 0, Z0.f45341a, str11);
                        i12 |= 1;
                        i11 = 10;
                    case 1:
                        str20 = (String) c10.C(descriptor2, 1, Z0.f45341a, str20);
                        i12 |= 2;
                        i11 = 10;
                    case 2:
                        str19 = (String) c10.C(descriptor2, 2, Z0.f45341a, str19);
                        i12 |= 4;
                        i11 = 10;
                    case 3:
                        phone3 = (Phone) c10.C(descriptor2, 3, Phone$$serializer.INSTANCE, phone3);
                        i12 |= 8;
                        i11 = 10;
                    case 4:
                        str18 = (String) c10.C(descriptor2, 4, Z0.f45341a, str18);
                        i12 |= 16;
                        i11 = 10;
                    case 5:
                        str21 = c10.s(descriptor2, 5);
                        i12 |= 32;
                    case 6:
                        str17 = (String) c10.C(descriptor2, 6, Z0.f45341a, str17);
                        i12 |= 64;
                    case 7:
                        str22 = c10.s(descriptor2, 7);
                        i12 |= 128;
                    case 8:
                        str23 = c10.s(descriptor2, 8);
                        i12 |= 256;
                    case 9:
                        str24 = c10.s(descriptor2, 9);
                        i12 |= 512;
                    case 10:
                        str25 = c10.s(descriptor2, i11);
                        i12 |= 1024;
                    default:
                        throw new B(e10);
                }
            }
            i10 = i12;
            str = str17;
            str2 = str18;
            phone = phone3;
            str3 = str19;
            str4 = str11;
            str5 = str20;
            str6 = str21;
            str7 = str22;
            str8 = str23;
            str9 = str24;
            str10 = str25;
        }
        c10.b(descriptor2);
        return new BillingAddress(i10, str4, str5, str3, phone, str2, str6, str, str7, str8, str9, str10, (U0) null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull BillingAddress value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        BillingAddress.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
