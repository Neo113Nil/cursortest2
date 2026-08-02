package ru.ozon.uni.ozi.components.cell;

import B1.U;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class OziCellKt$BasicCell$10$1 extends C7735q implements Function1<List<? extends List<? extends U>>, Unit> {
    public static final OziCellKt$BasicCell$10$1 INSTANCE = new OziCellKt$BasicCell$10$1();

    OziCellKt$BasicCell$10$1() {
        super(1, OziCellKt.class, "checkForScopeCompliance", "checkForScopeCompliance(Ljava/util/List;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends List<? extends U>> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends List<? extends U>> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        OziCellKt.checkForScopeCompliance(p02);
    }
}
