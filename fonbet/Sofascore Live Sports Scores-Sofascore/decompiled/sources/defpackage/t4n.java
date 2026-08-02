package defpackage;

import java.util.Currency;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t4n extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        String f0 = e7nVar.f0();
        try {
            return Currency.getInstance(f0);
        } catch (IllegalArgumentException e) {
            throw new o9p(16, sep.b((byte) 39, f0, e7nVar, "Failed parsing '", "' as Currency; at path "), e);
        }
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.H(((Currency) obj).getCurrencyCode());
    }
}
