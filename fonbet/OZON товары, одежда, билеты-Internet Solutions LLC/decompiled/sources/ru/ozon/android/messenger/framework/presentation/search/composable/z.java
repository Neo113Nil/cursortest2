package ru.ozon.android.messenger.framework.presentation.search.composable;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class z extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.view.recycler.B f91711b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ru.ozon.android.messenger.framework.presentation.common.view.recycler.B b11, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f91711b = b11;
        this.f91712c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        T boundedData = this.f91711b.getBoundedData();
        if (boundedData instanceof ru.ozon.android.messenger.blocks.chat.common.b) {
            Iterator<T> it = ((ru.ozon.android.messenger.blocks.chat.common.b) boundedData).c().iterator();
            while (it.hasNext()) {
                Map<String, MessengerTrackingInfo> e11 = ((ru.ozon.android.messenger.blocks.chat.common.menuItems.b) it.next()).e();
                if (e11 != null) {
                    this.f91712c.c().s(e11);
                }
            }
        }
        return Unit.f71690a;
    }
}
