package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item;

import Sc.o;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain.DetailedCheckoutProductsVO;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item.DetailedCheckoutProductItemView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class DetailedCheckoutProductItemView$bindSpacers$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ Integer $subtitleId;
    final /* synthetic */ DetailedCheckoutProductsVO.TileItem.TextBoxType $textBoxType;
    final /* synthetic */ int $titleId;
    final /* synthetic */ DetailedCheckoutProductItemView this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetailedCheckoutProductsVO.TileItem.TextBoxType.values().length];
            try {
                iArr[DetailedCheckoutProductsVO.TileItem.TextBoxType.SINGLE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetailedCheckoutProductsVO.TileItem.TextBoxType.PRICE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DetailedCheckoutProductsVO.TileItem.TextBoxType.TITLE_SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DetailedCheckoutProductsVO.TileItem.TextBoxType.FULL_INFO_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DetailedCheckoutProductItemView$bindSpacers$1(DetailedCheckoutProductsVO.TileItem.TextBoxType textBoxType, int i11, DetailedCheckoutProductItemView detailedCheckoutProductItemView, Integer num) {
        super(1);
        this.$textBoxType = textBoxType;
        this.$titleId = i11;
        this.this$0 = detailedCheckoutProductItemView;
        this.$subtitleId = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Image image;
        Image image2;
        TextAtomV2View textAtomV2View;
        DetailedCheckoutProductItemView.Companion companion;
        PriceAtomView priceAtomView;
        Image image3;
        Image image4;
        PriceAtomView priceAtomView2;
        DetailedCheckoutProductItemView.Companion companion2;
        PriceAtomView priceAtomView3;
        TextAtomV2View textAtomV2View2;
        DetailedCheckoutProductItemView.Companion companion3;
        Image image5;
        Image image6;
        DetailedCheckoutProductItemView.Companion companion4;
        TextAtomV2View textAtomV2View3;
        DetailedCheckoutProductItemView.Companion companion5;
        PriceAtomView priceAtomView4;
        TextAtomV2View textAtomV2View4;
        DetailedCheckoutProductItemView.Companion companion6;
        int leftBadgeMargin;
        Image image7;
        PriceAtomView priceAtomView5;
        DetailedCheckoutProductItemView.Companion companion7;
        DetailedCheckoutProductItemView.Companion companion8;
        PriceAtomView priceAtomView6;
        TextAtomV2View textAtomV2View5;
        DetailedCheckoutProductItemView.Companion companion9;
        TextAtomV2View textAtomV2View6;
        DetailedCheckoutProductItemView.Companion companion10;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$textBoxType.ordinal()];
        if (i11 == 1) {
            int i12 = this.$titleId;
            image = this.this$0.imageView;
            ConstraintSetExtKt.topToTop$default(updateConstraints, i12, image.getId(), 0, 4, null);
            int i13 = this.$titleId;
            image2 = this.this$0.imageView;
            ConstraintSetExtKt.bottomToBottom$default(updateConstraints, i13, image2.getId(), 0, 4, null);
        } else if (i11 == 2) {
            priceAtomView = this.this$0.priceView;
            ConstraintSetExtKt.startToStart$default(updateConstraints, priceAtomView.getId(), this.$titleId, 0, 4, null);
            image3 = this.this$0.imageView;
            int id2 = image3.getId();
            image4 = this.this$0.imageView;
            int id3 = image4.getId();
            priceAtomView2 = this.this$0.priceView;
            updateConstraints.F(id2, id3, new int[]{priceAtomView2.getId(), this.$titleId}, null);
            int i14 = this.$titleId;
            companion2 = DetailedCheckoutProductItemView.Companion;
            updateConstraints.e0(i14, 3, companion2.getBetweenMargin());
            priceAtomView3 = this.this$0.priceView;
            int id4 = priceAtomView3.getId();
            textAtomV2View2 = this.this$0.productQuantityView;
            int id5 = textAtomV2View2.getId();
            companion3 = DetailedCheckoutProductItemView.Companion;
            ConstraintSetExtKt.endToStart(updateConstraints, id4, id5, companion3.getRightTextPadding());
        } else if (i11 == 3) {
            Integer num = this.$subtitleId;
            if (num != null) {
                int i15 = this.$titleId;
                DetailedCheckoutProductItemView detailedCheckoutProductItemView = this.this$0;
                ConstraintSetExtKt.startToStart$default(updateConstraints, num.intValue(), i15, 0, 4, null);
                image5 = detailedCheckoutProductItemView.imageView;
                int id6 = image5.getId();
                image6 = detailedCheckoutProductItemView.imageView;
                updateConstraints.F(id6, image6.getId(), new int[]{i15, num.intValue()}, null);
                int intValue = num.intValue();
                companion4 = DetailedCheckoutProductItemView.Companion;
                updateConstraints.e0(intValue, 3, companion4.getBetweenMargin());
                int intValue2 = num.intValue();
                textAtomV2View3 = detailedCheckoutProductItemView.productQuantityView;
                int id7 = textAtomV2View3.getId();
                companion5 = DetailedCheckoutProductItemView.Companion;
                ConstraintSetExtKt.endToStart(updateConstraints, intValue2, id7, companion5.getRightTextPadding());
            }
        } else {
            if (i11 != 4) {
                throw new o();
            }
            Integer num2 = this.$subtitleId;
            if (num2 != null) {
                DetailedCheckoutProductItemView detailedCheckoutProductItemView2 = this.this$0;
                int i16 = this.$titleId;
                priceAtomView4 = detailedCheckoutProductItemView2.priceView;
                ConstraintSetExtKt.startToStart$default(updateConstraints, priceAtomView4.getId(), i16, 0, 4, null);
                textAtomV2View4 = detailedCheckoutProductItemView2.subtitleView;
                if (num2.intValue() == textAtomV2View4.getId()) {
                    leftBadgeMargin = 0;
                } else {
                    companion6 = DetailedCheckoutProductItemView.Companion;
                    leftBadgeMargin = companion6.getLeftBadgeMargin();
                }
                ConstraintSetExtKt.startToStart(updateConstraints, num2.intValue(), i16, leftBadgeMargin);
                image7 = detailedCheckoutProductItemView2.imageView;
                int id8 = image7.getId();
                priceAtomView5 = detailedCheckoutProductItemView2.priceView;
                updateConstraints.F(id8, 0, new int[]{priceAtomView5.getId(), i16, num2.intValue()}, null);
                companion7 = DetailedCheckoutProductItemView.Companion;
                updateConstraints.e0(i16, 3, companion7.getBetweenMargin());
                int intValue3 = num2.intValue();
                companion8 = DetailedCheckoutProductItemView.Companion;
                updateConstraints.e0(intValue3, 3, companion8.getBetweenMargin());
                priceAtomView6 = detailedCheckoutProductItemView2.priceView;
                int id9 = priceAtomView6.getId();
                textAtomV2View5 = detailedCheckoutProductItemView2.productQuantityView;
                int id10 = textAtomV2View5.getId();
                companion9 = DetailedCheckoutProductItemView.Companion;
                ConstraintSetExtKt.endToStart(updateConstraints, id9, id10, companion9.getRightTextPadding());
                int intValue4 = num2.intValue();
                textAtomV2View6 = detailedCheckoutProductItemView2.productQuantityView;
                int id11 = textAtomV2View6.getId();
                companion10 = DetailedCheckoutProductItemView.Companion;
                ConstraintSetExtKt.endToStart(updateConstraints, intValue4, id11, companion10.getRightTextPadding());
            }
        }
        int i17 = this.$titleId;
        textAtomV2View = this.this$0.productQuantityView;
        int id12 = textAtomV2View.getId();
        companion = DetailedCheckoutProductItemView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, i17, id12, companion.getRightTextPadding());
    }
}
