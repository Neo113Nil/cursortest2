package com.vk.video.ad;

import com.vk.video.ad.a;
import com.vk.video.ad.c;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4z;
import xsna.f880;
import xsna.gkc0;
import xsna.h6m0;
import xsna.ikk0;
import xsna.pyr0;
import xsna.vzr0;
import xsna.w2j0;
import xsna.wk50;
import xsna.x2j0;
import xsna.x9l0;
import xsna.yg5;

/* compiled from: VideoAdFeature.kt */
/* loaded from: classes5.dex */
public final class b extends wk50<g, vzr0, a, c> {
    public final yg5 f;
    public final boolean g;
    public final f4z h;

    public b(d dVar, yg5 yg5Var, boolean z) {
        super(a.c.b, dVar);
        this.f = yg5Var;
        this.g = z;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(vzr0 vzr0Var, a aVar) {
        vzr0 vzr0Var2 = vzr0Var;
        a aVar2 = aVar;
        if (aVar2 instanceof a.c) {
            T(new c.a(vzr0Var2.b));
            return;
        }
        if (aVar2 instanceof a.b) {
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new w2j0(this, 14));
            return;
        }
        if (aVar2 instanceof a.h) {
            ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new gkc0(this, 18));
            return;
        }
        if (aVar2 instanceof a.f) {
            ExecutorService executorService3 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new pyr0(this, 0));
            return;
        }
        if (aVar2 instanceof a.i) {
            ExecutorService executorService4 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new x9l0(this, 8));
            return;
        }
        if (aVar2 instanceof a.g) {
            ExecutorService executorService5 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new f880(this, 28));
            return;
        }
        if (aVar2 instanceof a.C1947a) {
            ExecutorService executorService6 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new x2j0(this, 9));
        } else if (aVar2 instanceof a.e) {
            ExecutorService executorService7 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new h6m0(this, 10));
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            ExecutorService executorService8 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new ikk0(this, 9));
        }
    }
}
