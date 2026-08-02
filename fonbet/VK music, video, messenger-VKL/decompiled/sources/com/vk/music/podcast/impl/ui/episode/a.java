package com.vk.music.podcast.impl.ui.episode;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.fkq0;
import xsna.gqu;
import xsna.izs;
import xsna.j5g;
import xsna.qxi;
import xsna.rsg0;
import xsna.td1;
import xsna.xqu;
import xsna.yfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(boolean z, int i, UserId userId, PodcastEpisodeFragment podcastEpisodeFragment) {
        this.c = z;
        this.d = i;
        this.e = userId;
        this.f = podcastEpisodeFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        PodcastPage podcastPage2;
        MusicTrack musicTrack2;
        PodcastPage podcastPage3;
        MusicTrack musicTrack3;
        ArrayList u0;
        Object obj2;
        int i = this.b;
        int i2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z = this.c;
        switch (i) {
            case 0:
                UserId userId = (UserId) obj4;
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj3;
                int i3 = PodcastEpisodeFragment.u0;
                if (z) {
                    qxi qxiVar = new qxi();
                    b bVar = (b) podcastEpisodeFragment.S;
                    return rsg0.y0(yfb.x(qxiVar.e(i2, userId, (bVar == null || (podcastPage3 = bVar.e) == null || (musicTrack3 = podcastPage3.b) == null) ? null : musicTrack3.y)), null, null, 3);
                }
                ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures)) {
                    UserId a = fkq0.a(userId);
                    b bVar2 = (b) podcastEpisodeFragment.S;
                    return rsg0.y0(yfb.x(xqu.a.c(null, (498 & 4) != 0 ? null : "episode", (498 & 8) != 0 ? null : (bVar2 == null || (podcastPage2 = bVar2.e) == null || (musicTrack2 = podcastPage2.b) == null) ? null : musicTrack2.y, null, a, null, null, null)), null, null, 3);
                }
                gqu gquVar = new gqu(fkq0.a(userId), false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                gquVar.P0("episode");
                b bVar3 = (b) podcastEpisodeFragment.S;
                gquVar.U0((bVar3 == null || (podcastPage = bVar3.e) == null || (musicTrack = podcastPage.b) == null) ? null : musicTrack.y);
                return rsg0.y0(gquVar, null, null, 3);
            default:
                td1 td1Var = (td1) obj4;
                ArrayList<VideoAlbumData> arrayList = (ArrayList) obj3;
                AlbumChooseState albumChooseState = (AlbumChooseState) obj;
                if (z || albumChooseState.b.isEmpty()) {
                    UserId q = td1Var.c.q();
                    ArrayList arrayList2 = new ArrayList();
                    if (!fkq0.b(q)) {
                        arrayList2.add(td1.h);
                    }
                    if (!td1Var.d || !fkq0.b(q)) {
                        arrayList2.add(td1.i);
                    }
                    List<VideoAlbumData> list = albumChooseState.b;
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    for (VideoAlbumData videoAlbumData : arrayList) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((VideoAlbumData) obj2).b == videoAlbumData.b) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        VideoAlbumData videoAlbumData2 = (VideoAlbumData) obj2;
                        if (videoAlbumData2 != null) {
                            videoAlbumData = VideoAlbumData.a(videoAlbumData, videoAlbumData2.f);
                        }
                        arrayList3.add(videoAlbumData);
                    }
                    u0 = j5g.u0(arrayList3, arrayList2);
                } else {
                    u0 = j5g.u0(arrayList, albumChooseState.b);
                }
                return AlbumChooseState.a(albumChooseState, u0, null, arrayList.size() + i2, false, arrayList.size() < 20, false, 98);
        }
    }

    public /* synthetic */ a(boolean z, td1 td1Var, ArrayList arrayList, int i) {
        this.c = z;
        this.e = td1Var;
        this.f = arrayList;
        this.d = i;
    }
}
