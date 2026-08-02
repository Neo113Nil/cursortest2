package com.vk.music.fragment.impl;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.c550;
import xsna.fm20;
import xsna.msy;
import xsna.mzp0;
import xsna.rzp0;

/* compiled from: MusicCatalogShowAllFragment.kt */
/* loaded from: classes3.dex */
public final class MusicCatalogShowAllFragment extends CatalogShowAllFragment {
    public static final /* synthetic */ int R = 0;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new fm20(this, 4));

    /* compiled from: MusicCatalogShowAllFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
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
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        ((c550) this.Q.getValue()).b(false);
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((c550) this.Q.getValue()).b(true);
    }
}
