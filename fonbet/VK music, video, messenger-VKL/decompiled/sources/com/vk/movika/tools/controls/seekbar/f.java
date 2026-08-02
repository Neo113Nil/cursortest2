package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.dto.common.Source;
import com.vk.dto.narratives.Narrative;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.video.ui.slider.impl.VideoSliderHolderComponentImpl;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.aef0;
import xsna.an10;
import xsna.c9w;
import xsna.d5p;
import xsna.dvv0;
import xsna.ex40;
import xsna.fht0;
import xsna.fvv0;
import xsna.fx30;
import xsna.gs80;
import xsna.gu1;
import xsna.gx30;
import xsna.gzs;
import xsna.hrl;
import xsna.hze;
import xsna.ic4;
import xsna.izs;
import xsna.kef0;
import xsna.kkm;
import xsna.kkv;
import xsna.lrp0;
import xsna.lru;
import xsna.lzk;
import xsna.m2j0;
import xsna.m5v;
import xsna.mms;
import xsna.mtk0;
import xsna.mun0;
import xsna.myc0;
import xsna.nl6;
import xsna.nx50;
import xsna.nxz;
import xsna.o1i;
import xsna.ovv0;
import xsna.pkn0;
import xsna.pnf0;
import xsna.pp4;
import xsna.q7v0;
import xsna.qcy;
import xsna.qr6;
import xsna.rdi;
import xsna.rfb;
import xsna.s3q0;
import xsna.sqw;
import xsna.sw30;
import xsna.t33;
import xsna.tms;
import xsna.uns;
import xsna.uw1;
import xsna.vlm;
import xsna.vof0;
import xsna.vrp0;
import xsna.vva0;
import xsna.wgb;
import xsna.wh50;
import xsna.xvy;
import xsna.xx30;
import xsna.xyb;
import xsna.y2y;
import xsna.ybh;
import xsna.yg5;
import xsna.ytg;
import xsna.yvj;
import xsna.zyz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        int i = this.b;
        int i2 = 3;
        ?? r6 = this.d;
        ?? r7 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) r6;
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ImageView imageView = new ImageView((Context) r7);
                int b = an10.b(defaultSeekBarView.getNonActiveThumbSize());
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.setIntrinsicWidth(b);
                shapeDrawable.setIntrinsicHeight(b);
                shapeDrawable.getPaint().setColor(defaultSeekBarView.k);
                imageView.setImageDrawable(shapeDrawable);
                return imageView;
            case 1:
                ic4.a aVar2 = (ic4.a) r7;
                AudioAttachListItem audioAttachListItem = (AudioAttachListItem) r6;
                ((pp4) aVar2.l.b).h(aVar2.m.getContext(), new HistoryAttach(audioAttachListItem.c, audioAttachListItem.d, audioAttachListItem.b, null, null, null, null, 112, null));
                return s3q0.a;
            case 2:
                StringBuilder a2 = t33.a("UPLOAD_TRACE doUpload: using existing URL ", (String) r7, ", resuming from ");
                ResumableAttachUploadInfo resumableAttachUploadInfo = ((qr6) r6).p;
                a2.append((resumableAttachUploadInfo != null ? resumableAttachUploadInfo : null).h());
                a2.append(" bytes");
                return a2.toString();
            case 3:
                return ((wgb) r7).s + ": updateExpiredHistory: fetch finished, args=" + ((rfb.a.b) r6);
            case 4:
                ybh ybhVar = (ybh) r7;
                o1i o1iVar = (o1i) r6;
                if (ybhVar.equals(ybh.f.d)) {
                    o1iVar.l();
                } else if (ybhVar instanceof ybh.c) {
                    o1iVar.g();
                } else if (ybhVar instanceof ybh.a) {
                    o1iVar.k();
                } else if (ybhVar.equals(ybh.i.d)) {
                    o1iVar.q();
                } else if (ybhVar.equals(ybh.d.d)) {
                    o1iVar.i();
                } else if (ybhVar.equals(ybh.b.d)) {
                    o1iVar.e();
                } else if (ybhVar.equals(ybh.g.d)) {
                    o1iVar.o();
                } else if (ybhVar.equals(ybh.j.d)) {
                    o1iVar.h();
                } else if (ybhVar.equals(ybh.e.d)) {
                    o1iVar.a(false);
                } else if (ybhVar.equals(ybh.h.d)) {
                    o1iVar.p();
                } else {
                    if (!ybhVar.equals(ybh.k.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o1iVar.m();
                }
                return s3q0.a;
            case 5:
                ((wh50) r6).setValue(Boolean.valueOf(!((Boolean) r6.getValue()).booleanValue()));
                ((gzs) r7).invoke();
                return s3q0.a;
            case 6:
                myc0.h((yvj) r7, null, null, new lzk.c((xvy) r6, null), 3);
                return s3q0.a;
            case 7:
                hrl hrlVar = (hrl) r7;
                pkn0 pkn0Var = hrlVar.a;
                pkn0Var.b();
                pkn0Var.execute(new nl6(2, hrlVar, (ClipsInterestsViewState.d) r6));
                return s3q0.a;
            case 8:
                return new SimpleDateFormat(((Context) r7).getString(R.string.vkim_dialogs_list_time_week_day), ((vlm) r6).f);
            case 9:
                ((tms) r7).a.a(new mms.d(((uns.a.d) r6).a, true));
                return s3q0.a;
            case 10:
                lru.a aVar3 = (lru.a) r7;
                lru lruVar = (lru) r6;
                ytg ytgVar = aVar3.q;
                if (ytgVar.h.isEmpty()) {
                    ytgVar.setItems(lru.a.q6(lruVar));
                    com.vk.lists.c cVar = aVar3.r;
                    if (cVar != null) {
                        cVar.s(lruVar.g.k);
                    }
                    aVar3.p.getRecyclerView().scrollToPosition(0);
                } else {
                    ytgVar.notifyItemRangeChanged(0, ytgVar.getItemCount());
                }
                return s3q0.a;
            case 11:
                m5v m5vVar = (m5v) r7;
                Narrative narrative = (Narrative) r6;
                if (!((gu1.b) m5vVar.m).b.l.isEmpty()) {
                    m5vVar.n.n1(narrative);
                }
                return s3q0.a;
            case 12:
                ArrayList arrayList = (ArrayList) r6;
                xyb xybVar = ((ImChatSettingsFragment) r7).Q;
                (xybVar != null ? xybVar : null).b1(250, arrayList);
                return s3q0.a;
            case 13:
                fvv0 fvv0Var = (fvv0) r6;
                fvv0 M = ((y2y) r7).a.M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.PHONE)) != null) {
                    a.a(String.valueOf(fvv0Var.getAppId()));
                }
                return s3q0.a;
            case 14:
                zyz zyzVar = (zyz) r7;
                return new nxz(zyzVar.d, new zyz.a(zyzVar), new c9w((kkm) r6), true);
            case 15:
                sw30 sw30Var = (sw30) r6;
                return new sqw(Source.NETWORK, (a1w) r7, new fx30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new gx30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 16:
                String str = (String) r7;
                nx50 nx50Var = (nx50) r6;
                if (str != null) {
                    ((mun0) nx50Var.W.getValue()).c(str, nx50Var.H0().h());
                }
                VkContextMenu vkContextMenu = nx50Var.L0;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 17:
                ((PhotoEditorView) r7).c.b = (d5p) r6;
                return s3q0.a;
            case 18:
                return new vva0((ex40) r7, (uw1) r6);
            case 19:
                ((izs) r7).invoke(new aef0.b(((kef0) r6).b));
                return s3q0.a;
            case 20:
                ArrayList arrayList2 = new ArrayList();
                ArrayList<pnf0> arrayList3 = ((com.vk.reefton.trackers.e) r7).c;
                arrayList2.addAll(arrayList3);
                arrayList3.clear();
                ((vof0) r6).a(new kkv(arrayList2));
                return s3q0.a;
            case 21:
                q7v0 q7v0Var = (q7v0) r7;
                m2j0 m2j0Var = (m2j0) r6;
                VkOnboardingCampaign e = q7v0Var.e("video:attached_clips");
                if (e == null || !q7v0Var.d(e) || !q7v0Var.b(e, false)) {
                    return s3q0.a;
                }
                rdi.y(m2j0Var, new gs80(i2, e, m2j0Var));
                return s3q0.a;
            case 22:
                float f = ((lrp0) r7).a;
                return new vrp0(f, ((Number) ((mtk0) r6).getValue()).longValue() / f);
            case 23:
                ((izs) r7).invoke(((hze) r6).a);
                return s3q0.a;
            case 24:
                ((com.vk.libvideo.autoplay.background.controller.f) r7).G((yg5) r6);
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr = VideoSliderHolderComponentImpl.b;
                return new fht0(r7, r6);
            default:
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) r6;
                int i3 = VkCellSkeleton.n;
                VkSkeleton vkSkeleton = new VkSkeleton((Context) r7, null, 0, 14, 0);
                vkSkeleton.setId(R.id.ds_internal_cell_skeleton_left_extra);
                vkSkeleton.setArea(vkCellSkeleton.getArea());
                vkSkeleton.setShimmer(vkCellSkeleton.b);
                vkSkeleton.setShimmerManagedExternally(true);
                return vkSkeleton;
        }
    }
}
