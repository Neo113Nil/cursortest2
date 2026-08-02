package Q2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1501l {
    public abstract AbstractC1500k a(String str);

    public final AbstractC1500k b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        AbstractC1500k a10 = a(className);
        return a10 == null ? AbstractC1502m.a(className) : a10;
    }
}
