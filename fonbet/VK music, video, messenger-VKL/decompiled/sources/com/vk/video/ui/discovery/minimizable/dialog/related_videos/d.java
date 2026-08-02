package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import android.os.Parcelable;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.stat.scheme.CommonVideoStat$AssistantType;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAssistantPlaylistAddClick;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAssistantPlaylistOpenClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.g;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.j;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a0u;
import xsna.bdn;
import xsna.bjc;
import xsna.c5g;
import xsna.eiy;
import xsna.epx;
import xsna.f4z;
import xsna.g5g;
import xsna.g7r0;
import xsna.he40;
import xsna.hpj;
import xsna.hsc0;
import xsna.hyu;
import xsna.ie00;
import xsna.ie40;
import xsna.k2s0;
import xsna.l5o;
import xsna.lc1;
import xsna.mbt0;
import xsna.ndg0;
import xsna.nkt0;
import xsna.o7y;
import xsna.qw40;
import xsna.rbt0;
import xsna.rsg0;
import xsna.t6m0;
import xsna.tbt0;
import xsna.tfx;
import xsna.ubt0;
import xsna.uft0;
import xsna.ver0;
import xsna.whn0;
import xsna.wk50;
import xsna.wvq0;
import xsna.yfb;
import xsna.zvj;

/* compiled from: VideoRelatedVideosFeature.kt */
/* loaded from: classes7.dex */
public final class d extends wk50<k, j, b, g> {
    public final l5o f;
    public final uft0 g;
    public final lc1 h;
    public final hpj i;
    public final f4z j;

    public d(l5o l5oVar, uft0 uft0Var, lc1 lc1Var) {
        super(b.a.b, new h(j.b.b));
        this.f = l5oVar;
        this.g = uft0Var;
        this.h = lc1Var;
        bdn bdnVar = bdn.a;
        this.i = zvj.a(ie00.a.U().plus(whn0.a()));
        this.j = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    @Override // xsna.wk50
    public final void N(j jVar, b bVar) {
        j jVar2;
        List list;
        j jVar3 = jVar;
        b bVar2 = bVar;
        if (bVar2.equals(b.a.b)) {
            return;
        }
        if (bVar2 instanceof b.e) {
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar = ((b.e) bVar2).b;
            if (hVar instanceof h.a) {
                h.a aVar = (h.a) hVar;
                m mVar = aVar.f;
                m.a aVar2 = mVar instanceof m.a ? (m.a) mVar : null;
                VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar.h;
                VideoFile videoFile = aVar.a;
                int a = com.vk.video.ui.discovery.minimizable.related_videos.i.a(aVar);
                if (aVar2 != null) {
                    List<rbt0> list2 = ((m.a) aVar.f).a.e;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        g5g.y(((rbt0) it.next()).d, arrayList);
                    }
                    list = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        VideoFile videoFile2 = (VideoFile) it2.next();
                        list.add(new mbt0(videoFile2, this.f.a(nkt0.a(videoFile2), DonutVideoCardSource.SMALL_CARD), epx.f(videoFile2.a1(), aVar.a.a1()), aVar.l, aVar.h.C4()));
                    }
                } else {
                    list = EmptyList.b;
                }
                jVar2 = new j.a(videoDiscoveryRelatedVideosSource, videoFile, a, mVar, list, aVar.i, aVar.j, aVar.k);
            } else {
                if (!(hVar instanceof h.c) && !epx.f(hVar, h.b.a) && !epx.f(hVar, h.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar2 = j.b.b;
            }
            T(new g.a(jVar2));
            return;
        }
        boolean equals = bVar2.equals(b.d.b);
        f4z f4zVar = this.j;
        if (equals) {
            j.a aVar3 = jVar3 instanceof j.a ? (j.a) jVar3 : null;
            if (aVar3 != null) {
                f4zVar.b(new i.c(aVar3.b));
                return;
            }
            return;
        }
        if (bVar2 instanceof b.C1985b) {
            U(jVar3);
            return;
        }
        if (bVar2 instanceof b.c) {
            j.a aVar4 = jVar3 instanceof j.a ? (j.a) jVar3 : null;
            VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource2 = aVar4 != null ? aVar4.b : null;
            VideoDiscoveryRelatedVideosSource.Playlist playlist = videoDiscoveryRelatedVideosSource2 instanceof VideoDiscoveryRelatedVideosSource.Playlist ? (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource2 : null;
            if (playlist != null) {
                V(playlist.b, ((b.c) bVar2).b, true);
                return;
            }
            return;
        }
        if (bVar2 instanceof b.h) {
            j.a aVar5 = jVar3 instanceof j.a ? (j.a) jVar3 : null;
            VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource3 = aVar5 != null ? aVar5.b : null;
            VideoDiscoveryRelatedVideosSource.Playlist playlist2 = videoDiscoveryRelatedVideosSource3 instanceof VideoDiscoveryRelatedVideosSource.Playlist ? (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource3 : null;
            if (playlist2 != null) {
                V(playlist2.b, true, false);
                return;
            }
            return;
        }
        if (bVar2 instanceof b.i) {
            j.a aVar6 = jVar3 instanceof j.a ? (j.a) jVar3 : null;
            if (aVar6 != null) {
                VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource4 = aVar6.b;
                f4zVar.b(new i.g(((b.i) bVar2).b, com.vk.video.ui.discovery.minimizable.related_videos.g.a(videoDiscoveryRelatedVideosSource4), videoDiscoveryRelatedVideosSource4.C4()));
                return;
            }
            return;
        }
        if (!(bVar2 instanceof b.f)) {
            if (!(bVar2 instanceof b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((jVar3 instanceof j.a) && (((j.a) jVar3).b instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist)) {
                U(jVar3);
                return;
            }
            return;
        }
        b.f fVar = (b.f) bVar2;
        j.a aVar7 = jVar3 instanceof j.a ? (j.a) jVar3 : null;
        Parcelable parcelable = aVar7 != null ? aVar7.b : null;
        VideoDiscoveryRelatedVideosSource.TemporaryPlaylist temporaryPlaylist = parcelable instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist ? (VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) parcelable : null;
        if (temporaryPlaylist != null) {
            String str = temporaryPlaylist.b;
            String str2 = temporaryPlaylist.f;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_AI_ASSISTANT, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoAssistantPlaylistOpenClick(CommonVideoStat$TypeVideoAssistantPlaylistOpenClick.EventType.ASSISTANT_PLAYLIST_OPEN, CommonVideoStat$AssistantType.MUSIC, str, null, null, str2, 24, null), 2)).q();
            f4zVar.b(new i.b(fVar.b));
        }
    }

    public final void U(j jVar) {
        j.a aVar = jVar instanceof j.a ? (j.a) jVar : null;
        Parcelable parcelable = aVar != null ? aVar.b : null;
        VideoDiscoveryRelatedVideosSource.TemporaryPlaylist temporaryPlaylist = parcelable instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist ? (VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) parcelable : null;
        if (temporaryPlaylist != null) {
            String str = temporaryPlaylist.b;
            this.g.getClass();
            tfx tfxVar = new tfx("video.saveAssistantAlbum", new k2s0(3), new g7r0(2));
            tfx.o(tfxVar, "temporary_uid", str, 0, 0, 12);
            n nVar = new n(rsg0.D0(yfb.x(tfxVar)), new wvq0(new c(this, 1), 6));
            int i = 29;
            int i2 = 0;
            this.e.b(new r(new o(nVar.h(new eiy(new hsc0(this, i), 27)), new qw40(new ndg0(9, this, str), 28)), new he40(new c(this, i2), 18)).l(new ie40(new hyu(i), 23)).subscribe(new t6m0(new ubt0(this, i2), 5)));
            String str2 = temporaryPlaylist.f;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_AI_ASSISTANT, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoAssistantPlaylistAddClick(CommonVideoStat$TypeVideoAssistantPlaylistAddClick.EventType.ASSISTANT_PLAYLIST_ADD, CommonVideoStat$AssistantType.MUSIC, null, null, str, str2, 12, null), 2)).q();
        }
    }

    public final void V(VideoAlbum videoAlbum, boolean z, boolean z2) {
        if (videoAlbum.l == z) {
            return;
        }
        UserId userId = videoAlbum.c;
        int i = videoAlbum.b;
        UiTracker uiTracker = UiTracker.a;
        ver0.a(rsg0.y0(new a0u(userId, i, UiTracker.d(), "", z, 32), null, null, 3).subscribe(new o7y(new tbt0(videoAlbum, z, z2, this), 28)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.i, null);
    }
}
