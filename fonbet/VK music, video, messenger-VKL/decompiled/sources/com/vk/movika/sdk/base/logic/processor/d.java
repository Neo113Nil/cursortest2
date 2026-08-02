package com.vk.movika.sdk.base.logic.processor;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.preference.Preference;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.location.LocationRequest;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryWithCitiesDto;
import com.vk.api.generated.polls.dto.PollsAnswerDto;
import com.vk.api.generated.polls.dto.PollsGetStatsResponseDto;
import com.vk.api.generated.polls.dto.PollsGetVotersCriteriaResponseDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.api.generated.polls.dto.PollsVotersUsersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.BanDuration;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.movika.sdk.base.model.n;
import com.vk.movika.sdk.base.model.q;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.pushes.receivers.c;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.a210;
import xsna.amu;
import xsna.aoj;
import xsna.aqb0;
import xsna.asm;
import xsna.b4;
import xsna.bdm;
import xsna.bgk0;
import xsna.bqz0;
import xsna.bwd0;
import xsna.c23;
import xsna.c4;
import xsna.c510;
import xsna.c5g;
import xsna.cbg;
import xsna.cda0;
import xsna.cvd0;
import xsna.cvk;
import xsna.cxl;
import xsna.dnm;
import xsna.egi;
import xsna.eh3;
import xsna.enj;
import xsna.epx;
import xsna.eq;
import xsna.f0r;
import xsna.fh3;
import xsna.fi3;
import xsna.fq60;
import xsna.fub0;
import xsna.fwx0;
import xsna.ggh;
import xsna.gud;
import xsna.h4c0;
import xsna.hnb0;
import xsna.hpb0;
import xsna.hv10;
import xsna.hyg0;
import xsna.inb0;
import xsna.inf0;
import xsna.izs;
import xsna.j5g;
import xsna.jdr0;
import xsna.jg;
import xsna.jgp;
import xsna.k2r0;
import xsna.l6z;
import xsna.lcv;
import xsna.m0g0;
import xsna.mxl;
import xsna.ngv0;
import xsna.o2l;
import xsna.og3;
import xsna.on00;
import xsna.ooj0;
import xsna.oxz;
import xsna.p4g;
import xsna.pgv0;
import xsna.ptj;
import xsna.qba0;
import xsna.qgv0;
import xsna.qyg0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.swj;
import xsna.tfx;
import xsna.tlo0;
import xsna.tnf0;
import xsna.tq;
import xsna.ubg;
import xsna.uh;
import xsna.umd0;
import xsna.ur4;
import xsna.uxd0;
import xsna.v110;
import xsna.vmd0;
import xsna.voj0;
import xsna.wea0;
import xsna.wh50;
import xsna.wk50;
import xsna.wyz;
import xsna.wzs;
import xsna.x7;
import xsna.xbg;
import xsna.xgl0;
import xsna.xsp;
import xsna.y7;
import xsna.yfb;
import xsna.yo60;
import xsna.ysg0;
import xsna.zak0;
import xsna.zpb0;
import xsna.zrb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v91, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v92, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterable iterable;
        ?? r5;
        Long valueOf;
        int i;
        int i2;
        String l2;
        int i3;
        int i4;
        DownloadingState downloadingState;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Poll poll;
        Set set;
        PollsPollExtendedDto pollsPollExtendedDto;
        EmptyList emptyList;
        Map map;
        bqz0 bqz0Var;
        ?? r3;
        ArrayList arrayList;
        PollsPollExtendedDto pollsPollExtendedDto2;
        EmptyList emptyList2;
        List<UserId> e;
        VideoFile videoFile;
        int i5 = 10;
        int i6 = 1;
        switch (this.b) {
            case 0:
                com.vk.movika.sdk.base.model.history.c cVar = (com.vk.movika.sdk.base.model.history.c) obj;
                return com.vk.movika.sdk.base.model.history.c.a(cVar, null, null, null, j5g.v0(new com.vk.movika.sdk.base.model.history.a((String) this.c, ((q) this.d).b), cVar.f), 31);
            case 1:
                VideoFile videoFile2 = (VideoFile) this.c;
                AboutVideoItem.h hVar = (AboutVideoItem.h) this.d;
                int o0 = videoFile2.o0();
                UserId I0 = videoFile2.I0();
                tfx tfxVar = new tfx("market.getItemsByVideo", new n(18), new eq(20));
                tfx.n(tfxVar, "owner_id", I0, 0L, 0L, 12);
                tfx.l(tfxVar, "video_id", o0, 0, 0, 12);
                int i7 = 0;
                return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new y7(new x7(hVar, i7), i7)).d0(hVar);
            case 2:
                m0g0 m0g0Var = (m0g0) this.c;
                fi3.b bVar = ((og3) this.d).p;
                ((fh3) m0g0Var.b).O(new eh3.h((bVar == null ? null : bVar).b));
                return s3q0.a;
            case 3:
                ubg ubgVar = (ubg) this.c;
                ubg.a aVar = (ubg.a) this.d;
                xbg xbgVar = ubgVar.r;
                if (xbgVar != null) {
                    aVar.i(xbgVar.e);
                }
                return s3q0.a;
            case 4:
                cbg cbgVar = (cbg) obj;
                return Boolean.valueOf(!epx.f(cbgVar, (cbg) this.c) && ((Set) this.d).contains(Integer.valueOf(((NewsComment) cbgVar.a).i)));
            case 5:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                Clips clips = (Clips) this.d;
                VideoFileOld u = ggh.u((gud) obj, bwd0.i(extendedCommunityProfile));
                Collection singletonList = u != null ? Collections.singletonList(u) : EmptyList.b;
                cvd0.f fVar = clips.j;
                if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    iterable = new ArrayList();
                    for (Object obj7 : arrayList2) {
                        if (epx.f(((VideoFile) obj7).getType(), "tab_collection_scheduled_dummy")) {
                            iterable.add(obj7);
                        }
                    }
                } else {
                    iterable = EmptyList.b;
                }
                cvd0.f fVar2 = clips.j;
                if (fVar2 != null) {
                    ArrayList arrayList3 = fVar2.a;
                    r5 = new ArrayList();
                    for (Object obj8 : arrayList3) {
                        if (epx.f(((VideoFile) obj8).getType(), "short_video")) {
                            r5.add(obj8);
                        }
                    }
                } else {
                    r5 = EmptyList.b;
                }
                return Clips.i(clips, new cvd0.f(j5g.u0((Iterable) r5, j5g.u0(iterable, singletonList))), null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, false, 523774);
            case 6:
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) this.c).f((wk50.a) this.d);
                return s3q0.a;
            case 7:
                ptj ptjVar = (ptj) this.d;
                ptjVar.a.f0((String) this.c);
                androidx.appcompat.app.d dVar = ptjVar.c;
                if (dVar != null) {
                    dVar.dismiss();
                }
                return s3q0.a;
            case 8:
                ((swj) this.d).c.remove((String) this.c);
                return s3q0.a;
            case 9:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                Preference preference = (Preference) this.d;
                VkBuildAppStore vkBuildAppStore = (VkBuildAppStore) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                o2l.a.getClass();
                o2l.j("__dbg_app_store", vkBuildAppStore.i());
                enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
                preference.I(vkBuildAppStore.i());
                return null;
            case 10:
                ((hv10) obj).b((bgk0) this.c, (ur4) this.d);
                return s3q0.a;
            case 11:
                mxl mxlVar = (mxl) this.c;
                DeliveryPointsMapFragment.b bVar2 = mxlVar.a;
                Context context = (Context) this.d;
                Location location = (Location) obj;
                LocationCommon.a.getClass();
                if (epx.f(location, LocationCommon.b)) {
                    bVar2.invoke(cxl.k.a.b);
                } else {
                    bVar2.invoke(new cxl.p(new Coordinates(location.getLatitude(), location.getLongitude())));
                    AtomicReference<Location> atomicReference = oxz.a;
                    mxl.a aVar2 = new mxl.a(bVar2);
                    LocationRequest locationRequest = new LocationRequest();
                    locationRequest.k(10000L);
                    locationRequest.n();
                    jdr0 jdr0Var = new jdr0(aVar2);
                    com.google.android.gms.common.api.a<a.d.c> aVar3 = wyz.a;
                    new zzbp(context).requestLocationUpdates(locationRequest, jdr0Var, Looper.getMainLooper());
                    mxlVar.e = jdr0Var;
                }
                return s3q0.a;
            case 12:
                asm asmVar = (asm) this.c;
                asmVar.b.D(asmVar, new bdm(((DialogExt) this.d).f, true, ((BanDuration) obj).h(), 8));
                return s3q0.a;
            case 13:
                String str = (String) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                dnm d = ((xgl0) obj).b().d();
                InfoBar b = d.b();
                if (epx.f(b != null ? b.b : null, str)) {
                    d.e(false);
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 14:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT * \n        FROM episode\n        INNER JOIN podcast_to_episodes \n        ON episode.mid = podcast_to_episodes.mid\n        AND episode.uid = podcast_to_episodes.uid\n        WHERE podcast_to_episodes.uid = ? \n        AND podcast_to_episodes.podcast_owner_id = ?\n    ");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str3);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "track_code");
                    int k5 = egi.k(V0, "title");
                    int k6 = egi.k(V0, "artist");
                    int k7 = egi.k(V0, "url");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "date");
                    int k10 = egi.k(V0, "is_explicit");
                    int k11 = egi.k(V0, "is_focus_track");
                    int k12 = egi.k(V0, "plays");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, X3.i.L);
                    int k15 = egi.k(V0, "description");
                    int k16 = egi.k(V0, "cover");
                    int k17 = egi.k(V0, "post_id");
                    int k18 = egi.k(V0, "is_donut");
                    int k19 = egi.k(V0, "downloading_state");
                    int k20 = egi.k(V0, X3.a.k);
                    int k21 = egi.k(V0, "manifest_url");
                    int k22 = egi.k(V0, "json_raw");
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.step()) {
                        int i8 = k13;
                        int i9 = k12;
                        int i10 = (int) V0.getLong(k);
                        UserId b2 = fwx0.b(V0.l2(k2));
                        String l22 = V0.l2(k3);
                        String l23 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l24 = V0.isNull(k5) ? null : V0.l2(k5);
                        String l25 = V0.isNull(k6) ? null : V0.l2(k6);
                        String l26 = V0.isNull(k7) ? null : V0.l2(k7);
                        Long valueOf2 = V0.isNull(k8) ? null : Long.valueOf(V0.getLong(k8));
                        if (V0.isNull(k9)) {
                            valueOf = null;
                            i2 = k2;
                            i = i10;
                        } else {
                            valueOf = Long.valueOf(V0.getLong(k9));
                            i = i10;
                            i2 = k2;
                        }
                        boolean z = ((int) V0.getLong(k10)) != 0;
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        Boolean valueOf4 = valueOf3 != null ? Boolean.valueOf(valueOf3.intValue() != 0) : null;
                        int i11 = i2;
                        int i12 = (int) V0.getLong(i9);
                        boolean z2 = ((int) V0.getLong(i8)) != 0;
                        long j = V0.getLong(k14);
                        int i13 = k15;
                        String l27 = V0.isNull(i13) ? null : V0.l2(i13);
                        int i14 = k16;
                        Image g = yfb.g(V0.isNull(i14) ? null : V0.l2(i14));
                        int i15 = k;
                        int i16 = k17;
                        if (V0.isNull(i16)) {
                            l2 = null;
                            k17 = i16;
                            i4 = i13;
                            i3 = k18;
                        } else {
                            l2 = V0.l2(i16);
                            k17 = i16;
                            i3 = k18;
                            i4 = i13;
                        }
                        boolean z3 = ((int) V0.getLong(i3)) != 0;
                        int i17 = k19;
                        int i18 = (int) V0.getLong(i17);
                        if (i18 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i18 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i18 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i18 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i18 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i19 = k20;
                        int i20 = k21;
                        int i21 = i3;
                        int i22 = k22;
                        k22 = i22;
                        arrayList4.add(new xsp(i, b2, l22, l23, l24, l25, l26, valueOf2, valueOf, z, valueOf4, i12, z2, j, l27, g, l2, z3, downloadingState2, uh.a(V0.isNull(i19) ? null : V0.l2(i19)), V0.isNull(i20) ? null : V0.l2(i20), V0.l2(i22)));
                        k = i15;
                        k21 = i20;
                        k15 = i4;
                        k16 = i14;
                        k18 = i21;
                        k12 = i9;
                        k20 = i19;
                        k13 = i8;
                        k19 = i17;
                        k2 = i11;
                    }
                    V0.close();
                    return arrayList4;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 15:
                ((f0r.r) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 16:
                UserProfile userProfile = (UserProfile) this.c;
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) this.d;
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    cvk.u(R.string.friends_catalog_report_sent, false);
                    userProfile.m = true;
                    VkRichCell vkRichCell = friendsSuggestsVh.g;
                    VkRichCell vkRichCell2 = vkRichCell != null ? vkRichCell : null;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    vkRichCell2.setMiddle(middle != null ? pgv0.a(middle, null, new qgv0(tq.h(tlo0.Companion, R.string.friends_catalog_report_sent), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, 299) : null);
                }
                return s3q0.a;
            case 17:
                return new jg((amu) this.c, (uxd0.a.InterfaceC3848a) obj, (View) this.d, i6);
            case 18:
                c23 c23Var = (c23) this.c;
                lcv.a aVar4 = (lcv.a) this.d;
                AppCard appCard = aVar4.q;
                c23Var.c((appCard == null ? null : appCard).b, (appCard == null ? null : appCard).h, Integer.valueOf(aVar4.getBindingAdapterPosition()));
                return s3q0.a;
            case 19:
                com.vk.newsfeed.common.recycler.holders.b bVar3 = (com.vk.newsfeed.common.recycler.holders.b) this.c;
                Object tag = ((AppCompatEditText) this.d).getTag();
                String str4 = tag instanceof String ? (String) tag : null;
                bVar3.getClass();
                if (epx.f(str4, ShitAttachment.LeadForm.ContactField.PHONE.h())) {
                    bVar3.B6();
                } else if (epx.f(str4, ShitAttachment.LeadForm.ContactField.EMAIL.h())) {
                    bVar3.A6();
                }
                bVar3.x6();
                return s3q0.a;
            case 20:
                v110 v110Var = (v110) this.c;
                v110Var.q.P4(c510.a(v110Var.itemView.getContext(), (a210) this.d, true));
                return s3q0.a;
            case 21:
                ((fq60) this.c).d((Context) this.d, new yo60.g.c(R.string.error));
                return s3q0.a;
            case 22:
                c.a aVar5 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) this.c, (Intent) this.d, (Throwable) obj);
                return s3q0.a;
            case 23:
                cda0 cda0Var = (cda0) this.c;
                UserId userId = (UserId) this.d;
                wea0 wea0Var = (wea0) obj;
                cda0Var.getClass();
                TagsSuggestions tagsSuggestions = wea0Var.b;
                PhotosGetAlbums.a aVar6 = wea0Var.a;
                if (tagsSuggestions == null) {
                    return EmptyList.b;
                }
                List<TagsSuggestions.Item> list = tagsSuggestions.i;
                ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
                for (TagsSuggestions.Item item : list) {
                    List<TagsSuggestions.Button> list2 = item.g;
                    Photo photo = item.e;
                    List<PhotoTag> list3 = item.f;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((TagsSuggestions.Button) obj2).c, "confirm")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    TagsSuggestions.Button button = (TagsSuggestions.Button) obj2;
                    String str5 = button != null ? button.b : null;
                    Iterator it2 = item.g.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (epx.f(((TagsSuggestions.Button) obj3).c, "decline")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    TagsSuggestions.Button button2 = (TagsSuggestions.Button) obj3;
                    String str6 = button2 != null ? button2.b : null;
                    Owner owner = wea0Var.c.get(photo.e);
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            if (epx.f(((PhotoTag) obj4).c, userId)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    PhotoTag photoTag = (PhotoTag) obj4;
                    Iterator it4 = aVar6.a.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj5 = it4.next();
                            if (((PhotoAlbum) obj5).b == photo.d) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    PhotoAlbum photoAlbum = (PhotoAlbum) obj5;
                    if (photoAlbum == null) {
                        Iterator it5 = aVar6.b.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj6 = it5.next();
                                if (((PhotoAlbum) obj6).b == photo.d) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        photoAlbum = (PhotoAlbum) obj6;
                    }
                    PhotoAlbum photoAlbum2 = photoAlbum;
                    photo.b = list3;
                    arrayList5.add(new qba0(photo, photoAlbum2, owner, item.i, item.b, item.c, str5, str6, photoTag != null ? photoTag.e : 0L, photoTag != null ? photoTag.b : 0, false, item.h, item.d, false));
                }
                return arrayList5;
            case 24:
                hpb0 hpb0Var = (hpb0) this.c;
                io.reactivex.rxjava3.subjects.f fVar3 = (io.reactivex.rxjava3.subjects.f) this.d;
                PollAttachment pollAttachment = (PollAttachment) obj;
                PollAttachment pollAttachment2 = hpb0Var.d;
                PollBackground pollBackground = (pollAttachment2 == null || (poll = pollAttachment2.f) == null) ? null : poll.s;
                PhotoPoll photoPoll = pollBackground instanceof PhotoPoll ? (PhotoPoll) pollBackground : null;
                Bitmap bitmap = photoPoll != null ? photoPoll.f : null;
                ysg0.b.a(new zrb0(pollAttachment.f));
                PollBackground pollBackground2 = pollAttachment.f.s;
                PhotoPoll photoPoll2 = pollBackground2 instanceof PhotoPoll ? (PhotoPoll) pollBackground2 : null;
                if (photoPoll2 != null) {
                    photoPoll2.f = bitmap;
                }
                hpb0Var.d();
                if (fVar3 == null) {
                    Object K0 = hpb0Var.n.K0();
                    String str7 = K0 instanceof inb0 ? ((inb0) K0).g : null;
                    wzs<? super PollAttachment, ? super String, s3q0> wzsVar = hpb0Var.N;
                    if (wzsVar != null) {
                        wzsVar.invoke(pollAttachment, str7);
                    }
                } else {
                    fVar3.onNext(pollAttachment.f);
                }
                return s3q0.a;
            case 25:
                PollsGetStatsResponseDto pollsGetStatsResponseDto = (PollsGetStatsResponseDto) this.c;
                PollsPollExtendedDto pollsPollExtendedDto3 = (PollsPollExtendedDto) this.d;
                Optional optional = (Optional) obj;
                int i23 = PollResultsFragment.b0;
                Integer g2 = pollsGetStatsResponseDto.g();
                int intValue = g2 != null ? g2.intValue() : 0;
                List<Long> d2 = pollsGetStatsResponseDto.d();
                if (d2 == null || (set = j5g.S0(d2)) == null) {
                    set = EmptySet.b;
                }
                List<PollsAnswerDto> e2 = pollsGetStatsResponseDto.e();
                if (e2 != null) {
                    List<PollsAnswerDto> list4 = e2;
                    ?? arrayList6 = new ArrayList(c5g.u(list4, 10));
                    for (PollsAnswerDto pollsAnswerDto : list4) {
                        long d3 = pollsAnswerDto.d();
                        String f = pollsAnswerDto.f();
                        int i24 = pollsAnswerDto.i();
                        float e3 = pollsAnswerDto.e();
                        PollsVotersUsersDto g3 = pollsAnswerDto.g();
                        if (g3 != null) {
                            g3.d();
                        }
                        PollsVotersUsersDto g4 = pollsAnswerDto.g();
                        if (g4 == null || (e = g4.e()) == null) {
                            pollsPollExtendedDto2 = pollsPollExtendedDto3;
                            emptyList2 = EmptyList.b;
                        } else {
                            List<UserId> list5 = e;
                            ?? arrayList7 = new ArrayList(c5g.u(list5, i5));
                            Iterator it6 = list5.iterator();
                            while (it6.hasNext()) {
                                arrayList7.add(Long.valueOf(((UserId) it6.next()).b));
                                pollsPollExtendedDto3 = pollsPollExtendedDto3;
                            }
                            pollsPollExtendedDto2 = pollsPollExtendedDto3;
                            emptyList2 = arrayList7;
                        }
                        arrayList6.add(new aqb0(d3, f, i24, e3, emptyList2));
                        pollsPollExtendedDto3 = pollsPollExtendedDto2;
                        i5 = 10;
                    }
                    pollsPollExtendedDto = pollsPollExtendedDto3;
                    emptyList = arrayList6;
                } else {
                    pollsPollExtendedDto = pollsPollExtendedDto3;
                    emptyList = EmptyList.b;
                }
                List<UsersUserFullDto> f2 = pollsGetStatsResponseDto.f();
                if (f2 != null) {
                    Set<Map.Entry> entrySet = new k2r0().b(f2).entrySet();
                    int e4 = on00.e(c5g.u(entrySet, 10));
                    if (e4 < 16) {
                        e4 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e4);
                    for (Map.Entry entry : entrySet) {
                        Pair pair = new Pair(Long.valueOf(((UserId) entry.getKey()).b), ((Owner) entry.getValue()).e);
                        linkedHashMap.put(pair.i(), pair.j());
                    }
                    map = p4g.h(linkedHashMap);
                } else {
                    map = jgp.b;
                }
                zpb0 zpb0Var = new zpb0(intValue, set, emptyList, map);
                PollsGetVotersCriteriaResponseDto pollsGetVotersCriteriaResponseDto = (PollsGetVotersCriteriaResponseDto) optional.orElse(null);
                if (pollsGetVotersCriteriaResponseDto != null) {
                    List<BaseCountryWithCitiesDto> d4 = pollsGetVotersCriteriaResponseDto.d();
                    if (d4 != null) {
                        List<BaseCountryWithCitiesDto> list6 = d4;
                        r3 = new ArrayList(c5g.u(list6, 10));
                        for (BaseCountryWithCitiesDto baseCountryWithCitiesDto : list6) {
                            int id = baseCountryWithCitiesDto.getId();
                            List<BaseCityDto> d5 = baseCountryWithCitiesDto.d();
                            if (d5 != null) {
                                List<BaseCityDto> list7 = d5;
                                ArrayList arrayList8 = new ArrayList(c5g.u(list7, 10));
                                for (BaseCityDto baseCityDto : list7) {
                                    WebCity webCity = new WebCity();
                                    webCity.b = baseCityDto.getId();
                                    webCity.c = baseCityDto.getTitle();
                                    arrayList8.add(webCity);
                                }
                                arrayList = p4g.q(arrayList8);
                            } else {
                                arrayList = new ArrayList();
                            }
                            r3.add(new hnb0(id, arrayList));
                        }
                    } else {
                        r3 = EmptyList.b;
                    }
                    bqz0Var = new bqz0((Object) r3);
                } else {
                    bqz0Var = null;
                }
                return new com.vk.dto.polls.a(zpb0Var, bqz0Var, fub0.a(new fub0(), pollsPollExtendedDto));
            case 26:
                h4c0 h4c0Var = (h4c0) this.c;
                l6z l6zVar = (l6z) this.d;
                Throwable th2 = (Throwable) obj;
                h4c0Var.f = true;
                h4c0Var.e.remove(Long.valueOf(l6zVar.a.hashCode()));
                L.j(th2, "Offline:PostInteractorWithOfflineSupport", "Error adding like action to local repository. Fallback to network for this session.");
                com.vk.metrics.eventtracking.b.a.a(new IOException("Error adding like action to local repository. Fallback to network for this session.", th2));
                return s3q0.a;
            case 27:
                vmd0 vmd0Var = (vmd0) this.c;
                ((aoj) obj).c((List) ((zak0) vmd0Var.e).getValue(), new umd0(vmd0Var, (wh50) this.d));
                return s3q0.a;
            case 28:
                ((inf0) this.d).d((String) this.c, (tnf0) obj);
                return s3q0.a;
            default:
                voj0 voj0Var = (voj0) this.c;
                c4 c4Var = (c4) this.d;
                SimilarVideoAction similarVideoAction = (SimilarVideoAction) obj;
                ooj0 ooj0Var = (ooj0) ((zak0) voj0Var.n).getValue();
                VideoScreenMode videoScreenMode = voj0Var.m;
                if (ooj0Var != null && (videoFile = ooj0Var.b) != null) {
                    int i25 = voj0.a.$EnumSwitchMapping$0[similarVideoAction.ordinal()];
                    if (i25 == 1) {
                        c4Var.d(new b4.a0(videoFile));
                    } else if (i25 == 2) {
                        c4Var.d(new b4.k(videoFile, videoScreenMode));
                    } else {
                        if (i25 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c4Var.d(new b4.u(videoFile));
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ d(int i, String str, Object obj) {
        this.b = i;
        this.d = obj;
        this.c = str;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
