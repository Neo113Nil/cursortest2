package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2625r2 {
    private final String a;
    private final com.ironsource.mediationsdk.d b;

    public C2625r2(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.a = serverData;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.a;
    }

    public final C2625r2 a(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C2625r2(serverData);
    }

    public final Map<String, String> b() {
        Map<String, String> b = this.b.b(this.a);
        Intrinsics.checkNotNullExpressionValue(b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b;
    }

    public final String d() {
        String c = this.b.c(this.a);
        Intrinsics.checkNotNullExpressionValue(c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2625r2) && Intrinsics.areEqual(this.a, ((C2625r2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.a + ")";
    }

    public static /* synthetic */ C2625r2 a(C2625r2 c2625r2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2625r2.a;
        }
        return c2625r2.a(str);
    }

    public final String a() {
        String a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a;
    }
}
