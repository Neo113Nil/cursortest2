package ru.ozon.android.messenger.blocks.chatlistheader.search;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9321a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatlistheader.f f84794b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84795c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f84796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9321a(ru.ozon.android.messenger.blocks.chatlistheader.f fVar, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f84794b = fVar;
        this.f84795c = dVar;
        this.f84796d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, MessengerTrackingInfo> k11 = ((f.c.a) this.f84794b.d()).k();
        ru.ozon.android.messenger.framework.core.d dVar = this.f84795c;
        if (k11 != null) {
            dVar.c().m(k11);
        }
        dVar.c().q(this.f84796d);
        return Unit.f71690a;
    }
}
