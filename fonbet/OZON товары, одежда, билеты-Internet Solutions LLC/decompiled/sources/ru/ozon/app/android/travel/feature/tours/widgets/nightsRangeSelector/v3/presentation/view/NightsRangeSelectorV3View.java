package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view;

import Am.C2438a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.NightsRangeSelectorV3Actions;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.NightsRangeSelectorV3VO;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ1\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u00109R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010;R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setConstraints", "setSeekbar", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3Actions;", "nightsRangeSelectorV3Actions", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3Actions;)V", "", "newText", "updateTagButtonText", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "newApplyButton", "updateApplyButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "dp4", "I", "dp16", "dp20", "dp55", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text", "subtitle$delegate", "getSubtitle", "subtitle", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "tagButton$delegate", "getTagButton", "()Lru/ozon/uni/android/controls/tag/TagButtonView;", "tagButton", "Landroid/view/View;", "sliderWithLabels$delegate", "LSc/j;", "getSliderWithLabels", "()Landroid/view/View;", "sliderWithLabels", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "applyButton$delegate", "getApplyButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "applyButton", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3Actions;", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class NightsRangeSelectorV3View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(NightsRangeSelectorV3View.class, "text", "getText()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(NightsRangeSelectorV3View.class, "subtitle", "getSubtitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(NightsRangeSelectorV3View.class, "tagButton", "getTagButton()Lru/ozon/uni/android/controls/tag/TagButtonView;", 0), C2438a.c(NightsRangeSelectorV3View.class, "applyButton", "getApplyButton()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;

    /* renamed from: applyButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate applyButton;
    private final int dp16;
    private final int dp20;
    private final int dp4;
    private final int dp55;
    private NightsRangeSelectorV3Actions nightsRangeSelectorV3Actions;
    private Function1<? super AtomAction, Unit> onAction;

    /* renamed from: sliderWithLabels$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sliderWithLabels;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitle;

    /* renamed from: tagButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate tagButton;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NightsRangeSelectorV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(Paddings.PADDING_200.getPx(), context);
        int px = UiExtKt.toPx(Paddings.PADDING_500.getPx(), context);
        this.dp16 = px;
        this.dp20 = UiExtKt.toPx(Paddings.PADDING_600.getPx(), context);
        this.dp55 = UiExtKt.toPx(55, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.text = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$1(this), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitle = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$3(this), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.tagButton = new PreCreationViewPoolDelegate(context4, N.b(TagButtonView.class), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$5(this), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$6(this));
        this.sliderWithLabels = LazyUtilsKt.unsafeLazy(new NightsRangeSelectorV3View$sliderWithLabels$2(context));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.applyButton = new PreCreationViewPoolDelegate(context5, N.b(ButtonV3View.class), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$7(this), new NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$8());
        addViews();
        setConstraints();
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setPadding(px, px, px, px);
        setSeekbar();
    }

    private final void addViews() {
        addView(getText());
        addView(getSubtitle());
        addView(getTagButton());
        addView(getSliderWithLabels());
        addView(getApplyButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getApplyButton() {
        return (ButtonV3View) this.applyButton.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getSliderWithLabels() {
        return (View) this.sliderWithLabels.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitle() {
        return (TextAtomV2View) this.subtitle.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagButtonView getTagButton() {
        return (TagButtonView) this.tagButton.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getText() {
        return (TextAtomV2View) this.text.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new NightsRangeSelectorV3View$setConstraints$1(this));
    }

    private final void setSeekbar() {
        KeyEvent.Callback sliderWithLabels = getSliderWithLabels();
        Intrinsics.g(sliderWithLabels, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour");
        SliderWithLabelsV2Behaviour sliderWithLabelsV2Behaviour = (SliderWithLabelsV2Behaviour) sliderWithLabels;
        sliderWithLabelsV2Behaviour.setOnValueChangedListener(new SliderWithLabelsV2Behaviour.OnValueChangeListener() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view.NightsRangeSelectorV3View$setSeekbar$1$1
            @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour.OnValueChangeListener
            public void valueChanged(int initialMinValue, int initialMaxValue) {
                NightsRangeSelectorV3Actions nightsRangeSelectorV3Actions;
                nightsRangeSelectorV3Actions = NightsRangeSelectorV3View.this.nightsRangeSelectorV3Actions;
                if (nightsRangeSelectorV3Actions != null) {
                    nightsRangeSelectorV3Actions.onSliderValueChanged(initialMinValue, initialMaxValue);
                }
            }
        });
        sliderWithLabelsV2Behaviour.setOnFinalValueChangedListener(new SliderWithLabelsV2Behaviour.OnFinalValueListener() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view.NightsRangeSelectorV3View$setSeekbar$1$2
            @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour.OnFinalValueListener
            public void finalValueChanged(int initialMinValue, int initialMaxValue) {
                NightsRangeSelectorV3Actions nightsRangeSelectorV3Actions;
                nightsRangeSelectorV3Actions = NightsRangeSelectorV3View.this.nightsRangeSelectorV3Actions;
                if (nightsRangeSelectorV3Actions != null) {
                    nightsRangeSelectorV3Actions.onSliderFinalValueChanged();
                }
            }
        });
    }

    public final void bind(@NotNull NightsRangeSelectorV3VO item, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull NightsRangeSelectorV3Actions nightsRangeSelectorV3Actions) {
        TestInfo testInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(nightsRangeSelectorV3Actions, "nightsRangeSelectorV3Actions");
        TextHolderKt.bind$default(getText(), item.getText(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitle(), item.getSubtitle(), null, 2, null);
        KeyEvent.Callback sliderWithLabels = getSliderWithLabels();
        Intrinsics.g(sliderWithLabels, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour");
        SliderWithLabelsV2Behaviour points = ((SliderWithLabelsV2Behaviour) sliderWithLabels).setMin(item.getSliderWithLabels().getMin()).setMax(item.getSliderWithLabels().getMax()).setStep(item.getSliderWithLabels().getStep()).setMaxRange(Integer.valueOf(item.getSliderWithLabels().getMaxRange())).setInitialRange(item.getSliderWithLabels().getInitialMinValue(), item.getSliderWithLabels().getInitialMaxValue()).setPoints(item.getSliderWithLabels().getPoints());
        CommonControlSettings common = item.getSliderWithLabels().getCommon();
        points.setAutomatizationId((common == null || (testInfo = common.getTestInfo()) == null) ? null : testInfo.getAutomatizationId());
        TagButtonHolderKt.bind$default(getTagButton(), item.getTagButton(), null, 2, null);
        ButtonV3HolderKt.bind(getApplyButton(), item.getApplyButton(), onAction);
        this.onAction = onAction;
        this.nightsRangeSelectorV3Actions = nightsRangeSelectorV3Actions;
    }

    public final void updateApplyButton(@NotNull ButtonV3DTO newApplyButton) {
        Intrinsics.checkNotNullParameter(newApplyButton, "newApplyButton");
        ButtonV3HolderKt.bind(getApplyButton(), newApplyButton, this.onAction);
    }

    public final void updateTagButtonText(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        getTagButton().setText(newText);
    }
}
