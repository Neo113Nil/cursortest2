package k5;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;

/* renamed from: k5.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7523i extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        return str2.toLowerCase(locale).startsWith(str.toLowerCase(locale)) ? C7575v0.c(str2) : C7575v0.c(str);
    }
}
