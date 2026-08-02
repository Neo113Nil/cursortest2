package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.q;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.InputModeStoreImpl", f = "InputModeStoreImpl.kt", l = {78, 80}, m = "enterReplyMode")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f89847d;

    /* renamed from: e, reason: collision with root package name */
    q f89848e;

    /* renamed from: f, reason: collision with root package name */
    String f89849f;

    /* renamed from: g, reason: collision with root package name */
    BlockDTO f89850g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f89851h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ k f89852i;

    /* renamed from: j, reason: collision with root package name */
    int f89853j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89852i = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89851h = obj;
        this.f89853j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89852i.j(null, null, null, this);
    }
}
