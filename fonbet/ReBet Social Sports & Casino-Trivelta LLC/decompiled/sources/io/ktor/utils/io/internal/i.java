package io.ktor.utils.io.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class i {
    public static final int a(String name, int i10) {
        String str;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            str = System.getProperty("io.ktor.utils.io." + name);
        } catch (SecurityException unused) {
            str = null;
        }
        return (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? i10 : intOrNull.intValue();
    }
}
