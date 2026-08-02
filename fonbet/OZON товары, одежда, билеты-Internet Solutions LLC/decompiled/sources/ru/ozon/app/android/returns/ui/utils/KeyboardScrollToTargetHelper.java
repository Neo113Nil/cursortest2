package ru.ozon.app.android.returns.ui.utils;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.w0;
import B90.M;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0010R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u00020**\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/returns/ui/utils/KeyboardScrollToTargetHelper;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/android/textArea/TextAreaView;", "inputView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/textArea/TextAreaView;)V", "Landroidx/core/view/D;", "getInsetsListener", "()Landroidx/core/view/D;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getEditText", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "", "createJob", "()V", "scheduleScroll", "scrollToTarget", "setup", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/textArea/TextAreaView;", "", "topContainerLocation", "[I", "bottomContainerLocation", "editTextLocation", "LAe/w0;", "", "sharedFlow", "LAe/w0;", "getSharedFlow$annotations", "Lxe/B0;", "job", "Lxe/B0;", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "", "getY", "([I)I", "y", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class KeyboardScrollToTargetHelper {

    @NotNull
    private final int[] bottomContainerLocation;

    @NotNull
    private final int[] editTextLocation;

    @NotNull
    private final TextAreaView inputView;
    private B0 job;
    private View.OnLayoutChangeListener onLayoutChangeListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final w0<Long> sharedFlow;

    @NotNull
    private final int[] topContainerLocation;

    public KeyboardScrollToTargetHelper(@NotNull ComposerReferences refs, @NotNull TextAreaView inputView) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        this.refs = refs;
        this.inputView = inputView;
        this.topContainerLocation = new int[2];
        this.bottomContainerLocation = new int[2];
        this.editTextLocation = new int[2];
        this.sharedFlow = E0.b(0, 0, null, 7);
        this.onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper$onLayoutChangeListener$1
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
            
                r1 = r0.this$0.getWindow();
             */
            @Override // android.view.View.OnLayoutChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Window window;
                View decorView;
                C5353y0 n11;
                if ((oldBottom == bottom && oldTop == top) || window == null || (decorView = window.getDecorView()) == null || (n11 = Y.n(decorView)) == null || !n11.p(8)) {
                    return;
                }
                KeyboardScrollToTargetHelper.this.scheduleScroll();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createJob() {
        this.job = C2399j.C(new C2408n0(C2399j.l(this.sharedFlow, 100L), new KeyboardScrollToTargetHelper$createJob$1(this, null)), H.a(this.refs.getContainer().f().getLifecycle()));
    }

    private final OzonTextInput getEditText() {
        return (OzonTextInput) l.l(l.h(C5316f0.b(this.inputView), KeyboardScrollToTargetHelper$getEditText$$inlined$filterIsInstance$1.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D getInsetsListener() {
        return new M(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 getInsetsListener$lambda$0(KeyboardScrollToTargetHelper keyboardScrollToTargetHelper, View view, C5353y0 windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        if (windowInsetsCompat.p(8)) {
            keyboardScrollToTargetHelper.scheduleScroll();
        }
        return Y.u(view, windowInsetsCompat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Window getWindow() {
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            return a11.getWindow();
        }
        return null;
    }

    private final int getY(int[] iArr) {
        return iArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScroll() {
        C10727i.c(H.a(this.refs.getContainer().g().getLifecycle()), null, null, new KeyboardScrollToTargetHelper$scheduleScroll$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToTarget() {
        View view;
        RecyclerView composerRecyclerView;
        View view2;
        RecyclerView composerRecyclerView2;
        View view3;
        View view4;
        OzonTextInput editText = getEditText();
        if (editText == null) {
            return;
        }
        int selectionStart = editText.getSelectionStart();
        Layout layout = editText.getLayout();
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        LinearLayout linearLayout = null;
        LinearLayout composerTopContainer = (c11 == null || (view4 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerTopContainer(view4);
        ComponentCallbacksC5392m c12 = this.refs.getContainer().c();
        if (c12 != null && (view3 = c12.getView()) != null) {
            linearLayout = ComposerViewExtensionKt.composerBottomContainer(view3);
        }
        boolean z11 = composerTopContainer != null;
        boolean z12 = linearLayout != null;
        if (composerTopContainer != null) {
            composerTopContainer.getLocationOnScreen(this.topContainerLocation);
        }
        if (linearLayout != null) {
            linearLayout.getLocationOnScreen(this.bottomContainerLocation);
        }
        int scrollY = editText.getScrollY();
        editText.getLocationOnScreen(this.editTextLocation);
        if (z12) {
            int y11 = getY(this.editTextLocation) + (layout.getLineBottom(lineForOffset) - scrollY);
            int y12 = getY(this.bottomContainerLocation);
            if (y12 <= y11) {
                int i11 = y11 - y12;
                ComponentCallbacksC5392m c13 = this.refs.getContainer().c();
                if (c13 == null || (view2 = c13.getView()) == null || (composerRecyclerView2 = ComposerViewExtensionKt.composerRecyclerView(view2)) == null) {
                    return;
                }
                composerRecyclerView2.scrollBy(0, i11);
                return;
            }
        }
        if (z11) {
            int y13 = getY(this.editTextLocation) + (layout.getLineTop(lineForOffset) - scrollY);
            int height = composerTopContainer.getHeight() + getY(this.topContainerLocation);
            if (height >= y13) {
                int y14 = lineForOffset == 0 ? getY(this.editTextLocation) - height : y13 - height;
                ComponentCallbacksC5392m c14 = this.refs.getContainer().c();
                if (c14 == null || (view = c14.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
                    return;
                }
                composerRecyclerView.scrollBy(0, y14);
            }
        }
    }

    public final void setup() {
        AbstractC5434v lifecycle;
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper$setup$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Window window;
                TextAreaView textAreaView;
                View.OnLayoutChangeListener onLayoutChangeListener;
                View decorView;
                D insetsListener;
                Intrinsics.checkNotNullParameter(owner, "owner");
                KeyboardScrollToTargetHelper.this.createJob();
                window = KeyboardScrollToTargetHelper.this.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    insetsListener = KeyboardScrollToTargetHelper.this.getInsetsListener();
                    Y.J(decorView, insetsListener);
                }
                textAreaView = KeyboardScrollToTargetHelper.this.inputView;
                onLayoutChangeListener = KeyboardScrollToTargetHelper.this.onLayoutChangeListener;
                textAreaView.addOnLayoutChangeListener(onLayoutChangeListener);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Window window;
                TextAreaView textAreaView;
                View.OnLayoutChangeListener onLayoutChangeListener;
                B0 b02;
                View decorView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                window = KeyboardScrollToTargetHelper.this.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    Y.J(decorView, null);
                }
                textAreaView = KeyboardScrollToTargetHelper.this.inputView;
                onLayoutChangeListener = KeyboardScrollToTargetHelper.this.onLayoutChangeListener;
                textAreaView.removeOnLayoutChangeListener(onLayoutChangeListener);
                KeyboardScrollToTargetHelper.this.onLayoutChangeListener = null;
                owner.getLifecycle().e(this);
                b02 = KeyboardScrollToTargetHelper.this.job;
                if (b02 != null) {
                    b02.j(null);
                }
                KeyboardScrollToTargetHelper.this.job = null;
            }
        };
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(defaultLifecycleObserver);
    }
}
