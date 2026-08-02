package k5;

import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: k5.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7541m1 extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return Integer.toString(Build.VERSION.SDK_INT);
    }
}
