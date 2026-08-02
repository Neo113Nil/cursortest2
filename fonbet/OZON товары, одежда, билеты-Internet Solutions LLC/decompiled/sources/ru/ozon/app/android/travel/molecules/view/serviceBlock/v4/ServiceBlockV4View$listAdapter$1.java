package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ServiceBlockV4View$listAdapter$1 extends AbstractC7737t implements Function1<ServiceBlockV4DTO.CopyAction, Unit> {
    final /* synthetic */ ServiceBlockV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceBlockV4View$listAdapter$1(ServiceBlockV4View serviceBlockV4View) {
        super(1);
        this.this$0 = serviceBlockV4View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServiceBlockV4DTO.CopyAction copyAction) {
        invoke2(copyAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ServiceBlockV4DTO.CopyAction action) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(action, "action");
        function1 = this.this$0.cachedCopyHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }
}
