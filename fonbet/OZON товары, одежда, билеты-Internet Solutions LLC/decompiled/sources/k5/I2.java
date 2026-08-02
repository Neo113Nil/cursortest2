package k5;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class I2 extends D0<Integer> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70585e;

    I2(@NonNull Context context) {
        super(Mm0.e.BootCount);
        this.f70585e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        try {
            return Integer.valueOf(Settings.Global.getInt(this.f70585e.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException e11) {
            throw new P2(e11.getMessage());
        }
    }
}
