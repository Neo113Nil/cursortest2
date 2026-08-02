package com.vk.movika.tools.controls.seekbar;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a6o0;
import xsna.anx;
import xsna.b6l0;
import xsna.b6o0;
import xsna.cef0;
import xsna.cri;
import xsna.dsq0;
import xsna.dt1;
import xsna.es60;
import xsna.esq0;
import xsna.f64;
import xsna.fck;
import xsna.fgb0;
import xsna.fxq0;
import xsna.fxt0;
import xsna.gmq;
import xsna.gp6;
import xsna.gtq0;
import xsna.gws;
import xsna.h0b;
import xsna.h5x;
import xsna.isq0;
import xsna.k9q0;
import xsna.kef0;
import xsna.lqq0;
import xsna.lv90;
import xsna.lwq0;
import xsna.mtk0;
import xsna.muv0;
import xsna.n34;
import xsna.ne7;
import xsna.nn50;
import xsna.pwo0;
import xsna.q630;
import xsna.qcy;
import xsna.qri;
import xsna.rd80;
import xsna.rui;
import xsna.rwo0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.t8s;
import xsna.txj0;
import xsna.ugl;
import xsna.vpu0;
import xsna.wh50;
import xsna.wk6;
import xsna.wzs;
import xsna.x5o0;
import xsna.y5o0;
import xsna.yzs;
import xsna.zvs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        b6l0.a aVar;
        Object obj3;
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj4;
                ((Float) obj2).floatValue();
                DefaultSeekBarView.a aVar2 = DefaultSeekBarView.Companion;
                defaultSeekBarView.requestLayout();
                defaultSeekBarView.l();
                return Boolean.TRUE;
            case 1:
                wk6 wk6Var = (wk6) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(wk6Var.C)) {
                    wk6Var.N.setActivated(booleanValue);
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                ((CatalogSectionScreenFragment) obj4).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr2 = fck.t1;
                ((fck) obj4).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Boolean) obj).getClass();
                ((ugl) obj4).y(((gmq) obj2).X());
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                t8s.s((fxt0) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                b6l0.a aVar3 = (b6l0.a) obj;
                List list = (List) obj2;
                gws gwsVar = ((zvs) obj4).a;
                ArrayList arrayList = gwsVar.a;
                arrayList.clear();
                arrayList.addAll(list);
                StickerStockItem stickerStockItem = gwsVar.b;
                if (stickerStockItem != null) {
                    ArrayList arrayList2 = new ArrayList(aVar3.b);
                    ArrayList arrayList3 = new ArrayList(aVar3.c);
                    for (StickerItem stickerItem : stickerStockItem.g) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (((StickerItem) obj3).b == stickerItem.b) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        StickerItem stickerItem2 = (StickerItem) obj3;
                        if (stickerItem2 != null) {
                            arrayList2.add(StickerItem.zb(stickerItem2, 0, true, 959));
                            arrayList3.remove(stickerItem2);
                        }
                    }
                    gwsVar.b = null;
                    aVar = new b6l0.a(aVar3.a, arrayList2, arrayList3);
                } else {
                    aVar = aVar3;
                }
                return new b6l0.a(aVar.a, aVar.b, zvs.a(aVar3.c, list, false));
            case 7:
                ((Integer) obj2).getClass();
                ((h5x) obj4).D(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                rd80.c((wh50) obj4, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((lv90) obj4).ko(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((fgb0) obj4).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                kef0 kef0Var = (kef0) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2040083228, intValue, -1, "com.vk.catalog.mvi.block.music.impl.recommended.RecommendedPlaylistCard.<anonymous> (RecommendedPlaylistCard.kt:81)");
                    }
                    q630 H = s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7);
                    a.j g = androidx.compose.foundation.layout.a.g(4);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar4, 6);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c, cri.a.d);
                    cef0.a(kef0Var, aVar4, 0);
                    cef0.f(kef0Var, aVar4, 0);
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 12:
                fxq0 fxq0Var = (fxq0) obj4;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                es60 es60Var = fxq0Var.i;
                final f64 a2 = ruiVar.a(new isq0(fxq0Var, es60Var, nn50Var));
                h0b h0bVar = fxq0Var.g;
                final f64 a3 = ruiVar.a(new x5o0(es60Var, h0bVar, nn50Var));
                final f64 a4 = ruiVar.a(new esq0(es60Var, h0bVar, nn50Var));
                final f64 a5 = ruiVar.a(new gtq0(es60Var, h0bVar, nn50Var));
                final f64 a6 = ruiVar.a(new y5o0(es60Var, h0bVar, nn50Var));
                final f64 a7 = ruiVar.a(new b6o0(es60Var, h0bVar, nn50Var));
                final f64 a8 = ruiVar.a(new dsq0(es60Var, fxq0Var.j, h0bVar, nn50Var));
                final f64 a9 = ruiVar.a(new a6o0(es60Var, h0bVar, nn50Var));
                final f64 a10 = ruiVar.a(new lqq0(es60Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.hwq0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj5, Object obj6) {
                        qk50 qk50Var = (qk50) obj5;
                        lwq0 lwq0Var = (lwq0) obj6;
                        if (lwq0Var instanceof lwq0.c) {
                            return qk50Var.a(f64.this, lwq0Var);
                        }
                        if (lwq0Var instanceof nwq0) {
                            return qk50Var.a(a3, lwq0Var);
                        }
                        if (lwq0Var instanceof pwq0) {
                            return qk50Var.a(a5, lwq0Var);
                        }
                        if (lwq0Var instanceof mwq0) {
                            return qk50Var.a(a4, lwq0Var);
                        }
                        if (lwq0Var instanceof owq0) {
                            return qk50Var.a(a6, lwq0Var);
                        }
                        if (lwq0Var instanceof qwq0) {
                            return qk50Var.a(a7, lwq0Var);
                        }
                        if (lwq0Var instanceof lwq0.a) {
                            return qk50Var.a(a8, lwq0Var);
                        }
                        if (lwq0Var instanceof rwq0) {
                            return qk50Var.a(a9, lwq0Var);
                        }
                        if (lwq0Var instanceof lwq0.b) {
                            return qk50Var.a(a10, lwq0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 13:
                VideoEditTimelineView videoEditTimelineView = (VideoEditTimelineView) obj4;
                pwo0 pwo0Var = (pwo0) obj;
                gp6 gp6Var = (gp6) obj2;
                int i2 = VideoEditTimelineView.H;
                if (pwo0Var == null || gp6Var == null) {
                    rwo0 rwo0Var = videoEditTimelineView.F;
                    if (rwo0Var != null) {
                        rwo0Var.l();
                    }
                } else {
                    rwo0 rwo0Var2 = videoEditTimelineView.F;
                    if (rwo0Var2 != null) {
                        r7 = rwo0Var2.r(gp6Var.D());
                    }
                }
                if (r7) {
                    videoEditTimelineView.j5(pwo0Var, gp6Var);
                }
                return Boolean.valueOf(r7);
            case 14:
                yzs yzsVar = (yzs) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(75177384, intValue2, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkDefaultTabRow.kt:254)");
                    }
                    yzsVar.invoke(vpu0.e(0, aVar6), aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                muv0.a((mtk0) obj4, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ u(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ u(anx anxVar, yzs yzsVar) {
        this.b = 14;
        this.c = yzsVar;
    }
}
