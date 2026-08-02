package f1;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;
import org.jetbrains.annotations.NotNull;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6397a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f62427a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f62428b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AutofillManager f62429c;

    public C6397a(@NotNull AndroidComposeView androidComposeView, @NotNull g gVar) {
        this.f62427a = androidComposeView;
        this.f62428b = gVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f62429c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
    }

    @NotNull
    public final AutofillManager a() {
        return this.f62429c;
    }

    @NotNull
    public final g b() {
        return this.f62428b;
    }

    @NotNull
    public final View c() {
        return this.f62427a;
    }
}
