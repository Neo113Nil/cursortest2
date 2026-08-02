package com.vk.stickers.roulette;

import androidx.fragment.app.FragmentActivity;
import com.vk.stickers.roulette.StickersRouletteFragment;
import xsna.gz20;

/* compiled from: StickersRouletteFragment.kt */
/* loaded from: classes6.dex */
public final class a implements gz20 {
    public final /* synthetic */ StickersRouletteFragment b;

    public a(StickersRouletteFragment stickersRouletteFragment) {
        this.b = stickersRouletteFragment;
    }

    @Override // xsna.gz20
    public final void onCancel() {
        FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            int i = StickersRouletteFragment.o0;
            StickersRouletteFragment.a.a(activity);
        }
    }
}
