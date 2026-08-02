package ru.ozon.android.messenger.framework.presentation.search.composable;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chat.search.i f91675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f91676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Function1 function1, ru.ozon.android.messenger.blocks.chat.search.i iVar) {
        super(0);
        this.f91675b = iVar;
        this.f91676c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> j11 = this.f91675b.j();
        if (j11 != null) {
            this.f91676c.invoke(j11);
        }
        return Unit.f71690a;
    }
}
