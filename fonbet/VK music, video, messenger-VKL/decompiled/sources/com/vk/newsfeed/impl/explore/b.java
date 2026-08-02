package com.vk.newsfeed.impl.explore;

import android.os.Bundle;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.newsfeed.impl.explore.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.j5g;
import xsna.m3n;
import xsna.y8g0;

/* compiled from: ExploreTabsProvider.kt */
/* loaded from: classes4.dex */
public final class b implements a.InterfaceC1379a {
    public final ArrayList<DiscoverCategory> a = new ArrayList<>();

    @Override // com.vk.newsfeed.impl.explore.a.InterfaceC1379a
    public final String a(int i) {
        DiscoverCategory discoverCategory = (DiscoverCategory) j5g.b0(i, this.a);
        if (discoverCategory != null) {
            return discoverCategory.c;
        }
        Object obj = m3n.a;
        return y8g0.e(R.string.newsfeed_for_you_stub);
    }

    public final void b(ArrayList arrayList) {
        ArrayList<DiscoverCategory> arrayList2 = this.a;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // com.vk.newsfeed.impl.explore.a.InterfaceC1379a
    public final void d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(HintCategories.PARAM_NAME) : null;
        if (parcelableArrayList != null) {
            ArrayList<DiscoverCategory> arrayList = this.a;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
    }

    @Override // com.vk.newsfeed.impl.explore.a.InterfaceC1379a
    public final String e(int i) {
        String str;
        DiscoverCategory discoverCategory = (DiscoverCategory) j5g.b0(i, this.a);
        return (discoverCategory == null || (str = discoverCategory.b) == null) ? "" : str;
    }

    @Override // com.vk.newsfeed.impl.explore.a.InterfaceC1379a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(HintCategories.PARAM_NAME, this.a);
        return bundle;
    }
}
