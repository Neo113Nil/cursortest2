package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454rc extends C0067c5 {
    public C0454rc(@NonNull Context context, @NonNull Q4 q42, @NonNull C0372o4 c0372o4, @NonNull V4 v42, @NonNull C0161fm c0161fm, @NonNull InterfaceC0208hh interfaceC0208hh, @NonNull ICommonExecutor iCommonExecutor, int i5, @NonNull C0288kk c0288kk, @NonNull Fb fb2, @NonNull InterfaceC0476s9 interfaceC0476s9) {
        super(context, q42, c0372o4, v42, c0161fm, interfaceC0208hh, iCommonExecutor, i5, fb2, interfaceC0476s9);
    }

    @NonNull
    public final C0409pg a(@NonNull C0405pc c0405pc) {
        C0282ke c0282ke = new C0282ke(c0405pc);
        Objects.requireNonNull(c0405pc);
        return new C0409pg(c0282ke, new C0380oc(c0405pc), c0405pc);
    }

    @Override // io.appmetrica.analytics.impl.C0067c5
    @NonNull
    public final InterfaceC0427q9 a(@NonNull InterfaceC0551v9 interfaceC0551v9, @NonNull L6 l6, @NonNull Qg qg2, @NonNull C0372o4 c0372o4, @NonNull Q4 q42, @NonNull We we2) {
        return this.f13496l.a(interfaceC0551v9, l6, qg2, c0372o4, q42, we2).a();
    }
}
