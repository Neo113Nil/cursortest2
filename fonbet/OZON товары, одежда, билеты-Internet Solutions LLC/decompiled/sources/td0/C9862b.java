package td0;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9862b {
    @NotNull
    public static final String a(int i11, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String encodeToString = Base64.encodeToString(bArr, i11);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        String lineSeparator = System.lineSeparator();
        Intrinsics.checkNotNullExpressionValue(lineSeparator, "lineSeparator(...)");
        return kotlin.text.h.X(encodeToString, lineSeparator, "", false);
    }
}
