package ru.ozon.uni.ozi.components.inputs;

import K1.Q;
import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziInputKt$OziInputImpl$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ K $textFieldValue;
    final /* synthetic */ InterfaceC3978p0<K> $textFieldValueState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziInputKt$OziInputImpl$1$1(K k11, InterfaceC3978p0<K> interfaceC3978p0) {
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
        K OziInputImpl$lambda$12;
        K OziInputImpl$lambda$122;
        long e11 = this.$textFieldValue.e();
        OziInputImpl$lambda$12 = OziInputKt.OziInputImpl$lambda$12(this.$textFieldValueState$delegate);
        if (Q.d(e11, OziInputImpl$lambda$12.e())) {
            Q d11 = this.$textFieldValue.d();
            OziInputImpl$lambda$122 = OziInputKt.OziInputImpl$lambda$12(this.$textFieldValueState$delegate);
            if (Intrinsics.d(d11, OziInputImpl$lambda$122.d())) {
                return;
            }
        }
        this.$textFieldValueState$delegate.setValue(this.$textFieldValue);
    }
}
