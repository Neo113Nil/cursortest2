package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import android.os.Bundle;
import android.view.View;
import xsna.acd;
import xsna.ct80;
import xsna.f5z;
import xsna.gm50;
import xsna.kbx;
import xsna.km50;
import xsna.mk50;
import xsna.q130;
import xsna.ug8;
import xsna.vk50;
import xsna.xn50;

/* compiled from: OpinionStickerViewController.kt */
/* loaded from: classes6.dex */
public final class f implements xn50<b, g, a> {
    public final b b;
    public final kbx c;
    public final acd d;
    public final ug8 e;

    public f(b bVar, kbx kbxVar, kbx kbxVar2, acd acdVar, ug8 ug8Var) {
        this.b = bVar;
        this.c = kbxVar;
        this.d = acdVar;
        this.e = ug8Var;
        kbxVar.getLifecycle().addObserver(new ct80(this));
        g gVar = (g) bVar.c.g();
        acdVar.invoke();
        gm50.a.b(this, gVar.a, new q130(this, 10));
        bVar.A();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return mk50.a.a;
    }

    @Override // xsna.xn50
    public final void Jh(g gVar, View view) {
        this.d.invoke();
        gm50.a.b(this, gVar.a, new q130(this, 10));
    }

    @Override // xsna.xn50
    public final /* bridge */ /* synthetic */ void R4(vk50 vk50Var) {
    }

    @Override // xsna.xn50
    public final void e2(a aVar) {
        xn50.a.c(this, aVar);
    }

    @Override // xsna.xn50
    public final b getFeature() {
        return this.b;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }

    @Override // xsna.xn50
    public final b x8(Bundle bundle, km50 km50Var) {
        return this.b;
    }
}
