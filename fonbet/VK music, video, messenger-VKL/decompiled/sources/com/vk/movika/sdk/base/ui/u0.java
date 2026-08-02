package com.vk.movika.sdk.base.ui;

import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import kotlin.Result;
import xsna.b7q;
import xsna.bet;
import xsna.bjc;
import xsna.epx;
import xsna.fw00;
import xsna.gzs;
import xsna.izs;
import xsna.mj80;
import xsna.myc0;
import xsna.n2b0;
import xsna.nda;
import xsna.s3q0;
import xsna.sht0;
import xsna.vua0;
import xsna.xdt;
import xsna.xk80;
import xsna.y6q;
import xsna.yvj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.movika.sdk.player.base.model.a aVar = (com.vk.movika.sdk.player.base.model.a) obj2;
                r rVar = (r) obj;
                mj80 mj80Var = ((v0) obj3).d.c;
                xk80 xk80Var = mj80Var.c;
                n2b0 n2b0Var = mj80Var.n;
                if (epx.f(mj80Var.t, aVar)) {
                    n2b0Var.t(aVar);
                    rVar.invoke();
                    n2b0Var.v(aVar);
                } else {
                    mj80Var.t = aVar;
                    Integer q = vua0.q(xk80Var);
                    b7q g0 = xk80Var.g0();
                    if (g0 != null) {
                        ArrayList arrayList = g0.a;
                        if (arrayList.size() != 0 && q != null) {
                            sht0 x = mj80Var.x(aVar);
                            mj80Var.p.put(x, aVar);
                            int size = arrayList.size() - 1;
                            fw00 fw00Var = new fw00(mj80Var, rVar, aVar, 1);
                            n2b0Var.t(aVar);
                            if (q.intValue() < size) {
                                int intValue = q.intValue() + 1;
                                if (intValue <= arrayList.size() - 1) {
                                    try {
                                        g0.d(intValue, x, fw00Var);
                                        failure = s3q0.a;
                                    } catch (Throwable th) {
                                        failure = new Result.Failure(th);
                                    }
                                    if (Result.a(failure) != null) {
                                        fw00Var.invoke();
                                    }
                                } else {
                                    fw00Var.invoke();
                                }
                            } else {
                                g0.e.addLast(new y6q(g0, arrayList.size(), x, new i(13, fw00Var, g0)));
                                g0.k();
                            }
                        }
                    }
                    n2b0Var.t(aVar);
                    mj80Var.v(aVar, 0L, rVar);
                    n2b0Var.v(aVar);
                }
                break;
            case 1:
                myc0.h((yvj) obj3, null, null, new bet((izs) obj2, (xdt) obj, null), 3);
                break;
            default:
                GenreActionsViewHolder.a aVar2 = (GenreActionsViewHolder.a) obj3;
                GenreActionsViewHolder genreActionsViewHolder = (GenreActionsViewHolder) obj2;
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, aVar2.c.B, null, 46, null), new MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick(MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick.EventType.BLOCK_ITEM_CLICK), 2)).q();
                nda.e(genreActionsViewHolder.c.b.b, ((ComposeView) obj).getContext(), genreActionsViewHolder.b, aVar2.c.B, aVar2.a, null, null, genreActionsViewHolder.d, 112);
                break;
        }
        return s3q0.a;
    }
}
