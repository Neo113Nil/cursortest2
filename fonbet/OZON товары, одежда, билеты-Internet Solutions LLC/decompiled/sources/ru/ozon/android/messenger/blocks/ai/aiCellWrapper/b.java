package ru.ozon.android.messenger.blocks.ai.aiCellWrapper;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f83925b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Map<String, MessengerTrackingInfo> map, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f83925b = map;
        this.f83926c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ?? r02 = this.f83925b;
        if (r02 != 0) {
            this.f83926c.c().s(r02);
        }
        return Unit.f71690a;
    }
}
