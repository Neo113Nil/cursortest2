package pi0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8937a extends b<Boolean> {
    @Override // pi0.b
    public final Boolean b(String launchArgsName) {
        Intrinsics.checkNotNullParameter(launchArgsName, "launchArgsName");
        return d().a(launchArgsName);
    }

    @Override // pi0.b
    public final Boolean c(String deeplinkPath) {
        Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
        Gj0.a d11 = d();
        d11.getClass();
        Intrinsics.checkNotNullParameter("enabled", "paramName");
        String d12 = d11.d("enabled");
        if (d12 == null) {
            return null;
        }
        String lowerCase = d12.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase != null) {
            return kotlin.text.h.t0(lowerCase);
        }
        return null;
    }
}
