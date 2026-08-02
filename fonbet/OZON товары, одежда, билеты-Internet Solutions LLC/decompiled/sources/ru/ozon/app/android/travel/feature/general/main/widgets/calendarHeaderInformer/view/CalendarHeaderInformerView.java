package ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.presentation.CalendarHeaderInformerVI;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/view/CalendarHeaderInformerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "cachedSettings", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "horizontalLinearLayout", "textTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTextTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "badgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeBV$delegate", "disclaimerDV", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "getDisclaimerDV", "()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "disclaimerDV$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/presentation/CalendarHeaderInformerVI;", "bindSettings", "settings", "updatePaddings", "setupRoot", "addViews", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarHeaderInformerView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(CalendarHeaderInformerView.class, "textTAV", "getTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(CalendarHeaderInformerView.class, "badgeBV", "getBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(CalendarHeaderInformerView.class, "disclaimerDV", "getDisclaimerDV()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", 0)};
    public static final int $stable = 8;

    /* renamed from: badgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeBV;
    private TravelWidgetSettingsVO cachedSettings;

    /* renamed from: disclaimerDV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate disclaimerDV;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final LinearLayout horizontalLinearLayout;

    /* renamed from: textTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate textTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarHeaderInformerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dsProvider = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        this.horizontalLinearLayout = linearLayout;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.textTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$1(this), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.badgeBV = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$3(this), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.disclaimerDV = new PreCreationViewPoolDelegate(context4, N.b(DisclaimerView.class), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$5(this), new CalendarHeaderInformerView$special$$inlined$preCreationViewPool$default$6(this));
        setupRoot();
        addViews();
    }

    private final void addViews() {
        this.horizontalLinearLayout.addView(getTextTAV());
        this.horizontalLinearLayout.addView(getBadgeBV());
        addView(this.horizontalLinearLayout);
        addView(getDisclaimerDV());
    }

    private final void bindSettings(TravelWidgetSettingsVO settings) {
        if (Intrinsics.d(this.cachedSettings, settings)) {
            return;
        }
        TravelWidgetSettingsExtKt.safeUpdateBackground$default(this, settings, this.cachedSettings, 0, 4, null);
        updatePaddings(settings);
        this.cachedSettings = settings;
    }

    private final BadgeView getBadgeBV() {
        return (BadgeView) this.badgeBV.getValue(this, $$delegatedProperties[1]);
    }

    private final DisclaimerView getDisclaimerDV() {
        return (DisclaimerView) this.disclaimerDV.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getTextTAV() {
        return (TextAtomV2View) this.textTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupRoot() {
        setOrientation(1);
    }

    private final void updatePaddings(TravelWidgetSettingsVO settings) {
        TravelWidgetSettingsVO.PaddingsVO paddings = settings.getPaddings();
        setPadding(paddings.getLeftPadding(), paddings.getTopPadding(), paddings.getRightPadding(), paddings.getBottomPadding());
    }

    public final void bind(@NotNull CalendarHeaderInformerVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getTextTAV(), item.getText(), null, 2, null);
        BadgeHolderKt.bind$default(getBadgeBV(), item.getBadge(), (Function1) null, 2, (Object) null);
        DSDisclaimerHolderKt.bindOrGone$default(getDisclaimerDV(), item.getDisclaimer(), null, 2, null);
        bindSettings(item.getSettings());
    }
}
