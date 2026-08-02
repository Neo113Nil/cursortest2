package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f87097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, ru.ozon.android.messenger.framework.analytics.i iVar) {
        super(0);
        this.f87097b = oVar;
        this.f87098c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        Map<String, MessengerTrackingInfo> d11 = this.f87097b.d();
        if (d11 != null && (iVar = this.f87098c) != null) {
            ru.ozon.android.messenger.framework.analytics.h.f(iVar, d11);
        }
        return Unit.f71690a;
    }
}
