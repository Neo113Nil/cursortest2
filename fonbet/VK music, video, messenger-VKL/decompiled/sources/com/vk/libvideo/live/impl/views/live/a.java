package com.vk.libvideo.live.impl.views.live;

import com.vk.dto.common.VideoFile;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.live.impl.views.live.ProgressErrorStateMashine;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import xsna.asu0;
import xsna.bpn0;
import xsna.e1q;
import xsna.eiy;
import xsna.emz;
import xsna.fgg0;
import xsna.fyr0;
import xsna.gpt0;
import xsna.i000;
import xsna.nnz;
import xsna.piz;
import xsna.qpb;
import xsna.wjs0;
import xsna.yg5;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class a implements f<VideoOwner> {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(VideoOwner videoOwner) throws Throwable {
        VideoOwner videoOwner2;
        VideoFile videoFile;
        yg5 yg5Var;
        yg5 yg5Var2;
        VideoOwner videoOwner3 = videoOwner;
        b bVar = this.b;
        VideoOwner videoOwner4 = bVar.n;
        i000 i000Var = bVar.u0;
        piz pizVar = bVar.f;
        ProgressErrorStateMashine progressErrorStateMashine = bVar.g;
        e1q e1qVar = bVar.h;
        String str = videoOwner4.i;
        if (str != null) {
            videoOwner3.f.setTrackCode(str);
        }
        String str2 = bVar.n.j;
        if (str2 != null) {
            videoOwner3.f.m8(str2);
        }
        VideoOwner videoOwner5 = bVar.n;
        videoOwner5.f = videoOwner3.f;
        videoOwner5.g = videoOwner3.g;
        videoOwner5.h = videoOwner3.h;
        videoOwner5.c = videoOwner3.c;
        videoOwner5.e = videoOwner3.e;
        videoOwner5.d = videoOwner3.d;
        wjs0.a(new fyr0(videoOwner3.f));
        bVar.A = null;
        ProgressErrorStateMashine.State state = ProgressErrorStateMashine.State.HIDE;
        progressErrorStateMashine.b = state;
        progressErrorStateMashine.d = state;
        progressErrorStateMashine.a();
        progressErrorStateMashine.b();
        nnz nnzVar = bVar.Z;
        if (nnzVar != null) {
            nnzVar.j(videoOwner3.f);
        }
        emz emzVar = bVar.a0;
        if (emzVar != null) {
            emzVar.b(videoOwner3.f);
        }
        if (bVar.O) {
            bVar.reset();
            nnz nnzVar2 = bVar.Z;
            if (nnzVar2 != null && (((yg5Var = nnzVar2.f) != null && yg5Var.isReady()) || ((yg5Var2 = nnzVar2.f) != null && yg5Var2.P0()))) {
                pizVar.A4();
            }
        }
        bVar.G2();
        bVar.y2();
        bVar.J = true;
        bVar.I2();
        if (bVar.I && !gpt0.w(videoOwner3.f)) {
            bVar.z2();
            bVar.A2();
            bVar.x2();
            bVar.B2();
        }
        qpb qpbVar = e1qVar.b;
        if (qpbVar != null) {
            qpbVar.q2();
        }
        Iterator it = new fgg0(videoOwner3.k).iterator();
        while (true) {
            ListIterator<T> listIterator = ((fgg0.a) it).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            LiveEventModel liveEventModel = (LiveEventModel) listIterator.previous();
            StringBuilder sb = new StringBuilder("onStartComment: ");
            i000Var.getClass();
            sb.append(i000.b(liveEventModel));
            i000Var.a(sb.toString());
            e1qVar.b(liveEventModel);
        }
        Iterator<LiveEventModel> it2 = videoOwner3.l.iterator();
        while (it2.hasNext()) {
            e1qVar.b(it2.next());
        }
        if (bVar.N && (videoOwner2 = bVar.n) != null && (videoFile = videoOwner2.f) != null && bVar.q != null) {
            videoFile.u7(videoOwner3.f.m1());
            bVar.r.b(videoOwner3.f.m1());
        }
        boolean equals = videoOwner3.f.a1().equals(bVar.v0);
        boolean x0 = videoOwner3.f.x0();
        if (equals || bVar.Q || !x0) {
            return;
        }
        String a1 = videoOwner3.f.a1();
        if (bVar.Y == null) {
            return;
        }
        c cVar = bVar.C;
        if (cVar != null) {
            cVar.dispose();
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a = b.C1208b.a();
        VideoFile videoFile2 = bVar.n.f;
        a.getClass();
        yg5 e = a.e(videoFile2, null);
        m1 a0 = bVar.Y.e(VideoAdvertisementsRepository.AdType.SPORT_ODDS, e instanceof VideoAutoPlay ? ((VideoAutoPlay) e).K : null).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        Objects.requireNonNull(pizVar);
        bVar.C = a0.subscribe(new eiy(pizVar, 1));
        bVar.v0 = a1;
    }
}
