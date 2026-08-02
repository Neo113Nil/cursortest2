package com.ironsource;

import defpackage.zzl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ce {

    @Nullable
    private static Boolean b;

    @NotNull
    public static final Ce a = new Ce();

    @NotNull
    private static Be c = Be.NOT_INIT;

    private Ce() {
    }

    public final synchronized void a(@NotNull Be be) {
        be.getClass();
        c = be;
    }

    @NotNull
    public final Be b() {
        Boolean bool = b;
        if (bool == null ? true : bool.equals(Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            return c;
        }
        zzl.b();
        return null;
    }

    @NotNull
    public final synchronized Be a() {
        return c;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
