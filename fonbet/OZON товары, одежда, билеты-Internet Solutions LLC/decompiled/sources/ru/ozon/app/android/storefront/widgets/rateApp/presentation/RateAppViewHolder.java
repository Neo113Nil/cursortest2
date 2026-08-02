package ru.ozon.app.android.storefront.widgets.rateApp.presentation;

import JL.a;
import Sc.InterfaceC4008j;
import Vg.d;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.G;
import androidx.lifecycle.InterfaceC5431s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.databinding.WidgetNewRateAppBinding;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewHolder;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R'\u0010.\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "Ll10/i;", "container", "", "storeName", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/view/ViewGroup;", "viewFactory", "<init>", "(Ll10/i;Ljava/lang/String;LVg/d;Ld20/e;)V", "", "addView", "()V", "removeView", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;)V", "Ll10/i;", "Ljava/lang/String;", "LVg/d;", "parent", "Landroid/view/ViewGroup;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/widget/LinearLayout;", "view$delegate", "LSc/j;", "getView", "()Landroid/widget/LinearLayout;", "view", "Lru/ozon/app/android/storefront/databinding/WidgetNewRateAppBinding;", "binding$delegate", "getBinding", "()Lru/ozon/app/android/storefront/databinding/WidgetNewRateAppBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppViewHolder extends AbstractC6065b<RateAppVO> {
    private static boolean isDismissed;

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Handler handler;

    @NotNull
    private final View metricView;

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private final String storeName;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppViewHolder$1", "Lkotlin/Function1;", "", "", "invoke", "rating", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewHolder$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Function1<Integer, Unit> {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3$lambda$2$lambda$1$lambda$0(RateAppViewHolder rateAppViewHolder, AtomAction.ComposerAction composerAction) {
            rateAppViewHolder.getBinding().root.animate().setDuration(200L).translationY(rateAppViewHolder.getBinding().root.getHeight());
            RateAppViewHolder.INSTANCE.setDismissed(true);
            rateAppViewHolder.getActionHandler().invoke(composerAction);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public void invoke(int rating) {
            RateAppVO boundData = RateAppViewHolder.this.getBoundData();
            if (boundData != null) {
                RateAppViewHolder rateAppViewHolder = RateAppViewHolder.this;
                AtomAction ratingChangeAction = boundData.getRatingChangeAction();
                if (ratingChangeAction != null) {
                    AtomAction.ComposerAction composerAction = ratingChangeAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) ratingChangeAction : null;
                    if (composerAction != null) {
                        Pair pair = new Pair("service_rating", String.valueOf(rating));
                        Pair pair2 = new Pair("store", rateAppViewHolder.storeName);
                        Map<String, String> params = composerAction.getParams();
                        rateAppViewHolder.handler.post(new a(0, rateAppViewHolder, AtomAction.ComposerAction.copy$default(composerAction, null, null, U.j(pair, pair2, new Pair("nps_id", String.valueOf(params != null ? params.get("nps_id") : null))), null, null, 27, null)));
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppViewHolder$Companion;", "", "<init>", "()V", "RATING_PARAM", "", "STORE_PARAM", "NPS_ID_PARAM", "ANIMATION_DURATION", "", "isDismissed", "", "()Z", "setDismissed", "(Z)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isDismissed() {
            return RateAppViewHolder.isDismissed;
        }

        public final void setDismissed(boolean z11) {
            RateAppViewHolder.isDismissed = z11;
        }

        private Companion() {
        }
    }

    public RateAppViewHolder(@NotNull i container, @NotNull String storeName, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<ViewGroup> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.storeName = storeName;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.parent = container.Z();
        this.handler = new Handler(Looper.getMainLooper());
        this.view = LazyUtilsKt.unsafeLazy(new RateAppViewHolder$view$2(viewFactory, this));
        this.binding = LazyUtilsKt.unsafeLazy(new RateAppViewHolder$binding$2(this));
        this.actionHandler = LazyUtilsKt.unsafeLazy(new RateAppViewHolder$actionHandler$2(this));
        this.metricView = getView();
        getBinding().rating.setRatingClickCallback(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WidgetNewRateAppBinding getBinding() {
        return (WidgetNewRateAppBinding) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getView() {
        return (LinearLayout) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        ViewGroup viewGroup = this.parent;
        this.parent.addView(getView(), viewGroup.indexOfChild(ComposerViewExtensionKt.composerBottomContainer(viewGroup)));
        final LinearLayout view = getView();
        G.a(view, new Runnable() { // from class: ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewHolder$addView$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                i iVar;
                LinearLayout view2;
                iVar = this.container;
                InterfaceC5431s c11 = iVar.Q().c();
                ExternalOffsetHandler externalOffsetHandler = c11 instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) c11 : null;
                if (externalOffsetHandler != null) {
                    int maxBottomOffset = externalOffsetHandler.getMaxBottomOffset();
                    view2 = this.getView();
                    ViewExtKt.updatePadding$default(view2, 0, 0, 0, maxBottomOffset, 7, null);
                }
            }
        });
        BottomSheetBehavior.from(getView()).addBottomSheetCallback(new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewHolder$addView$2$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 5) {
                    RateAppViewHolder.Companion companion = RateAppViewHolder.INSTANCE;
                    if (companion.isDismissed()) {
                        return;
                    }
                    companion.setDismissed(true);
                }
            }
        });
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.parent.removeView(getView());
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RateAppVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetNewRateAppBinding binding = getBinding();
        TextAtomV2View titleTAV = binding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
        TextHolderKt.bind$default(titleTAV, item.getTitle(), null, 2, null);
        RatingView rating = binding.rating;
        Intrinsics.checkNotNullExpressionValue(rating, "rating");
        DsRatingHolderKt.bind$default(rating, item.getRating(), null, 2, null);
    }
}
