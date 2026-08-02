package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jzm {
    public final BlazeWidgetLayout a;
    public final BlazeDataSourceType b;

    public jzm(@NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        this.a = blazeWidgetLayout;
        this.b = blazeDataSourceType;
    }

    public static jzm copy$default(jzm jzmVar, BlazeWidgetLayout blazeWidgetLayout, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeWidgetLayout = jzmVar.a;
        }
        if ((i & 2) != 0) {
            blazeDataSourceType = jzmVar.b;
        }
        jzmVar.getClass();
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        return new jzm(blazeWidgetLayout, blazeDataSourceType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzm)) {
            return false;
        }
        jzm jzmVar = (jzm) obj;
        return Intrinsics.c(this.a, jzmVar.a) && Intrinsics.c(this.b, jzmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetResponseData(widgetLayout=" + this.a + ", dataSource=" + this.b + ')';
    }
}
