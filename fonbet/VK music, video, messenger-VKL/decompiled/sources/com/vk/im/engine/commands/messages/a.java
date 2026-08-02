package com.vk.im.engine.commands.messages;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeBannerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeHashtagInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeStyleDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeStyleHeaderStyleDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoClipCounterDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoClipCountersDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.channels.api.CommentsHistory;
import com.vk.channels.impl.comments.g;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.Good;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskDisableReason;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.managed_groups.impl.list.a;
import com.vk.managed_groups.impl.list.h;
import com.vk.managed_groups.impl.list.popup.ManagedGroupAction;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.maybe.d0;
import io.reactivex.rxjava3.internal.operators.maybe.e0;
import io.reactivex.rxjava3.internal.operators.maybe.i;
import io.reactivex.rxjava3.internal.operators.maybe.o;
import io.reactivex.rxjava3.internal.operators.maybe.p;
import io.reactivex.rxjava3.internal.operators.maybe.u;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a60;
import xsna.atd;
import xsna.bi9;
import xsna.bqd;
import xsna.c5g;
import xsna.c9k;
import xsna.cww;
import xsna.dpp;
import xsna.dqu;
import xsna.e43;
import xsna.ebx;
import xsna.egj;
import xsna.egz;
import xsna.epx;
import xsna.equ;
import xsna.f0r;
import xsna.fde;
import xsna.fkq0;
import xsna.fnj;
import xsna.fr50;
import xsna.frw0;
import xsna.fuv0;
import xsna.gae;
import xsna.gm9;
import xsna.gv3;
import xsna.hld;
import xsna.iah0;
import xsna.ii10;
import xsna.iu4;
import xsna.izs;
import xsna.j03;
import xsna.j20;
import xsna.j2r0;
import xsna.j5g;
import xsna.jae;
import xsna.jai;
import xsna.jdo;
import xsna.jgp;
import xsna.jgz;
import xsna.jt2;
import xsna.ju1;
import xsna.jw9;
import xsna.k2r0;
import xsna.krv0;
import xsna.mea;
import xsna.nb;
import xsna.nvy;
import xsna.ny3;
import xsna.ob;
import xsna.ojd;
import xsna.okh;
import xsna.om9;
import xsna.on00;
import xsna.p010;
import xsna.p7;
import xsna.p8k;
import xsna.pb;
import xsna.pi0;
import xsna.pk30;
import xsna.pno0;
import xsna.pw4;
import xsna.q60;
import xsna.qeg;
import xsna.qfg;
import xsna.qgi0;
import xsna.qih0;
import xsna.qm0;
import xsna.qvq;
import xsna.r6c;
import xsna.reg;
import xsna.rf;
import xsna.rfg;
import xsna.rra;
import xsna.s3q0;
import xsna.s89;
import xsna.sfj0;
import xsna.sm0;
import xsna.smw0;
import xsna.sx4;
import xsna.syr;
import xsna.t1r;
import xsna.t6c;
import xsna.ta40;
import xsna.tgi0;
import xsna.tny;
import xsna.tpb;
import xsna.ttp0;
import xsna.u6c;
import xsna.uhu;
import xsna.vwb;
import xsna.w2w;
import xsna.w4e;
import xsna.w8;
import xsna.wfg;
import xsna.wfu;
import xsna.wh50;
import xsna.wk50;
import xsna.wq30;
import xsna.wqb;
import xsna.wz00;
import xsna.x4;
import xsna.xjs;
import xsna.xkb0;
import xsna.xkt;
import xsna.xn50;
import xsna.zbi;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x075d  */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v108, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v33, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ClipAudioTemplate clipAudioTemplate;
        final fde fdeVar;
        List<ShortVideoClipCounterDto> d;
        ShortVideoClipCounterDto shortVideoClipCounterDto;
        Integer e;
        List<ShortVideoClipCounterDto> d2;
        ShortVideoClipCounterDto shortVideoClipCounterDto2;
        Integer f;
        UserId q;
        ?? r11;
        ?? r6;
        List<ShortVideoClipCounterDto> d3;
        ShortVideoClipCounterDto shortVideoClipCounterDto3;
        Integer d4;
        String Fb;
        Map map;
        Mask mask;
        List<ShortVideoClipCounterDto> H2;
        ShortVideoClipCounterDto shortVideoClipCounterDto4;
        Integer d5;
        List<ShortVideoClipCounterDto> H22;
        ShortVideoClipCounterDto shortVideoClipCounterDto5;
        Integer e2;
        List<ShortVideoClipCounterDto> H23;
        ShortVideoClipCounterDto shortVideoClipCounterDto6;
        Integer f2;
        List<ShortVideoClipCounterDto> H24;
        ShortVideoClipCounterDto shortVideoClipCounterDto7;
        Integer d6;
        ArrayList arrayList;
        Compilation compilation;
        List<ShortVideoClipCounterDto> H4;
        ShortVideoClipCounterDto shortVideoClipCounterDto8;
        Integer e3;
        List<ShortVideoClipCounterDto> H42;
        ShortVideoClipCounterDto shortVideoClipCounterDto9;
        Integer f3;
        ArrayList arrayList2;
        ?? r4;
        List<ShortVideoClipCounterDto> f4;
        ShortVideoClipCounterDto shortVideoClipCounterDto10;
        Integer e4;
        List<ShortVideoClipCounterDto> f5;
        ShortVideoClipCounterDto shortVideoClipCounterDto11;
        Integer f6;
        List<ShortVideoClipCounterDto> f7;
        ShortVideoClipCounterDto shortVideoClipCounterDto12;
        Integer d7;
        String d8;
        ShortVideoChallengeStyleDto n;
        ShortVideoChallengeStyleHeaderStyleDto d9;
        List<String> d10;
        GeoPlace geoPlace;
        List<ShortVideoClipCounterDto> e5;
        ShortVideoClipCounterDto shortVideoClipCounterDto13;
        Integer e6;
        List<ShortVideoClipCounterDto> e7;
        ShortVideoClipCounterDto shortVideoClipCounterDto14;
        Integer f8;
        List<ShortVideoClipCounterDto> e8;
        ShortVideoClipCounterDto shortVideoClipCounterDto15;
        Integer d11;
        int i = this.b;
        int i2 = 5;
        int i3 = 7;
        int i4 = 4;
        ClipGridParams.Data.GeoPlace geoPlace2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        List<String> list = null;
        ClipGridParams.Data.CameraMask cameraMask = null;
        Owner owner = null;
        r12 = null;
        Owner owner2 = null;
        ClipGridParams.Data.Music music = null;
        int i5 = 0;
        boolean z = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                NestedMsg nestedMsg = (NestedMsg) obj3;
                w2w w2wVar = (w2w) obj2;
                nestedMsg.c = w2wVar.d1();
                nestedMsg.i2(new cww(w2wVar, 12), true);
                nestedMsg.F3(new p010(w2wVar, 9));
                return s3q0.a;
            case 1:
                ny3 ny3Var = (ny3) obj3;
                ny3Var.c = true;
                ny3Var.addView((View) obj);
                ((izs) obj2).invoke(ny3Var);
                izs<? super ny3, s3q0> izsVar = ny3Var.e;
                if (izsVar != null) {
                    izsVar.invoke(ny3Var);
                }
                ny3Var.e = new a60(i4);
                return s3q0.a;
            case 2:
                return ((bi9) obj3).b((MusicTrack) obj2, ((ta40) obj).a);
            case 3:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj3;
                WebStoryBox webStoryBox = (WebStoryBox) obj2;
                View view = (View) obj;
                CameraUIView cameraUIView = aVar.b;
                Context context = cameraUIView.getContext();
                HashSet hashSet = iah0.a;
                Pair pair = fnj.d(context) ? new Pair(Float.valueOf(view.getWidth()), Float.valueOf(view.getHeight())) : new Pair(Float.valueOf(cameraUIView.getSceneWidth()), Float.valueOf(cameraUIView.getSceneHeight()));
                aVar.d0(webStoryBox, ((Number) pair.d()).floatValue(), ((Number) pair.g()).floatValue(), new om9(aVar, i5));
                return s3q0.a;
            case 4:
                nvy nvyVar = (nvy) obj;
                List<CartItem> list2 = ((egz) obj3).a;
                nvyVar.e(list2.size(), new jw9.b(new rf(9), list2), new jw9.c(new gv3(i2), list2), new jai(802480018, new jw9.d(list2, (izs) obj2), true));
                nvy.g(nvyVar, null, null, zbi.a, 3);
                return s3q0.a;
            case 5:
                ((mea) obj3).invoke((UIBlockList) obj2);
                return s3q0.a;
            case 6:
                String str = (String) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (str != null) {
                    qgi0.r(tgi0Var, str);
                }
                String str2 = (String) ref$ObjectRef.element;
                qgi0.h(tgi0Var, str2 != null ? str2 : "");
                return s3q0.a;
            case 7:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj3;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                LinkedHashSet linkedHashSet = bVar.n;
                g.b.a aVar2 = ((g.b) obj2).a;
                g.b.a.C0534a c0534a = aVar2 instanceof g.b.a.C0534a ? (g.b.a.C0534a) aVar2 : null;
                ttp0.a(linkedHashSet).remove(c0534a != null ? Integer.valueOf(c0534a.a) : null);
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, bVar.k.a(), false, 3), null, new g.b(g.b.a.C0535b.a), false, 10);
            case 8:
                ((tpb.a) obj3).l.h((vwb.b) obj2);
                return s3q0.a;
            case 9:
                ArrayList arrayList3 = ((r6c) obj3).d;
                ((nvy) obj).e(arrayList3.size(), new t6c(new qm0(8), arrayList3, i5), new bqd(arrayList3, 2), new jai(802480018, new u6c(i5, arrayList3, (izs) obj2), true));
                return s3q0.a;
            case 10:
                final hld hldVar = (hld) obj3;
                ClipGridParams clipGridParams = (ClipGridParams) obj2;
                final ShortVideoGetChallengeResponseDto shortVideoGetChallengeResponseDto = (ShortVideoGetChallengeResponseDto) obj;
                rra rraVar = (rra) hldVar.c.b;
                rraVar.getClass();
                if ((clipGridParams instanceof ClipGridParams.OnlyId.Profile) || (clipGridParams instanceof ClipGridParams.Data.Profile)) {
                    throw new IllegalArgumentException("Profile isn't supported");
                }
                if ((clipGridParams instanceof ClipGridParams.OnlyId.Audio) || (clipGridParams instanceof ClipGridParams.Data.Music)) {
                    Boolean d12 = shortVideoGetChallengeResponseDto.d();
                    boolean booleanValue = d12 != null ? d12.booleanValue() : false;
                    Boolean f9 = shortVideoGetChallengeResponseDto.f();
                    boolean booleanValue2 = f9 != null ? f9.booleanValue() : false;
                    Boolean g = shortVideoGetChallengeResponseDto.g();
                    boolean booleanValue3 = g != null ? g.booleanValue() : true;
                    ShortVideoAudioDto e9 = shortVideoGetChallengeResponseDto.e();
                    MusicTrack c = e9 != null ? sfj0.c(e9) : null;
                    if (c != null && (Fb = c.Fb()) != null) {
                        if (!epx.f(shortVideoGetChallengeResponseDto.o(), Boolean.TRUE)) {
                            Fb = null;
                        }
                        if (Fb != null) {
                            clipAudioTemplate = new ClipAudioTemplate(Fb);
                            ShortVideoAudioDto e10 = shortVideoGetChallengeResponseDto.e();
                            boolean f10 = e10 == null ? epx.f(e10.B(), Boolean.TRUE) : false;
                            if (c != null) {
                                ClipGridParams.Data.Music.b bVar2 = new ClipGridParams.Data.Music.b(booleanValue, booleanValue2);
                                ShortVideoClipCountersDto k = shortVideoGetChallengeResponseDto.k();
                                long intValue = (k == null || (d3 = k.d()) == null || (shortVideoClipCounterDto3 = (ShortVideoClipCounterDto) j5g.a0(d3)) == null || (d4 = shortVideoClipCounterDto3.d()) == null) ? 0L : d4.intValue();
                                boolean z2 = !booleanValue3;
                                ShortVideoAudioDto e11 = shortVideoGetChallengeResponseDto.e();
                                if (e11 != null && (q = e11.q()) != null) {
                                    List<UsersUserFullDto> C = shortVideoGetChallengeResponseDto.C();
                                    if (C != null) {
                                        List<UsersUserFullDto> list3 = C;
                                        k2r0 k2r0Var = rraVar.c;
                                        r11 = new ArrayList(c5g.u(list3, 10));
                                        Iterator it = list3.iterator();
                                        while (it.hasNext()) {
                                            r11.add(k2r0Var.a((UsersUserFullDto) it.next()));
                                        }
                                    } else {
                                        r11 = EmptyList.b;
                                    }
                                    List<GroupsGroupFullDto> n2 = shortVideoGetChallengeResponseDto.n();
                                    if (n2 != null) {
                                        List<GroupsGroupFullDto> list4 = n2;
                                        equ equVar = rraVar.d;
                                        r6 = new ArrayList(c5g.u(list4, 10));
                                        for (GroupsGroupFullDto groupsGroupFullDto : list4) {
                                            equVar.getClass();
                                            r6.add(equ.a(groupsGroupFullDto));
                                        }
                                    } else {
                                        r6 = EmptyList.b;
                                    }
                                    Iterator it2 = j5g.u0((Iterable) r6, (Collection) r11).iterator();
                                    while (it2.hasNext()) {
                                        ?? next = it2.next();
                                        long j = ((Owner) next).b.b;
                                        long j2 = q.b;
                                        if (j == j2 || j == (-j2)) {
                                            owner = next;
                                            owner2 = owner;
                                        }
                                    }
                                    owner2 = owner;
                                }
                                music = new ClipGridParams.Data.Music(c, intValue, bVar2, z2, null, clipAudioTemplate, owner2, f10, f10, 16, null);
                            }
                            ShortVideoClipCountersDto k2 = shortVideoGetChallengeResponseDto.k();
                            int intValue2 = (k2 != null || (d2 = k2.d()) == null || (shortVideoClipCounterDto2 = (ShortVideoClipCounterDto) j5g.a0(d2)) == null || (f = shortVideoClipCounterDto2.f()) == null) ? 0 : f.intValue();
                            ShortVideoClipCountersDto k3 = shortVideoGetChallengeResponseDto.k();
                            fdeVar = new fde(music, intValue2, (k3 != null || (d = k3.d()) == null || (shortVideoClipCounterDto = (ShortVideoClipCounterDto) j5g.a0(d)) == null || (e = shortVideoClipCounterDto.e()) == null) ? 0 : e.intValue());
                        }
                    }
                    clipAudioTemplate = null;
                    ShortVideoAudioDto e102 = shortVideoGetChallengeResponseDto.e();
                    if (e102 == null) {
                    }
                    if (c != null) {
                    }
                    ShortVideoClipCountersDto k22 = shortVideoGetChallengeResponseDto.k();
                    if (k22 != null) {
                    }
                    ShortVideoClipCountersDto k32 = shortVideoGetChallengeResponseDto.k();
                    fdeVar = new fde(music, intValue2, (k32 != null || (d = k32.d()) == null || (shortVideoClipCounterDto = (ShortVideoClipCounterDto) j5g.a0(d)) == null || (e = shortVideoClipCounterDto.e()) == null) ? 0 : e.intValue());
                } else if ((clipGridParams instanceof ClipGridParams.OnlyId.CameraMask) || (clipGridParams instanceof ClipGridParams.Data.CameraMask)) {
                    List<UsersUserFullDto> C2 = shortVideoGetChallengeResponseDto.C();
                    jgp jgpVar = jgp.b;
                    if (C2 != null) {
                        rraVar.a.getClass();
                        map = j2r0.b(C2);
                    } else {
                        map = jgpVar;
                    }
                    List<GroupsGroupFullDto> n3 = shortVideoGetChallengeResponseDto.n();
                    if (n3 != null) {
                        List<GroupsGroupFullDto> list5 = n3;
                        dqu dquVar = rraVar.b;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                        for (GroupsGroupFullDto groupsGroupFullDto2 : list5) {
                            dquVar.getClass();
                            arrayList4.add(dqu.a(groupsGroupFullDto2));
                        }
                        int e12 = on00.e(c5g.u(arrayList4, 10));
                        if (e12 < 16) {
                            e12 = 16;
                        }
                        ?? linkedHashMap = new LinkedHashMap(e12);
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            linkedHashMap.put(((Group) next2).c, next2);
                        }
                        jgpVar = linkedHashMap;
                    }
                    MasksMaskDto u = shortVideoGetChallengeResponseDto.u();
                    Mask a = u != null ? ii10.a(u, map, jgpVar) : null;
                    MasksEffectDto l = shortVideoGetChallengeResponseDto.l();
                    if (l != null) {
                        UserProfile userProfile = (UserProfile) map.get(l.q());
                        Group group = (Group) jgpVar.get(fkq0.e(l.q()));
                        int id = l.getId();
                        UserId q2 = l.q();
                        String e13 = l.e();
                        String url = l.getUrl();
                        List<BaseImageDto> f11 = l.f();
                        if (f11 != null) {
                            List<BaseImageDto> list6 = f11;
                            arrayList = new ArrayList(c5g.u(list6, 10));
                            for (BaseImageDto baseImageDto : list6) {
                                arrayList.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
                                z = z;
                            }
                        } else {
                            arrayList = null;
                        }
                        boolean z3 = z;
                        NotificationImage notificationImage = new NotificationImage(arrayList);
                        MaskDisableReason maskDisableReason = l.g() ? new MaskDisableReason(null, null, null) : null;
                        boolean z4 = l.getId() < 0 ? z3 : false;
                        Boolean i6 = l.i();
                        mask = new Mask(userProfile, group, id, q2, false, e13, 0, 0L, 0L, url, notificationImage, false, 0, 0, maskDisableReason, null, null, false, false, z4, false, i6 != null ? i6.booleanValue() : false, l.d(), 0L, 8388608, null);
                    } else {
                        mask = null;
                    }
                    if (a != null) {
                        ShortVideoClipCountersDto k4 = shortVideoGetChallengeResponseDto.k();
                        cameraMask = new ClipGridParams.Data.CameraMask(a, (k4 == null || (H24 = k4.H2()) == null || (shortVideoClipCounterDto7 = (ShortVideoClipCounterDto) j5g.a0(H24)) == null || (d6 = shortVideoClipCounterDto7.d()) == null) ? 0L : d6.intValue());
                    } else if (mask != null) {
                        ShortVideoClipCountersDto k5 = shortVideoGetChallengeResponseDto.k();
                        cameraMask = new ClipGridParams.Data.CameraMask(mask, (k5 == null || (H2 = k5.H2()) == null || (shortVideoClipCounterDto4 = (ShortVideoClipCounterDto) j5g.a0(H2)) == null || (d5 = shortVideoClipCounterDto4.d()) == null) ? 0L : d5.intValue());
                    }
                    ShortVideoClipCountersDto k6 = shortVideoGetChallengeResponseDto.k();
                    int intValue3 = (k6 == null || (H23 = k6.H2()) == null || (shortVideoClipCounterDto6 = (ShortVideoClipCounterDto) j5g.a0(H23)) == null || (f2 = shortVideoClipCounterDto6.f()) == null) ? 0 : f2.intValue();
                    ShortVideoClipCountersDto k7 = shortVideoGetChallengeResponseDto.k();
                    fdeVar = new fde(cameraMask, intValue3, (k7 == null || (H22 = k7.H2()) == null || (shortVideoClipCounterDto5 = (ShortVideoClipCounterDto) j5g.a0(H22)) == null || (e2 = shortVideoClipCounterDto5.e()) == null) ? 0 : e2.intValue());
                } else if ((clipGridParams instanceof ClipGridParams.OnlyId.ClipCompilation) || (clipGridParams instanceof ClipGridParams.Data.ClipCompilation)) {
                    ShortVideoCompilationInfoDto j3 = shortVideoGetChallengeResponseDto.j();
                    if (j3 != null) {
                        Integer e14 = j3.e();
                        int intValue4 = e14 != null ? e14.intValue() : 0;
                        String g2 = j3.g();
                        Integer i7 = j3.i();
                        int intValue5 = i7 != null ? i7.intValue() : 0;
                        String d13 = j3.d();
                        List<BaseImageDto> f12 = j3.f();
                        if (f12 != null) {
                            List<BaseImageDto> list7 = f12;
                            arrayList2 = new ArrayList(c5g.u(list7, 10));
                            for (BaseImageDto baseImageDto2 : list7) {
                                arrayList2.add(new NotificationImage.ImageInfo(baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.getUrl()));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        compilation = new Compilation(intValue4, g2, intValue5, d13, new NotificationImage(arrayList2));
                    } else {
                        compilation = null;
                    }
                    ClipGridParams.Data.ClipCompilation clipCompilation = compilation != null ? new ClipGridParams.Data.ClipCompilation(compilation) : null;
                    ShortVideoClipCountersDto k8 = shortVideoGetChallengeResponseDto.k();
                    int intValue6 = (k8 == null || (H42 = k8.H4()) == null || (shortVideoClipCounterDto9 = (ShortVideoClipCounterDto) j5g.a0(H42)) == null || (f3 = shortVideoClipCounterDto9.f()) == null) ? 0 : f3.intValue();
                    ShortVideoClipCountersDto k9 = shortVideoGetChallengeResponseDto.k();
                    fdeVar = new fde(clipCompilation, intValue6, (k9 == null || (H4 = k9.H4()) == null || (shortVideoClipCounterDto8 = (ShortVideoClipCounterDto) j5g.a0(H4)) == null || (e3 = shortVideoClipCounterDto8.e()) == null) ? 0 : e3.intValue());
                } else {
                    boolean z5 = clipGridParams instanceof ClipGridParams.OnlyId.Hashtag;
                    if (z5 || (clipGridParams instanceof ClipGridParams.Data.Hashtag)) {
                        String str3 = z5 ? ((ClipGridParams.OnlyId.Hashtag) clipGridParams).b : ((ClipGridParams.Data.Hashtag) clipGridParams).b;
                        ShortVideoChallengeHashtagInfoDto p = shortVideoGetChallengeResponseDto.p();
                        boolean f13 = p != null ? epx.f(p.e(), Boolean.TRUE) : false;
                        ShortVideoChallengeDto i8 = shortVideoGetChallengeResponseDto.i();
                        if ((i8 != null ? i8.f() : null) == null) {
                            ShortVideoChallengeDto i9 = shortVideoGetChallengeResponseDto.i();
                            if (i9 != null && (n = i9.n()) != null && (d9 = n.d()) != null && (d10 = d9.d()) != null && !d10.isEmpty()) {
                                list = d10;
                            }
                            if (list == null) {
                                r4 = false;
                                ShortVideoChallengeHashtagInfoDto p2 = shortVideoGetChallengeResponseDto.p();
                                String str4 = (p2 != null || (d8 = p2.d()) == null) ? str3 : d8;
                                ShortVideoClipCountersDto k10 = shortVideoGetChallengeResponseDto.k();
                                ClipGridParams.Data.Hashtag hashtag = new ClipGridParams.Data.Hashtag(str4, (k10 != null || (f7 = k10.f()) == null || (shortVideoClipCounterDto12 = (ShortVideoClipCounterDto) j5g.a0(f7)) == null || (d7 = shortVideoClipCounterDto12.d()) == null) ? 0L : d7.intValue(), f13, (f13 || r4 == true) ? false : true);
                                ShortVideoClipCountersDto k11 = shortVideoGetChallengeResponseDto.k();
                                int intValue7 = (k11 != null || (f5 = k11.f()) == null || (shortVideoClipCounterDto11 = (ShortVideoClipCounterDto) j5g.a0(f5)) == null || (f6 = shortVideoClipCounterDto11.f()) == null) ? 0 : f6.intValue();
                                ShortVideoClipCountersDto k12 = shortVideoGetChallengeResponseDto.k();
                                fdeVar = new fde(hashtag, intValue7, (k12 != null || (f4 = k12.f()) == null || (shortVideoClipCounterDto10 = (ShortVideoClipCounterDto) j5g.a0(f4)) == null || (e4 = shortVideoClipCounterDto10.e()) == null) ? 0 : e4.intValue());
                            }
                        }
                        r4 = true;
                        ShortVideoChallengeHashtagInfoDto p22 = shortVideoGetChallengeResponseDto.p();
                        if (p22 != null) {
                        }
                        ShortVideoClipCountersDto k102 = shortVideoGetChallengeResponseDto.k();
                        ClipGridParams.Data.Hashtag hashtag2 = new ClipGridParams.Data.Hashtag(str4, (k102 != null || (f7 = k102.f()) == null || (shortVideoClipCounterDto12 = (ShortVideoClipCounterDto) j5g.a0(f7)) == null || (d7 = shortVideoClipCounterDto12.d()) == null) ? 0L : d7.intValue(), f13, (f13 || r4 == true) ? false : true);
                        ShortVideoClipCountersDto k112 = shortVideoGetChallengeResponseDto.k();
                        if (k112 != null) {
                        }
                        ShortVideoClipCountersDto k122 = shortVideoGetChallengeResponseDto.k();
                        fdeVar = new fde(hashtag2, intValue7, (k122 != null || (f4 = k122.f()) == null || (shortVideoClipCounterDto10 = (ShortVideoClipCounterDto) j5g.a0(f4)) == null || (e4 = shortVideoClipCounterDto10.e()) == null) ? 0 : e4.intValue());
                    } else {
                        if (!(clipGridParams instanceof ClipGridParams.OnlyId.GeoPlace) && !(clipGridParams instanceof ClipGridParams.Data.GeoPlace)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlacesPlaceDto B = shortVideoGetChallengeResponseDto.B();
                        if (B != null) {
                            int id2 = B.getId();
                            String title = B.getTitle();
                            double j4 = B.j();
                            double k13 = B.k();
                            int l2 = B.l();
                            UserId userId = UserId.d;
                            String d14 = B.d();
                            String str5 = d14 == null ? "" : d14;
                            Integer g3 = B.g();
                            int intValue8 = g3 != null ? g3.intValue() : 0;
                            Integer i10 = B.i();
                            geoPlace = new GeoPlace(id2, title, j4, k13, l2, "", userId, str5, intValue8, i10 != null ? i10.intValue() : 0, 0);
                        } else {
                            geoPlace = null;
                        }
                        if (geoPlace != null) {
                            ShortVideoClipCountersDto k14 = shortVideoGetChallengeResponseDto.k();
                            geoPlace2 = new ClipGridParams.Data.GeoPlace(geoPlace, (k14 == null || (e8 = k14.e()) == null || (shortVideoClipCounterDto15 = (ShortVideoClipCounterDto) j5g.a0(e8)) == null || (d11 = shortVideoClipCounterDto15.d()) == null) ? 0L : d11.intValue());
                        }
                        ShortVideoClipCountersDto k15 = shortVideoGetChallengeResponseDto.k();
                        int intValue9 = (k15 == null || (e7 = k15.e()) == null || (shortVideoClipCounterDto14 = (ShortVideoClipCounterDto) j5g.a0(e7)) == null || (f8 = shortVideoClipCounterDto14.f()) == null) ? 0 : f8.intValue();
                        ShortVideoClipCountersDto k16 = shortVideoGetChallengeResponseDto.k();
                        fdeVar = new fde(geoPlace2, intValue9, (k16 == null || (e5 = k16.e()) == null || (shortVideoClipCounterDto13 = (ShortVideoClipCounterDto) j5g.a0(e5)) == null || (e6 = shortVideoClipCounterDto13.e()) == null) ? 0 : e6.intValue());
                    }
                }
                final jae jaeVar = hldVar.a;
                p pVar = new p(new Callable() { // from class: xsna.iae
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ShortVideoChallengeBannerDto f14;
                        BaseImageDto e15;
                        ShortVideoChallengeDto i11 = ShortVideoGetChallengeResponseDto.this.i();
                        if (i11 == null || (f14 = i11.f()) == null || (e15 = f14.e()) == null) {
                            return null;
                        }
                        if (jaeVar.a(fdeVar.a)) {
                            return e15;
                        }
                        return null;
                    }
                });
                ojd ojdVar = jaeVar.c;
                int i11 = 11;
                o oVar = new o(new u(pVar, new pi0(new q60(ojdVar, 5), i11)), new iu4(new wqb(shortVideoGetChallengeResponseDto, jaeVar, fdeVar), i3));
                i iVar = i.b;
                return new e0(new u(new d0(oVar.l(iVar).l(iVar), new o(new u(new o(new io.reactivex.rxjava3.internal.operators.maybe.d(new gae(i5, jaeVar, fdeVar)), new ju1(new x4(18), 12)), new nb(new pw4(ojdVar, 2), 8)), new pb(new ob(jaeVar, i11), 10)).l(iVar)).l(iVar), new p7(new sx4(fdeVar, hldVar, shortVideoGetChallengeResponseDto, 2), 14)), new v(new Callable() { // from class: xsna.gld
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new wfu.a.C3931a(fde.this, new ild(((qra) hldVar.c.c).a(shortVideoGetChallengeResponseDto)), null);
                    }
                }));
            case 11:
                izs izsVar2 = (izs) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue4 = bool.booleanValue();
                int i12 = ClipsControlsView.P;
                gm9 gm9Var = ((ClipsControlsView) obj3).u;
                if (gm9Var != null) {
                    gm9Var.getState().m(booleanValue4);
                    gm9Var.d();
                }
                if (izsVar2 != null) {
                    izsVar2.invoke(bool);
                }
                return s3q0.a;
            case 12:
                ((atd) obj3).b((jdo) obj2, (ShortVideoGetTemplateExtendedResponseDto) obj);
                return s3q0.a;
            case 13:
                View view2 = (View) obj;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                j20 j20Var = new j20(i3, ref$ObjectRef2, (qeg.a) obj2);
                rfg rfgVar = new rfg();
                rfgVar.y0(new qfg(j20Var));
                CommentsHistory.Order order = CommentsHistory.Order.ASC;
                reg regVar = ((qeg) obj3).o;
                wfg wfgVar = new wfg(order, (regVar == null ? null : regVar).c == order);
                CommentsHistory.Order order2 = CommentsHistory.Order.DESC;
                rfgVar.setItems(e43.l(wfgVar, new wfg(order2, (regVar != null ? regVar : null).c == order2)));
                int l3 = krv0.l(R.attr.vk_ui_icon_accent);
                view2.getContext();
                e.b bVar3 = new e.b(view2, null, null, l3, 6);
                bVar3.w = R.layout.ds_internal_context_menu_item;
                bVar3.l = rfgVar;
                ref$ObjectRef2.element = bVar3.j();
                return s3q0.a;
            case 14:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj2;
                tny tnyVar = (tny) obj;
                if (!((fuv0) obj3).isVisible()) {
                    return s3q0.a;
                }
                ((wh50) ref$ObjectRef3.element).setValue(jgz.p(tnyVar).z(tnyVar, true));
                return s3q0.a;
            case 15:
                okh okhVar = (okh) obj3;
                xkb0 xkb0Var = (xkb0) obj2;
                List<MusicTrack> list8 = xkb0Var.j;
                if (list8 == null || list8.isEmpty()) {
                    okh.s(okhVar, xkb0Var, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    okh.s(okhVar, xkb0Var, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            case 16:
                ((izs) obj3).invoke(((egj.b) obj2).m);
                return s3q0.a;
            case 17:
                ((p8k) obj3).X((Throwable) obj, (c9k) obj2);
                return s3q0.a;
            case 18:
                com.vk.auth.enterphone.a aVar3 = (com.vk.auth.enterphone.a) obj3;
                aVar3.D = ((pno0) obj).d().toString();
                aVar3.y0();
                ((dpp) obj2).cj();
                return s3q0.a;
            case 19:
                ((f0r.s) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 20:
                t1r.g((wk50.a) obj3, (qvq.i) obj2, (qih0) obj, true);
                return s3q0.a;
            case 21:
                ((syr) obj3).l.invoke(((w4e) obj2).f);
                return s3q0.a;
            case 22:
                ((xjs.a) obj3).n.invoke((RequestUserProfile) obj2);
                return s3q0.a;
            case 23:
                uhu uhuVar = (uhu) obj3;
                uhu.a.b bVar4 = (uhu.a.b) obj2;
                Throwable th = (Throwable) obj;
                boolean z6 = th instanceof VKApiExecutionException;
                if (z6 && ((VKApiExecutionException) th).s() == 960) {
                    ((frw0) uhuVar.s.getValue()).a();
                    ?? activity = uhuVar.p.a.getActivity();
                    jt2 jt2Var = activity instanceof jt2 ? (jt2) activity : null;
                    if (jt2Var != null) {
                        jt2Var.a();
                    }
                    smw0.a(uhuVar.i, new sm0(25));
                    bVar4.invoke();
                } else if (z6 && ((VKApiExecutionException) th).s() == 952) {
                    uhuVar.a1();
                } else {
                    j03.l(th);
                }
                return s3q0.a;
            case 24:
                return ((zrz) obj3).d((zrz.a) obj, ((String) obj2) + " -> onLoadedByCache");
            case 25:
                return new xkt((ViewGroup) obj, (w8) obj3, (ebx) obj2);
            case 26:
                int i13 = ManagedGroupsListFragment.X;
                ((h.b) ((h) obj2)).getClass();
                xn50.a.c((ManagedGroupsListFragment) obj3, new a.C1260a((ManagedGroupAction) obj));
                return s3q0.a;
            case 27:
                ((wz00) obj3).X6((Good) obj2);
                return s3q0.a;
            case 28:
                AttachGift attachGift = (AttachGift) obj2;
                pk30 pk30Var = ((wq30) obj3).u;
                if (pk30Var != null) {
                    pk30Var.u(attachGift);
                }
                return s3q0.a;
            default:
                ((fr50) obj3).D.sa(new NewsfeedExternalAction.Navigation.n(((MyTargetInternalNativeAdBlsUiDto) obj2).i));
                return s3q0.a;
        }
    }

    public /* synthetic */ a(t1r.u uVar, wk50.a aVar, qvq.i iVar) {
        this.b = 20;
        this.c = aVar;
        this.d = iVar;
    }

    public /* synthetic */ a(uhu uhuVar, uhu.a.b bVar, s89 s89Var, boolean z) {
        this.b = 23;
        this.c = uhuVar;
        this.d = bVar;
    }
}
