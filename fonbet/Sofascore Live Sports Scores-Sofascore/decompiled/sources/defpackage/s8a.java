package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s8a extends ao2 {
    public f8a u;

    @Override // defpackage.ao2
    public final void D(int i, String str) {
        f8a f8aVar = this.u;
        Level L = bo2.L(i);
        if (jo2.c.isLoggable(L)) {
            jo2.a(f8aVar, L, str);
        }
    }

    @Override // defpackage.ao2
    public final void E(String str, int i, Object... objArr) {
        f8a f8aVar = this.u;
        Level L = bo2.L(i);
        if (jo2.c.isLoggable(L)) {
            jo2.a(f8aVar, L, MessageFormat.format(str, objArr));
        }
    }
}
