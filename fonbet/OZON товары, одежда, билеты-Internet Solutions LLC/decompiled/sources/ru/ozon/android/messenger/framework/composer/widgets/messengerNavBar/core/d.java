package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<MessengerNavBarDTO, l20.d, ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.serialize.a f86997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.data.remote.serialize.a aVar) {
        super(2);
        this.f86997b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e invoke(MessengerNavBarDTO messengerNavBarDTO, l20.d dVar) {
        MessengerNavBarDTO dto = messengerNavBarDTO;
        l20.d widgetInfo = dVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "info");
        this.f86997b.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return new ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e(widgetInfo.d().hashCode(), dto.getLeftButton(), dto.getRightButton(), dto.getTitle(), dto.getSubtitle(), dto.getBackgroundColor(), dto.getCornerRadius());
    }
}
