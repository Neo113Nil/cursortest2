package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Pn implements to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f12765a;

    public Pn() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.to
    @NonNull
    public final byte[] a(@NonNull N8 n82, @NonNull C0285kh c0285kh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(n82.f12631b);
        } catch (Throwable unused) {
        }
        byte[] a7 = ((G8) this.f12765a.f12306a.a(n82.f12643o)).a(bArr);
        return a7 == null ? new byte[0] : a7;
    }

    public Pn(H8 h82) {
        this.f12765a = h82;
    }

    @NonNull
    public final H8 a() {
        return this.f12765a;
    }
}
