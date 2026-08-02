package com.vk.photos.root.photoflow.presentation;

import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.root.photoflow.presentation.a;
import xsna.er0;
import xsna.s5a0;
import xsna.y7a0;

/* compiled from: PhotoFlowView.kt */
/* loaded from: classes4.dex */
public final class k implements s5a0 {
    public boolean a;
    public final /* synthetic */ j b;

    public k(j jVar) {
        this.b = jVar;
    }

    @Override // xsna.s5a0
    public final boolean a() {
        return this.a;
    }

    @Override // xsna.s5a0
    public final void b(VKImageView vKImageView, Photo photo, er0 er0Var) {
        this.b.c.i(vKImageView, photo, false, er0Var);
    }

    @Override // xsna.s5a0
    public final boolean c(y7a0 y7a0Var, int i) {
        if (this.a) {
            this.b.e.invoke(new a.s.e(y7a0Var, i));
        }
        return this.a;
    }

    @Override // xsna.s5a0
    public final void d(y7a0 y7a0Var) {
        this.b.e.invoke(new a.s.C1505a(y7a0Var));
    }
}
