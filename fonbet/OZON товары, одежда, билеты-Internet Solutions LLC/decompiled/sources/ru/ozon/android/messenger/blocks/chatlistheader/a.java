package ru.ozon.android.messenger.blocks.chatlistheader;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f.b f84730b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f.b bVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f84730b = bVar;
        this.f84731c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        Map<String, MessengerTrackingInfo> c11;
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        f.b bVar = this.f84730b;
        f.b.a aVar = bVar instanceof f.b.a ? (f.b.a) bVar : null;
        if (aVar != null && (c11 = aVar.c()) != null) {
            this.f84731c.c().s(c11);
        }
        return Unit.f71690a;
    }
}
