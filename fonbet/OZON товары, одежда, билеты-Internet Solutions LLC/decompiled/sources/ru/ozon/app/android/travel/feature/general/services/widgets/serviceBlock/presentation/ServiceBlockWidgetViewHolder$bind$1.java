package ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "copyAction", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ServiceBlockWidgetViewHolder$bind$1 extends AbstractC7737t implements Function1<ServiceBlockV4DTO.CopyAction, Unit> {
    final /* synthetic */ ServiceBlockWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceBlockWidgetViewHolder$bind$1(ServiceBlockWidgetViewHolder serviceBlockWidgetViewHolder) {
        super(1);
        this.this$0 = serviceBlockWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServiceBlockV4DTO.CopyAction copyAction) {
        invoke2(copyAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ServiceBlockV4DTO.CopyAction copyAction) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        composerReferences = this.this$0.ref;
        RestrictionsUtilsKt.showRestrictionAndCopy(composerReferences, copyAction.getClipboardText(), copyAction.getRestrictionMessage());
    }
}
