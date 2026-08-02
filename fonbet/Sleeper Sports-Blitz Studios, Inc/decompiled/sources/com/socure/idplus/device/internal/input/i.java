package com.socure.idplus.device.internal.input;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class i implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f860a;
    public final Function1 b;
    public final Function1 c;
    public final a d;

    public i(Window.Callback callback, h touchEventCallback, e keyEventCallback, com.socure.idplus.device.internal.input.manager.monitor.a actionModeCallback) {
        Intrinsics.checkNotNullParameter(touchEventCallback, "touchEventCallback");
        Intrinsics.checkNotNullParameter(keyEventCallback, "keyEventCallback");
        Intrinsics.checkNotNullParameter(actionModeCallback, "actionModeCallback");
        this.f860a = callback;
        this.b = touchEventCallback;
        this.c = keyEventCallback;
        this.d = actionModeCallback;
    }

    public final Window.Callback a() {
        return this.f860a;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.c.invoke(keyEvent);
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchKeyShortcutEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Objects.toString(motionEvent);
        this.b.invoke(motionEvent);
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.dispatchTrackballEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        com.socure.idplus.device.internal.input.manager.monitor.a aVar = (com.socure.idplus.device.internal.input.manager.monitor.a) this.d;
        if (aVar.f867a) {
            aVar.b = true;
            aVar.f867a = false;
        }
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        com.socure.idplus.device.internal.input.manager.monitor.a aVar = (com.socure.idplus.device.internal.input.manager.monitor.a) this.d;
        if (true != aVar.f867a) {
            aVar.b = true;
            aVar.f867a = true;
        }
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onCreatePanelView(i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onMenuItemSelected(i, item);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onMenuOpened(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onPreparePanel(i, view, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onSearchRequested();
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f860a;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f860a;
        if (callback != null) {
            return callback.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2 = this.f860a;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback, i);
        }
        return null;
    }
}
