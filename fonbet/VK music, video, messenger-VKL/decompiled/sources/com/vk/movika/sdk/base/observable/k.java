package com.vk.movika.sdk.base.observable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.antispam.SpammerModel;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.log.L;
import com.vk.profile.core.scheduled_clips.CommunityScheduledClipsGridPaginatedView;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.toggle.internal.ToggleManager;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aa2;
import xsna.agw;
import xsna.ao8;
import xsna.arc;
import xsna.awh;
import xsna.ba2;
import xsna.biq;
import xsna.bph0;
import xsna.bw2;
import xsna.bwt0;
import xsna.bzd;
import xsna.c30;
import xsna.c5g;
import xsna.dgw;
import xsna.drc;
import xsna.e3m;
import xsna.e6s0;
import xsna.egg0;
import xsna.epx;
import xsna.erc;
import xsna.f4m;
import xsna.fw2;
import xsna.fxc0;
import xsna.fyh;
import xsna.gd0;
import xsna.gko;
import xsna.gn0;
import xsna.gw;
import xsna.gw2;
import xsna.gx3;
import xsna.h30;
import xsna.hrh;
import xsna.hv;
import xsna.i8;
import xsna.ix3;
import xsna.izs;
import xsna.j5g;
import xsna.je90;
import xsna.jv;
import xsna.k30;
import xsna.ku1;
import xsna.l0c;
import xsna.lds0;
import xsna.lu1;
import xsna.ng4;
import xsna.ngj0;
import xsna.noa;
import xsna.o0i;
import xsna.o83;
import xsna.p0i;
import xsna.pce;
import xsna.ph;
import xsna.ph4;
import xsna.qcy;
import xsna.r5x0;
import xsna.reh;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s6s0;
import xsna.sy4;
import xsna.t0i;
import xsna.tce;
import xsna.tj50;
import xsna.tlo0;
import xsna.tq;
import xsna.ty4;
import xsna.uhe;
import xsna.va9;
import xsna.vl1;
import xsna.vrf;
import xsna.w6s0;
import xsna.wrp;
import xsna.wzs;
import xsna.x7g;
import xsna.yfb;
import xsna.ymb;
import xsna.ypf;
import xsna.yr5;
import xsna.za80;
import xsna.zak0;
import xsna.zmp0;
import xsna.zqc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0330, code lost:
    
        if (com.vk.voip.ui.c.r.H() != false) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v136, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        UserId userId;
        int i = 4;
        int i2 = 6;
        int i3 = 3;
        int i4 = 2;
        boolean z = true;
        int i5 = 0;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.g) obj).f((List) this.c);
                return s3q0.a;
            case 1:
                ph phVar = (ph) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                phVar.getFeature().C((bph0) obj);
                return s3q0.a;
            case 2:
                wzs wzsVar = (wzs) this.c;
                gw.a.getClass();
                wzsVar.invoke(gw.b, gw.c);
                return s3q0.a;
            case 3:
                h30 h30Var = (h30) this.c;
                ActionLink actionLink = (ActionLink) obj;
                Iterator it = h30Var.t.iterator();
                while (it.hasNext()) {
                    ((c30) it.next()).d0();
                }
                VideoFile videoFile = h30Var.c;
                io.reactivex.rxjava3.observers.a aVar = h30Var.m;
                if (aVar != null) {
                    aVar.dispose();
                }
                io.reactivex.rxjava3.core.q<Boolean> h = fxc0.B().T().h(videoFile.o0(), videoFile.I0(), actionLink.e);
                k30 k30Var = new k30(h30Var, actionLink);
                h.subscribe(k30Var);
                h30Var.m = k30Var;
                return s3q0.a;
            case 4:
                return Boolean.valueOf(epx.f((UserId) ((Pair) obj).d(), ((lu1) this.c).d));
            case 5:
                gw2 gw2Var = ((bw2) this.c).e;
                SpammerModel spammerModel = ((fw2) obj).c;
                gw2Var.getClass();
                return new yr5(spammerModel.b, j5g.O0(spammerModel.c.b), spammerModel.f, spammerModel.d, spammerModel.e);
            case 6:
                List list = (List) obj;
                com.vk.superapp.miniapps.picker.i iVar = ((AppsPickerFragment) this.c).S;
                if (iVar != null) {
                    iVar.setItems(list);
                }
                return s3q0.a;
            case 7:
                com.vk.articles.a aVar2 = (com.vk.articles.a) this.c;
                L.g("ArticleWebView", (Throwable) obj);
                com.vk.articles.a.d(aVar2);
                b.d dVar = new b.d("article_error");
                dVar.b("failed to get deviceInfo in 2 seconds", "message");
                dVar.e();
                return s3q0.a;
            case 8:
                ((ng4) this.c).j.b(new ph4.i(false));
                return s3q0.a;
            case 9:
                ty4 ty4Var = (ty4) this.c;
                ty4.a aVar3 = (ty4.a) obj;
                a.x xVar = io.reactivex.rxjava3.internal.functions.a.g;
                ngj0 ngj0Var = ty4Var.a;
                boolean z2 = aVar3.a;
                ClipGridParams.Data.Music music = aVar3.b;
                if (z2) {
                    MusicTrack musicTrack = music.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(musicTrack.c);
                    sb.append('_');
                    sb.append(musicTrack.b);
                    String sb2 = sb.toString();
                    return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(ngj0Var.e(Collections.singletonList(sb2)))).m(io.reactivex.rxjava3.android.schedulers.a.b()).h(new defpackage.d(new defpackage.c(i, ty4Var, music), i2)), new hv(new sy4(sb2, ty4Var, music, i5), i3))), xVar);
                }
                MusicTrack musicTrack2 = music.b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(musicTrack2.c);
                sb3.append('_');
                sb3.append(musicTrack2.b);
                String sb4 = sb3.toString();
                return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(ngj0Var.u(Collections.singletonList(sb4)))).m(io.reactivex.rxjava3.android.schedulers.a.b()).h(new jv(new ku1(i4, ty4Var, music), 5)), new gn0(new o83(sb4, ty4Var, music, z ? 1 : 0), i3))), xVar);
            case 10:
                l0c l0cVar = ((com.vk.auth.verification.base.a) this.c).p;
                (l0cVar != null ? l0cVar : null).a();
                return s3q0.a;
            case 11:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) this.c;
                ToggleManager.Sync sync = (ToggleManager.Sync) obj;
                int i6 = BaseDebugTogglesFragment.X;
                int i7 = sync == null ? -1 : BaseDebugTogglesFragment.a.$EnumSwitchMapping$0[sync.ordinal()];
                if (i7 == 1) {
                    RecyclerView recyclerView = baseDebugTogglesFragment.N;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    recyclerView.setVisibility(0);
                    VkSearchView vkSearchView = baseDebugTogglesFragment.O;
                    if (vkSearchView == null) {
                        vkSearchView = null;
                    }
                    vkSearchView.setVisibility(0);
                    ProgressBar progressBar = baseDebugTogglesFragment.S;
                    if (progressBar == null) {
                        progressBar = null;
                    }
                    f4m.j(progressBar);
                    VkButton vkButton = baseDebugTogglesFragment.T;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    f4m.j(vkButton);
                    VkButton vkButton2 = baseDebugTogglesFragment.U;
                    (vkButton2 != null ? vkButton2 : null).setVisibility(0);
                } else if (i7 == 2) {
                    baseDebugTogglesFragment.io();
                } else if (i7 == 3) {
                    baseDebugTogglesFragment.ho();
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseDebugTogglesFragment.ho();
                }
                return s3q0.a;
            case 12:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) this.c;
                CallParticipantsViewModel.b bVar = (CallParticipantsViewModel.b) obj;
                zmp0.a(cVar.h, new biq());
                bwt0.p0(cVar.m, bVar instanceof CallParticipantsViewModel.b.c);
                bwt0.p0(cVar.n, bVar instanceof CallParticipantsViewModel.b.a);
                bwt0.p0(cVar.k, bVar instanceof CallParticipantsViewModel.b.C2084b);
                return s3q0.a;
            case 13:
                r5x0.a aVar4 = ((va9) this.c).d;
                if (aVar4.a.s0()) {
                    aVar4.a.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 14:
                return CatalogSectionScreenState.a((CatalogSectionScreenState) obj, (CatalogSectionState) this.c, null, null, null, null, 30);
            case 15:
                ((zak0) ((noa) this.c).o).setValue((String) obj);
                return s3q0.a;
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i8 = ChannelFragment.a1;
                channelFragment.ro().k.g(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 17:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new gd0(i2, (ymb) this.c, (za80) obj));
                return s3q0.a;
            case 18:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                ArrayList arrayList = new ArrayList(c5g.u(m, 10));
                Iterator it2 = m.iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it2).b;
                    if (!listIterator.hasPrevious()) {
                        yVar.onSuccess(arrayList);
                        return s3q0.a;
                    }
                    ClipsDraftVk clipsDraftVk = (ClipsDraftVk) listIterator.previous();
                    ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                    String str = clipsDraftCommonData.b;
                    int i9 = clipsDraftCommonData.h;
                    String str2 = clipsDraftCommonData.j;
                    String str3 = clipsDraftCommonData.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a = wrp.a(clipsDraftCommonData.k);
                    TemplateDraftData templateDraftData = clipsDraftVk.c.i;
                    arrayList.add(new tce(str, str4, str2, i9, a, templateDraftData != null ? templateDraftData.b : null));
                }
            case 19:
                ((bzd) this.c).d.getClass();
                return s3q0.a;
            case 20:
                com.vk.clips.favorites.impl.ui.folders.content.f fVar = (com.vk.clips.favorites.impl.ui.folders.content.f) this.c;
                tj50.a aVar5 = (tj50.a) obj;
                int i10 = 19;
                g gVar = new g(fVar, i10);
                ao8 ao8Var = ao8.d;
                return new ClipsFavoriteFolderContentListViewState.a(aVar5.a(new vl1(fVar, i10), ao8Var), aVar5.a(gVar, ao8Var), aVar5.a(new i8(18), ao8Var));
            case 21:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) this.c).T(c.d.a.b);
                return s3q0.a;
            case 22:
                uhe uheVar = (uhe) this.c;
                if (((ClipsInterestsStatusProvider.Status) obj) != ClipsInterestsStatusProvider.Status.NEED_UPDATE) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                ix3 ix3Var = uheVar.d;
                ix3Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.c(new gx3(ix3Var)));
            case 23:
                zqc zqcVar = (zqc) obj;
                ypf T0 = ((vrf) this.c).a.T0();
                Object[] objArr = (T0 instanceof ypf.c) || (T0 instanceof ypf.a);
                zqc a2 = T0.a();
                char c = (a2 == null || a2.a != zqcVar.a) ? (char) 0 : (char) 1;
                if (objArr != true && c == 0) {
                    return T0;
                }
                if (zqcVar instanceof erc) {
                    return new ypf.d(zqcVar);
                }
                if (zqcVar instanceof drc) {
                    return new ypf.b(zqcVar, ((drc) zqcVar).b);
                }
                if (zqcVar instanceof arc) {
                    return new ypf.a(zqcVar);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                dgw dgwVar = (dgw) this.c;
                Bitmap bitmap = (Bitmap) obj;
                agw agwVar = (agw) ((zak0) dgwVar.b).getValue();
                if (!epx.f(agwVar != null ? ba2.a(agwVar) : null, bitmap)) {
                    ((zak0) dgwVar.b).setValue(new aa2(bitmap));
                }
                return s3q0.a;
            case 25:
                lds0 lds0Var = (lds0) this.c;
                int i11 = com.vk.attachpicker.collages.a.k1;
                lds0Var.onComplete();
                return s3q0.a;
            case 26:
                reh rehVar = (reh) this.c;
                Activity h2 = e3m.h(rehVar.itemView.getContext());
                VideoFile videoFile2 = rehVar.B;
                if (h2 != null && videoFile2 != null) {
                    Owner s = videoFile2.s();
                    if (s == null || (userId = s.b) == null) {
                        userId = UserId.d;
                    }
                    s6s0 s6s0Var = new s6s0(videoFile2, "live_videos_block", userId, null, false, null, false, false, false, null, null, null, null, false, null, false, null, false, null, null, null, false, 536870896);
                    if (((Boolean) rehVar.s.getValue()).booleanValue()) {
                        new w6s0(s6s0Var, null).e(h2);
                    } else {
                        new e6s0(h2, s6s0Var, null).c();
                    }
                }
                return s3q0.a;
            case 27:
                hrh hrhVar = (hrh) this.c;
                Throwable th = (Throwable) obj;
                awh awhVar = hrhVar.d0;
                awhVar.g3();
                if (hrhVar.c.d.isEmpty()) {
                    awhVar.V1();
                } else {
                    awhVar.Ij();
                }
                L.e(th);
                return s3q0.a;
            case 28:
                return new je90((ViewGroup) obj, 32, new pce((fyh) this.c, 11));
            default:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.c;
                p0i p0iVar = (p0i) obj;
                List<o0i> list2 = p0iVar.a;
                if (p0iVar.b) {
                    return s3q0.a;
                }
                if (list2.isEmpty()) {
                    VkPlaceholder vkPlaceholder = hVar.h;
                    vkPlaceholder.setVisibility(0);
                    vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_info_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12));
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i4, tq.h(tlo0.Companion, R.string.community_scheduled_clips_grid_empty_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.community_scheduled_clips_grid_empty_subtitle))));
                    vkPlaceholder.setBottom((VkPlaceholder.a) null);
                } else {
                    f4m.j(hVar.h);
                    CommunityScheduledClipsGridPaginatedView communityScheduledClipsGridPaginatedView = hVar.g;
                    communityScheduledClipsGridPaginatedView.setAlpha(1.0f);
                    communityScheduledClipsGridPaginatedView.f0();
                    RecyclerView.o layoutManager = communityScheduledClipsGridPaginatedView.getRecyclerView().getLayoutManager();
                    Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
                    ((t0i) hVar.k.getValue()).setItems(list2);
                    RecyclerView.o layoutManager2 = communityScheduledClipsGridPaginatedView.getRecyclerView().getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.onRestoreInstanceState(onSaveInstanceState);
                    }
                }
                return s3q0.a;
        }
    }
}
