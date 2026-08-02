package com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts;

import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.user.ReactionUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.c230;
import xsna.fh6;
import xsna.n9w;
import xsna.sux;
import xsna.w130;
import xsna.x130;
import xsna.y510;

/* compiled from: ModalPostRepostsTabReducer.kt */
/* loaded from: classes4.dex */
public final class a extends fh6<b> {
    @Override // xsna.dm50
    public final x130 c(x130 x130Var, w130 w130Var) {
        x130 x130Var2 = x130Var;
        w130 w130Var2 = w130Var;
        if (w130Var2 instanceof w130.c) {
            return x130.a(x130Var2, null, 0, false, false, false, ((w130.c) w130Var2).b, 255);
        }
        if (w130Var2 instanceof w130.d) {
            w130.d dVar = (w130.d) w130Var2;
            VKList<ReactionUserProfile> vKList = dVar.b;
            return x130.a(x130Var2, vKList, vKList.i(), dVar.c, false, false, null, 282);
        }
        if (w130Var2 instanceof w130.b) {
            return x130.a(x130Var2, null, 0, false, true, false, null, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);
        }
        if (w130Var2 instanceof w130.a) {
            return x130.a(x130Var2, null, 0, false, false, true, null, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ao50 d() {
        return new b(e(new c230(this, 0)), e(new sux(2)), e(new y510(3)), e(new n9w(5)));
    }

    @Override // xsna.dm50
    public final void h(x130 x130Var, ao50 ao50Var) {
        Counters counters;
        x130 x130Var2 = x130Var;
        b bVar = (b) ao50Var;
        if (x130Var2.h) {
            f(bVar.c, x130Var2);
        }
        if (x130Var2.i) {
            f(bVar.d, x130Var2);
        }
        f((x130Var2.d == 0 && (counters = x130Var2.c) != null && counters.g == 0) ? bVar.b : bVar.a, x130Var2);
    }
}
