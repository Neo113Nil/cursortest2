package com.ironsource;

import defpackage.km5;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W1 implements X1 {

    @NotNull
    private final C4216n9 a;

    @NotNull
    private final com.ironsource.mediationsdk.d b;

    @Nullable
    private final C4048e2 c;

    public W1(@NotNull C4216n9 c4216n9, @NotNull com.ironsource.mediationsdk.d dVar, @Nullable C4048e2 c4048e2) {
        c4216n9.getClass();
        dVar.getClass();
        this.a = c4216n9;
        this.b = dVar;
        this.c = c4048e2;
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }

    @Override // com.ironsource.X1
    public void b(@NotNull String str) {
        List<String> list;
        str.getClass();
        C4048e2 c4048e2 = this.c;
        if (c4048e2 == null || (list = c4048e2.a()) == null) {
            list = km5.a;
        }
        a(list, str);
    }

    @Override // com.ironsource.X1
    public void c(@NotNull String str) {
        List<String> list;
        str.getClass();
        C4048e2 c4048e2 = this.c;
        if (c4048e2 == null || (list = c4048e2.c()) == null) {
            list = km5.a;
        }
        a(list, str);
    }

    @Override // com.ironsource.X1
    public void a(@NotNull String str) {
        List<String> list;
        str.getClass();
        C4048e2 c4048e2 = this.c;
        if (c4048e2 == null || (list = c4048e2.b()) == null) {
            list = km5.a;
        }
        a(list, str);
    }
}
