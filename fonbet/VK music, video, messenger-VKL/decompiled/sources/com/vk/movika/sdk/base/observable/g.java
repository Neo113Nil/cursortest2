package com.vk.movika.sdk.base.observable;

import android.text.Editable;
import com.ironsource.Hb;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.a;
import com.vk.bridges.ImageViewer;
import com.vk.channels.impl.donut.a;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.recycler.ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.contacts.ContactsSyncActivity;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookGenre;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPublisher;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.PollInfo;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.scheduled_clips.f;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import com.vk.voip.ui.settings.participants_view.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a390;
import xsna.ao8;
import xsna.aof;
import xsna.aoh;
import xsna.bh6;
import xsna.c3e;
import xsna.c5g;
import xsna.d2h;
import xsna.d3e;
import xsna.dhd;
import xsna.drm0;
import xsna.dwm0;
import xsna.e3e;
import xsna.egd;
import xsna.epx;
import xsna.fgh;
import xsna.fre;
import xsna.fu0;
import xsna.g3e;
import xsna.g5g;
import xsna.g69;
import xsna.g84;
import xsna.ggj;
import xsna.gm50;
import xsna.gr3;
import xsna.h60;
import xsna.h69;
import xsna.iq1;
import xsna.iy0;
import xsna.izs;
import xsna.j03;
import xsna.jq1;
import xsna.kgj0;
import xsna.kym0;
import xsna.l8j;
import xsna.laj;
import xsna.lg7;
import xsna.m8;
import xsna.mdg;
import xsna.n9a;
import xsna.nhe;
import xsna.nmv;
import xsna.noa;
import xsna.o2i;
import xsna.oa;
import xsna.om6;
import xsna.oq;
import xsna.p9m;
import xsna.po40;
import xsna.px9;
import xsna.qsb;
import xsna.r3u;
import xsna.rgd;
import xsna.rj8;
import xsna.rq1;
import xsna.rsg0;
import xsna.s290;
import xsna.s3q0;
import xsna.sj8;
import xsna.tfx;
import xsna.tj50;
import xsna.tlo0;
import xsna.tsb;
import xsna.vee;
import xsna.vg7;
import xsna.vl1;
import xsna.vod;
import xsna.vw9;
import xsna.w9y;
import xsna.wy9;
import xsna.x7;
import xsna.yfb;
import xsna.yzc;
import xsna.z21;
import xsna.zak0;
import xsna.zkd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [xsna.w9y] */
    /* JADX WARN: Type inference failed for: r2v78, types: [android.view.ViewGroup, xsna.tod] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [xsna.nmv] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [xsna.vee] */
    /* JADX WARN: Type inference failed for: r6v16, types: [xsna.vee] */
    /* JADX WARN: Type inference failed for: r6v17, types: [xsna.vee] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState;
        String str2;
        UserId userId;
        int i = this.b;
        int i2 = 27;
        int i3 = 4;
        int i4 = 10;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.listener.e) obj).e((List) obj2);
                return s3q0.a;
            case 1:
                iy0 iy0Var = (iy0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = iy0Var.q;
                iy0Var.q = booleanValue;
                if (booleanValue != z) {
                    iy0Var.p.F0(booleanValue);
                }
                return s3q0.a;
            case 2:
                z21 z21Var = (z21) obj2;
                z21Var.n.invoke(Integer.valueOf(z21Var.getBindingAdapterPosition()));
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((PhotoAlbum) obj).b == ((PhotoAlbum) obj2).b);
            case 4:
                return new rq1.a(((tj50.a) obj).a(new iq1(1, (jq1) obj2, jq1.class, "buildAlbumsListState", "buildAlbumsListState(Lcom/vk/photos/root/albumssettings/domain/AlbumsSettingsState;)Lcom/vk/photos/root/albumssettings/domain/AlbumsSettingsViewState$ListState;", 0), ao8.d));
            case 5:
                PollInfo pollInfo = (PollInfo) obj;
                a.InterfaceC0377a interfaceC0377a = ((com.vk.articles.a) obj2).o;
                if (interfaceC0377a != null) {
                    interfaceC0377a.z2(pollInfo);
                }
                return s3q0.a;
            case 6:
                AudioBook audioBook = (AudioBook) obj2;
                ?? r1 = (w9y) obj;
                r1.c(Integer.valueOf(audioBook.b), "id");
                r1.e(audioBook.c, "title");
                r1.e(audioBook.d, "annotation");
                r1.c(Integer.valueOf(audioBook.e), "minimum_age");
                r1.b(Boolean.valueOf(audioBook.f), "is_explicit");
                r1.c(Integer.valueOf(audioBook.g), "duration");
                AudioBookPublisher audioBookPublisher = audioBook.h;
                r1.e(audioBookPublisher != null ? audioBookPublisher.e5() : null, Hb.b);
                r1.c(Integer.valueOf(audioBook.i), "updated_at");
                Image image = audioBook.j;
                r1.e(image != null ? image.Gb() : null, "cover");
                List<AudioBookChapter> list = audioBook.k;
                if (list != null) {
                    List<AudioBookChapter> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AudioBookChapter) it.next()).e5());
                    }
                } else {
                    arrayList = null;
                }
                r1.e(arrayList, "chapters");
                List<AudioBookPerson> list3 = audioBook.l;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((AudioBookPerson) it2.next()).e5());
                }
                r1.e(arrayList3, "authors");
                List<AudioBookPerson> list4 = audioBook.m;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((AudioBookPerson) it3.next()).e5());
                }
                r1.e(arrayList4, "narrators");
                List<AudioBookPerson> list5 = audioBook.n;
                if (list5 != null) {
                    List<AudioBookPerson> list6 = list5;
                    arrayList2 = new ArrayList(c5g.u(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((AudioBookPerson) it4.next()).e5());
                    }
                } else {
                    arrayList2 = null;
                }
                r1.e(arrayList2, "translators");
                List<AudioBookGenre> list7 = audioBook.o;
                ArrayList arrayList5 = new ArrayList(c5g.u(list7, 10));
                Iterator it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((AudioBookGenre) it5.next()).e5());
                }
                r1.e(arrayList5, "genres");
                r1.e(audioBook.p, "copyright");
                r1.c(audioBook.q, "release_date");
                r1.b(Boolean.valueOf(audioBook.r), "in_favorites");
                r1.e(audioBook.s.i(), "access_status");
                r1.e(audioBook.t, "track_code");
                r1.c(Integer.valueOf(audioBook.u), "flags_context");
                MusicDynamicRestriction musicDynamicRestriction = audioBook.v;
                r1.e(musicDynamicRestriction != null ? musicDynamicRestriction.e5() : null, "restriction");
                r1.e(audioBook.w, "illegal_mentions_text");
                return s3q0.a;
            case 7:
                return om6.a((om6) obj2);
            case 8:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                for (lg7 lg7Var : ((vg7) obj2).a.getValue()) {
                    ggjVar.N1((((int) (r4.d - r4.b)) & 4294967295L) | (((int) (r4.c - r4.a)) << 32), new g84(i2, lg7Var.a, ggjVar), lg7Var.b);
                }
                return s3q0.a;
            case 9:
                rj8 rj8Var = (rj8) obj2;
                sj8.a aVar = new sj8.a(rj8Var.c.isChecked(), rj8Var.e.isChecked());
                if (rj8Var.h) {
                    rj8Var.g.onNext(aVar);
                }
                return s3q0.a;
            case 10:
                int i6 = CallOnboardingView.j;
                ((h69) obj2).d.onNext((g69) obj);
                return s3q0.a;
            case 11:
                ((com.vk.voip.ui.settings.participants_view.c) obj2).a(j.n.a);
                return s3q0.a;
            case 12:
                wy9 wy9Var = (wy9) obj;
                ((vw9) obj2).T(new px9.f.a(wy9Var.a, wy9Var.b));
                return s3q0.a;
            case 13:
                ((zak0) ((noa) obj2).k).setValue((String) obj);
                return s3q0.a;
            case 14:
                com.vk.channels.impl.donut.c cVar = (com.vk.channels.impl.donut.c) obj2;
                Editable editable = (Editable) obj;
                if (!cVar.k) {
                    x7 x7Var = cVar.b;
                    if (editable == null || (str = editable.toString()) == null) {
                        str = "";
                    }
                    x7Var.invoke(new a.e(str));
                }
                return s3q0.a;
            case 15:
                ChatFragment chatFragment = (ChatFragment) obj2;
                int intValue = ((Integer) obj).intValue();
                ImageViewer.c<AttachForMediaViewer> cVar2 = chatFragment.w0;
                if (cVar2 != null) {
                    cVar2.a(true);
                }
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                MsgIdType msgIdType = MsgIdType.CNV_ID;
                aVar2.a2(msgIdType, intValue, "createMediaViewerCallback");
                com.vk.im.ui.components.msg_list.a aVar3 = chatFragment.H0;
                (aVar3 == null ? null : aVar3).w1(msgIdType, intValue);
                return s3q0.a;
            case 16:
                tsb tsbVar = ((qsb) obj2).q;
                if (tsbVar != null) {
                    tsbVar.e();
                }
                return s3q0.a;
            case 17:
                rgd rgdVar = (rgd) obj2;
                bh6.c cVar3 = (bh6.c) obj;
                if (cVar3 instanceof n9a.b) {
                    rgdVar.g(((n9a.b) cVar3).a, null);
                } else if (cVar3 instanceof n9a.a) {
                    zkd zkdVar = rgdVar.b.d.w;
                    zkdVar.a.d(8, zkdVar.b, new oa(13));
                }
                return s3q0.a;
            case 18:
                ((vod) obj2).c.a((dhd) obj);
                return s3q0.a;
            case 19:
                ClipsFavoriteFolderContentListState.Content content = (ClipsFavoriteFolderContentListState.Content) obj;
                g3e g3eVar = ((com.vk.clips.favorites.impl.ui.folders.content.f) obj2).e;
                List<VideoFile> list8 = content.d;
                ClipsFavoriteFolderContentListState.Content.LoadingState loadingState = content.f;
                ClipsFavoriteFolderContentListState.c cVar4 = content.c;
                g3eVar.getClass();
                ArrayList arrayList6 = new ArrayList();
                List<VideoFile> list9 = list8;
                ArrayList arrayList7 = new ArrayList(c5g.u(list9, 10));
                for (VideoFile videoFile : list9) {
                    if (cVar4 instanceof ClipsFavoriteFolderContentListState.c.b) {
                        clipsFavoriteFolderContentListItem$MultiSelectCheckboxState = ((ClipsFavoriteFolderContentListState.c.b) cVar4).a.contains(videoFile.r1()) ? ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.CHECKED : ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.UNCHECKED;
                    } else {
                        if (!(cVar4 instanceof ClipsFavoriteFolderContentListState.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        clipsFavoriteFolderContentListItem$MultiSelectCheckboxState = ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.HIDDEN;
                    }
                    String r12 = videoFile.r1();
                    Image image2 = videoFile.getImage();
                    tlo0.a aVar4 = tlo0.Companion;
                    Owner s = videoFile.s();
                    if (s == null || (str2 = s.c) == null) {
                        str2 = "DELETED";
                    }
                    tlo0.h d = oq.d(aVar4, str2);
                    VideoRestriction O = videoFile.O();
                    arrayList7.add(new c3e(clipsFavoriteFolderContentListItem$MultiSelectCheckboxState, r12, image2, d, O != null ? new VideoOverlayView.c.j(((a390) g3eVar.a.getValue()).a(O), ((s290) g3eVar.b.getValue()).a(videoFile.w2()), null, null) : null));
                }
                g5g.y(arrayList7, arrayList6);
                if (loadingState == ClipsFavoriteFolderContentListState.Content.LoadingState.LOADING_NEXT) {
                    arrayList6.add(e3e.b);
                }
                if (loadingState == ClipsFavoriteFolderContentListState.Content.LoadingState.ERROR_NEXT) {
                    arrayList6.add(d3e.b);
                }
                return arrayList6;
            case 20:
                ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) obj2;
                kym0 kym0Var = (kym0) obj;
                int i7 = ClipsGridCommonClipsListFragment.q0;
                List<nmv> y0 = clipsGridCommonClipsListFragment.jo().y0();
                ArrayList arrayList8 = new ArrayList(c5g.u(y0, 10));
                Iterator it6 = ((ArrayList) y0).iterator();
                while (it6.hasNext()) {
                    ?? r6 = (nmv) it6.next();
                    if (r6 instanceof vee) {
                        r6 = (vee) r6;
                        ClipVideoFile clipVideoFile = r6.a;
                        yzc a = egd.a(clipVideoFile);
                        List<CoOwnerItem> list10 = clipVideoFile.N1;
                        if (a instanceof yzc.c) {
                            userId = ((yzc.c) a).b;
                        } else if (a instanceof yzc.a) {
                            userId = null;
                        } else {
                            if (!(a instanceof yzc.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userId = ((yzc.b) a).c;
                        }
                        SubscribeStatus.a aVar5 = SubscribeStatus.Companion;
                        SubscribeStatus subscribeStatus = kym0Var.a;
                        aVar5.getClass();
                        boolean c = SubscribeStatus.a.c(subscribeStatus);
                        UserId userId2 = kym0Var.b;
                        if (epx.f(userId, userId2)) {
                            ClipVideoFile clipVideoFile2 = (ClipVideoFile) clipVideoFile.copy();
                            clipVideoFile2.U1 = clipVideoFile.U1;
                            clipVideoFile2.V1 = clipVideoFile.V1;
                            clipVideoFile2.W1 = clipVideoFile.W1;
                            clipVideoFile2.t0 = c;
                            Owner owner = clipVideoFile2.v0;
                            if (owner != null) {
                                owner.g(4, c);
                            }
                            r6 = vee.b(r6, clipVideoFile2);
                        } else {
                            List<CoOwnerItem> list11 = list10;
                            if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                                Iterator it7 = list11.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        break;
                                    }
                                    if (epx.f(((CoOwnerItem) it7.next()).b, userId2)) {
                                        ArrayList arrayList9 = new ArrayList(c5g.u(list11, 10));
                                        for (CoOwnerItem coOwnerItem : list11) {
                                            if (epx.f(coOwnerItem.b, userId2)) {
                                                coOwnerItem.d.g(4, c);
                                            }
                                            arrayList9.add(coOwnerItem);
                                        }
                                        r6 = vee.b(r6, ClipVideoFile.Kb(clipVideoFile, false, null, null, arrayList9, null, null, null, 8355839));
                                    }
                                }
                            }
                        }
                    }
                    arrayList8.add(r6);
                }
                clipsGridCommonClipsListFragment.jo().setItems(arrayList8);
                aof aofVar = clipsGridCommonClipsListFragment.j0;
                if (aofVar != null) {
                    aofVar.a();
                }
                return s3q0.a;
            case 21:
                CoOwnerItem coOwnerItem2 = (CoOwnerItem) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.d(Long.valueOf(coOwnerItem2.b.b), "owner_id");
                w9yVar.e(coOwnerItem2.c.j(), "status");
                w9yVar.e(coOwnerItem2.d.e5(), "owner");
                w9yVar.b(Boolean.valueOf(coOwnerItem2.e), "can_set_status");
                ClipMainTabState clipMainTabState = coOwnerItem2.f;
                w9yVar.c(clipMainTabState != null ? Integer.valueOf(clipMainTabState.h()) : null, "main_tab_state");
                return s3q0.a;
            case 22:
                return Boolean.valueOf(epx.f(((p9m) obj).a, (String) obj2));
            case 23:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (!((o2i) ((mdg) obj2).c0.getValue()).d(vKApiExecutionException, false)) {
                    j03.a.getClass();
                    j03.k(vKApiExecutionException);
                }
                return Boolean.TRUE;
            case 24:
                d2h d2hVar = (d2h) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    int i8 = d2h.p1;
                    if (!drm0.N(str3)) {
                        ((po40) d2hVar.g1.b).getClass();
                        tfx tfxVar = new tfx("utils.checkScreenName", new kgj0(i3), new dwm0(i5));
                        tfx.o(tfxVar, "screen_name", str3, 0, 0, 12);
                        int i9 = 16;
                        d2hVar.h1.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new fu0(new fre(d2hVar, i4), i9), new h60(new nhe(d2hVar, i3), i9)));
                        return s3q0.a;
                    }
                }
                VkSimpleButton vkSimpleButton = d2hVar.o1;
                (vkSimpleButton != null ? vkSimpleButton : null).setEnabled(false);
                return s3q0.a;
            case 25:
                aoh aohVar = (aoh) obj2;
                if (((r3u) obj).c == OneTimeDonutEventStatus.SUCCESS) {
                    aohVar.a.invoke(new CommunityProfileAction.o(false));
                }
                return s3q0.a;
            case 26:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj2;
                g.b bVar = (g.b) obj;
                int i10 = CommunityReviewsFragment.o0;
                communityReviewsFragment.ho(CommunityReviewsFragment.b.EMPTY);
                gm50.a.a(communityReviewsFragment, bVar.a, new gr3(communityReviewsFragment, 28));
                gm50.a.a(communityReviewsFragment, bVar.b, new com.vk.im.engine.internal.api_commands.messages.a(communityReviewsFragment, i2));
                return s3q0.a;
            case 27:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) obj2;
                com.vk.profile.core.scheduled_clips.f fVar = (com.vk.profile.core.scheduled_clips.f) obj;
                hVar.g.Mk();
                if (!(fVar instanceof f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f.a aVar6 = (f.a) fVar;
                gm50.a.a(hVar, aVar6.a, new vl1(hVar, 21));
                gm50.a.a(hVar, aVar6.b, new fgh(hVar, 2));
                gm50.a.a(hVar, aVar6.c, new k(hVar, 29));
                gm50.a.a(hVar, aVar6.d, new m8(hVar, 1));
                return s3q0.a;
            case 28:
                l8j l8jVar = (l8j) obj2;
                laj X0 = l8jVar.X0();
                ((Boolean) obj).getClass();
                X0.getClass();
                l8jVar.X0().getClass();
                return s3q0.a;
            default:
                int i11 = ContactsSyncActivity.f;
                ((ContactsSyncActivity) obj2).finish();
                return s3q0.a;
        }
    }
}
