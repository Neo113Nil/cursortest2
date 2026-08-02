package com.google.android.play.core.integrity;

import Qa.AbstractC1524n;
import android.content.Context;

/* loaded from: classes3.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f36644a;

    private u() {
    }

    public final u a(Context context) {
        context.getClass();
        this.f36644a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        AbstractC1524n.a(this.f36644a, Context.class);
        return new w(this.f36644a, null);
    }

    public /* synthetic */ u(t tVar) {
    }
}
