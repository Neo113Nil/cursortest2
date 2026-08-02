package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import B90.X;
import Ql.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorViewHolder;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputsDelegate;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u000203\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0003J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;", "", "<init>", "()V", "", "initKeyboardListener", "removeKeyboardListener", "", "withReScroll", "scrollToInput", "(Z)V", "Landroid/widget/EditText;", "", "getActiveInputLineAbsoluteY", "(Landroid/widget/EditText;)I", "Landroid/view/View;", "inputView", "inputBottomAndKeyboardDistance", "(Landroid/view/View;)I", "inputTopAndTopContainerDistance", "isKeyboardVisible", "()Z", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;", "input", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecycler", "setupInputsDelegate", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;Landroidx/recyclerview/widget/RecyclerView;)V", "onTextChanged", "onClear", "", "inputs", "Ljava/util/List;", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "Landroidx/recyclerview/widget/RecyclerView;", "Ljava/lang/Runnable;", "scrollToInputRunnable", "Ljava/lang/Runnable;", "scrolledToInput", "Z", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "ru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate$scrollListener$1", "scrollListener", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate$scrollListener$1;", "ru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate$recyclerTouchListener$1", "recyclerTouchListener", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate$recyclerTouchListener$1;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormInputsDelegate {
    private RecyclerView composerRecycler;
    private Runnable scrollToInputRunnable;
    private boolean scrolledToInput;
    public static final int $stable = 8;
    private static int keyboardWithButtonY = -1;
    private static int topContainerBottomY = -1;

    @NotNull
    private final List<SelectionFormInput> inputs = new ArrayList();

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler = k.b(SelectionFormInputsDelegate$handler$2.INSTANCE);

    @NotNull
    private final D insetsListener = new X(this);

    @NotNull
    private final SelectionFormInputsDelegate$scrollListener$1 scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputsDelegate$scrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            List list;
            Object obj;
            OzonTextInput inputView;
            boolean isKeyboardVisible;
            int inputBottomAndKeyboardDistance;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState == 0) {
                list = SelectionFormInputsDelegate.this.inputs;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((SelectionFormInput) obj).hasFocus()) {
                            break;
                        }
                    }
                }
                SelectionFormInput selectionFormInput = (SelectionFormInput) obj;
                if (selectionFormInput == null || (inputView = selectionFormInput.getInputView()) == null) {
                    return;
                }
                isKeyboardVisible = SelectionFormInputsDelegate.this.isKeyboardVisible();
                if (isKeyboardVisible) {
                    inputBottomAndKeyboardDistance = SelectionFormInputsDelegate.this.inputBottomAndKeyboardDistance(inputView);
                    if (inputBottomAndKeyboardDistance > 0) {
                        SelectionFormInputsDelegate.this.scrollToInput(false);
                        return;
                    }
                }
                recyclerView.removeOnScrollListener(this);
            }
        }
    };

    @NotNull
    private final SelectionFormInputsDelegate$recyclerTouchListener$1 recyclerTouchListener = new RecyclerView.y() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputsDelegate$recyclerTouchListener$1
        private float initialY;
        private int touchSlop;

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
            List list;
            OzonTextInput inputView;
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.touchSlop == 0) {
                this.touchSlop = ViewConfiguration.get(rv.getContext()).getScaledTouchSlop();
            }
            int action = event.getAction();
            if (action == 0) {
                this.initialY = event.getY();
            } else if (action == 1 && Math.abs(event.getY() - this.initialY) < this.touchSlop) {
                View findChildViewUnder = rv.findChildViewUnder(event.getX(), event.getY());
                Object obj = null;
                RecyclerView.C findContainingViewHolder = findChildViewUnder != null ? rv.findContainingViewHolder(findChildViewUnder) : null;
                if (findContainingViewHolder instanceof IslandSeparatorViewHolder) {
                    return false;
                }
                if (findContainingViewHolder == null || !(findContainingViewHolder instanceof SelectionFormInputVH)) {
                    list = SelectionFormInputsDelegate.this.inputs;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((SelectionFormInput) next).hasFocus()) {
                            obj = next;
                            break;
                        }
                    }
                    SelectionFormInput selectionFormInput = (SelectionFormInput) obj;
                    if (selectionFormInput != null && (inputView = selectionFormInput.getInputView()) != null) {
                        ViewExtKt.forceClearFocus(inputView);
                    }
                }
            }
            return false;
        }
    };

    private final int getActiveInputLineAbsoluteY(EditText editText) {
        int[] iArr = new int[2];
        editText.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        Layout layout = editText.getLayout();
        if (layout == null) {
            return (editText.getHeight() + i11) / 2;
        }
        int lineForOffset = layout.getLineForOffset(editText.getSelectionStart());
        return layout.getLineAscent(lineForOffset) + layout.getLineBaseline(lineForOffset) + i11;
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    private final void initKeyboardListener() {
        Window window;
        View decorView;
        RecyclerView recyclerView = this.composerRecycler;
        Context context = recyclerView != null ? recyclerView.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        Y.J(decorView, this.insetsListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int inputBottomAndKeyboardDistance(View inputView) {
        Rect rect = new Rect();
        inputView.getGlobalVisibleRect(rect);
        return rect.bottom - keyboardWithButtonY;
    }

    private final int inputTopAndTopContainerDistance(View inputView) {
        Rect rect = new Rect();
        inputView.getGlobalVisibleRect(rect);
        return rect.top - topContainerBottomY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        if (r6 != (r4 != null ? r4.bottomMargin : 0)) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C5353y0 insetsListener$lambda$1(SelectionFormInputsDelegate selectionFormInputsDelegate, View view, C5353y0 c5353y0) {
        RecyclerView recyclerView;
        int i11 = c.a(view, "view", c5353y0, "insets", 2).f42129d;
        int i12 = c5353y0.f(8).f42129d;
        boolean p11 = c5353y0.p(8);
        View findFocus = view.findFocus();
        if (p11 && (findFocus instanceof OzonTextInput)) {
            if (keyboardWithButtonY == -1) {
                keyboardWithButtonY = (view.getHeight() - i12) - ComposerViewExtensionKt.composerBottomContainer(view).getHeight();
            }
            if (topContainerBottomY == -1) {
                topContainerBottomY = ComposerViewExtensionKt.composerTopContainer(view).getBottom();
            }
            if (selectionFormInputsDelegate.inputBottomAndKeyboardDistance(findFocus) > 0 && (recyclerView = selectionFormInputsDelegate.composerRecycler) != null && recyclerView.getScrollState() == 0 && !selectionFormInputsDelegate.scrolledToInput) {
                selectionFormInputsDelegate.scrolledToInput = true;
                scrollToInput$default(selectionFormInputsDelegate, false, 1, null);
            }
        } else {
            selectionFormInputsDelegate.scrolledToInput = false;
        }
        int i13 = i12 - i11;
        if (i13 < 0) {
            i13 = 0;
        }
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(view);
        Intrinsics.g(composerContainer, "null cannot be cast to non-null type android.view.View");
        ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i14 = marginLayoutParams.topMargin;
            int i15 = marginLayoutParams.rightMargin;
            int i16 = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = i13;
            ViewGroup.LayoutParams layoutParams2 = composerContainer.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i14 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = composerContainer.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i15 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = composerContainer.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                }
            }
            composerContainer.setLayoutParams(marginLayoutParams);
        }
        return Y.u(view, c5353y0).m(0, 0, 0, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyboardVisible() {
        View rootView;
        RecyclerView recyclerView = this.composerRecycler;
        if (recyclerView == null || (rootView = recyclerView.getRootView()) == null) {
            return false;
        }
        C5353y0 n11 = Y.n(rootView);
        Boolean valueOf = n11 != null ? Boolean.valueOf(n11.p(8)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    private final void removeKeyboardListener() {
        Window window;
        View decorView;
        RecyclerView recyclerView = this.composerRecycler;
        Context context = recyclerView != null ? recyclerView.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        Y.J(decorView, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToInput(final boolean withReScroll) {
        Object obj;
        final OzonTextInput inputView;
        Iterator<T> it = this.inputs.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SelectionFormInput) obj).hasFocus()) {
                    break;
                }
            }
        }
        SelectionFormInput selectionFormInput = (SelectionFormInput) obj;
        if (selectionFormInput == null || (inputView = selectionFormInput.getInputView()) == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: MW.c
            @Override // java.lang.Runnable
            public final void run() {
                SelectionFormInputsDelegate.scrollToInput$lambda$7(SelectionFormInputsDelegate.this, inputView, withReScroll);
            }
        };
        getHandler().postDelayed(runnable, 300L);
        this.scrollToInputRunnable = runnable;
    }

    static /* synthetic */ void scrollToInput$default(SelectionFormInputsDelegate selectionFormInputsDelegate, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        selectionFormInputsDelegate.scrollToInput(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToInput$lambda$7(SelectionFormInputsDelegate selectionFormInputsDelegate, OzonTextInput ozonTextInput, boolean z11) {
        int inputBottomAndKeyboardDistance;
        RecyclerView recyclerView = selectionFormInputsDelegate.composerRecycler;
        if (recyclerView != null) {
            int activeInputLineAbsoluteY = selectionFormInputsDelegate.getActiveInputLineAbsoluteY(ozonTextInput);
            if (activeInputLineAbsoluteY < topContainerBottomY) {
                inputBottomAndKeyboardDistance = selectionFormInputsDelegate.inputTopAndTopContainerDistance(ozonTextInput);
            } else if (ozonTextInput.getLineHeight() + activeInputLineAbsoluteY <= keyboardWithButtonY) {
                return;
            } else {
                inputBottomAndKeyboardDistance = selectionFormInputsDelegate.inputBottomAndKeyboardDistance(ozonTextInput);
            }
            if (!(recyclerView.getScrollState() == 0 && inputBottomAndKeyboardDistance > 0 && recyclerView.canScrollVertically(1)) && (inputBottomAndKeyboardDistance >= 0 || !recyclerView.canScrollVertically(-1))) {
                return;
            }
            SelectionFormInputsDelegate$scrollListener$1 selectionFormInputsDelegate$scrollListener$1 = selectionFormInputsDelegate.scrollListener;
            if (z11) {
                recyclerView.addOnScrollListener(selectionFormInputsDelegate$scrollListener$1);
            } else {
                recyclerView.removeOnScrollListener(selectionFormInputsDelegate$scrollListener$1);
            }
            recyclerView.smoothScrollBy(0, inputBottomAndKeyboardDistance);
        }
    }

    public final void onClear() {
        removeKeyboardListener();
        RecyclerView recyclerView = this.composerRecycler;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.recyclerTouchListener);
        }
        Runnable runnable = this.scrollToInputRunnable;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
        }
        this.inputs.clear();
        this.composerRecycler = null;
    }

    public final void onTextChanged() {
        if (isKeyboardVisible()) {
            List<SelectionFormInput> list = this.inputs;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((SelectionFormInput) it.next()).hasFocus()) {
                    scrollToInput$default(this, false, 1, null);
                    return;
                }
            }
        }
    }

    public final void setupInputsDelegate(@NotNull SelectionFormInput input, RecyclerView composerRecycler) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.composerRecycler == null) {
            this.composerRecycler = composerRecycler;
            if (composerRecycler != null) {
                composerRecycler.addOnItemTouchListener(this.recyclerTouchListener);
            }
            initKeyboardListener();
        }
        this.inputs.add(input);
    }
}
