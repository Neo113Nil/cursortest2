package ru.ozon.app.android.composer.configurators;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class RefreshByCurrencyConfigurator$onComposerInitialized$1 extends C7735q implements Function1<String, Boolean> {
    RefreshByCurrencyConfigurator$onComposerInitialized$1(Object obj) {
        super(1, obj, RefreshByCurrencyConfigurator.class, "isChanged", "isChanged(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String p02) {
        boolean isChanged;
        Intrinsics.checkNotNullParameter(p02, "p0");
        isChanged = ((RefreshByCurrencyConfigurator) this.receiver).isChanged(p02);
        return Boolean.valueOf(isChanged);
    }
}
