package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bkj {
    @Nullable
    public static OnBackInvokedDispatcher a(@NonNull View view) {
        return view.findOnBackInvokedDispatcher();
    }

    @NonNull
    public static OnBackInvokedCallback b(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new h90(runnable, 6);
    }

    public static void c(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void d(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
