package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.q0;
import com.applovin.impl.t2;

/* loaded from: classes3.dex */
public class t4 extends t2 {
    private final q0.a n;
    private final Context o;
    private final boolean p;

    public t4(q0.a aVar, boolean z, Context context) {
        super(t2.c.RIGHT_DETAIL);
        this.n = aVar;
        this.o = context;
        this.c = new SpannedString(aVar.a());
        this.p = z;
    }

    @Override // com.applovin.impl.t2
    public SpannedString f() {
        return new SpannedString(this.n.a(this.o));
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.t2
    public boolean p() {
        Boolean b = this.n.b(this.o);
        if (b != null) {
            return b.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
