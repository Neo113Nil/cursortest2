package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "Lx0/h;", "Landroid/content/Context;", "contextSupplier", "<init>", "(Lx0/h;)V", "", "message", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "listener", "", "showPausedInDebuggerOverlay", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V", "hidePausedInDebuggerOverlay", "()V", "Lx0/h;", "Landroid/app/Dialog;", "pausedInDebuggerDialog", "Landroid/app/Dialog;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PausedInDebuggerOverlayDialogManager implements PausedInDebuggerOverlayManager {

    @NotNull
    private final x0.h contextSupplier;

    @Nullable
    private Dialog pausedInDebuggerDialog;

    public PausedInDebuggerOverlayDialogManager(@NotNull x0.h contextSupplier) {
        Intrinsics.checkNotNullParameter(contextSupplier, "contextSupplier");
        this.contextSupplier = contextSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hidePausedInDebuggerOverlay$lambda$4(PausedInDebuggerOverlayDialogManager pausedInDebuggerOverlayDialogManager) {
        Dialog dialog = pausedInDebuggerOverlayDialogManager.pausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        pausedInDebuggerOverlayDialogManager.pausedInDebuggerDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPausedInDebuggerOverlay$lambda$3(PausedInDebuggerOverlayDialogManager pausedInDebuggerOverlayDialogManager, String str, final DevSupportManager.PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener) {
        Dialog dialog = pausedInDebuggerOverlayDialogManager.pausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) pausedInDebuggerOverlayDialogManager.contextSupplier.get();
        if (context == null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.paused_in_debugger_view, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevSupportManager.PausedInDebuggerOverlayCommandListener.this.onResume();
            }
        });
        ((TextView) inflate.findViewById(R.id.button_text)).setText(str);
        Dialog dialog2 = new Dialog(context, R.style.NoAnimationDialog);
        dialog2.setContentView(inflate);
        dialog2.setCancelable(false);
        pausedInDebuggerOverlayDialogManager.pausedInDebuggerDialog = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(R.drawable.paused_in_debugger_background);
        }
        Dialog dialog3 = pausedInDebuggerOverlayDialogManager.pausedInDebuggerDialog;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager
    public void hidePausedInDebuggerOverlay() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.c0
            @Override // java.lang.Runnable
            public final void run() {
                PausedInDebuggerOverlayDialogManager.hidePausedInDebuggerOverlay$lambda$4(PausedInDebuggerOverlayDialogManager.this);
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager
    public void showPausedInDebuggerOverlay(@NotNull final String message, @NotNull final DevSupportManager.PausedInDebuggerOverlayCommandListener listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.b0
            @Override // java.lang.Runnable
            public final void run() {
                PausedInDebuggerOverlayDialogManager.showPausedInDebuggerOverlay$lambda$3(PausedInDebuggerOverlayDialogManager.this, message, listener);
            }
        });
    }
}
