package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view;

import Am.C2438a;
import De.C2860c;
import FM.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter.AviaSearchResultV4BadgesAdapter;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0019\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u00122\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001b¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020'¢\u0006\u0004\b0\u0010*J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u000101¢\u0006\u0004\b6\u00104J\u0015\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010DR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010V\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010TR\u0014\u0010X\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010i\u001a\u0004\br\u0010sR\u001b\u0010w\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010i\u001a\u0004\bv\u0010sR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010zR\u001b\u0010~\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010i\u001a\u0004\b}\u0010sR\u001d\u0010\u0081\u0001\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010i\u001a\u0005\b\u0080\u0001\u0010k¨\u0006\u0082\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/action/BuildedActionHandler;", "bindActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "cardClickAction", "", "backgroundColor", "borderColor", "bindBackground", "(Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/String;)V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "isBadgesVisible", "bindBadges", "(Ljava/util/List;Z)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "premiumBadge", "bindPrice", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "luggageText", "bindLuggageText", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineIcons", "bindAirlineIcons", "(Ljava/util/List;)V", "airlinesText", "bindAirlineText", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "wayThereDetails", "bindThereDetails", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;)V", "wayBackDetails", "bindBackDetails", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getOnBoardingView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "additionalInfo", "bindOrGoneAdditionalInfo", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;)V", "bindAdditionalInfo", "addViews", "()V", "setConstraints", "setupRoot", "setupViews", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesAdapter;", "badgesAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "iconsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "dp2", "I", "dp4", "dp8", "dp12", "dp16", "", "dpf24", "F", "Lkotlin/Function0;", "onClick", "Lkotlin/jvm/functions/Function0;", "Landroid/graphics/drawable/GradientDrawable;", "flightBackground", "Landroid/graphics/drawable/GradientDrawable;", "Landroidx/recyclerview/widget/RecyclerView;", "badgesHFAL", "Landroidx/recyclerview/widget/RecyclerView;", "pricePAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "premiumBadgeBV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getPremiumBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "premiumBadgeBV", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "airlineIconsHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "luggageTextTAV$delegate", "getLuggageTextTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "luggageTextTAV", "airlinesTextTAV$delegate", "getAirlinesTextTAV", "airlinesTextTAV", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4TripRouteView;", "wayThereDetailsASRFL", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4TripRouteView;", "wayBackDetailsASRFL", "additionalInfoTextTAV$delegate", "getAdditionalInfoTextTAV", "additionalInfoTextTAV", "additionalInfoBadgeBV$delegate", "getAdditionalInfoBadgeBV", "additionalInfoBadgeBV", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4FlightView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaSearchResultV4FlightView.class, "premiumBadgeBV", "getPremiumBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(AviaSearchResultV4FlightView.class, "luggageTextTAV", "getLuggageTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaSearchResultV4FlightView.class, "airlinesTextTAV", "getAirlinesTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaSearchResultV4FlightView.class, "additionalInfoTextTAV", "getAdditionalInfoTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaSearchResultV4FlightView.class, "additionalInfoBadgeBV", "getAdditionalInfoBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    /* renamed from: additionalInfoBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalInfoBadgeBV;

    /* renamed from: additionalInfoTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalInfoTextTAV;

    @NotNull
    private final HorizontalAtomsLayout airlineIconsHAL;

    /* renamed from: airlinesTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate airlinesTextTAV;

    @NotNull
    private final AviaSearchResultV4BadgesAdapter badgesAdapter;

    @NotNull
    private final RecyclerView badgesHFAL;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final GradientDrawable flightBackground;

    @NotNull
    private final AtomsAdapter iconsAdapter;

    /* renamed from: luggageTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate luggageTextTAV;
    private Function1<? super AtomAction, Unit> onAction;
    private Function0<Unit> onClick;

    /* renamed from: premiumBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate premiumBadgeBV;

    @NotNull
    private final PriceAtomView pricePAV;

    @NotNull
    private final AviaSearchResultV4TripRouteView wayBackDetailsASRFL;

    @NotNull
    private final AviaSearchResultV4TripRouteView wayThereDetailsASRFL;

    public /* synthetic */ AviaSearchResultV4FlightView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.badgesHFAL);
        addView(this.pricePAV);
        addView(getPremiumBadgeBV());
        addView(this.airlineIconsHAL);
        addView(getLuggageTextTAV());
        addView(getAirlinesTextTAV());
        addView(this.wayThereDetailsASRFL);
        addView(this.wayBackDetailsASRFL);
        addView(getAdditionalInfoTextTAV());
        addView(getAdditionalInfoBadgeBV());
    }

    private final void bindAdditionalInfo(AviaSearchResultV4FlightVO.AdditionalInfo additionalInfo) {
        TextHolderKt.bindOrGone$default(getAdditionalInfoTextTAV(), additionalInfo.getText(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getAdditionalInfoBadgeBV(), additionalInfo.getBadge(), (Function1) null, 2, (Object) null);
        ViewGroup.LayoutParams layoutParams = getAdditionalInfoBadgeBV().getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || bVar.f41594A == additionalInfo.getOffsetXPx()) {
            return;
        }
        BadgeView additionalInfoBadgeBV = getAdditionalInfoBadgeBV();
        ViewGroup.LayoutParams layoutParams2 = additionalInfoBadgeBV.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41594A = additionalInfo.getOffsetXPx();
        additionalInfoBadgeBV.setLayoutParams(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getAdditionalInfoBadgeBV() {
        return (BadgeView) this.additionalInfoBadgeBV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getAdditionalInfoTextTAV() {
        return (TextAtomV2View) this.additionalInfoTextTAV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getAirlinesTextTAV() {
        return (TextAtomV2View) this.airlinesTextTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getLuggageTextTAV() {
        return (TextAtomV2View) this.luggageTextTAV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getPremiumBadgeBV() {
        return (BadgeView) this.premiumBadgeBV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaSearchResultV4FlightView$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(0, i11, 0, i11);
        setClickable(true);
        setOnClickListener(new a(this, 0));
        setBackground(this.flightBackground);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, UniColors.BG_ACTION_SECONDARY.getResId()), this.dpf24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$19(AviaSearchResultV4FlightView aviaSearchResultV4FlightView, View view) {
        Function0<Unit> function0 = aviaSearchResultV4FlightView.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void setupViews() {
        this.badgesHFAL.setAdapter(this.badgesAdapter);
        RecyclerView recyclerView = this.badgesHFAL;
        final Context context = getContext();
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView$setupViews$1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
            public List<c> getFlexLinesInternal() {
                List<c> flexLinesInternal = super.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                if (size > 1) {
                    flexLinesInternal.subList(1, size).clear();
                }
                return flexLinesInternal;
            }
        });
        this.airlineIconsHAL.setAdapter(this.iconsAdapter);
        HorizontalAtomsLayout horizontalAtomsLayout = this.airlineIconsHAL;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new AviaSearchResultV4AirlineIconsAtomsDecoration(context2));
        getLuggageTextTAV().setTextIsSelectable(false);
        getAirlinesTextTAV().setTextIsSelectable(false);
    }

    public final void bind(@NotNull AviaSearchResultV4FlightVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindActionHandler(actionHandler);
        bindBackground(actionHandler, item.getCardClickAction(), item.getBackgroundColor(), item.getBorderColor());
        bindBadges(item.getBadges(), item.getIsBadgesVisible());
        bindPrice(item.getPrice(), item.getPremiumBadge());
        bindLuggageText(item.getLuggageText());
        bindAirlineIcons(item.getAirlineIcons());
        bindAirlineText(item.getAirlinesText());
        bindThereDetails(item.getWayThereDetails());
        bindBackDetails(item.getWayBackDetails());
        bindOrGoneAdditionalInfo(item.getAdditionalInfo());
    }

    public final void bindActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.onAction = actionHandler;
    }

    public final void bindAirlineIcons(@NotNull List<IconDTO> airlineIcons) {
        Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
        AtomsAdapter atomsAdapter = this.iconsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, airlineIcons);
    }

    public final void bindAirlineText(@NotNull TextDTO airlinesText) {
        Intrinsics.checkNotNullParameter(airlinesText, "airlinesText");
        TextHolderKt.bind$default(getAirlinesTextTAV(), airlinesText, null, 2, null);
    }

    public final void bindBackDetails(AviaSearchResultV4FlightVO.TripRoute wayBackDetails) {
        this.wayBackDetailsASRFL.bindOrGone(wayBackDetails);
    }

    public final void bindBackground(Function1<? super AtomAction, Unit> actionHandler, @NotNull AtomAction cardClickAction, String backgroundColor, String borderColor) {
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        this.onClick = new AviaSearchResultV4FlightView$bindBackground$1(actionHandler, cardClickAction);
        GradientDrawable gradientDrawable = this.flightBackground;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, backgroundColor, UniColors.LAYER_FLOOR_1.getResId()));
        GradientDrawable gradientDrawable2 = this.flightBackground;
        int i11 = this.dp2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, borderColor);
        gradientDrawable2.setStroke(i11, parseColor != null ? parseColor.intValue() : 0);
    }

    public final void bindBadges(List<BadgeDTO> badges, boolean isBadgesVisible) {
        this.badgesAdapter.submitList(badges);
        this.badgesHFAL.setVisibility(isBadgesVisible ? 0 : 8);
    }

    public final void bindLuggageText(@NotNull TextDTO luggageText) {
        Intrinsics.checkNotNullParameter(luggageText, "luggageText");
        TextHolderKt.bind$default(getLuggageTextTAV(), luggageText, null, 2, null);
    }

    public final void bindOrGoneAdditionalInfo(AviaSearchResultV4FlightVO.AdditionalInfo additionalInfo) {
        if (additionalInfo != null) {
            bindAdditionalInfo(additionalInfo);
        } else {
            ViewExtKt.gone(getAdditionalInfoTextTAV());
            ViewExtKt.gone(getAdditionalInfoBadgeBV());
        }
    }

    public final void bindPrice(@NotNull PriceDTO price, BadgeDTO premiumBadge) {
        Intrinsics.checkNotNullParameter(price, "price");
        PriceAtomHolderKt.bind$default(this.pricePAV, price, null, 2, null);
        BadgeHolderKt.bindOrGone$default(getPremiumBadgeBV(), premiumBadge, (Function1) null, 2, (Object) null);
    }

    public final void bindThereDetails(@NotNull AviaSearchResultV4FlightVO.TripRoute wayThereDetails) {
        Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
        this.wayThereDetailsASRFL.bind(wayThereDetails);
    }

    @NotNull
    /* renamed from: getOnBoardingView, reason: from getter */
    public final PriceAtomView getPricePAV() {
        return this.pricePAV;
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.wayThereDetailsASRFL.setRecycledViewPool(recycledViewPool);
        this.wayBackDetailsASRFL.setRecycledViewPool(recycledViewPool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4FlightView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.badgesAdapter = new AviaSearchResultV4BadgesAdapter(context, new AviaSearchResultV4FlightView$badgesAdapter$1(this));
        this.iconsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.dp2 = dimens$default.getMargin2();
        this.dp4 = dimens$default.getMargin4();
        this.dp8 = dimens$default.getMargin8();
        this.dp12 = dimens$default.getMargin12();
        this.dp16 = dimens$default.getMargin16();
        float margin24 = dimens$default.getMargin24();
        this.dpf24 = margin24;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(margin24);
        this.flightBackground = gradientDrawable;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.aviaSearchResultV4BadgesHFAL);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.badgesHFAL = recyclerView;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, defaultConstructorMarker);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.aviaSearchResultV4PricePAV, -2, -2);
        b11.f41616W = true;
        b11.f41598E = 0.0f;
        b11.f41603J = 2;
        b11.f41660x = 0;
        priceAtomView.setLayoutParams(b11);
        this.pricePAV = priceAtomView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.premiumBadgeBV = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$1(this), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$2());
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.aviaSearchResultV4AirlineIconsHAL);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41660x = 0;
        horizontalAtomsLayout.setLayoutParams(bVar);
        this.airlineIconsHAL = horizontalAtomsLayout;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.luggageTextTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$3(this), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.airlinesTextTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$5(this), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$6());
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        AviaSearchResultV4TripRouteView aviaSearchResultV4TripRouteView = new AviaSearchResultV4TripRouteView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        aviaSearchResultV4TripRouteView.setId(R$id.aviaSearchResultV4WayThereDetailsASRFL);
        aviaSearchResultV4TripRouteView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.wayThereDetailsASRFL = aviaSearchResultV4TripRouteView;
        AviaSearchResultV4TripRouteView aviaSearchResultV4TripRouteView2 = new AviaSearchResultV4TripRouteView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        aviaSearchResultV4TripRouteView2.setId(R$id.aviaSearchResultV4WayBackDetailsASRFL);
        aviaSearchResultV4TripRouteView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.wayBackDetailsASRFL = aviaSearchResultV4TripRouteView2;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.additionalInfoTextTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$7(this), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$8(this));
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.additionalInfoBadgeBV = new PreCreationViewPoolDelegate(context6, N.b(BadgeView.class), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$9(this), new AviaSearchResultV4FlightView$special$$inlined$preCreationViewPool$default$10(this));
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }
}
