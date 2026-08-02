package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q5m {
    public final oql a;
    public final wul b;
    public final String c;
    public final String d;
    public final List e;

    public q5m(@Nullable oql oqlVar, @Nullable wul wulVar, @NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = oqlVar;
        this.b = wulVar;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    public static q5m copy$default(q5m q5mVar, oql oqlVar, wul wulVar, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            oqlVar = q5mVar.a;
        }
        if ((i & 2) != 0) {
            wulVar = q5mVar.b;
        }
        if ((i & 4) != 0) {
            str = q5mVar.c;
        }
        if ((i & 8) != 0) {
            str2 = q5mVar.d;
        }
        if ((i & 16) != 0) {
            list = q5mVar.e;
        }
        List list2 = list;
        q5mVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        String str3 = str;
        return new q5m(oqlVar, wulVar, str3, str2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5m)) {
            return false;
        }
        q5m q5mVar = (q5m) obj;
        return Intrinsics.c(this.a, q5mVar.a) && Intrinsics.c(this.b, q5mVar.b) && Intrinsics.c(this.c, q5mVar.c) && Intrinsics.c(this.d, q5mVar.d) && Intrinsics.c(this.e, q5mVar.e);
    }

    public final int hashCode() {
        oql oqlVar = this.a;
        int hashCode = (oqlVar == null ? 0 : oqlVar.hashCode()) * 31;
        wul wulVar = this.b;
        return this.e.hashCode() + o6a.k(this.d, o6a.k(this.c, (hashCode + (wulVar != null ? wulVar.hashCode() : 0)) * 31));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalLinksConfiguration(sharingCopy=");
        sb.append(this.a);
        sb.append(", sharingPath=");
        sb.append(this.b);
        sb.append(", shareDomain=");
        sb.append(this.c);
        sb.append(", shareProtocol=");
        sb.append(this.d);
        sb.append(", validProtocols=");
        return fc6.p(sb, this.e, ')');
    }
}
