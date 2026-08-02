package s7;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.Y;

/* renamed from: s7.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class ViewOnAttachStateChangeListenerC9622q implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        view.removeOnAttachStateChangeListener(this);
        Y.A(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
