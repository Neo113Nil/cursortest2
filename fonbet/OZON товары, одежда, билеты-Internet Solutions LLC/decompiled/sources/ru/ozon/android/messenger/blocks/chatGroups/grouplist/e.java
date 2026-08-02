package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import B0.C2454a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<ru.ozon.android.messenger.blocks.chatGroups.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f84705b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.android.messenger.blocks.chatGroups.a aVar) {
        ru.ozon.android.messenger.blocks.chatGroups.a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Map b11 = C2454a.b(d.c.SELECTED_CHAT_GROUP_ID.a(), ru.ozon.android.messenger.framework.presentation.models.h.b(block));
        Map<String, MessengerTrackingInfo> e11 = block.e();
        ru.ozon.android.messenger.framework.core.d dVar = this.f84705b;
        if (e11 != null) {
            dVar.c().m(e11);
        }
        dVar.c().q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GROUP_SELECTED.a(), b11, 2, null), null, null, 6));
        return Unit.f71690a;
    }
}
