package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.base.ui.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.b7q;
import xsna.izi0;
import xsna.j5g;
import xsna.mj80;

/* loaded from: classes3.dex */
public final class c extends y {
    public com.vk.movika.sdk.base.asset.b y;
    public com.vk.movika.sdk.common.a z;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Collection] */
    public final void B(com.vk.movika.sdk.base.asset.b bVar, com.vk.movika.sdk.base.c cVar, com.vk.movika.sdk.base.model.o oVar, String str) {
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
            Objects.toString(bVar);
        }
        this.m = izi0.k(this.m, this);
        this.y = bVar;
        com.vk.movika.sdk.common.a aVar = this.z;
        if (aVar != null) {
            aVar.cancel();
        }
        Iterator<com.vk.movika.sdk.common.b<?>> it = this.d.b.iterator();
        while (it.hasNext()) {
            it.next().z();
        }
        b bVar2 = new b(this, bVar, cVar, oVar, str);
        EmptyList emptyList = EmptyList.b;
        this.g = emptyList;
        this.p = y.d.a(this.p, null, true, null, null, 55);
        this.i = null;
        this.g = j5g.v0(new f(this, 0), this.g);
        this.k = emptyList;
        new ArrayList();
        v0 v0Var = this.r;
        u(v0Var.b.q);
        d dVar = this.x;
        if (dVar == null && com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
        }
        if (dVar != null) {
            dVar.i(new d.a.f(0));
        }
        this.n = null;
        com.vk.movika.sdk.base.flow.binding.g gVar = new com.vk.movika.sdk.base.flow.binding.g(1, this, bVar2);
        HashMap hashMap = v0Var.f;
        com.vk.movika.sdk.player.base.components.a aVar2 = v0Var.d;
        hashMap.clear();
        aVar2.b.t();
        mj80 mj80Var = aVar2.c;
        b7q g0 = mj80Var.c.g0();
        if (g0 == null || g0.a.size() == 0) {
            gVar.invoke();
        } else {
            g0.b(new p(14, gVar, mj80Var));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        this.m = izi0.f(this.m, this);
        com.vk.movika.sdk.common.a aVar = this.z;
        if (aVar != null) {
            aVar.cancel();
        }
        this.z = null;
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
        }
        this.p = y.d.a(this.p, null, false, null, null, 53);
        v0 v0Var = this.r;
        w(new c.o(v0Var.o(v0Var.d.a.q())), false);
        Iterator<com.vk.movika.sdk.common.c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.n = null;
        EmptyList emptyList = EmptyList.b;
        this.l = emptyList;
        this.g = emptyList;
    }
}
