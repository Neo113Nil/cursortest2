package ru.ozon.app.android.network.abtool;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class FeatureServiceImpl$removeOnChangeFeatureListener$1 extends C7735q implements Function0<Unit> {
    FeatureServiceImpl$removeOnChangeFeatureListener$1(Object obj) {
        super(0, obj, OnChangeFeatureListener.class, "onChangeFeature", "onChangeFeature()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnChangeFeatureListener) this.receiver).onChangeFeature();
    }
}
