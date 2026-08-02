package ru.ozon.app.android.account.auth.biometry.keystore;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"encryptBase64", "", "", "account_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EncryptExtKt {
    @NotNull
    public static final String encryptBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String encodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        String lineSeparator = System.lineSeparator();
        Intrinsics.checkNotNullExpressionValue(lineSeparator, "lineSeparator(...)");
        return h.X(encodeToString, lineSeparator, "", false);
    }
}
