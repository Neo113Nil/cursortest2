package ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation;

import N.r;
import Vg.d;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.view.ReturnTextAreaButtonView;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.viewObject.ReturnTextAreaButtonVO;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.presentation.TextAreaViewBinderKt;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.viewObject.RmsTextAreaV2VO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/ReturnTextAreaButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/viewObject/ReturnTextAreaButtonVO;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/view/ReturnTextAreaButtonView;", "returnTextAreaButtonView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/view/ReturnTextAreaButtonView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "data", "", "onAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "setupGlobalLayoutListener", "()V", "Landroidx/core/view/y0;", "insets", "", "calculateMaxRowsWhenKeyboardVisible", "(Landroidx/core/view/y0;)I", "maxRows", "updateMaxLines", "(I)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/widgets/textAreaButton/viewObject/ReturnTextAreaButtonVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/view/ReturnTextAreaButtonView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Runnable;", "callback", "Ljava/lang/Runnable;", "maxRowsWhenKeyboardVisible", "Ljava/lang/Integer;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "getMaxRows", "()I", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTextAreaButtonViewHolder extends k<ReturnTextAreaButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Runnable callback;
    private Integer maxRowsWhenKeyboardVisible;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReturnTextAreaButtonView returnTextAreaButtonView;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnTextAreaButtonViewHolder(@NotNull ReturnTextAreaButtonView returnTextAreaButtonView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(returnTextAreaButtonView);
        Intrinsics.checkNotNullParameter(returnTextAreaButtonView, "returnTextAreaButtonView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.returnTextAreaButtonView = returnTextAreaButtonView;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnTextAreaButtonViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.callback = new r(this, 2);
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.ReturnTextAreaButtonViewHolder$onGlobalLayoutListener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C5353y0 c5353y0;
                int maxRows;
                Integer num;
                Window window;
                try {
                    window = ReturnTextAreaButtonViewHolder.this.getWindow();
                    c5353y0 = Y.n(window.getDecorView());
                } catch (Exception unused) {
                    c5353y0 = null;
                }
                if (c5353y0 == null) {
                    return;
                }
                if (c5353y0.p(8)) {
                    num = ReturnTextAreaButtonViewHolder.this.maxRowsWhenKeyboardVisible;
                    ReturnTextAreaButtonViewHolder.this.updateMaxLines(num != null ? num.intValue() : ReturnTextAreaButtonViewHolder.this.calculateMaxRowsWhenKeyboardVisible(c5353y0));
                } else {
                    ReturnTextAreaButtonViewHolder returnTextAreaButtonViewHolder = ReturnTextAreaButtonViewHolder.this;
                    maxRows = returnTextAreaButtonViewHolder.getMaxRows();
                    returnTextAreaButtonViewHolder.updateMaxLines(maxRows);
                }
            }
        };
        setupGlobalLayoutListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateMaxRowsWhenKeyboardVisible(C5353y0 insets) {
        androidx.core.graphics.d f7 = insets.f(8);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        androidx.core.graphics.d f11 = insets.f(1);
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        int i11 = f7.f42129d - f11.f42127b;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(24, context);
        int height = this.returnTextAreaButtonView.getButton().getHeight();
        ViewGroup.LayoutParams layoutParams = this.returnTextAreaButtonView.getButton().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = this.returnTextAreaButtonView.getTextAreaView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int max = Math.max(0, i11 - this.returnTextAreaButtonView.getMeasuredHeight()) - (i12 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
        Integer visibleLineCount = this.returnTextAreaButtonView.getVisibleLineCount();
        if (visibleLineCount == null) {
            this.maxRowsWhenKeyboardVisible = Integer.valueOf(getMaxRows());
            return getMaxRows();
        }
        float f12 = max / px;
        int i13 = (int) f12;
        int intValue = (visibleLineCount.intValue() + i13) - ((i13 >= 0 || ((double) Math.abs(f12 - ((float) i13))) <= 0.01d) ? 0 : 1);
        this.maxRowsWhenKeyboardVisible = Integer.valueOf(intValue);
        return intValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callback$lambda$0(ReturnTextAreaButtonViewHolder returnTextAreaButtonViewHolder) {
        returnTextAreaButtonViewHolder.returnTextAreaButtonView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxRows() {
        RmsTextAreaV2VO textArea;
        ReturnTextAreaButtonVO boundData = getBoundData();
        if (boundData == null || (textArea = boundData.getTextArea()) == null) {
            return 15;
        }
        return textArea.getMaxRows();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Window getWindow() {
        Window window = this.refs.getContainer().i().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return window;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAction(AtomAction data) {
        AtomAction.ComposerAction copy$default;
        Map<String, String> params;
        AtomAction.ComposerAction composerAction = data instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) data : null;
        LinkedHashMap u11 = (composerAction == null || (params = composerAction.getParams()) == null) ? null : U.u(params);
        String str = u11 != null ? (String) u11.get("body") : null;
        if (str == null) {
            str = "";
        }
        String inputText = this.returnTextAreaButtonView.getTextAreaView().getInputText();
        String str2 = inputText != null ? inputText : "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("Comment", str2);
            if (u11 != null) {
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            }
            if (composerAction == null || (copy$default = AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null)) == null) {
                return;
            }
            this.actionHandler.invoke(copy$default);
        } catch (Exception unused) {
            this.actionHandler.invoke(data);
        }
    }

    private final void setupGlobalLayoutListener() {
        AbstractC5434v lifecycle;
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.ReturnTextAreaButtonViewHolder$setupGlobalLayoutListener$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Window window;
                Window window2;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
                ReturnTextAreaButtonView returnTextAreaButtonView;
                Runnable runnable;
                Intrinsics.checkNotNullParameter(owner, "owner");
                window = ReturnTextAreaButtonViewHolder.this.getWindow();
                Y.J(window.getDecorView(), null);
                window2 = ReturnTextAreaButtonViewHolder.this.getWindow();
                ViewTreeObserver viewTreeObserver = window2.getDecorView().getViewTreeObserver();
                onGlobalLayoutListener = ReturnTextAreaButtonViewHolder.this.onGlobalLayoutListener;
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                returnTextAreaButtonView = ReturnTextAreaButtonViewHolder.this.returnTextAreaButtonView;
                runnable = ReturnTextAreaButtonViewHolder.this.callback;
                returnTextAreaButtonView.removeCallbacks(runnable);
                ReturnTextAreaButtonViewHolder.this.onGlobalLayoutListener = null;
                ReturnTextAreaButtonViewHolder.this.callback = null;
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Window window;
                Window window2;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
                ReturnTextAreaButtonView returnTextAreaButtonView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                window = ReturnTextAreaButtonViewHolder.this.getWindow();
                window.getDecorView().getRootView().setFitsSystemWindows(false);
                window2 = ReturnTextAreaButtonViewHolder.this.getWindow();
                ViewTreeObserver viewTreeObserver = window2.getDecorView().getViewTreeObserver();
                onGlobalLayoutListener = ReturnTextAreaButtonViewHolder.this.onGlobalLayoutListener;
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                returnTextAreaButtonView = ReturnTextAreaButtonViewHolder.this.returnTextAreaButtonView;
                returnTextAreaButtonView.getTextAreaView().requestFocus();
            }
        };
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(defaultLifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMaxLines(int maxRows) {
        if (this.returnTextAreaButtonView.getTextAreaView().getMaxLines() == maxRows) {
            return;
        }
        TextAreaView textAreaView = this.returnTextAreaButtonView.getTextAreaView();
        textAreaView.setMaxLines(maxRows);
        textAreaView.post(this.callback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnTextAreaButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnTextAreaButtonView returnTextAreaButtonView = this.returnTextAreaButtonView;
        TextAreaViewBinderKt.bind(returnTextAreaButtonView.getTextAreaView(), item.getTextArea());
        ButtonV3HolderKt.bind(returnTextAreaButtonView.getButton(), item.getButton(), new ReturnTextAreaButtonViewHolder$bind$1$1(this));
    }
}
