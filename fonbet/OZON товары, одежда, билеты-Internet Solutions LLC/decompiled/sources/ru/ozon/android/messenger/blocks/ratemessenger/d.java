package ru.ozon.android.messenger.blocks.ratemessenger;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.messenger.databinding.MRateMessengerBlockBinding;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f86117b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MRateMessengerBlockBinding f86118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, MRateMessengerBlockBinding mRateMessengerBlockBinding) {
        super(0);
        this.f86117b = cVar;
        this.f86118c = mRateMessengerBlockBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        c cVar = this.f86117b;
        cVar.f86099a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.DELETE_ON_HIDE_CALLBACK)));
        cVar.f86099a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.REMOVE_POP_UP_BLOCKS)));
        this.f86118c.messageEditText.clearFocus();
        return Unit.f71690a;
    }
}
