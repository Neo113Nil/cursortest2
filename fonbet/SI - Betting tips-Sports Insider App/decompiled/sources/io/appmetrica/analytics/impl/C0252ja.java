package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252ja implements Vb {
    @Override // io.appmetrica.analytics.impl.Vb
    @Nullable
    public final Z8 a(@Nullable C0224i7 c0224i7) {
        Z8 z82 = null;
        if ((c0224i7 != null ? c0224i7.f13923b : null) != null && c0224i7.f13924c != null) {
            z82 = new Z8();
            z82.f13273b = c0224i7.f13923b.doubleValue();
            z82.f13272a = c0224i7.f13924c.doubleValue();
            Integer num = c0224i7.f13925d;
            if (num != null) {
                z82.f13278g = num.intValue();
            }
            Integer num2 = c0224i7.f13926e;
            if (num2 != null) {
                z82.f13276e = num2.intValue();
            }
            Integer num3 = c0224i7.f13927f;
            if (num3 != null) {
                z82.f13275d = num3.intValue();
            }
            Integer num4 = c0224i7.f13928g;
            if (num4 != null) {
                z82.f13277f = num4.intValue();
            }
            Long l6 = c0224i7.f13929h;
            if (l6 != null) {
                z82.f13274c = TimeUnit.MILLISECONDS.toSeconds(l6.longValue());
            }
            String str = c0224i7.f13930i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    z82.f13279h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    z82.f13279h = 2;
                }
            }
            String str2 = c0224i7.j;
            if (str2 != null) {
                z82.f13280i = str2;
            }
        }
        return z82;
    }
}
