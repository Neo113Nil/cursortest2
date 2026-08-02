package com.vk.newsfeed.impl.postmodal.reactions.donut;

import android.os.Bundle;
import com.vk.newsfeed.impl.postmodal.reactions.donut.a;
import com.vk.newsfeed.impl.postmodal.reactions.donut.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.att;
import xsna.f130;
import xsna.f4z;
import xsna.hg1;
import xsna.iid;
import xsna.rj80;
import xsna.u6k;
import xsna.wk50;

/* compiled from: ModalPostDonutFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<f, f130, a, c> {
    public final Bundle f;
    public final iid g;
    public final f4z h;
    public final att i;

    public b(Bundle bundle) {
        super(a.b.b, new d(new f130(EmptyList.b, true, false)));
        this.f = bundle;
        this.g = new iid(1);
        this.h = new f4z();
        this.i = new att();
    }

    @Override // xsna.wk50
    public final void N(f130 f130Var, a aVar) {
        a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            T(c.C1396c.b);
            this.e.b(hg1.h(new i0(rj80.a(), new hg1.i2()), new u6k(this, 21)));
        } else if (aVar2 instanceof a.c) {
            T(new c.b(((a.c) aVar2).b));
        } else {
            if (!(aVar2 instanceof a.C1395a)) {
                throw new NoWhenBranchMatchedException();
            }
            T(c.a.b);
        }
    }
}
