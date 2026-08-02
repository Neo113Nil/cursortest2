package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class azl implements hbm {
    public final List a;

    public azl(@NotNull List<? extends hbm> list) {
        list.getClass();
        this.a = list;
    }

    public static azl copy$default(azl azlVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = azlVar.a;
        }
        azlVar.getClass();
        list.getClass();
        return new azl(list);
    }

    @Override // defpackage.hbm
    public final String a() {
        return lnb.q(new StringBuilder("[and,"), CollectionsKt.f0(this.a, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, new pcl(24), 30), ']');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azl) && Intrinsics.c(this.a, ((azl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fc6.p(new StringBuilder("And(items="), this.a, ')');
    }
}
