package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bus;
import xsna.cks;
import xsna.dos;
import xsna.gko;
import xsna.m3a;
import xsna.ogv0;
import xsna.pgv0;
import xsna.t1h;
import xsna.tlo0;
import xsna.tm1;
import xsna.tq;

/* compiled from: FriendsSubscribersVh.kt */
/* loaded from: classes16.dex */
public final class FriendsSubscribersVh extends BaseFriendsProfileVh {
    public final dos j;

    /* compiled from: FriendsSubscribersVh.kt */
    public static final class a extends BaseFriendsProfileVh.d {
        public final dos e;

        public a(SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar, b5a b5aVar, cks cksVar, dos dosVar) {
            super(m3aVar, b5aVar, cksVar, searchStatInfoProvider);
            this.e = dosVar;
        }
    }

    public FriendsSubscribersVh(a aVar) {
        super(aVar);
        this.j = aVar.e;
    }

    @Override // com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        dos dosVar = this.j;
        if (dosVar != null) {
            dosVar.a(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh
    public final pgv0 a(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile, int i) {
        return i == 1 ? e(pgv0Var, context, uIBlockProfile) : d(pgv0Var, context, uIBlockProfile);
    }

    public final pgv0 d(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile) {
        return pgv0.a(pgv0Var, null, null, bus.a(uIBlockProfile), new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_add_2), new t1h(this, context, uIBlockProfile), null, VkButton.Size.Small, VkButton.Mode.Primary, null, false, false, 924), null, 299);
    }

    public final pgv0 e(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile) {
        tlo0.f h = tq.h(tlo0.Companion, R.string.friends_catalog_add_friend_accepted);
        VkButton.Size size = VkButton.Size.Small;
        VkButton.Mode mode = VkButton.Mode.Primary;
        VkButton.Appearance appearance = VkButton.Appearance.Overlay;
        return pgv0.a(pgv0Var, null, null, bus.a(uIBlockProfile), new ogv0(h, new tm1(this, context, uIBlockProfile, 3), new ogv0.a(new gko(R.drawable.vk_icon_user_check_outline_20)), size, mode, appearance, false, false, 792), null, 299);
    }
}
