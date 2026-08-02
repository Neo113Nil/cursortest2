package Xj;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class f {
    public static final Fragment a(Fragment fragment, Function1 extras) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Bundle bundle = new Bundle();
        extras.invoke(bundle);
        fragment.setArguments(bundle);
        return fragment;
    }
}
