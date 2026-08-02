package com.vk.video.ui.discovery.minimizable.preinflate;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryAsyncPrefetch.kt */
/* loaded from: classes7.dex */
public final class DiscoveryAsyncPrefetch {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryAsyncPrefetch[] $VALUES;
    public static final a Companion;
    public static final DiscoveryAsyncPrefetch NONE;
    public static final DiscoveryAsyncPrefetch VIEW;
    public static final DiscoveryAsyncPrefetch VIEW_HOLDER;

    /* compiled from: DiscoveryAsyncPrefetch.kt */
    public static final class a {
    }

    static {
        DiscoveryAsyncPrefetch discoveryAsyncPrefetch = new DiscoveryAsyncPrefetch("NONE", 0);
        NONE = discoveryAsyncPrefetch;
        DiscoveryAsyncPrefetch discoveryAsyncPrefetch2 = new DiscoveryAsyncPrefetch("VIEW", 1);
        VIEW = discoveryAsyncPrefetch2;
        DiscoveryAsyncPrefetch discoveryAsyncPrefetch3 = new DiscoveryAsyncPrefetch("VIEW_HOLDER", 2);
        VIEW_HOLDER = discoveryAsyncPrefetch3;
        DiscoveryAsyncPrefetch[] discoveryAsyncPrefetchArr = {discoveryAsyncPrefetch, discoveryAsyncPrefetch2, discoveryAsyncPrefetch3};
        $VALUES = discoveryAsyncPrefetchArr;
        $ENTRIES = new asp(discoveryAsyncPrefetchArr);
        Companion = new a();
    }

    public DiscoveryAsyncPrefetch() {
        throw null;
    }

    public static DiscoveryAsyncPrefetch valueOf(String str) {
        return (DiscoveryAsyncPrefetch) Enum.valueOf(DiscoveryAsyncPrefetch.class, str);
    }

    public static DiscoveryAsyncPrefetch[] values() {
        return (DiscoveryAsyncPrefetch[]) $VALUES.clone();
    }
}
