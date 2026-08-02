package com.vk.movika.sdk.android.defaultplayer.control;

import android.view.View;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import xsna.c1f0;
import xsna.izs;
import xsna.x5n0;
import xsna.yaw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                f fVar = (f) this.c;
                com.vk.movika.sdk.base.model.j jVar = (com.vk.movika.sdk.base.model.j) this.d;
                com.vk.movika.sdk.android.defaultplayer.container.a aVar = fVar.d;
                if (aVar != null) {
                    aVar.b(jVar);
                    break;
                }
                break;
            case 1:
                ((izs) this.c).invoke(((CatalogErrorViewWithImage) this.d).h.getContext());
                break;
            case 2:
                c1f0 c1f0Var = (c1f0) this.c;
                c1f0Var.q.invoke((yaw) this.d);
                break;
            default:
                ((x5n0) this.c).K7(((DonutVideoUiModel.PreviewBadge) this.d).e, DonutVideoClickSource.PAYWALL);
                break;
        }
    }
}
