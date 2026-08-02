package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C8 implements to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f12100a;

    public C8() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.to
    @NonNull
    public final byte[] a(@NonNull N8 n82, @NonNull C0285kh c0285kh) {
        String str = n82.f12631b;
        return ((G8) this.f12100a.f12306a.a(n82.f12643o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C8(H8 h82) {
        this.f12100a = h82;
    }
}
