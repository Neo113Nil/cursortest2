package td0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l {
    public static final boolean a(@NotNull Context context, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        int length = permissions.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                return true;
            }
            String permission = permissions[i11];
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(permission, "permission");
            if (!(androidx.core.content.a.checkSelfPermission(context, permission) == 0)) {
                return false;
            }
            i11++;
        }
    }
}
