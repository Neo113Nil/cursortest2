package com.vk.music.fragment.impl;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;
import kotlin.Pair;
import xsna.fdi;
import xsna.lbs;
import xsna.mzp0;
import xsna.o5a;
import xsna.oz50;
import xsna.qhh0;
import xsna.rda;
import xsna.rzp0;

/* compiled from: MusicDownloadsHistoryCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class MusicDownloadsHistoryCatalogFragment extends BaseCatalogFragment implements qhh0 {
    public final fdi Q;

    /* compiled from: MusicDownloadsHistoryCatalogFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MusicDownloadsHistoryCatalogFragment.class, null, null);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_CATALOG, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }

        public final void y(String str) {
            if (str == null) {
                return;
            }
            this.j.putString("key_url", str);
        }
    }

    public MusicDownloadsHistoryCatalogFragment() {
        super(MusicDownloadsHistoryCatalogRootVh.class, false);
        this.Q = new fdi();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean l = lbs.l(this);
        this.Q.getClass();
        fdi.k(bundle, l);
        return new MusicDownloadsHistoryCatalogRootVh(getArguments(), kn(), new o5a(this));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean valueOf = Boolean.valueOf(lbs.l(this));
        lbs.m(this);
        fdi.I(this.Q, bundle, valueOf, Boolean.FALSE, 8);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        CatalogVh catalogVh = this.P;
        rda rdaVar = catalogVh instanceof rda ? (rda) catalogVh : null;
        if (rdaVar == null) {
            return false;
        }
        rdaVar.s();
        return true;
    }
}
