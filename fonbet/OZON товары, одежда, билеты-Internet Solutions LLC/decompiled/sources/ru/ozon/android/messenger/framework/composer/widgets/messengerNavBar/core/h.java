package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;
import ru.ozon.composer.compose.widget.overlay.d;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.e<MessengerNavBarDTO, ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.serialize.a f87002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ru.ozon.android.messenger.framework.data.remote.serialize.a aVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2) {
        super(1);
        this.f87002b = aVar;
        this.f87003c = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.e<MessengerNavBarDTO, ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> eVar) {
        ru.ozon.composer.compose.widget.overlay.e<MessengerNavBarDTO, ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> overlayViewMapper = eVar;
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        overlayViewMapper.k(c.f86996b, new d(this.f87002b));
        overlayViewMapper.s(d.e.f94687b, new g(this.f87003c));
        return Unit.f71690a;
    }
}
