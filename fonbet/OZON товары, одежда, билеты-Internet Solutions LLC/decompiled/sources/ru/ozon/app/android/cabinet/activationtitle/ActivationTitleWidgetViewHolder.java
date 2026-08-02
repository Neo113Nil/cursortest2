package ru.ozon.app.android.cabinet.activationtitle;

import BS.a;
import Sc.InterfaceC4008j;
import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$string;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleWidgetViewHolder;
import ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel;
import ru.ozon.app.android.cabinet.databinding.WidgetActivationTitleBinding;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtils;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 H2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001HB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\"J#\u0010-\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00022\n\u0010,\u001a\u00060*j\u0002`+H\u0014¢\u0006\u0004\b-\u0010.R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010;\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010?R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel;", "viewModel", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "<init>", "(Landroid/view/View;La00/f;Ll10/b;Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;)V", "Landroid/widget/TextView;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindOrGone", "(Landroid/widget/TextView;Ljava/lang/String;)V", "text", "", "isError", "Landroidx/lifecycle/J;", "viewOwner", "showFlashbar", "(Ljava/lang/String;ZLandroidx/lifecycle/J;)V", "handleCodeActivationAction", "(Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel;)V", "setupButtonAppearance", "()V", "", "configureIconResource", "(Z)I", "configureIconTint", "(Z)Ljava/lang/String;", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleVO;Ll20/d;)V", "La00/f;", "Ll10/b;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Lru/ozon/app/android/cabinet/databinding/WidgetActivationTitleBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/WidgetActivationTitleBinding;", "Landroid/graphics/drawable/Drawable;", "bxButtonBGDrawable$delegate", "LSc/j;", "getBxButtonBGDrawable", "()Landroid/graphics/drawable/Drawable;", "bxButtonBGDrawable", "Landroid/graphics/drawable/GradientDrawable;", "selectButtonBGDrawable$delegate", "getSelectButtonBGDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "selectButtonBGDrawable", "bgSelectFlashBar$delegate", "getBgSelectFlashBar", "bgSelectFlashBar", "Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleVO;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "shownFlashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActivationTitleWidgetViewHolder extends k<ActivationTitleVO> {

    /* renamed from: bgSelectFlashBar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgSelectFlashBar;

    @NotNull
    private final WidgetActivationTitleBinding binding;

    @NotNull
    private final InterfaceC7851b bus;

    /* renamed from: bxButtonBGDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bxButtonBGDrawable;

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    @NotNull
    private final C4911f container;
    private ActivationTitleVO item;

    /* renamed from: selectButtonBGDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectButtonBGDrawable;
    private Flashbar shownFlashbar;

    @NotNull
    private final DiscountCodeViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float selectCornerRadius = UiExtKt.toPxF(32);
    private static final float bgSelectCornerRadius = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleWidgetViewHolder$Companion;", "", "<init>", "()V", "selectCornerRadius", "", "getSelectCornerRadius", "()F", "bgSelectCornerRadius", "getBgSelectCornerRadius", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBgSelectCornerRadius() {
            return ActivationTitleWidgetViewHolder.bgSelectCornerRadius;
        }

        public final float getSelectCornerRadius() {
            return ActivationTitleWidgetViewHolder.selectCornerRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationTitleWidgetViewHolder(@NotNull View containerView, @NotNull C4911f container, @NotNull InterfaceC7851b bus, @NotNull DiscountCodeViewModel viewModel, @NotNull CheckoutPrefetchController checkoutPrefetchController) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        this.container = container;
        this.bus = bus;
        this.viewModel = viewModel;
        this.checkoutPrefetchController = checkoutPrefetchController;
        WidgetActivationTitleBinding bind = WidgetActivationTitleBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.bxButtonBGDrawable = Sc.k.b(new ActivationTitleWidgetViewHolder$bxButtonBGDrawable$2(this));
        this.selectButtonBGDrawable = Sc.k.b(new ActivationTitleWidgetViewHolder$selectButtonBGDrawable$2(this));
        this.bgSelectFlashBar = Sc.k.b(new ActivationTitleWidgetViewHolder$bgSelectFlashBar$2(this));
        setupButtonAppearance();
        bind.valueEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Km.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = ActivationTitleWidgetViewHolder._init_$lambda$0(ActivationTitleWidgetViewHolder.this, textView, i11, keyEvent);
                return _init_$lambda$0;
            }
        });
        if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
            bind.titleTv.setTextAppearance(R$style.TextStyle_Body_XL_Bold);
        } else {
            bind.titleTv.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        activationTitleWidgetViewHolder.handleCodeActivationAction(activationTitleWidgetViewHolder.viewModel);
        return true;
    }

    private final void bindOrGone(TextView textView, String str) {
        if (str.length() == 0) {
            ViewExtKt.gone(textView);
        } else {
            ViewExtKt.show(textView);
            textView.setText(str);
        }
    }

    private final int configureIconResource(boolean isError) {
        return !isError ? R$drawable.ic_check_green : AppTokensProvider.INSTANCE.isSelect(getContext()) ? ru.ozon.uni.R$drawable.ic_m_exclamation_filled : R$drawable.ic_warning;
    }

    private final String configureIconTint(boolean isError) {
        String token = isError ? UniColors.GRAPHIC_WARNING_PRIMARY.getToken() : UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken();
        if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
            return token;
        }
        return null;
    }

    private final GradientDrawable getBgSelectFlashBar() {
        return (GradientDrawable) this.bgSelectFlashBar.getValue();
    }

    private final Drawable getBxButtonBGDrawable() {
        return (Drawable) this.bxButtonBGDrawable.getValue();
    }

    private final GradientDrawable getSelectButtonBGDrawable() {
        return (GradientDrawable) this.selectButtonBGDrawable.getValue();
    }

    private final void handleCodeActivationAction(DiscountCodeViewModel viewModel) {
        String obj = this.binding.valueEt.getText().toString();
        if (obj.length() == 0) {
            showFlashbar$default(this, StringProvider.getString(R$string.activation_title_discount_code_empty_android), false, this.container.g(), 2, null);
        } else {
            viewModel.applyDiscountCode(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$2(ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder, DiscountCodeViewModel.Action action) {
        if (!(action instanceof DiscountCodeViewModel.Action.Success)) {
            if (!(action instanceof DiscountCodeViewModel.Action.Error)) {
                throw new o();
            }
            showFlashbar$default(activationTitleWidgetViewHolder, ((DiscountCodeViewModel.Action.Error) action).getMessage(), false, activationTitleWidgetViewHolder.container.g(), 2, null);
            return;
        }
        r a11 = activationTitleWidgetViewHolder.container.a();
        if (a11 != null) {
            KeyboardUtils.INSTANCE.hideKeyboard(a11);
        }
        activationTitleWidgetViewHolder.showFlashbar(((DiscountCodeViewModel.Action.Success) action).getMessage(), false, activationTitleWidgetViewHolder.container.g());
        activationTitleWidgetViewHolder.viewModel.trackCodeAnalytic();
        activationTitleWidgetViewHolder.binding.valueEt.setText("");
        InterfaceC7851b.a.a(activationTitleWidgetViewHolder.bus, null, null, null, null, 15);
        activationTitleWidgetViewHolder.checkoutPrefetchController.removeAllCache();
    }

    private final void setupButtonAppearance() {
        Button button = this.binding.activationActionButton;
        button.setOnClickListener(new a(this, 2));
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!appTokensProvider.isSelect(context)) {
            button.setBackground(getBxButtonBGDrawable());
            return;
        }
        button.setBackground(getSelectButtonBGDrawable());
        Context context2 = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        button.setTextColor(ThemeExtKt.themeColor(context2, R$attr.textPrimaryInverted));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtonAppearance$lambda$9$lambda$8(ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder, View view) {
        activationTitleWidgetViewHolder.handleCodeActivationAction(activationTitleWidgetViewHolder.viewModel);
    }

    private final void showFlashbar(String text, boolean isError, J viewOwner) {
        OzonSpannableString ozonSpannableString;
        Flashbar flashbar = this.shownFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.container.a());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            if (text == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(text)) == null) {
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_common_message_service_error));
            }
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            int configureIconResource = configureIconResource(isError);
            String configureIconTint = configureIconTint(isError);
            GradientDrawable bgSelectFlashBar = getBgSelectFlashBar();
            if (!AppTokensProvider.INSTANCE.isSelect(getContext())) {
                bgSelectFlashBar = null;
            }
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString2, null, null, Integer.valueOf(configureIconResource), null, configureIconTint, null, null, bgSelectFlashBar, null, null, 6000L, null, null, viewOwner, 56154, null);
            this.shownFlashbar = create$default;
            create$default.show();
        }
    }

    static /* synthetic */ void showFlashbar$default(ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder, String str, boolean z11, J j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        activationTitleWidgetViewHolder.showFlashbar(str, z11, j11);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getSingleAction().observe(this, new W() { // from class: Km.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ActivationTitleWidgetViewHolder.onAttach$lambda$2(ActivationTitleWidgetViewHolder.this, (DiscountCodeViewModel.Action) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActivationTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetActivationTitleBinding widgetActivationTitleBinding = this.binding;
        TextView titleTv = widgetActivationTitleBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        bindOrGone(titleTv, item.getTitle());
        widgetActivationTitleBinding.valueTil.setHint(item.getPlaceholder());
        widgetActivationTitleBinding.activationActionButton.setText(item.getButtonTitle());
        TextView descriptionTv = widgetActivationTitleBinding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextViewExtKt.setTextOrGone(descriptionTv, item.getDescription());
        widgetActivationTitleBinding.valueEt.setText(item.getCode());
    }
}
