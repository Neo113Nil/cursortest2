package com.detmir.recycli.adapters;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static ArrayList f57719a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f57720b = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f57721c = true;

    @NotNull
    public static List a() {
        return f57719a;
    }

    public static boolean b() {
        return f57720b;
    }

    public static boolean c() {
        return f57721c;
    }

    public static void d(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        f57719a = arrayList;
    }
}
