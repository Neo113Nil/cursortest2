package ru.ozon.fintech.wallet.manager.domain.mpay;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletManagerImpl", f = "MirPayWalletManagerImpl.kt", l = {149}, m = "getUpdateStores")
/* loaded from: classes3.dex */
final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    a f97123d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f97124e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f97125f;

    /* renamed from: g, reason: collision with root package name */
    int f97126g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, c cVar) {
        super(cVar);
        this.f97125f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97124e = obj;
        this.f97126g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97125f.e(this);
    }
}
