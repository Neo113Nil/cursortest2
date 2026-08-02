package com.vk.im.engine.internal.api_commands.messages;

import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.clips.entrypoints.feature.ClipsEntryPointAnalyticsEvent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.renaming.d;
import com.vk.clips.sdk.shared.item.ads.c;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.actionlinks.ActionButtonStat;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.profile.community.suggestions.impl.ui.suggestions.g;
import com.vk.profile.core.scheduled_clips.d;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import defpackage.v;
import io.reactivex.rxjava3.internal.operators.single.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a3i;
import xsna.aa6;
import xsna.au5;
import xsna.az2;
import xsna.bgn;
import xsna.bn10;
import xsna.bsb;
import xsna.bwt0;
import xsna.by5;
import xsna.c1d0;
import xsna.c5g;
import xsna.dgh;
import xsna.dhr0;
import xsna.dob;
import xsna.dqu;
import xsna.e3a;
import xsna.epx;
import xsna.etv0;
import xsna.f4m;
import xsna.fh1;
import xsna.ftb;
import xsna.g20;
import xsna.gi4;
import xsna.gm9;
import xsna.h1e;
import xsna.i8f;
import xsna.iid0;
import xsna.isb;
import xsna.izs;
import xsna.j1e;
import xsna.j5g;
import xsna.jjc;
import xsna.jkq0;
import xsna.jw00;
import xsna.krv0;
import xsna.lj8;
import xsna.lr10;
import xsna.m6e;
import xsna.n7f;
import xsna.nt5;
import xsna.nv3;
import xsna.o20;
import xsna.ot5;
import xsna.ov3;
import xsna.p5h0;
import xsna.qxr;
import xsna.rt5;
import xsna.s3q0;
import xsna.s6h;
import xsna.st5;
import xsna.sv3;
import xsna.tpu;
import xsna.v0d;
import xsna.va9;
import xsna.w0d0;
import xsna.w8b;
import xsna.w9y;
import xsna.wzb;
import xsna.x2i;
import xsna.x3b;
import xsna.xaf;
import xsna.xmf;
import xsna.xn50;
import xsna.ya;
import xsna.ynb;
import xsna.zk70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.vk.core.view.components.text.VkText] */
    /* JADX WARN: Type inference failed for: r1v60, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Throwable cause;
        Throwable cause2;
        Throwable cause3;
        ChatInviteFragment.b bVar;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType eventType;
        int i = this.b;
        int i2 = 5;
        int i3 = 1;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                w9y w9yVar = (w9y) obj;
                MsgFromUser msgFromUser = ((b) obj2).b;
                if (msgFromUser.db()) {
                    ArrayList X1 = msgFromUser.X1();
                    w9yVar.d(Long.valueOf(((NestedMsg) j5g.Y(X1)).e), "peer_id");
                    ArrayList arrayList = new ArrayList(c5g.u(X1, 10));
                    Iterator it = X1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((NestedMsg) it.next()).d));
                    }
                    w9yVar.e(arrayList, "conversation_message_ids");
                }
                if (msgFromUser.p3()) {
                    w9yVar.b(Boolean.TRUE, "is_reply");
                    NestedMsg pa = msgFromUser.pa();
                    w9yVar.d(Long.valueOf(pa.e), "peer_id");
                    w9yVar.e(Collections.singletonList(Integer.valueOf(pa.d)), "conversation_message_ids");
                }
                return s3q0.a;
            case 1:
                VideoFile videoFile = (VideoFile) obj;
                return new AboutVideoItem.d0(((VideoFile) obj2).L8(), new AboutVideoItem.d0.a(videoFile.i0() ? new AboutVideoItem.d0.b.C1216b(videoFile.l1()) : AboutVideoItem.d0.b.a.a, videoFile.O9()));
            case 2:
                o20 o20Var = (o20) obj2;
                ActionButtonStat actionButtonStat = (ActionButtonStat) j5g.k0((List) obj);
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (actionButtonStat == null) {
                    o20Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
                    return s3q0.a;
                }
                int i4 = actionButtonStat.b;
                int i5 = actionButtonStat.c;
                if (i5 != 0) {
                    f = i4 / i5;
                }
                o20Var.a(f, i4, i5);
                return s3q0.a;
            case 3:
                AdminCommunitiesDataSource adminCommunitiesDataSource = (AdminCommunitiesDataSource) obj2;
                new dqu();
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(dqu.a((GroupsGroupFullDto) it2.next()));
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    adminCommunitiesDataSource.b.h0((Group) it3.next());
                }
                adminCommunitiesDataSource.c.set(true);
                return s3q0.a;
            case 4:
                ((c) obj2).B.a(AdsItemViewEvent.o.b);
                return s3q0.a;
            case 5:
                nv3.c cVar = (nv3.c) obj;
                ((ov3) obj2).a(new sv3(cVar.a, cVar.b));
                return s3q0.a;
            case 6:
                ((gi4) obj2).G.getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 7:
                rt5 rt5Var = (rt5) obj2;
                au5.a.InterfaceC2575a interfaceC2575a = (au5.a.InterfaceC2575a) obj;
                if (interfaceC2575a instanceof au5.a.InterfaceC2575a.c) {
                    androidx.constraintlayout.widget.Group group = rt5Var.p1;
                    if (group == null) {
                        group = null;
                    }
                    group.setVisibility(4);
                    ?? r1 = rt5Var.q1;
                    (r1 != 0 ? r1 : null).setVisibility(0);
                } else if (interfaceC2575a instanceof au5.a.InterfaceC2575a.b) {
                    androidx.constraintlayout.widget.Group group2 = rt5Var.p1;
                    if (group2 == null) {
                        group2 = null;
                    }
                    group2.setVisibility(0);
                    FrameLayout frameLayout = rt5Var.q1;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    f4m.j(frameLayout);
                    VkSimpleButton vkSimpleButton = rt5Var.n1;
                    if (vkSimpleButton == null) {
                        vkSimpleButton = null;
                    }
                    vkSimpleButton.setMode(VkButton.Mode.Secondary);
                    vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
                    vkSimpleButton.setSize(VkButton.Size.Large);
                    vkSimpleButton.setText(rt5Var.getText(R.string.community_avito_error_view_retry));
                    jjc.g(vkSimpleButton, new g20(rt5Var, i2));
                    VKImageView vKImageView = rt5Var.k1;
                    if (vKImageView == null) {
                        vKImageView = null;
                    }
                    TypedValue typedValue = krv0.a;
                    vKImageView.setImageResource(epx.f(krv0.i(vKImageView.getContext()), Boolean.TRUE) ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56);
                    VkText vkText = rt5Var.l1;
                    if (vkText == null) {
                        vkText = null;
                    }
                    vkText.setText(rt5Var.getText(R.string.community_avito_error_view_title));
                    ?? r12 = rt5Var.m1;
                    (r12 != 0 ? r12 : null).setText(rt5Var.getText(R.string.community_avito_error_view_description));
                } else {
                    int i6 = rt5.r1;
                    if (!(interfaceC2575a instanceof au5.a.InterfaceC2575a.C2576a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ot5 ot5Var = ((au5.a.InterfaceC2575a.C2576a) interfaceC2575a).a;
                    androidx.constraintlayout.widget.Group group3 = rt5Var.p1;
                    if (group3 == null) {
                        group3 = null;
                    }
                    group3.setVisibility(0);
                    FrameLayout frameLayout2 = rt5Var.q1;
                    if (frameLayout2 == null) {
                        frameLayout2 = null;
                    }
                    f4m.j(frameLayout2);
                    VKImageView vKImageView2 = rt5Var.k1;
                    if (vKImageView2 == null) {
                        vKImageView2 = null;
                    }
                    if (!vKImageView2.isLaidOut() || vKImageView2.isLayoutRequested()) {
                        vKImageView2.addOnLayoutChangeListener(new st5(rt5Var, ot5Var));
                    } else {
                        VKImageView vKImageView3 = rt5Var.k1;
                        if (vKImageView3 == null) {
                            vKImageView3 = null;
                        }
                        ImageSize Cb = ot5Var.a.Cb(vKImageView3.getWidth(), true, false);
                        if (Cb != null && (str = Cb.d.d) != null) {
                            VKImageView vKImageView4 = rt5Var.k1;
                            if (vKImageView4 == null) {
                                vKImageView4 = null;
                            }
                            vKImageView4.load(str);
                        }
                    }
                    VkText vkText2 = rt5Var.l1;
                    if (vkText2 == null) {
                        vkText2 = null;
                    }
                    vkText2.setText(ot5Var.b);
                    VkText vkText3 = rt5Var.m1;
                    if (vkText3 == null) {
                        vkText3 = null;
                    }
                    vkText3.setText(ot5Var.c);
                    VkSimpleButton vkSimpleButton2 = rt5Var.n1;
                    VkSimpleButton vkSimpleButton3 = vkSimpleButton2 != null ? vkSimpleButton2 : null;
                    ot5.a aVar = ot5Var.d;
                    if (aVar != null) {
                        vkSimpleButton3.setMode(VkButton.Mode.Primary);
                        vkSimpleButton3.setAppearance(VkButton.Appearance.Accent);
                        vkSimpleButton3.setSize(VkButton.Size.Large);
                        vkSimpleButton3.setVisibility(0);
                        vkSimpleButton3.setText(aVar.a);
                        jjc.g(vkSimpleButton3, new az2(i3, rt5Var, aVar));
                    } else {
                        f4m.j(vkSimpleButton3);
                    }
                    xn50.a.c(rt5Var, nt5.a.b.b);
                }
                return s3q0.a;
            case 8:
                lj8 lj8Var = (lj8) obj2;
                lj8Var.j.setItems(EmptyList.b);
                lj8Var.d.setRefreshing(false);
                lj8Var.a((p5h0) lj8Var.m.getValue());
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((va9) obj2).e());
            case 10:
                int i7 = ChannelMonetizationFragment.T;
                ((ChannelMonetizationFragment) obj2).getFeature().C((x3b) obj);
                return s3q0.a;
            case 11:
                w8b w8bVar = (w8b) obj2;
                Channel channel = (Channel) obj;
                return (channel.z == ChannelType.COMMUNITY_CHANNEL ? w8bVar.a.C(w8bVar, new tpu(Collections.singletonList(channel.A), Source.CACHE, z, 8)) : a0.b).l(new aa6(new fh1(i2, channel, w8bVar), i2));
            case 12:
                return ynb.o((ynb) obj2, (dob.f) obj);
            case 13:
                bsb bsbVar = (bsb) obj2;
                Throwable th = (Throwable) obj;
                isb Y0 = bsbVar.Y0();
                if (!((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) || (cause = th.getCause()) == null) {
                    cause = th;
                } else if (((cause instanceof ImTaskExecutionException) || (cause instanceof ApiArgNotFoundException)) && (cause2 = cause.getCause()) != null) {
                    cause = (((cause2 instanceof ImTaskExecutionException) || (cause2 instanceof ApiArgNotFoundException)) && (cause3 = cause2.getCause()) != null) ? wzb.a.b(cause3) : cause2;
                }
                View view = Y0.f;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(4);
                ?? r3 = Y0.g;
                (r3 != 0 ? r3 : null).setVisibility(0);
                zk70.c(zk70.a(cause));
                int i8 = bsb.c.$EnumSwitchMapping$0[zk70.a(th).ordinal()];
                if ((i8 == 1 || i8 == 2) && (bVar = bsbVar.o) != null) {
                    bVar.b();
                }
                return s3q0.a;
            case 14:
                ((ftb) obj2).e.N();
                return s3q0.a;
            case 15:
                ((ClassifiedsCatalogBaseRootVh) obj2).p0((jw00.c) ((Map) obj).get(jw00.c.c));
                return s3q0.a;
            case 16:
                ModernSearchView modernSearchView = ((ClipSearchRootVh) obj2).z.b.k;
                if (modernSearchView != null) {
                    modernSearchView.f();
                    modernSearchView.c(0L);
                }
                return s3q0.a;
            case 17:
                final ClipsControlsView clipsControlsView = (ClipsControlsView) obj2;
                int i9 = ClipsControlsView.P;
                if (((View) obj).isClickable()) {
                    float clipsCurrentSpeed = clipsControlsView.getClipsCurrentSpeed();
                    final ClipsControlsView.a aVar2 = clipsControlsView.t;
                    final View[] e = bn10.e(clipsControlsView.C);
                    int length = e.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        final View view2 = e[i10];
                        if (view2 == null || view2.getId() != R.id.camera_clips_speedbar_close_btn) {
                            Object tag = view2 != null ? view2.getTag() : null;
                            String str2 = tag instanceof String ? (String) tag : null;
                            if (str2 != null) {
                                final VkText vkText4 = view2 instanceof VkText ? (VkText) view2 : null;
                                if (vkText4 != null) {
                                    final float parseFloat = Float.parseFloat(str2);
                                    ((VkText) view2).setBackground(parseFloat == clipsCurrentSpeed ? dhr0.t.a(R.drawable.bg_white_rounded_16) : null);
                                    vkText4.setTextColor(parseFloat == clipsCurrentSpeed ? -16777216 : -1);
                                    if (parseFloat == clipsCurrentSpeed) {
                                        bwt0.i0(view2, new by5(6, view2, clipsControlsView));
                                    } else {
                                        bwt0.i0(view2, new izs() { // from class: xsna.eod
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj3) {
                                                int i11 = ClipsControlsView.P;
                                                VkText vkText5 = (VkText) view2;
                                                if (vkText5.isClickable()) {
                                                    ClipsControlsView clipsControlsView2 = clipsControlsView;
                                                    float f2 = parseFloat;
                                                    clipsControlsView2.setClipsSpeedbtnAttributes(f2);
                                                    vkText5.setBackground(dhr0.t.a(R.drawable.bg_white_rounded_16));
                                                    vkText4.setTextColor(-16777216);
                                                    for (View view3 : e) {
                                                        if ((view3 == null || view3.getId() != R.id.camera_clips_speedbar_close_btn) && (view3 == null || view3.getId() != vkText5.getId())) {
                                                            if (view3 != null) {
                                                                view3.setBackground(null);
                                                            }
                                                            VkText vkText6 = view3 instanceof VkText ? (VkText) view3 : null;
                                                            if (vkText6 != null) {
                                                                vkText6.setTextColor(-1);
                                                            }
                                                        }
                                                    }
                                                    clipsControlsView2.P4();
                                                    ClipsControlsView.a aVar3 = aVar2;
                                                    if (aVar3 != null) {
                                                        aVar3.c(f2);
                                                    }
                                                }
                                                return s3q0.a;
                                            }
                                        });
                                    }
                                }
                            }
                        } else {
                            bwt0.i0(view2, new ya(view2, clipsControlsView));
                        }
                    }
                    if (aVar2 != null) {
                        aVar2.d(true);
                    }
                    f4m.j(clipsControlsView.z);
                    gm9 gm9Var = clipsControlsView.u;
                    if (gm9Var != null) {
                        gm9Var.c();
                    }
                }
                return s3q0.a;
            case 18:
                Pair pair = (Pair) obj;
                File file = (File) pair.d();
                jkq0 jkq0Var = (jkq0) pair.g();
                ((h1e) obj2).getClass();
                return h1e.a(file, jkq0Var);
            case 19:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj2;
                ClipsEntryPointAnalyticsEvent clipsEntryPointAnalyticsEvent = (ClipsEntryPointAnalyticsEvent) obj;
                int i11 = ClipsEntryPointsFragment.i0;
                if (!(clipsEntryPointAnalyticsEvent instanceof ClipsEntryPointAnalyticsEvent.TabSelectedEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsEntryPointsParams jo = clipsEntryPointsFragment.jo();
                if (jo == null || (creationEntryPoint = jo.b) == null) {
                    creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
                }
                j1e j1eVar = (j1e) clipsEntryPointsFragment.X.getValue();
                int i12 = ClipsEntryPointsFragment.c.$EnumSwitchMapping$0[((ClipsEntryPointAnalyticsEvent.TabSelectedEvent) clipsEntryPointAnalyticsEvent).a.ordinal()];
                if (i12 == 1) {
                    eventType = MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.ENTER_DRAFTS;
                } else if (i12 == 2) {
                    eventType = MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.ENTER_TEMPLATE;
                } else {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return s3q0.a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.ENTER_TRENDS;
                }
                MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType eventType2 = eventType;
                j1eVar.getClass();
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIAPICKER_MEDIA, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipPublishItem(eventType2, new MobileOfficialAppsClipsStat$ClipsCreateContext(j1eVar.a(), creationEntryPoint), null, null, null, null, null, null, null, null, null, 2044, null), 3)).q();
                return s3q0.a;
            case 20:
                ((com.vk.clips.favorites.impl.ui.folders.renaming.c) obj2).T(d.b.e.b);
                return s3q0.a;
            case 21:
                m6e.a aVar3 = (m6e.a) obj2;
                qxr qxrVar = (qxr) obj;
                Iterator it4 = j5g.O0((ArrayList) m6e.this.g.b).iterator();
                while (it4.hasNext()) {
                    ((v0d) it4.next()).c(qxrVar);
                }
                bgn bgnVar = aVar3.h;
                if (bgnVar != null) {
                    io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) bgnVar.b;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    bgnVar.b = null;
                    w0d0 w0d0Var = (w0d0) bgnVar.a;
                    xmf xmfVar = w0d0Var.c;
                    if (xmfVar.d()) {
                        w0d0Var.a(qxrVar.c);
                    } else {
                        bgnVar.b = xmfVar.c().o(io.reactivex.rxjava3.android.schedulers.a.b()).g(new c1d0(bgnVar, qxrVar)).subscribe();
                    }
                }
                return s3q0.a;
            case 22:
                i8f i8fVar = (i8f) obj2;
                List list2 = (List) obj;
                List<n7f> list3 = i8fVar.i;
                if (list3 == null) {
                    i8fVar.i = null;
                    return list2;
                }
                ArrayList X0 = j5g.X0(list3, list2);
                ArrayList arrayList3 = new ArrayList(c5g.u(X0, 10));
                Iterator it5 = X0.iterator();
                while (it5.hasNext()) {
                    Pair pair2 = (Pair) it5.next();
                    n7f n7fVar = (n7f) pair2.d();
                    lr10 lr10Var = (lr10) pair2.g();
                    if (!(lr10Var instanceof lr10.b)) {
                        if (!(lr10Var instanceof lr10.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lr10Var = new lr10.a(lr10Var.a, n7fVar.b.d());
                    }
                    arrayList3.add(lr10Var);
                }
                return arrayList3;
            case 23:
                ((etv0) obj).b(false);
                ((View) obj2).callOnClick();
                return s3q0.a;
            case 24:
                ((v) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 25:
                x2i x2iVar = ((s6h) obj2).f;
                if (x2iVar != null) {
                    x2iVar.mn(a3i.c.a);
                }
                return s3q0.a;
            case 26:
                ((dgh) obj2).K((xaf) obj);
                return s3q0.a;
            case 27:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = ((CommunityReviewsFragment) obj2).b0;
                if (linearLayout != null) {
                    bwt0.p0(linearLayout, booleanValue);
                }
                return s3q0.a;
            case 28:
                ((com.vk.profile.core.scheduled_clips.c) obj2).T(d.a.b);
                return s3q0.a;
            default:
                ((g) obj2).f.setVisible(((Boolean) obj).booleanValue());
                return s3q0.a;
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
