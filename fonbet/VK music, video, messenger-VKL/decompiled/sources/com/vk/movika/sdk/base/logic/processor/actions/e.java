package com.vk.movika.sdk.base.logic.processor.actions;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.vk.catalog2.common.ui.holders.ShimmerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.a;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.video.profile.presentation.h;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.permissions.PictureInPicturePermissionFragment;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import xsna.a5m0;
import xsna.aiq0;
import xsna.bpn0;
import xsna.c7r0;
import xsna.d3h;
import xsna.d5;
import xsna.dn30;
import xsna.dqj;
import xsna.ds60;
import xsna.e43;
import xsna.e8f0;
import xsna.egm;
import xsna.etv0;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fzk0;
import xsna.gs60;
import xsna.gv2;
import xsna.gzs;
import xsna.heq;
import xsna.hgm;
import xsna.hoa;
import xsna.hsg;
import xsna.izs;
import xsna.ksg;
import xsna.m4b0;
import xsna.mq9;
import xsna.myc0;
import xsna.n9v0;
import xsna.nek0;
import xsna.omw;
import xsna.pc1;
import xsna.q700;
import xsna.rg50;
import xsna.rhw0;
import xsna.s3q0;
import xsna.shw0;
import xsna.u0;
import xsna.u0x;
import xsna.u66;
import xsna.u800;
import xsna.umu;
import xsna.vm30;
import xsna.vmu;
import xsna.wh50;
import xsna.xn50;
import xsna.y57;
import xsna.yg5;
import xsna.yvj;
import xsna.zj20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 showStarted$lambda$6;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return y57.a("Wrong action type! Expected ", ((j) obj2).a.l(), ", actual ", fpf0.a(((com.vk.movika.sdk.base.model.actions.a) obj).getClass()).l());
            case 1:
                ((izs) obj2).invoke(u0.f.b);
                ((wh50) obj).setValue(Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                return s3q0.a;
            case 2:
                rg50 rg50Var = (rg50) obj;
                ((izs) obj2).invoke(new a.f());
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(((BookingButton) obj).a);
                return s3q0.a;
            case 4:
                ((hoa) obj2).c.invoke();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 5:
                ((hsg) obj2).invoke((ksg.a) obj);
                return s3q0.a;
            case 6:
                ((d3h) obj2).h((String) obj, false);
                return s3q0.a;
            case 7:
                hgm hgmVar = (hgm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_clock_outline_12), Integer.valueOf(R.attr.vk_ui_icon_tertiary));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar = hgmVar.m;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                viewGroup.addView(vkImageSimple);
                return vkImageSimple;
            case 8:
                heq.a aVar = (heq.a) obj2;
                aVar.f = null;
                ((u66) obj).invoke();
                aVar.invalidate();
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj2;
                izsVar.invoke(vmu.a.b);
                izsVar.invoke(((umu) obj).e);
                return s3q0.a;
            case 10:
                showStarted$lambda$6 = LegacyShowUseCase.showStarted$lambda$6((Listeners) obj2, (String) obj);
                return showStarted$lambda$6;
            case 11:
                zj20 zj20Var = (zj20) obj;
                ((gzs) obj2).invoke();
                ((Handler) zj20Var.b).postDelayed(new gv2(zj20Var, 9), 400L);
                return s3q0.a;
            case 12:
                com.vk.superapp.pip.impl.overlay.b bVar2 = (com.vk.superapp.pip.impl.overlay.b) obj2;
                com.vk.superapp.pip.impl.overlay.b.c(SchemeStat$TypeMiniAppItem.Type.PIP_CLOSE, ((WebApiApplication) obj).b);
                try {
                    bVar2.a(true);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
                return s3q0.a;
            case 13:
                vm30 vm30Var = (vm30) obj2;
                izs izsVar2 = (izs) obj;
                MsgLinearLayoutManager msgLinearLayoutManager = vm30Var.I;
                int v = msgLinearLayoutManager.v();
                int x = msgLinearLayoutManager.x();
                if (v != -1 && x != -1 && v <= x) {
                    while (true) {
                        if (((Boolean) izsVar2.invoke(Integer.valueOf(v))).booleanValue()) {
                            vm30Var.H.notifyItemChanged(v);
                        }
                        if (v != x) {
                            v++;
                        }
                    }
                }
                return s3q0.a;
            case 14:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_media_viewer_time_yesterday), ((dn30) obj).e);
            case 15:
                gs60 gs60Var = (gs60) obj2;
                ds60.h.a aVar2 = (ds60.h.a) obj;
                return new Result(gs60Var.f.f(new fzk0(aVar2.b, aVar2.c, gs60Var.g)));
            case 16:
                int i2 = PictureInPicturePermissionFragment.S;
                ((d5) obj2).invoke();
                ((PictureInPicturePermissionFragment) obj).tn();
                return s3q0.a;
            case 17:
                m4b0 m4b0Var = (m4b0) obj;
                fxc0.B().d((VideoFile) obj2);
                m4b0Var.b.l0();
                m4b0Var.b.play();
                return s3q0.a;
            case 18:
                ShimmerVh shimmerVh = (ShimmerVh) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    View view = shimmerVh.c;
                    ShimmerFrameLayout shimmerFrameLayout = view != null ? (ShimmerFrameLayout) view.findViewById(intValue) : null;
                    if (shimmerFrameLayout != null) {
                        arrayList.add(shimmerFrameLayout);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Collection collection = arrayList;
                if (isEmpty) {
                    View view2 = shimmerVh.c;
                    collection = e43.m(view2 instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view2 : null);
                }
                return (List) collection;
            case 19:
                ((a5m0) obj2).o.setVisibility(((Number) ((u0x.a) obj).b.invoke()).intValue() >= 5 ? 8 : 0);
                return s3q0.a;
            case 20:
                ((com.vk.sharing.core.view.i) obj2).V5((Target) obj);
                return s3q0.a;
            case 21:
                nek0 nek0Var = (nek0) obj2;
                izs izsVar3 = (izs) obj;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                izsVar3.invoke(aiq0.b.a.b);
                return s3q0.a;
            case 22:
                String str = (String) obj2;
                bpn0 bpn0Var = c7r0.a;
                String f = c7r0.f(str);
                c7r0.j(str, f);
                HashMap hashMap = q700.a;
                e8f0 e8f0Var = new e8f0(mq9.d(new ByteArrayInputStream(f.getBytes())));
                String[] strArr = JsonReader.f;
                u800 g = q700.g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), (String) obj, true);
                Throwable th2 = g.b;
                if (th2 == null) {
                    return g.a;
                }
                throw th2;
            case 23:
                com.vk.libvideo.autoplay.background.controller.e eVar = (com.vk.libvideo.autoplay.background.controller.e) obj2;
                eVar.getClass();
                if (!((yg5) obj).A().W9()) {
                    eVar.D();
                }
                return s3q0.a;
            case 24:
                ((izs) obj2).invoke(((dqj) obj).c);
                return s3q0.a;
            case 25:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) obj;
                if (((com.vk.video.profile.presentation.b) obj2).b.e()) {
                    cVar.A.b(h.z.a);
                }
                return s3q0.a;
            case 26:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj;
                int i3 = VideoRelatedVideosFragment.n0;
                VideoAlbum videoAlbum = ((i.d) obj2).a;
                if (videoAlbum != null) {
                    xn50.a.c(videoRelatedVideosFragment, new b.f(videoAlbum));
                }
                return s3q0.a;
            case 27:
                etv0 etv0Var = (etv0) obj2;
                yvj yvjVar = (yvj) obj;
                if (etv0Var.isVisible()) {
                    myc0.h(yvjVar, null, null, new n9v0(null, etv0Var, null), 3);
                }
                return s3q0.a;
            default:
                int i4 = VoipCallServiceFragment.Y;
                xn50.a.c((VoipCallServiceFragment) obj2, new rhw0.h((shw0) obj));
                return s3q0.a;
        }
    }

    public /* synthetic */ e(izs izsVar, pc1 pc1Var, rg50 rg50Var) {
        this.b = 2;
        this.c = izsVar;
        this.d = rg50Var;
    }
}
