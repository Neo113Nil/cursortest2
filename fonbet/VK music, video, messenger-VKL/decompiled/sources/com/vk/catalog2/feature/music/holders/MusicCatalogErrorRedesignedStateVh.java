package com.vk.catalog2.feature.music.holders;

import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.catalog2.feature.music.holders.view.a;
import kotlin.LazyThreadSafetyMode;
import xsna.a040;
import xsna.bwt0;
import xsna.d2;
import xsna.gzs;
import xsna.j03;
import xsna.msy;
import xsna.s3q0;
import xsna.xs6;

/* compiled from: MusicCatalogErrorRedesignedStateVh.kt */
/* loaded from: classes16.dex */
public class MusicCatalogErrorRedesignedStateVh extends ErrorStateWithImageVh {
    public final gzs<s3q0> i;
    public final gzs<s3q0> j;
    public final Object k;
    public final Object l;
    public final Object m;

    public MusicCatalogErrorRedesignedStateVh(CatalogStatesViewHolder catalogStatesViewHolder, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        super(catalogStatesViewHolder, gzsVar);
        this.i = gzsVar2;
        this.j = gzsVar3;
        xs6 xs6Var = new xs6(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, xs6Var);
        this.l = msy.a(lazyThreadSafetyMode, new a040(this, 1));
        this.m = msy.a(lazyThreadSafetyMode, new d2(23));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
        this.j.invoke();
        CatalogErrorViewWithImage catalogErrorViewWithImage = this.h;
        if (catalogErrorViewWithImage == null) {
            catalogErrorViewWithImage = null;
        }
        bwt0.p0(catalogErrorViewWithImage, true);
        if (((Boolean) this.k.getValue()).booleanValue()) {
            j03.a.getClass();
            if (j03.a(17101, th)) {
                CatalogErrorViewWithImage catalogErrorViewWithImage2 = this.h;
                (catalogErrorViewWithImage2 != null ? catalogErrorViewWithImage2 : null).setupErrorView((a.C0522a) this.m.getValue());
                return;
            }
        }
        CatalogErrorViewWithImage catalogErrorViewWithImage3 = this.h;
        (catalogErrorViewWithImage3 != null ? catalogErrorViewWithImage3 : null).setupErrorView((a.b) this.l.getValue());
    }
}
