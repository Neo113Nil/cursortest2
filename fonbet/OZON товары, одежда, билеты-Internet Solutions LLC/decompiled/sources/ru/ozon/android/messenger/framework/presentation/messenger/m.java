package ru.ozon.android.messenger.framework.presentation.messenger;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.presentation.messenger.h;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function1<h, h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.c f91386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(ru.ozon.android.messenger.framework.navigation.action.c cVar) {
        super(1);
        this.f91386b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final h invoke(h hVar) {
        h it = hVar;
        Intrinsics.checkNotNullParameter(it, "it");
        c.e eVar = (c.e) this.f91386b;
        return h.a(it, new h.b(eVar.b(), eVar.c(), eVar.a()), 6);
    }
}
