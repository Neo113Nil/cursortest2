package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class FormBlockVH$1$3 extends C7735q implements Function1<Integer, Boolean> {
    FormBlockVH$1$3(Object obj) {
        super(1, obj, FormBlockVH.class, "isDrawLeft", "isDrawLeft(I)Z", 0);
    }

    public final Boolean invoke(int i11) {
        boolean isDrawLeft;
        isDrawLeft = ((FormBlockVH) this.receiver).isDrawLeft(i11);
        return Boolean.valueOf(isDrawLeft);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
