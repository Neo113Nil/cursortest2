package ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import YJ.e;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import eF.C6328c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.databinding.PdpWidgetWholesaleInputButtonBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00014\b\u0001\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001HB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010-\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u001fR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonWidgetViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetWholesaleInputButtonBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "setupSuccessState", "()V", "view", "findBottomSheet", "(Landroid/view/View;)Landroid/view/View;", "onAttach", "onDetach", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup;", "composerContainer$delegate", "LSc/j;", "getComposerContainer", "()Landroid/view/ViewGroup;", "composerContainer", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "afterMailTo", "Z", "ru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonWidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonWidgetViewHolder$lifecycleObserver$1;", "isErrorState", "", "rvScrollPositionX", "I", "rvScrollOffset", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "scrollRunnable", "Ljava/lang/Runnable;", "currentCount", "Ljava/lang/Integer;", "bottomSheetView", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WholesaleInputButtonWidgetViewHolder extends BindingWidgetViewHolder<WholesaleInputButtonVO, PdpWidgetWholesaleInputButtonBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean afterMailTo;
    private View bottomSheetView;

    /* renamed from: composerContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composerContainer;

    @NotNull
    private final View containerView;
    private Integer currentCount;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    @NotNull
    private final Handler handler;
    private boolean isErrorState;

    @NotNull
    private final WholesaleInputButtonWidgetViewHolder$lifecycleObserver$1 lifecycleObserver;
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;
    private int rvScrollOffset;
    private int rvScrollPositionX;

    @NotNull
    private final Runnable scrollRunnable;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetWholesaleInputButtonBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetWholesaleInputButtonBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetWholesaleInputButtonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetWholesaleInputButtonBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetWholesaleInputButtonBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholesaleInputButton/presentation/WholesaleInputButtonWidgetViewHolder$Companion;", "", "<init>", "()V", "MAIL_TO_PLACEHOLDER", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v11, types: [ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder$lifecycleObserver$1] */
    public WholesaleInputButtonWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new WholesaleInputButtonWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.composerContainer = DelegatesKt.lazyUnsafe(new WholesaleInputButtonWidgetViewHolder$composerContainer$2(this));
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        this.recyclerView = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerViewOrNull(view);
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                boolean z11;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                z11 = WholesaleInputButtonWidgetViewHolder.this.afterMailTo;
                if (z11) {
                    WholesaleInputButtonWidgetViewHolder.this.afterMailTo = false;
                    composerReferences = WholesaleInputButtonWidgetViewHolder.this.refs;
                    composerReferences.getNavigator().popBackStack();
                }
            }
        };
        this.handler = new Handler(Looper.getMainLooper());
        this.scrollRunnable = new e(this, 3);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: eF.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WholesaleInputButtonWidgetViewHolder.globalLayoutListener$lambda$1(WholesaleInputButtonWidgetViewHolder.this);
            }
        };
        final PdpWidgetWholesaleInputButtonBinding binding = getBinding();
        binding.textInput.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: eF.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                WholesaleInputButtonWidgetViewHolder.lambda$6$lambda$2(PdpWidgetWholesaleInputButtonBinding.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        TextAreaView textInput = binding.textInput;
        Intrinsics.checkNotNullExpressionValue(textInput, "textInput");
        int childCount = textInput.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = textInput.getChildAt(i11);
            if (childAt instanceof OzonTextInput) {
                OzonTextInput ozonTextInput = (OzonTextInput) childAt;
                ozonTextInput.setInputType(2);
                ozonTextInput.setOnEditorActionListener(new C6328c(binding, 0));
                RecyclerView recyclerView = this.recyclerView;
                this.rvScrollPositionX = recyclerView != null ? recyclerView.getScrollX() : 0;
                ((TextView) childAt).addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation.WholesaleInputButtonWidgetViewHolder$lambda$6$lambda$5$$inlined$doOnTextChanged$1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s11) {
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                        boolean z11;
                        PdpWidgetWholesaleInputButtonBinding binding2;
                        PdpWidgetWholesaleInputButtonBinding binding3;
                        PdpWidgetWholesaleInputButtonBinding binding4;
                        Handler handler;
                        Runnable runnable;
                        WholesaleInputButtonVO wholesaleInputButtonVO = (WholesaleInputButtonVO) WholesaleInputButtonWidgetViewHolder.this.getBoundData();
                        if (wholesaleInputButtonVO == null) {
                            return;
                        }
                        boolean z12 = (text == null || text.length() == 0 || !StringExtKt.isDigital(text.toString())) ? false : true;
                        if (!z12 || Long.parseLong(text.toString()) >= wholesaleInputButtonVO.getTextInput().getMinCount()) {
                            if (z12 && Long.parseLong(text.toString()) > 2147483647L) {
                                WholesaleInputButtonWidgetViewHolder.this.currentCount = Integer.MAX_VALUE;
                                binding.textInput.setInputText("2147483647");
                                WholesaleInputButtonWidgetViewHolder.this.setupSuccessState();
                                return;
                            } else if (z12) {
                                WholesaleInputButtonWidgetViewHolder.this.currentCount = Integer.valueOf(Integer.parseInt(text.toString()));
                                WholesaleInputButtonWidgetViewHolder.this.setupSuccessState();
                                return;
                            } else {
                                WholesaleInputButtonWidgetViewHolder.this.currentCount = null;
                                WholesaleInputButtonWidgetViewHolder.this.setupSuccessState();
                                return;
                            }
                        }
                        WholesaleInputButtonWidgetViewHolder.this.currentCount = null;
                        z11 = WholesaleInputButtonWidgetViewHolder.this.isErrorState;
                        if (z11) {
                            return;
                        }
                        WholesaleInputButtonWidgetViewHolder.this.isErrorState = true;
                        binding2 = WholesaleInputButtonWidgetViewHolder.this.getBinding();
                        binding2.textInput.setStatus(TextAreaView.Status.ERROR);
                        binding3 = WholesaleInputButtonWidgetViewHolder.this.getBinding();
                        binding3.textInput.setCaption(wholesaleInputButtonVO.getTextInput().getErrorText());
                        binding4 = WholesaleInputButtonWidgetViewHolder.this.getBinding();
                        binding4.textInput.setCaptionColor(StyleParser.INSTANCE.parseColor(WholesaleInputButtonWidgetViewHolder.this.getContext(), UniColors.TEXT_NEGATIVE.getToken()));
                        WholesaleInputButtonWidgetViewHolder.this.rvScrollOffset = Dimens.INSTANCE.getDP_22();
                        handler = WholesaleInputButtonWidgetViewHolder.this.handler;
                        runnable = WholesaleInputButtonWidgetViewHolder.this.scrollRunnable;
                        handler.post(runnable);
                    }
                });
            }
        }
    }

    private final View findBottomSheet(View view) {
        Object obj;
        Iterator it = kotlin.sequences.l.h(kotlin.sequences.l.q(view.getParent(), WholesaleInputButtonWidgetViewHolder$findBottomSheet$1.INSTANCE), WholesaleInputButtonWidgetViewHolder$findBottomSheet$$inlined$filterIsInstance$1.INSTANCE).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            if (((View) obj).getId() == R.id.design_bottom_sheet) {
                break;
            }
        }
        return (View) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getComposerContainer() {
        return (ViewGroup) this.composerContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void globalLayoutListener$lambda$1(WholesaleInputButtonWidgetViewHolder wholesaleInputButtonWidgetViewHolder) {
        C5353y0 n11;
        View view = wholesaleInputButtonWidgetViewHolder.bottomSheetView;
        if (view == null || (n11 = Y.n(wholesaleInputButtonWidgetViewHolder.itemView)) == null) {
            return;
        }
        int i11 = n11.f(8).f42129d - n11.g(2).f42129d;
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 == 0) {
            if (view.getTranslationY() == 0.0f) {
                return;
            }
            view.setTranslationY(0.0f);
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        wholesaleInputButtonWidgetViewHolder.itemView.getLocationInWindow(iArr2);
        int height = (view.getHeight() + iArr[1]) - (wholesaleInputButtonWidgetViewHolder.itemView.getHeight() + iArr2[1]);
        if (height < 0) {
            height = 0;
        }
        float f7 = -((i11 - height) + ((int) (16 * wholesaleInputButtonWidgetViewHolder.itemView.getResources().getDisplayMetrics().density)) >= 0 ? r2 : 0);
        if (view.getTranslationY() == f7) {
            return;
        }
        view.setTranslationY(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$2(PdpWidgetWholesaleInputButtonBinding pdpWidgetWholesaleInputButtonBinding, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (pdpWidgetWholesaleInputButtonBinding.textInput.getState() == TextAreaView.State.DEFAULT) {
            pdpWidgetWholesaleInputButtonBinding.textInput.setStatus(TextAreaView.Status.NEUTRAL);
            TextAreaView textInput = pdpWidgetWholesaleInputButtonBinding.textInput;
            Intrinsics.checkNotNullExpressionValue(textInput, "textInput");
            KeyboardUtilsKt.hideKeyboard(textInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$6$lambda$5$lambda$3(PdpWidgetWholesaleInputButtonBinding pdpWidgetWholesaleInputButtonBinding, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        TextAreaView textInput = pdpWidgetWholesaleInputButtonBinding.textInput;
        Intrinsics.checkNotNullExpressionValue(textInput, "textInput");
        KeyboardUtilsKt.hideKeyboard(textInput);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollRunnable$lambda$0(WholesaleInputButtonWidgetViewHolder wholesaleInputButtonWidgetViewHolder) {
        RecyclerView recyclerView = wholesaleInputButtonWidgetViewHolder.recyclerView;
        if (recyclerView != null) {
            recyclerView.smoothScrollBy(0, wholesaleInputButtonWidgetViewHolder.rvScrollPositionX + wholesaleInputButtonWidgetViewHolder.rvScrollOffset, new LinearInterpolator());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupSuccessState() {
        if (this.isErrorState) {
            this.isErrorState = false;
            getBinding().textInput.setStatus(TextAreaView.Status.SUCCESS);
            getBinding().textInput.setCaption(null);
            this.rvScrollOffset = -Dimens.INSTANCE.getDP_22();
            this.handler.post(this.scrollRunnable);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.bottomSheetView = findBottomSheet(itemView);
        this.itemView.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
        this.handler.removeCallbacks(this.scrollRunnable);
        this.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        View view = this.bottomSheetView;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        this.bottomSheetView = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WholesaleInputButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PdpWidgetWholesaleInputButtonBinding binding = getBinding();
        binding.textInput.setLabel(item.getTextInput().getHintText());
        binding.textInput.setHasInfoIcon(false);
        ButtonV3View buttonV3V = getBinding().buttonV3V;
        Intrinsics.checkNotNullExpressionValue(buttonV3V, "buttonV3V");
        ButtonV3HolderKt.bind(buttonV3V, item.getButton(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull WholesaleInputButtonVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
