package com.vk.communities;

import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;

/* compiled from: GroupsRecommendationsFragment.kt */
/* loaded from: classes17.dex */
public final class GroupsRecommendationsFragment extends GroupsSuggestionsFragment {

    /* compiled from: GroupsRecommendationsFragment.kt */
    public static final class a extends GroupsSuggestionsFragment.a {
        public a() {
            super(GroupsRecommendationsFragment.class, null, null);
            String a = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_RECOMMENDED);
            if (a != null) {
                this.j.putString("referrer", a);
            }
        }
    }
}
