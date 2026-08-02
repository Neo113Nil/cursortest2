package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"com/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$show$2", "Landroid/app/Dialog;", "onKeyUp", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RedBoxDialogSurfaceDelegate$show$2 extends Dialog {
    final /* synthetic */ RedBoxDialogSurfaceDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedBoxDialogSurfaceDelegate$show$2(Activity activity, RedBoxDialogSurfaceDelegate redBoxDialogSurfaceDelegate, int i10) {
        super(activity, i10);
        this.this$0 = redBoxDialogSurfaceDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F0 onCreate$lambda$0(int i10, View view, F0 windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        androidx.core.graphics.e f10 = windowInsetsCompat.f(i10);
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(f10.f19098a, f10.f19099b, f10.f19100c, f10.f19101d);
        return F0.f19136b;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        RedBoxContentView redBoxContentView;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Required value was null.");
        }
        window.setBackgroundDrawable(new ColorDrawable(-16777216));
        final int g10 = F0.p.g() | F0.p.a();
        redBoxContentView = this.this$0.redBoxContentView;
        if (redBoxContentView == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC2082d0.x0(redBoxContentView, new androidx.core.view.J() { // from class: com.facebook.react.devsupport.h0
            @Override // androidx.core.view.J
            public final F0 f(View view, F0 f02) {
                F0 onCreate$lambda$0;
                onCreate$lambda$0 = RedBoxDialogSurfaceDelegate$show$2.onCreate$lambda$0(g10, view, f02);
                return onCreate$lambda$0;
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        DoubleTapReloadRecognizer doubleTapReloadRecognizer;
        DevSupportManager devSupportManager;
        DevSupportManager devSupportManager2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 82) {
            devSupportManager2 = this.this$0.devSupportManager;
            devSupportManager2.showDevOptionsDialog();
            return true;
        }
        doubleTapReloadRecognizer = this.this$0.doubleTapReloadRecognizer;
        if (doubleTapReloadRecognizer.didDoubleTapR(keyCode, getCurrentFocus())) {
            devSupportManager = this.this$0.devSupportManager;
            devSupportManager.handleReloadJS();
        }
        return super.onKeyUp(keyCode, event);
    }
}
