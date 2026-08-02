package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h9m {
    public final BlazeDataSourceType a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public h9m(@NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        blazeDataSourceType.getClass();
        str.getClass();
        this.a = blazeDataSourceType;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public static h9m copy$default(h9m h9mVar, BlazeDataSourceType blazeDataSourceType, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDataSourceType = h9mVar.a;
        }
        if ((i & 2) != 0) {
            z = h9mVar.b;
        }
        if ((i & 4) != 0) {
            str = h9mVar.c;
        }
        if ((i & 8) != 0) {
            str2 = h9mVar.d;
        }
        if ((i & 16) != 0) {
            str3 = h9mVar.e;
        }
        String str4 = str3;
        h9mVar.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        String str5 = str;
        return new h9m(blazeDataSourceType, z, str5, str2, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9m)) {
            return false;
        }
        h9m h9mVar = (h9m) obj;
        return Intrinsics.c(this.a, h9mVar.a) && this.b == h9mVar.b && Intrinsics.c(this.c, h9mVar.c) && Intrinsics.c(this.d, h9mVar.d) && Intrinsics.c(this.e, h9mVar.e);
    }

    public final int hashCode() {
        int k = o6a.k(this.c, u0a.t(this.a.hashCode() * 31, this.b));
        String str = this.d;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MomentsInfo(dataSource=");
        sb.append(this.a);
        sb.append(", shouldOrderContentByReadStatus=");
        sb.append(this.b);
        sb.append(", broadcasterId=");
        sb.append(this.c);
        sb.append(", clientSourceId=");
        sb.append(this.d);
        sb.append(", entryContentId=");
        return lnb.q(sb, this.e, ')');
    }
}
