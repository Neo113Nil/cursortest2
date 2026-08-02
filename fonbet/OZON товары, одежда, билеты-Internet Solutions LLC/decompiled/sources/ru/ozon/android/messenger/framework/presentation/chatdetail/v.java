package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;

/* loaded from: classes10.dex */
public final class v implements k.b {

    /* renamed from: a, reason: collision with root package name */
    private final u f89947a;

    v(u uVar) {
        this.f89947a = uVar;
    }

    public static Jb.f b(u uVar) {
        return Jb.f.a(new v(uVar));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.k.b
    public final k a(MFragmentChatBinding mFragmentChatBinding, ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar, Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> function1, ru.ozon.android.messenger.framework.core.d dVar, Bundle bundle) {
        return this.f89947a.a(mFragmentChatBinding, pVar, function1, dVar, bundle);
    }
}
