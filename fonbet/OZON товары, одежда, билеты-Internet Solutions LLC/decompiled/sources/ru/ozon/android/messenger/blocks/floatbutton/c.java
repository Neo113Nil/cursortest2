package ru.ozon.android.messenger.blocks.floatbutton;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f85208b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f85208b = fVar;
        this.f85209c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> f7 = this.f85208b.f();
        if (f7 != null) {
            this.f85209c.c().s(f7);
        }
        return Unit.f71690a;
    }
}
