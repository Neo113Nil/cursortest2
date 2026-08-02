package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.j5g;
import xsna.xht;

/* compiled from: OpinionStickerReducer.kt */
/* loaded from: classes6.dex */
public final class d extends dm50<g, c, OpinionStickerState> {
    @Override // xsna.dm50
    public final OpinionStickerState c(OpinionStickerState opinionStickerState, c cVar) {
        OpinionStickerState opinionStickerState2 = opinionStickerState;
        c cVar2 = cVar;
        if (cVar2.equals(c.b.b)) {
            return opinionStickerState2;
        }
        if (cVar2.equals(c.C1836c.b)) {
            return OpinionStickerState.a(opinionStickerState2, null, null, true, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        if (cVar2 instanceof c.d) {
            return OpinionStickerState.a(opinionStickerState2, null, null, false, ((c.d) cVar2).b, 103);
        }
        if (cVar2.equals(c.e.b)) {
            return OpinionStickerState.a(opinionStickerState2, null, null, false, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        if (cVar2.equals(c.a.b)) {
            List<OpinionStickerState.OpinionPrivacy> list = opinionStickerState2.h;
            int indexOf = list.indexOf(opinionStickerState2.d);
            return OpinionStickerState.a(opinionStickerState2, null, indexOf == -1 ? (OpinionStickerState.OpinionPrivacy) j5g.Y(list) : list.get((indexOf + 1) % list.size()), false, null, 123);
        }
        if (cVar2 instanceof c.f) {
            return OpinionStickerState.a(opinionStickerState2, ((c.f) cVar2).b, null, false, null, 125);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new xht(17)));
    }

    @Override // xsna.dm50
    public final void h(OpinionStickerState opinionStickerState, g gVar) {
        f(gVar.a, opinionStickerState);
    }
}
