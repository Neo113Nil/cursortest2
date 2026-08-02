package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ym extends AbstractC0496t4 {

    /* renamed from: g, reason: collision with root package name */
    public final Ln f13249g;

    public Ym(@NonNull String str, @NonNull String str2, @NonNull Ln ln, @NonNull so soVar, @NonNull J2 j22) {
        super(0, str, str2, soVar, j22);
        this.f13249g = ln;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0496t4
    public final void a(@NonNull C0163fo c0163fo) {
        String str = (String) this.f13249g.a((String) this.f14664f);
        c0163fo.f13788d.f13908a = str == null ? new byte[0] : str.getBytes();
    }

    public final Ln h() {
        return this.f13249g;
    }
}
