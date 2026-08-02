package com.vk.catalog2.feature.music.holders.vkmix.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.j4v0;
import xsna.l4v0;
import xsna.r80;
import xsna.u2b0;
import xsna.yjv0;
import xsna.zaf0;

/* compiled from: MusicInteractiveSingleVkMixVh.kt */
/* loaded from: classes16.dex */
public final class MusicInteractiveSingleVkMixVh extends MusicBaseVkMixInteractiveVh {
    public final yjv0 q;

    public MusicInteractiveSingleVkMixVh(u2b0 u2b0Var, l4v0 l4v0Var, zaf0 zaf0Var, b5a b5aVar) {
        super(u2b0Var, R.layout.catalog_music_vk_mix_interactive_single, zaf0Var, l4v0Var, b5aVar);
        this.q = new yjv0(l4v0Var, this.k);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final j4v0 n() {
        return this.q;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final void o() {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        yjv0 yjv0Var = this.q;
        yjv0Var.getClass();
        yjv0Var.c = (TextView) bwt0.p(viewGroup, R.id.title, null, null, 6);
        yjv0Var.d = (TextView) bwt0.p(viewGroup, R.id.description, null, null, 6);
        yjv0Var.e = (VkButton) bwt0.p(viewGroup, R.id.button_settings, null, null, 6);
        yjv0Var.b.e(viewGroup);
        yjv0Var.f = (MusicRoundPlayView) bwt0.p(viewGroup, R.id.play_view, null, null, 6);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final void p(boolean z) {
        r80 a;
        boolean z2 = false;
        l4v0 l4v0Var = this.i;
        if (l4v0Var != null && (a = l4v0Var.a()) != null && ((String) a.a).length() == 0) {
            z2 = true;
        }
        if (z) {
            t(true);
        }
        s(z2);
    }
}
