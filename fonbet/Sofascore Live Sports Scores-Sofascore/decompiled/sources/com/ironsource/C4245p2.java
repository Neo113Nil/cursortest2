package com.ironsource;

import defpackage.lnb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4245p2 {

    @NotNull
    private final String a;
    private final com.ironsource.mediationsdk.d b;

    public C4245p2(@NotNull String str) {
        str.getClass();
        this.a = str;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.a;
    }

    @NotNull
    public final String a() {
        String a = this.b.a(this.a);
        a.getClass();
        return a;
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, String> b = this.b.b(this.a);
        b.getClass();
        return b;
    }

    @NotNull
    public final String d() {
        String c = this.b.c(this.a);
        c.getClass();
        return c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4245p2) && Intrinsics.c(this.a, ((C4245p2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.o("AuctionServerData(serverData=", this.a, ")");
    }

    public static /* synthetic */ C4245p2 a(C4245p2 c4245p2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4245p2.a;
        }
        return c4245p2.a(str);
    }

    @NotNull
    public final C4245p2 a(@NotNull String str) {
        str.getClass();
        return new C4245p2(str);
    }
}
