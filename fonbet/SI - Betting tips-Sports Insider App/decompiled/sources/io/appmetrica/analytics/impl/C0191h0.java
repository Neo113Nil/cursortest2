package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191h0 implements so {
    @Override // io.appmetrica.analytics.impl.so
    public final qo a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new qo(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new qo(this, true, "");
        } catch (Throwable unused) {
            return new qo(this, false, androidx.appcompat.widget.c1.n("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
