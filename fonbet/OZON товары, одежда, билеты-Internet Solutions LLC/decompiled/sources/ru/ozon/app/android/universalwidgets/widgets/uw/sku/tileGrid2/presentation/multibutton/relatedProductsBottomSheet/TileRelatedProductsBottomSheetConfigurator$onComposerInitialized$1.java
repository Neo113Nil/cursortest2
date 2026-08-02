package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TileRelatedProductsBottomSheetConfigurator$onComposerInitialized$1 extends C7719a implements Function2<a.o<?>, d<? super Unit>, Object> {
    TileRelatedProductsBottomSheetConfigurator$onComposerInitialized$1(Object obj) {
        super(2, obj, TileRelatedProductsBottomSheetConfigurator.class, "checkWidgetsExist", "checkWidgetsExist(Lru/ozon/composer/event/ComposerEvent$LoadCompleted;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.o<?> oVar, d<? super Unit> dVar) {
        Object onComposerInitialized$checkWidgetsExist;
        onComposerInitialized$checkWidgetsExist = TileRelatedProductsBottomSheetConfigurator.onComposerInitialized$checkWidgetsExist((TileRelatedProductsBottomSheetConfigurator) this.receiver, oVar, dVar);
        return onComposerInitialized$checkWidgetsExist;
    }
}
