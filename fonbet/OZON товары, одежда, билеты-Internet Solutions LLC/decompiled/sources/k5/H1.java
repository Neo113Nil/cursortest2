package k5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes8.dex */
final class H1 extends D0<String> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f70569f = C7563s0.a(new byte[]{-123, -1, 17, Byte.MIN_VALUE, 124, -82, -56, 91, -76, -54, 69, -44, 79, 86, -47, 53, -40, 76, -61, 74, 111, 101, -11, -75, 64, -41, 3, 79, 103, 19, 125, 44});

    /* renamed from: g, reason: collision with root package name */
    private static final String f70570g = C7563s0.a(new byte[]{-68, 76, -25, 3, -108, 89, -40, -14, 17, 111, -18, 26, -23, 45, -101, 61, -16, 40, 43, 95, 101, -120, -24, 92, -17, 123, 34, -39, 14, -76, -13, 96});

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70571e;

    H1(@NonNull Context context) {
        super(Mm0.e.RSA_ApplicationKey);
        this.f70571e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        SharedPreferences sharedPreferences = this.f70571e.getSharedPreferences(f70569f, 0);
        String a11 = C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73});
        String str = f70570g;
        String string = sharedPreferences.getString(str, a11);
        if (!TextUtils.isEmpty(string.trim())) {
            return string;
        }
        String replaceAll = UUID.randomUUID().toString().toUpperCase(Locale.ROOT).replaceAll(C7563s0.a(new byte[]{-104, 45, 7, 24, -29, -61, -98, -84, -121, -47, -10, -3, 34, 17, 86, 63}), C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}));
        sharedPreferences.edit().putString(str, replaceAll).apply();
        return replaceAll;
    }
}
