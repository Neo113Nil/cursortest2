package com.vk.catalog2.common.ui.holders.header;

import android.view.View;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import xsna.cho;
import xsna.dhr0;
import xsna.tlo0;

/* compiled from: TopBarVh.kt */
/* loaded from: classes16.dex */
public interface TopBarVh extends CatalogViewHolder, dhr0.e, cho, View.OnClickListener {

    /* compiled from: TopBarVh.kt */
    public interface a {
        void B(String str);

        void o(String str);

        void setSearchQuery(String str);
    }

    void R9(a aVar);

    boolean a0();

    void hide();

    void setTitle(tlo0 tlo0Var);

    void show();

    void tc(boolean z);

    default void dm(String str) {
    }
}
