package com.ironsource;

import defpackage.bf3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qc {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    public Qc(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ Qc a(Qc qc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qc.a;
        }
        if ((i & 2) != 0) {
            str2 = qc.b;
        }
        return qc.a(str, str2);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qc)) {
            return false;
        }
        Qc qc = (Qc) obj;
        return Intrinsics.c(this.a, qc.a) && Intrinsics.c(this.b, qc.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return bf3.k("OpenUrl(url=", this.a, ", packageName=", this.b, ")");
    }

    public /* synthetic */ Qc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final Qc a(@NotNull String str, @Nullable String str2) {
        str.getClass();
        return new Qc(str, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
