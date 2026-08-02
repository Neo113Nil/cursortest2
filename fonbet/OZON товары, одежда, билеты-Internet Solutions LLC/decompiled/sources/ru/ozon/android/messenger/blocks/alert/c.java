package ru.ozon.android.messenger.blocks.alert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c implements Function2<AlertDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends g>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends g> invoke(AlertDTO alertDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        Long l11;
        AlertDTO state = alertDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        if (state.getTtl() != null) {
            l11 = Long.valueOf(TimeUnit.SECONDS.toMillis(r0.intValue()));
        } else {
            l11 = null;
        }
        return C7714v.a0(new g(blockId, l11, state.getDisclaimer()));
    }
}
