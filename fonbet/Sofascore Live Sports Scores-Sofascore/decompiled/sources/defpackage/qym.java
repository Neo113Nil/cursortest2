package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qym {
    public final String a;
    public final BlazeDataSourceType b;

    public qym(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
        str.getClass();
        blazeDataSourceType.getClass();
        this.a = str;
        this.b = blazeDataSourceType;
    }

    public static qym copy$default(qym qymVar, String str, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qymVar.a;
        }
        if ((i & 2) != 0) {
            blazeDataSourceType = qymVar.b;
        }
        qymVar.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        return new qym(str, blazeDataSourceType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qym)) {
            return false;
        }
        qym qymVar = (qym) obj;
        return Intrinsics.c(this.a, qymVar.a) && Intrinsics.c(this.b, qymVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetRequestData(widgetRemoteId=" + this.a + ", originalDataSourceType=" + this.b + ')';
    }
}
