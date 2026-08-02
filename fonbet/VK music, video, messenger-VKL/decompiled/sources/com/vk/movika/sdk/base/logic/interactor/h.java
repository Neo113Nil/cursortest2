package com.vk.movika.sdk.base.logic.interactor;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.ui.holders.channel.CatalogChannelViewHolder;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment.b;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.dto.hints.HintId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.movika.sdk.base.logic.dto.a;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sidecontrols.impl.di.AnimatedSharingViewProviderComponentImpl;
import com.vk.toggle.features.ImFeatures;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import xsna.a1w;
import xsna.a3b;
import xsna.a84;
import xsna.b3b;
import xsna.b7h;
import xsna.b9w;
import xsna.bg20;
import xsna.bzb0;
import xsna.c3a;
import xsna.cg20;
import xsna.clg0;
import xsna.d3b;
import xsna.d9f;
import xsna.dc2;
import xsna.dcj0;
import xsna.di5;
import xsna.dtp0;
import xsna.eo9;
import xsna.euz;
import xsna.fj6;
import xsna.fpf0;
import xsna.gdb;
import xsna.gia0;
import xsna.gxe;
import xsna.gzs;
import xsna.hbw;
import xsna.hdm;
import xsna.hlg0;
import xsna.i2n0;
import xsna.i7o0;
import xsna.ibr0;
import xsna.ieb;
import xsna.iee;
import xsna.iza;
import xsna.j3f0;
import xsna.jlg0;
import xsna.k2n0;
import xsna.k840;
import xsna.kju0;
import xsna.kof;
import xsna.kza;
import xsna.l3b;
import xsna.lua;
import xsna.lul;
import xsna.lxa;
import xsna.m7m;
import xsna.mo8;
import xsna.n4n;
import xsna.nwy;
import xsna.o1i;
import xsna.ojh0;
import xsna.oul;
import xsna.ovi;
import xsna.pa2;
import xsna.pde;
import xsna.pla;
import xsna.q0w0;
import xsna.q9;
import xsna.qcy;
import xsna.qf20;
import xsna.r4k;
import xsna.r920;
import xsna.rkd;
import xsna.ruf0;
import xsna.s101;
import xsna.s2f;
import xsna.s3q0;
import xsna.sdq0;
import xsna.sf2;
import xsna.sl2;
import xsna.urf;
import xsna.v1f0;
import xsna.v4i;
import xsna.vnb;
import xsna.wax;
import xsna.x2b;
import xsna.xm1;
import xsna.xwv;
import xsna.ynb;
import xsna.zdw;
import xsna.zof;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x029d, code lost:
    
        if (r4.N == true) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Channel failure;
        int i = this.b;
        int i2 = 29;
        int i3 = 0;
        boolean z = true;
        ?? r6 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                a.AbstractC1294a.k kVar = (a.AbstractC1294a.k) obj;
                Chapter chapter = kVar.b;
                Chapter.Order order = chapter.g;
                String str = chapter.a;
                Chapter chapter2 = kVar.c;
                break;
            case 1:
                RecyclerView recyclerView = ((ListGroupCallView) obj).D;
                if (recyclerView.getVisibility() == 0) {
                    pla.e().b().q(recyclerView, HintId.VOIP_CAROUSEL_ACTIONS);
                }
                break;
            case 2:
                break;
            case 3:
                int i4 = AlbumPickerFragment.V;
                ?? parentFragment = ((AlbumPickerFragment) obj).getParentFragment();
                gia0 gia0Var = parentFragment instanceof gia0 ? (gia0) parentFragment : null;
                if (gia0Var != null) {
                    gia0Var.kh();
                }
                break;
            case 4:
                int i5 = AlbumsFragment.j0;
                break;
            case 5:
                AnimatedSharingViewProviderComponentImpl animatedSharingViewProviderComponentImpl = (AnimatedSharingViewProviderComponentImpl) obj;
                qcy<Object>[] qcyVarArr = AnimatedSharingViewProviderComponentImpl.g;
                sl2 sl2Var = sl2.a;
                SharingComponent sharingComponent = animatedSharingViewProviderComponentImpl.a;
                dcj0 c = sharingComponent.c();
                hdm jc = sharingComponent.jc();
                com.vk.clips.viewer.vk.a y0 = animatedSharingViewProviderComponentImpl.b.y0();
                ojh0 h = animatedSharingViewProviderComponentImpl.c.h();
                com.vk.im.engine.models.c experiments = animatedSharingViewProviderComponentImpl.d.getExperiments();
                a84 u = sharingComponent.u();
                s2f e0 = animatedSharingViewProviderComponentImpl.e.e0();
                sl2Var.getClass();
                if (!sl2.i) {
                    sl2.b = c;
                    sl2.c = y0;
                    sl2.d = jc;
                    sl2.e = h;
                    sl2.f = experiments;
                    sl2.g = u;
                    sl2.h = e0;
                    (y0 == null ? null : y0).c(sl2.r);
                    sl2.i = true;
                    break;
                }
                break;
            case 6:
                AvatarView avatarView = (AvatarView) obj;
                AvatarView.a aVar = AvatarView.y;
                break;
            case 7:
                break;
            case 8:
                int i6 = BasePhotoListFragment.m0;
                fj6 io2 = ((BasePhotoListFragment) obj).io();
                if (io2 != null) {
                    io2.h();
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                gdb gdbVar = ((CatalogChannelViewHolder) obj).b;
                UIBlockChannel uIBlockChannel = gdbVar.e;
                if (uIBlockChannel != null) {
                    gdbVar.b.j(new c3a(uIBlockChannel.y, uIBlockChannel.z));
                }
                break;
            case 13:
                break;
            case 14:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                ?? r1 = channelFragment.L0;
                int i7 = ChannelFragment.a1;
                ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    lxa lo = channelFragment.lo();
                    Channel P0 = lo.d.P0();
                    if (P0 == null) {
                        try {
                            failure = (Channel) lo.b.C(lo, new kza(lo.a, true)).r(300L, TimeUnit.MILLISECONDS).c();
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        P0 = failure;
                    }
                    if (P0 != null) {
                        break;
                    }
                }
                z = false;
                FragmentActivity kn = channelFragment.kn();
                q0w0 q0w0Var = channelFragment.C0;
                a1w a1wVar = channelFragment.V;
                cg20 cg20Var = new cg20(kn, q0w0Var.d.p(), channelFragment.U, channelFragment.wo(), q0w0Var.d.o(), channelFragment.U.i);
                b9w b9wVar = (b9w) channelFragment.D0.getValue();
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                ((kju0) zdwVar.c()).f.getClass();
                di5 di5Var = new di5(b9wVar, new lua(new xwv()));
                pa2 pa2Var = new pa2(new eo9(channelFragment.lo()));
                n4n n4nVar = new n4n(new s101(), new euz(a1wVar), new ruf0(a1wVar));
                mo8 mo8Var = new mo8((r920) channelFragment.M0.getValue());
                Context requireContext = channelFragment.requireContext();
                zdw zdwVar2 = i7o0.b;
                if (zdwVar2 == null) {
                    zdwVar2 = null;
                }
                b3b b3bVar = new b3b(requireContext, ((kju0) zdwVar2.c()).m, channelFragment.G0, (iza) r1.getValue(), new l3b(channelFragment.lo()), channelFragment.p0, channelFragment.mo());
                Context requireContext2 = channelFragment.requireContext();
                bzb0 bzb0Var = (bzb0) channelFragment.u0.getValue();
                com.vk.im.popup.a aVar2 = (com.vk.im.popup.a) channelFragment.t0.getValue();
                zdw zdwVar3 = i7o0.b;
                if (zdwVar3 == null) {
                    zdwVar3 = null;
                }
                qf20 qf20Var = new qf20(b3bVar, new d3b(requireContext2, bzb0Var, aVar2, ((kju0) zdwVar3.c()).m, channelFragment.G0, (iza) r1.getValue(), new l3b(channelFragment.lo()), channelFragment.p0, channelFragment.mo()), (x2b) channelFragment.J0.getValue(), channelFragment.new b());
                a3b a3bVar = (a3b) channelFragment.H0.getValue();
                sf2 sf2Var = new sf2(new ieb(a1wVar));
                q9 q9Var = new q9(a1wVar, 16);
                bg20 bg20Var = new bg20(channelFragment.i0, channelFragment.j0);
                i2n0 i8 = channelFragment.uo().t().i();
                k2n0 c2 = channelFragment.uo().t().c();
                zdw zdwVar4 = i7o0.b;
                if (zdwVar4 == null) {
                    zdwVar4 = null;
                }
                j3f0 e = zdwVar4.e();
                hbw h2 = e != null ? e.h(a1wVar) : null;
                zdw zdwVar5 = i7o0.b;
                if (zdwVar5 == null) {
                    zdwVar5 = null;
                }
                j3f0 e2 = zdwVar5.e();
                v1f0 f = e2 != null ? e2.f(a1wVar) : null;
                zdw zdwVar6 = i7o0.b;
                if (zdwVar6 == null) {
                    zdwVar6 = null;
                }
                j3f0 e3 = zdwVar6.e();
                break;
            case 15:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new vnb((ynb) obj, i3));
                break;
            case 16:
                com.vk.im.ui.components.msg_list.a aVar3 = ((ChatFragment) obj).H0;
                if (aVar3 != null) {
                    break;
                }
                break;
            case 17:
                j jVar = ((rkd) obj).a;
                if (jVar != null) {
                    jVar.invoke();
                }
                break;
            case 18:
                ClipsFavoritesComponentImpl clipsFavoritesComponentImpl = (ClipsFavoritesComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                break;
            case 19:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) obj;
                ?? r0 = clipsGridFragment.c0;
                ?? r2 = clipsGridFragment.b0;
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                Bundle requireArguments = clipsGridFragment.requireArguments();
                boolean z2 = requireArguments.getBoolean("ClipsGridFragment.is_owner_grid");
                boolean z3 = requireArguments.getBoolean("ClipsGridFragment.is_owner_camera_button_enabled", true);
                boolean z4 = requireArguments.getBoolean("ClipsGridFragment.is_settings_button_enabled", false);
                ClipGridParams clipGridParams = (ClipGridParams) clipsGridFragment.k0.getValue();
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) clipsGridFragment.e0.getValue();
                iee ieeVar = searchStatsLoggingInfo != null ? new iee(searchStatsLoggingInfo) : null;
                ibr0 pe = ((ClipsViewerComponent) clipsGridFragment.a0.getValue()).pe();
                d9f d9fVar = (d9f) clipsGridFragment.X.getValue();
                urf Of = ((ClipsViewerComponentImpl) r2.getValue()).Of();
                ClipsWrapperInputArguments.r.getClass();
                String d = ClipsWrapperInputArguments.a.d(requireArguments);
                ((ClipsViewerComponentImpl) r2.getValue()).getClass();
                r4k r4kVar = new r4k(k840.a.g().b());
                pde T5 = ((LinksGeneratorComponent) m7m.d(clipsGridFragment).mo408a(fpf0.a(LinksGeneratorComponent.class))).T5();
                kof kofVar = (kof) r0.getValue();
                kof kofVar2 = (kof) r0.getValue();
                zof zofVar = (zof) clipsGridFragment.Z.getValue();
                sdq0 sdq0Var = new sdq0(clipsGridFragment.f0, clipsGridFragment.h0, clipsGridFragment.g0);
                ?? r12 = clipsGridFragment.i0;
                nwy nwyVar = ((ClipsViewerComponentImpl) r2.getValue()).e0;
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                qcy<Object> qcyVar = qcyVarArr4[43];
                gxe gxeVar = (gxe) nwyVar.c();
                nwy nwyVar2 = ((ClipsViewerComponentImpl) r2.getValue()).f0;
                qcy<Object> qcyVar2 = qcyVarArr4[44];
                break;
            case 20:
                break;
            case 21:
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                break;
            case 22:
                break;
            case 23:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                nwy nwyVar3 = clipsViewerComponentImpl.k0;
                qcy<Object> qcyVar3 = ClipsViewerComponentImpl.o0[49];
                break;
            case 24:
                int i9 = CommunityChatsFragment.b0;
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                o1i o1iVar = (o1i) obj;
                b7h.b((b7h) o1iVar.t.getValue(), o1iVar.c, "community_page", null, 12);
                break;
            case 28:
                ((v4i) obj).i.invoke();
                break;
            default:
                oul oulVar = (oul) obj;
                if (((clg0) ovi.a(oulVar, jlg0.a)) == null) {
                    dc2 dc2Var = oulVar.v;
                    if (dc2Var != null) {
                        oulVar.j2(dc2Var);
                    }
                } else if (oulVar.v == null) {
                    lul lulVar = new lul(oulVar);
                    xm1 xm1Var = new xm1(oulVar, i2);
                    wax waxVar = oulVar.r;
                    boolean z5 = oulVar.s;
                    float f2 = oulVar.t;
                    dtp0<Float> dtp0Var = hlg0.a;
                    dc2 dc2Var2 = new dc2(waxVar, z5, f2, lulVar, xm1Var);
                    oulVar.i2(dc2Var2);
                    oulVar.v = dc2Var2;
                }
                break;
        }
        return s3q0.a;
    }
}
