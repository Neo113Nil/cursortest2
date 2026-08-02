package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import D0.e;
import S0.M;
import S0.N;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$TextInputWidgetHolder$3$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ Function1<String, Unit> $onTextChanged;
    final /* synthetic */ e $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputWidgetHolderKt$TextInputWidgetHolder$3$1(J j11, Function1<? super String, Unit> function1, e eVar) {
        super(1);
        this.$lifecycleOwner = j11;
        this.$onTextChanged = function1;
        this.$textState = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, e eVar, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_PAUSE) {
            function1.invoke(eVar.e().toString());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Function1<String, Unit> function1 = this.$onTextChanged;
        final e eVar = this.$textState;
        final G g10 = new G() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                TextInputWidgetHolderKt$TextInputWidgetHolder$3$1.invoke$lambda$0(Function1.this, eVar, j11, aVar);
            }
        };
        this.$lifecycleOwner.getLifecycle().a(g10);
        final J j11 = this.$lifecycleOwner;
        return new M() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputWidgetHolderKt$TextInputWidgetHolder$3$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                J.this.getLifecycle().e(g10);
            }
        };
    }
}
