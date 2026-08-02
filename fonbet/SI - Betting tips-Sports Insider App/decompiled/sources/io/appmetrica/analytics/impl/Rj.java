package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Rj extends AbstractC0182gh {
    public Rj(@NonNull E6 e62) {
        super(e62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0182gh, io.appmetrica.analytics.impl.InterfaceC0208hh
    public final boolean a(Boolean bool) {
        return !this.f13833a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
