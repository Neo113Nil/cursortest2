package com.vk.im.ui.fragments;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;
import com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment;
import com.vk.voip.ui.assessment.BadAssessmentReason;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ac7;
import xsna.adb;
import xsna.afw;
import xsna.aj9;
import xsna.an9;
import xsna.au4;
import xsna.b2b;
import xsna.bhb;
import xsna.btc;
import xsna.cse;
import xsna.dl9;
import xsna.epx;
import xsna.f4z;
import xsna.fj9;
import xsna.fk7;
import xsna.fu4;
import xsna.fyr0;
import xsna.g2v;
import xsna.g47;
import xsna.gfa;
import xsna.gzs;
import xsna.hy5;
import xsna.ij9;
import xsna.ikv0;
import xsna.iqb;
import xsna.isc;
import xsna.izs;
import xsna.j03;
import xsna.jbs;
import xsna.jhu0;
import xsna.jsr0;
import xsna.k4b;
import xsna.k9u0;
import xsna.ki8;
import xsna.laa;
import xsna.lh9;
import xsna.m16;
import xsna.m99;
import xsna.nad;
import xsna.nls;
import xsna.nre;
import xsna.o0r0;
import xsna.o0w;
import xsna.o1d;
import xsna.pwb;
import xsna.q2a0;
import xsna.qcy;
import xsna.qgi0;
import xsna.qtd0;
import xsna.qv20;
import xsna.r60;
import xsna.s16;
import xsna.s3j0;
import xsna.s3q0;
import xsna.t0d;
import xsna.tci;
import xsna.tgi0;
import xsna.usc;
import xsna.vua0;
import xsna.x3b;
import xsna.x60;
import xsna.xfa;
import xsna.xwk;
import xsna.ycb;
import xsna.ygb;
import xsna.ym7;
import xsna.ypb;
import xsna.zld;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [xsna.t0d$i$c] */
    /* JADX WARN: Type inference failed for: r3v19, types: [xsna.t0d$i$d] */
    /* JADX WARN: Type inference failed for: r3v21, types: [xsna.t0d$i$b] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        t0d.i.a aVar;
        r2 = null;
        SdkClipOrdData sdkClipOrdData = null;
        VKApiExecutionException vKApiExecutionException = null;
        switch (this.b) {
            case 0:
                afw afwVar = (afw) this.c;
                qtd0 qtd0Var = (qtd0) obj;
                jbs jbsVar = afwVar.b;
                afwVar.dismiss();
                if (BuildInfo.g()) {
                    xwk.e().m(jbsVar.a.kn(), new UserId(qtd0Var.G3()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (qtd0Var.t8() == Peer.Type.UNKNOWN) {
                    g2v.c().getClass();
                    k9u0.a.g(jbsVar.a.kn(), (q2a0) qtd0Var);
                } else {
                    o0w.x(g2v.c().b(), jbsVar.a.kn(), null, qtd0Var.G3(), qv20.m(qtd0Var), null, null, false, null, null, null, null, null, null, "conversations_search", null, null, null, false, null, null, null, null, null, 1073733618);
                }
                return s3q0.a;
            case 1:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
                nls nlsVar = (nls) obj;
                int i = AbsFriendsAndFollowersTabFragment.X;
                if (!(nlsVar instanceof nls.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String g = j03.g(absFriendsAndFollowersTabFragment.requireContext(), ((nls.a) nlsVar).a, R.string.error);
                ikv0.a aVar2 = new ikv0.a(absFriendsAndFollowersTabFragment.requireContext());
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                aVar2.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                return s3q0.a;
            case 2:
                return ((r60) this.c).c.a((x60) obj);
            case 3:
                ((gzs) this.c).invoke();
                return s3q0.a;
            case 4:
                au4 au4Var = (au4) this.c;
                au4Var.T(new fu4.b((ReactionsConfig) obj, au4Var.h));
                return s3q0.a;
            case 5:
                qgi0.h((tgi0) obj, (String) this.c);
                return s3q0.a;
            case 6:
                hy5 hy5Var = (hy5) this.c;
                hy5Var.k = (BadAssessmentReason) obj;
                RecyclerView recyclerView = hy5Var.j;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                View view = hy5Var.h;
                (view != null ? view : null).setEnabled(hy5Var.k != null);
                return s3q0.a;
            case 7:
                s16.a aVar3 = (s16.a) obj;
                f4z f4zVar = ((m16) this.c).b;
                if (aVar3 instanceof s16.a.b) {
                    aVar = new t0d.i.b(((s16.a.b) aVar3).a);
                } else if (aVar3 instanceof s16.a.d) {
                    aVar = new t0d.i.d(((s16.a.d) aVar3).a);
                } else if (aVar3 instanceof s16.a.c) {
                    aVar = new t0d.i.c(((s16.a.c) aVar3).a);
                } else {
                    if (!(aVar3 instanceof s16.a.C3647a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = t0d.i.a.a;
                }
                f4zVar.b(aVar);
                return s3q0.a;
            case 8:
                BaseCommunityScheduledClipsGridFragment baseCommunityScheduledClipsGridFragment = (BaseCommunityScheduledClipsGridFragment) this.c;
                int i2 = BaseCommunityScheduledClipsGridFragment.S;
                baseCommunityScheduledClipsGridFragment.getFeature().C((com.vk.profile.core.scheduled_clips.b) obj);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(!epx.f(((ac7.a) obj).b, (Rect) this.c));
            case 10:
                ((fk7) this.c).l.io();
                return s3q0.a;
            case 11:
                ym7.a aVar4 = (ym7.a) this.c;
                ym7.b bVar = (ym7.b) obj;
                ym7.a aVar5 = bVar.a;
                return new BookingCalendarScreenState.DaySelector.a(aVar5.c, aVar5.d, aVar5.e, aVar5.compareTo(aVar4) == 0 ? BookingCalendarScreenState.DaySelector.DayType.Selected : bVar.b ? BookingCalendarScreenState.DaySelector.DayType.Available : BookingCalendarScreenState.DaySelector.DayType.NotAvailable, bVar);
            case 12:
                ((BroadcastSettingsFragment.b) this.c).invoke(new ki8.a((BroadcastAuthor) obj));
                return s3q0.a;
            case 13:
                ((m99) this.c).r();
                return s3q0.a;
            case 14:
                lh9.d(((dl9) this.c).d, (Bitmap) obj);
                return s3q0.a;
            case 15:
                com.vk.cameraui.impl.a aVar6 = (com.vk.cameraui.impl.a) this.c;
                an9 an9Var = aVar6.i;
                aj9 aj9Var = ij9.a;
                jhu0 jhu0Var = ((fj9) aj9Var.a.getValue()).a;
                int a = jhu0Var != null ? jhu0Var.a() : -1;
                Integer d = aj9Var.d();
                boolean z = d != null && a == d.intValue();
                jhu0 jhu0Var2 = ((fj9) aj9Var.a.getValue()).a;
                if ((jhu0Var2 != null ? jhu0Var2.p() : false) && !z) {
                    r3 = true;
                }
                an9Var.C = r3;
                an9Var.z = true;
                aVar6.b.getPositions().a();
                return s3q0.a;
            case 16:
                laa laaVar = (laa) this.c;
                vua0 vua0Var = laaVar.k;
                String str = laaVar.j;
                vua0Var.getClass();
                return vua0.B(str, (List) obj);
            case 17:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) this.c;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                g47Var.e(tci.l(catalogSectionScreenFragment.go()), (xfa) catalogSectionScreenFragment.P.getValue());
                g47Var.a(tci.k(catalogSectionScreenFragment.go()));
                g47Var.d(new gfa(catalogSectionScreenFragment.go()));
                return s3q0.a;
            case 18:
                b2b b2bVar = (b2b) this.c;
                Throwable th = (Throwable) obj;
                b2bVar.getClass();
                b2bVar.e.d(((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 7404) ? R.string.vkim_channel_msg_action_reached_limit : R.string.vkim_error_unknown);
                return s3q0.a;
            case 19:
                ((k4b) this.c).d.invoke(x3b.f.b);
                return s3q0.a;
            case 20:
                Throwable th2 = (Throwable) obj;
                d<ycb> dVar = ((adb) this.c).c;
                Throwable cause = th2.getCause();
                VKApiExecutionException vKApiExecutionException2 = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
                if (vKApiExecutionException2 == null) {
                    Throwable cause2 = th2.getCause();
                    Throwable cause3 = cause2 != null ? cause2.getCause() : null;
                    if (cause3 instanceof VKApiExecutionException) {
                        vKApiExecutionException = (VKApiExecutionException) cause3;
                    }
                } else {
                    vKApiExecutionException = vKApiExecutionException2;
                }
                if (vKApiExecutionException != null) {
                    if (vKApiExecutionException.C() == 1172) {
                        dVar.onNext(new ycb.c(vKApiExecutionException.t()));
                    } else if (vKApiExecutionException.C() == 1173) {
                        dVar.onNext(new ycb.c(vKApiExecutionException.t()));
                    } else if (vKApiExecutionException.s() == 104) {
                        dVar.onNext(new ycb.c(""));
                    }
                }
                return s3q0.a;
            case 21:
                return new bhb(((ygb.a) this.c).b.a);
            case 22:
                iqb.a aVar7 = (iqb.a) this.c;
                ViewGroup viewGroup = (ViewGroup) obj;
                int i3 = ypb.o;
                return new ypb(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_item_new, viewGroup, false), aVar7);
            case 23:
                return new jsr0(((pwb) this.c).l, (ViewGroup) obj);
            case 24:
                isc iscVar = (isc) this.c;
                SdkClipOrdData sdkClipOrdData2 = (SdkClipOrdData) obj;
                qcy<Object>[] qcyVarArr2 = isc.t1;
                btc fo = iscVar.fo();
                if (sdkClipOrdData2 != null && sdkClipOrdData2.b) {
                    sdkClipOrdData = sdkClipOrdData2;
                }
                fo.b(new usc.a.d(sdkClipOrdData));
                return s3q0.a;
            case 25:
                ((o1d) this.c).x0.a(new ClipItemViewEvent.p((izs) obj));
                return s3q0.a;
            case 26:
                ((nad) this.c).f = ((fyr0) obj).a;
                return s3q0.a;
            case 27:
                UserId userId = (UserId) this.c;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftVk j = ClipsDraftPersistentStore.j();
                if (j != null) {
                    ClipsDraftVkExtraData clipsDraftVkExtraData = j.c;
                    DraftUserRelatedData draftUserRelatedData = clipsDraftVkExtraData.j;
                    if (!epx.f(draftUserRelatedData != null ? draftUserRelatedData.b : null, userId)) {
                        clipsDraftVkExtraData.j = null;
                    }
                }
                return s3q0.a;
            case 28:
                zld zldVar = (zld) this.c;
                ClipsChoosePreviewResult clipsChoosePreviewResult = (ClipsChoosePreviewResult) obj;
                if (clipsChoosePreviewResult.b != null) {
                    zldVar.g.invoke(clipsChoosePreviewResult);
                }
                return s3q0.a;
            default:
                ((nre) this.c).C(new zqe.l(((cse.a.C2680a) obj).a));
                return s3q0.a;
        }
    }
}
