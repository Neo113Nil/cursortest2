package com.vk.music.player.playback;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import xsna.abo;
import xsna.bk1;
import xsna.c5g;
import xsna.g720;
import xsna.gza0;
import xsna.hms;
import xsna.hx4;
import xsna.hza0;
import xsna.ix4;
import xsna.izs;
import xsna.j5g;
import xsna.k170;
import xsna.k7;
import xsna.k840;
import xsna.o330;
import xsna.qi00;
import xsna.rsg0;
import xsna.u3z;
import xsna.uq;
import xsna.v1v;
import xsna.yfb;

/* compiled from: OnlinePlaybackTracksSource.kt */
/* loaded from: classes3.dex */
public final class b implements hza0 {
    public final g a = new g();
    public final ix4 b = new ix4();
    public final abo c = k840.a.c();

    @Override // xsna.hza0
    public final void a(ArrayList arrayList, izs izsVar) {
        PlaybackLaunchMeta playbackLaunchMeta;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{uq.b(arrayList, new StringBuilder("tracks count = "))});
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gza0 gza0Var = (gza0) it.next();
            String str = gza0Var.a;
            String str2 = gza0Var.c;
            if (str2 != null) {
                str = v1v.a('_', str, str2);
            }
            arrayList2.add(str);
        }
        gza0 gza0Var2 = (gza0) j5g.a0(arrayList);
        j1 U = rsg0.T(yfb.x(hx4.o(this.b, arrayList2, (gza0Var2 == null || (playbackLaunchMeta = gza0Var2.e) == null || (musicPlaybackLaunchContext = playbackLaunchMeta.b) == null) ? null : musicPlaybackLaunchContext.Lb(), 2))).U(new bk1(new g720(arrayList, 1), 25));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a.b(U.L(new k7(new k170(new qi00(this, 16)), 26), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hms(izsVar, 20), new o330(new u3z(izsVar, 1), 6)));
    }

    @Override // xsna.hza0
    public final void cancel() {
        this.a.b(null);
    }

    @Override // xsna.hza0
    public final boolean isLoading() {
        io.reactivex.rxjava3.disposables.c a = this.a.a();
        return (a == null || a.h()) ? false : true;
    }
}
