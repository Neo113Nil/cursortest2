package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050be implements so {

    /* renamed from: a, reason: collision with root package name */
    public final String f13445a;

    public C0050be(@NonNull String str) {
        this.f13445a = str;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Object obj) {
        return obj == null ? new qo(this, false, d9.e.l(new StringBuilder(), this.f13445a, " is null.")) : new qo(this, true, "");
    }

    @NonNull
    public final String a() {
        return this.f13445a;
    }
}
