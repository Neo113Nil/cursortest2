package y1;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z {
    public static String a(b2.e context, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 16777215) {
            return String.valueOf(i5);
        }
        context.getClass();
        try {
            Context context2 = context.f2968a;
            Intrinsics.checkNotNull(context2);
            String resourceName = context2.getResources().getResourceName(i5);
            Intrinsics.checkNotNull(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i5);
        }
    }
}
