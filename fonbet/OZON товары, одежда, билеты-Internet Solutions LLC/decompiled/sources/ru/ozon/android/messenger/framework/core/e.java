package ru.ozon.android.messenger.framework.core;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f87136a;

    public static void a(@NotNull d references) {
        Intrinsics.checkNotNullParameter(references, "references");
        f87136a = references;
    }

    public static void b() {
        f87136a = null;
    }

    public static d c() {
        return f87136a;
    }
}
