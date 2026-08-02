package ru.ozon.android.messenger.blocks.chatlistheader.search;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.ChatListHeaderDTO;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.tracker.sendEvent.ActionType;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9323c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatlistheader.f f84799b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9323c(ru.ozon.android.messenger.blocks.chatlistheader.f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f84799b = fVar;
        this.f84800c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> i11;
        ChatListHeaderDTO.SearchBarDTO.ClearIconDTO c11 = ((f.c.a) this.f84799b.d()).c();
        if (c11 == null || (i11 = c11.getTrackingInfo()) == null) {
            ActionType.CLICK click = ActionType.CLICK.INSTANCE;
            i11 = U.i(new Pair(click.getType(), new MessengerTrackingInfo(click.getType(), "{\"title\":\"clear_query\"}", 0L, null, null, 28, null)));
        }
        this.f84800c.c().m(i11);
        return Unit.f71690a;
    }
}
