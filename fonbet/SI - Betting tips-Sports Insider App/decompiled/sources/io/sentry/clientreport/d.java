package io.sentry.clientreport;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16282b;

    public d(String str, String str2) {
        this.f16281a = str;
        this.f16282b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return y4.a.s(this.f16281a, dVar.f16281a) && y4.a.s(this.f16282b, dVar.f16282b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16281a, this.f16282b});
    }
}
