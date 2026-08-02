package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import Oz.ViewOnClickListenerC3716a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.DeliveryWidgetV2Binding;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020$¢\u0006\u0004\b\"\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2Binder;", "", "Lru/ozon/app/android/fresh/unsorted/databinding/DeliveryWidgetV2Binding;", "binding", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "processViewEvents", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/DeliveryWidgetV2Binding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "setIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "setTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "setSubtitle", "", "statusIcon", "statusIconColor", "statusCircleColor", "configureStatusIcon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;", "progress", "configureCircleProgressBar", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$ProgressVO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$OzonDeliveryVOWidget;", "state", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$OzonDeliveryVOWidget;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO$SellerVOWidget;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/DeliveryWidgetV2Binding;", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2Binder {

    @NotNull
    private final DeliveryWidgetV2Binding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onClick;

    @NotNull
    private final Function1<t, Unit> processViewEvents;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2Binder$Companion;", "", "<init>", "()V", "DEFAULT_PROGRESS_THICKNESS", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryWidgetV2Binder(@NotNull DeliveryWidgetV2Binding binding, @NotNull Function1<? super t, Unit> processViewEvents, @NotNull Function1<? super AtomAction, Unit> onClick) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(processViewEvents, "processViewEvents");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.binding = binding;
        this.processViewEvents = processViewEvents;
        this.onClick = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(DeliveryWidgetV2Binder deliveryWidgetV2Binder, DeliveryWidgetV2VO.OzonDeliveryVOWidget ozonDeliveryVOWidget, View view) {
        deliveryWidgetV2Binder.onClick.invoke(ozonDeliveryVOWidget.getOnWidgetClickAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(DeliveryWidgetV2Binder deliveryWidgetV2Binder, DeliveryWidgetV2VO.SellerVOWidget sellerVOWidget, View view) {
        deliveryWidgetV2Binder.onClick.invoke(sellerVOWidget.getOnWidgetClickAction());
    }

    private final void configureCircleProgressBar(DeliveryWidgetV2VO.ProgressVO progress) {
        CircleProgressView circleProgressView = this.binding.circleProgressBar;
        circleProgressView.setProgress(progress.getProgress());
        circleProgressView.setStrokeWidth(11.0f);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = circleProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String ringProgressColor = progress.getRingProgressColor();
        UniColors uniColors = UniColors.GRAPHIC_FRESH_INVERTED;
        circleProgressView.setRingProgressColor(styleParser.parseColor(context, ringProgressColor, uniColors.getResId()));
        Context context2 = circleProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        circleProgressView.setRingBackgroundColor(styleParser.parseColor(context2, progress.getRingBackgroundColor(), uniColors.getResId()));
        circleProgressView.setContentDescription(String.valueOf(progress.getProgress()));
    }

    private final void configureStatusIcon(String statusIcon, String statusIconColor, String statusCircleColor) {
        ImageView imageView = this.binding.statusIconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, statusIcon);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, statusIconColor));
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewExtKt.setBackgroundTint(imageView, styleParser.parseColor(context2, statusCircleColor, UniColors.GRAPHIC_FRESH_INVERTED.getResId()));
        imageView.setContentDescription(statusIcon);
    }

    private final void setIcon(Icon icon) {
        DeliveryWidgetV2Binding deliveryWidgetV2Binding = this.binding;
        if (icon == null) {
            ImageView iconIv = deliveryWidgetV2Binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ImageViewExtKt.clearResource(iconIv);
            return;
        }
        ImageView iconIv2 = deliveryWidgetV2Binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = deliveryWidgetV2Binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconIv2, styleParser.parseColor(context, icon.getTintColor()));
        ImageView iconIv3 = deliveryWidgetV2Binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv3, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv3, icon.getImage());
    }

    private final void setSubtitle(TextDTO text) {
        TextAtomV2View subtitleTextTvTv = this.binding.subtitleTextTvTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTextTvTv, "subtitleTextTvTv");
        TextHolderKt.bind$default(subtitleTextTvTv, text, null, 2, null);
    }

    private final void setTitle(TextDTO text) {
        TextAtomV2View titleTextTv = this.binding.titleTextTv;
        Intrinsics.checkNotNullExpressionValue(titleTextTv, "titleTextTv");
        TextHolderKt.bind$default(titleTextTv, text, null, 2, null);
    }

    public final void bind(@NotNull DeliveryWidgetV2VO.OzonDeliveryVOWidget state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setTitle(state.getTitle());
        setSubtitle(state.getSubtitle());
        configureStatusIcon(state.getStatusIcon(), state.getStatusIconColor(), state.getStatusCircleColor());
        configureCircleProgressBar(state.getProgress());
        setIcon(state.getInfoIcon());
        t tokenizedEvent = state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.processViewEvents.invoke(tokenizedEvent);
        }
        this.binding.deliveryWidgetV2.setOnClickListener(new FV.a(3, this, state));
        this.binding.titleTextTv.setTextIsSelectable(false);
        this.binding.subtitleTextTvTv.setTextIsSelectable(false);
        this.binding.deliveryWidgetV2.setContentDescription(state.getMethod().name());
    }

    public final void bind(@NotNull DeliveryWidgetV2VO.SellerVOWidget state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setTitle(state.getTitle());
        setSubtitle(state.getSubtitle());
        configureStatusIcon(state.getStatusIcon(), state.getStatusIconColor(), state.getStatusCircleColor());
        configureCircleProgressBar(state.getProgress());
        setIcon(state.getInfoIcon());
        t tokenizedEvent = state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.processViewEvents.invoke(tokenizedEvent);
        }
        this.binding.deliveryWidgetV2.setOnClickListener(new ViewOnClickListenerC3716a(1, this, state));
        this.binding.titleTextTv.setTextIsSelectable(false);
        this.binding.subtitleTextTvTv.setTextIsSelectable(false);
    }
}
