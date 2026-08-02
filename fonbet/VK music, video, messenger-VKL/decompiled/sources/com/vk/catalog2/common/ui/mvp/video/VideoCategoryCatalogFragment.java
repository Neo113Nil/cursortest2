package com.vk.catalog2.common.ui.mvp.video;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import xsna.o5a;

/* compiled from: VideoCategoryCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryCatalogFragment extends BaseCatalogFragment {

    /* compiled from: VideoCategoryCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public VideoCategoryCatalogFragment() {
        super(VideoCategoryRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        Bundle arguments = getArguments();
        FragmentActivity kn = kn();
        o5a o5aVar = new o5a(this);
        Bundle arguments2 = getArguments();
        boolean z = false;
        if (arguments2 != null && arguments2.getBoolean("reload_on_login")) {
            z = true;
        }
        return new VideoCategoryRootVh(arguments, kn, o5aVar, z);
    }
}
