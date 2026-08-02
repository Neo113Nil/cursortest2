package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v4m {
    public final String a;
    public final String b;
    public final String c;
    public final BlazePlayerType d;
    public final List e;

    public v4m(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull BlazePlayerType blazePlayerType, @NotNull List<String> list) {
        str.getClass();
        str3.getClass();
        blazePlayerType.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = blazePlayerType;
        this.e = list;
    }

    public static v4m copy$default(v4m v4mVar, String str, String str2, String str3, BlazePlayerType blazePlayerType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v4mVar.a;
        }
        if ((i & 2) != 0) {
            str2 = v4mVar.b;
        }
        if ((i & 4) != 0) {
            str3 = v4mVar.c;
        }
        if ((i & 8) != 0) {
            blazePlayerType = v4mVar.d;
        }
        if ((i & 16) != 0) {
            list = v4mVar.e;
        }
        List list2 = list;
        v4mVar.getClass();
        str.getClass();
        str3.getClass();
        blazePlayerType.getClass();
        list2.getClass();
        String str4 = str3;
        return new v4m(str, str2, str4, blazePlayerType, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4m)) {
            return false;
        }
        v4m v4mVar = (v4m) obj;
        return Intrinsics.c(this.a, v4mVar.a) && Intrinsics.c(this.b, v4mVar.b) && Intrinsics.c(this.c, v4mVar.c) && this.d == v4mVar.d && Intrinsics.c(this.e, v4mVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + o6a.k(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntryPointInfo(entryId=");
        sb.append(this.a);
        sb.append(", sourceId=");
        sb.append(this.b);
        sb.append(", dataSourceStringRepresentation=");
        sb.append(this.c);
        sb.append(", playerType=");
        sb.append(this.d);
        sb.append(", ids=");
        return fc6.p(sb, this.e, ')');
    }
}
