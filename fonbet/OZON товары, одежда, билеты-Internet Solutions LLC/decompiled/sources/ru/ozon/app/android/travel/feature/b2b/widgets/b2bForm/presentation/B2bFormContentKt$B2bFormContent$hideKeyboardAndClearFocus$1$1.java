package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import androidx.compose.ui.platform.P1;
import j1.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bFormContentKt$B2bFormContent$hideKeyboardAndClearFocus$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ i $focusManager;
    final /* synthetic */ P1 $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFormContentKt$B2bFormContent$hideKeyboardAndClearFocus$1$1(i iVar, P1 p12) {
        super(0);
        this.$focusManager = iVar;
        this.$keyboardController = p12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.g(false);
        P1 p12 = this.$keyboardController;
        if (p12 != null) {
            p12.hide();
        }
    }
}
