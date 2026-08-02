package ru.ozon.android.messenger.blocks.floatbutton;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f85206b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f85206b = fVar;
        this.f85207c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        f fVar = this.f85206b;
        Map<String, MessengerTrackingInfo> f7 = fVar.f();
        ru.ozon.android.messenger.framework.core.d dVar = this.f85207c;
        if (f7 != null) {
            dVar.c().m(f7);
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(fVar.a()));
        return Unit.f71690a;
    }
}
