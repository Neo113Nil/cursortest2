package ru.ozon.android.messenger.framework.presentation.search.composable;

import a1.C4912a;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.search.J;
import v0.G;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<J> f91685b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> f91686c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f91687d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f91688e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    p(List<? extends J> list, Function1<? super ru.ozon.android.messenger.blocks.chat.search.i, Unit> function1, Context context, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function12, ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f91685b = list;
        this.f91686c = function1;
        this.f91687d = context;
        this.f91688e = function12;
        this.f91689f = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<J> list = this.f91685b;
        LazyColumn.a(list.size(), null, new n(m.f91677b, list), new C4912a(true, -632812321, new o(list, this.f91686c, this.f91687d, this.f91688e, this.f91689f)));
        return Unit.f71690a;
    }
}
