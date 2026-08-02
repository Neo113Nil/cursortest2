package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import Sc.o;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core.OrderDonePaymentStatusViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.TimerState;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.csma.preload.PreloadCache;
import ru.ozon.app.android.csma.preload.PreloadEntry;
import ru.ozon.app.android.orderdone.R$plurals;
import ru.ozon.app.android.orderdone.R$raw;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDonePaymentStatusBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u000f*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u001fJ\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u001fJ\u001f\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J'\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b3\u00107J)\u0010<\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDonePaymentStatusBinding;", "binding", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/csma/preload/PreloadCache;", "preloadCache", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDonePaymentStatusBinding;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/csma/preload/PreloadCache;)V", "", "icon", "", "bindIcon", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "subtitle", "bindSubtitle", "(Ljava/util/List;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;", DynamicElementDTO.TIMER, "bindTimer", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;)V", "hideTimer", "()V", "", "isProcessing", "setProcessing", "(Ljava/lang/Boolean;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "startProcessingAnimation", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState;", "state", "handleTimerState", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState;)V", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState$Tick;", "tickTimer", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState$Tick;)V", "stopTimer", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDonePaymentStatusBinding;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/csma/preload/PreloadCache;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroidx/appcompat/widget/AppCompatTextView;", "maxSizedTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDonePaymentStatusViewHolder extends k<OrderDonePaymentStatusVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetOrderDonePaymentStatusBinding binding;

    @NotNull
    private final AppCompatTextView maxSizedTextView;

    @NotNull
    private final PreloadCache preloadCache;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final OrderDonePaymentStatusViewModel viewModel;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.values().length];
            try {
                iArr[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.TIMER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDonePaymentStatusViewHolder(@NotNull WidgetOrderDonePaymentStatusBinding binding, @NotNull OrderDonePaymentStatusViewModel viewModel, @NotNull ComposerReferences refs, @NotNull PreloadCache preloadCache) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(preloadCache, "preloadCache");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.refs = refs;
        this.preloadCache = preloadCache;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.maxSizedTextView = appCompatTextView;
        binding.subtitleHal.setDecorator(new OrderDonePaymentStatusSubtitlesAtomDecorator(getContext()));
        binding.subtitleHal.setAdapter(atomsAdapter);
        binding.getConstraintLayout().addView(appCompatTextView);
        ViewExtKt.gone(appCompatTextView);
    }

    private final void bindIcon(final String icon) {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv, icon);
        if (icon == null) {
            return;
        }
        final ImageView iconIv2 = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        G.a(iconIv2, new Runnable() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.OrderDonePaymentStatusViewHolder$bindIcon$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                PreloadCache preloadCache;
                View view = iconIv2;
                if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                    return;
                }
                preloadCache = this.preloadCache;
                preloadCache.add(new PreloadEntry(icon, view.getWidth(), view.getHeight()));
            }
        });
    }

    private final void bindSubtitle(List<TextAtom> subtitle) {
        if (subtitle.isEmpty()) {
            HorizontalFlexAtomsLayout subtitleHal = this.binding.subtitleHal;
            Intrinsics.checkNotNullExpressionValue(subtitleHal, "subtitleHal");
            ViewExtKt.gone(subtitleHal);
            TextAtomView subtitleTav = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            ViewExtKt.gone(subtitleTav);
            return;
        }
        if (subtitle.size() == 1) {
            TextAtomView subtitleTav2 = this.binding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
            TextAtomHolderKt.bindOrGone(subtitleTav2, (TextAtom) C7714v.M(subtitle), this.actionHandler);
            HorizontalFlexAtomsLayout subtitleHal2 = this.binding.subtitleHal;
            Intrinsics.checkNotNullExpressionValue(subtitleHal2, "subtitleHal");
            ViewExtKt.gone(subtitleHal2);
            return;
        }
        HorizontalFlexAtomsLayout subtitleHal3 = this.binding.subtitleHal;
        Intrinsics.checkNotNullExpressionValue(subtitleHal3, "subtitleHal");
        ViewExtKt.show(subtitleHal3);
        this.atomsAdapter.bind(getContext(), subtitle);
        TextAtomView subtitleTav3 = this.binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav3, "subtitleTav");
        ViewExtKt.gone(subtitleTav3);
    }

    private final void bindTimer(Timer timer) {
        TextAtomView textAtomView = this.binding.timerTv;
        Intrinsics.f(textAtomView);
        ViewExtKt.show(textAtomView);
        TextAtomHolderKt.bind(textAtomView, timer.getTextAtom(), this.actionHandler);
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(timer.getTextAtom().getTextStyle());
        this.maxSizedTextView.setTextAppearance(parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Body_M_Black);
        Long valueOf = Long.valueOf(timer.getTimerStopsAt());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.viewModel.startTimer(valueOf.longValue());
        }
    }

    private final void bindTitle(TextAtom title) {
        TextAtomView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bind(titleTav, title, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTimerState(TimerState state) {
        if (state instanceof TimerState.Tick) {
            tickTimer((TimerState.Tick) state);
        } else {
            if (!(state instanceof TimerState.Stop)) {
                throw new o();
            }
            stopTimer();
        }
    }

    private final void hideTimer() {
        TextAtomView timerTv = this.binding.timerTv;
        Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
        ViewExtKt.gone(timerTv);
        this.viewModel.stopTimer();
    }

    private final void setProcessing(Boolean isProcessing) {
        WidgetOrderDonePaymentStatusBinding widgetOrderDonePaymentStatusBinding = this.binding;
        boolean booleanValue = isProcessing != null ? isProcessing.booleanValue() : false;
        ImageView iconIv = widgetOrderDonePaymentStatusBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.showOrGone(iconIv, Boolean.valueOf(!booleanValue));
        LottieAnimationView lottieAnimationView = widgetOrderDonePaymentStatusBinding.processingAnimationLav;
        Intrinsics.f(lottieAnimationView);
        ViewExtKt.showOrGone(lottieAnimationView, Boolean.valueOf(booleanValue));
        if (booleanValue) {
            startProcessingAnimation(lottieAnimationView);
        } else {
            lottieAnimationView.clearAnimation();
        }
    }

    private final void startProcessingAnimation(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.setAnimation(R$raw.processing_animation);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
    }

    private final void stopTimer() {
        TextAtomView timerTv = this.binding.timerTv;
        Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
        ViewExtKt.gone(timerTv);
        InterfaceC7851b.a.a(this.refs.getController(), null, null, null, null, 15);
    }

    private final void tickTimer(TimerState.Tick state) {
        String quantityString;
        TextAtomView textAtomView = this.binding.timerTv;
        if (state instanceof TimerState.Tick.Time) {
            quantityString = ((TimerState.Tick.Time) state).getTime();
        } else {
            if (!(state instanceof TimerState.Tick.Days)) {
                throw new o();
            }
            TimerState.Tick.Days days = (TimerState.Tick.Days) state;
            quantityString = StringProvider.getQuantityString(R$plurals.timer_days, days.getDays(), Integer.valueOf(days.getDays()));
        }
        textAtomView.setText(quantityString);
        AppCompatTextView appCompatTextView = this.maxSizedTextView;
        ArrayList arrayList = new ArrayList(quantityString.length());
        for (int i11 = 0; i11 < quantityString.length(); i11++) {
            char charAt = quantityString.charAt(i11);
            if (charAt != ':') {
                charAt = '0';
            }
            arrayList.add(Character.valueOf(charAt));
        }
        appCompatTextView.setText(C7714v.V(arrayList, "", null, null, null, 62));
        this.maxSizedTextView.measure(0, 0);
        textAtomView.setWidth(this.maxSizedTextView.getMeasuredWidth());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getTimerState().observe(this, new OrderDonePaymentStatusViewHolder$sam$androidx_lifecycle_Observer$0(new OrderDonePaymentStatusViewHolder$onAttach$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderDonePaymentStatusVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDonePaymentStatusVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDonePaymentStatusVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            bindIcon(item.getIcon());
            bindTitle(item.getTitle());
            bindSubtitle(item.getSubtitle());
            Timer timer = item.getTimer();
            if (timer != null) {
                bindTimer(timer);
            } else {
                hideTimer();
            }
            setProcessing(item.getIsProcessing());
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((OrderDonePaymentStatusViewMapper.OrderDonePaymentStatusPayloads) it.next()).ordinal()];
            if (i11 == 1) {
                bindIcon(item.getIcon());
            } else if (i11 == 2) {
                bindTitle(item.getTitle());
            } else if (i11 == 3) {
                bindSubtitle(item.getSubtitle());
            } else if (i11 == 4) {
                Timer timer2 = item.getTimer();
                if (timer2 != null) {
                    bindTimer(timer2);
                } else {
                    hideTimer();
                }
            } else if (i11 == 5) {
                setProcessing(item.getIsProcessing());
            } else {
                throw new o();
            }
        }
    }
}
