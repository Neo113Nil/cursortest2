package com.orkestapay.orkestapay.core.networking.model;

import Zh.B;
import Zh.InterfaceC1901b;
import bi.f;
import ci.c;
import ci.d;
import ci.e;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.Z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/orkestapay/orkestapay/core/networking/model/FieldError.$serializer", "Ldi/N;", "Lcom/orkestapay/orkestapay/core/networking/model/FieldError;", "<init>", "()V", "", "LZh/b;", "childSerializers", "()[LZh/b;", "Lci/e;", "decoder", "deserialize", "(Lci/e;)Lcom/orkestapay/orkestapay/core/networking/model/FieldError;", "Lci/f;", "encoder", EventKeys.VALUE_KEY, "", "serialize", "(Lci/f;Lcom/orkestapay/orkestapay/core/networking/model/FieldError;)V", "Lbi/f;", "getDescriptor", "()Lbi/f;", "descriptor", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class FieldError$$serializer implements N {

    @NotNull
    public static final FieldError$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        FieldError$$serializer fieldError$$serializer = new FieldError$$serializer();
        INSTANCE = fieldError$$serializer;
        J0 j02 = new J0("com.orkestapay.orkestapay.core.networking.model.FieldError", fieldError$$serializer, 2);
        j02.n("field", false);
        j02.n("message", false);
        descriptor = j02;
    }

    private FieldError$$serializer() {
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] childSerializers() {
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{z02, z02};
    }

    @Override // Zh.InterfaceC1900a
    @NotNull
    public FieldError deserialize(@NotNull e decoder) {
        String str;
        String str2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.q()) {
            str = c10.s(descriptor2, 0);
            str2 = c10.s(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            String str3 = null;
            while (z10) {
                int e10 = c10.e(descriptor2);
                if (e10 == -1) {
                    z10 = false;
                } else if (e10 == 0) {
                    str = c10.s(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (e10 != 1) {
                        throw new B(e10);
                    }
                    str3 = c10.s(descriptor2, 1);
                    i11 |= 2;
                }
            }
            str2 = str3;
            i10 = i11;
        }
        c10.b(descriptor2);
        return new FieldError(i10, str, str2, null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public void serialize(@NotNull ci.f encoder, @NotNull FieldError value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d c10 = encoder.c(descriptor2);
        FieldError.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // di.N
    @NotNull
    public InterfaceC1901b[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
