package com.vk.catalog2.common.ui.mvp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListRootVh;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.UUID;
import kotlin.Pair;
import xsna.drm0;
import xsna.epx;
import xsna.j5g;
import xsna.mzp0;
import xsna.o5a;
import xsna.rzp0;

/* compiled from: CatalogShowAllFragment.kt */
/* loaded from: classes16.dex */
public class CatalogShowAllFragment extends BaseCatalogFragment {

    /* compiled from: CatalogShowAllFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(CatalogShowAllFragment.class, null, null);
        }

        public final void B(CatalogConfiguration catalogConfiguration) {
            this.j.putBundle("catalog_state", catalogConfiguration.r());
        }

        public final void C(String str) {
            this.j.putString("entry_point", str);
        }

        public final void D(String str) {
            if (str == null) {
                return;
            }
            this.j.putString("ref", str);
        }

        public final void E(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        }

        public final void F(String str) {
            this.j.putString("section", str);
        }

        public final void G(String str) {
            this.j.putString("title", str);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.CATALOG, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    /* compiled from: CatalogShowAllFragment.kt */
    public static final class b extends BaseCatalogFragment.a {
        public b() {
            super(CatalogShowAllFragment.class);
        }
    }

    public CatalogShowAllFragment() {
        super(ShowAllListRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        String str;
        Bundle bundle2;
        UUID Y0;
        String string;
        String string2;
        Bundle arguments = getArguments();
        String str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (arguments == null || (str = arguments.getString("entry_point", null)) == null) {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        String str3 = (String) j5g.a0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
        if (str3 == null) {
            str3 = "";
        }
        Class<?> cls = Class.forName(str3);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (bundle2 = arguments2.getBundle("catalog_state")) == null) {
            bundle2 = new Bundle();
        }
        Bundle bundle3 = bundle2;
        Bundle arguments3 = getArguments();
        bundle3.putString("title", arguments3 != null ? arguments3.getString("title") : null);
        bundle3.putString("section", go());
        Bundle arguments4 = getArguments();
        bundle3.putString(TtmlNode.TAG_LAYOUT, arguments4 != null ? arguments4.getString(TtmlNode.TAG_LAYOUT) : null);
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string2 = arguments5.getString("entry_point", null)) != null) {
            str2 = string2;
        }
        bundle3.putString("entry_point", str2);
        Bundle arguments6 = getArguments();
        bundle3.putParcelable("search_stats_logging_info", arguments6 != null ? arguments6.getParcelable("search_stats_logging_info") : null);
        Bundle arguments7 = getArguments();
        bundle3.putString("key_url", arguments7 != null ? arguments7.getString("key_url") : null);
        Bundle arguments8 = getArguments();
        if (arguments8 != null && (string = arguments8.getString("ref")) != null) {
            bundle3.putString("ref", string);
        }
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null && (Y0 = mzp0Var.Y0()) != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            bundle3.putString("com.vk.UI_MEASURING_SESSION_UUID", Y0.toString());
        }
        return new ShowAllListRootVh(cls, bundle3, kn(), new o5a(this), null);
    }

    public final String go() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("section");
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        String go;
        if (epx.f(go(), "synthetic_offline_playlists") || epx.f(go(), "synthetic_offline_albums")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
        }
        if (go() != null) {
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
            String go2 = go();
            if (go2 == null || (go = (String) j5g.a0(drm0.c0(go2, new String[]{"_isKidsContext_"}, 0, 6))) == null) {
                go = go();
            }
            uiTrackingScreen.f = new SchemeStat$EventItem(type, null, null, null, go, null, 46, null);
        }
        super.y(uiTrackingScreen);
    }
}
