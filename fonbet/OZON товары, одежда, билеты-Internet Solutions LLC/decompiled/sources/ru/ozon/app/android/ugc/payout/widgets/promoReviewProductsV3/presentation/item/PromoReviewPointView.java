package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.payout.R$drawable;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewPointView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "iconsDecorator", "ru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewPointView$iconsDecorator$1", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewPointView$iconsDecorator$1;", "iconsContainer", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bindPoint", "", "point", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$PointVO;", "showSeparator", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewPointView extends LinearLayout {

    @NotNull
    private final AtomsAdapter iconsAdapter;

    @NotNull
    private final HorizontalAtomsLayout iconsContainer;

    @NotNull
    private final PromoReviewPointView$iconsDecorator$1 iconsDecorator;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewPointView$iconsDecorator$1, ru.ozon.uni.atoms.af.HorizontalAtomsDecorator] */
    public PromoReviewPointView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.iconsAdapter = atomsAdapter;
        ?? r02 = new HorizontalAtomsDecorator() { // from class: ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewPointView$iconsDecorator$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
            public LinearLayout.LayoutParams modifyHorizontalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                Intrinsics.checkNotNullParameter(data, "data");
                lp.gravity = 16;
                Dimens dimens = Dimens.INSTANCE;
                lp.setMarginStart(dimens.getDP_1());
                lp.setMarginEnd(dimens.getDP_1());
                return lp;
            }
        };
        this.iconsDecorator = r02;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.bottomMargin = dimens.getDP_6();
        horizontalAtomsLayout.setLayoutParams(layoutParams);
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(r02);
        this.iconsContainer = horizontalAtomsLayout;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.leftMargin = dimens.getDP_8();
        layoutParams2.rightMargin = dimens.getDP_8();
        textAtomV2View.setLayoutParams(layoutParams2);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTextView = textAtomV2View;
        setOrientation(1);
        addView(horizontalAtomsLayout);
        addView(textAtomV2View);
    }

    public final void bindPoint(@NotNull PromoReviewItemVO.PointVO point, boolean showSeparator) {
        Intrinsics.checkNotNullParameter(point, "point");
        setBackground(showSeparator ? a.getDrawable(getContext(), R$drawable.bg_vertical_separator) : null);
        AtomsAdapter atomsAdapter = this.iconsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, point.getIcons());
        TextHolderKt.bind$default(this.titleTextView, point.getTitle(), null, 2, null);
    }
}
