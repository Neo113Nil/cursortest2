package com.vk.movika.sdk.base.presenter;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.movika.sdk.base.model.s;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.BaseVideoPlayer;
import xsna.awf;
import xsna.b4;
import xsna.b520;
import xsna.bwt0;
import xsna.c5g;
import xsna.cbd;
import xsna.cn70;
import xsna.cxl;
import xsna.fpf0;
import xsna.fvv0;
import xsna.fzu0;
import xsna.gzs;
import xsna.i5u0;
import xsna.it60;
import xsna.iwl;
import xsna.izs;
import xsna.l6t;
import xsna.mxv;
import xsna.o9t;
import xsna.q0j0;
import xsna.qad;
import xsna.qzv0;
import xsna.r5;
import xsna.r6y;
import xsna.s3p;
import xsna.s3q0;
import xsna.s44;
import xsna.vm30;
import xsna.vt60;
import xsna.vw3;
import xsna.wc60;
import xsna.ws00;
import xsna.xa4;
import xsna.xh60;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj;
                boolean z = ((s) obj2) == null;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fpf0.a(((com.vk.movika.sdk.base.logic.dto.d) it.next()).getClass()));
                }
                break;
            case 1:
                ((r5.a) obj2).e.d((b4) obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.observable.c) obj2).invoke((b520) obj);
                break;
            case 3:
                View view = (View) obj2;
                AnimStartSearchView animStartSearchView = (AnimStartSearchView) obj;
                float f = AnimStartSearchView.t;
                if (view != null) {
                    bwt0.p0(view, false);
                }
                animStartSearchView.c();
                animStartSearchView.m = null;
                break;
            case 4:
                ((izs) obj2).invoke(new q0j0.a.d(((s44) obj).a));
                break;
            case 5:
                break;
            case 6:
                vw3 vw3Var = BaseVideoPlayer.H;
                break;
            case 7:
                qad qadVar = (qad) obj;
                izs<MarketProductTileConfig, s3q0> izsVar = ((cbd) obj2).m;
                if (izsVar != null) {
                    izsVar.invoke(qadVar.b);
                }
                break;
            case 8:
                break;
            case 9:
                ((izs) obj2).invoke(new cxl.e(iwl.b((DeliveryPoint) ((i5u0) obj).a)));
                break;
            case 10:
                VideoFile videoFile = (VideoFile) obj;
                qzv0 qzv0Var = ((com.vk.catalog.mvi.block.video.impl.p002short.draft.d) obj2).d;
                if (qzv0Var != null) {
                    qzv0.a(qzv0Var, videoFile, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.DELETE_DRAFT);
                }
                break;
            case 11:
                ((ImageView) obj2).setTranslationY(((-((s3p) obj).b.getHeight()) - (r5.getHeight() / 2.0f)) - cn70.b(8));
                break;
            case 12:
                ((izs) obj2).invoke(new o9t.b((l6t) obj));
                break;
            case 13:
                r6y r6yVar = (r6y) obj2;
                String str = (String) obj;
                fvv0 M = r6yVar.M();
                if (M != null) {
                    M.k(true);
                }
                WebView r = r6yVar.r();
                if (r != null) {
                    r.loadUrl(str);
                }
                fvv0 M2 = r6yVar.M();
                if (M2 != null) {
                    M2.k(false);
                }
                break;
            case 14:
                fzu0.a aVar = (fzu0.a) obj;
                break;
            case 15:
                int i2 = MarketAllReviewsFragment.d0;
                xn50.a.c((MarketAllReviewsFragment) obj2, new a.j.b(((ws00.c) obj).b));
                break;
            case 16:
                ((com.vk.im.ui.components.msg_list.c) obj2).o.d.K((List) obj);
                break;
            case 17:
                ((gzs) obj2).invoke();
                ((vm30) obj).W = false;
                break;
            case 18:
                break;
            case 19:
                vt60 vt60Var = (vt60) obj2;
                xh60.b.c cVar = (xh60.b.c) obj;
                it60 it60Var = (it60) vt60Var.e.getValue();
                ?? r1 = vt60Var.c.a;
                it60Var.getClass();
                ((wc60) r1.getValue()).n = cVar.a;
                ((wc60) r1.getValue()).o = cVar.b;
                break;
            case 20:
                break;
            case 21:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C(a.f.a((a.f) obj));
                break;
            case 22:
                awf awfVar = (awf) obj2;
                float f2 = awfVar.b;
                float floatValue = Float.valueOf(f2).floatValue();
                float f3 = awfVar.c;
                break;
            case 23:
                ((izs) obj2).invoke((VideoAlbumActionItem) obj);
                break;
            case 24:
                ((izs) obj2).invoke(new VideoLargeListTabletView.c.C0469c(((VideoLargeListTabletView.d) obj).b));
                break;
            default:
                ((mxv) obj2).b().m(xa4.L((Context) obj), true, false);
                break;
        }
        return s3q0.a;
    }
}
