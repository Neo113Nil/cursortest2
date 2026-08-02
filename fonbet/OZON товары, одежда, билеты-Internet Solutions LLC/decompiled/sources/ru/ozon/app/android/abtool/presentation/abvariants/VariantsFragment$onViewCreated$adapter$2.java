package ru.ozon.app.android.abtool.presentation.abvariants;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class VariantsFragment$onViewCreated$adapter$2 extends C7735q implements Function1<String, Unit> {
    VariantsFragment$onViewCreated$adapter$2(Object obj) {
        super(1, obj, VariantsViewModel.class, "onVariantsInputChanged", "onVariantsInputChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((VariantsViewModel) this.receiver).onVariantsInputChanged(str);
    }
}
