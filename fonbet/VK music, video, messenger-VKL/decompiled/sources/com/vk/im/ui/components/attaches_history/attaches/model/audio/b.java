package com.vk.im.ui.components.attaches_history.attaches.model.audio;

import com.vk.im.external.AudioTrack;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.d;
import xsna.k840;
import xsna.r5v0;
import xsna.r9;
import xsna.wn;

/* compiled from: AudioTrackModel.kt */
/* loaded from: classes2.dex */
public final class b {
    public final d<c> a = d.O0(new c.b(-1));
    public final io.reactivex.rxjava3.disposables.c b;

    public b() {
        this.b = EmptyDisposable.INSTANCE;
        r5v0 r5v0Var = k840.a.h;
        this.b = (r5v0Var == null ? null : r5v0Var).a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wn(new r9(this, 3), 3));
    }

    public final void a(AudioTrack audioTrack) {
        d<c> dVar = this.a;
        if (audioTrack == null) {
            dVar.onNext(new c.b(-1));
        } else if (audioTrack.d) {
            dVar.onNext(new c.d(audioTrack));
        } else {
            dVar.onNext(new c.C1142c(audioTrack));
        }
    }
}
