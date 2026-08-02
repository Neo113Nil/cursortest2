package com.vk.profile.core.scheduled_clips;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import xsna.ao50;
import xsna.c1i;
import xsna.f4z;
import xsna.gm50;
import xsna.km50;
import xsna.l0i;
import xsna.mk50;
import xsna.qb6;
import xsna.vk50;

/* compiled from: BaseCommunityScheduledClipsGridFragment.kt */
/* loaded from: classes5.dex */
public abstract class BaseCommunityScheduledClipsGridFragment extends MviImplFragment<c, c1i, b> {
    public static final /* synthetic */ int S = 0;
    public final String Q = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID);
    public h R;

    @Override // xsna.xn50
    public final mk50 Fl() {
        h hVar = new h(kn(), getViewLifecycleOwner(), go(), new com.vk.im.ui.fragments.b(this, 8));
        this.R = hVar;
        return new mk50.c(hVar.f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        c1i c1iVar = (c1i) ao50Var;
        h hVar = this.R;
        if (hVar != null) {
            gm50.a.b(hVar, c1iVar.a, new com.vk.movika.sdk.base.observable.g(hVar, 27));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        c cVar = (c) vk50Var;
        ((f4z) cVar.g.b).a(new qb6(0, this, cVar), this);
    }

    public abstract l0i fo();

    public abstract UserId go();

    public abstract boolean ho();

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new c(fo().c(), go());
    }
}
