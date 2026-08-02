package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nfm {
    public final List a;
    public final n3m b;

    public nfm(@NotNull List<atm> list, @NotNull n3m n3mVar) {
        list.getClass();
        n3mVar.getClass();
        this.a = list;
        this.b = n3mVar;
    }

    public static nfm copy$default(nfm nfmVar, List list, n3m n3mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nfmVar.a;
        }
        if ((i & 2) != 0) {
            n3mVar = nfmVar.b;
        }
        nfmVar.getClass();
        list.getClass();
        n3mVar.getClass();
        return new nfm(list, n3mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm)) {
            return false;
        }
        nfm nfmVar = (nfm) obj;
        return Intrinsics.c(this.a, nfmVar.a) && this.b == nfmVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentModel(renditions=" + this.a + ", mediaType=" + this.b + ')';
    }
}
