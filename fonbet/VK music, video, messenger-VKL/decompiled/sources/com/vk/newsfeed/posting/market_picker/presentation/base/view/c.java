package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.graphics.drawable.Animatable;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.h;
import xsna.hc3;
import xsna.lqj;
import xsna.mjw;

/* compiled from: ImageViewerPage.kt */
/* loaded from: classes4.dex */
public final class c extends lqj {
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    @Override // xsna.lqj, xsna.kqj
    public final void b(String str, Throwable th) {
        d dVar = this.b;
        dVar.h = 2;
        dVar.l.setVisibility(0);
        dVar.k.setVisibility(8);
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        d dVar = this.b;
        h.b bVar = dVar.d;
        int i = dVar.b;
        h hVar = h.this;
        hVar.j.put(i, true);
        hVar.b(i);
        dVar.h = 1;
        dVar.k.setVisibility(0);
        dVar.l.setVisibility(8);
        hc3 hc3Var = new hc3(7, mjwVar, dVar);
        dVar.i = hc3Var;
        dVar.a.post(hc3Var);
    }
}
