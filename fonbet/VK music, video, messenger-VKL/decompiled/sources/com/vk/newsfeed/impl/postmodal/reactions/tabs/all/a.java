package com.vk.newsfeed.impl.postmodal.reactions.tabs.all;

import com.vk.dto.common.data.VKList;
import com.vk.dto.user.ReactionUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.b4r;
import xsna.fh6;
import xsna.kpr;
import xsna.r820;
import xsna.w130;
import xsna.x130;
import xsna.zsw;

/* compiled from: ModalPostAllReactionsReducer.kt */
/* loaded from: classes4.dex */
public final class a extends fh6<b> {
    @Override // xsna.dm50
    public final x130 c(x130 x130Var, w130 w130Var) {
        x130 x130Var2 = x130Var;
        w130 w130Var2 = w130Var;
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
        if (w130Var2 instanceof w130.c) {
            return x130.a(x130Var2, null, 0, false, false, false, ((w130.c) w130Var2).b, 255);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ao50 d() {
        return new b(e(new r820(this, 2)), e(new kpr(10)), e(new zsw(9)), e(new b4r(15)));
    }

    @Override // xsna.dm50
    public final void h(x130 x130Var, ao50 ao50Var) {
        x130 x130Var2 = x130Var;
        b bVar = (b) ao50Var;
        if (x130Var2.h) {
            f(bVar.d, x130Var2);
            return;
        }
        if (x130Var2.i) {
            f(bVar.c, x130Var2);
        } else if (x130Var2.d != 0) {
            f(bVar.a, x130Var2);
        } else {
            f(bVar.b, x130Var2);
        }
    }
}
