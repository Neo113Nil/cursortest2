package com.vk.catalog2.feature.music.ui.holder;

import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.nda;

/* compiled from: MusicFullscreenPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class MusicFullscreenPlaceholderVh extends PlaceholderVh {
    public MusicFullscreenPlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar, PlaceholderVh.b bVar, int i) {
        super(aVar, false, false, (i & 16) != 0 ? new PlaceholderVh.b(31) : bVar, null, R.layout.catalog_placeholder_match_parent_height, (i & 8) != 0 ? null : ndaVar, 0, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
    }
}
