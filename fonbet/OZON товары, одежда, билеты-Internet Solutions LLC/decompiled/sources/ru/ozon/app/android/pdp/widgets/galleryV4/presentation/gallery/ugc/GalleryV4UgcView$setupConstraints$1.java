package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc;

import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.d;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class GalleryV4UgcView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ boolean $isVerticalState;
    final /* synthetic */ GalleryV4UgcView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4UgcView$setupConstraints$1(boolean z11, GalleryV4UgcView galleryV4UgcView) {
        super(1);
        this.$isVerticalState = z11;
        this.this$0 = galleryV4UgcView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        ShapeableImageView shapeableImageView3;
        ImageView imageView;
        ImageView imageView2;
        Flow flow;
        Flow flow2;
        ShapeableImageView shapeableImageView4;
        Flow flow3;
        TextAtomV2View textAtomV2View;
        ShapeableImageView shapeableImageView5;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        Flow flow4;
        TextAtomV2View textAtomV2View4;
        ShapeableImageView shapeableImageView6;
        ShapeableImageView shapeableImageView7;
        ShapeableImageView shapeableImageView8;
        ImageView imageView3;
        ImageView imageView4;
        Flow flow5;
        ShapeableImageView shapeableImageView9;
        Flow flow6;
        Flow flow7;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        Flow flow8;
        TextAtomV2View textAtomV2View8;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        if (this.$isVerticalState) {
            shapeableImageView6 = this.this$0.ugcMainImageIv;
            ConstraintSetExtKt.topToTop(updateConstraints, shapeableImageView6.getId(), 0, this.this$0.getDp4());
            shapeableImageView7 = this.this$0.ugcMainImageIv;
            ConstraintSetExtKt.startToStart(updateConstraints, shapeableImageView7.getId(), 0, this.this$0.getDp4());
            shapeableImageView8 = this.this$0.ugcMainImageIv;
            ConstraintSetExtKt.endToEnd(updateConstraints, shapeableImageView8.getId(), 0, this.this$0.getDp4());
            imageView3 = this.this$0.ugcPlayIconIv;
            ConstraintSetExtKt.topToTop(updateConstraints, imageView3.getId(), 0, this.this$0.getDp8());
            imageView4 = this.this$0.ugcPlayIconIv;
            ConstraintSetExtKt.endToEnd(updateConstraints, imageView4.getId(), 0, this.this$0.getDp8());
            flow5 = this.this$0.ugcTitleFlow;
            int id2 = flow5.getId();
            shapeableImageView9 = this.this$0.ugcMainImageIv;
            ConstraintSetExtKt.topToBottom(updateConstraints, id2, shapeableImageView9.getId(), this.this$0.getDp6());
            flow6 = this.this$0.ugcTitleFlow;
            ConstraintSetExtKt.startToStart(updateConstraints, flow6.getId(), 0, this.this$0.getDp12());
            flow7 = this.this$0.ugcTitleFlow;
            ConstraintSetExtKt.endToEnd(updateConstraints, flow7.getId(), 0, this.this$0.getDp12());
            textAtomV2View5 = this.this$0.ugcSubtitleTav;
            ConstraintSetExtKt.startToStart(updateConstraints, textAtomV2View5.getId(), 0, this.this$0.getDp12());
            textAtomV2View6 = this.this$0.ugcSubtitleTav;
            ConstraintSetExtKt.endToEnd(updateConstraints, textAtomV2View6.getId(), 0, this.this$0.getDp12());
            textAtomV2View7 = this.this$0.ugcSubtitleTav;
            int id3 = textAtomV2View7.getId();
            flow8 = this.this$0.ugcTitleFlow;
            ConstraintSetExtKt.topToBottom$default(updateConstraints, id3, flow8.getId(), 0, 4, null);
            textAtomV2View8 = this.this$0.ugcSubtitleTav;
            ConstraintSetExtKt.bottomToBottom(updateConstraints, textAtomV2View8.getId(), 0, this.this$0.getDp10());
            return;
        }
        shapeableImageView = this.this$0.ugcMainImageIv;
        ConstraintSetExtKt.topToTop(updateConstraints, shapeableImageView.getId(), 0, this.this$0.getDp4());
        shapeableImageView2 = this.this$0.ugcMainImageIv;
        ConstraintSetExtKt.startToStart(updateConstraints, shapeableImageView2.getId(), 0, this.this$0.getDp4());
        shapeableImageView3 = this.this$0.ugcMainImageIv;
        ConstraintSetExtKt.bottomToBottom(updateConstraints, shapeableImageView3.getId(), 0, this.this$0.getDp4());
        imageView = this.this$0.ugcPlayIconIv;
        ConstraintSetExtKt.topToTop(updateConstraints, imageView.getId(), 0, this.this$0.getDp8());
        imageView2 = this.this$0.ugcPlayIconIv;
        ConstraintSetExtKt.startToStart(updateConstraints, imageView2.getId(), 0, this.this$0.getDp56());
        flow = this.this$0.ugcTitleFlow;
        ConstraintSetExtKt.topToTop(updateConstraints, flow.getId(), 0, this.this$0.getDp8());
        flow2 = this.this$0.ugcTitleFlow;
        int id4 = flow2.getId();
        shapeableImageView4 = this.this$0.ugcMainImageIv;
        ConstraintSetExtKt.startToEnd(updateConstraints, id4, shapeableImageView4.getId(), this.this$0.getDp10());
        flow3 = this.this$0.ugcTitleFlow;
        ConstraintSetExtKt.endToEnd(updateConstraints, flow3.getId(), 0, this.this$0.getDp6());
        textAtomV2View = this.this$0.ugcSubtitleTav;
        int id5 = textAtomV2View.getId();
        shapeableImageView5 = this.this$0.ugcMainImageIv;
        ConstraintSetExtKt.startToEnd(updateConstraints, id5, shapeableImageView5.getId(), this.this$0.getDp10());
        textAtomV2View2 = this.this$0.ugcSubtitleTav;
        ConstraintSetExtKt.endToEnd(updateConstraints, textAtomV2View2.getId(), 0, this.this$0.getDp6());
        textAtomV2View3 = this.this$0.ugcSubtitleTav;
        int id6 = textAtomV2View3.getId();
        flow4 = this.this$0.ugcTitleFlow;
        ConstraintSetExtKt.topToBottom$default(updateConstraints, id6, flow4.getId(), 0, 4, null);
        textAtomV2View4 = this.this$0.ugcSubtitleTav;
        ConstraintSetExtKt.bottomToBottom(updateConstraints, textAtomV2View4.getId(), 0, this.this$0.getDp10());
    }
}
