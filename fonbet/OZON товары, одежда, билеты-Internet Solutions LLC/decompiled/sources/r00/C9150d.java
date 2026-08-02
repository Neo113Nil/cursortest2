package r00;

import android.net.Uri;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r00.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9150d {
    public static final boolean a(@NotNull Uri uri, @NotNull String targetPath) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        Intrinsics.checkNotNullParameter("enabled", "booleanQueryName");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (!Intrinsics.d(C7714v.M(pathSegments), targetPath)) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("enabled");
        return Intrinsics.d(queryParameter, "true") || Intrinsics.d(queryParameter, "false");
    }
}
