package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation;

import U7.d;
import W10.c;
import WZ.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetLargeOrdersLiftingV2Binding;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.FloorChangeResultModel;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.InputVO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.LargeOrdersLiftingV2VO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.OptionsBlockVO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.FloorInputFilter;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.KeyboardVisibilityHelper;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel.LargeOrdersLiftingV2ViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0015\u001a\u00020\u0010*\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010&J\u0013\u0010'\u001a\u00020\u0010*\u00020$H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J'\u00102\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b2\u00104J)\u00109\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00100@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/LargeOrdersLiftingV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "Lru/ozon/app/android/checkout/databinding/WidgetLargeOrdersLiftingV2Binding;", "binding", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/FloorInputFilter;", "floorInputFilter", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetLargeOrdersLiftingV2Binding;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/FloorInputFilter;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "updateUi", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;)V", "", "message", "showError", "(Ljava/lang/String;)V", "Landroid/widget/ImageView;", "", "visible", "animateVisibility", "(Landroid/widget/ImageView;Z)V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "input", "bindInput", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;)V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "optionsBlock", "bindOptionsBlock", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "errorText", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "colorToken", "", "defaultColor", "getColorByDsToken", "(Ljava/lang/String;I)I", "Ll20/d;", "info", "", "payload", "bind", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/checkout/databinding/WidgetLargeOrdersLiftingV2Binding;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/FloorInputFilter;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeOrdersLiftingV2ViewHolder extends k<LargeOrdersLiftingV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetLargeOrdersLiftingV2Binding binding;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    @NotNull
    private final FloorInputFilter floorInputFilter;

    @NotNull
    private final KeyboardVisibilityHelper keyboardVisibilityHelper;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final LargeOrdersLiftingV2ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float cellsContainerCornerRadius = UiExtKt.toPxF(16);
    private static final int dp8 = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorText", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            if (str == null || h.K(str)) {
                LargeOrdersLiftingV2ViewHolder largeOrdersLiftingV2ViewHolder = LargeOrdersLiftingV2ViewHolder.this;
                TextFieldCellView largeOrdersLiftingTF = largeOrdersLiftingV2ViewHolder.binding.largeOrdersLiftingTF;
                Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingTF, "largeOrdersLiftingTF");
                largeOrdersLiftingV2ViewHolder.hideError(largeOrdersLiftingTF);
                return;
            }
            LargeOrdersLiftingV2ViewHolder largeOrdersLiftingV2ViewHolder2 = LargeOrdersLiftingV2ViewHolder.this;
            TextFieldCellView largeOrdersLiftingTF2 = largeOrdersLiftingV2ViewHolder2.binding.largeOrdersLiftingTF;
            Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingTF2, "largeOrdersLiftingTF");
            largeOrdersLiftingV2ViewHolder2.showError(largeOrdersLiftingTF2, str);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/FloorChangeResultModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/FloorChangeResultModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<FloorChangeResultModel, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FloorChangeResultModel floorChangeResultModel) {
            invoke2(floorChangeResultModel);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FloorChangeResultModel floorChangeResultModel) {
            InterfaceC7851b.a.e(LargeOrdersLiftingV2ViewHolder.this.refs.getController(), floorChangeResultModel.getRefreshUrl(), null, floorChangeResultModel.getQueryParams(), 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction atomAction) {
            Function1 function1 = LargeOrdersLiftingV2ViewHolder.this.actionHandler;
            Intrinsics.f(atomAction);
            function1.invoke(atomAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            LargeOrdersLiftingV2ViewHolder largeOrdersLiftingV2ViewHolder = LargeOrdersLiftingV2ViewHolder.this;
            Intrinsics.f(str);
            largeOrdersLiftingV2ViewHolder.showError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/LargeOrdersLiftingV2ViewHolder$Companion;", "", "<init>", "()V", "", "dp8", "I", "getDp8", "()I", "", "ANIMATION_DURATION", "J", "", "ANIMATION_SHOW_ALPHA", "F", "ANIMATION_HIDE_ALPHA", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDp8() {
            return LargeOrdersLiftingV2ViewHolder.dp8;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LargeOrdersLiftingV2ViewHolder(@NotNull WidgetLargeOrdersLiftingV2Binding binding, @NotNull LargeOrdersLiftingV2ViewModel viewModel, @NotNull KeyboardVisibilityHelper keyboardVisibilityHelper, @NotNull FloorInputFilter floorInputFilter, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(keyboardVisibilityHelper, "keyboardVisibilityHelper");
        Intrinsics.checkNotNullParameter(floorInputFilter, "floorInputFilter");
        Intrinsics.checkNotNullParameter(refs, "refs");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.keyboardVisibilityHelper = keyboardVisibilityHelper;
        this.floorInputFilter = floorInputFilter;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onComposerAction(new LargeOrdersLiftingV2ViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.cellsAdapter = atomsAdapter;
        d.c(refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                LargeOrdersLiftingV2ViewHolder.this.keyboardVisibilityHelper.unregister(LargeOrdersLiftingV2ViewHolder.this.refs.getContainer().a());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                LargeOrdersLiftingV2ViewHolder.this.keyboardVisibilityHelper.register(LargeOrdersLiftingV2ViewHolder.this.refs.getContainer().a(), new LargeOrdersLiftingV2ViewHolder$1$onResume$1(LargeOrdersLiftingV2ViewHolder.this));
            }
        });
        binding.largeOrdersLiftingCellsContainer.setAdapter(atomsAdapter);
        TextFieldCellView textFieldCellView = binding.largeOrdersLiftingTF;
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600AccentEnd());
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(null);
        textFieldCellView.getMainView().getInputViewGroup().getInputView().setFilters(new FloorInputFilter[]{floorInputFilter});
        viewModel.getInputError().observe(refs.getContainer().g(), new LargeOrdersLiftingV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        viewModel.getFloorChange().observe(refs.getContainer().g(), new LargeOrdersLiftingV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass4()));
        viewModel.getConfirmAction().observe(refs.getContainer().g(), new LargeOrdersLiftingV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass5()));
        viewModel.getMessage().observe(refs.getContainer().g(), new LargeOrdersLiftingV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass6()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateVisibility(final ImageView imageView, final boolean z11) {
        if ((imageView.getVisibility() == 0) == z11) {
            return;
        }
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(500L).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$animateVisibility$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                LargeOrdersLiftingV2ViewHolder.Companion companion;
                int dp82;
                Intrinsics.checkNotNullParameter(animation, "animation");
                imageView.setVisibility(z11 ? 0 : 8);
                if (imageView.getVisibility() == 0) {
                    dp82 = 0;
                } else {
                    companion = LargeOrdersLiftingV2ViewHolder.Companion;
                    dp82 = companion.getDp8();
                }
                TextAtomV2View largeOrdersLiftingTitleTAV = this.binding.largeOrdersLiftingTitleTAV;
                Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingTitleTAV, "largeOrdersLiftingTitleTAV");
                ViewGroup.LayoutParams layoutParams = largeOrdersLiftingTitleTAV.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, dp82, 0, 0);
                largeOrdersLiftingTitleTAV.setLayoutParams(marginLayoutParams);
            }
        });
    }

    private final void bindInput(InputVO input) {
        TextFieldCellView textFieldCellView = this.binding.largeOrdersLiftingTF;
        textFieldCellView.setInputLabelText(input.getPlaceholder());
        String value = input.getValue();
        if (value == null) {
            value = "";
        }
        textFieldCellView.setInputText(value);
    }

    private final void bindOptionsBlock(OptionsBlockVO optionsBlock) {
        WidgetLargeOrdersLiftingV2Binding widgetLargeOrdersLiftingV2Binding = this.binding;
        AtomsAdapter atomsAdapter = this.cellsAdapter;
        Context context = widgetLargeOrdersLiftingV2Binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, optionsBlock.getOptions());
        VerticalAtomsLayout verticalAtomsLayout = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingCellsContainer;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(getColorByDsToken(optionsBlock.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        paintDrawable.setCornerRadius(cellsContainerCornerRadius);
        verticalAtomsLayout.setBackground(paintDrawable);
    }

    private final int getColorByDsToken(String colorToken, int defaultColor) {
        Integer mapColor = StyleParser.INSTANCE.mapColor(getContext(), colorToken);
        Context context = getContext();
        if (mapColor != null) {
            defaultColor = mapColor.intValue();
        }
        return a.getColor(context, defaultColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message) {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, null, this.refs.getContainer().g(), 58, null).show();
    }

    private final void updateUi(LargeOrdersLiftingV2VO item) {
        WidgetLargeOrdersLiftingV2Binding widgetLargeOrdersLiftingV2Binding = this.binding;
        Image largeOrdersLiftingIV = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingIV;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingIV, "largeOrdersLiftingIV");
        ImageHolderKt.bind$default(largeOrdersLiftingIV, item.getImage(), null, 2, null);
        TextAtomV2View largeOrdersLiftingTitleTAV = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingTitleTAV;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingTitleTAV, "largeOrdersLiftingTitleTAV");
        TextHolderKt.bind$default(largeOrdersLiftingTitleTAV, item.getTitle(), null, 2, null);
        TextAtomV2View largeOrdersLiftingSubtitleTAV = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingSubtitleTAV, "largeOrdersLiftingSubtitleTAV");
        TextHolderKt.bind$default(largeOrdersLiftingSubtitleTAV, item.getSubtitle(), null, 2, null);
        ButtonV3View largeOrdersLiftingConfirmBtn = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingConfirmBtn;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingConfirmBtn, "largeOrdersLiftingConfirmBtn");
        ButtonV3HolderKt.bind(largeOrdersLiftingConfirmBtn, item.getConfirmButton(), this.actionHandler);
        ButtonV3View largeOrdersLiftingCancelBtn = widgetLargeOrdersLiftingV2Binding.largeOrdersLiftingCancelBtn;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingCancelBtn, "largeOrdersLiftingCancelBtn");
        ButtonV3HolderKt.bind(largeOrdersLiftingCancelBtn, item.getCancelButton(), this.actionHandler);
        bindInput(item.getInput());
        bindOptionsBlock(item.getOptionsBlock());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull LargeOrdersLiftingV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((LargeOrdersLiftingV2ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LargeOrdersLiftingV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.setData(item);
        updateUi(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LargeOrdersLiftingV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.observeTextChange(Long.valueOf(item.getInput().getTextChangeActionDebounce()));
        this.viewModel.setData(item);
        updateUi(item);
        this.binding.largeOrdersLiftingTF.getMainView().getInputViewGroup().getInputView().addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewHolder$bind$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                LargeOrdersLiftingV2ViewModel largeOrdersLiftingV2ViewModel;
                largeOrdersLiftingV2ViewModel = LargeOrdersLiftingV2ViewHolder.this.viewModel;
                largeOrdersLiftingV2ViewModel.onFloorChange(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        textFieldCellView.setLabelText(str);
    }
}
