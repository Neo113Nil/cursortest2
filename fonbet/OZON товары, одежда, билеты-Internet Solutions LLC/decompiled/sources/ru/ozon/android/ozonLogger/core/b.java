package ru.ozon.android.ozonLogger.core;

import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<c> f92036a;

    static {
        c[] elements = {c.DEBUG, c.INFO, c.NOTICE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f92036a = C7705l.j0(elements);
    }

    @NotNull
    public static Set a() {
        return f92036a;
    }
}
