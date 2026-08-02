package com.ironsource;

import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yf {

    @Nullable
    private String a;

    public /* synthetic */ Yf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Yf a(Yf yf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yf.a;
        }
        return yf.a(str);
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Yf) && Intrinsics.c(this.a, ((Yf) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.o("TestSuiteSettings(controllerUrl=", this.a, ")");
    }

    public final void b(@Nullable String str) {
        this.a = str;
    }

    public Yf(@Nullable String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Yf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Yf a(@Nullable String str) {
        return new Yf(str);
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
