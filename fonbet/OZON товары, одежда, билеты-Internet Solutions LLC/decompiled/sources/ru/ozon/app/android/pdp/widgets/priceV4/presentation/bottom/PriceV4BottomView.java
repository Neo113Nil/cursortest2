package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

import Sc.InterfaceC4008j;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom.PriceV4BottomView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4BottomViewConfiguration;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 N2\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u001a\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u00104R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000201098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010-R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010HR\u001b\u0010M\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bJ\u00104*\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4BaseView;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "configuration", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;)V", "", "setupViewsByConfigurations", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;)V", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;", "priceV4Vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindByConfigurations", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "priceAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "setOnPriceClickListener", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "", "rightContainerWidth", "()Ljava/lang/Integer;", "desiredWidth", "updateRightContainerWidth", "(I)V", "bind", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "previewConfiguration", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "banksIconHeight", "I", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "LSc/j;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "ozonCardBadgeView$delegate", "getOzonCardBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "ozonCardBadgeView", "moreAboutPriceView$delegate", "getMoreAboutPriceView", "moreAboutPriceView", "LSc/j;", "bottomFinBadgeViewLazy", "Landroid/widget/FrameLayout;", "leftViewRoot$delegate", "getLeftViewRoot", "()Landroid/widget/FrameLayout;", "leftViewRoot", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "partnerBanksView$delegate", "getPartnerBanksView", "()Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "partnerBanksView", "Landroid/view/View;", "gradientView$delegate", "getGradientView", "()Landroid/view/View;", "gradientView", "getBottomFinBadgeView", "getBottomFinBadgeView$delegate", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;)Ljava/lang/Object;", "bottomFinBadgeView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class PriceV4BottomView extends PriceV4BaseView {
    private int banksIconHeight;

    @NotNull
    private final InterfaceC4008j<BadgeView> bottomFinBadgeViewLazy;

    /* renamed from: gradientView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientView;

    /* renamed from: leftViewRoot$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftViewRoot;

    /* renamed from: moreAboutPriceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j moreAboutPriceView;

    /* renamed from: ozonCardBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonCardBadgeView;

    @NotNull
    private final PartnerBanksDelegate partnerBanksDelegate;

    /* renamed from: partnerBanksView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j partnerBanksView;

    @NotNull
    private PriceV4BottomViewConfiguration previewConfiguration;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_BANKS_ICON_HEIGHT = Dimens.INSTANCE.getDP_20();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView$Companion;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceV4BottomViewConfiguration.values().length];
            try {
                iArr[PriceV4BottomViewConfiguration.PRICE_ATOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceV4BottomViewConfiguration.PRICE_ATOM_AND_BADGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceV4BottomViewConfiguration.LEFT_BADGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceV4BottomViewConfiguration.LEFT_AND_RIGHT_BADGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceV4BottomViewConfiguration.BANKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PriceV4BottomViewConfiguration.BANKS_AND_BADGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV4BottomView(@NotNull Context context, @NotNull PriceV4BottomViewConfiguration configuration, @NotNull PartnerBanksDelegate partnerBanksDelegate) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(partnerBanksDelegate, "partnerBanksDelegate");
        this.partnerBanksDelegate = partnerBanksDelegate;
        this.previewConfiguration = configuration;
        this.banksIconHeight = DEFAULT_BANKS_ICON_HEIGHT;
        this.priceView = DelegatesKt.lazyUnsafe(new PriceV4BottomView$priceView$2(context));
        this.ozonCardBadgeView = DelegatesKt.lazyUnsafe(new PriceV4BottomView$ozonCardBadgeView$2(context));
        this.moreAboutPriceView = DelegatesKt.lazyUnsafe(new PriceV4BottomView$moreAboutPriceView$2(context));
        this.bottomFinBadgeViewLazy = DelegatesKt.lazyUnsafe(new PriceV4BottomView$bottomFinBadgeViewLazy$1(context));
        this.leftViewRoot = DelegatesKt.lazyUnsafe(new PriceV4BottomView$leftViewRoot$2(context));
        this.partnerBanksView = DelegatesKt.lazyUnsafe(new PriceV4BottomView$partnerBanksView$2(context, this));
        this.gradientView = DelegatesKt.lazyUnsafe(new PriceV4BottomView$gradientView$2(context, this));
        setOrientation(0);
        setGravity(16);
        setupViewsByConfigurations(configuration);
    }

    private final void bindByConfigurations(PriceV4VoWrapper.Bottom priceV4Vo, Function1<? super AtomAction, Unit> actionHandler) {
        PartnerBanksVO partnerBanks = priceV4Vo.getPartnerBanks();
        this.banksIconHeight = partnerBanks != null ? UiExtKt.toPx(partnerBanks.getIconsSize()) : DEFAULT_BANKS_ICON_HEIGHT;
        switch (WhenMappings.$EnumSwitchMapping$0[priceV4Vo.getConfiguration().ordinal()]) {
            case 1:
                PriceAtomHolderKt.bindOrGone(getPriceView(), priceV4Vo.getPrice(), actionHandler);
                setOnPriceClickListener(priceV4Vo.getPriceAction(), actionHandler, priceV4Vo.getTrackingInfo());
                return;
            case 2:
                PriceAtomHolderKt.bindOrGone(getPriceView(), priceV4Vo.getPrice(), actionHandler);
                setOnPriceClickListener(priceV4Vo.getPriceAction(), actionHandler, priceV4Vo.getTrackingInfo());
                BadgeHolderKt.bindOrGone(getBottomFinBadgeView(), priceV4Vo.getBottomFinBadge(), actionHandler);
                return;
            case 3:
                BadgeHolderKt.bindOrGone(getMoreAboutPriceView(), priceV4Vo.getMoreAboutPrice(), actionHandler);
                BadgeHolderKt.bindOrGone(getOzonCardBadgeView(), priceV4Vo.getOzonCardBadge(), actionHandler);
                return;
            case 4:
                BadgeHolderKt.bindOrGone(getMoreAboutPriceView(), priceV4Vo.getMoreAboutPrice(), actionHandler);
                BadgeHolderKt.bindOrGone(getOzonCardBadgeView(), priceV4Vo.getOzonCardBadge(), actionHandler);
                BadgeHolderKt.bindOrGone(getBottomFinBadgeView(), priceV4Vo.getBottomFinBadge(), actionHandler);
                return;
            case 5:
                this.partnerBanksDelegate.bindOrGone(getPartnerBanksView(), priceV4Vo.getPartnerBanks(), actionHandler);
                return;
            case 6:
                this.partnerBanksDelegate.bindOrGone(getPartnerBanksView(), priceV4Vo.getPartnerBanks(), actionHandler);
                BadgeHolderKt.bindOrGone(getBottomFinBadgeView(), priceV4Vo.getBottomFinBadge(), actionHandler);
                return;
            default:
                throw new o();
        }
    }

    private final BadgeView getBottomFinBadgeView() {
        return this.bottomFinBadgeViewLazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getGradientView() {
        return (View) this.gradientView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getLeftViewRoot() {
        return (FrameLayout) this.leftViewRoot.getValue();
    }

    private final BadgeView getMoreAboutPriceView() {
        return (BadgeView) this.moreAboutPriceView.getValue();
    }

    private final BadgeView getOzonCardBadgeView() {
        return (BadgeView) this.ozonCardBadgeView.getValue();
    }

    private final PartnerBanksView getPartnerBanksView() {
        return (PartnerBanksView) this.partnerBanksView.getValue();
    }

    private final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue();
    }

    private final void setOnPriceClickListener(final AtomActionDTO priceAction, final Function1<? super AtomAction, Unit> actionHandler, final Map<String, TokenizedTrackingInfo> trackingInfo) {
        getPriceView().setOnClickListener(new View.OnClickListener() { // from class: DE.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceV4BottomView.setOnPriceClickListener$lambda$5(AtomActionDTO.this, trackingInfo, actionHandler, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnPriceClickListener$lambda$5(AtomActionDTO atomActionDTO, Map map, Function1 function1, View view) {
        AtomAction atomAction;
        if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, map)) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void setupViewsByConfigurations(PriceV4BottomViewConfiguration configuration) {
        switch (WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()]) {
            case 1:
                addView(getPriceView());
                break;
            case 2:
                getLeftViewRoot().addView(getPriceView());
                addView(getLeftViewRoot());
                addView(getBottomFinBadgeView());
                break;
            case 3:
                addView(getOzonCardBadgeView());
                addView(getMoreAboutPriceView());
                break;
            case 4:
                addView(getOzonCardBadgeView());
                getLeftViewRoot().addView(getMoreAboutPriceView());
                addView(getLeftViewRoot());
                addView(getBottomFinBadgeView());
                break;
            case 5:
                getLeftViewRoot().addView(getPartnerBanksView());
                addView(getLeftViewRoot());
                break;
            case 6:
                getLeftViewRoot().addView(getPartnerBanksView());
                addView(getLeftViewRoot());
                addView(getBottomFinBadgeView());
                break;
            default:
                throw new o();
        }
        this.previewConfiguration = configuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull PriceV4VoWrapper.Bottom priceV4Vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(priceV4Vo, "priceV4Vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (priceV4Vo.getConfiguration() != this.previewConfiguration) {
            removeAllViews();
            setupViewsByConfigurations(priceV4Vo.getConfiguration());
            this.previewConfiguration = priceV4Vo.getConfiguration();
            if (this.bottomFinBadgeViewLazy.isInitialized()) {
                BadgeView bottomFinBadgeView = getBottomFinBadgeView();
                ViewGroup.LayoutParams layoutParams = bottomFinBadgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i11 = marginLayoutParams.leftMargin;
                    int i12 = marginLayoutParams.topMargin;
                    int i13 = marginLayoutParams.rightMargin;
                    int i14 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.leftMargin = 0;
                    if (i11 == 0) {
                        ViewGroup.LayoutParams layoutParams2 = bottomFinBadgeView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams3 = bottomFinBadgeView.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                            if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams4 = bottomFinBadgeView.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            }
                        }
                    }
                    bottomFinBadgeView.setLayoutParams(marginLayoutParams);
                }
            }
            ViewExtKt.updatePadding$default(this, 0, 0, 0, 0, 11, null);
        }
        bindByConfigurations(priceV4Vo, actionHandler);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    @NotNull
    public OnBoardingCutConfig onBoardingCutConfig() {
        int width = getWidth() - getBottomFinBadgeView().getWidth();
        ViewGroup.LayoutParams layoutParams = getBottomFinBadgeView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return new OnBoardingCutConfig(Integer.valueOf(width), Integer.valueOf(-SellerV4DisclosureViewFactory.INSTANCE.getDp26()), Integer.valueOf(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0), null, null, null, null, false, 248, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    public Integer rightContainerWidth() {
        if (this.bottomFinBadgeViewLazy.isInitialized() && getBottomFinBadgeView().getVisibility() == 0) {
            return Integer.valueOf(getBottomFinBadgeView().getWidth());
        }
        return null;
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4BaseView
    public void updateRightContainerWidth(int desiredWidth) {
        if (!this.bottomFinBadgeViewLazy.isInitialized() || getBottomFinBadgeView().getVisibility() != 0) {
            ViewExtKt.updatePadding$default(this, 0, 0, desiredWidth, 0, 11, null);
            return;
        }
        BadgeView bottomFinBadgeView = getBottomFinBadgeView();
        ViewGroup.LayoutParams layoutParams = bottomFinBadgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        int width = desiredWidth - getBottomFinBadgeView().getWidth();
        marginLayoutParams.leftMargin = width;
        if (i11 == width) {
            ViewGroup.LayoutParams layoutParams2 = bottomFinBadgeView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = bottomFinBadgeView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = bottomFinBadgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        bottomFinBadgeView.setLayoutParams(marginLayoutParams);
    }
}
