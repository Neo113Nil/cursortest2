package ru.ozon.app.android.barcodecache.wearable.pageConfigurator;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BaseUpdateBarcodeOnWearableDeviceConfigurator$onComposerInitialized$1 extends C7719a implements Function2<a, d<? super Unit>, Object> {
    BaseUpdateBarcodeOnWearableDeviceConfigurator$onComposerInitialized$1(Object obj) {
        super(2, obj, BaseUpdateBarcodeOnWearableDeviceConfigurator.class, "handleEvent", "handleEvent(Lru/ozon/composer/event/ComposerEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        Object onComposerInitialized$handleEvent;
        onComposerInitialized$handleEvent = BaseUpdateBarcodeOnWearableDeviceConfigurator.onComposerInitialized$handleEvent((BaseUpdateBarcodeOnWearableDeviceConfigurator) this.receiver, aVar, dVar);
        return onComposerInitialized$handleEvent;
    }
}
