package ru.ozon.android.messenger.blocks.chatlistheader.search;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9325e extends AbstractC7737t implements Function1<f.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9325e(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f84802b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(f.b bVar) {
        f.b item = bVar;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = item instanceof f.b.C1482b;
        ru.ozon.android.messenger.framework.core.d dVar = this.f84802b;
        if (z11) {
            ru.ozon.android.messenger.blocks.chatlistheader.e.a(dVar, ((f.b.C1482b) item).b());
        } else if (item instanceof f.b.a) {
            f.b.a aVar = (f.b.a) item;
            Map<String, MessengerTrackingInfo> c11 = aVar.c();
            if (c11 != null) {
                dVar.c().m(c11);
            }
            ru.ozon.android.messenger.framework.navigation.action.a b11 = aVar.b();
            if (b11 != null) {
                dVar.c().q(b11);
            }
        }
        return Unit.f71690a;
    }
}
