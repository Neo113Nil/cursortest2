package com.vk.movika.sdk.base.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media.MediaBrowserServiceCompat;
import androidx.recyclerview.widget.m;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.channels.dto.ChannelsDonutSettingsDto;
import com.vk.api.generated.market.dto.MarketProfileInfoLocationDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.catalog.impl.geo.e;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.lists.ListDataSet;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a0a;
import xsna.a1z;
import xsna.a630;
import xsna.b4b;
import xsna.b7q;
import xsna.bfm0;
import xsna.bgk0;
import xsna.bn1;
import xsna.bpn0;
import xsna.buz;
import xsna.bwt0;
import xsna.bz40;
import xsna.c5g;
import xsna.c9k;
import xsna.cak;
import xsna.ce60;
import xsna.ct4;
import xsna.cvk;
import xsna.dw20;
import xsna.dwj;
import xsna.e0w;
import xsna.e43;
import xsna.eea;
import xsna.epx;
import xsna.eth0;
import xsna.f4b;
import xsna.g2v;
import xsna.g86;
import xsna.ggm0;
import xsna.gru;
import xsna.h7u0;
import xsna.hgm0;
import xsna.hil;
import xsna.hl1;
import xsna.hv10;
import xsna.hyg0;
import xsna.ikv0;
import xsna.iuc0;
import xsna.izs;
import xsna.j4b;
import xsna.j5g;
import xsna.kbj0;
import xsna.kea;
import xsna.kvv;
import xsna.lfb0;
import xsna.lkw;
import xsna.m840;
import xsna.mj80;
import xsna.mqj;
import xsna.myc0;
import xsna.n1j;
import xsna.n3a;
import xsna.nb40;
import xsna.nk40;
import xsna.nr4;
import xsna.o1c;
import xsna.o1j;
import xsna.oai0;
import xsna.op1;
import xsna.oum;
import xsna.p8k;
import xsna.psm;
import xsna.qhb0;
import xsna.qr;
import xsna.qyg0;
import xsna.qzf0;
import xsna.rdi;
import xsna.ro;
import xsna.s350;
import xsna.s3q0;
import xsna.sv1;
import xsna.tjb0;
import xsna.tl60;
import xsna.vua0;
import xsna.w6b0;
import xsna.wbo0;
import xsna.wh50;
import xsna.wzs;
import xsna.x4m0;
import xsna.xk80;
import xsna.xn50;
import xsna.xuv;
import xsna.y3b;
import xsna.yfb;
import xsna.yiu;
import xsna.yzt0;
import xsna.zbo0;
import xsna.zda;
import xsna.zrj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v60, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        zda zdaVar;
        String d;
        ce60 ce60Var;
        int i;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        switch (this.b) {
            case 0:
                v0 v0Var = (v0) this.c;
                u0 u0Var = new u0(v0Var, (com.vk.movika.sdk.player.base.model.a) obj, (r) this.d, z ? 1 : 0);
                mj80 mj80Var = v0Var.d.c;
                xk80 xk80Var = mj80Var.c;
                Integer q = vua0.q(xk80Var);
                b7q g0 = xk80Var.g0();
                if (g0 != null) {
                    ArrayList arrayList = g0.a;
                    if (arrayList.size() != 0 && q != null) {
                        if (q.intValue() < arrayList.size() - 1) {
                            vua0.z(xk80Var, q.intValue() + 1, new com.vk.movika.sdk.base.logic.interactor.c(19, u0Var, mj80Var));
                        } else {
                            u0Var.invoke();
                        }
                        return s3q0.a;
                    }
                }
                u0Var.invoke();
                return s3q0.a;
            case 1:
                AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.c;
                UserId userId = (UserId) this.d;
                ikv0 ikv0Var = (ikv0) obj;
                int i2 = AbsFollowersListFragment.Y;
                eth0 go = absFollowersListFragment.go();
                if (go != null) {
                    go.a(userId);
                }
                g2v.c().b().L(absFollowersListFragment.requireContext(), "", "friend_request", userId.b);
                ikv0Var.a();
                return s3q0.a;
            case 2:
                ct4 ct4Var = (ct4) this.c;
                AudioPlayer audioPlayer = (AudioPlayer) this.d;
                float floatValue = ((Float) obj).floatValue();
                if (ct4Var.d.k) {
                    audioPlayer.setVolume(floatValue);
                }
                return s3q0.a;
            case 3:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new com.vk.catalog.mvi.block.video.impl.catalog.banner.c((CatalogBannerView.d) this.c, (CatalogBannerView.b) this.d, null), 3));
            case 4:
                n3a n3aVar = (n3a) this.c;
                kea keaVar = (kea) this.d;
                UIBlockList invoke = ((buz) n3aVar).b.invoke((UIBlockList) obj, keaVar.d);
                wzs<UIBlockList, CatalogExtendedData, s3q0> wzsVar = keaVar.w;
                CatalogExtendedData catalogExtendedData = keaVar.M;
                if (wzsVar != null && catalogExtendedData != null) {
                    wzsVar.invoke(invoke, catalogExtendedData);
                }
                keaVar.q(invoke);
                UIBlockList uIBlockList = keaVar.l;
                if (uIBlockList == null || (zdaVar = keaVar.s) == null) {
                    return null;
                }
                zdaVar.k(uIBlockList);
                return s3q0.a;
            case 5:
                j4b j4bVar = (j4b) this.c;
                y3b y3bVar = (y3b) this.d;
                ChannelsDonutSettingsDto channelsDonutSettingsDto = (ChannelsDonutSettingsDto) obj;
                Boolean e = channelsDonutSettingsDto.e();
                Boolean bool = Boolean.TRUE;
                boolean f = epx.f(e, bool);
                if (f && !j4bVar.g) {
                    y3bVar.j.b(b4b.f.a);
                }
                y3bVar.T(new f4b.c(epx.f(channelsDonutSettingsDto.d(), bool), f));
                return s3q0.a;
            case 6:
                hl1 hl1Var = (hl1) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                e.a aVar = (e.a) obj;
                if (aVar instanceof e.a.b) {
                    d = ((e.a.b) aVar).b;
                } else {
                    if (!(aVar instanceof e.a.C0931a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d = ((e.a.C0931a) aVar).a.d();
                }
                hl1Var.invoke(new MarketProfileInfoLocationDto(aVar.a.f().e(), aVar.a.f().f(), d));
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 7:
                ClipsInterestsFragment.b bVar = (ClipsInterestsFragment.b) this.c;
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) this.d;
                ClipsInterestsViewState.c cVar = (ClipsInterestsViewState.c) obj;
                int i3 = ClipsInterestsFragment.Y;
                bwt0.p0(bVar.c, true);
                bwt0.p0(bVar.g, true);
                bwt0.p0(bVar.h, true);
                bwt0.p0(bVar.i, false);
                bwt0.p0(bVar.j, false);
                mqj mqjVar = clipsInterestsFragment.R;
                if (mqjVar != null) {
                    yzt0<ClipsInterestsViewState.d> yzt0Var = cVar.a;
                    op1 op1Var = new op1(clipsInterestsFragment, 24);
                    ClipsInterestsFragment clipsInterestsFragment2 = mqjVar.a;
                    g86 g86Var = new g86(7, mqjVar, op1Var);
                    clipsInterestsFragment2.getClass();
                    xn50.a.a(clipsInterestsFragment2, yzt0Var, g86Var);
                }
                return s3q0.a;
            case 8:
                n1j n1jVar = (n1j) this.c;
                o1j o1jVar = (o1j) this.d;
                int i4 = n1j.k1;
                n1jVar.bo(o1jVar, n1j.a.COMPLETED);
                n1jVar.tn();
                return s3q0.a;
            case 9:
                ((p8k) this.c).Y((c9k) this.d, (cak) obj);
                return s3q0.a;
            case 10:
                ((hv10) obj).h((bgk0) this.c, (SpeakerType) this.d);
                return s3q0.a;
            case 11:
                psm psmVar = (psm) this.c;
                Set set = (Set) this.d;
                oum oumVar = (oum) obj;
                oum a = oum.a(oumVar, null, null, null, null, null, set, null, null, null, null, null, null, 4063);
                SetBuilder setBuilder = new SetBuilder();
                Set<Peer> set2 = oumVar.f;
                ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((Peer) it.next()).b));
                }
                setBuilder.addAll(arrayList2);
                Set set3 = set;
                ArrayList arrayList3 = new ArrayList(c5g.u(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((Peer) it2.next()).b));
                }
                setBuilder.addAll(arrayList3);
                s3q0 s3q0Var = s3q0.a;
                return psmVar.w(a, setBuilder.d());
            case 12:
                final EmptyPlaylistBottomSheet emptyPlaylistBottomSheet = (EmptyPlaylistBottomSheet) this.c;
                final ClipsPlaylist clipsPlaylist = (ClipsPlaylist) this.d;
                int i5 = ((ModalActionSheetListItem) obj).a;
                if (i5 == EmptyPlaylistBottomSheet.Item.AddClips.ordinal()) {
                    emptyPlaylistBottomSheet.k.invoke();
                    ((ClipsPlaylistsComponentImpl) emptyPlaylistBottomSheet.m.getValue()).e().d(emptyPlaylistBottomSheet.h, new ClipsPlaylistPickerParams.AddClips(clipsPlaylist, emptyPlaylistBottomSheet.l));
                } else if (i5 == EmptyPlaylistBottomSheet.Item.SharePlaylist.ordinal()) {
                    Context context = emptyPlaylistBottomSheet.h;
                    boolean z2 = emptyPlaylistBottomSheet.l;
                    kbj0.c(nr4.b(), context, "https://" + a0a.d + "/clips/playlist/" + clipsPlaylist.f.b + '_' + clipsPlaylist.b, false, null, null, z2, 88);
                    emptyPlaylistBottomSheet.k.invoke();
                } else if (i5 == EmptyPlaylistBottomSheet.Item.DeletePlaylist.ordinal()) {
                    int i6 = h7u0.p;
                    Context context2 = emptyPlaylistBottomSheet.h;
                    h7u0.a c = h7u0.b.c(context2);
                    c.h0(context2.getString(R.string.clips_playlist_delete_title));
                    c.W(R.string.clips_playlist_delete_cancel_btn, new o1c());
                    c.c0(R.string.clips_playlist_delete_empty_accept_btn, new DialogInterface.OnClickListener() { // from class: xsna.xgp
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            ClipsPlaylist clipsPlaylist2 = clipsPlaylist;
                            UserId userId2 = clipsPlaylist2.f;
                            int i8 = clipsPlaylist2.b;
                            EmptyPlaylistBottomSheet emptyPlaylistBottomSheet2 = EmptyPlaylistBottomSheet.this;
                            gzs<s3q0> gzsVar = emptyPlaylistBottomSheet2.j;
                            boolean z3 = emptyPlaylistBottomSheet2.l;
                            hqe hqeVar = emptyPlaylistBottomSheet2.i.f;
                            io.reactivex.rxjava3.core.x c2 = ((ClipsPlaylistsComponentImpl) emptyPlaylistBottomSheet2.m.getValue()).b().c(i8, userId2);
                            asu0 asu0Var = asu0.a;
                            ver0.a(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(c2.q(asu0Var.c()).m(asu0Var.d()), new fa(gzsVar, 4)), new dp4(emptyPlaylistBottomSheet2, z3, 1), new vmg(hqeVar, userId2, emptyPlaylistBottomSheet2, z3)));
                            emptyPlaylistBottomSheet2.k.invoke();
                        }
                    });
                    c.m();
                }
                return s3q0.a;
            case 13:
                gru gruVar = (gru) this.c;
                Collection<yiu> collection = (Collection) this.d;
                gruVar.getClass();
                SQLiteStatement g = ((e0w) obj).g("\n                REPLACE INTO groups_can_send_pending(group_id, can_send_msg_to_me, can_send_notify_to_me)\n                VALUES (?,?,?)\n                ");
                try {
                    for (yiu yiuVar : collection) {
                        g.bindLong(1, yiuVar.a.d);
                        rdi.i(g, 2, yiuVar.b);
                        rdi.i(g, 3, yiuVar.c);
                        g.executeInsert();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    g.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(g, th);
                        throw th2;
                    }
                }
            case 14:
                kvv kvvVar = (kvv) this.c;
                kvvVar.e.invoke(((xuv) ((ArrayList) kvvVar.y0()).get(((kvv.a) this.d).getAdapterPosition())).b);
                return s3q0.a;
            case 15:
                wh50 wh50Var = (wh50) this.c;
                wh50Var.setValue(zbo0.a((zbo0) wh50Var.getValue(), null, ((Boolean) obj).booleanValue() ? (wbo0.a) this.d : null, false, false, false, 29));
                return s3q0.a;
            case 16:
                ((MediaBrowserServiceCompat.g) this.c).f(new ArrayList(((a1z) this.d).c.d((List) obj)));
                return s3q0.a;
            case 17:
                m840 m840Var = (m840) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                List<String> list = (List) obj;
                a630 a630Var = m840Var.a;
                Context context3 = e43.a;
                a630Var.W(context3 != null ? context3 : null, musicTrack, true, list);
                return s3q0.a;
            case 18:
                MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder = (MusicBigPlayerTrackListHolder) this.c;
                w6b0<?> w6b0Var = musicBigPlayerTrackListHolder.z;
                ArrayList arrayList4 = (ArrayList) this.d;
                if (((Boolean) obj).booleanValue()) {
                    w6b0Var.a();
                } else {
                    s350 s350Var = musicBigPlayerTrackListHolder.y;
                    s350Var.d.removeCallbacks(s350Var.i);
                    s350Var.g = null;
                    bz40 bz40Var = musicBigPlayerTrackListHolder.u;
                    m.d a2 = androidx.recyclerview.widget.m.a(new nb40((ListDataSet.ArrayListImpl) bz40Var.y0(), arrayList4), true);
                    ArrayList arrayList5 = (ArrayList) bz40Var.y0();
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    s350Var.a(a2);
                    w6b0Var.a();
                }
                return s3q0.a;
            case 19:
                List list2 = (List) this.c;
                nk40 nk40Var = (nk40) this.d;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMusicTrack) {
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (nk40Var.b(uIBlock, ((UIBlockMusicTrack) uIBlock).Rb(), (MusicTrack) it3.next(), false)) {
                                z = true;
                            }
                        }
                    }
                } else if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) {
                    List list4 = list2;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            if (nk40Var.b(uIBlock, ((UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock).Rb(), (MusicTrack) it4.next(), false)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 20:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) this.c;
                View view = (View) this.d;
                Set<String> set4 = MusicTrackCellVh.A;
                musicTrackCellVh.g(view);
                return s3q0.a;
            case 21:
                Size size = (Size) this.c;
                SchemeStat$TypeNetworkImagesItem.ImageFormat imageFormat = (SchemeStat$TypeNetworkImagesItem.ImageFormat) this.d;
                lkw lkwVar = (lkw) obj;
                lkwVar.c = size;
                lkwVar.d = imageFormat;
                return s3q0.a;
            case 22:
                lfb0 lfb0Var = (lfb0) this.c;
                View inflate = ((LayoutInflater) this.d).inflate(R.layout.vk_error_screen, (ViewGroup) obj, false);
                inflate.findViewById(R.id.error_retry).setOnClickListener(new bn1(lfb0Var, 11));
                return inflate;
            case 23:
                qhb0 qhb0Var = (qhb0) this.c;
                UserId userId2 = (UserId) this.d;
                if (((BaseBoolIntDto) obj) != BaseBoolIntDto.YES) {
                    return io.reactivex.rxjava3.core.a.k(new VKApiException("Can`t unsubscribe from podcast"));
                }
                qhb0Var.b.b(new tjb0(userId2));
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 24:
                NewsEntry newsEntry = (NewsEntry) this.c;
                NewsEntry newsEntry2 = (NewsEntry) this.d;
                tl60 tl60Var = (tl60) obj;
                if (tl60Var.f) {
                    ce60Var = ce60.b;
                    i = 101;
                } else {
                    ce60Var = ce60.b;
                    i = 100;
                }
                qr.d(ce60Var, i, newsEntry);
                if (!tl60Var.f || ((newsEntry2 instanceof DiscoverMediaBlock) && !(newsEntry instanceof DiscoverMediaBlock))) {
                    int i7 = iuc0.a.$EnumSwitchMapping$0[tl60Var.g.ordinal()];
                    int i8 = i7 != 1 ? i7 != 2 ? i7 != 3 ? R.string.hide_not_interesting_toast : 0 : R.string.hide_not_interesting_toast_videos : R.string.hide_not_interesting_toast_clips;
                    if (i8 != 0) {
                        cvk.u(i8, false);
                    }
                }
                return s3q0.a;
            case 25:
                dwj dwjVar2 = (dwj) obj;
                return dwjVar2.m(myc0.h(dwjVar2.getScope(), null, null, new qzf0((eea) this.c, (String) this.d, null), 3));
            case 26:
                oai0 oai0Var = (oai0) this.c;
                MusicTrack musicTrack2 = (MusicTrack) this.d;
                oai0Var.o.J0(musicTrack2);
                oai0Var.l6(musicTrack2);
                return s3q0.a;
            case 27:
                return new zrj0((wh50) this.c, (com.vk.newsfeed.impl.items.posting.item.modals.d) this.d);
            case 28:
                StoryEntry storyEntry = (StoryEntry) this.c;
                x4m0 x4m0Var = (x4m0) this.d;
                StoryEntry Bb = ((StoriesContainer) j5g.Y((ArrayList) obj)).Bb();
                storyEntry.p0 = Bb != null ? Bb.p0 : null;
                StoryViewHeader storyViewHeader = x4m0Var.d.P;
                if (storyViewHeader != null) {
                    storyViewHeader.a(storyEntry);
                }
                return s3q0.a;
            default:
                ggm0 ggm0Var = (ggm0) this.c;
                hgm0 hgm0Var = (hgm0) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                ggm0Var.c.getClass();
                qyg0 V0 = hyg0Var.V0("UPDATE OR ABORT `story_statistics_questions_meta` SET `owner_id` = ?,`story_id` = ?,`totalQuestionsCount` = ? WHERE `owner_id` = ? AND `story_id` = ?");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    UserId userId3 = hgm0Var.a;
                    V0.bindLong(1, userId3.b);
                    long j = hgm0Var.b;
                    V0.bindLong(2, j);
                    V0.bindLong(3, hgm0Var.c);
                    V0.bindLong(4, userId3.b);
                    V0.bindLong(5, j);
                    V0.step();
                    yfb.d(V0, null);
                    sv1.p(hyg0Var);
                    return s3q0.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        yfb.d(V0, th3);
                        throw th4;
                    }
                }
        }
    }

    public /* synthetic */ s0(hil.b bVar, bgk0 bgk0Var, SpeakerType speakerType) {
        this.b = 10;
        this.c = bgk0Var;
        this.d = speakerType;
    }
}
