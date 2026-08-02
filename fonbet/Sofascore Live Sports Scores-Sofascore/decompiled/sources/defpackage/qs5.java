package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qs5 {
    public final r9k a;
    public final r9k b;
    public final String c;

    public qs5(r9k r9kVar, r9k r9kVar2, String str) {
        this.a = r9kVar;
        this.b = r9kVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs5)) {
            return false;
        }
        qs5 qs5Var = (qs5) obj;
        return Intrinsics.c(this.a, qs5Var.a) && Intrinsics.c(this.b, qs5Var.b) && Intrinsics.c(this.c, qs5Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventAiInsightsTennisForecastRowData(name=");
        sb.append(this.a);
        sb.append(", forecastValue=");
        sb.append(this.b);
        sb.append(", secondaryValue=");
        return mz1.o(sb, this.c, ")");
    }
}
