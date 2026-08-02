package uZ;

import android.app.Dialog;
import android.content.Intent;
import android.view.Window;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LuZ/b;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LuZ/c;", "controller", "LuZ/c;", "compass_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: uZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9990b extends com.google.android.material.bottomsheet.b {

    @NotNull
    private final C9991c controller = new C9991c(this);

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.controller.a(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
        super.onPause();
    }
}
