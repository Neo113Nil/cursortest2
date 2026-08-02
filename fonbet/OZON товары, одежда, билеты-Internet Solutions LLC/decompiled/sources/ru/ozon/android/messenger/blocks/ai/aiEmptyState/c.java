package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a f83938b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f83938b = aVar;
        this.f83939c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar = this.f83938b;
        BadgeDTO c11 = aVar.c();
        ru.ozon.android.messenger.framework.core.d dVar = this.f83939c;
        if (c11 != null && (common2 = c11.getCommon()) != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            dVar.c().m(h.a(trackingInfo));
        }
        BadgeDTO c12 = aVar.c();
        if (c12 != null && (common = c12.getCommon()) != null && (action = common.getAction()) != null) {
            dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(action));
        }
        return Unit.f71690a;
    }
}
