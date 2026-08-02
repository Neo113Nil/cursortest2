package com.vk.newsfeed.impl.postmodal.reactions.tabs.all;

import android.os.Bundle;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;
import xsna.iie;
import xsna.km50;
import xsna.mi10;
import xsna.msy;
import xsna.oz50;
import xsna.rmg;
import xsna.tvj;
import xsna.u130;
import xsna.vk50;
import xsna.xgv;

/* compiled from: ModalPostAllReactionsFragment.kt */
/* loaded from: classes4.dex */
public final class ModalPostAllReactionsFragment extends BaseModalPostReactionsTabFragment<b> {
    public static final /* synthetic */ int Z = 0;
    public final Object Y = msy.a(LazyThreadSafetyMode.NONE, new tvj(this, 25));

    /* compiled from: ModalPostAllReactionsFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment
    public final void go(b bVar) {
        b bVar2 = bVar;
        gm50.a.b(this, bVar2.a, new iie(this, 27));
        gm50.a.b(this, bVar2.b, new mi10(this, 2));
        gm50.a.b(this, bVar2.d, new rmg(this, 24));
        gm50.a.b(this, bVar2.c, new xgv(this, 13));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new u130(null, new com.vk.newsfeed.impl.postmodal.reactions.tabs.all.a(null, (ReactionMeta) this.Y.getValue(), 0, 5));
    }
}
