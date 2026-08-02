package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V3 extends Jc {

    /* renamed from: a, reason: collision with root package name */
    public final Ve f13013a;

    public V3(@NonNull Context context) {
        this(new Ve(C0040b4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i5) {
        this.f13013a.c(i5);
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        return (int) this.f13013a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final SparseArray<Ic> c() {
        return new SparseArray<>();
    }

    public V3(Ve ve2) {
        this.f13013a = ve2;
    }
}
