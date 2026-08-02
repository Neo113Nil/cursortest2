package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class J {
    public static final InterfaceC1901b a(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new I(serialName, values);
    }
}
