package ru.ozon.android.messenger.framework.presentation.search;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wallet.WalletConstants;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel", f = "ChatSearchViewModel.kt", l = {389, 400, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_UNKNOWN}, m = "restartSearch")
/* loaded from: classes10.dex */
final class B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9527g f91570d;

    /* renamed from: e, reason: collision with root package name */
    Object f91571e;

    /* renamed from: f, reason: collision with root package name */
    String f91572f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f91573g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9527g f91574h;

    /* renamed from: i, reason: collision with root package name */
    int f91575i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91574h = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91573g = obj;
        this.f91575i |= LinearLayoutManager.INVALID_OFFSET;
        return C9527g.D0(this.f91574h, null, this);
    }
}
