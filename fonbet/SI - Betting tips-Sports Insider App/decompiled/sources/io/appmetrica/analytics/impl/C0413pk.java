package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413pk implements Ic {
    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NotNull Context context) {
        Rm rm = (Rm) Pm.a(C0264jm.class);
        ProtobufStateStorage<Object> a7 = rm.a(context, rm.b(context));
        C0264jm c0264jm = (C0264jm) a7.read();
        C0238im a10 = c0264jm.a(c0264jm.f14067m);
        a10.f13969o = 0L;
        a7.save(new C0264jm(a10));
    }
}
