package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* renamed from: k5.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7553p1 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70822e;

    C7553p1(@NonNull Context context) {
        super(Mm0.e.OS_ID);
        this.f70822e = context;
    }

    @Override // k5.D0
    @NonNull
    @SuppressLint({"HardwareIds"})
    protected final String s() throws D1 {
        return Settings.Secure.getString(this.f70822e.getContentResolver(), "android_id");
    }
}
