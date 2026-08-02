package com.ironsource;

import defpackage.a70;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.fg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4080fg {
    static /* synthetic */ void a(InterfaceC4080fg interfaceC4080fg, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: postReleaseTask");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC4080fg.a(runnable, j);
    }

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j);
}
