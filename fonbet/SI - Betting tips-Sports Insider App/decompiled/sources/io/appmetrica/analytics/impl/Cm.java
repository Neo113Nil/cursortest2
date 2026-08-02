package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cm {

    /* renamed from: a, reason: collision with root package name */
    public final int f12119a;

    public Cm(int i5) {
        this.f12119a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cm) && this.f12119a == ((Cm) obj).f12119a;
    }

    public final int hashCode() {
        return this.f12119a;
    }

    public final String toString() {
        return d9.e.i(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f12119a, ')');
    }
}
