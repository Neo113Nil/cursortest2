package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input;

import B90.a0;
import E0.RunnableC2934m;
import N9.c;
import Sc.InterfaceC4008j;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.Layout;
import android.text.Selection;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5316f0;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.search.widgets.feedbackForm.utils.KeyboardVisibilityObserver;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u00016\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/android/textArea/TextAreaView;", "view", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/textArea/TextAreaView;Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;)V", "Landroidx/core/view/D;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnApplyWindowInsetsListenerToRootView", "(Landroidx/core/view/D;)V", "registerKeyboardVisibilityObserver", "()V", "unregisterKeyboardVisibilityObserver", "scrollToNewLine", "scrollToEnd", "openKeyboardForCustomOption", "updateWidgetLayoutParams", "onAttach", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/textArea/TextAreaView;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "Ljava/lang/Runnable;", "scrollToInputRunnable", "Ljava/lang/Runnable;", "scrollToEndRunnable", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "Lru/ozon/app/android/search/widgets/feedbackForm/utils/KeyboardVisibilityObserver;", "keyboardVisibilityObserver$delegate", "getKeyboardVisibilityObserver", "()Lru/ozon/app/android/search/widgets/feedbackForm/utils/KeyboardVisibilityObserver;", "keyboardVisibilityObserver", "insetsListener", "Landroidx/core/view/D;", "ru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2ViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2ViewHolder$lifecycleObserver$1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackInputV2ViewHolder extends k<FeedbackInputV2VO> {
    private RecyclerView composerRecyclerView;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;

    @NotNull
    private final D insetsListener;

    /* renamed from: keyboardVisibilityObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j keyboardVisibilityObserver;

    @NotNull
    private final FeedbackInputV2ViewHolder$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final ComposerReferences refs;
    private Runnable scrollToEndRunnable;
    private Runnable scrollToInputRunnable;

    @NotNull
    private final TextAreaView view;

    @NotNull
    private final FeedbackFormV2ViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int BOTTOM_MARGIN = ResourceExtKt.toPx(8);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int TOP_PADDING = ResourceExtKt.toPx(4);
    private static final int LINE_HEIGHT = ResourceExtKt.toPx(10);

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
        AnonymousClass1() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return Unit.f71690a;
        }

        public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
            FeedbackFormV2DTO.OptionDTO.OptionType optionType;
            InputV2Model input;
            FeedbackInputV2VO boundData = FeedbackInputV2ViewHolder.this.getBoundData();
            if (boundData == null || (input = boundData.getInput()) == null || (optionType = input.getOptionType()) == null) {
                optionType = FeedbackFormV2DTO.OptionDTO.OptionType.INVALID;
            }
            FeedbackInputV2ViewHolder.this.viewModel.saveInputText(String.valueOf(charSequence));
            if (optionType == FeedbackFormV2DTO.OptionDTO.OptionType.CUSTOM) {
                FeedbackInputV2ViewHolder.this.openKeyboardForCustomOption();
                FeedbackInputV2ViewHolder.this.viewModel.updateButtonState(!(charSequence == null || charSequence.length() == 0));
            }
            FeedbackInputV2ViewHolder.this.scrollToNewLine();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2ViewHolder$Companion;", "", "<init>", "()V", "BOTTOM_MARGIN", "", "getBOTTOM_MARGIN", "()I", "HORIZONTAL_MARGIN", "getHORIZONTAL_MARGIN", "TOP_PADDING", "LINE_HEIGHT", "MAX_LENGTH", "MAX_ROWS", "SCROLL_DELAY", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBOTTOM_MARGIN() {
            return FeedbackInputV2ViewHolder.BOTTOM_MARGIN;
        }

        public final int getHORIZONTAL_MARGIN() {
            return FeedbackInputV2ViewHolder.HORIZONTAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.lifecycle.I, ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder$lifecycleObserver$1] */
    public FeedbackInputV2ViewHolder(@NotNull ComposerReferences refs, @NotNull TextAreaView view, @NotNull FeedbackFormV2ViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.view = view;
        this.viewModel = viewModel;
        this.handler = Sc.k.b(FeedbackInputV2ViewHolder$handler$2.INSTANCE);
        this.keyboardVisibilityObserver = Sc.k.b(FeedbackInputV2ViewHolder$keyboardVisibilityObserver$2.INSTANCE);
        this.insetsListener = new a0(this, 6);
        ?? r52 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                composerReferences = FeedbackInputV2ViewHolder.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
                FeedbackInputV2ViewHolder.this.composerRecyclerView = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                ComposerReferences composerReferences;
                View view2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                FeedbackInputV2ViewHolder feedbackInputV2ViewHolder = FeedbackInputV2ViewHolder.this;
                composerReferences = feedbackInputV2ViewHolder.refs;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                feedbackInputV2ViewHolder.composerRecyclerView = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2);
            }
        };
        this.lifecycleObserver = r52;
        TextAreaView.INSTANCE.doOnTextChanged(view, new AnonymousClass1());
        refs.getContainer().g().getLifecycle().a(r52);
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    private final KeyboardVisibilityObserver getKeyboardVisibilityObserver() {
        return (KeyboardVisibilityObserver) this.keyboardVisibilityObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$0(FeedbackInputV2ViewHolder feedbackInputV2ViewHolder, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (insets.p(8)) {
            feedbackInputV2ViewHolder.scrollToEnd();
        }
        return Y.u(view, insets);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openKeyboardForCustomOption() {
        ComponentCallbacksC5392m c11;
        OzonTextInput ozonTextInput = (OzonTextInput) l.l(l.h(C5316f0.b(this.view), FeedbackInputV2ViewHolder$openKeyboardForCustomOption$$inlined$filterIsInstance$1.INSTANCE));
        if (ozonTextInput == null || (c11 = this.refs.getContainer().c()) == null) {
            return;
        }
        KeyboardUtilsKt.showKeyboard(c11, ozonTextInput);
    }

    private final void registerKeyboardVisibilityObserver() {
        ViewGroup rootView;
        View findViewById;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (findViewById = rootView.findViewById(R$id.design_bottom_sheet)) == null) {
            return;
        }
        getKeyboardVisibilityObserver().setListener(findViewById, new FeedbackInputV2ViewHolder$registerKeyboardVisibilityObserver$1$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToEnd() {
        c cVar = new c(this, 4);
        getHandler().postDelayed(cVar, 100L);
        this.scrollToEndRunnable = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToEnd$lambda$11(FeedbackInputV2ViewHolder feedbackInputV2ViewHolder) {
        RecyclerView recyclerView = feedbackInputV2ViewHolder.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollBy(0, Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToNewLine() {
        OzonTextInput ozonTextInput = (OzonTextInput) l.l(l.h(C5316f0.b(this.view), FeedbackInputV2ViewHolder$scrollToNewLine$$inlined$filterIsInstance$1.INSTANCE));
        if (ozonTextInput != null) {
            Rect rect = new Rect();
            ozonTextInput.getGlobalVisibleRect(rect);
            Layout layout = ozonTextInput.getLayout();
            if (layout != null) {
                int height = (rect.bottom - ozonTextInput.getHeight()) - layout.getLineBaseline(layout.getLineForOffset(Selection.getSelectionStart(ozonTextInput.getText())));
                if (height <= 0 || ozonTextInput.getLineCount() > ozonTextInput.getMaxLines()) {
                    return;
                }
                RunnableC2934m runnableC2934m = new RunnableC2934m(height, 1, this);
                getHandler().postDelayed(runnableC2934m, 100L);
                this.scrollToInputRunnable = runnableC2934m;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToNewLine$lambda$10$lambda$9$lambda$7(FeedbackInputV2ViewHolder feedbackInputV2ViewHolder, int i11) {
        RecyclerView recyclerView = feedbackInputV2ViewHolder.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollBy(0, i11 + LINE_HEIGHT);
        }
    }

    private final void setOnApplyWindowInsetsListenerToRootView(D listener) {
        ViewGroup rootView;
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        Y.J(rootView, listener);
    }

    private final void unregisterKeyboardVisibilityObserver() {
        getKeyboardVisibilityObserver().clear();
    }

    private final void updateWidgetLayoutParams() {
        TextAreaView textAreaView = this.view;
        if (textAreaView.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = textAreaView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = 0;
            marginLayoutParams.bottomMargin = -BOTTOM_MARGIN;
            textAreaView.setLayoutParams(marginLayoutParams);
            return;
        }
        textAreaView.setPadding(0, -TOP_PADDING, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = textAreaView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.height = -2;
        marginLayoutParams2.bottomMargin = BOTTOM_MARGIN;
        textAreaView.setLayoutParams(marginLayoutParams2);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        if (Build.VERSION.SDK_INT <= 29) {
            registerKeyboardVisibilityObserver();
        } else {
            setOnApplyWindowInsetsListenerToRootView(this.insetsListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        if (Build.VERSION.SDK_INT <= 29) {
            unregisterKeyboardVisibilityObserver();
        } else {
            setOnApplyWindowInsetsListenerToRootView(null);
        }
        Runnable runnable = this.scrollToInputRunnable;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
        }
        Runnable runnable2 = this.scrollToEndRunnable;
        if (runnable2 != null) {
            getHandler().removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackInputV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAreaView textAreaView = this.view;
        textAreaView.setVisibility(this.viewModel.isCellSelected() && item.getInput().getLabel() != null ? 0 : 8);
        textAreaView.setLabel(item.getInput().getLabel());
        updateWidgetLayoutParams();
        Integer maxLength = item.getInput().getMaxLength();
        textAreaView.setMaxLength(maxLength != null ? maxLength.intValue() : CounterView.COUNTER_MAX_DEFAULT);
        Boolean scrollBar = item.getInput().getScrollBar();
        textAreaView.setScrollbarEnabled(scrollBar != null ? scrollBar.booleanValue() : false);
        textAreaView.setInputText(this.viewModel.getInputText());
        if (!this.viewModel.isCellSelected()) {
            ViewExtKt.hideKeyboard(textAreaView);
        }
        Integer rows = item.getInput().getRows();
        textAreaView.setMaxLines(rows != null ? rows.intValue() : 15);
        textAreaView.setHasInfoIcon(false);
    }
}
