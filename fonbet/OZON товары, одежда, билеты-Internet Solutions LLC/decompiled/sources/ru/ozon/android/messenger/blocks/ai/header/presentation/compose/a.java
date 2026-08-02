package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    a(Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar) {
        super(0);
        this.f84131b = function1;
        this.f84132c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84131b.invoke(this.f84132c.g());
        return Unit.f71690a;
    }
}
