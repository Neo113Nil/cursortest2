package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import com.vk.catalog2.common.ui.core.view.CatalogErrorView;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vkontakte.android.R;
import xsna.j03;

/* compiled from: MusicArtistErrorStateVh.kt */
/* loaded from: classes16.dex */
public final class MusicArtistErrorStateVh extends ErrorStateVh {
    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
        CatalogErrorView catalogErrorView = this.d;
        if (catalogErrorView == null) {
            catalogErrorView = null;
        }
        catalogErrorView.setVisibility(0);
        CatalogErrorView catalogErrorView2 = this.d;
        if (catalogErrorView2 == null) {
            catalogErrorView2 = null;
        }
        Context context = catalogErrorView2.getContext();
        j03.a.getClass();
        if (!j03.a(104, th)) {
            CatalogErrorView catalogErrorView3 = this.d;
            (catalogErrorView3 != null ? catalogErrorView3 : null).a(j03.g(context, th, R.string.error), true);
        } else {
            String string = context.getString(R.string.music_artist_not_found);
            CatalogErrorView catalogErrorView4 = this.d;
            (catalogErrorView4 != null ? catalogErrorView4 : null).a(string, false);
        }
    }
}
