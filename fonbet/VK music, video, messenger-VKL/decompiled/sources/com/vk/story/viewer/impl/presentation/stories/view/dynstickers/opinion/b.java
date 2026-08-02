package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.a;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.bt80;
import xsna.eu3;
import xsna.f4z;
import xsna.f6m0;
import xsna.k8;
import xsna.px30;
import xsna.qjg0;
import xsna.rsg0;
import xsna.wk50;
import xsna.x150;
import xsna.xj50;
import xsna.ypl0;
import xsna.zpl0;

/* compiled from: OpinionStickerFeature.kt */
/* loaded from: classes6.dex */
public final class b extends wk50<g, OpinionStickerState, a, c> {
    public final bt80 f;
    public final f4z g;

    public b(d dVar, bt80 bt80Var) {
        super(a.b.b, dVar);
        this.f = bt80Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(OpinionStickerState opinionStickerState, a aVar) {
        boolean z;
        OpinionStickerState opinionStickerState2 = opinionStickerState;
        a aVar2 = aVar;
        if (aVar2.equals(a.b.b)) {
            T(c.b.b);
            return;
        }
        if (!aVar2.equals(a.c.b)) {
            if (aVar2.equals(a.C1835a.b)) {
                T(c.a.b);
                return;
            } else {
                if (!(aVar2 instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new c.f(((a.d) aVar2).b));
                return;
            }
        }
        bt80 bt80Var = this.f;
        eu3 eu3Var = bt80Var.b;
        String str = opinionStickerState2.c;
        OpinionStickerState.OpinionPrivacy opinionPrivacy = opinionStickerState2.d;
        boolean z2 = true;
        if (opinionPrivacy == OpinionStickerState.OpinionPrivacy.HIDDEN) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        zpl0 zpl0Var = new zpl0(eu3Var.c, z2, opinionPrivacy == OpinionStickerState.OpinionPrivacy.PUBLIC ? z : false, str, eu3Var.d);
        ((io.reactivex.rxjava3.disposables.b) bt80Var.a.b).b(rsg0.y0(new ypl0(zpl0Var), null, null, 3).subscribe(new xj50(new f6m0(new k8(25, this, zpl0Var), 3), 15), new x150(new qjg0(new px30(this, 13), 9), 15)));
        T(c.C1836c.b);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        ((io.reactivex.rxjava3.disposables.b) this.f.a.b).e();
    }
}
