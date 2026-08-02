package com.vk.music.fragment.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.navigation.VkMusicNavigationTab;
import com.vk.toggle.features.MusicFeatures;
import java.util.UUID;
import kotlin.Pair;
import xsna.drm0;
import xsna.mzp0;
import xsna.rzp0;
import xsna.xk40;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: BaseMusicFragmentNavigatorBuilder.kt */
/* loaded from: classes3.dex */
public abstract class a extends BaseCatalogFragment.b implements xk40.a {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (xsna.drm0.D(r0, "audios" + xsna.o25.a().c().b, false) == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("key_url");
        String str = null;
        if (string != null) {
            Uri parse = Uri.parse(string);
            boolean h = MusicFeatures.CATALOG_GENERAL_SECTION_CACHE.h();
            String queryParameter = parse.getQueryParameter("section");
            boolean z = true;
            boolean z2 = !h && (queryParameter == null || queryParameter.equals(VkMusicNavigationTab.GENERAL.i()));
            String path = parse.getPath();
            if (path != null) {
            }
            z = false;
            if (z2 && z) {
                str = VkMusicNavigationTab.GENERAL.i();
            }
        }
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        Pair c = rzp0.c(UiMeasuringScreen.MUSIC_CATALOG, str, false, 60);
        UUID uuid = (UUID) c.d();
        ((mzp0) c.g()).init();
        rzp0.f(bundle, uuid);
        zrd0 zrd0Var = zrd0.a;
        Pair a = zrd0.a(PerformanceScoreProduct.MUSIC_CATALOG);
        UUID uuid2 = (UUID) a.d();
        ((yw90) a.g()).init();
        zrd0.d(bundle, uuid2);
    }

    public final void B(Context context) {
        String string;
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d() || (((string = this.j.getString("key_url")) != null && drm0.D(string, "podcasts_subscriptions", false)) || (string != null && drm0.D(string, "audiobooks_favorites", false)))) {
            k(context);
            return;
        }
        MusicOfflineCatalogFragment.a aVar = new MusicOfflineCatalogFragment.a();
        aVar.j.putBoolean("key_include_offline_mode", true);
        aVar.k(context);
    }

    public final a C(UserId userId) {
        this.j.putParcelable("owner_id", userId);
        return this;
    }

    public final a E(String str) {
        if (str != null) {
            this.j.putString("ref", str);
        }
        return this;
    }

    public final a F(String str) {
        if (str != null) {
            this.j.putString("query", str);
        }
        return this;
    }

    @Override // xsna.xk40.a
    public final a b(String str, boolean z) {
        if (str == null) {
            return this;
        }
        Bundle bundle = this.j;
        bundle.putString("key_url", str);
        bundle.putBoolean("is_single_section", z);
        return this;
    }

    @Override // xsna.oz50
    public final void r(Intent intent) {
        D(intent.getBundleExtra("args"));
    }
}
