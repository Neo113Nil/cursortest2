package com.logrocket.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h extends j {
    private static final long serialVersionUID = 1;

    @Override // com.logrocket.protobuf.j
    public final int f() {
        return 0;
    }

    @Override // com.logrocket.protobuf.j
    public final boolean h() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public abstract boolean q(h hVar, int i5, int i10);
}
