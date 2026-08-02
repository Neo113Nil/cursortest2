package k5;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes8.dex */
final class S1 extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return Locale.getDefault().toString();
    }
}
