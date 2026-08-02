package Xj;

import android.content.Intent;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g {
    public static final Parcelable a(Intent intent, String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return intent.getParcelableExtra(key);
    }

    public static final Serializable b(Intent intent, String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return intent.getSerializableExtra(key);
    }
}
