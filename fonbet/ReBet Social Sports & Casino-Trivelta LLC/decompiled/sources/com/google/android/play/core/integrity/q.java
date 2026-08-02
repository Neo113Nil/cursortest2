package com.google.android.play.core.integrity;

import Qa.AbstractC1524n;
import android.content.Context;

/* loaded from: classes3.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f36637a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f36637a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        AbstractC1524n.a(this.f36637a, Context.class);
        return new s(this.f36637a, null);
    }

    public /* synthetic */ q(p pVar) {
    }
}
