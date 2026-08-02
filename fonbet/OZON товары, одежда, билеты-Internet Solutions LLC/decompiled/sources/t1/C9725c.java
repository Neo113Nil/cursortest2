package t1;

import androidx.compose.ui.platform.AndroidComposeView;
import org.jetbrains.annotations.NotNull;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9725c implements InterfaceC9723a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f98964a;

    public C9725c(@NotNull AndroidComposeView androidComposeView) {
        this.f98964a = androidComposeView;
    }

    @Override // t1.InterfaceC9723a
    public final void a(int i11) {
        boolean a11 = C9724b.a(i11, 0);
        AndroidComposeView androidComposeView = this.f98964a;
        if (a11) {
            androidComposeView.performHapticFeedback(0);
        } else if (C9724b.a(i11, 9)) {
            androidComposeView.performHapticFeedback(9);
        }
    }
}
