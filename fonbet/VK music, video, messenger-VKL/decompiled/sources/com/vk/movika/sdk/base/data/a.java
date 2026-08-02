package com.vk.movika.sdk.base.data;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenGroupDto;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenGroupPhotoDto;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenResponseDto;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenScreenshotDto;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.channels.impl.channel_screen.footer.d;
import com.vk.channels.impl.channel_screen.footer.e;
import com.vk.channels.impl.channel_screen.footer.j;
import com.vk.channels.impl.comments.g;
import com.vk.clips.coauthors.list.common.mvi.ClipCoauthorListLaunchType;
import com.vk.clips.playlists.folders.root.h;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.playlists.ui.picker.e;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.video.f;
import com.vk.libvideo.bottomsheet.about.delegate.w;
import com.vk.movika.sdk.base.data.dto.actions.ContinuePlaybackActionDto;
import com.vk.movika.sdk.base.data.dto.actions.ExpectActionDto;
import com.vk.movika.sdk.base.data.dto.actions.OpenURIActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetDefaultBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetMaxWeightBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetMinWeightBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetNextBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetRandomBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetWeightlessRandomBranchActionDto;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.superapp.browser.internal.ui.menu.action.c;
import com.vk.superapp.browser.internal.ui.menu.action.i;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import one.video.player.OneVideoPlayer;
import xsna.aiq0;
import xsna.am;
import xsna.awt0;
import xsna.azb;
import xsna.b2;
import xsna.b4;
import xsna.bpn0;
import xsna.bzb0;
import xsna.c4;
import xsna.c5g;
import xsna.c9d;
import xsna.cwb0;
import xsna.dcy;
import xsna.dyz0;
import xsna.epx;
import xsna.f4m;
import xsna.foc;
import xsna.fpf0;
import xsna.ftt;
import xsna.g1;
import xsna.g9e;
import xsna.goc;
import xsna.gzs;
import xsna.h270;
import xsna.h5e;
import xsna.h7v;
import xsna.hmi0;
import xsna.hni0;
import xsna.hr80;
import xsna.i34;
import xsna.id8;
import xsna.iiq0;
import xsna.izs;
import xsna.j5g;
import xsna.jr4;
import xsna.loh0;
import xsna.lsx0;
import xsna.n7b;
import xsna.noj0;
import xsna.o8e;
import xsna.o8y;
import xsna.otf;
import xsna.pla;
import xsna.poc;
import xsna.pta;
import xsna.pve;
import xsna.q7b;
import xsna.qr4;
import xsna.qv4;
import xsna.r1h;
import xsna.rfc;
import xsna.rmi0;
import xsna.rn00;
import xsna.ryb;
import xsna.rzq0;
import xsna.s3q0;
import xsna.sa80;
import xsna.syf;
import xsna.t5e;
import xsna.tho0;
import xsna.tte;
import xsna.tzp0;
import xsna.us6;
import xsna.ute;
import xsna.uz5;
import xsna.vu4;
import xsna.w13;
import xsna.w9y;
import xsna.wf8;
import xsna.wow;
import xsna.wsz;
import xsna.wvw;
import xsna.xyb;
import xsna.y1;
import xsna.yh8;
import xsna.z3;
import xsna.zak0;
import xsna.zg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v113, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        List<AppsGetAboutScreenGroupPhotoDto> g;
        AppsGetAboutScreenGroupPhotoDto appsGetAboutScreenGroupPhotoDto;
        UserId d;
        n.a aVar;
        Object obj3;
        Object parcelable;
        int i = this.b;
        String str = null;
        str = null;
        str = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                o8y o8yVar = (o8y) obj;
                hni0 hni0Var = new hni0();
                dyz0 dyz0Var = new dyz0(fpf0.a(com.vk.movika.sdk.base.data.dto.actions.a.class));
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    ((com.vk.movika.sdk.base.data.dto.a) it.next()).getClass();
                    dyz0Var.c(null, null);
                }
                dyz0Var.c(fpf0.a(ContinuePlaybackActionDto.class), ContinuePlaybackActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(OpenURIActionDto.class), OpenURIActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetDefaultBranchActionDto.class), SetDefaultBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetMaxWeightBranchActionDto.class), SetMaxWeightBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetMinWeightBranchActionDto.class), SetMinWeightBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetNextBranchActionDto.class), SetNextBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetRandomBranchActionDto.class), SetRandomBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(SetWeightlessRandomBranchActionDto.class), SetWeightlessRandomBranchActionDto.Companion.serializer());
                dyz0Var.c(fpf0.a(ExpectActionDto.class), ExpectActionDto.Companion.serializer());
                Iterator it2 = ((ArrayList) dyz0Var.b).iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    dcy dcyVar = (dcy) pair.d();
                    KSerializer kSerializer = (KSerializer) pair.g();
                    rfc rfcVar = (rfc) dyz0Var.a;
                    String f = kSerializer.getDescriptor().f();
                    HashMap hashMap = hni0Var.b;
                    Object obj5 = hashMap.get(rfcVar);
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap.put(rfcVar, hashMap2);
                        obj6 = hashMap2;
                    }
                    Map map = (Map) obj6;
                    KSerializer kSerializer2 = (KSerializer) map.get(dcyVar);
                    HashMap hashMap3 = hni0Var.d;
                    Object obj7 = hashMap3.get(rfcVar);
                    if (obj7 == null) {
                        HashMap hashMap4 = new HashMap();
                        hashMap3.put(rfcVar, hashMap4);
                        obj7 = hashMap4;
                    }
                    Map map2 = (Map) obj7;
                    if (kSerializer2 != null) {
                        if (!kSerializer2.equals(kSerializer)) {
                            throw new rmi0("Serializer for " + dcyVar + " already registered in the scope of " + rfcVar);
                        }
                    }
                    KSerializer kSerializer3 = (KSerializer) map2.get(f);
                    if (kSerializer3 != null) {
                        Iterator it3 = rn00.w((Map) hashMap.get(rfcVar)).a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (((Map.Entry) next).getValue() == kSerializer3) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + rfcVar + "' have the same serial name '" + f + "': '" + dcyVar + "' and '" + ((Map.Entry) obj2) + '\'');
                    }
                    map.put(dcyVar, kSerializer);
                    map2.put(f, kSerializer);
                }
                o8yVar.l = new hmi0(hni0Var.a, hni0Var.b, hni0Var.c, hni0Var.d, hni0Var.e, false);
                o8yVar.h = "type";
                o8yVar.c = true;
                o8yVar.d = true;
                return s3q0.a;
            case 1:
                g1 g1Var = (g1) obj4;
                AppsGetAboutScreenResponseDto appsGetAboutScreenResponseDto = (AppsGetAboutScreenResponseDto) obj;
                String title = appsGetAboutScreenResponseDto.getTitle();
                String j = appsGetAboutScreenResponseDto.j();
                String f2 = appsGetAboutScreenResponseDto.f();
                String str2 = (f2 == null && (f2 = appsGetAboutScreenResponseDto.e()) == null) ? "" : f2;
                List<AppsGetAboutScreenScreenshotDto> i2 = appsGetAboutScreenResponseDto.i();
                ArrayList arrayList = new ArrayList(c5g.u(i2, 10));
                for (AppsGetAboutScreenScreenshotDto appsGetAboutScreenScreenshotDto : i2) {
                    ((y1) g1Var.i.getValue()).getClass();
                    arrayList.add(new z3(appsGetAboutScreenScreenshotDto.getUrl(), appsGetAboutScreenScreenshotDto.getWidth(), appsGetAboutScreenScreenshotDto.getHeight()));
                }
                boolean z = appsGetAboutScreenResponseDto.d() != null;
                AppsGetAboutScreenGroupDto d2 = appsGetAboutScreenResponseDto.d();
                long j2 = (d2 == null || (d = d2.d()) == null) ? 0L : d.b;
                AppsGetAboutScreenGroupDto d3 = appsGetAboutScreenResponseDto.d();
                String f3 = d3 != null ? d3.f() : null;
                String str3 = f3 == null ? "" : f3;
                AppsGetAboutScreenGroupDto d4 = appsGetAboutScreenResponseDto.d();
                String e = d4 != null ? d4.e() : null;
                String str4 = e == null ? "" : e;
                AppsGetAboutScreenGroupDto d5 = appsGetAboutScreenResponseDto.d();
                if (d5 != null && (g = d5.g()) != null && (appsGetAboutScreenGroupPhotoDto = (AppsGetAboutScreenGroupPhotoDto) j5g.i0(g)) != null) {
                    str = appsGetAboutScreenGroupPhotoDto.getUrl();
                }
                String str5 = str == null ? "" : str;
                AppsGetAboutScreenGroupDto d6 = appsGetAboutScreenResponseDto.d();
                boolean i3 = d6 != null ? d6.i() : false;
                String d7 = appsGetAboutScreenResponseDto.g().d();
                String str6 = d7 == null ? "" : d7;
                String e2 = appsGetAboutScreenResponseDto.g().e();
                g1Var.T(new b2.c(title, str2, j, arrayList, z, j2, str5, str3, str4, i3, str6, e2 == null ? "" : e2));
                return s3q0.a;
            case 2:
                w.a aVar2 = (w.a) obj4;
                noj0 noj0Var = aVar2.v;
                if (noj0Var == null) {
                    return s3q0.a;
                }
                c4 c4Var = aVar2.l;
                VideoFile videoFile = noj0Var.a;
                h270 autoPlayDelegate = aVar2.p.getAutoPlayDelegate();
                int i4 = w.a.C1221a.$EnumSwitchMapping$0[aVar2.m.ordinal()];
                c4Var.d(new b4.z(videoFile, autoPlayDelegate, i4 != 1 ? i4 != 2 ? CommonVideoStat$TypeScreenMode.PREVIEW : CommonVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE : CommonVideoStat$TypeScreenMode.DISCOVERY));
                return s3q0.a;
            case 3:
                c cVar = (c) obj4;
                Pair pair2 = (Pair) obj;
                String str7 = (String) pair2.d();
                cVar.p = (List) pair2.g();
                cVar.r = true;
                cVar.k = true;
                cVar.o = str7;
                cVar.f();
                List<? extends i> list = cVar.p;
                if ((list == null || list.isEmpty()) && (aVar = cVar.e) != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 4:
                com.vk.superapp.advertisement.b bVar = (com.vk.superapp.advertisement.b) obj4;
                AdvertisementConfig advertisementConfig = (AdvertisementConfig) obj;
                bVar.i.set(advertisementConfig);
                bVar.g.onNext(advertisementConfig);
                return s3q0.a;
            case 5:
                awt0.r((am) obj, ((w13) obj4).itemView.getContext());
                return s3q0.a;
            case 6:
                jr4 jr4Var = (jr4) obj4;
                i34 i34Var = (i34) obj;
                lsx0 lsx0Var = (Msg) i34Var.b.a();
                lsx0 b = i34Var.b();
                lsx0 lsx0Var2 = lsx0Var == null ? b : lsx0Var;
                PinnedMsg pinnedMsg = lsx0Var2 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) lsx0Var2 : null;
                if (lsx0Var == null) {
                    lsx0Var = b;
                }
                lsx0 lsx0Var3 = lsx0Var != null ? lsx0Var : null;
                if (lsx0Var3 == null || pinnedMsg == null || !pinnedMsg.S0()) {
                    return s3q0.a;
                }
                jr4Var.l.b(i34Var);
                AttachAudioMsg a7 = pinnedMsg.a7();
                if (a7 != null) {
                    List<String> list2 = qr4.a;
                    qr4.c(jr4Var.k, hr80.D(a7, lsx0Var3, i34Var.c));
                }
                return s3q0.a;
            case 7:
                qv4 qv4Var = (qv4) obj;
                vu4.c cVar2 = ((vu4) obj4).E;
                ArrayList arrayList2 = cVar2.a;
                if (qv4Var instanceof qv4.c) {
                    arrayList2.add(cVar2.a(qv4Var, ""));
                } else if (qv4Var instanceof qv4.d) {
                    vu4.d dVar = (vu4.d) j5g.k0(arrayList2);
                    qv4 qv4Var2 = dVar != null ? dVar.a : null;
                    qv4.d dVar2 = qv4Var2 instanceof qv4.d ? (qv4.d) qv4Var2 : null;
                    if (dVar2 == null) {
                        arrayList2.add(cVar2.a(qv4Var, ""));
                    } else if (dVar2.g != ((qv4.d) qv4Var).g) {
                        arrayList2.add(cVar2.a(qv4Var, ""));
                    }
                } else if (qv4Var instanceof qv4.b) {
                    vu4.d dVar3 = (vu4.d) j5g.k0(arrayList2);
                    qv4 qv4Var3 = dVar3 != null ? dVar3.a : null;
                    qv4.b bVar2 = qv4Var3 instanceof qv4.b ? (qv4.b) qv4Var3 : null;
                    if (bVar2 == null) {
                        arrayList2.add(cVar2.a(qv4Var, ""));
                    } else if (bVar2.g != ((qv4.b) qv4Var).g) {
                        arrayList2.add(cVar2.a(qv4Var, ""));
                    }
                }
                return s3q0.a;
            case 8:
                ImageList imageList = (ImageList) obj4;
                int intValue = ((Integer) obj).intValue();
                if (imageList != null) {
                    return ImageList.Eb(intValue, intValue, imageList.b);
                }
                return null;
            case 9:
                BalanceFragment balanceFragment = (BalanceFragment) obj4;
                int i5 = BalanceFragment.i0;
                uz5 uz5Var = (uz5) balanceFragment.S;
                if (uz5Var != null) {
                    uz5Var.refresh();
                }
                View view = balanceFragment.Y;
                if (view == null) {
                    view = null;
                }
                f4m.j(view);
                ProgressBar progressBar = balanceFragment.X;
                (progressBar != null ? progressBar : null).setVisibility(0);
                return s3q0.a;
            case 10:
                List<BaseAvatarPickerActivity.ImageSourceAction> list3 = BaseAvatarPickerActivity.f;
                ((BaseAvatarPickerActivity) obj4).O1();
                return s3q0.a;
            case 11:
                ((us6) obj4).o1.d(((View) obj).getContext());
                return s3q0.a;
            case 12:
                id8 id8Var = (id8) obj4;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                Photo photo = extendedUserProfile.A;
                if (!extendedUserProfile.e()) {
                    photo = null;
                }
                String str8 = extendedUserProfile.n;
                if (str8 == null || !extendedUserProfile.e()) {
                    str8 = null;
                }
                id8Var.d(photo, str8);
                id8Var.c(extendedUserProfile.n0 ? extendedUserProfile.a.O : null);
                pta.a.c cVar3 = new pta.a.c(extendedUserProfile.g1);
                if (!id8Var.c.a.a()) {
                    id8Var.e2(new aiq0.d.a(cVar3));
                }
                id8Var.e2(new aiq0.d.b(cVar3));
                id8Var.e2(new iiq0(extendedUserProfile));
                return s3q0.a;
            case 13:
                ((wf8) obj4).e();
                return s3q0.a;
            case 14:
                yh8 yh8Var = (yh8) obj4;
                yh8Var.b(yh8Var.q);
                return s3q0.a;
            case 15:
                ((com.vk.channels.impl.comments.b) obj4).n.clear();
                return new g(Collections.singletonList(wsz.b), null, null, false);
            case 16:
                d dVar4 = (d) obj4;
                e eVar = (e) obj;
                if (eVar instanceof e.a) {
                    dVar4.n(new j.c(((e.a) eVar).a));
                } else {
                    if (!(eVar instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar4.n(j.d.a);
                }
                return s3q0.a;
            case 17:
                int i6 = q7b.l1;
                ((q7b) obj4).getFeature().C((n7b) obj);
                return s3q0.a;
            case 18:
                azb azbVar = ((xyb) obj4).A;
                if (azbVar != null) {
                    bzb0 a = azbVar.a();
                    ryb rybVar = azbVar.h;
                    rybVar.getClass();
                    a.c(new cwb0.v0(new DialogExt(rybVar.j, rybVar.k)), new zg(azbVar, 20));
                }
                return s3q0.a;
            case 19:
                f fVar = (f) obj4;
                if (!((ftt.b) obj).c.isEmpty()) {
                    fVar.invoke();
                }
                return s3q0.a;
            case 20:
                ClassifiedsCatalogSimpleRootVh classifiedsCatalogSimpleRootVh = (ClassifiedsCatalogSimpleRootVh) obj4;
                sa80 sa80Var = (sa80) obj;
                classifiedsCatalogSimpleRootVh.Q.N6(sa80Var.a);
                classifiedsCatalogSimpleRootVh.o0(sa80Var.a);
                return s3q0.a;
            case 21:
                poc pocVar = (poc) obj4;
                gzs gzsVar = (gzs) obj;
                tzp0.c.a aVar3 = poc.l1;
                ClipVideoFile clipVideoFile = (ClipVideoFile) pocVar.i1.getValue();
                h7v h7vVar = (h7v) pocVar.g1.getValue();
                syf syfVar = pocVar.k1;
                Bundle requireArguments = pocVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("launch_type", ClipCoauthorListLaunchType.class);
                    obj3 = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("launch_type");
                    obj3 = (ClipCoauthorListLaunchType) (parcelable2 instanceof ClipCoauthorListLaunchType ? parcelable2 : null);
                }
                ClipCoauthorListLaunchType clipCoauthorListLaunchType = (ClipCoauthorListLaunchType) obj3;
                if (clipCoauthorListLaunchType == null) {
                    clipCoauthorListLaunchType = ClipCoauthorListLaunchType.Viewer;
                }
                return new foc(new goc(gzsVar, clipVideoFile, h7vVar, syfVar, clipCoauthorListLaunchType));
            case 22:
                ((c9d) obj4).q();
                ((OneVideoPlayer) obj).resume();
                return s3q0.a;
            case 23:
                ((h5e) obj4).b.d(t5e.m.a, null);
                return s3q0.a;
            case 24:
                o8e o8eVar = (o8e) obj4;
                w9y w9yVar = (w9y) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(o8eVar.b.b);
                sb.append('_');
                sb.append(o8eVar.c);
                w9yVar.e(sb.toString(), "id");
                w9yVar.d(Long.valueOf(o8eVar.d / 1000), "ts");
                o8e.a aVar4 = o8eVar.e;
                if (epx.f(aVar4, o8e.a.b.a)) {
                    w9yVar.e("like", "type");
                } else if (epx.f(aVar4, o8e.a.C3443a.a)) {
                    w9yVar.e("dislike", "type");
                } else if (epx.f(aVar4, o8e.a.c.a)) {
                    w9yVar.e("share", "type");
                } else {
                    if (!(aVar4 instanceof o8e.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w9yVar.e("watch_time", "type");
                    o8e.a.d dVar5 = (o8e.a.d) aVar4;
                    w9yVar.c(Integer.valueOf(dVar5.a), "dur");
                    w9yVar.c(Integer.valueOf(dVar5.b), "tvt");
                }
                return s3q0.a;
            case 25:
                com.vk.clips.playlists.ui.picker.b bVar3 = (com.vk.clips.playlists.ui.picker.b) obj4;
                bVar3.T(new c.a(false));
                bVar3.l.b(new e.a(pve.a));
                return s3q0.a;
            case 26:
                tte tteVar = (tte) obj4;
                ute uteVar = (ute) obj;
                tte.c cVar4 = tte.o1;
                if (uteVar instanceof ute.a) {
                    io.reactivex.rxjava3.subjects.f<h> fVar2 = g9e.a;
                    g9e.a.onNext(new h.a(((ute.a) uteVar).a));
                } else if (uteVar instanceof ute.b) {
                    tteVar.hide();
                } else if (uteVar instanceof ute.d) {
                    ClipsPlaylist clipsPlaylist = ((ute.d) uteVar).a;
                    tteVar.bo(clipsPlaylist, true);
                    g9e.a.onNext(new h.c(clipsPlaylist));
                } else {
                    if (!(uteVar instanceof ute.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipsPlaylist clipsPlaylist2 = ((ute.c) uteVar).a;
                    tteVar.bo(clipsPlaylist2, false);
                    g9e.a.onNext(new h.b(clipsPlaylist2));
                }
                return s3q0.a;
            case 27:
                otf otfVar = (otf) obj4;
                ((Boolean) obj).getClass();
                int i7 = ClipsWrapperFragment.Q0;
                bpn0 bpn0Var = pla.a;
                ((wvw) (bpn0Var != null ? bpn0Var : null).getValue()).b().b(otfVar.b);
                return s3q0.a;
            case 28:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) obj4;
                communitiesSearchTopBarVh.b.invoke(new a.g(((tho0) ((zak0) communitiesSearchTopBarVh.g).getValue()).a.c));
                return s3q0.a;
            default:
                ((rzq0) obj).b(new wow(((loh0.d.b) obj4).c), r1h.a.b);
                return s3q0.a;
        }
    }
}
