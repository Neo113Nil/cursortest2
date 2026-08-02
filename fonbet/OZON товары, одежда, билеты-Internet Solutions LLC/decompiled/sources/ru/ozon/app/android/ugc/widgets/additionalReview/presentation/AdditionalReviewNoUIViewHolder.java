package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewBinding;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR'\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewNoUIViewHolder;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;", "Ll10/i;", "container", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewBinding;", "binding", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewBinder;", "binder$delegate", "getBinder", "()Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewBinder;", "binder", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewNoUIViewHolder extends AbstractC6064a<AdditionalReviewVO> {
    private static final int CARD_VIEW_BOTTOM_MARGIN;
    private static final int CARD_VIEW_TOP_MARGIN;

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: binder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binder;

    @NotNull
    private final WidgetAdditionalReviewBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewNoUIViewHolder$Companion;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        CARD_VIEW_TOP_MARGIN = dimens.getDP_8();
        CARD_VIEW_BOTTOM_MARGIN = dimens.getDP_32();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReviewNoUIViewHolder(@NotNull i container, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        WidgetAdditionalReviewBinding bind = WidgetAdditionalReviewBinding.bind(getView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new AdditionalReviewNoUIViewHolder$actionHandler$2(this));
        this.binder = LazyUtilsKt.unsafeLazy(new AdditionalReviewNoUIViewHolder$binder$2(this));
        CardView constraintLayout = bind.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.topMargin;
        int i12 = marginLayoutParams.rightMargin;
        int i13 = marginLayoutParams.bottomMargin;
        marginLayoutParams.topMargin = CARD_VIEW_TOP_MARGIN;
        marginLayoutParams.bottomMargin = CARD_VIEW_BOTTOM_MARGIN;
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                    return;
                }
            }
        }
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final AdditionalReviewBinder getBinder() {
        return (AdditionalReviewBinder) this.binder.getValue();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AdditionalReviewVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getBinder().bind(item);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull AdditionalReviewVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        getBinder().trackView(item);
    }
}
