package com.vk.feature.uxpolls.modalpoll;

import com.vk.feature.uxpolls.modalpoll.a;
import com.vk.feature.uxpolls.modalpoll.c;
import com.vk.feature.uxpolls.modalpoll.e;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.uxpolls.domain.exception.EmptyPollsError;
import com.vk.uxpolls.domain.exception.LoadWebAppError;
import com.vk.uxpolls.domain.exception.RetrievePollsError;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4z;
import xsna.p870;
import xsna.v49;
import xsna.wk50;
import xsna.zqw;

/* compiled from: UxPollsFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<g, f, a, c> {
    public final v49 f;
    public final f4z g;

    public b(d dVar, v49 v49Var) {
        super(null, dVar);
        this.f = v49Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(f fVar, a aVar) {
        f fVar2 = fVar;
        a aVar2 = aVar;
        if (aVar2 instanceof a.f) {
            T(c.C1027c.b);
            return;
        }
        boolean z = aVar2 instanceof a.e;
        v49 v49Var = this.f;
        if (z) {
            ((zqw) v49Var.c).a(TimeUnit.HOURS.toMillis(4L));
            T(c.b.b);
            return;
        }
        if (aVar2 instanceof a.d) {
            ((p870) v49Var.b).e(145, Collections.singletonList(UxPollsEntry.class));
            return;
        }
        if (aVar2 instanceof a.h) {
            T(c.d.b);
            return;
        }
        if ((aVar2 instanceof a.b) || (aVar2 instanceof a.g)) {
            return;
        }
        boolean z2 = aVar2 instanceof a.c;
        f4z f4zVar = this.g;
        if (!z2) {
            if (!aVar2.equals(a.C1026a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fVar2.c) {
                return;
            }
            f4zVar.b(e.a.C1028a.a);
            return;
        }
        Throwable th = ((a.c) aVar2).b;
        if ((th instanceof EmptyPollsError) || (th instanceof RetrievePollsError) || (th instanceof LoadWebAppError)) {
            T(new c.a(th));
        } else {
            f4zVar.b(new e.b(th));
        }
    }
}
