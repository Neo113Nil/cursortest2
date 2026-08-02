package com.vk.stickers.bonus.catalog;

import android.content.DialogInterface;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import xsna.bug0;
import xsna.cu3;
import xsna.dbe0;
import xsna.g20;
import xsna.izs;
import xsna.ji3;
import xsna.m4s;
import xsna.np3;
import xsna.qcy;
import xsna.rsg0;
import xsna.tfx;
import xsna.trk0;
import xsna.wh6;
import xsna.xga0;
import xsna.yfb;
import xsna.yt3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj;
                int i3 = BonusCatalogFragment.f0;
                bonusCatalogFragment.eo().a.getClass();
                int i4 = 2;
                bug0.d(rsg0.y0(yfb.x(new tfx("store.disableStickersBonus", new trk0(1), new xga0(i4))), null, null, 3), bonusCatalogFragment.mo2getContext(), null, 6).subscribe(new ji3(new g20(bonusCatalogFragment, 8), 5), new np3(new wh6(i4), 3));
                break;
            case 1:
                yt3 yt3Var = (yt3) obj;
                m4s.z(yt3Var.e, new cu3(yt3Var, null));
                break;
            case 2:
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                ((PublishFragment) obj).fo().b(dbe0.k.b);
                dialogInterface.dismiss();
                break;
            default:
                ((izs) obj).invoke(Boolean.TRUE);
                break;
        }
    }
}
