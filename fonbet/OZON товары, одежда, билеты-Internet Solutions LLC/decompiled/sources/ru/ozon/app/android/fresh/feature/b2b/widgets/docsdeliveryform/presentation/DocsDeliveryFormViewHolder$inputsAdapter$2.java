package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class DocsDeliveryFormViewHolder$inputsAdapter$2 extends C7735q implements Function2<String, Boolean, Unit> {
    DocsDeliveryFormViewHolder$inputsAdapter$2(Object obj) {
        super(2, obj, DocsDeliveryFormViewModel.class, "onCheckedChanged", "onCheckedChanged(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(String p02, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DocsDeliveryFormViewModel) this.receiver).onCheckedChanged(p02, z11);
    }
}
