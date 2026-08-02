package ru.ozon.app.android.returns.actionModal.di;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.PhotoUrlsUpdated;
import ru.ozon.app.android.returns.ui.data.components.Component;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "component", "Lru/ozon/app/android/returns/ui/data/components/Component;", "attachment", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$8$1 extends AbstractC7737t implements Function2<Component, List<? extends AttachmentVO.AttachedImageVO>, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$8$1(InterfaceC7851b interfaceC7851b) {
        super(2);
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Component component, List<? extends AttachmentVO.AttachedImageVO> list) {
        invoke2(component, (List<AttachmentVO.AttachedImageVO>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Component component, List<AttachmentVO.AttachedImageVO> list) {
        Intrinsics.checkNotNullParameter(component, "component");
        InterfaceC7851b interfaceC7851b = this.$controller;
        String name = component.getName();
        if (name == null) {
            name = "";
        }
        interfaceC7851b.update(new PhotoUrlsUpdated(name, list));
    }
}
