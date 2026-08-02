package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import io.reactivex.rxjava3.internal.operators.completable.p;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.fbj0;
import xsna.gij;
import xsna.max0;
import xsna.qcw;
import xsna.rsg0;
import xsna.tfx;
import xsna.tts;
import xsna.x6t0;
import xsna.yfb;

/* compiled from: PostingOwnershipSyncManager.kt */
/* loaded from: classes4.dex */
public final class c {
    public final Set<PostingCreationEntryPoint> a;
    public final max0 b;

    public c(Set set, max0 max0Var) {
        this.a = set;
        this.b = max0Var;
    }

    public final void a(gij gijVar) {
        if (this.a.contains(gijVar.b)) {
            if (gijVar instanceof gij.b) {
                b(((gij.b) gijVar).a);
                return;
            }
            if (gijVar instanceof gij.c) {
                b(((gij.c) gijVar).a);
            } else if (gijVar instanceof gij.a) {
                b(((gij.a) gijVar).a);
            } else {
                if (!(gijVar instanceof gij.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                b(((gij.d) gijVar).a);
            }
        }
    }

    public final void b(UserId userId) {
        this.b.getClass();
        tfx tfxVar = new tfx("wall.setLastPostingInfo", new fbj0(11), new x6t0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        new v(new p(rsg0.D0(yfb.x(tfxVar))), io.reactivex.rxjava3.internal.functions.a.g).i(new tts(new qcw(17), 21)).subscribe();
    }
}
