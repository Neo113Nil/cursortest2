package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import AD.b;
import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.W;
import j10.h;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment;
import ru.ozon.app.android.datePicker.DatePickerViewModel;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.databinding.AdultConfirmationWidgetLayoutBinding;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.UserAdultModalDTO;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewHolder;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.AdultConfirmationAction;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.UserAdultModalVO;
import ru.ozon.app.android.storefront.navBar.RefreshNavBarWidgetUpdateKey;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u0012*\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u0012*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010,\u001a\u00020\u00122\n\u0010+\u001a\u00060)j\u0002`*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b0\u0010\u0014J\u0015\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u001d¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00120@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewHolder;", "", "Lru/ozon/app/android/session/databinding/AdultConfirmationWidgetLayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/datePicker/DatePickerViewModel;", "datePickerViewModel", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewModel;", "adultConfirmationViewModel", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "<init>", "(Lru/ozon/app/android/session/databinding/AdultConfirmationWidgetLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/datePicker/DatePickerViewModel;Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewModel;Lj10/h;)V", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;", "vo", "", "bindButton", "(Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "", "birthday", "switchEnabledByBirthday", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Ljava/lang/CharSequence;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "", "voId", "Landroid/view/View;", "clickHolderView", "setupUrlSpan", "(Lru/ozon/uni/atoms/data/texts/TextAtom;JLandroid/view/View;)V", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "input", "bindInput", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;)V", "", "errorText", "showInputError", "(Ljava/lang/String;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "openDatePickerFragment", "(La00/f;)V", "hideLoader", "()V", "bind", "bottomBorder", "updateButtonBottomMargin", "(Landroid/view/View;)V", "Lru/ozon/app/android/session/databinding/AdultConfirmationWidgetLayoutBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/datePicker/DatePickerViewModel;", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/AdultConfirmationViewModel;", "", "dp16", "I", "currentVO", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdultConfirmationViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultConfirmationViewModel adultConfirmationViewModel;

    @NotNull
    private final AdultConfirmationWidgetLayoutBinding binding;
    private UserAdultModalVO currentVO;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @NotNull
    private final DatePickerViewModel datePickerViewModel;
    private final int dp16;

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            AdultConfirmationViewHolder.this.binding.adultConfirmationInfo.setText(str);
            AdultConfirmationViewHolder.this.adultConfirmationViewModel.setBirthday(str);
            AdultConfirmationViewHolder adultConfirmationViewHolder = AdultConfirmationViewHolder.this;
            LargeButtonView adultConfirmationActionButton = adultConfirmationViewHolder.binding.adultConfirmationActionButton;
            Intrinsics.checkNotNullExpressionValue(adultConfirmationActionButton, "adultConfirmationActionButton");
            adultConfirmationViewHolder.switchEnabledByBirthday(adultConfirmationActionButton, AdultConfirmationViewHolder.this.binding.adultConfirmationInfo.getText());
        }
    }

    public AdultConfirmationViewHolder(@NotNull AdultConfirmationWidgetLayoutBinding binding, @NotNull ComposerReferences refs, @NotNull DatePickerViewModel datePickerViewModel, @NotNull AdultConfirmationViewModel adultConfirmationViewModel, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(datePickerViewModel, "datePickerViewModel");
        Intrinsics.checkNotNullParameter(adultConfirmationViewModel, "adultConfirmationViewModel");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.binding = binding;
        this.refs = refs;
        this.datePickerViewModel = datePickerViewModel;
        this.adultConfirmationViewModel = adultConfirmationViewModel;
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dp16 = ResourceExtKt.toPx(16, context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        this.dateFormat = simpleDateFormat;
        this.actionHandler = new ActionHandler.Builder(refs, voHelper, UserAdultModalVO.class).onClick(new AdultConfirmationViewHolder$actionHandler$1(this)).onComposerAction(new AdultConfirmationViewHolder$actionHandler$2(this)).buildHandler();
        adultConfirmationViewModel.setDateFormat(simpleDateFormat);
        datePickerViewModel.observeDateByFormat(simpleDateFormat).observe(refs.getContainer().g(), new AdultConfirmationViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        adultConfirmationViewModel.getAction().observe(refs.getContainer().g(), new W() { // from class: KJ.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                AdultConfirmationViewHolder._init_$lambda$0(AdultConfirmationViewHolder.this, (AdultConfirmationAction) obj);
            }
        });
        binding.inputContainer.setOnClickListener(new b(this, 3));
        binding.adultConfirmationInputLayout.setOnClickListener(new JG.b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AdultConfirmationViewHolder adultConfirmationViewHolder, AdultConfirmationAction adultConfirmationAction) {
        ViewGroup rootView;
        if (adultConfirmationAction instanceof AdultConfirmationAction.Back) {
            adultConfirmationViewHolder.refs.getNavigator().popBackStack();
            return;
        }
        if (adultConfirmationAction instanceof AdultConfirmationAction.ShowLoader) {
            FrameLayout constraintLayout = adultConfirmationViewHolder.binding.progressBar.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.show(constraintLayout);
            return;
        }
        if (adultConfirmationAction instanceof AdultConfirmationAction.HideLoader) {
            adultConfirmationViewHolder.hideLoader();
            return;
        }
        if (adultConfirmationAction instanceof AdultConfirmationAction.Refresh) {
            AdultConfirmationAction.Refresh refresh = (AdultConfirmationAction.Refresh) adultConfirmationAction;
            InterfaceC7851b.a.a(adultConfirmationViewHolder.refs.getController(), refresh.getLink(), refresh.getPostParams(), null, null, 12);
            return;
        }
        if (adultConfirmationAction instanceof AdultConfirmationAction.ShowErrorState) {
            String message = ((AdultConfirmationAction.ShowErrorState) adultConfirmationAction).getMessage();
            if (message == null) {
                return;
            }
            adultConfirmationViewHolder.showInputError(message);
            return;
        }
        if (!(adultConfirmationAction instanceof AdultConfirmationAction.ShowErrorNotification)) {
            throw new o();
        }
        r a11 = adultConfirmationViewHolder.refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, StringProvider.getString(R$string.common_message_request_problem), null, null, null, null, adultConfirmationViewHolder.refs.getContainer().g(), 60, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AdultConfirmationViewHolder adultConfirmationViewHolder, View view) {
        adultConfirmationViewHolder.openDatePickerFragment(adultConfirmationViewHolder.refs.getContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AdultConfirmationViewHolder adultConfirmationViewHolder, View view) {
        adultConfirmationViewHolder.binding.inputContainer.callOnClick();
    }

    private final void bindButton(UserAdultModalVO vo) {
        AdultConfirmationWidgetLayoutBinding adultConfirmationWidgetLayoutBinding = this.binding;
        LargeButtonView adultConfirmationActionButton = adultConfirmationWidgetLayoutBinding.adultConfirmationActionButton;
        Intrinsics.checkNotNullExpressionValue(adultConfirmationActionButton, "adultConfirmationActionButton");
        LargeButtonHolderKt.bind(adultConfirmationActionButton, vo.getButton(), this.actionHandler);
        LargeButtonView adultConfirmationActionButton2 = adultConfirmationWidgetLayoutBinding.adultConfirmationActionButton;
        Intrinsics.checkNotNullExpressionValue(adultConfirmationActionButton2, "adultConfirmationActionButton");
        switchEnabledByBirthday(adultConfirmationActionButton2, adultConfirmationWidgetLayoutBinding.adultConfirmationInfo.getText());
    }

    private final void bindInput(UserAdultModalDTO.Input input) {
        AdultConfirmationWidgetLayoutBinding adultConfirmationWidgetLayoutBinding = this.binding;
        if (input == null) {
            LinearLayout inputContainer = adultConfirmationWidgetLayoutBinding.inputContainer;
            Intrinsics.checkNotNullExpressionValue(inputContainer, "inputContainer");
            ViewExtKt.gone(inputContainer);
            return;
        }
        LinearLayout inputContainer2 = adultConfirmationWidgetLayoutBinding.inputContainer;
        Intrinsics.checkNotNullExpressionValue(inputContainer2, "inputContainer");
        ViewExtKt.show(inputContainer2);
        TextView adultInputError = adultConfirmationWidgetLayoutBinding.adultInputError;
        Intrinsics.checkNotNullExpressionValue(adultInputError, "adultInputError");
        ViewExtKt.gone(adultInputError);
        adultConfirmationWidgetLayoutBinding.adultConfirmationInputLayout.setHint(input.getPlaceholder());
        TextView textView = adultConfirmationWidgetLayoutBinding.adultConfirmationInfo;
        String birthday = this.adultConfirmationViewModel.getBirthday();
        if (birthday == null) {
            birthday = input.getValue();
        }
        textView.setText(birthday);
    }

    private final void hideLoader() {
        FrameLayout constraintLayout = this.binding.progressBar.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
    }

    private final void openDatePickerFragment(C4911f container) {
        String str;
        DatePickerViewModel datePickerViewModel = this.datePickerViewModel;
        CharSequence text = this.binding.adultConfirmationInfo.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        DatePickerDialogFragment.INSTANCE.newInstance(datePickerViewModel.mapDateToDatePickerFormat(str, this.dateFormat)).show(container.k(), "DatePickerDialogFragment");
    }

    private final void setupUrlSpan(TextAtom textAtom, long j11, View view) {
        OzonUrlSpan.INSTANCE.setOnUrlSpanClick(textAtom.getText(), view, new AdultConfirmationViewHolder$setupUrlSpan$1(textAtom, j11, this));
    }

    private final void showInputError(String errorText) {
        AdultConfirmationWidgetLayoutBinding adultConfirmationWidgetLayoutBinding = this.binding;
        adultConfirmationWidgetLayoutBinding.adultConfirmationInputLayout.setShowError(true);
        adultConfirmationWidgetLayoutBinding.adultInputError.setText(errorText);
        TextView adultInputError = adultConfirmationWidgetLayoutBinding.adultInputError;
        Intrinsics.checkNotNullExpressionValue(adultInputError, "adultInputError");
        ViewExtKt.show(adultInputError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchEnabledByBirthday(LargeButtonView largeButtonView, CharSequence charSequence) {
        if (charSequence == null || kotlin.text.h.K(charSequence) || this.datePickerViewModel.mapDateToDatePickerFormatOrNull(charSequence.toString(), this.dateFormat) != null) {
            ViewExtKt.enable(largeButtonView);
        } else {
            ViewExtKt.disable(largeButtonView);
        }
    }

    public final void bind(@NotNull UserAdultModalVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        hideLoader();
        if (!Intrinsics.d(this.currentVO, vo)) {
            this.refs.getController().update(RefreshNavBarWidgetUpdateKey.INSTANCE);
        }
        this.currentVO = vo;
        AdultConfirmationWidgetLayoutBinding adultConfirmationWidgetLayoutBinding = this.binding;
        TextAtom subtitle = vo.getSubtitle();
        long id2 = vo.getId();
        TextAtomView topText = adultConfirmationWidgetLayoutBinding.topText;
        Intrinsics.checkNotNullExpressionValue(topText, "topText");
        setupUrlSpan(subtitle, id2, topText);
        TextAtom termsOfUse = vo.getTermsOfUse();
        if (termsOfUse != null) {
            long id3 = vo.getId();
            TextAtomView termsOfUse2 = adultConfirmationWidgetLayoutBinding.termsOfUse;
            Intrinsics.checkNotNullExpressionValue(termsOfUse2, "termsOfUse");
            setupUrlSpan(termsOfUse, id3, termsOfUse2);
        }
        TextAtomView topText2 = adultConfirmationWidgetLayoutBinding.topText;
        Intrinsics.checkNotNullExpressionValue(topText2, "topText");
        TextAtomHolderKt.bind(topText2, vo.getSubtitle(), this.actionHandler);
        TextAtomView textAtomView = adultConfirmationWidgetLayoutBinding.topText;
        Context context = textAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textAtomView.setLinkTextColor(ThemeExtKt.themeColor(context, vo.getLinkTextColor()));
        TextAtomView termsOfUse3 = adultConfirmationWidgetLayoutBinding.termsOfUse;
        Intrinsics.checkNotNullExpressionValue(termsOfUse3, "termsOfUse");
        TextAtomHolderKt.bindOrGone(termsOfUse3, vo.getTermsOfUse(), this.actionHandler);
        TextAtomView textAtomView2 = adultConfirmationWidgetLayoutBinding.termsOfUse;
        Context context2 = adultConfirmationWidgetLayoutBinding.topText.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textAtomView2.setLinkTextColor(ThemeExtKt.themeColor(context2, vo.getLinkTextColor()));
        bindInput(vo.getInput());
        bindButton(vo);
    }

    public final void updateButtonBottomMargin(@NotNull View bottomBorder) {
        Intrinsics.checkNotNullParameter(bottomBorder, "bottomBorder");
        int i11 = (-((int) bottomBorder.getTranslationY())) + this.dp16;
        LargeButtonView adultConfirmationActionButton = this.binding.adultConfirmationActionButton;
        Intrinsics.checkNotNullExpressionValue(adultConfirmationActionButton, "adultConfirmationActionButton");
        ViewGroup.LayoutParams layoutParams = adultConfirmationActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i11;
        adultConfirmationActionButton.setLayoutParams(marginLayoutParams);
    }
}
