package com.vk.profile.core.scheduled_clips;

import com.vk.profile.core.scheduled_clips.d;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1i;
import xsna.c1i;
import xsna.dm50;
import xsna.e1i;
import xsna.k0i;
import xsna.p0i;
import xsna.r0i;
import xsna.v7;
import xsna.wx4;
import xsna.x4c;

/* compiled from: CommunityScheduledClipsGridReducer.kt */
/* loaded from: classes5.dex */
public final class e extends dm50<c1i, d, a1i> {
    public final e1i d;
    public final wx4 e;

    public e(e1i e1iVar, wx4 wx4Var) {
        super(new a1i(0));
        this.d = e1iVar;
        this.e = wx4Var;
    }

    @Override // xsna.dm50
    public final a1i c(a1i a1iVar, d dVar) {
        a1i a1iVar2 = a1iVar;
        d dVar2 = dVar;
        if (dVar2.equals(d.b.b)) {
            return new a1i(true, false, new p0i(null, 3), r0i.b.a);
        }
        if (dVar2 instanceof d.c) {
            return new a1i(false, false, new p0i(((d.c) dVar2).b, 2), r0i.b.a);
        }
        if (dVar2.equals(d.a.b)) {
            return new a1i(false, true, new p0i(null, 1), r0i.b.a);
        }
        if (!(dVar2 instanceof d.e)) {
            if (dVar2.equals(d.C1643d.b)) {
                return a1i.a(a1iVar2, true, r0i.b.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        Date date = new Date();
        long millis = TimeUnit.SECONDS.toMillis(((d.e) dVar2).b.r);
        return a1i.a(a1iVar2, false, new r0i.a(new k0i(new Date(millis), date, new Date(TimeUnit.DAYS.toMillis(90L) + date.getTime()), new x4c(new Date(millis), this, dVar2, 3))));
    }

    @Override // xsna.dm50
    public final c1i d() {
        return new c1i(e(new v7(22)));
    }

    @Override // xsna.dm50
    public final void h(a1i a1iVar, c1i c1iVar) {
        f(c1iVar.a, a1iVar);
    }
}
