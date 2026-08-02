package ru.ozon.uni.android.ds.compose.component.textarea;

import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ1/K;", "newTextFieldValueState", "", "invoke", "(LQ1/K;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsTextAreaKt$DsTextArea$internalOnValueChange$1$1 extends AbstractC7737t implements Function1<K, Unit> {
    final /* synthetic */ boolean $hasCounter;
    final /* synthetic */ boolean $isCounterHasLimit;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isLimitWasReached$delegate;
    final /* synthetic */ InterfaceC3978p0<String> $lastTextValue$delegate;
    final /* synthetic */ int $maxLength;
    final /* synthetic */ Function0<Unit> $onCounterReachedLimit;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ InterfaceC3978p0<K> $textFieldValueState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTextAreaKt$DsTextArea$internalOnValueChange$1$1(boolean z11, boolean z12, int i11, Function1<? super String, Unit> function1, Function0<Unit> function0, InterfaceC3978p0<K> interfaceC3978p0, InterfaceC3978p0<String> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03) {
        super(1);
        this.$hasCounter = z11;
        this.$isCounterHasLimit = z12;
        this.$maxLength = i11;
        this.$onValueChange = function1;
        this.$onCounterReachedLimit = function0;
        this.$textFieldValueState$delegate = interfaceC3978p0;
        this.$lastTextValue$delegate = interfaceC3978p02;
        this.$isLimitWasReached$delegate = interfaceC3978p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(K k11) {
        invoke2(k11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(K newTextFieldValueState) {
        String DsTextArea_s9ZHXeI$lambda$10;
        boolean DsTextArea_s9ZHXeI$lambda$13;
        String DsTextArea_s9ZHXeI$lambda$102;
        Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
        this.$textFieldValueState$delegate.setValue(newTextFieldValueState);
        String f7 = newTextFieldValueState.f();
        DsTextArea_s9ZHXeI$lambda$10 = DsTextAreaKt.DsTextArea_s9ZHXeI$lambda$10(this.$lastTextValue$delegate);
        boolean d11 = Intrinsics.d(DsTextArea_s9ZHXeI$lambda$10, f7);
        if (this.$hasCounter && this.$isCounterHasLimit && f7.length() > this.$maxLength) {
            DsTextArea_s9ZHXeI$lambda$102 = DsTextAreaKt.DsTextArea_s9ZHXeI$lambda$10(this.$lastTextValue$delegate);
            if (f7.compareTo(DsTextArea_s9ZHXeI$lambda$102) < 0) {
                this.$onValueChange.invoke(f7);
                return;
            }
            return;
        }
        this.$lastTextValue$delegate.setValue(f7);
        if (!d11) {
            this.$onValueChange.invoke(f7);
        }
        if (this.$hasCounter && f7.length() > this.$maxLength) {
            DsTextArea_s9ZHXeI$lambda$13 = DsTextAreaKt.DsTextArea_s9ZHXeI$lambda$13(this.$isLimitWasReached$delegate);
            if (!DsTextArea_s9ZHXeI$lambda$13) {
                DsTextAreaKt.DsTextArea_s9ZHXeI$lambda$14(this.$isLimitWasReached$delegate, true);
                this.$onCounterReachedLimit.invoke();
                return;
            }
        }
        if (f7.length() <= this.$maxLength) {
            DsTextAreaKt.DsTextArea_s9ZHXeI$lambda$14(this.$isLimitWasReached$delegate, false);
        }
    }
}
