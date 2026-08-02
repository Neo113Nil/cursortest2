package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet;

import Sc.s;
import WZ.l;
import Wc.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate$loadRelatedProducts$1", f = "TileRelatedBottomSheetDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TileRelatedBottomSheetDelegate$loadRelatedProducts$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ TileRelatedProductsCurtainVO $relatedProductsCurtain;
    final /* synthetic */ Long $skuId;
    final /* synthetic */ l $tokenizedAnalytics;
    int label;
    final /* synthetic */ TileRelatedBottomSheetDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileRelatedBottomSheetDelegate$loadRelatedProducts$1(TileRelatedBottomSheetDelegate tileRelatedBottomSheetDelegate, Context context, ComposerReferences composerReferences, l lVar, Long l11, TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO, d<? super TileRelatedBottomSheetDelegate$loadRelatedProducts$1> dVar) {
        super(2, dVar);
        this.this$0 = tileRelatedBottomSheetDelegate;
        this.$context = context;
        this.$refs = composerReferences;
        this.$tokenizedAnalytics = lVar;
        this.$skuId = l11;
        this.$relatedProductsCurtain = tileRelatedProductsCurtainVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TileRelatedBottomSheetDelegate$loadRelatedProducts$1(this.this$0, this.$context, this.$refs, this.$tokenizedAnalytics, this.$skuId, this.$relatedProductsCurtain, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.this$0.bottomSheetView == null) {
            this.this$0.initBottomSheet(this.$context, this.$refs, this.$tokenizedAnalytics);
        }
        if (!this.this$0.loadedSkuIds.contains(this.$skuId)) {
            this.this$0.loadedSkuIds.add(this.$skuId);
            TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView = this.this$0.bottomSheetView;
            if (tileRelatedProductsBottomSheetView != null) {
                tileRelatedProductsBottomSheetView.loadComposer(this.$relatedProductsCurtain);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TileRelatedBottomSheetDelegate$loadRelatedProducts$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
