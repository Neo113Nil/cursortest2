package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84077b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a f84078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    a(Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a aVar) {
        super(0);
        this.f84077b = function1;
        this.f84078c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84077b.invoke(this.f84078c.d());
        return Unit.f71690a;
    }
}
