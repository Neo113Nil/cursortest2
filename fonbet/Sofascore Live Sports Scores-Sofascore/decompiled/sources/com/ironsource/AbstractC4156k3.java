package com.ironsource;

import defpackage.dmi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4156k3 {
    private final int a;

    @NotNull
    private final String b;
    private final boolean c;

    @Nullable
    private final C4095gd d;

    public /* synthetic */ AbstractC4156k3(int i, String str, boolean z, C4095gd c4095gd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c4095gd);
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public final int b() {
        return this.a;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return dmi.q("placement name: ", this.b);
    }

    @Nullable
    public final C4095gd a() {
        return this.d;
    }

    public AbstractC4156k3(int i, @NotNull String str, boolean z, @Nullable C4095gd c4095gd) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = c4095gd;
    }
}
