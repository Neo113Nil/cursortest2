package com.vk.libvideo.upload.impl;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.video.VideoSave;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.libvideo.upload.impl.VideoPersistedUpload;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.b0;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.asu0;
import xsna.bpn0;
import xsna.c7q0;
import xsna.cvk;
import xsna.dot0;
import xsna.epx;
import xsna.g21;
import xsna.gb8;
import xsna.got0;
import xsna.j5g;
import xsna.jgp;
import xsna.jpy;
import xsna.n8c0;
import xsna.o2i;
import xsna.or20;
import xsna.p6e0;
import xsna.pn00;
import xsna.rsg0;
import xsna.rva;
import xsna.s56;
import xsna.u4q0;
import xsna.wjs0;
import xsna.wlg0;
import xsna.wmi0;
import xsna.wxr0;
import xsna.y730;
import xsna.ysg0;
import xsna.z33;
import xsna.zik0;
import xsna.znk0;

/* compiled from: VideoUploadControllerImpl.kt */
/* loaded from: classes.dex */
public final class b implements dot0 {
    public final gb8 a;
    public final bpn0 b;
    public final SparseArray<VideoUploadEvent.Progress> c = new SparseArray<>();
    public final SparseArray<VideoUpload> d = new SparseArray<>();
    public io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final a f;
    public final ysg0<VideoUploadEvent> g;
    public final HashMap<UserId, Boolean> h;
    public final HashSet<String> i;

    public b(gb8 gb8Var, bpn0 bpn0Var) {
        this.a = gb8Var;
        this.b = bpn0Var;
        a aVar = new a();
        this.f = aVar;
        this.g = new ysg0<>();
        this.h = new HashMap<>();
        this.i = new HashSet<>();
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        b0 m = aVar.a.K().m(asu0.a.d());
        final wlg0 wlg0Var = new wlg0(this, 1);
        bVar.b(m.subscribe(new f() { // from class: xsna.fot0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                wlg0.this.invoke(obj);
            }
        }));
        this.e.b(l());
    }

    @Override // xsna.dot0
    public final void a(int i) {
        SparseArray<VideoUpload> sparseArray = this.d;
        VideoUpload videoUpload = sparseArray.get(i);
        if (videoUpload == null) {
            return;
        }
        VideoUpload zb = VideoUpload.zb(videoUpload, null, null, false, false, false, null, null, 65343);
        sparseArray.put(i, zb);
        String Ab = zb.Ab();
        Map<String, VideoPersistedUpload> P0 = this.f.a.P0();
        VideoPersistedUpload videoPersistedUpload = P0 != null ? P0.get(Ab) : null;
        u4q0 u4q0Var = zik0.a;
        VideoUploadEvent.Progress progress = this.c.get(i);
        boolean a = com.vk.upload.impl.a.a(i);
        ysg0<VideoUploadEvent> ysg0Var = this.g;
        if (a) {
            com.vk.upload.impl.a.e(i);
            ysg0Var.a(new VideoUploadEvent.Start(zb));
        } else if (videoPersistedUpload != null) {
            com.vk.upload.impl.a.i(videoPersistedUpload.Bb());
            ysg0Var.a(new VideoUploadEvent.Start(zb));
        } else if (progress != null && progress.Bb()) {
            h(i);
        } else {
            d(i);
            cvk.u(R.string.error_unknown, false);
        }
    }

    @Override // xsna.dot0
    @SuppressLint({"NewApi"})
    public final q<List<VideoUploadEvent>> b() {
        return q.m(new y(this.g.a.b0(VideoUploadEvent.class), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new s0(new Callable() { // from class: xsna.eot0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.vk.libvideo.upload.impl.b.this.e();
            }
        }), new jpy(new got0(this)));
    }

    @Override // xsna.dot0
    public final void c(int i) {
        SparseArray<VideoUpload> sparseArray = this.d;
        VideoUpload videoUpload = sparseArray.get(i);
        if (videoUpload == null || videoUpload.Hb() || videoUpload.Ib()) {
            return;
        }
        if (videoUpload.Jb()) {
            d(i);
            return;
        }
        SparseArray<VideoUploadEvent.Progress> sparseArray2 = this.c;
        VideoUploadEvent.Progress progress = sparseArray2.get(i);
        if (epx.d(progress != null ? Float.valueOf(progress.Ab()) : null, 1.0f)) {
            return;
        }
        com.vk.upload.impl.a.b(i, null);
        sparseArray2.remove(i);
        VideoUpload zb = VideoUpload.zb(videoUpload, null, null, false, true, false, null, null, 65407);
        sparseArray.put(i, zb);
        this.f.b(zb.Ab(), VideoPersistedUpload.State.CANCELLED);
        this.g.a(new VideoUploadEvent.Cancel(zb));
    }

    @Override // xsna.dot0
    public final void clear() {
        this.c.clear();
        SparseArray<VideoUpload> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            c(sparseArray.valueAt(i).Eb());
        }
        sparseArray.clear();
        this.e.e();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = bVar;
        bVar.b(l());
        this.f.getClass();
        wmi0.a.c("video.persist.uploads");
    }

    @Override // xsna.dot0
    public final void d(int i) {
        SparseArray<VideoUpload> sparseArray = this.d;
        VideoUpload videoUpload = sparseArray.get(i);
        if (videoUpload == null) {
            return;
        }
        com.vk.upload.impl.a.b(i, null);
        this.c.remove(i);
        VideoUpload zb = VideoUpload.zb(videoUpload, null, null, false, true, false, null, null, 65407);
        sparseArray.remove(i);
        this.f.a(zb.Ab());
        this.g.a(new VideoUploadEvent.Delete(zb));
    }

    @Override // xsna.dot0
    public final SparseArray<VideoUploadEvent> e() {
        Map<String, VideoPersistedUpload> map;
        SparseArray sparseArray = new SparseArray();
        try {
            map = this.f.a.a();
        } catch (Throwable unused) {
            map = null;
        }
        Map<String, VideoPersistedUpload> map2 = map;
        if (map2 != null) {
            for (Map.Entry<String, VideoPersistedUpload> entry : map2.entrySet()) {
                entry.getValue().Cb().getClass();
                sparseArray.append(entry.getValue().Cb().Eb(), entry.getValue().Cb());
            }
        }
        zik0.e(sparseArray, this.d);
        SparseArray<VideoUploadEvent.Progress> clone = this.c.clone();
        SparseArray<VideoUploadEvent> sparseArray2 = new SparseArray<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            VideoUpload videoUpload = (VideoUpload) sparseArray.valueAt(i);
            VideoUploadEvent.Progress progress = clone.get(videoUpload.Eb());
            if (videoUpload.Hb()) {
                progress = new VideoUploadEvent.Cancel(videoUpload);
            } else if (videoUpload.Jb()) {
                progress = new VideoUploadEvent.Fail(videoUpload, new IllegalStateException(""));
            } else if (videoUpload.Ib()) {
                VideoFile A = videoUpload.A();
                if (A != null) {
                    progress = new VideoUploadEvent.Done(videoUpload, A);
                }
                progress = null;
            } else if (progress == null) {
                if (videoUpload.Gb() == null) {
                    progress = new VideoUploadEvent.Start(videoUpload);
                }
                progress = null;
            }
            if (progress != null) {
                sparseArray2.put(keyAt, progress);
            }
        }
        return sparseArray2;
    }

    @Override // xsna.dot0
    public final void f(int i, int i2, int i3, UserId userId) {
        SparseArray<VideoUpload> sparseArray = this.d;
        VideoUpload videoUpload = sparseArray.get(i);
        if (videoUpload == null || videoUpload.Hb() || videoUpload.Jb() || videoUpload.Ib()) {
            return;
        }
        VideoUpload zb = VideoUpload.zb(videoUpload, userId, null, false, false, false, Integer.valueOf(i2), null, 64507);
        sparseArray.put(zb.Eb(), zb);
        VideoUploadEvent.Progress progress = new VideoUploadEvent.Progress(zb, i3 / 100, false);
        this.c.put(zb.Eb(), progress);
        this.g.a(progress);
    }

    @Override // xsna.dot0
    public final void g(UserId userId) {
        this.h.put(userId, Boolean.FALSE);
        HashSet hashSet = new HashSet();
        SparseArray<VideoUpload> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            if (sparseArray.valueAt(i).Ib()) {
                hashSet.add(Integer.valueOf(keyAt));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sparseArray.remove(((Number) it.next()).intValue());
        }
    }

    @Override // xsna.dot0
    public final void h(int i) {
        u4q0 u4q0Var = zik0.a;
        VideoUpload videoUpload = this.d.get(i);
        if (videoUpload == null) {
            return;
        }
        this.f.a(videoUpload.Ab());
        VideoUploadEvent.Progress progress = new VideoUploadEvent.Progress(videoUpload, 1.0f, true);
        this.c.put(videoUpload.Eb(), progress);
        this.g.a(progress);
        UserId q = videoUpload.q();
        Integer Gb = videoUpload.Gb();
        if (q == null || Gb == null) {
            return;
        }
        int i2 = 2;
        this.e.b(m(Gb.intValue(), q).subscribe(new y730(new g21(this, i, videoUpload, i2), 22), new c7q0(new rva(this, i, i2), 5)));
    }

    @Override // xsna.dot0
    public final void i(int i, Throwable th, boolean z) {
        boolean d;
        u4q0 u4q0Var = zik0.a;
        SparseArray<VideoUpload> sparseArray = this.d;
        VideoUpload videoUpload = sparseArray.get(i);
        if (videoUpload == null) {
            return;
        }
        SparseArray<VideoUploadEvent.Progress> sparseArray2 = this.c;
        if (z) {
            sparseArray2.remove(i);
        }
        boolean z2 = th instanceof InterruptedException;
        ysg0<VideoUploadEvent> ysg0Var = this.g;
        a aVar = this.f;
        if (z2) {
            sparseArray2.remove(i);
            VideoUpload zb = VideoUpload.zb(videoUpload, null, null, false, true, false, null, null, 65407);
            aVar.b(zb.Ab(), VideoPersistedUpload.State.CANCELLED);
            sparseArray.put(zb.Eb(), zb);
            ysg0Var.a(new VideoUploadEvent.Cancel(zb));
            return;
        }
        VideoUpload zb2 = VideoUpload.zb(videoUpload, null, null, true, false, false, null, null, 65471);
        aVar.b(zb2.Ab(), VideoPersistedUpload.State.FAILED);
        sparseArray.put(zb2.Eb(), zb2);
        ysg0Var.a(new VideoUploadEvent.Fail(zb2, th));
        VKApiExecutionException vKApiExecutionException = null;
        VKApiExecutionException vKApiExecutionException2 = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (vKApiExecutionException2 == null) {
            Throwable cause = th.getCause();
            if (cause instanceof VKApiExecutionException) {
                vKApiExecutionException = (VKApiExecutionException) cause;
            }
        } else {
            vKApiExecutionException = vKApiExecutionException2;
        }
        if (vKApiExecutionException != null) {
            d = ((o2i) this.a.invoke()).d(vKApiExecutionException, true);
            if (d) {
                return;
            }
        }
        if (vKApiExecutionException == null || vKApiExecutionException.s() != 9) {
            cvk.u(R.string.video_upload_error, false);
        } else {
            cvk.u(R.string.video_upload_flood_error, false);
        }
    }

    @Override // xsna.dot0
    public final void j(dot0.a aVar) {
        String h = aVar.h();
        String j = aVar.j();
        String e = aVar.e();
        VideoSave.Target target = VideoSave.Target.VIDEO;
        UserId n = aVar.n();
        String d = aVar.d();
        List<Integer> a = aVar.a();
        String r = aVar.r();
        String q = aVar.q();
        OrdData m = aVar.m();
        List<VideoFile> b = aVar.b();
        Integer f = aVar.f();
        int intValue = f != null ? f.intValue() : -1;
        Date s = aVar.s();
        VideoPersistedUpload videoPersistedUpload = new VideoPersistedUpload(h, j, e, target, n, aVar.i(), d, true, a, r, q, null, m, b, intValue, s != null ? s.getTime() : 0L, aVar.c(), ((Boolean) this.b.getValue()).booleanValue(), aVar.g(), aVar.p(), aVar.o(), 2048, null);
        a aVar2 = this.f;
        aVar2.getClass();
        wmi0 wmi0Var = wmi0.a;
        Map<String, VideoPersistedUpload> P0 = aVar2.a.P0();
        if (P0 == null) {
            P0 = jgp.b;
        }
        wmi0Var.m("video.persist.uploads", j5g.O0(pn00.o(P0, new Pair(videoPersistedUpload.getFileName(), videoPersistedUpload)).values()));
        VideoUploadTaskNew Bb = videoPersistedUpload.Bb();
        String l = aVar.l();
        if (l != null) {
            com.vk.upload.impl.a.g(Bb, new UploadNotification.a(null, l, aVar.k()));
        }
        this.h.put(aVar.n(), Boolean.TRUE);
        com.vk.upload.impl.a.i(Bb);
        this.d.append(Bb.d, videoPersistedUpload.Cb());
        this.g.a(new VideoUploadEvent.Start(videoPersistedUpload.Cb()));
    }

    @Override // xsna.dot0
    public final void k(int i, String str) {
        SparseArray<VideoUpload> sparseArray = this.d;
        sparseArray.put(i, VideoUpload.zb(sparseArray.get(i), null, str, false, false, false, null, null, 65519));
    }

    public final c l() {
        return wjs0.b.b0(wxr0.class).a0(asu0.a.d()).subscribe(new z33(new s56(this, 2), 3));
    }

    public final c2 m(int i, UserId userId) {
        q<R> L = rsg0.T(znk0.L(i, userId)).L(new or20(new com.vk.im.engine.internal.storage.delegates.dialogs.a(i, 2, new AtomicInteger(0), this, userId), 20), false);
        n8c0 n8c0Var = new n8c0(new p6e0(19), 15);
        L.getClass();
        return new c2(L, n8c0Var);
    }
}
