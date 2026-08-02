package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.player.base.components.b;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.g5g;

/* loaded from: classes3.dex */
public final class j0 implements b.a {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ i0 e;
    public final /* synthetic */ Ref$ObjectRef<b.a> f;
    public final /* synthetic */ q0 g;

    public j0(Ref$BooleanRef ref$BooleanRef, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, i0 i0Var, Ref$ObjectRef ref$ObjectRef, q0 q0Var) {
        this.a = ref$BooleanRef;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = i0Var;
        this.f = ref$ObjectRef;
        this.g = q0Var;
    }

    @Override // com.vk.movika.sdk.player.base.components.b.a
    public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
        if (this.a.element) {
            return;
        }
        this.b.add(aVar);
        c();
    }

    @Override // com.vk.movika.sdk.player.base.components.b.a
    public final void b(com.vk.movika.sdk.player.base.model.a aVar, RuntimeException runtimeException) {
        if (this.a.element) {
            return;
        }
        this.c.add(new Pair(aVar, runtimeException));
        c();
    }

    public final void c() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            this.g.invoke(this.b, this.c);
            return;
        }
        com.vk.movika.sdk.player.base.model.a aVar = (com.vk.movika.sdk.player.base.model.a) g5g.G(arrayList);
        b.a aVar2 = this.f.element;
        this.e.a(aVar, aVar2 == null ? null : aVar2);
    }
}
