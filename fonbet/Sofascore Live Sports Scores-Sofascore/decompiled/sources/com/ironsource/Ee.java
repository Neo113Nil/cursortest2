package com.ironsource;

import android.content.Context;
import com.ironsource.Te;
import defpackage.a70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Ee {
    static /* synthetic */ void a(Ee ee, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: postOnUIThread");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        ee.a(runnable, j);
    }

    @Nullable
    Te a(@NotNull Context context, @NotNull String str);

    @NotNull
    InterfaceC4339u7 a();

    @NotNull
    String a(@NotNull Context context);

    void a(long j, @NotNull Te.a aVar);

    void a(@NotNull Be be);

    void a(@NotNull D1 d1);

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j);

    void a(@NotNull String str, @NotNull String str2);

    void b();

    void b(@NotNull Runnable runnable);

    boolean b(@NotNull Context context);

    @Nullable
    C3959aa c();

    @NotNull
    String c(@NotNull Context context);

    void c(@NotNull Runnable runnable);

    void d(@NotNull Runnable runnable);

    boolean d();

    void e();

    void f();

    @NotNull
    T9 g();
}
