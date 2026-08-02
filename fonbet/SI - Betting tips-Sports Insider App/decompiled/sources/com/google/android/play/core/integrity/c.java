package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements d8.g {

    /* renamed from: a, reason: collision with root package name */
    public final d8.f f6027a;

    public c(d8.f fVar) {
        this.f6027a = fVar;
    }

    @Override // d8.h
    public /* bridge */ /* synthetic */ Object a() {
        return new b((g) this.f6027a.a());
    }

    public c(Context context) {
        b2.e eVar = new b2.e(context, (char) 0);
        this.f6027a = d8.f.b(new c(d8.f.b(new io.sentry.internal.debugmeta.c(eVar, d8.f.b(l.f6049b), new d(eVar), 4))));
    }
}
