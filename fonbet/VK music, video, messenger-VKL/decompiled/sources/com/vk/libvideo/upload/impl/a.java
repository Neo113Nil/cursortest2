package com.vk.libvideo.upload.impl;

import com.vk.libvideo.upload.impl.VideoPersistedUpload;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.c5g;
import xsna.dk40;
import xsna.e2w;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.jzc0;
import xsna.pn00;
import xsna.s3q0;
import xsna.wmi0;

/* compiled from: VideoPersistentStore.kt */
/* loaded from: classes.dex */
public final class a {
    public final d<Map<String, VideoPersistedUpload>> a;

    /* compiled from: VideoPersistentStore.kt */
    /* renamed from: com.vk.libvideo.upload.impl.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1254a extends FunctionReferenceImpl implements izs<Map<String, ? extends VideoPersistedUpload>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Map<String, ? extends VideoPersistedUpload> map) {
            ((d) this.receiver).onNext(map);
            return s3q0.a;
        }
    }

    public a() {
        d<Map<String, VideoPersistedUpload>> O0 = d.O0(jgp.b);
        this.a = O0;
        new io.reactivex.rxjava3.disposables.b().b(wmi0.a.e("video.persist.uploads").a0(asu0.a.c()).K().l(new jzc0(new e2w(1), 2)).subscribe(new dk40(new C1254a(1, O0, d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0), 3)));
    }

    public final void a(String str) {
        wmi0 wmi0Var = wmi0.a;
        Map<String, VideoPersistedUpload> P0 = this.a.P0();
        if (P0 == null) {
            P0 = jgp.b;
        }
        wmi0Var.m("video.persist.uploads", j5g.O0(pn00.l(str, P0).values()));
    }

    public final void b(String str, VideoPersistedUpload.State state) {
        wmi0 wmi0Var = wmi0.a;
        Map<String, VideoPersistedUpload> P0 = this.a.P0();
        if (P0 == null) {
            P0 = jgp.b;
        }
        Collection<VideoPersistedUpload> values = P0.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (VideoPersistedUpload videoPersistedUpload : values) {
            if (epx.f(videoPersistedUpload.getFileName(), str)) {
                videoPersistedUpload = VideoPersistedUpload.zb(videoPersistedUpload, state);
            }
            arrayList.add(videoPersistedUpload);
        }
        wmi0Var.m("video.persist.uploads", arrayList);
    }
}
