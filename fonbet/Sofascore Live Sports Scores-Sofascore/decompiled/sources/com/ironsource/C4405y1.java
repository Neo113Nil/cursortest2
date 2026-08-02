package com.ironsource;

import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4405y1 {

    @NotNull
    private final String a;

    public /* synthetic */ C4405y1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C4405y1 a(C4405y1 c4405y1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4405y1.a;
        }
        return c4405y1.a(str);
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4405y1) && Intrinsics.c(this.a, ((C4405y1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.o("ApplicationAuctionSettings(auctionData=", this.a, ")");
    }

    public C4405y1(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4405y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final C4405y1 a(@NotNull String str) {
        str.getClass();
        return new C4405y1(str);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
