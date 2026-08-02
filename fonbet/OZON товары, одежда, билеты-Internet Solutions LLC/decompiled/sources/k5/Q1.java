package k5;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class Q1 extends D0<Integer> {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70633e;

    Q1(@NonNull Context context) {
        super(Mm0.e.DeveloperTools);
        this.f70633e = context;
    }

    @Override // k5.D0
    @NonNull
    public final Integer s() throws D1 {
        int i11 = Settings.Secure.getInt(this.f70633e.getContentResolver(), "development_settings_enabled", 0);
        if (i11 == 1 || i11 == 0) {
            return Integer.valueOf(i11);
        }
        throw new P2(Ej.b.a(i11, "Unknown result state: "));
    }
}
