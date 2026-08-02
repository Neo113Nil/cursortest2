package com.vk.media.recorder.impl;

import android.annotation.TargetApi;
import com.vk.media.recorder.e;
import java.util.Arrays;
import java.util.Objects;
import xsna.d830;
import xsna.ne7;
import xsna.qom0;

/* compiled from: StreamerSurface.java */
@TargetApi(18)
/* loaded from: classes3.dex */
public final class e extends Streamer {
    public j m;
    public e.a n;

    @Override // com.vk.media.recorder.impl.Streamer
    public final void h() {
        if (this.m == null || this.b == null) {
            return;
        }
        e.a aVar = this.n;
        if (aVar != null) {
            ne7.m("RecorderSurface18", "onVideoEncoderRestartBegin()");
            com.vk.media.recorder.e.this.Z = true;
            com.vk.media.recorder.e eVar = com.vk.media.recorder.e.this;
            synchronized (eVar.D) {
                eVar.O();
            }
        }
        this.m.d = null;
        n();
        g gVar = new g();
        gVar.a = this.k;
        b a = gVar.a();
        this.g = a;
        if (a == null) {
            throw new RuntimeException("EncoderVideo is null, check if streamer was built with AUDIO_ONLY mode");
        }
        Objects.toString(a.b);
        j jVar = new j(this.b, this.f);
        this.m = jVar;
        this.d = jVar;
        d830 d830Var = this.l;
        jVar.o = d830Var != null ? new d830(d830Var) : null;
        qom0 qom0Var = this.b;
        synchronized (qom0Var) {
            Arrays.fill(qom0Var.a, (Object) null);
            qom0Var.d = 0L;
        }
        this.m.d(this.g);
        if (aVar != null) {
            ne7.m("RecorderSurface18", "onVideoEncoderRestartEnd()");
            com.vk.media.recorder.e.this.Z = false;
        }
    }

    public final void o() {
        d830 d830Var;
        if (this.m == null) {
            if (this.b == null) {
                throw new IllegalStateException("After release(), the streamer is no longer available");
            }
            if (this.g == null) {
                g gVar = new g();
                gVar.a = this.k;
                b a = gVar.a();
                this.g = a;
                if (a == null) {
                    throw new RuntimeException("EncoderVideo is null, check if streamer was built with AUDIO_ONLY mode");
                }
            }
            Objects.toString(this.g.b);
            j jVar = new j(this.b, this.f);
            this.m = jVar;
            jVar.d(this.g);
            this.d = this.m;
        }
        j jVar2 = this.m;
        d830 d830Var2 = this.l;
        if (d830Var2 != null) {
            jVar2.getClass();
            d830Var = new d830(d830Var2);
        } else {
            d830Var = null;
        }
        jVar2.o = d830Var;
    }
}
