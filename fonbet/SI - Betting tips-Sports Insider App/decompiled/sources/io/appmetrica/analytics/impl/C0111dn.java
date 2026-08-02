package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111dn implements Ln {

    /* renamed from: a, reason: collision with root package name */
    public final Ln f13619a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13620b;

    public C0111dn(@NonNull Ln ln, Object obj) {
        this.f13619a = ln;
        this.f13620b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final Object a(Object obj) {
        return obj != this.f13619a.a(obj) ? this.f13620b : obj;
    }
}
