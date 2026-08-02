package ru.ozon.android.messenger.blocks.floatbutton.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f85160b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f85160b = gVar;
        this.f85161c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> d11 = this.f85160b.d();
        if (d11 != null) {
            this.f85161c.c().s(d11);
        }
        return Unit.f71690a;
    }
}
