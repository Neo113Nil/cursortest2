package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xi extends Rg {
    public Xi(@NotNull X4 x42) {
        super(x42);
        x42.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NotNull P5 p52) {
        Object remove;
        for (Map.Entry entry : p52.f12741p.entrySet()) {
            Jk jk = this.f12818a.f13160u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                jk.getClass();
                if (bArr.length != 0) {
                    remove = jk.f12445b.put(str, bArr);
                    Nk nk = jk.f12444a;
                    nk.f12660d.insert(nk.f12657a, nk.f12659c.toByteArray((Mk) nk.f12658b.fromModel(jk.f12445b)));
                }
            }
            remove = jk.f12445b.remove(str);
            Nk nk2 = jk.f12444a;
            nk2.f12660d.insert(nk2.f12657a, nk2.f12659c.toByteArray((Mk) nk2.f12658b.fromModel(jk.f12445b)));
        }
        return true;
    }
}
