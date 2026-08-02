package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5501a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5502b;

    public m0(Object obj) {
        this.f5501a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f5502b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5502b) {
            throw new NoSuchElementException();
        }
        this.f5502b = true;
        return this.f5501a;
    }
}
