package y1;

import android.os.Bundle;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 {
    public static l a(b2.e eVar, b0 destination, Bundle bundle, androidx.lifecycle.x hostLifecycleState, s sVar) {
        String id2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id2, "toString(...)");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new l(eVar, destination, bundle, hostLifecycleState, sVar, id2, null);
    }
}
