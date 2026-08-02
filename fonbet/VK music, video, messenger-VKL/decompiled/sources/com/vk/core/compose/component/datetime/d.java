package com.vk.core.compose.component.datetime;

import java.util.Collections;
import java.util.Date;
import xsna.bbk0;
import xsna.f1m;
import xsna.k9x;
import xsna.s3q0;
import xsna.sfg;
import xsna.wh50;
import xsna.zak0;

/* compiled from: DatePickerState.kt */
/* loaded from: classes17.dex */
public final class d extends n {
    public final f1m g;
    public final wh50 h;

    public d(k9x k9xVar, l lVar, boolean z) {
        super(k9xVar, lVar, new m(new b(Collections.singletonList(c.b), c.c)));
        this.g = bbk0.b(new sfg(this, 9));
        this.h = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.datetime.n
    public final boolean c() {
        Date date = (Date) this.g.getValue();
        return date != null && b().a(date);
    }

    public final void e(boolean z) {
        ((zak0) this.h).setValue(Boolean.valueOf(z));
    }

    public final void f(Date date) {
        m mVar = this.a;
        b a = mVar.a();
        if (date == null) {
            a.a();
        } else {
            a.g(c.b, c.b().format(date));
        }
        s3q0 s3q0Var = s3q0.a;
        ((zak0) mVar.a).setValue(mVar.a());
    }
}
