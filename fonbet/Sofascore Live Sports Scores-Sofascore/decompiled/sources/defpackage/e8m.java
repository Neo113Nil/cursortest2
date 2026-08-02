package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e8m {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final vul e;
    public final vul f;
    public final List g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public e8m(boolean z, int i, int i2, int i3, @NotNull vul vulVar, @NotNull vul vulVar2, @NotNull List<c2m> list) {
        vulVar.getClass();
        vulVar2.getClass();
        list.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = vulVar;
        this.f = vulVar2;
        this.g = list;
    }

    public static e8m copy$default(e8m e8mVar, boolean z, int i, int i2, int i3, vul vulVar, vul vulVar2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = e8mVar.a;
        }
        if ((i4 & 2) != 0) {
            i = e8mVar.b;
        }
        if ((i4 & 4) != 0) {
            i2 = e8mVar.c;
        }
        if ((i4 & 8) != 0) {
            i3 = e8mVar.d;
        }
        if ((i4 & 16) != 0) {
            vulVar = e8mVar.e;
        }
        if ((i4 & 32) != 0) {
            vulVar2 = e8mVar.f;
        }
        if ((i4 & 64) != 0) {
            list = e8mVar.g;
        }
        List list2 = list;
        e8mVar.getClass();
        vulVar.getClass();
        vulVar2.getClass();
        list2.getClass();
        vul vulVar3 = vulVar2;
        vul vulVar4 = vulVar;
        int i5 = i2;
        return new e8m(z, i, i5, i3, vulVar4, vulVar3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8m)) {
            return false;
        }
        e8m e8mVar = (e8m) obj;
        return this.a == e8mVar.a && this.b == e8mVar.b && this.c == e8mVar.c && this.d == e8mVar.d && this.e == e8mVar.e && this.f == e8mVar.f && Intrinsics.c(this.g, e8mVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + l4a.e(this.d, l4a.e(this.c, l4a.e(this.b, Boolean.hashCode(this.a) * 31)))) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggerConfigurations(isEnabled=");
        sb.append(this.a);
        sb.append(", loggerBatchIntervalInSeconds=");
        sb.append(this.b);
        sb.append(", loggerMaxAllowedBatchSize=");
        sb.append(this.c);
        sb.append(", loggerMinAllowedBatchSize=");
        sb.append(this.d);
        sb.append(", logLevel=");
        sb.append(this.e);
        sb.append(", immediateLogLevel=");
        sb.append(this.f);
        sb.append(", ignoredLogs=");
        return fc6.p(sb, this.g, ')');
    }
}
