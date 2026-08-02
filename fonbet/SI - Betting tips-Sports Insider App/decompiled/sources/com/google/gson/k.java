package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends l implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6371a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f6371a.equals(this.f6371a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6371a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6371a.iterator();
    }
}
