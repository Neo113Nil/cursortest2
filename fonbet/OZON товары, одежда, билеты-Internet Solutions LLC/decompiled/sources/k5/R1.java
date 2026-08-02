package k5;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f70634a;

    public R1(@NonNull Context context) {
        if (context instanceof Application) {
            this.f70634a = context;
        } else {
            this.f70634a = context.getApplicationContext();
        }
    }

    public final h3 a() {
        return new h3(this.f70634a);
    }
}
