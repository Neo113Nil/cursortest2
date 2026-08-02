package com.vk.im.reactions.impl.set_reaction.list;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bwt0;
import xsna.e3m;
import xsna.f1f0;
import xsna.f4m;
import xsna.gzs;
import xsna.izs;
import xsna.m5f0;
import xsna.s3q0;
import xsna.xm6;
import xsna.yaw;

/* compiled from: ReactionListController.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<yaw, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(yaw yawVar) {
        yaw yawVar2 = yawVar;
        ReactionListController reactionListController = (ReactionListController) this.receiver;
        ReactionListController.b bVar = reactionListController.f;
        RecyclerView recyclerView = reactionListController.a;
        ReactionListController.a aVar = reactionListController.g;
        gzs<s3q0> gzsVar = aVar.b;
        Activity activity = null;
        if (yawVar2.a != -1) {
            Activity w = bwt0.w(recyclerView);
            if (w == null) {
                Context context = recyclerView.getContext();
                if (context != null) {
                    activity = e3m.h(context);
                }
            } else {
                activity = w;
            }
            if (activity != null) {
                m5f0 m5f0Var = m5f0.a;
                boolean z = bVar.a;
                xm6 xm6Var = new xm6(10, reactionListController, yawVar2);
                m5f0Var.getClass();
                m5f0.d(activity, z, xm6Var);
            }
        } else if (bVar.g == ReactionListController.StaticSize.AlwaysCollapsed) {
            gzsVar.invoke();
        } else {
            int a = reactionListController.a();
            f4m.n(a, recyclerView);
            f1f0 f1f0Var = reactionListController.k;
            f1f0Var.c.setNestedScrollingEnabled(true);
            f1f0Var.j = null;
            f1f0Var.notifyDataSetChanged();
            gzsVar.invoke();
            aVar.c.invoke(Integer.valueOf(a));
        }
        return s3q0.a;
    }
}
