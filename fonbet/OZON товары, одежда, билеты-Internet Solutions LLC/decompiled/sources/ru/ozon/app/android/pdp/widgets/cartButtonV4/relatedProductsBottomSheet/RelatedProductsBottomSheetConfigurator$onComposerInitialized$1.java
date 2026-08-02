package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class RelatedProductsBottomSheetConfigurator$onComposerInitialized$1 extends C7719a implements Function2<a.o<?>, d<? super Unit>, Object> {
    RelatedProductsBottomSheetConfigurator$onComposerInitialized$1(Object obj) {
        super(2, obj, RelatedProductsBottomSheetConfigurator.class, "checkWidgetsExist", "checkWidgetsExist(Lru/ozon/composer/event/ComposerEvent$LoadCompleted;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.o<?> oVar, d<? super Unit> dVar) {
        Object onComposerInitialized$checkWidgetsExist;
        onComposerInitialized$checkWidgetsExist = RelatedProductsBottomSheetConfigurator.onComposerInitialized$checkWidgetsExist((RelatedProductsBottomSheetConfigurator) this.receiver, oVar, dVar);
        return onComposerInitialized$checkWidgetsExist;
    }
}
