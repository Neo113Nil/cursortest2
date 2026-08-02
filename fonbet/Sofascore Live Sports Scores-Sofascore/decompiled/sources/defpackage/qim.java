package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qim {
    public final String a;
    public final BlazeDataSourceType b;
    public final boolean c;
    public final Function1 d;

    public qim(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull Function1<? super BlazeResult<Unit>, Unit> function1) {
        str.getClass();
        blazeDataSourceType.getClass();
        function1.getClass();
        this.a = str;
        this.b = blazeDataSourceType;
        this.c = z;
        this.d = function1;
    }

    public static qim copy$default(qim qimVar, String str, BlazeDataSourceType blazeDataSourceType, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qimVar.a;
        }
        if ((i & 2) != 0) {
            blazeDataSourceType = qimVar.b;
        }
        if ((i & 4) != 0) {
            z = qimVar.c;
        }
        if ((i & 8) != 0) {
            function1 = qimVar.d;
        }
        qimVar.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        function1.getClass();
        return new qim(str, blazeDataSourceType, z, function1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qim)) {
            return false;
        }
        qim qimVar = (qim) obj;
        return Intrinsics.c(this.a, qimVar.a) && Intrinsics.c(this.b, qimVar.b) && this.c == qimVar.c && Intrinsics.c(this.d, qimVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + u0a.t((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c);
    }

    public final String toString() {
        return "GetNewAppendMomentsEvent(sourceId=" + this.a + ", dataSourceType=" + this.b + ", shouldOrderContentByReadStatus=" + this.c + ", completion=" + this.d + ')';
    }
}
