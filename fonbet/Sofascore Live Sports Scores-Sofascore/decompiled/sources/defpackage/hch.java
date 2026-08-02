package defpackage;

import com.sofascore.model.mvvm.model.IShareContent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hch implements ich {
    public final IShareContent a;
    public final tsi b;
    public final String c;

    public hch(IShareContent iShareContent, tsi tsiVar, String str) {
        iShareContent.getClass();
        tsiVar.getClass();
        this.a = iShareContent;
        this.b = tsiVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hch)) {
            return false;
        }
        hch hchVar = (hch) obj;
        return Intrinsics.c(this.a, hchVar.a) && Intrinsics.c(this.b, hchVar.b) && Intrinsics.c(this.c, hchVar.c);
    }

    @Override // defpackage.ich
    public final IShareContent getData() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Standings(data=");
        sb.append(this.a);
        sb.append(", activeTableType=");
        sb.append(this.b);
        sb.append(", year=");
        return mz1.o(sb, this.c, ")");
    }
}
