package com.google.gson;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.k f6373a = new com.google.gson.internal.k(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f6373a.equals(this.f6373a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6373a.hashCode();
    }
}
