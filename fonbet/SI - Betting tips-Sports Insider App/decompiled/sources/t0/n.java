package t0;

import android.os.Bundle;
import androidx.appcompat.app.h0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n extends h0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Bundle data, String type) {
        super(data, type);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
