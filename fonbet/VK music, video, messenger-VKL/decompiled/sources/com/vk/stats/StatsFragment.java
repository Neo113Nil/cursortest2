package com.vk.stats;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.er;
import xsna.jgr0;

/* compiled from: StatsFragment.kt */
/* loaded from: classes5.dex */
public final class StatsFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: StatsFragment.kt */
    public static final class a extends jgr0 {
    }

    /* compiled from: StatsFragment.kt */
    public static final class b {
        public static a a(int i, Long l, String str) {
            int i2 = StatsFragment.a0;
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                l = null;
            }
            int i3 = StatsFragment.a0;
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i4 = VKSuperAppBrowserFragment.Y;
            Uri.Builder appendEncodedPath = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath("stats").appendEncodedPath("");
            if (str != null) {
                appendEncodedPath.appendQueryParameter("from", str);
            }
            a aVar = new a(appendEncodedPath.build().toString(), InternalVkMiniApps.STATS.h().a, StatsFragment.class, false, 20);
            if (l != null) {
                aVar.j.putLong("uid", l.longValue());
            }
            return aVar;
        }
    }
}
