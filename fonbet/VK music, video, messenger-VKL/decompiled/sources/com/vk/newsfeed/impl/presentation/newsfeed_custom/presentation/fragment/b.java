package com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment;

import android.os.Bundle;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.j5g;
import xsna.m3n;
import xsna.w1n;
import xsna.y8g0;

/* compiled from: NewsfeedCustomTitleProvider.kt */
/* loaded from: classes4.dex */
public final class b implements a.InterfaceC1401a {
    public final ArrayList<DiscoverCategory> a = new ArrayList<>();

    @Override // com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a.InterfaceC1401a
    public final String a(int i) {
        if (i == 0) {
            w1n.b.getClass();
            return y8g0.e(R.string.home_tabs_feed);
        }
        DiscoverCategory discoverCategory = (DiscoverCategory) j5g.b0(i - 1, this.a);
        if (discoverCategory != null) {
            return discoverCategory.c;
        }
        Object obj = m3n.a;
        return y8g0.e(R.string.newsfeed_for_you_stub);
    }

    @Override // com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a.InterfaceC1401a
    public final void d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(HintCategories.PARAM_NAME) : null;
        if (parcelableArrayList != null) {
            ArrayList<DiscoverCategory> arrayList = this.a;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
    }

    @Override // com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a.InterfaceC1401a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(HintCategories.PARAM_NAME, this.a);
        return bundle;
    }
}
