package ru.ozon.android.messenger.blocks.messagetext.compose;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f85823b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(p pVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f85823b = pVar;
        this.f85824c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> l11;
        p pVar = this.f85823b;
        s sVar = pVar instanceof s ? (s) pVar : null;
        if (sVar != null && (l11 = sVar.l()) != null) {
            this.f85824c.c().s(l11);
        }
        return Unit.f71690a;
    }
}
