package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class DocsDeliveryFormViewHolder$inputsAdapter$1 extends C7735q implements Function2<String, String, Unit> {
    DocsDeliveryFormViewHolder$inputsAdapter$1(Object obj) {
        super(2, obj, DocsDeliveryFormViewModel.class, "onTextInputChanged", "onTextInputChanged(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, String str) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DocsDeliveryFormViewModel) this.receiver).onTextInputChanged(p02, str);
    }
}
