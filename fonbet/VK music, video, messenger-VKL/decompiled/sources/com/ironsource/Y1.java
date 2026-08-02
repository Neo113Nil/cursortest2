package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class Y1 implements Z1 {
    private final C4457n9 a;
    private final com.ironsource.mediationsdk.d b;
    private final C4325g2 c;

    public Y1(C4457n9 c4457n9, com.ironsource.mediationsdk.d dVar, C4325g2 c4325g2) {
        this.a = c4457n9;
        this.b = dVar;
        this.c = c4325g2;
    }

    @Override // com.ironsource.Z1
    public void a(String str) {
        List<String> list;
        C4325g2 c4325g2 = this.c;
        if (c4325g2 == null || (list = c4325g2.b()) == null) {
            list = EmptyList.b;
        }
        a(list, str);
    }

    @Override // com.ironsource.Z1
    public void b(String str) {
        List<String> list;
        C4325g2 c4325g2 = this.c;
        if (c4325g2 == null || (list = c4325g2.a()) == null) {
            list = EmptyList.b;
        }
        a(list, str);
    }

    @Override // com.ironsource.Z1
    public void c(String str) {
        List<String> list;
        C4325g2 c4325g2 = this.c;
        if (c4325g2 == null || (list = c4325g2.c()) == null) {
            list = EmptyList.b;
        }
        a(list, str);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }
}
