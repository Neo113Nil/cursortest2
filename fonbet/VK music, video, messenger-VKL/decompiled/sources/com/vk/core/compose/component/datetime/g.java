package com.vk.core.compose.component.datetime;

import java.util.Date;
import xsna.bbk0;
import xsna.bu1;
import xsna.e43;
import xsna.f1m;
import xsna.k9x;
import xsna.wh50;
import xsna.zak0;

/* compiled from: DateRangePickerState.kt */
/* loaded from: classes17.dex */
public final class g extends n {
    public final f1m g;
    public final f1m h;
    public final wh50 i;

    public g(k9x k9xVar, l lVar, boolean z) {
        super(k9xVar, lVar, new m(new b(e43.l(f.a, f.b, f.c), c.c)));
        this.g = bbk0.b(new com.vk.movika.sdk.base.logic.processor.actions.i(this, 27));
        this.h = bbk0.b(new bu1(this, 24));
        this.i = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.datetime.n
    public final boolean c() {
        Date date = (Date) this.g.getValue();
        Date date2 = (Date) this.h.getValue();
        return date != null && date2 != null && b().a(date) && b().a(date2) && date.compareTo(date2) <= 0;
    }

    public final void e(boolean z) {
        ((zak0) this.i).setValue(Boolean.valueOf(z));
    }
}
