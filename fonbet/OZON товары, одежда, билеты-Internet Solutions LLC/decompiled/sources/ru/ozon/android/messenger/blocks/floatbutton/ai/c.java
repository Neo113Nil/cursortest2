package ru.ozon.android.messenger.blocks.floatbutton.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<AtomAction, Map<String, ? extends TokenizedTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f85162b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AtomAction atomAction, Map<String, ? extends TokenizedTrackingInfo> map) {
        AtomAction action = atomAction;
        Map<String, ? extends TokenizedTrackingInfo> map2 = map;
        Intrinsics.checkNotNullParameter(action, "action");
        ru.ozon.android.messenger.framework.core.d dVar = this.f85162b;
        if (map2 != null) {
            dVar.c().m(ru.ozon.android.messenger.framework.analytics.h.a(map2));
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, null, 3));
        return Unit.f71690a;
    }
}
