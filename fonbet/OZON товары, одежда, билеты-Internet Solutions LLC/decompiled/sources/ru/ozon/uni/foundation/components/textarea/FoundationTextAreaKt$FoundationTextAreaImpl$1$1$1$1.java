package ru.ozon.uni.foundation.components.textarea;

import androidx.compose.ui.platform.P1;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FoundationTextAreaKt$FoundationTextAreaImpl$1$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ P1 $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationTextAreaKt$FoundationTextAreaImpl$1$1$1$1(r rVar, P1 p12) {
        super(0);
        this.$focusRequester = rVar;
        this.$keyboardController = p12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusRequester.d();
        P1 p12 = this.$keyboardController;
        if (p12 != null) {
            p12.show();
        }
    }
}
