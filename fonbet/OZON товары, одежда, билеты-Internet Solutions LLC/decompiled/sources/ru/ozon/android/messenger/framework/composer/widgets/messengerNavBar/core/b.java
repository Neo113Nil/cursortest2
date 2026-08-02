package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.config.b<MessengerNavBarDTO>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f86995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(JsonParser jsonParser) {
        super(1);
        this.f86995b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.config.b<MessengerNavBarDTO> bVar) {
        ru.ozon.composer.compose.widget.config.b<MessengerNavBarDTO> config = bVar;
        Intrinsics.checkNotNullParameter(config, "$this$config");
        ru.ozon.composer.compose.widget.config.b.j(config, null, new a(this.f86995b), 1, null);
        return Unit.f71690a;
    }
}
