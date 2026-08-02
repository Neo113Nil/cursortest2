package com.vk.profile.community.impl.ui.events;

import com.vk.profile.community.impl.ui.events.a;
import xsna.f2h;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CommunityEventsFragment.kt */
/* loaded from: classes5.dex */
public final class c implements gzs<s3q0> {
    public final /* synthetic */ izs<a, s3q0> b;
    public final /* synthetic */ f2h c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(izs<? super a, s3q0> izsVar, f2h f2hVar) {
        this.b = izsVar;
        this.c = f2hVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.b.invoke(new a.b(this.c.a));
        return s3q0.a;
    }
}
