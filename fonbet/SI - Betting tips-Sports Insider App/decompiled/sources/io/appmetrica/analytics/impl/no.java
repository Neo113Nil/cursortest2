package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class no implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    @Nullable
    public final String a(@NotNull Context context) {
        C0264jm c0264jm;
        try {
            Qm a7 = Pm.a(C0264jm.class);
            if (a7 == null) {
                return null;
            }
            Rm rm = (Rm) a7;
            ProtobufStateStorage<Object> a10 = rm.a(context, rm.a(context));
            if (a10 == null || (c0264jm = (C0264jm) a10.read()) == null) {
                return null;
            }
            return c0264jm.f14056a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
