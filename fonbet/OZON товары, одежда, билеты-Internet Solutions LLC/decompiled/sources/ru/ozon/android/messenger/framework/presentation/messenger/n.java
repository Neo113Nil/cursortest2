package ru.ozon.android.messenger.framework.presentation.messenger;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.action.c;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function1<h, h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.c f91387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(ru.ozon.android.messenger.framework.navigation.action.c cVar) {
        super(1);
        this.f91387b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final h invoke(h hVar) {
        h it = hVar;
        Intrinsics.checkNotNullParameter(it, "it");
        ((c.a) this.f91387b).getClass();
        Intrinsics.checkNotNullParameter(null, "deeplink");
        throw null;
    }
}
