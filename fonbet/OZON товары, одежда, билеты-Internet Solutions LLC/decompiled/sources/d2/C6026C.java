package d2;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6026C {
    @NotNull
    public static final OnBackInvokedCallback a(final Function0<Unit> function0) {
        return new OnBackInvokedCallback() { // from class: d2.B
            public final void onBackInvoked() {
                Function0 function02 = Function0.this;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
    }

    public static final void b(@NotNull View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void c(@NotNull View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
