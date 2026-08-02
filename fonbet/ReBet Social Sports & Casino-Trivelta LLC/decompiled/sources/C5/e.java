package C5;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f1170a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1171b;

    public e(Window.Callback originalCallback, Function1 onTouchEvent) {
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        Intrinsics.checkNotNullParameter(onTouchEvent, "onTouchEvent");
        this.f1170a = originalCallback;
        this.f1171b = onTouchEvent;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1170a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1170a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1170a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1170a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f1171b.invoke(motionEvent);
        }
        return this.f1170a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1170a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f1170a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f1170a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f1170a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f1170a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f1170a.onCreatePanelMenu(i10, p12);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f1170a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f1170a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f1170a.onMenuItemSelected(i10, p12);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f1170a.onMenuOpened(i10, p12);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        this.f1170a.onPanelClosed(i10, p12);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu p22) {
        Intrinsics.checkNotNullParameter(p22, "p2");
        return this.f1170a.onPreparePanel(i10, view, p22);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f1170a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1170a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f1170a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1170a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f1170a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f1170a.onWindowStartingActionMode(callback, i10);
    }
}
