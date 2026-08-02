package ru.ozon.app.android.fresh.chat.widgets.textInput;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$2$1 extends C7735q implements Function1<String, Unit> {
    TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$2$1(Object obj) {
        super(1, obj, FreshAISharedViewModel.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FreshAISharedViewModel) this.receiver).onTextChanged(p02);
    }
}
