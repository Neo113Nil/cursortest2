package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634yh extends AbstractC0182gh {
    public C0634yh(E6 e62) {
        super(e62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0182gh, io.appmetrica.analytics.impl.InterfaceC0208hh
    public final boolean a(Boolean bool) {
        return !this.f13833a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
