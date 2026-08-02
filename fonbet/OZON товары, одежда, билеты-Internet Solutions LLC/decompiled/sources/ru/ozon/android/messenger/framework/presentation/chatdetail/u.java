package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.framework.presentation.common.notification.j;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f89942a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.d> f89943b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.h f89944c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f89945d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.common.notification.h f89946e;

    public u(Pc.a aVar, Pc.a aVar2, ru.ozon.android.messenger.framework.presentation.common.view.recycler.h hVar, Jb.f fVar, ru.ozon.android.messenger.framework.presentation.common.notification.h hVar2, ru.ozon.android.messenger.framework.presentation.common.notification.k kVar) {
        this.f89942a = aVar;
        this.f89943b = aVar2;
        this.f89944c = hVar;
        this.f89945d = fVar;
        this.f89946e = hVar2;
    }

    public final k a(MFragmentChatBinding mFragmentChatBinding, ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar, Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> function1, ru.ozon.android.messenger.framework.core.d dVar, Bundle bundle) {
        return new k(mFragmentChatBinding, pVar, function1, dVar, bundle, this.f89942a.get(), this.f89943b.get(), (ru.ozon.android.messenger.framework.presentation.common.view.recycler.g) this.f89944c.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f89945d.get(), (ru.ozon.android.messenger.framework.presentation.common.notification.g) this.f89946e.get(), new j.a());
    }
}
