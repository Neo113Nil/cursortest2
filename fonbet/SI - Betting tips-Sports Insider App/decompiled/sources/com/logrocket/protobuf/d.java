package com.logrocket.protobuf;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public int f6678a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f6679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f6680c;

    public d(j jVar) {
        this.f6680c = jVar;
        this.f6679b = jVar.size();
    }

    @Override // com.logrocket.protobuf.e
    public final byte a() {
        int i5 = this.f6678a;
        if (i5 >= this.f6679b) {
            throw new NoSuchElementException();
        }
        this.f6678a = i5 + 1;
        return this.f6680c.g(i5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6678a < this.f6679b;
    }
}
