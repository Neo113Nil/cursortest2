package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import B90.o0;
import android.os.Handler;
import android.os.Looper;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsLoaderDelegate;", "", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "hideLoaderDelayMs", "<init>", "(Ll10/b;J)V", "", "cancelPendingHide", "()V", "showLoaderImmediate", "onShowLoaderRequested", "onHideLoaderRequested", "", "stateRestored", "onListSubmitCompleted", "(Z)V", "onDetach", "Ll10/b;", "J", "loaderWasRequested", "Z", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "pendingHide", "Ljava/lang/Runnable;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewCredentialsLoaderDelegate {

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final Handler handler;
    private final long hideLoaderDelayMs;
    private boolean loaderWasRequested;
    private Runnable pendingHide;
    public static final int $stable = 8;

    public NewCredentialsLoaderDelegate(@NotNull InterfaceC7851b controller, long j11) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.hideLoaderDelayMs = j11;
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void cancelPendingHide() {
        Runnable runnable = this.pendingHide;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        this.pendingHide = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHideLoaderRequested$lambda$0(NewCredentialsLoaderDelegate newCredentialsLoaderDelegate) {
        newCredentialsLoaderDelegate.controller.hideLoader();
        newCredentialsLoaderDelegate.loaderWasRequested = false;
        newCredentialsLoaderDelegate.pendingHide = null;
    }

    private final void showLoaderImmediate() {
        this.controller.e(new l.a.C1079a(0L, null, 2));
    }

    public final void onDetach() {
        cancelPendingHide();
        this.loaderWasRequested = false;
    }

    public final void onHideLoaderRequested() {
        if (this.pendingHide != null) {
            return;
        }
        o0 o0Var = new o0(this, 4);
        this.pendingHide = o0Var;
        this.handler.postDelayed(o0Var, this.hideLoaderDelayMs);
    }

    public final void onListSubmitCompleted(boolean stateRestored) {
        if (this.loaderWasRequested && stateRestored) {
            showLoaderImmediate();
        }
    }

    public final void onShowLoaderRequested() {
        this.loaderWasRequested = true;
        cancelPendingHide();
        showLoaderImmediate();
    }

    public /* synthetic */ NewCredentialsLoaderDelegate(InterfaceC7851b interfaceC7851b, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7851b, (i11 & 2) != 0 ? 500L : j11);
    }
}
