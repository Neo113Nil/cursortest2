package com.vk.sharing.core;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.a;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import xsna.gax0;
import xsna.mk5;
import xsna.o25;
import xsna.zmp0;

/* compiled from: WallRepostSettingsPresenter.java */
/* loaded from: classes5.dex */
public final class i extends a {

    @NonNull
    public final gax0 l;

    public i(@NonNull BaseSharingActivity baseSharingActivity) {
        super(baseSharingActivity, null);
        this.l = this.i.getWallPostSettingsView();
        f();
    }

    public final void f() {
        l lVar = this.i;
        lVar.p3();
        lVar.ee();
        lVar.w7();
        lVar.Ye();
        lVar.I1();
        lVar.u0(null, false);
        lVar.setPostForFriendsOnlyHint(false);
        lVar.Gf();
        lVar.u0(this.f.getString(R.string.posting_settings_title, new Object[0]), false);
        lVar.Nj();
        boolean z = o25.a().i().M;
        gax0 gax0Var = this.l;
        gax0Var.b.setButtonEnabled(z);
        gax0Var.c.setButtonEnabled(o25.a().i().N);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        a.InterfaceC1778a interfaceC1778a = this.f;
        h hVar = new h(interfaceC1778a, true);
        gax0 gax0Var = this.l;
        WallRepostSettings wallRepostSettings = new WallRepostSettings(gax0Var.a.a(), gax0Var.b.a(), gax0Var.c.a(), gax0Var.d.a(), gax0Var.e.a());
        hVar.l = wallRepostSettings;
        hVar.i.setPostForFriendsOnlyHint(wallRepostSettings.b);
        interfaceC1778a.f3(hVar);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final boolean w2() {
        return false;
    }

    public i(@NonNull h hVar) {
        super(hVar.f, null);
        ViewGroup viewGroup = (ViewGroup) this.i;
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.excludeTarget(R.id.content_animator, true);
        zmp0.a(viewGroup, mk5Var.excludeTarget(R.id.targets_recycler, true));
        this.l = this.i.getWallPostSettingsView();
        f();
    }
}
