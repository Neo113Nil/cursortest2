package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065c3 implements to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f13481a;

    public C0065c3() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.to
    @NonNull
    public final byte[] a(@NonNull N8 n82, @NonNull C0285kh c0285kh) {
        byte[] bArr = new byte[0];
        String str = n82.f12631b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        H8 h82 = this.f13481a;
        return ((G8) h82.f12306a.a(n82.f12643o)).a(bArr);
    }

    public C0065c3(H8 h82) {
        this.f13481a = h82;
    }
}
