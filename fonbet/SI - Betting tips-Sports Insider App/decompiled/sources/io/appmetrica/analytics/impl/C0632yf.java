package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632yf extends C0428qa {
    public C0632yf(int i5) {
        super(i5);
    }

    @Override // io.appmetrica.analytics.impl.C0428qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z5) {
        if (z5 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z5.f13251b) + 12;
    }
}
