package defpackage;

import com.google.android.gms.internal.pal.zzyv;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h2p {
    public final Class a;
    public final zzyv b;

    public /* synthetic */ h2p(Class cls, zzyv zzyvVar) {
        this.a = cls;
        this.b = zzyvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h2p)) {
            return false;
        }
        h2p h2pVar = (h2p) obj;
        return h2pVar.a.equals(this.a) && h2pVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return lnb.o(this.a.getSimpleName(), ", object identifier: ", String.valueOf(this.b));
    }
}
