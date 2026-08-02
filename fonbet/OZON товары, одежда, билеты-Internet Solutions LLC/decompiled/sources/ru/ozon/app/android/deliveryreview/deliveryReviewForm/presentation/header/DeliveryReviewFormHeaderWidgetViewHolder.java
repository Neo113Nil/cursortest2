package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.WidgetDeliveryReviewFormHeaderBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderWidgetViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormHeaderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormHeaderBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;)V", "", "fullScreen", "setDisplayState", "(Z)Z", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormHeaderBinding;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "screenHeight", "I", "isInitialRatingSet", "Z", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormHeaderWidgetViewHolder extends k<DeliveryReviewFormHeaderVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeliveryReviewFormHeaderBinding binding;
    private boolean isInitialRatingSet;
    private final int screenHeight;

    @NotNull
    private final DeliveryReviewFormViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderWidgetViewHolder$Companion;", "", "<init>", "()V", "RATING_UNDEFINED", "", "RATING_ZERO", "RATING_SELECTED_MIN_VALUE", "FULL_SCREEN_STAR_SIZE", "", "DEFAULT_STAR_SIZE", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryReviewFormHeaderWidgetViewHolder(@NotNull WidgetDeliveryReviewFormHeaderBinding binding, @NotNull ComposerReferences refs, @NotNull DeliveryReviewFormViewModel viewModel) {
        super(r0);
        View view;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        this.screenHeight = (c11 == null || (view = c11.getView()) == null) ? 0 : view.getHeight();
        binding.ratingRb.setOnRatingBarChangeListener(new VectorRatingBar.OnRatingBarChangeListener() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderWidgetViewHolder.1
            @Override // ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar.OnRatingBarChangeListener
            public void onRatingChanged(VectorRatingBar vectorRatingBar, float rating, boolean fromUser) {
                AtomAction changeRatingAction;
                Integer selectedRating;
                if (!fromUser) {
                    if (DeliveryReviewFormHeaderWidgetViewHolder.this.isInitialRatingSet) {
                        return;
                    }
                    DeliveryReviewFormHeaderWidgetViewHolder.this.viewModel.updateRating((int) rating);
                    DeliveryReviewFormHeaderWidgetViewHolder.this.isInitialRatingSet = true;
                    return;
                }
                DeliveryReviewFormHeaderVO boundData = DeliveryReviewFormHeaderWidgetViewHolder.this.getBoundData();
                float intValue = (boundData == null || (selectedRating = boundData.getSelectedRating()) == null) ? 0.0f : selectedRating.intValue();
                if (rating == 0.0f && intValue > 0.0f) {
                    DeliveryReviewFormHeaderWidgetViewHolder.this.binding.ratingRb.setRating(1.0f);
                    rating = 1.0f;
                }
                DeliveryReviewFormHeaderVO boundData2 = DeliveryReviewFormHeaderWidgetViewHolder.this.getBoundData();
                if (boundData2 == null || (changeRatingAction = boundData2.getChangeRatingAction()) == null) {
                    return;
                }
                DeliveryReviewFormHeaderWidgetViewHolder deliveryReviewFormHeaderWidgetViewHolder = DeliveryReviewFormHeaderWidgetViewHolder.this;
                if (intValue != rating && (changeRatingAction instanceof AtomAction.Refresh)) {
                    int i11 = (int) rating;
                    deliveryReviewFormHeaderWidgetViewHolder.viewModel.updateRating(i11);
                    AtomAction.Refresh refresh = (AtomAction.Refresh) changeRatingAction;
                    String link = refresh.getLink();
                    deliveryReviewFormHeaderWidgetViewHolder.actionHandler.invoke(AtomAction.Refresh.copy$default(refresh, link != null ? h.X(link, "%d", String.valueOf(i11), false) : null, null, null, null, null, null, 62, null));
                }
            }
        });
    }

    private final boolean setDisplayState(final boolean fullScreen) {
        final WidgetDeliveryReviewFormHeaderBinding widgetDeliveryReviewFormHeaderBinding = this.binding;
        return widgetDeliveryReviewFormHeaderBinding.getConstraintLayout().post(new Runnable() { // from class: As.b
            @Override // java.lang.Runnable
            public final void run() {
                DeliveryReviewFormHeaderWidgetViewHolder.setDisplayState$lambda$3$lambda$2(fullScreen, widgetDeliveryReviewFormHeaderBinding, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDisplayState$lambda$3$lambda$2(boolean z11, WidgetDeliveryReviewFormHeaderBinding widgetDeliveryReviewFormHeaderBinding, DeliveryReviewFormHeaderWidgetViewHolder deliveryReviewFormHeaderWidgetViewHolder) {
        int i11;
        int i12;
        if (z11) {
            int[] iArr = new int[2];
            widgetDeliveryReviewFormHeaderBinding.getConstraintLayout().getLocationOnScreen(iArr);
            i11 = deliveryReviewFormHeaderWidgetViewHolder.screenHeight - iArr[1];
            i12 = 40;
        } else {
            i11 = -2;
            i12 = 32;
        }
        TextView newReviewTitleTv = widgetDeliveryReviewFormHeaderBinding.newReviewTitleTv;
        Intrinsics.checkNotNullExpressionValue(newReviewTitleTv, "newReviewTitleTv");
        ViewExtKt.showOrGone(newReviewTitleTv, Boolean.valueOf(z11));
        TextView ratingTv = widgetDeliveryReviewFormHeaderBinding.ratingTv;
        Intrinsics.checkNotNullExpressionValue(ratingTv, "ratingTv");
        ViewExtKt.showOrGone(ratingTv, Boolean.valueOf(!z11));
        VectorRatingBar vectorRatingBar = widgetDeliveryReviewFormHeaderBinding.ratingRb;
        Intrinsics.checkNotNullExpressionValue(widgetDeliveryReviewFormHeaderBinding.getConstraintLayout().getContext(), "getContext(...)");
        vectorRatingBar.setStarSize(ResourceExtKt.toPx(i12, r0));
        LinearLayout constraintLayout = widgetDeliveryReviewFormHeaderBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        constraintLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewFormHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        float intValue = item.getSelectedRating() != null ? r5.intValue() : -1.0f;
        WidgetDeliveryReviewFormHeaderBinding widgetDeliveryReviewFormHeaderBinding = this.binding;
        widgetDeliveryReviewFormHeaderBinding.ratingRb.setRating(intValue);
        VectorRatingBar ratingRb = widgetDeliveryReviewFormHeaderBinding.ratingRb;
        Intrinsics.checkNotNullExpressionValue(ratingRb, "ratingRb");
        ViewExtKt.showOrGone(ratingRb, item.getShowRating());
        widgetDeliveryReviewFormHeaderBinding.ratingRb.setIndicator(item.getDisabled());
        widgetDeliveryReviewFormHeaderBinding.newReviewTitleTv.setText(item.getRatingTitle());
        widgetDeliveryReviewFormHeaderBinding.ratingTv.setText(item.getRatingTitle());
        TextView ratingTv = widgetDeliveryReviewFormHeaderBinding.ratingTv;
        Intrinsics.checkNotNullExpressionValue(ratingTv, "ratingTv");
        ViewExtKt.showOrGone(ratingTv, item.getShowRating());
        TextView titleTv = widgetDeliveryReviewFormHeaderBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        setDisplayState(intValue == 0.0f);
    }
}
