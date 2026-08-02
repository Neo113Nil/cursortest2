package y80;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: y80.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10864c {
    public static final boolean a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.d(uri.getScheme(), "ozon") && Intrinsics.d(uri.getAuthority(), "payment");
    }
}
