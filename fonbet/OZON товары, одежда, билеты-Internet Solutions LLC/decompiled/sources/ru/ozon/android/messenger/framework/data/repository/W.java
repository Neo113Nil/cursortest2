package ru.ozon.android.messenger.framework.data.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.DraftsRepositoryImpl", f = "DraftsRepository.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 129}, m = "removeEmptyDraftsIfExist")
/* loaded from: classes10.dex */
final class W extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    T f88433d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f88434e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88435f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ T f88436g;

    /* renamed from: h, reason: collision with root package name */
    int f88437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(T t2, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88436g = t2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88435f = obj;
        this.f88437h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88436g.j(this);
    }
}
