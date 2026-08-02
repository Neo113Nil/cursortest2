package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c2m {
    public static final a f = new a(null);
    public static final km5 g = km5.a;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c2m(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public static c2m copy$default(c2m c2mVar, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2mVar.a;
        }
        if ((i & 2) != 0) {
            str2 = c2mVar.b;
        }
        if ((i & 4) != 0) {
            str3 = c2mVar.c;
        }
        if ((i & 8) != 0) {
            str4 = c2mVar.d;
        }
        if ((i & 16) != 0) {
            list = c2mVar.e;
        }
        List list2 = list;
        c2mVar.getClass();
        str.getClass();
        str2.getClass();
        String str5 = str3;
        return new c2m(str, str2, str5, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2m)) {
            return false;
        }
        c2m c2mVar = (c2m) obj;
        return Intrinsics.c(this.a, c2mVar.a) && Intrinsics.c(this.b, c2mVar.b) && Intrinsics.c(this.c, c2mVar.c) && Intrinsics.c(this.d, c2mVar.d) && Intrinsics.c(this.e, c2mVar.e);
    }

    public final int hashCode() {
        int k = o6a.k(this.b, this.a.hashCode() * 31);
        String str = this.c;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IgnoredLog(logIdentifier=");
        sb.append(this.a);
        sb.append(", sdkType=");
        sb.append(this.b);
        sb.append(", applyFromVersion=");
        sb.append(this.c);
        sb.append(", applyBelowVersion=");
        sb.append(this.d);
        sb.append(", applySpecificVersions=");
        return fc6.p(sb, this.e, ')');
    }

    public /* synthetic */ c2m(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
