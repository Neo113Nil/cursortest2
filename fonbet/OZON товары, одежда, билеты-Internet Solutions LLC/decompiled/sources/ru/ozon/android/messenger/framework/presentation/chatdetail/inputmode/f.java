package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.InputModeStoreImpl", f = "InputModeStoreImpl.kt", l = {67, 70}, m = "enterEditMode")
/* loaded from: classes10.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    k f89840d;

    /* renamed from: e, reason: collision with root package name */
    q f89841e;

    /* renamed from: f, reason: collision with root package name */
    String f89842f;

    /* renamed from: g, reason: collision with root package name */
    String f89843g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f89844h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ k f89845i;

    /* renamed from: j, reason: collision with root package name */
    int f89846j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(k kVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f89845i = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89844h = obj;
        this.f89846j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f89845i.i(null, null, null, this);
    }
}
