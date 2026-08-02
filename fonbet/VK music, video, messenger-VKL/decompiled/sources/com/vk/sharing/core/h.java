package com.vk.sharing.core;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.a;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import xsna.gax0;
import xsna.mk5;
import xsna.zmp0;

/* compiled from: WallPostPresenter.java */
/* loaded from: classes5.dex */
public final class h extends a {
    public WallRepostSettings l;

    public h(@NonNull a.InterfaceC1778a interfaceC1778a, boolean z) {
        super(interfaceC1778a, null);
        this.l = WallRepostSettings.g;
        if (z) {
            ViewGroup viewGroup = (ViewGroup) this.i;
            mk5 mk5Var = new mk5();
            mk5Var.e(100L);
            mk5Var.excludeTarget(R.id.content_animator, true);
            zmp0.a(viewGroup, mk5Var.excludeTarget(R.id.targets_recycler, true));
        }
        f();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void E2(boolean z) {
        l lVar = this.i;
        this.f.v3(lVar.getCommentText(), this.l);
        lVar.hide();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        l lVar = this.i;
        lVar.p3();
        lVar.ee();
        lVar.w7();
        lVar.Ye();
        lVar.I1();
        lVar.u0(null, false);
        lVar.setPostForFriendsOnlyHint(false);
        lVar.setFullScreen(false);
        lVar.Dj();
        lVar.u0(this.f.getString(R.string.sharing_title2, new Object[0]), false);
        lVar.Gf();
        lVar.mh(true);
        lVar.il();
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.excludeTarget(R.id.content_animator, true);
        zmp0.a((ViewGroup) lVar, mk5Var.excludeTarget(R.id.targets_recycler, true));
        lVar.V5();
        lVar.xm();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void g2() {
        i iVar = new i(this);
        WallRepostSettings wallRepostSettings = this.l;
        boolean z = wallRepostSettings.b;
        gax0 gax0Var = iVar.l;
        gax0Var.a.setChecked(z);
        gax0Var.b.setChecked(wallRepostSettings.c);
        gax0Var.c.setChecked(wallRepostSettings.d);
        gax0Var.d.setChecked(wallRepostSettings.e);
        gax0Var.e.setChecked(wallRepostSettings.f);
        this.f.f3(iVar);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        a.InterfaceC1778a interfaceC1778a = this.f;
        interfaceC1778a.f3(new b(interfaceC1778a));
    }
}
