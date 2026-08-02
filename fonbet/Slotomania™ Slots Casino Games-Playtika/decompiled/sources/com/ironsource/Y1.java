package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Y1 implements Z1 {
    private final C2543m9 a;
    private final com.ironsource.mediationsdk.d b;
    private final C2429g2 c;

    public Y1(C2543m9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, C2429g2 c2429g2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.a = instanceInfo;
        this.b = auctionDataUtils;
        this.c = c2429g2;
    }

    @Override // com.ironsource.Z1
    public void a(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C2429g2 c2429g2 = this.c;
        if (c2429g2 == null || (emptyList = c2429g2.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void b(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C2429g2 c2429g2 = this.c;
        if (c2429g2 == null || (emptyList = c2429g2.a()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    @Override // com.ironsource.Z1
    public void c(String methodName) {
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C2429g2 c2429g2 = this.c;
        if (c2429g2 == null || (emptyList = c2429g2.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        a(emptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }
}
