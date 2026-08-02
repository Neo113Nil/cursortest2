package y9;

import h9.EnumC6876a;
import java.util.Map;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class u implements h9.u {

    /* renamed from: a, reason: collision with root package name */
    private final j f106346a = new j();

    @Override // h9.u
    public final C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map<h9.g, ?> map) {
        if (enumC6876a != EnumC6876a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC6876a)));
        }
        return this.f106346a.a("0".concat(String.valueOf(str)), EnumC6876a.EAN_13, i11, i12, map);
    }
}
