package ch;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v {
    public static final t a(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return t.Jvm;
    }

    public static final boolean b(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }

    public static final boolean c(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return true;
    }
}
