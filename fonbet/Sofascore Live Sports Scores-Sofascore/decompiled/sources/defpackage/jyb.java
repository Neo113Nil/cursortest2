package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class jyb {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(iyb iybVar) {
        Objects.requireNonNull(iybVar);
        return new h90(iybVar, 4);
    }

    public void b(@NonNull iyb iybVar, @NonNull View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback a = a(iybVar);
            this.a = a;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, a);
        }
    }

    public void c(@NonNull View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }
}
