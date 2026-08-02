package com.vk.photo.editor.features.colorgrading;

import com.vk.photo.editor.features.colorgrading.g;
import com.vk.photo.editor.ivm.EditorMessage;
import xsna.an10;
import xsna.k9x;
import xsna.lb80;
import xsna.sa30;
import xsna.v3p;

/* compiled from: Hsl1ViewController.kt */
/* loaded from: classes4.dex */
public final class e implements lb80 {
    public final /* synthetic */ g b;

    public e(g gVar) {
        this.b = gVar;
    }

    @Override // xsna.lb80
    public final void b() {
        this.b.a();
    }

    @Override // xsna.lb80
    public final void c(float f) {
        g.a aVar;
        g gVar = this.b;
        v3p v3pVar = gVar.a;
        a b = g.b(v3pVar.d());
        if (b == null || (aVar = gVar.f) == null) {
            return;
        }
        float f2 = ((f / 100.0f) * 2.0f) - 1.0f;
        gVar.i.setText(String.valueOf(an10.b(sa30.E(f2, new k9x(-1, 1, 1), new k9x(-50, 50, 1)))));
        v3pVar.d().a(new EditorMessage.i(aVar.f.invoke(b, Float.valueOf(f2)), EditorMessage.Source.UserInput, 4));
    }

    @Override // xsna.lb80
    public final void g() {
        this.b.a();
    }
}
