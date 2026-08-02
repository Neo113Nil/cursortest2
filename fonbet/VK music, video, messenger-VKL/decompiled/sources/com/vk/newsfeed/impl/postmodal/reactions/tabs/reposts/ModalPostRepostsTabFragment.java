package com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts;

import android.os.Bundle;
import com.vk.dto.newsfeed.Counters;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment;
import xsna.cww;
import xsna.d410;
import xsna.gm50;
import xsna.km50;
import xsna.o010;
import xsna.oz50;
import xsna.p010;
import xsna.u130;
import xsna.vk50;

/* compiled from: ModalPostRepostsTabFragment.kt */
/* loaded from: classes4.dex */
public final class ModalPostRepostsTabFragment extends BaseModalPostReactionsTabFragment<b> {
    public static final /* synthetic */ int Y = 0;

    /* compiled from: ModalPostRepostsTabFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment
    public final void go(b bVar) {
        b bVar2 = bVar;
        gm50.a.b(this, bVar2.a, new o010(this, 4));
        gm50.a.b(this, bVar2.b, new cww(this, 10));
        gm50.a.b(this, bVar2.c, new p010(this, 8));
        gm50.a.b(this, bVar2.d, new d410(this, 5));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        Counters counters = arguments != null ? (Counters) arguments.getParcelable("counters") : null;
        Bundle arguments2 = getArguments();
        return new u130(null, new com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a(counters, null, arguments2 != null ? arguments2.getInt("tabs_count") : 0, 2));
    }
}
