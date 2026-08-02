package ru.ozon.app.android.travel.molecules.view.starsBlock;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001b\u0010'\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;", "paddings", "", "bindPadding", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$CornersVO;", "corners", "bindCornerRadius", "(Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$CornersVO;)V", "", "background", "setBackgroundContainer", "(Ljava/lang/String;)V", "setConstraints", "()V", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "createLayoutParamsForText", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "item", "bind", "(Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "titlePrefixTav$delegate", "getTitlePrefixTav", "titlePrefixTav", "subTitleTav$delegate", "getSubTitleTav", "subTitleTav", "Lru/ozon/uni/android/atom/icon/IconView;", "iconIv$delegate", "getIconIv", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconIv", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "boundedData", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StarsBalanceView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StarsBalanceView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(StarsBalanceView.class, "titlePrefixTav", "getTitlePrefixTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(StarsBalanceView.class, "subTitleTav", "getSubTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(StarsBalanceView.class, "iconIv", "getIconIv()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private StarsBalanceMoleculeVI boundedData;

    /* renamed from: iconIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconIv;

    /* renamed from: subTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subTitleTav;

    /* renamed from: titlePrefixTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titlePrefixTav;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarsBalanceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new StarsBalanceView$special$$inlined$preCreationViewPool$default$1(this), new StarsBalanceView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titlePrefixTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new StarsBalanceView$special$$inlined$preCreationViewPool$default$3(this), new StarsBalanceView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.subTitleTav = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new StarsBalanceView$special$$inlined$preCreationViewPool$default$5(this), new StarsBalanceView$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.iconIv = new PreCreationViewPoolDelegate(context5, N.b(IconView.class), new StarsBalanceView$special$$inlined$preCreationViewPool$default$7(this), new StarsBalanceView$special$$inlined$preCreationViewPool$default$8());
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setId(View.generateViewId());
        addView(getTitlePrefixTav());
        addView(getTitleTav());
        addView(getSubTitleTav());
        addView(getIconIv());
        setBackground(gradientDrawable);
        setConstraints();
    }

    private final void bindCornerRadius(TravelWidgetSettingsVO.CornersVO corners) {
        if (corners != null) {
            this.backgroundDrawable.setCornerRadii(new float[]{corners.getTopRadius(), corners.getTopRadius(), corners.getTopRadius(), corners.getTopRadius(), corners.getBottomRadius(), corners.getBottomRadius(), corners.getBottomRadius(), corners.getBottomRadius()});
        } else {
            this.backgroundDrawable.setCornerRadius(0.0f);
        }
    }

    private final void bindPadding(TravelWidgetSettingsVO.PaddingsVO paddings) {
        if (paddings != null) {
            setPadding(paddings.getLeftPadding(), paddings.getTopPadding(), paddings.getRightPadding(), paddings.getBottomPadding());
        } else {
            setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstraintLayout.b createLayoutParamsForText() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        return bVar;
    }

    private final IconView getIconIv() {
        return (IconView) this.iconIv.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomV2View getSubTitleTav() {
        return (TextAtomV2View) this.subTitleTav.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getTitlePrefixTav() {
        return (TextAtomV2View) this.titlePrefixTav.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setBackgroundContainer(String background) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, background);
        this.backgroundDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
    }

    private final void setConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, getTitlePrefixTav().getId(), 0, 0, 4, null);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitlePrefixTav(), getTitleTav());
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getTitlePrefixTav(), getTitleTav());
        dVar.d0(getTitlePrefixTav().getId(), 2);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getTitleTav(), getTitlePrefixTav());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitleTav(), getIconIv());
        ConstraintSetExtKt.topToTop$default(dVar, getTitleTav().getId(), 0, 0, 4, null);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getIconIv(), getTitleTav());
        ConstraintSetExtKt.endToEnd$default(dVar, getIconIv().getId(), 0, 0, 4, null);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getIconIv(), getTitleTav());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getIconIv(), getTitleTav());
        ConstraintSetExtKt.startToStart$default(dVar, getSubTitleTav().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, getSubTitleTav().getId(), 0, 0, 4, null);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSubTitleTav(), getTitleTav());
        dVar.f(this);
    }

    public final void bind(@NotNull StarsBalanceMoleculeVI item) {
        TravelWidgetSettingsVO settings;
        TravelWidgetSettingsVO settings2;
        TravelWidgetSettingsVO settings3;
        Intrinsics.checkNotNullParameter(item, "item");
        TextDTO title = item.getTitle();
        StarsBalanceMoleculeVI starsBalanceMoleculeVI = this.boundedData;
        if (!Intrinsics.d(title, starsBalanceMoleculeVI != null ? starsBalanceMoleculeVI.getTitle() : null)) {
            TextHolderKt.bindOrGone$default(getTitleTav(), item.getTitle(), null, 2, null);
        }
        TextDTO subtitle = item.getSubtitle();
        StarsBalanceMoleculeVI starsBalanceMoleculeVI2 = this.boundedData;
        if (!Intrinsics.d(subtitle, starsBalanceMoleculeVI2 != null ? starsBalanceMoleculeVI2.getSubtitle() : null)) {
            TextHolderKt.bindOrGone$default(getSubTitleTav(), item.getSubtitle(), null, 2, null);
        }
        TextDTO titlePrefix = item.getTitlePrefix();
        StarsBalanceMoleculeVI starsBalanceMoleculeVI3 = this.boundedData;
        if (!Intrinsics.d(titlePrefix, starsBalanceMoleculeVI3 != null ? starsBalanceMoleculeVI3.getTitlePrefix() : null)) {
            TextHolderKt.bindOrGone$default(getTitlePrefixTav(), item.getTitlePrefix(), null, 2, null);
        }
        IconDTO icon = item.getIcon();
        StarsBalanceMoleculeVI starsBalanceMoleculeVI4 = this.boundedData;
        if (!Intrinsics.d(icon, starsBalanceMoleculeVI4 != null ? starsBalanceMoleculeVI4.getIcon() : null)) {
            IconHolderKt.bindOrGone$default(getIconIv(), item.getIcon(), null, 2, null);
        }
        TravelWidgetSettingsVO settings4 = item.getSettings();
        TravelWidgetSettingsVO.PaddingsVO paddings = settings4 != null ? settings4.getPaddings() : null;
        StarsBalanceMoleculeVI starsBalanceMoleculeVI5 = this.boundedData;
        if (!Intrinsics.d(paddings, (starsBalanceMoleculeVI5 == null || (settings3 = starsBalanceMoleculeVI5.getSettings()) == null) ? null : settings3.getPaddings())) {
            TravelWidgetSettingsVO settings5 = item.getSettings();
            bindPadding(settings5 != null ? settings5.getPaddings() : null);
        }
        TravelWidgetSettingsVO settings6 = item.getSettings();
        TravelWidgetSettingsVO.CornersVO corners = settings6 != null ? settings6.getCorners() : null;
        StarsBalanceMoleculeVI starsBalanceMoleculeVI6 = this.boundedData;
        if (!Intrinsics.d(corners, (starsBalanceMoleculeVI6 == null || (settings2 = starsBalanceMoleculeVI6.getSettings()) == null) ? null : settings2.getCorners())) {
            TravelWidgetSettingsVO settings7 = item.getSettings();
            bindCornerRadius(settings7 != null ? settings7.getCorners() : null);
        }
        TravelWidgetSettingsVO settings8 = item.getSettings();
        String backgroundColor = settings8 != null ? settings8.getBackgroundColor() : null;
        StarsBalanceMoleculeVI starsBalanceMoleculeVI7 = this.boundedData;
        if (!Intrinsics.d(backgroundColor, (starsBalanceMoleculeVI7 == null || (settings = starsBalanceMoleculeVI7.getSettings()) == null) ? null : settings.getBackgroundColor())) {
            TravelWidgetSettingsVO settings9 = item.getSettings();
            setBackgroundContainer(settings9 != null ? settings9.getBackgroundColor() : null);
        }
        this.boundedData = item;
    }
}
