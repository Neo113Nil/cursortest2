package ru.ozon.android.messenger.framework.data.local;

import java.util.List;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9385b;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f87587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f87588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(c cVar, String str) {
        super(1);
        this.f87587b = cVar;
        this.f87588c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.a aVar;
        C9385b c9385b;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        final g gVar = new g(this.f87588c);
        updateBlocks.removeIf(new Predicate() { // from class: ru.ozon.android.messenger.framework.data.local.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) Function1.this.invoke(obj)).booleanValue();
            }
        });
        c cVar = this.f87587b;
        aVar = cVar.f87448c;
        if (aVar.c()) {
            c9385b = cVar.f87447b;
            c9385b.b(0, C7714v.P(updateBlocks), updateBlocks);
        }
        return Unit.f71690a;
    }
}
