package com.vk.ecomm.catalog.impl.catalog.base;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import java.util.HashSet;
import xsna.fnj;
import xsna.iah0;
import xsna.vds;
import xsna.yfc;

/* compiled from: ClassifiedsBaseCatalogFragment.kt */
/* loaded from: classes18.dex */
public abstract class ClassifiedsBaseCatalogFragment extends BaseCatalogFragment implements vds {

    /* compiled from: ClassifiedsBaseCatalogFragment.kt */
    public static abstract class a extends BaseCatalogFragment.b {
        public final yfc m;

        public a(Class<? extends BaseCatalogFragment> cls) {
            super(cls, null, null);
            this.m = new yfc(this.j);
        }

        public final void B(int i) {
            this.m.a.putInt("KEY_ALBUM_ID", i);
        }

        public final void C(MarketAnalyticsParams marketAnalyticsParams) {
            this.m.a.putParcelable("KEY_ANALYTICS_PARAMS", marketAnalyticsParams);
        }

        public final void D(String str) {
            this.m.a.putString("KEY_CATALOG_CONTEXT", str);
        }

        public final void E(UserId userId) {
            this.m.a.putParcelable("KEY_OWNER_ID", userId);
        }

        public final void F(String str) {
            this.m.a.putString("KEY_SECTION_ID", str);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return fnj.d(requireContext) ? -1 : 1;
    }
}
