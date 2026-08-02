package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class R4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f12802a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC0143f4 interfaceC0143f4) {
        this.f12802a.add(interfaceC0143f4);
    }

    public final void b(@NonNull InterfaceC0143f4 interfaceC0143f4) {
        this.f12802a.remove(interfaceC0143f4);
    }

    public final List<InterfaceC0143f4> a() {
        return this.f12802a;
    }
}
