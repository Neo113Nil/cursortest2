package com.vk.folders.impl.model;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.folders.impl.model.FoldersListLoaderStateEvents;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.kotlin.c;
import io.reactivex.rxjava3.subjects.d;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.a1w;
import xsna.asu0;
import xsna.b1s;
import xsna.c1s;
import xsna.d1s;
import xsna.drz;
import xsna.g4z;
import xsna.gn0;
import xsna.j0s;
import xsna.jgp;
import xsna.jqm;
import xsna.k8;
import xsna.l8;
import xsna.q8;
import xsna.qcl;
import xsna.rpm;

/* compiled from: FoldersListLoaderImpl.kt */
/* loaded from: classes18.dex */
public final class a implements c1s, g4z {
    public final a1w b;
    public final b1s c;
    public final d<drz.a<Map<Integer, rpm>>> d = d.O0(new drz.a(jgp.b, true));
    public final d<FoldersListLoaderStateEvents.LoaderStateEvent> e;
    public final d f;
    public final w g;
    public final b h;
    public final AtomicBoolean i;

    public a(a1w a1wVar, b1s b1sVar) {
        this.b = a1wVar;
        this.c = b1sVar;
        d<FoldersListLoaderStateEvents.LoaderStateEvent> O0 = d.O0(FoldersListLoaderStateEvents.LoaderStateEvent.None);
        this.e = O0;
        this.f = O0;
        this.g = asu0.a.c();
        this.h = new b();
        this.i = new AtomicBoolean(false);
    }

    @Override // xsna.c1s
    public final void a() {
        this.e.onNext(FoldersListLoaderStateEvents.LoaderStateEvent.StartedLoading);
        this.h.b(c.e(this.b.C(this, new jqm(Source.CACHE)).q(this.g), new qcl(this, 10), new q8(1, this, a.class, "onFoldersLoaded", "onFoldersLoaded(Lcom/vk/im/engine/models/EntityValue;)V", 0, 5)));
    }

    @Override // xsna.c1s
    public final r d(Peer peer) {
        return new r(new n(this.b.C(this, new j0s(Collections.singletonList(peer))), new gn0(new d1s(1, this.h, b.class, "add", "add(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 8), 22)).q(this.g), new l8(new k8(14, peer, this), 23));
    }

    @Override // xsna.c1s
    public final d f() {
        return this.d;
    }

    @Override // com.vk.folders.impl.model.FoldersListLoaderStateEvents
    public final d i() {
        return this.f;
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.h.e();
    }
}
