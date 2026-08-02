package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<h.a, Unit> f83993b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BadgeDTO f83994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(BadgeDTO badgeDTO, Function1 function1) {
        super(0);
        this.f83993b = function1;
        this.f83994c = badgeDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BadgeDTO badgeDTO = this.f83994c;
        this.f83993b.invoke(new h.a.c(ru.ozon.android.messenger.framework.analytics.h.a(badgeDTO != null ? badgeDTO.getTrackingInfo() : null)));
        return Unit.f71690a;
    }
}
