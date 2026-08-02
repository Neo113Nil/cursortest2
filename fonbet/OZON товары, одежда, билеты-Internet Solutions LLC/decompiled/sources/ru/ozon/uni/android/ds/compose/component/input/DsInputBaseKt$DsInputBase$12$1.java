package ru.ozon.uni.android.ds.compose.component.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsInputBaseKt$DsInputBase$12$1 extends AbstractC7737t implements Function1<DsInputStatus, Unit> {
    public static final DsInputBaseKt$DsInputBase$12$1 INSTANCE = new DsInputBaseKt$DsInputBase$12$1();

    DsInputBaseKt$DsInputBase$12$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DsInputStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DsInputStatus dsInputStatus) {
        invoke2(dsInputStatus);
        return Unit.f71690a;
    }
}
