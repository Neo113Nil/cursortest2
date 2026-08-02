package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Lf implements to, InterfaceC0625y8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0625y8
    public final int a(@NonNull I8 i82) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.to
    @NonNull
    public final byte[] a(@NonNull N8 n82, @NonNull C0285kh c0285kh) {
        return TextUtils.isEmpty(n82.f12631b) ? new byte[0] : Base64.decode(n82.f12631b, 0);
    }
}
