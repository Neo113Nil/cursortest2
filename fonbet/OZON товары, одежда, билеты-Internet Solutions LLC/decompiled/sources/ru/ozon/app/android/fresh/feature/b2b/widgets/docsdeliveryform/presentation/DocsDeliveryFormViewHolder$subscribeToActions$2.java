package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class DocsDeliveryFormViewHolder$subscribeToActions$2 extends C7735q implements Function1<DocsDeliveryFormVO.Input.TextInput, Unit> {
    DocsDeliveryFormViewHolder$subscribeToActions$2(Object obj) {
        super(1, obj, B2BTextWithErrorInputLayout.class, "bind", "bind(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DocsDeliveryFormVO.Input.TextInput textInput) {
        invoke2(textInput);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DocsDeliveryFormVO.Input.TextInput p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((B2BTextWithErrorInputLayout) this.receiver).bind(p02);
    }
}
