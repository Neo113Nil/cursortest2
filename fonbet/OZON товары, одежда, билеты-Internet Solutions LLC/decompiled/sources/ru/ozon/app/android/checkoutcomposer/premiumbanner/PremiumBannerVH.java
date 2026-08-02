package ru.ozon.app.android.checkoutcomposer.premiumbanner;

import WZ.t;
import WZ.x;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.checkout.databinding.WidgetPremiumBannerBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerVO;", "Lru/ozon/app/android/checkout/databinding/WidgetPremiumBannerBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetPremiumBannerBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerVO;Ll20/d;)V", "Lru/ozon/app/android/checkout/databinding/WidgetPremiumBannerBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "benefitsAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumBannerVH extends k<PremiumBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter benefitsAdapter;

    @NotNull
    private final WidgetPremiumBannerBinding binding;

    @NotNull
    private final AtomsAdapter buttonAdapter;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.premiumbanner.PremiumBannerVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        final /* synthetic */ ComposerReferences $ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences) {
            super(1);
            this.$ref = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction it) {
            t tVar;
            CommonButton button;
            Map<String, TokenizedTrackingInfo> trackingInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumBannerVH.this.getActionHandler().invoke(it);
            PremiumBannerVO boundedData = PremiumBannerVH.this.getBoundedData();
            if (boundedData == null || (button = boundedData.getButton()) == null || (trackingInfo = button.getTrackingInfo()) == null) {
                tVar = null;
            } else {
                Long valueOf = Long.valueOf(boundedData.getId());
                Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
                tVar = x.b(trackingInfo, valueOf, null);
            }
            if (tVar != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.$ref.getTokenizedAnalytics(), tVar, null, 2, null);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PremiumBannerVH(@NotNull WidgetPremiumBannerBinding binding, @NotNull ComposerReferences ref) {
        super(r3);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).configureBottomSheetWrapContent(true).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_M, 4, 9, Integer.valueOf(R$drawable.bullet), 12, false, false, 2, null, null, 0, 0, null, null, null, 521743, null))), null, null, null, 14, null);
        this.benefitsAdapter = atomsAdapter2;
        binding.buttonFAL.setAdapter(atomsAdapter);
        atomsAdapter.setOnAction(new AnonymousClass1(ref));
        binding.benefitsVal.setAdapter(atomsAdapter2);
        atomsAdapter2.setOnAction(buildHandler);
    }

    @NotNull
    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PremiumBannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ImageView bannerIv = this.binding.bannerIv;
        Intrinsics.checkNotNullExpressionValue(bannerIv, "bannerIv");
        ImageViewExtKt.loadOriginal$default(bannerIv, item.getIcon(), null, null, null, false, null, 62, null);
        ImageView backgroundIv = this.binding.backgroundIv;
        Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
        ViewExtKt.showOrGone(backgroundIv, Boolean.valueOf(item.getShowBackground()));
        this.buttonAdapter.bind(getContext(), C7714v.a0(item.getButton()));
        this.benefitsAdapter.bind(getContext(), item.getBenefits());
        this.actionHandler.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
    }
}
