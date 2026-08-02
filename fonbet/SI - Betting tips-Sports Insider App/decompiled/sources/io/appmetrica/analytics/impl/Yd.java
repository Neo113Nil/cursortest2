package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yd implements so {

    /* renamed from: a, reason: collision with root package name */
    public final String f13225a;

    public Yd(@NonNull String str) {
        this.f13225a = str;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Collection<Object> collection) {
        return lo.a((Collection) collection) ? new qo(this, false, d9.e.l(new StringBuilder(), this.f13225a, " is null or empty.")) : new qo(this, true, "");
    }
}
