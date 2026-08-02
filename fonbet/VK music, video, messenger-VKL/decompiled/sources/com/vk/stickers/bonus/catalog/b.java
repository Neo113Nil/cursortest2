package com.vk.stickers.bonus.catalog;

import android.view.ViewGroup;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import xsna.bug0;
import xsna.ci7;
import xsna.ea;
import xsna.el6;
import xsna.ik7;
import xsna.izs;
import xsna.rsg0;
import xsna.s3q0;
import xsna.t6;
import xsna.tfx;
import xsna.uga0;
import xsna.v8l0;
import xsna.yfb;
import xsna.yu50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ BonusCatalogFragment c;

    public /* synthetic */ b(BonusCatalogFragment bonusCatalogFragment, int i) {
        this.b = i;
        this.c = bonusCatalogFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                BonusCatalogFragment bonusCatalogFragment = this.c;
                StickersBonusReward stickersBonusReward = bonusCatalogFragment.c0;
                if (stickersBonusReward != null) {
                    v8l0 eo = bonusCatalogFragment.eo();
                    String str = stickersBonusReward.b;
                    eo.a.getClass();
                    tfx tfxVar = new tfx("store.orderStickersBonusReward", new uga0(3), new yu50(9));
                    tfx.o(tfxVar, "reward_id", str, 0, 0, 12);
                    bug0.d(rsg0.y0(yfb.x(tfxVar), null, null, 3), bonusCatalogFragment.requireContext(), null, 6).subscribe(new ea(new t6(bonusCatalogFragment, 10), 6), new el6(new ci7(1), 3));
                }
                bonusCatalogFragment.io();
                return s3q0.a;
            default:
                return new ik7((ViewGroup) obj, this.c);
        }
    }
}
