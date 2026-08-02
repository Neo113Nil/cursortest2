package com.vk.music.fragment.impl;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.UUID;
import kotlin.Pair;
import xsna.mzp0;
import xsna.rzp0;

/* compiled from: MusicOfflineShowAllFragment.kt */
/* loaded from: classes3.dex */
public final class MusicOfflineShowAllFragment extends CatalogShowAllFragment {

    /* compiled from: MusicOfflineShowAllFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public UiMeasuringScreen m;

        /* compiled from: MusicOfflineShowAllFragment.kt */
        /* renamed from: com.vk.music.fragment.impl.MusicOfflineShowAllFragment$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1322a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OfflineCatalogCategories.values().length];
                try {
                    iArr[OfflineCatalogCategories.All.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OfflineCatalogCategories.Tracks.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OfflineCatalogCategories.Albums.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OfflineCatalogCategories.Playlists.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
            super(MusicOfflineShowAllFragment.class, null, null);
            this.m = UiMeasuringScreen.MUSIC_OFFLINE_LIBRARY;
        }

        public final void B(String str) {
            this.j.putString("entry_point", str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void C(String str) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            OfflineCatalogCategories.Companion.getClass();
            OfflineCatalogCategories a = OfflineCatalogCategories.c.a(str);
            int i = a == null ? -1 : C1322a.$EnumSwitchMapping$0[a.ordinal()];
            if (i == 1) {
                this.m = UiMeasuringScreen.MUSIC_OFFLINE_LIBRARY;
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY;
            } else if (i == 2) {
                this.m = UiMeasuringScreen.MUSIC_OFFLINE_MY_MUSIC;
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_MY_MUSIC;
            } else if (i == 3 || i == 4) {
                this.m = UiMeasuringScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
            } else {
                UiMeasuringScreen uiMeasuringScreen = UiMeasuringScreen.MUSIC_OFFLINE_LIBRARY;
                this.m = uiMeasuringScreen;
                mobileOfficialAppsCoreNavStat$EventScreen = uiMeasuringScreen;
            }
            Bundle bundle = this.j;
            bundle.putString("section", str);
            bundle.putString("screen_name", mobileOfficialAppsCoreNavStat$EventScreen.name());
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(this.m, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment, com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        Bundle arguments = getArguments();
        String str = null;
        String string = arguments != null ? arguments.getString("screen_name") : null;
        if (string != null && string.length() != 0) {
            str = string;
        }
        if (str == null || (mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.valueOf(str)) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
        super.y(uiTrackingScreen);
    }
}
