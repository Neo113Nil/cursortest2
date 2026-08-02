package com.ironsource;

import defpackage.a70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4292re {
    static /* synthetic */ void a(InterfaceC4292re interfaceC4292re, C4221ne c4221ne, C4037d9 c4037d9, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: onInitFailed");
            return;
        }
        if ((i & 2) != 0) {
            c4037d9 = null;
        }
        interfaceC4292re.a(c4221ne, c4037d9);
    }

    void a(@NotNull C4185le c4185le);

    void a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9);
}
