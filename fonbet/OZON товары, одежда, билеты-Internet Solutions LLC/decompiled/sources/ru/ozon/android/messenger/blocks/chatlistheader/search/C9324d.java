package ru.ozon.android.messenger.blocks.chatlistheader.search;

import B0.C2454a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9324d extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9324d(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f84801b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String query = str;
        Intrinsics.checkNotNullParameter(query, "query");
        this.f84801b.c().q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.SEARCH_QUERY_CHANGED.a(), C2454a.b("searchQuery", query), 2, null), null, null, 6));
        return Unit.f71690a;
    }
}
