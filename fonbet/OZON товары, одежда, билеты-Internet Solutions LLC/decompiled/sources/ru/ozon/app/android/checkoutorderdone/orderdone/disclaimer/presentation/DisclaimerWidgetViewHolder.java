package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation;

import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.J;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data.TimerPosition;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneDisclaimerBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b'\u0010&J)\u0010-\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010H\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/DisclaimerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneDisclaimerBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneDisclaimerBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;", "icon", "", "bindIcon", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneDisclaimerBinding;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTimer", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "timerText", "onTick", "(Ljava/lang/String;)V", "updateSubtitle", "updateTimer", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;Ll20/d;)V", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneDisclaimerBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroid/graphics/drawable/GradientDrawable;", "background", "Landroid/graphics/drawable/GradientDrawable;", "", "timerColor", "Ljava/lang/Integer;", "timerTextStyle", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel;", "getViewModel", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel;", "viewModel", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerWidgetViewHolder extends k<OrderDoneDisclaimerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable background;

    @NotNull
    private final WidgetOrderDoneDisclaimerBinding binding;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final ComposerReferences refs;
    private Integer timerColor;
    private Integer timerTextStyle;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimerPosition.values().length];
            try {
                iArr[TimerPosition.SUBTITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimerPosition.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DisclaimerWidgetViewHolder(@NotNull WidgetOrderDoneDisclaimerBinding binding, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.createAndPayViewModel = createAndPayViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).onClick(new DisclaimerWidgetViewHolder$actionHandler$1(this)).customActionHandlers(new DisclaimerWidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.buttonsAdapter = atomsAdapter;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(16));
        this.background = gradientDrawable;
        binding.buttonsHfal.setAdapter(atomsAdapter);
        binding.disclaimerV.setBackground(gradientDrawable);
    }

    private final void bindIcon(WidgetOrderDoneDisclaimerBinding widgetOrderDoneDisclaimerBinding, IconVO iconVO) {
        AppCompatImageView appCompatImageView = widgetOrderDoneDisclaimerBinding.iconIv;
        Intrinsics.f(appCompatImageView);
        ImageViewExtKt.load$default(appCompatImageView, iconVO.getIcon(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, iconVO.getTintColor()));
    }

    private final void bindTimer(TimerVO timer, TextAtom title) {
        if (timer == null) {
            AppCompatTextView timerTv = this.binding.timerTv;
            Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
            ViewExtKt.gone(timerTv);
            getViewModel().stopTimer();
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        this.timerColor = styleParser.parseColor(getContext(), timer.getTextColor());
        this.timerTextStyle = styleParser.parseTextStyle(timer.getTextStyle());
        if (timer.getPosition() == TimerPosition.TITLE) {
            WidgetOrderDoneDisclaimerBinding widgetOrderDoneDisclaimerBinding = this.binding;
            AppCompatTextView appCompatTextView = widgetOrderDoneDisclaimerBinding.timerTv;
            Integer num = this.timerColor;
            appCompatTextView.setTextColor(num != null ? num.intValue() : widgetOrderDoneDisclaimerBinding.titleTav.getCurrentTextColor());
            Integer parseTextStyle = styleParser.parseTextStyle(timer.getTextStyle());
            if (parseTextStyle == null) {
                parseTextStyle = styleParser.parseTextStyle(title != null ? title.getTextStyle() : null);
            }
            if (parseTextStyle != null) {
                widgetOrderDoneDisclaimerBinding.timerTv.setTextAppearance(parseTextStyle.intValue());
            }
        }
        getViewModel().startTimer(timer.getDeadline());
    }

    private final OrderDoneDisclaimerViewModel getViewModel() {
        InterfaceC6786a widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            return (OrderDoneDisclaimerViewModel) widgetViewModel;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(String timerText) {
        TimerVO timer;
        OrderDoneDisclaimerVO boundData = getBoundData();
        if (boundData == null || (timer = boundData.getTimer()) == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[timer.getPosition().ordinal()];
        if (i11 == 1) {
            updateSubtitle(timerText);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            updateTimer(timerText);
        }
    }

    private final void updateSubtitle(String timerText) {
        TextAtom subtitle;
        OrderDoneDisclaimerVO boundData = getBoundData();
        if (boundData == null || (subtitle = boundData.getSubtitle()) == null) {
            return;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        Integer num = this.timerTextStyle;
        if (num != null) {
            int intValue = num.intValue();
            StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ofText$default.read(context, intValue);
            ofText$default.apply(appCompatTextView);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        spannableStringBuilder.append((CharSequence) subtitle.getText());
        spannableStringBuilder.append((CharSequence) " ");
        Integer num2 = this.timerColor;
        if (num2 != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(num2.intValue());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(timerText, new CustomTypefaceSpan(appCompatTextView.getTypeface()), 33);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        } else {
            spannableStringBuilder.append(timerText, new CustomTypefaceSpan(appCompatTextView.getTypeface()), 33);
        }
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(new SpannedString(spannableStringBuilder));
        TextAtomView subtitleTav = this.binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextAtomHolderKt.bind(subtitleTav, TextAtom.copy$default(subtitle, ozonSpannableString, null, null, null, null, null, null, 126, null), this.actionHandler);
    }

    private final void updateTimer(String timerText) {
        AppCompatTextView appCompatTextView = this.binding.timerTv;
        appCompatTextView.setText(timerText);
        ViewExtKt.show(appCompatTextView);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        getViewModel().getTimer().observe(lifecycle, new DisclaimerWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new DisclaimerWidgetViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        getViewModel().stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDoneDisclaimerVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderDoneDisclaimerBinding widgetOrderDoneDisclaimerBinding = this.binding;
        bindIcon(widgetOrderDoneDisclaimerBinding, item.getIcon());
        TextAtomView titleTav = widgetOrderDoneDisclaimerBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bindOrGone(titleTav, item.getTitle(), this.actionHandler);
        TextAtomView subtitleTav = widgetOrderDoneDisclaimerBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextAtomHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        this.buttonsAdapter.bind(getContext(), item.getButtons());
        HorizontalFlexAtomsLayout buttonsHfal = widgetOrderDoneDisclaimerBinding.buttonsHfal;
        Intrinsics.checkNotNullExpressionValue(buttonsHfal, "buttonsHfal");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(buttonsHfal, Boolean.valueOf(!item.getButtons().isEmpty()));
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor());
        if (parseColor != null) {
            this.background.setColor(parseColor.intValue());
        }
        bindTimer(item.getTimer(), item.getTitle());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderDoneDisclaimerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DisclaimerWidgetViewHolder) item, trackingData, viewedPond);
        t trackingEvent = item.getTrackingEvent();
        if (trackingEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingEvent, null, 2, null);
        }
    }
}
