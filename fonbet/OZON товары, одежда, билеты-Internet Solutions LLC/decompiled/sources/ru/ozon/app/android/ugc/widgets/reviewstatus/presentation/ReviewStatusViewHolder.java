package ru.ozon.app.android.ugc.widgets.reviewstatus.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.databinding.WidgetReviewStatusBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstatus/presentation/ReviewStatusViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewstatus/presentation/ReviewStatusVO;", "Lru/ozon/app/android/ugc/databinding/WidgetReviewStatusBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetReviewStatusBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewstatus/presentation/ReviewStatusVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/databinding/WidgetReviewStatusBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewStatusViewHolder extends k<ReviewStatusVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReviewStatusBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewStatusViewHolder(@NotNull WidgetReviewStatusBinding binding, @NotNull ComposerReferences composerReferences) {
        super(r0);
        Object obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        DisclaimerContainer promoStatusDC = binding.promoStatusDC;
        Intrinsics.checkNotNullExpressionValue(promoStatusDC, "promoStatusDC");
        Iterator<T> it = ViewExtKt.getAllChildren(promoStatusDC).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((View) obj) instanceof AppCompatImageView) {
                    break;
                }
            }
        }
        View view = (View) obj;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Dimens.INSTANCE.getDP_12();
            view.setLayoutParams(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewStatusVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetReviewStatusBinding widgetReviewStatusBinding = this.binding;
        TextAtomV2View publicationStatusTAV = widgetReviewStatusBinding.publicationStatusTAV;
        Intrinsics.checkNotNullExpressionValue(publicationStatusTAV, "publicationStatusTAV");
        TextHolderKt.bind$default(publicationStatusTAV, item.getPublicationStatus(), null, 2, null);
        DisclaimerContainer promoStatusDC = widgetReviewStatusBinding.promoStatusDC;
        Intrinsics.checkNotNullExpressionValue(promoStatusDC, "promoStatusDC");
        DisclaimerHolderKt.bindOrGone$default(promoStatusDC, item.getPromoStatus(), null, 2, null);
        LargeBorderlessButtonView buttonView = widgetReviewStatusBinding.buttonView;
        Intrinsics.checkNotNullExpressionValue(buttonView, "buttonView");
        LargeBorderlessButtonHolderKt.bind(buttonView, item.getButton(), this.actionHandler);
    }
}
