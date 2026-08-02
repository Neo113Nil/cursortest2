package ru.ozon.uni.android.ds.compose.component.input;

import K1.Q;
import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsInputBaseKt$DsInputBase$7$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ K $textFieldValue;
    final /* synthetic */ InterfaceC3978p0<K> $textFieldValueState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsInputBaseKt$DsInputBase$7$1(K k11, InterfaceC3978p0<K> interfaceC3978p0) {
        super(0);
        this.$textFieldValue = k11;
        this.$textFieldValueState$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        K DsInputBase_awFkL_c$lambda$7;
        K DsInputBase_awFkL_c$lambda$72;
        long e11 = this.$textFieldValue.e();
        DsInputBase_awFkL_c$lambda$7 = DsInputBaseKt.DsInputBase_awFkL_c$lambda$7(this.$textFieldValueState$delegate);
        if (Q.d(e11, DsInputBase_awFkL_c$lambda$7.e())) {
            Q d11 = this.$textFieldValue.d();
            DsInputBase_awFkL_c$lambda$72 = DsInputBaseKt.DsInputBase_awFkL_c$lambda$7(this.$textFieldValueState$delegate);
            if (Intrinsics.d(d11, DsInputBase_awFkL_c$lambda$72.d())) {
                return;
            }
        }
        this.$textFieldValueState$delegate.setValue(this.$textFieldValue);
    }
}
