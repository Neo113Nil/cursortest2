package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import j20.C7244b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function1<C7244b, MessengerNavBarDTO> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f86994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(JsonParser jsonParser) {
        super(1);
        this.f86994b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MessengerNavBarDTO invoke(C7244b c7244b) {
        C7244b state = c7244b;
        Intrinsics.checkNotNullParameter(state, "state");
        return (MessengerNavBarDTO) this.f86994b.fromJson(state.b(), MessengerNavBarDTO.class);
    }
}
