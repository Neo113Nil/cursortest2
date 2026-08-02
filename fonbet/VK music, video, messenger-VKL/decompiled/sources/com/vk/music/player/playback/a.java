package com.vk.music.player.playback;

import com.huawei.hms.framework.common.BundleUtil;
import io.reactivex.rxjava3.disposables.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.utils.Logger;
import xsna.arm0;
import xsna.b25;
import xsna.bn40;
import xsna.drm0;
import xsna.eiy;
import xsna.gza0;
import xsna.hx4;
import xsna.hza0;
import xsna.izs;
import xsna.lp80;
import xsna.nit;
import xsna.rsg0;
import xsna.tt4;
import xsna.uu60;
import xsna.yfb;
import xsna.yl0;

/* compiled from: OnlinePlaybackRadioSource.kt */
/* loaded from: classes3.dex */
public final class a implements hza0 {
    public final hx4 a;
    public final b25 b;
    public final g c = new g();
    public final tt4 d = new tt4();

    public a(hx4 hx4Var, b25 b25Var) {
        this.a = hx4Var;
        this.b = b25Var;
    }

    @Override // xsna.hza0
    public final void a(ArrayList arrayList, izs izsVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gza0 gza0Var = (gza0) it.next();
            List c0 = drm0.c0(gza0Var.a, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            Integer m = c0.size() >= 2 ? arm0.m(10, (String) c0.get(1)) : arm0.m(10, gza0Var.a);
            if (m != null) {
                arrayList2.add(m);
            }
        }
        if (arrayList2.isEmpty()) {
            bn40.d("Cant parse PlaybackTrackId.mid when try to loadTracks() in RadioSource");
        } else {
            this.c.b(rsg0.T(yfb.x(this.a.w(arrayList2))).U(new nit(new yl0(16, arrayList, this), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eiy(izsVar, 12), new uu60(new lp80(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 2)));
        }
    }

    @Override // xsna.hza0
    public final void cancel() {
        this.c.b(null);
    }

    @Override // xsna.hza0
    public final boolean isLoading() {
        io.reactivex.rxjava3.disposables.c a = this.c.a();
        return (a == null || a.h()) ? false : true;
    }
}
