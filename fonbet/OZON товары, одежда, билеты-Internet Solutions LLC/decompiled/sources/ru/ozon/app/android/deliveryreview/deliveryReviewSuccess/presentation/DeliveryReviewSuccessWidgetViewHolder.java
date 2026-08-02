package ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.presentation;

import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.WidgetDeliveryReviewSuccessBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/presentation/DeliveryReviewSuccessWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/presentation/DeliveryReviewSuccessVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewSuccessBinding;", "binding", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewSuccessBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/presentation/DeliveryReviewSuccessVO;Ll20/d;)V", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewSuccessBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewSuccessWidgetViewHolder extends k<DeliveryReviewSuccessVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeliveryReviewSuccessBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryReviewSuccessWidgetViewHolder(@NotNull ComposerReferences refs, @NotNull WidgetDeliveryReviewSuccessBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewSuccessVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDeliveryReviewSuccessBinding widgetDeliveryReviewSuccessBinding = this.binding;
        ImageView imageIv = widgetDeliveryReviewSuccessBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.loadImageOrInvisible(imageIv, item.getImage());
        widgetDeliveryReviewSuccessBinding.titleTv.setText(item.getTitle());
        widgetDeliveryReviewSuccessBinding.subtitleTv.setText(item.getSubtitle());
        LargeButtonView buttonAtom = widgetDeliveryReviewSuccessBinding.buttonAtom;
        Intrinsics.checkNotNullExpressionValue(buttonAtom, "buttonAtom");
        LargeButtonHolderKt.bindOrGone(buttonAtom, item.getButton(), this.actionHandler);
    }
}
